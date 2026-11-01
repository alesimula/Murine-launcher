package app.murinelauncher.widget.smartspace

import android.app.AlarmManager
import android.content.ContentUris
import android.content.Context
import android.content.Intent
import android.content.res.ColorStateList
import android.content.res.Configuration
import android.graphics.Canvas
import android.graphics.Outline
import android.graphics.drawable.GradientDrawable
import android.graphics.drawable.Icon
import android.provider.CalendarContract
import android.text.format.DateFormat
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.ViewOutlineProvider
import android.widget.ImageView
import android.widget.FrameLayout
import android.widget.TextClock
import android.widget.TextView
import androidx.core.content.getSystemService
import androidx.core.graphics.ColorUtils
import androidx.core.view.children
import androidx.core.view.isInvisible
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
class GlanceView(context: Context, attrs: AttributeSet?) : FrameLayout(context, attrs) {

    private val provider = SmartspaceProvider.get(context)
    private var textColor = 0
    private var shadowStrength = 0f
    private val cornerRadius = resources.getDimension(R.dimen.glance_corner_radius)
    private val card = GradientDrawable()

    init {
        // Clipped to the card: opts out of the launcher's rounded corners for widgets (see RoundedCornerEnforcement)
        id = android.R.id.background
        clipToOutline = true
        clipChildren = false // The scaled weather goes past the header's bounds, see onMeasure
        outlineProvider = object : ViewOutlineProvider() {
            override fun getOutline(view: View, outline: Outline) = outline.setRoundRect(card.bounds, card.cornerRadius)
        }
    }

    private lateinit var header: View
    private lateinit var date: TextClock
    private lateinit var weather: View
    private lateinit var divider: View
    private lateinit var weatherIcon: ImageView
    private lateinit var temperature: TextView
    private lateinit var chips: ViewGroup

    private var cards = emptyList<GlanceCard>()
    private val cardsListener: (List<GlanceCard>) -> Unit = { cards = it; update() }
    private val prefListener = LauncherPrefChangeListener { _ -> applyTheme(); update() }

    override fun onFinishInflate() {
        super.onFinishInflate()
        header = findViewById(R.id.glance_header)
        date = findViewById(R.id.glance_date)
        weather = findViewById(R.id.glance_weather)
        divider = findViewById(R.id.glance_divider)
        weatherIcon = findViewById(R.id.glance_weather_icon)
        temperature = findViewById(R.id.glance_temperature)
        chips = findViewById(R.id.glance_chips)

        applyLocaleDateFormat()
        date.setOnClickListener { runCatching { context.startActivity(calendarIntent()) } }
        // The picker's live preview is drawn without being attached: set the card up already
        applyTheme()
        update()
    }

    // At full size: the space around the card, its paddings and the gap above the chips (below the weather)
    private val margin = resources.getDimension(R.dimen.glance_margin_vertical)
    private val padding = resources.getDimension(R.dimen.glance_padding)
    private val chipsGap = resources.getDimension(R.dimen.glance_chips_margin_top)
    private val chipHeight = resources.getDimensionPixelSize(R.dimen.glance_chip_height)
    // As fitted to the height it got: the space around the card, its paddings' scale, the gaps above and below the date
    private var cardMargin = 0f
    private var spaceScale = 1f
    private var topGap = 0f
    private var midGap = 0f

    /**
     * Shown at its full size, centered in any taller height. In a shorter one the space around the card goes
     * first, then the gaps around the date (centered next to the taller weather, which shrinks with them unless
     * on the side, see [SIDE_WEATHER_RATIO]), then the paddings, to no less than [MIN_SPACE_SCALE], while the
     * content shrinks a little along, down to [SPACES_CONTENT_SCALE]; then only the content does.
     */
    override fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
        val width = MeasureSpec.getSize(widthMeasureSpec)
        measureContent(width - 2 * padding)
        val headerHeight = header.measuredHeight
        val dateHeight = date.measuredHeight
        val dateOffset = (headerHeight - dateHeight) / 2f
        val text = dateHeight + chipHeight
        val fullHeight = 2 * padding + headerHeight + chipsGap + chipHeight
        val height = if (MeasureSpec.getMode(heightMeasureSpec) == MeasureSpec.UNSPECIFIED) (fullHeight + 2 * margin).toInt()
            else MeasureSpec.getSize(heightMeasureSpec)
        cardMargin = ((height - fullHeight) / 2).coerceAtLeast(0f)

