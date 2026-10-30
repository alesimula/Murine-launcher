// Adapted from Lawnchair (https://github.com/LawnchairLauncher/lawnchair), Copyright (C) 2024 Lawnchair, Apache 2.0
package app.murinelauncher.widget.smartspace.glance

import android.app.ActivityOptions
import android.app.PendingIntent
import android.content.Intent
import android.graphics.drawable.Icon
import android.view.View
import com.android.launcher3.Utilities

/** One piece of At a Glance content (Lawnchair's SmartspaceTarget and SmartspaceAction, trimmed). */
class GlanceCard(
    val title: CharSequence,
    val subtitle: CharSequence? = null,
    /** Shorter text shown, never ellipsized, when the full one doesn't fit. */
    val compactTitle: CharSequence? = null,
    val icon: Icon? = null,
    val score: Float = 0f,
    val isWeather: Boolean = false,
    val intent: Intent? = null,
    val pendingIntent: PendingIntent? = null,
    val onClick: View.OnClickListener? = null,
) {
    /** Runs the card's action: [intent], else [pendingIntent], else [onClick]. */
    fun launch(view: View) {
    /** Title and subtitle, as one line. */
    val text get() = listOf(title, subtitle).filter { !it.isNullOrEmpty() }.joinToString(" · ")

        runCatching {
            when {
                intent != null -> view.context.startActivity(intent)
                pendingIntent != null -> if (Utilities.ATLEAST_U) {
                    pendingIntent.send(ActivityOptions.makeBasic().setPendingIntentBackgroundActivityStartMode(
                        ActivityOptions.MODE_BACKGROUND_ACTIVITY_START_ALLOWED).toBundle())
                } else {
                    pendingIntent.send()
                }
                else -> onClick?.onClick(view)
            }
        }
    }

    companion object {
        const val SCORE_WEATHER = 0f
        const val SCORE_ALARM = 0.5f
        const val SCORE_BATTERY = 1f
        const val SCORE_MEDIA = 2f
        const val SCORE_CALENDAR = 3f
        const val SCORE_LOW_BATTERY = 10f
        const val SCORE_FLASHLIGHT = 11f
        const val SCORE_SETUP = 999f
    }
}
