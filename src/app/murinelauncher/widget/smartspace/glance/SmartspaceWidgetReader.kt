// Adapted from Lawnchair (https://github.com/LawnchairLauncher/lawnchair), Copyright (C) 2024 Lawnchair, Apache 2.0
package app.murinelauncher.widget.smartspace.glance

import android.annotation.SuppressLint
import android.app.Activity
import android.appwidget.AppWidgetHost
import android.appwidget.AppWidgetHostView
import android.appwidget.AppWidgetManager
import android.appwidget.AppWidgetProviderInfo
import android.content.ComponentName
import android.content.Context
import android.content.Intent
import android.graphics.Bitmap
import android.graphics.drawable.BitmapDrawable
import android.graphics.drawable.Icon
import android.os.Bundle
import android.os.SystemClock
import android.util.SizeF
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.FrameLayout
import android.widget.ImageView
import android.widget.RemoteViews
import android.widget.TextClock
import android.widget.TextView
import androidx.core.content.edit
import androidx.core.view.descendants
import com.android.launcher3.Launcher
import com.android.launcher3.LauncherPrefChangeListener
import com.android.launcher3.LauncherPrefs
import com.android.launcher3.R
import com.android.launcher3.Utilities
import com.android.launcher3.util.Executors.MAIN_EXECUTOR
import com.android.launcher3.views.ActivityContext
import com.android.launcher3.widget.LauncherAppWidgetProviderInfo
import com.android.launcher3.widget.util.WidgetSizes

/**
 * Reads weather and the current card from an invisible copy of the Google app's Smartspace widget.
 * Relies on that widget's layout: if Google changes it, the cards just stop showing up.
 */
