package app.murinelauncher.widget.smartspace

import android.app.Activity
import android.content.Context
import app.murinelauncher.widget.smartspace.glance.SmartspaceWidgetReader
import com.android.launcher3.R

/** What the At a Glance widget shows: the launcher's own, or a provider's widget as is. */
enum class GlanceProvider {
    LAUNCHER,
    GOOGLE;

    /** The launcher's name, or the provider app's own (localized) one. */
    fun getLabel(context: Context): CharSequence = when (this) {
        LAUNCHER -> context.getString(R.string.app_name)
        GOOGLE -> runCatching {
            context.packageManager.run { getApplicationLabel(getApplicationInfo(SmartspaceMode.GOOGLE_SMARTSPACE_PACKAGE, 0)) }
        }.getOrDefault("Google") // Not installed: shown disabled anyway
    }

    fun isAvailable(context: Context) = when (this) {
        LAUNCHER -> true
        GOOGLE -> SmartspaceMode.isGoogleSmartspaceAvailable(context)
    }

    /** Opens the provider's own settings from an activity; null when it has none (the launcher's are its own screen). */
    val openSettings: ((Activity) -> Unit)? get() = when (this) {
        LAUNCHER -> null
        GOOGLE -> { activity -> SmartspaceWidgetReader.openGoogleSettings(activity) }
    }
}
