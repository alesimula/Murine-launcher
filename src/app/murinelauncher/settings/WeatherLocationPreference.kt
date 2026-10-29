package app.murinelauncher.settings

import android.content.Context
import android.util.AttributeSet
import android.view.Gravity
import android.widget.Button
import android.widget.EditText
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AlertDialog
import androidx.preference.Preference
import app.murinelauncher.widget.smartspace.ClockWeather
import com.android.launcher3.LauncherPrefs

/**
 * "Weather location" row: tap to type a city ("City" or "City, CC"), press Check to look it up
 * and Confirm to save it. No GPS or location permission involved.
 */
class WeatherLocationPreference @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null
) : Preference(context, attrs) {

    init {
        updateSummary()
    }

    private fun updateSummary() {
        val city = LauncherPrefs.CLOCK_WEATHER_CITY.get(context)
        summary = if (city.isEmpty()) "Not set" else city
    }

    override fun onClick() {
        val ctx = context
        val density = ctx.resources.displayMetrics.density
        val pad = (20 * density).toInt()

        val input = EditText(ctx).apply {
            setSingleLine()
            hint = "City, CC (e.g. Tasikmalaya, ID)"
            setText(LauncherPrefs.CLOCK_WEATHER_CITY.get(ctx))
        }
        val check = Button(ctx).apply { text = "Check" }
        val status = TextView(ctx)

        val row = LinearLayout(ctx).apply {
            orientation = LinearLayout.HORIZONTAL
            gravity = Gravity.CENTER_VERTICAL
            addView(
                input,
                LinearLayout.LayoutParams(0, LinearLayout.LayoutParams.WRAP_CONTENT, 1f)
            )
            addView(check)
        }
        val content = LinearLayout(ctx).apply {
            orientation = LinearLayout.VERTICAL
            setPadding(pad, pad / 2, pad, 0)
            addView(row)
            addView(status)
        }

        var found: ClockWeather.Place? = null
        val dialog = AlertDialog.Builder(ctx)
            .setTitle("Weather location")
            .setView(content)
            .setPositiveButton("Confirm", null)
            .setNegativeButton("Cancel", null)
            .create()

        dialog.setOnShowListener {
            val confirm = dialog.getButton(AlertDialog.BUTTON_POSITIVE)
            confirm.isEnabled = false
            confirm.setOnClickListener {
                found?.let { place ->
                    LauncherPrefs.get(ctx).put(
                        LauncherPrefs.CLOCK_WEATHER_CITY to place.label,
                        LauncherPrefs.CLOCK_WEATHER_PLACE to "${place.lat},${place.lon}",
                    )
                    updateSummary()
                }
                dialog.dismiss()
            }
        }

        check.setOnClickListener {
            val query = input.text.toString().trim()
            if (query.isEmpty()) return@setOnClickListener
            status.text = "Checking…"
            check.isEnabled = false
            dialog.getButton(AlertDialog.BUTTON_POSITIVE)?.isEnabled = false
            Thread {
                val place = try {
                    ClockWeather.geocode(query)
                } catch (_: Exception) {
                    null
                }
                input.post {
                    found = place
                    check.isEnabled = true
                    status.text = if (place != null) {
                        "✓ ${place.label}"
                    } else {
                        "Location not found (or no internet)"
                    }
                    dialog.getButton(AlertDialog.BUTTON_POSITIVE)?.isEnabled = place != null
                }
            }.start()
        }

        dialog.show()
    }
}