        // At [progress] from the full size (0) to the least spaces (1): the gaps go in its first half, the paddings in the second
        var gapScale = 1f
        var scale = 1f
        fun heightAt(progress: Float): Float {
            gapScale = 1 - (progress * 2).coerceAtMost(1f)
            spaceScale = 1 - (1 - MIN_SPACE_SCALE) * (progress * 2 - 1).coerceIn(0f, 1f)
            scale = 1 - (1 - SPACES_CONTENT_SCALE) * progress
            return 2 * padding * spaceScale + 2 * dateOffset * scale * gapScale +
                chipsGap * (MIN_SPACE_SCALE + (1 - MIN_SPACE_SCALE) * gapScale) + text * scale
        }
        if (heightAt(1f) >= height) {
            scale = ((height - 2 * padding * MIN_SPACE_SCALE - chipsGap * MIN_SPACE_SCALE) / text).coerceAtLeast(0.01f)
        } else if (height < fullHeight) {
            // bisection, the height only shrinks with progress
            var low = 0f
            var high = 1f
            repeat(16) { val mid = (low + high) / 2; if (heightAt(mid) > height) low = mid else high = mid }
            heightAt(high)
        } else heightAt(0f)
        topGap = dateOffset * scale * gapScale
        midGap = dateOffset * scale * gapScale + chipsGap * (MIN_SPACE_SCALE + (1 - MIN_SPACE_SCALE) * gapScale)

        // Next to the whole content in a card wide enough, else as tall as the date and the gap below it, like the date
        val cardHeight = height - 2 * cardMargin
        val side = width >= SIDE_WEATHER_RATIO * cardHeight
        val weatherScale = if (side) (cardHeight - 2 * padding * spaceScale) / (headerHeight * scale)
            else (dateHeight + 2 * dateOffset * gapScale) / headerHeight
        // On the side, the icon and the temperature centered in a square as tall as the card's content, the divider
        // a padding around; else as laid out, the divider a full padding around
        val square = if (side) headerHeight else ViewGroup.LayoutParams.WRAP_CONTENT
        val column = weatherIcon.parent as View
        column.layoutParams.let { it.width = square; it.height = square }
        (divider.layoutParams as MarginLayoutParams).run {
            marginStart = (if (side) padding * spaceScale / (scale * weatherScale) else padding).toInt()
            marginEnd = marginStart
            resolveLayoutDirection(divider.layoutDirection) // Else the left and right ones measured stay the old
        }
        // Else measure() keeps their last size for the same spec: changed params don't ask for a new layout by themselves
        listOf(column, divider, weather, header).forEach { it.forceLayout() }
        weather.measure(MeasureSpec.UNSPECIFIED, MeasureSpec.UNSPECIFIED)
        val weatherWidth = weather.measuredWidth
        // Measured at the width they fill once scaled down: the header (and the date) to the scaled weather's start,
        // the chips beside the weather when it's on the side
        val innerWidth = (width - 2 * padding * spaceScale) / scale
        header.measure(exactly(innerWidth - weatherWidth * (weatherScale - 1)), MeasureSpec.makeMeasureSpec(0, MeasureSpec.UNSPECIFIED))
        chips.measure(exactly(if (side) innerWidth - weatherWidth * weatherScale else innerWidth), exactly(chipHeight.toFloat()))
        listOf(header, chips).forEach { it.scaleX = scale; it.scaleY = scale }
        date.translationY = -dateOffset * (1 - gapScale)
        weather.pivotX = if (layoutDirection == LAYOUT_DIRECTION_RTL) weatherWidth.toFloat() else 0f
        weather.pivotY = 0f
        weather.scaleX = weatherScale
        weather.scaleY = weatherScale
        setMeasuredDimension(width, height)
    }

    private fun measureContent(width: Float) {
        header.measure(exactly(width), MeasureSpec.makeMeasureSpec(0, MeasureSpec.UNSPECIFIED))
        chips.measure(exactly(width), exactly(chipHeight.toFloat()))
    }

    private fun exactly(size: Float) = MeasureSpec.makeMeasureSpec(size.toInt(), MeasureSpec.EXACTLY)

    override fun onLayout(changed: Boolean, left: Int, top: Int, right: Int, bottom: Int) {
        val start = padding * spaceScale
        val headerTop = cardMargin + start
        place(header, start, headerTop)
        place(chips, start, headerTop + topGap + date.measuredHeight * header.scaleY + midGap)
        card.setBounds(0, cardMargin.toInt(), width, height - cardMargin.toInt())
        // Concentric with the chips: the padding plus their (pill) radius, each scaled on its own
        card.cornerRadius = padding * spaceScale + (cornerRadius - padding) * header.scaleY
        invalidateOutline()
    }

    /** Lays [child] out [start] from the start edge and [top] down, scaled from there. */
    private fun place(child: View, start: Float, top: Float) {
        val rtl = layoutDirection == LAYOUT_DIRECTION_RTL
        child.pivotX = if (rtl) child.measuredWidth.toFloat() else 0f
        child.pivotY = 0f
        val left = (if (rtl) width - start - child.measuredWidth else start).toInt()
        child.layout(left, top.toInt(), left + child.measuredWidth, top.toInt() + child.measuredHeight)
    }

    override fun dispatchDraw(canvas: Canvas) {
        card.draw(canvas)
        super.dispatchDraw(canvas)
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
        invalidate() // Drawn by dispatchDraw, not as a background
        // Shadow under light text, fading out as the card gets opaque: full at 0%, none from 50%
        shadowStrength = if (light) 0f else (50 - alpha).coerceAtLeast(0) / 50f
        date.setTextColor(textColor)
        date.applyShadow(large = true)
        temperature.applyShadow()
        divider.setBackgroundColor(ColorUtils.setAlphaComponent(textColor, 0x40))
        temperature.setTextColor(color(if (light) android.R.color.system_accent1_700 else android.R.color.system_accent1_100,
            if (light) 0xFF8C3A3F.toInt() else 0xFFFFDAD9.toInt()))
    }

    private fun update() {
        val weatherCard = cards.firstOrNull { it.isWeather }
        weather.isInvisible = weatherCard == null // Still takes its room: the chips stay where they are
        if (weatherCard != null) {
            weatherIcon.setImageIcon(weatherCard.icon)
            temperature.text = weatherCard.subtitle
            weather.contentDescription = weatherCard.title.ifEmpty { weatherCard.subtitle }
            weather.setOnClickListener(weatherCard::launch)
        }

        // With nothing to show, a placeholder keeps the size
        val shown = chipCards(context, cards).ifEmpty { listOf(GlanceCard(title = PLACEHOLDER)) }
        chips.removeAllViews()
        shown.forEach { card ->
            chips.addView(chipView(card, card.text))
            // Right after the full chip, see GlanceChipRow
            card.compactTitle?.let { chips.addView(chipView(card, it).apply { tag = GlanceChipRow.COMPACT }) }
        }
    }

    private fun chipView(card: GlanceCard, text: CharSequence): TextView {
        val chip = LayoutInflater.from(context).inflate(R.layout.murine_glance_chip, chips, false) as TextView
        chip.showCard(card, text, textColor)
        chip.applyShadow()
        chip.backgroundTintList = ColorStateList.valueOf(ColorUtils.setAlphaComponent(textColor, 0x1A))
        if (card.icon == null) chip.setPaddingRelative(chip.paddingEnd, 0, chip.paddingEnd, 0)
        return chip
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
        const val MIN_SPACE_SCALE = 0.4f
        const val SPACES_CONTENT_SCALE = 0.75f
        /** Aspect ratio (of the widget's outer card) to determine wether the weather icon should take advantage of the full card's height **/
        const val SIDE_WEATHER_RATIO = 6f
    }
}

