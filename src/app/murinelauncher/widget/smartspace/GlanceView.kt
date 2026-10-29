package app.murinelauncher.widget.smartspace

import android.app.AlarmManager
import android.content.ContentUris
import android.content.Context
import android.content.Intent
import android.content.res.ColorStateList
import android.content.res.Configuration
import android.graphics.drawable.GradientDrawable
import android.graphics.drawable.Icon
import android.provider.CalendarContract
import android.text.format.DateFormat
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextClock
import android.widget.TextView
import androidx.core.content.getSystemService
import androidx.core.graphics.ColorUtils
import androidx.core.view.children
import androidx.core.view.isVisible
import app.murinelauncher.settings.SettingsGlanceFragment
import app.murinelauncher.widget.smartspace.glance.GlanceCard
import app.murinelauncher.widget.smartspace.glance.SmartspaceProvider
import com.android.launcher3.LauncherPrefChangeListener
import com.android.launcher3.LauncherPrefs
import com.android.launcher3.R
import com.android.launcher3.Utilities

/**
 * At a Glance widget: a card with the date and the weather on top, and the active cards
 * (battery, media, events...) as chips below, highest priority first.
 */
class GlanceView(context: Context, attrs: AttributeSet?) : LinearLayout(context, attrs) {

    private val provider = SmartspaceProvider.get(context)
    private var textColor = 0
    private var shadowStrength = 0f
    private val card = GradientDrawable().apply { cornerRadius = resources.getDimension(R.dimen.glance_corner_radius) }

    private lateinit var date: TextClock
    private lateinit var weather: View
    private lateinit var weatherIcon: ImageView
    private lateinit var temperature: TextView
    private lateinit var chips: ViewGroup

    private var cards = emptyList<GlanceCard>()
    private val cardsListener: (List<GlanceCard>) -> Unit = { cards = it; update() }
    private val prefListener = LauncherPrefChangeListener { _ -> applyTheme(); update() }

    override fun onFinishInflate() {
        super.onFinishInflate()
        background = card
        date = findViewById(R.id.glance_date)
        weather = findViewById(R.id.glance_weather)
        weatherIcon = findViewById(R.id.glance_weather_icon)
        temperature = findViewById(R.id.glance_temperature)
        chips = findViewById(R.id.glance_chips)

        applyLocaleDateFormat()
        date.setOnClickListener { runCatching { context.startActivity(calendarIntent()) } }
        // The picker's live preview is drawn without being attached: set the card up already
        applyTheme()
        update()
    }

    override fun onAttachedToWindow() {
        super.onAttachedToWindow()
        LauncherPrefs.get(context).addListener(prefListener, LauncherPrefs.GLANCE_ALPHA, LauncherPrefs.GLANCE_THEME)
        applyTheme()
        provider.addListener(cardsListener)
    }

    override fun onDetachedFromWindow() {
        super.onDetachedFromWindow()
        provider.removeListener(cardsListener)
        LauncherPrefs.get(context).removeListener(prefListener, LauncherPrefs.GLANCE_ALPHA, LauncherPrefs.GLANCE_THEME)
    }

    override fun onConfigurationChanged(newConfig: Configuration) {
        super.onConfigurationChanged(newConfig)
        applyLocaleDateFormat()
    }

    override fun onWindowVisibilityChanged(visibility: Int) {
        super.onWindowVisibilityChanged(visibility)
        if (visibility != VISIBLE) return
        provider.onVisible()
        update() // The next alarm may have changed while away
    }

    /** The locale's best weekday + day + month pattern; the TextClock keeps it up to date by itself. */
    private fun applyLocaleDateFormat() {
        val pattern = DateFormat.getBestDateTimePattern(resources.configuration.locales.get(0), DATE_SKELETON)
        date.format12Hour = pattern
        date.format24Hour = pattern
    }

