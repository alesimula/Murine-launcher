package app.murinelauncher.widget.smartspace

import android.content.Context
import android.content.res.Configuration
import android.util.AttributeSet
import android.widget.LinearLayout
import android.widget.TextClock
import com.android.launcher3.R
import com.android.launcher3.Utilities
import java.util.Locale

/**
 * Simple digital clock + date widget for the first home screen.
 * Shows a large clock and a formatted date below it.
 */
class MurineClockView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
) : LinearLayout(context, attrs, defStyleAttr) {

    private var dateText: TextClock? = null
    private var clockView: TextClock? = null
    private var attached = false
    private var currentLocale: Locale? = null

    override fun onFinishInflate() {
        super.onFinishInflate()
        clockView = findViewById(R.id.murine_clock)
        dateText = findViewById(R.id.murine_clock_date)
        applyLocaleDateFormat()

        // Uncomment to show alarms when clicked
        /*setOnClickListener {
            try {
                val intent = Intent(AlarmClock.ACTION_SHOW_ALARMS).apply {
                    addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
                }
                context.startActivity(intent)
            } catch (_: Exception) {
                // No clock app available
            }
        }*/
    }

    override fun onAttachedToWindow() {
        super.onAttachedToWindow()
        if (!attached) {
            attached = true
            // Custom logic
        }
    }

    override fun onDetachedFromWindow() {
        super.onDetachedFromWindow()
        if (attached) {
            attached = false
            // Custom logic
        }
    }

    override fun onConfigurationChanged(newConfig: Configuration) {
        super.onConfigurationChanged(newConfig)
        applyLocaleDateFormat()
    }

    /**
     * Sets the date [TextClock]'s pattern using the locale's best weekday + month + day-of-month format
     */
    private fun applyLocaleDateFormat() {
        val clock = dateText ?: return
        val locale: Locale = resources.configuration.locales.get(0)
        if (locale == currentLocale) return
        currentLocale = locale
        val pattern = android.text.format.DateFormat.getBestDateTimePattern(locale, DATE_SKELETON)
        clock.format12Hour = pattern
        clock.format24Hour = pattern
    }

    /**
     * Refreshes the displayed time (useful for showing widget preview).
     *
     * A detached TextClock gets no onVisibilityAggregated, which below Android 10
     * suppresses its own setText, so there the text is written directly instead.
     */
    fun refreshClockFormat() {
        if (Utilities.ATLEAST_Q || isAttachedToWindow) {
            listOfNotNull(clockView, dateText).forEach { tc ->
                tc.format12Hour = tc.format12Hour
                tc.format24Hour = tc.format24Hour
            }
            return
        }
        val now = System.currentTimeMillis()
        val is24Hour = android.text.format.DateFormat.is24HourFormat(context)
        listOfNotNull(clockView, dateText).forEach { tc ->
            val pattern = (if (is24Hour) tc.format24Hour else tc.format12Hour)
                ?: tc.format24Hour ?: tc.format12Hour ?: return@forEach
            tc.text = android.text.format.DateFormat.format(pattern, now)
        }
    }

    fun setTextColor(color: Int) {
        clockView?.setTextColor(color)
        dateText?.setTextColor(color)
    }

    override fun setPadding(left: Int, top: Int, right: Int, bottom: Int) {
        super.setPadding(0, 0, 0, 0)
    }

    companion object {
        // Order-independent skeleton: weekday + month + day-of-month
        private const val DATE_SKELETON = "EEEEMMMMd"
    }
}