class SmartspaceWidgetReader(context: Context) :
    SmartspaceDataSource(context, LauncherPrefs.GLANCE_GOOGLE) {

    private val widgetInfo = findWidgetInfo(context)
    private val widget = widgetInfo?.let { HeadlessWidget(context, it) }
    override val isAvailable = widget != null

    private val alertsListener = LauncherPrefChangeListener { _ -> restart() }

    override fun startSource() {
        // Google's layout can change under us: an unexpected one shows nothing rather than crashing
        widget?.listen { publish(runCatching { extractWidgetLayout(it) }.getOrDefault(emptyList())) }
        LauncherPrefs.get(context).addListener(alertsListener, LauncherPrefs.GLANCE_ALERTS)
    }

    override fun stopSource() {
        widget?.listen(null)
        LauncherPrefs.get(context).removeListener(alertsListener, LauncherPrefs.GLANCE_ALERTS)
    }

    override fun requiresSetup() = widget?.isBound == false

    // Google's widget sometimes loses the weather in every launcher until one is added to a home screen (the
    // headless one isn't enough): shown in the weather's place, this adds a short-lived one, then reloads
    private fun missingWeather() = GlanceCard(
        title = context.getString(R.string.gadget_setup_text),
        subtitle = "\u00B7\u00B7\u00B7", // In the temperature's place, keeping the icon "centered"
        icon = Icon.createWithResource(context, R.drawable.ic_glance_weather_missing),
        score = GlanceCard.SCORE_WEATHER,
        isWeather = true,
        onClick = { view ->
            lastRefreshMillis = 0 // Skips the throttle on the next onVisible
            addTemporaryWidget(ActivityContext.lookupContext(view.context))
        },
    )

    /**
     * Adds Google's widget like dropping it on the home screen would (bound with its size, in the launcher's own
     * host, set up through its settings), but drawn invisibly and taking no grid space; removed once back home
     * and Google had time to refresh.
     */
    private fun addTemporaryWidget(launcher: Launcher) {
        val info = widgetInfo ?: return
        val holder = launcher.appWidgetHolder
        val id = holder.allocateAppWidgetId()
        val options = WidgetSizes.getWidgetSizeOptions(launcher, info.provider, 4, 1)
        if (id == AppWidgetManager.INVALID_APPWIDGET_ID) return
        if (!AppWidgetManager.getInstance(launcher).bindAppWidgetIdIfAllowed(id, info.profile, info.provider, options)) {
            holder.deleteAppWidgetId(id)
            return
        }
        val view = holder.createView(id, LauncherAppWidgetProviderInfo.fromProviderInfo(launcher, info))
        view.alpha = 0.01f // Drawn, unlike at 0, but not visible
        launcher.dragLayer.addView(view, FrameLayout.LayoutParams(1, 1))
        holder.startConfigActivity(launcher, id, 0)
        // if the launcher dies before this, the id stays allocated in its host until cleared
        launcher.addEventCallback(Launcher.EVENT_RESUMED) {
            view.postDelayed({
                launcher.dragLayer.removeView(view)
                holder.deleteAppWidgetId(id)
            }, TEMPORARY_WIDGET_MILLIS)
        }
    }

    // Throttled, in case Google really has no weather to show (no location, no connection...)
    private var hasWeather = true
    private var lastRefreshMillis = 0L

    override fun onVisible() {
        val widget = widget ?: return
        val now = SystemClock.elapsedRealtime()
        if (!hasWeather && widget.isBound && LauncherPrefs.get(context).get(LauncherPrefs.GLANCE_GOOGLE)
            && (lastRefreshMillis == 0L || now - lastRefreshMillis > REFRESH_THROTTLE_MILLIS)) {
            lastRefreshMillis = now
            widget.rebind()
            restart()
        }
    }

    override fun startSetup(launcher: Launcher) {
        val widget = widget ?: return
        widget.bind()
        if (widget.isBound) {
            restart()
            return
        }
        // Ask the user to allow binding the widget, then check again once back on the home screen
        launcher.startActivityForResult(widget.getBindIntent(), 0)
        launcher.addEventCallback(Launcher.EVENT_RESUMED) { MAIN_EXECUTOR.execute(this::restart) }
    }

    private fun extractWidgetLayout(appWidgetHostView: ViewGroup): List<GlanceCard> {
        val texts = mutableListOf<TextView>()
        val images = mutableListOf<ImageView>()
        // Loaded even without readable text: a never shown copy gets no date (a TextClock) nor
        // list items, the layout Google may switch to without weather
        var loaded = false
        val lists = mutableListOf<AdapterView<*>>()
        fun collect(view: View) {
            when (view) {
                is TextView -> {
                    if (view is TextClock) loaded = true
                    if (!view.text.isNullOrEmpty()) texts += view
                }
                // Its rows (events, alerts...) are read on their own: the weather is still read as before
                is AdapterView<*> -> { loaded = true; lists += view }
                is ImageView -> if (view.drawable is BitmapDrawable) images += view
                is ViewGroup -> for (i in 0 until view.childCount) collect(view.getChildAt(i))
            }
        }
        collect(appWidgetHostView)
        if (texts.isEmpty() && !loaded) return emptyList()
        val weather = texts.lastOrNull()?.let { temperature -> images.firstOrNull()?.let { parseWeather(it.bitmap, temperature) } }
        hasWeather = weather != null
        // A second image means a card (event, reminder...) with its icon first, then its texts
        val card = if (images.size > 1 && texts.size > 2) {
            val title = texts[0]
            val subtitle = if (texts.size > 3) texts[2] else texts[1]
            GlanceCard(
                title = title.text.toString() + if (texts.size > 3) texts[1].text.toString() else "",
                subtitle = subtitle.text,
                icon = images.first().bitmap?.let(Icon::createWithBitmap),
                score = GlanceCard.SCORE_CALENDAR,
                pendingIntent = (title.parent.parent.parent as? View)?.pendingIntent,
            )
        } else {
            null
        }
        // Events have their icon labelled as "Calendar events" by Google (in English, regardless of user language);
        // TODO I still haven't found a way to distinguish between warnings (e.g. weather alerts) and other low-priority alerts
        val alerts = LauncherPrefs.GLANCE_ALERTS.get(context)
        val rows = lists.flatMap { list -> (0 until list.childCount).map(list::getChildAt) }
            .filter { row -> alerts || (row as? ViewGroup)?.descendants?.any { it.contentDescription == EVENT_ICON_LABEL } == true }
            .mapNotNull(::rowCard)
        return listOfNotNull(card, weather ?: missingWeather()) + rows
    }

    /**
     * A row of Google's list layout (an alert, an event, etc.): its first text is the title, the next the
     * subtitle, its first image the icon. Rows have no actions of their own: tapping one clicks the row's
     * first clickable view, as a tap on Google's own widget would.
     */
    private fun rowCard(row: View): GlanceCard? {
        val views = (row as? ViewGroup)?.descendants ?: return null
        val texts = views.filterIsInstance<TextView>().filter { !it.text.isNullOrEmpty() }.toList()
        val title = texts.firstOrNull() ?: return null
        val clickable = views.firstOrNull { it.isClickable }
        return GlanceCard(
            title = title.text,
            subtitle = texts.getOrNull(1)?.text,
            icon = views.filterIsInstance<ImageView>().firstNotNullOfOrNull { it.bitmap }?.let(Icon::createWithBitmap),
            score = GlanceCard.SCORE_CALENDAR,
            onClick = clickable?.let { View.OnClickListener { _ -> it.performClick() } },
        )
    }

    /** Lawnchair parses and converts the temperature; here Google's own text is shown as-is. */
    private fun parseWeather(icon: Bitmap?, temperatureText: TextView): GlanceCard? {
        val temperature = temperatureText.text.toString()
        if (icon == null || temperature.none { it.isDigit() }) return null
        // The click is on the weather's frame, a few levels up: the closest one with an action
        val pendingIntent = generateSequence(temperatureText as View) { it.parent as? View }.firstNotNullOfOrNull { it.pendingIntent }
        return GlanceCard(
            title = "",
            subtitle = temperature,
            icon = Icon.createWithBitmap(icon),
            score = GlanceCard.SCORE_WEATHER,
            isWeather = true,
            // Google's own action opens its weather screen, the exported activity only a search: kept as a fallback
            pendingIntent = pendingIntent,
            intent = if (pendingIntent == null) Intent().setComponent(WEATHER_COMPONENT) else null,
        )
    }

    private val ImageView.bitmap get() = (drawable as? BitmapDrawable)?.bitmap

    /**
     * Hosts the widget without showing it, so its content can be read
     * (Lawnchair's HeadlessWidgetsManager, reduced to the one widget needed here).
     */
    private class HeadlessWidget(
        private val context: Context,
        private val info: AppWidgetProviderInfo,
        private val prefKey: String = PREF_WIDGET_ID,
    ) {
        private val prefs = LauncherPrefs.getDevicePrefs(context)
        private val widgetManager = AppWidgetManager.getInstance(context)
        private val host = sharedHost(context)
        private var widgetId = prefs.getInt(prefKey, -1)

        val isBound: Boolean
            get() = widgetManager.getAppWidgetInfo(widgetId)?.provider == info.provider

        private var view: HostView? = null

        /** Calls [onUpdate] with the widget's views now and on every update; null stops. Only once [isBound]. */
        fun listen(onUpdate: ((ViewGroup) -> Unit)?) {
            view?.updateCallback = null
            view = onUpdate?.let {
                (host.createView(context, widgetId, info) as HostView).apply {
                    layOut()
                    it(this)
                    updateCallback = it
                }
            }
        }

        init {
            bind()
        }

        fun bind() {
            if (!isBound) {
                if (widgetId > -1) host.deleteAppWidgetId(widgetId)
                widgetId = host.allocateAppWidgetId()
                widgetManager.bindAppWidgetIdIfAllowed(widgetId, info.profile, info.provider, null)
            }
            prefs.edit { putInt(prefKey, widgetId) }
        }

        /** Replaces the widget with a freshly bound one, which Google renders again from scratch. */
        fun rebind() {
            host.deleteAppWidgetId(widgetId)
            bind()
        }

        /** A view of the widget to show as is, in [viewContext] (for its clicks to start activities from). */
        fun createView(viewContext: Context): View = host.createView(viewContext, widgetId, info)

        fun configure(activity: Activity) {
            runCatching { host.startAppWidgetConfigureActivityForResult(activity, widgetId, 0, 0, null) }
        }

        fun getBindIntent() = Intent(AppWidgetManager.ACTION_APPWIDGET_BIND)
            .putExtra(AppWidgetManager.EXTRA_APPWIDGET_ID, widgetId)
            .putExtra(AppWidgetManager.EXTRA_APPWIDGET_PROVIDER, info.provider)

        @SuppressLint("ViewConstructor")
        class HostView(context: Context) : AppWidgetHostView(context) {
            var updateCallback: ((view: ViewGroup) -> Unit)? = null

            // Shown as Google lays it out, like the launcher's own widgets: no framework padding, free to overflow
            init {
                clipChildren = false
                clipToPadding = false
            }

            override fun setAppWidget(appWidgetId: Int, info: AppWidgetProviderInfo?) {
                super.setAppWidget(appWidgetId, info)
                setPadding(0, 0, 0, 0)
            }

            override fun updateAppWidget(remoteViews: RemoteViews?) {
                super.updateAppWidget(remoteViews)
                val callback = updateCallback ?: return // Shown, not read
                layOut()
                callback(this)
            }

            // Shown: Google lays its widget out for the size it's told, as for one on the home screen
            override fun onSizeChanged(w: Int, h: Int, oldw: Int, oldh: Int) {
                super.onSizeChanged(w, h, oldw, oldh)
                if (!isAttachedToWindow) return // Headless
                val width = w / resources.displayMetrics.density
                val height = h / resources.displayMetrics.density
                post {
                    if (Utilities.ATLEAST_S) updateAppWidgetSize(Bundle(), listOf(SizeF(width, height)))
                    else @Suppress("DEPRECATION") updateAppWidgetSize(Bundle(), width.toInt(), height.toInt(), width.toInt(), height.toInt())
                }
            }

            /** Lays itself out like a home screen widget, though never shown: lists only make their rows then. */
            fun layOut() {
                val metrics = resources.displayMetrics
                val width = MeasureSpec.makeMeasureSpec(metrics.widthPixels, MeasureSpec.EXACTLY)
                val height = MeasureSpec.makeMeasureSpec((LAYOUT_HEIGHT_DP * metrics.density).toInt(), MeasureSpec.EXACTLY)
                measure(width, height)
                layout(0, 0, measuredWidth, measuredHeight)
            }
        }
    }

    companion object {
        private var sharedHost: AppWidgetHost? = null
        private var shownWidget: HeadlessWidget? = null

        // One for the read widget and the shown one: a second host with the same id would take over the first's updates
        private fun sharedHost(context: Context) = sharedHost ?: object : AppWidgetHost(context.applicationContext, HOST_ID) {
            override fun onCreateView(context: Context, appWidgetId: Int, appWidget: AppWidgetProviderInfo?) =
                HeadlessWidget.HostView(context)
        }.apply { startListening() }.also { sharedHost = it }

        private fun findWidgetInfo(context: Context) = AppWidgetManager.getInstance(context)
            .getInstalledProvidersForPackage(GSA_PACKAGE, null).firstOrNull { it.provider.className == WIDGET_CLASS_NAME }

        /**
         * Google's widget itself, shown as is (in [context], the widget's own); null when missing or not allowed to be bound
         * yet, which the read one asks for. ponytail: one shown copy, a second view of it takes over the first's updates
         */
        @JvmStatic
        fun createGoogleView(context: Context): View? = boundShownWidget(context)?.createView(context)

        /** Google's own settings for its widget (its setup screen, as when adding one); nothing until it can be bound. */
        fun openGoogleSettings(activity: Activity) {
            boundShownWidget(activity)?.configure(activity)
        }

        private fun boundShownWidget(context: Context): HeadlessWidget? {
            val info = findWidgetInfo(context) ?: return null
            val widget = shownWidget ?: HeadlessWidget(context.applicationContext, info, PREF_SHOWN_WIDGET_ID).also { shownWidget = it }
            widget.bind()
            return widget.takeIf { it.isBound }
        }

        private const val REFRESH_THROTTLE_MILLIS = 5 * 60_000L
        private const val TEMPORARY_WIDGET_MILLIS = 30_000L // Google refreshed ~2s after a real add: plenty of margin, it's one pixel
        private const val HOST_ID = 1028
        private const val LAYOUT_HEIGHT_DP = 120 // Room for a row of Google's list
        private const val EVENT_ICON_LABEL = "Calendar events"
        private const val PREF_WIDGET_ID = "smartspaceWidgetId"
        private const val PREF_SHOWN_WIDGET_ID = "smartspaceShownWidgetId"
        private const val GSA_PACKAGE = "com.google.android.googlequicksearchbox"
        private const val WIDGET_CLASS_NAME = "com.google.android.apps.gsa.staticplugins.smartspace.widget.SmartspaceWidgetProvider"
        private val WEATHER_COMPONENT = ComponentName(GSA_PACKAGE, "com.google.android.apps.search.weather.WeatherExportedActivity")
    }
}
