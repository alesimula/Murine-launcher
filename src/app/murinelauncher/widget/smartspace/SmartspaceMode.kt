package app.murinelauncher.widget.smartspace

import android.content.Context
import com.android.launcher3.R

/**
 * Smartspace widget mode for the first screen of the home.
 * Controls what is shown at the top of the first workspace page.
 */
enum class SmartspaceMode(
    val displayNameRes: Int,
    val iconRes: Int,
    val summaryRes: Int
) {
    MURINE_CLOCK(
        displayNameRes = R.string.smartspace_mode_clock,
        iconRes = R.drawable.ic_pref_smartspace_clock,
        summaryRes = R.string.pref_smartspace_summary_clock
    ),
    GOOGLE_SMARTSPACE(
        displayNameRes = R.string.smartspace_mode_google,
        iconRes = R.drawable.ic_pref_smartspace_google,
        summaryRes = R.string.pref_smartspace_summary_google
    ),
    DISABLED(
        displayNameRes = R.string.smartspace_mode_disabled,
        iconRes = R.drawable.ic_pref_smartspace_disabled,
        summaryRes = R.string.pref_smartspace_summary_disabled
    );

    fun getDisplayName(context: Context): String = context.getString(displayNameRes)
    fun getSummary(context: Context): String = context.getString(summaryRes)

    companion object {
        const val GOOGLE_SMARTSPACE_PACKAGE = "com.google.android.googlequicksearchbox"
        const val GOOGLE_SMARTSPACE_PROVIDER =
            "com.google.android.apps.gsa.staticplugins.smartspace.widget.SmartspaceWidgetProvider"

        @JvmStatic
        fun isGoogleSmartspaceAvailable(context: Context): Boolean {
            try {
                val info = context.packageManager.getProviderInfo(
                    android.content.ComponentName(
                        GOOGLE_SMARTSPACE_PACKAGE,
                        GOOGLE_SMARTSPACE_PROVIDER
                    ), 0
                )
                return true
            } catch (_: android.content.pm.PackageManager.NameNotFoundException) {
                // Try via AppWidgetManager as it's a widget provider, not a content provider
                try {
                    val awm = android.appwidget.AppWidgetManager.getInstance(context)
                    return awm.getInstalledProviders(android.appwidget.AppWidgetProviderInfo.WIDGET_CATEGORY_HOME_SCREEN).any {
                        it.provider.packageName == GOOGLE_SMARTSPACE_PACKAGE &&
                                it.provider.className == GOOGLE_SMARTSPACE_PROVIDER
                    }
                } catch (_: Exception) {
                    return false
                }
            }
        }
    }
}
