// Adapted from Lawnchair (https://github.com/LawnchairLauncher/lawnchair), Copyright (C) 2024 Lawnchair, Apache 2.0
package app.murinelauncher.widget.smartspace.glance

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.content.IntentFilter
import android.graphics.drawable.Icon
import android.icu.text.MeasureFormat
import android.icu.util.Measure
import android.icu.util.MeasureUnit
import android.os.BatteryManager
import androidx.core.content.ContextCompat
import androidx.core.content.getSystemService
import com.android.launcher3.LauncherPrefs
import com.android.launcher3.R
import com.android.launcher3.Utilities
import java.text.NumberFormat
import java.util.Locale

class BatteryStatusProvider(context: Context) :
    SmartspaceDataSource(context, LauncherPrefs.GLANCE_BATTERY) {

    private val batteryManager = context.getSystemService<BatteryManager>()

    private val receiver = object : BroadcastReceiver() {
        override fun onReceive(context: Context, intent: Intent) {
            // The charger state, not the battery status: after a quick unplug the status can still
            // say "charging", and the next update may only come with the next level change
            val charging = intent.getIntExtra(BatteryManager.EXTRA_PLUGGED, 0) != 0
            val full = intent.getIntExtra(BatteryManager.EXTRA_STATUS, -1) == BatteryManager.BATTERY_STATUS_FULL
            val level = (
                100f *
                    intent.getIntExtra(BatteryManager.EXTRA_LEVEL, 0) /
                    intent.getIntExtra(BatteryManager.EXTRA_SCALE, 100)
                ).toInt()
            publish(listOfNotNull(getCard(charging, full, level)))
        }
    }

    // The battery broadcast is sticky: the receiver gets the current state right away
    override fun startSource() {
        ContextCompat.registerReceiver(context, receiver, IntentFilter(Intent.ACTION_BATTERY_CHANGED),
            ContextCompat.RECEIVER_NOT_EXPORTED)
    }

    override fun stopSource() = context.unregisterReceiver(receiver)

    private fun getCard(charging: Boolean, full: Boolean, level: Int): GlanceCard? {
        val title = when {
            full || level == 100 -> return null
            charging -> context.getString(R.string.glance_battery_charging)
            level <= 15 -> context.getString(R.string.glance_battery_low)
            else -> return null
        }
        val score = if (level <= 15) GlanceCard.SCORE_LOW_BATTERY else GlanceCard.SCORE_BATTERY
        val percent = NumberFormat.getPercentInstance().format(level / 100.0)
        val chargingTimeRemaining = computeChargeTimeRemaining()
        val subtitle = if (charging && chargingTimeRemaining > 0) {
            context.getString(R.string.glance_battery_full_in, percent, formatMinutes(chargingTimeRemaining))
        } else {
            percent
        }
        val iconResId = if (charging) R.drawable.ic_glance_charging else R.drawable.ic_glance_battery_low
        return GlanceCard(
            title = title,
            subtitle = subtitle,
            compactTitle = percent,
            icon = Icon.createWithResource(context, iconResId),
            score = score,
        )
    }

    /** "1 hr, 5 min" style, rounded up to the minute. */
    private fun formatMinutes(millis: Long): String {
        val minutes = (millis + 59_999) / 60_000
        val format = MeasureFormat.getInstance(Locale.getDefault(), MeasureFormat.FormatWidth.SHORT)
        return if (minutes < 60) {
            format.format(Measure(minutes, MeasureUnit.MINUTE))
        } else {
            format.formatMeasures(Measure(minutes / 60, MeasureUnit.HOUR), Measure(minutes % 60, MeasureUnit.MINUTE))
        }
    }

    private fun computeChargeTimeRemaining(): Long {
        if (!Utilities.ATLEAST_P) return -1
        return runCatching { batteryManager?.computeChargeTimeRemaining() ?: -1 }.getOrDefault(-1)
    }
}