    /** Colors from the widget's own theme setting; by default the launcher's UI theme, which its context follows. */
    private fun applyTheme() {
        val light = when (val theme = LauncherPrefs.GLANCE_THEME.get(context)) {
            SettingsGlanceFragment.THEME_DEFAULT -> !Utilities.isDarkTheme(context)
            else -> theme == SettingsGlanceFragment.THEME_LIGHT
        }
        textColor = color(if (light) android.R.color.system_neutral1_900 else android.R.color.system_neutral1_50,
            if (light) 0xFF202124.toInt() else 0xFFF1F3F4.toInt())
        val surfaceColor = color(if (light) android.R.color.system_neutral1_50 else android.R.color.system_neutral1_900,
            if (light) 0xFFF1F3F4.toInt() else 0xFF202124.toInt())
        val alpha = LauncherPrefs.GLANCE_ALPHA.get(context)
        card.setColor(ColorUtils.setAlphaComponent(surfaceColor, alpha * 255 / 100))
        // Shadow under light text, fading out as the card gets opaque: full at 0%, none from 50%
        shadowStrength = if (light) 0f else (50 - alpha).coerceAtLeast(0) / 50f
        date.setTextColor(textColor)
        date.applyShadow(large = true)
        temperature.applyShadow()
        findViewById<View>(R.id.glance_divider).setBackgroundColor(ColorUtils.setAlphaComponent(textColor, 0x40))
        temperature.setTextColor(color(if (light) android.R.color.system_accent1_700 else android.R.color.system_accent1_100,
            if (light) 0xFF8C3A3F.toInt() else 0xFFFFDAD9.toInt()))
    }

    private fun update() {
        val weatherCard = cards.firstOrNull { it.isWeather }
        weather.isVisible = weatherCard != null
        if (weatherCard != null) {
            weatherIcon.setImageIcon(weatherCard.icon)
            temperature.text = weatherCard.subtitle
            weather.contentDescription = weatherCard.subtitle
            weather.setOnClickListener(weatherCard::launch)
        }

        // Highest priority first, the next alarm last; with nothing to show, a placeholder keeps the size
        val shown = (cards.filter { !it.isWeather } + listOfNotNull(nextAlarmCard())).sortedByDescending { it.score }
            .ifEmpty { listOf(GlanceCard(title = PLACEHOLDER)) }
        chips.removeAllViews()
        shown.forEach { card ->
            chips.addView(chipView(card, listOf(card.title, card.subtitle).filter { !it.isNullOrEmpty() }.joinToString(" · ")))
            // Right after the full chip, see GlanceChipRow
            card.compactTitle?.let { chips.addView(chipView(card, it).apply { tag = GlanceChipRow.COMPACT }) }
        }
    }

    private fun chipView(card: GlanceCard, text: CharSequence): TextView {
        val chip = LayoutInflater.from(context).inflate(R.layout.murine_glance_chip, chips, false) as TextView
        chip.text = text
        chip.setTextColor(textColor)
        chip.applyShadow()
        chip.backgroundTintList = ColorStateList.valueOf(ColorUtils.setAlphaComponent(textColor, 0x1A))
        val iconSize = resources.getDimensionPixelSize(R.dimen.glance_chip_icon_size)
        val icon = card.icon?.loadDrawable(context)?.mutate()?.apply {
            setBounds(0, 0, iconSize, iconSize)
            setTint(textColor)
        }
        // Not the relative variant: it's only resolved once attached, and the picker's preview never is
        if (resources.configuration.layoutDirection == LAYOUT_DIRECTION_RTL) chip.setCompoundDrawables(null, null, icon, null)
        else chip.setCompoundDrawables(icon, null, null, null)
        if (icon == null) chip.setPaddingRelative(chip.paddingEnd, 0, chip.paddingEnd, 0)
        chip.setOnClickListener(card::launch)
        return chip
    }

    private fun nextAlarmCard(): GlanceCard? {
        val alarm = context.getSystemService<AlarmManager>()?.nextAlarmClock ?: return null
        val skeleton = if (DateFormat.is24HourFormat(context)) "EEEHm" else "EEEhma"
        val pattern = DateFormat.getBestDateTimePattern(resources.configuration.locales.get(0), skeleton)
        return GlanceCard(
            title = DateFormat.format(pattern, alarm.triggerTime),
            icon = Icon.createWithResource(context, R.drawable.ic_glance_alarm),
            score = GlanceCard.SCORE_ALARM,
            pendingIntent = alarm.showIntent,
        )
    }