/** The cards shown as chips, highest priority first: all of [cards] but the weather, and the next alarm last. */
fun chipCards(context: Context, cards: List<GlanceCard>) =
    (cards.filter { !it.isWeather } + listOfNotNull(nextAlarmCard(context))).sortedByDescending { it.score }

private fun nextAlarmCard(context: Context): GlanceCard? {
    val alarm = context.getSystemService<AlarmManager>()?.nextAlarmClock ?: return null
    val skeleton = if (DateFormat.is24HourFormat(context)) "EEEHm" else "EEEhma"
    val pattern = DateFormat.getBestDateTimePattern(context.resources.configuration.locales.get(0), skeleton)
    return GlanceCard(
        title = DateFormat.format(pattern, alarm.triggerTime),
        icon = Icon.createWithResource(context, R.drawable.ic_glance_alarm),
        score = GlanceCard.SCORE_ALARM,
        pendingIntent = alarm.showIntent,
    )
}

/** Shows [card] here: [text] after its icon, both in [color], and its action on click; null clears it. */
fun TextView.showCard(card: GlanceCard?, text: CharSequence? = card?.text, color: Int = currentTextColor) {
    this.text = text
    setTextColor(color)
    val iconSize = (textSize * 1.15f).toInt() // 15dp next to a 13sp chip, and in proportion elsewhere
    val icon = card?.icon?.loadDrawable(context)?.mutate()?.apply {
        setBounds(0, 0, iconSize, iconSize)
        setTint(color)
    }
    // Not the relative variant: it's only resolved once attached, and the picker's preview never is
    if (resources.configuration.layoutDirection == View.LAYOUT_DIRECTION_RTL) setCompoundDrawables(null, null, icon, null)
    else setCompoundDrawables(icon, null, null, null)
    setOnClickListener(card?.let { c -> View.OnClickListener { c.launch(it) } })
    isClickable = card != null
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
