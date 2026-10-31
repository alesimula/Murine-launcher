// Adapted from Lawnchair (https://github.com/LawnchairLauncher/lawnchair), Copyright (C) 2024 Lawnchair, Apache 2.0
package app.murinelauncher.widget.smartspace.glance

import android.annotation.SuppressLint
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
import android.os.SystemClock
import android.view.View
import android.view.ViewGroup
import android.widget.FrameLayout
import android.widget.ImageView
import android.widget.RemoteViews
import android.widget.TextView
import androidx.core.content.edit
import com.android.launcher3.Launcher
import com.android.launcher3.LauncherPrefs
import com.android.launcher3.R
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

    private val widgetInfo = AppWidgetManager.getInstance(context).getInstalledProvidersForPackage(GSA_PACKAGE, null)
        .firstOrNull { it.provider.className == WIDGET_CLASS_NAME }
    private val widget = widgetInfo?.let { HeadlessWidget(context, it) }
    override val isAvailable = widget != null

    override fun startSource() {
        // Google's layout can change under us: an unexpected one shows nothing rather than crashing
        widget?.listen { publish(runCatching { extractWidgetLayout(it) }.getOrDefault(emptyList())) }
    }

    override fun stopSource() {
        widget?.listen(null)
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
        fun collect(view: View) {
            when (view) {
                is TextView -> if (!view.text.isNullOrEmpty()) texts += view
                is ImageView -> if (view.drawable is BitmapDrawable) images += view
                is ViewGroup -> for (i in 0 until view.childCount) collect(view.getChildAt(i))
            }
        }
        collect(appWidgetHostView)
        if (texts.isEmpty()) return emptyList()
        val weather = images.firstOrNull()?.let { parseWeather(it.bitmap, texts.last()) }
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
        return listOfNotNull(card, weather ?: missingWeather())
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
    private class HeadlessWidget(private val context: Context, private val info: AppWidgetProviderInfo) {
        private val prefs = LauncherPrefs.getDevicePrefs(context)
        private val widgetManager = AppWidgetManager.getInstance(context)
        private val host = object : AppWidgetHost(context, HOST_ID) {
            override fun onCreateView(context: Context, appWidgetId: Int, appWidget: AppWidgetProviderInfo?) =
                HostView(context)
        }.apply { startListening() }
        private var widgetId = prefs.getInt(PREF_WIDGET_ID, -1)

        val isBound: Boolean
            get() = widgetManager.getAppWidgetInfo(widgetId)?.provider == info.provider

        private var view: HostView? = null

        /** Calls [onUpdate] with the widget's views now and on every update; null stops. Only once [isBound]. */
        fun listen(onUpdate: ((ViewGroup) -> Unit)?) {
            view?.updateCallback = null
            view = onUpdate?.let {
                (host.createView(context, widgetId, info) as HostView).apply {
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
            prefs.edit { putInt(PREF_WIDGET_ID, widgetId) }
        }

        /** Replaces the widget with a freshly bound one, which Google renders again from scratch. */
        fun rebind() {
            host.deleteAppWidgetId(widgetId)
            bind()
        }

        fun getBindIntent() = Intent(AppWidgetManager.ACTION_APPWIDGET_BIND)
            .putExtra(AppWidgetManager.EXTRA_APPWIDGET_ID, widgetId)
            .putExtra(AppWidgetManager.EXTRA_APPWIDGET_PROVIDER, info.provider)

        @SuppressLint("ViewConstructor")
        private class HostView(context: Context) : AppWidgetHostView(context) {
            var updateCallback: ((view: ViewGroup) -> Unit)? = null

            override fun updateAppWidget(remoteViews: RemoteViews?) {
                super.updateAppWidget(remoteViews)
                updateCallback?.invoke(this)
            }
        }
    }

    companion object {
        private const val REFRESH_THROTTLE_MILLIS = 5 * 60_000L
        private const val TEMPORARY_WIDGET_MILLIS = 30_000L // Google refreshed ~2s after a real add: plenty of margin, it's one pixel
        private const val HOST_ID = 1028
        private const val PREF_WIDGET_ID = "smartspaceWidgetId"
        private const val GSA_PACKAGE = "com.google.android.googlequicksearchbox"
        private const val WIDGET_CLASS_NAME = "com.google.android.apps.gsa.staticplugins.smartspace.widget.SmartspaceWidgetProvider"
        private val WEATHER_COMPONENT = ComponentName(GSA_PACKAGE, "com.google.android.apps.search.weather.WeatherExportedActivity")
    }
}