    /** Opens the calendar at today. */
    private fun calendarIntent() = Intent(Intent.ACTION_VIEW)
        .setData(ContentUris.appendId(CalendarContract.CONTENT_URI.buildUpon().appendPath("time"),
            System.currentTimeMillis()).build())
        .addFlags(Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_RESET_TASK_IF_NEEDED)

    /** At full strength: the Clock's date shadow for the date ([large]), a lighter one for the smaller text. */
    private fun TextView.applyShadow(large: Boolean = false) {
        val alpha = ((if (large) 0xA0 else 0x80) * shadowStrength).toInt()
        setShadowLayer(if (alpha == 0) 0f else if (large) 4f else 3f, 0f, if (large) 2f else 1f, alpha shl 24)
    }

    /** A Material You system color on Android 12+, [fallback] before. */
    private fun color(id: Int, fallback: Int) = if (Utilities.ATLEAST_S) context.getColor(id) else fallback

    private companion object {
        const val DATE_SKELETON = "EEEEdMMM"
        const val PLACEHOLDER = "\u24DB\u2A4A\u24DB" // ⓛ⩊ⓛ
    }
}

/**
 * Lays out chips left to right in priority order: each one that fits is shown whole, the first that
 * doesn't is ellipsized if at least [minChipWidth] is left (else hidden), and the rest are hidden.
 * A chip tagged [COMPACT] is the shorter form of the one before it: shown, whole, in its place when
 * the full one doesn't fit, or when only the shorter one leaves room for the next chip.
 */
class GlanceChipRow(context: Context, attrs: AttributeSet?) : ViewGroup(context, attrs) {

    private val gap = resources.getDimensionPixelSize(R.dimen.glance_chip_gap)
    private val minChipWidth = resources.getDimensionPixelSize(R.dimen.glance_chip_min_width)

    override fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
        val width = MeasureSpec.getSize(widthMeasureSpec)
        val height = MeasureSpec.getSize(heightMeasureSpec)
        val childHeightSpec = MeasureSpec.makeMeasureSpec(height, MeasureSpec.EXACTLY)
        val natural = IntArray(childCount) { getChildAt(it).run { measure(MeasureSpec.UNSPECIFIED, childHeightSpec); measuredWidth } }
        fun isCompact(i: Int) = getChildAt(i)?.tag === COMPACT
        // The narrowest a chip can be shown at: its compact form, or ellipsized
        fun minWidth(i: Int) = minOf(natural[i], if (isCompact(i + 1)) natural[i + 1] else minChipWidth)
        var used = 0
        var full = false
        var mainShown = false
        for (i in 0 until childCount) {
            val room = width - used
            val compact = isCompact(i)
            val hasCompact = isCompact(i + 1)
            val next = i + if (hasCompact) 2 else 1
            // Look ahead one chip: use the compact form when only that leaves room for the next one
            val preferCompact = hasCompact && next < childCount && natural[i] <= room &&
                room - natural[i] - gap < minWidth(next) && room - natural[i + 1] - gap >= minWidth(next)
            val chipWidth = when {
                full || (compact && mainShown) || preferCompact -> 0
                natural[i] <= room -> natural[i]
                else -> {
                    full = !hasCompact
                    if (!hasCompact && !compact && room >= minChipWidth) room else 0
                }
            }
            if (!compact) mainShown = chipWidth > 0
            getChildAt(i).measure(MeasureSpec.makeMeasureSpec(chipWidth, MeasureSpec.EXACTLY), childHeightSpec)
            if (chipWidth > 0) used += chipWidth + gap
        }
        setMeasuredDimension(width, height)
    }

    override fun onLayout(changed: Boolean, l: Int, t: Int, r: Int, b: Int) {
        val rtl = layoutDirection == LAYOUT_DIRECTION_RTL
        var x = 0
        children.forEach { chip ->
            val chipWidth = chip.measuredWidth
            val left = if (rtl) width - x - chipWidth else x
            chip.layout(left, 0, left + chipWidth, chip.measuredHeight)
            if (chipWidth > 0) x += chipWidth + gap
        }
    }

    companion object {
        val COMPACT = Any()
    }
}
