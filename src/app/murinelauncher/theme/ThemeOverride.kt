package app.murinelauncher.theme

import android.content.Context
import android.content.res.Configuration
import android.content.res.Resources
import app.murinelauncher.settings.SettingsGeneralFragment
import androidx.appcompat.app.AppCompatDelegate
import com.android.launcher3.LauncherFiles
import com.android.launcher3.Utilities

object ThemeOverride {
    const val THEME_SYSTEM = 0
    const val THEME_LIGHT = 1
    const val THEME_DARK = 2


    /**
     * The default theme used for older SDKs that do not support system-wide dark theme.
     */
    const val DEFAULT_THEME_LEGACY = THEME_DARK

    @JvmStatic
    val supportsSystemTheme: Boolean get() = Utilities.ATLEAST_Q

    @JvmStatic
    val defaultTheme: Int get() = if (supportsSystemTheme) THEME_SYSTEM else DEFAULT_THEME_LEGACY

    @JvmStatic
    fun getThemePref(context: Context): Int {
        val prefs = context.getSharedPreferences(LauncherFiles.SHARED_PREFERENCES_KEY, Context.MODE_PRIVATE)
        return prefs.getInt(SettingsGeneralFragment.LAUNCHER_THEME_DAY_NIGHT, defaultTheme)
    }

    @JvmStatic
    fun syncNightMode(context: Context) {
        val mode = when (getThemePref(context)) {
            THEME_DARK -> AppCompatDelegate.MODE_NIGHT_YES
            THEME_LIGHT -> AppCompatDelegate.MODE_NIGHT_NO
            else -> AppCompatDelegate.MODE_NIGHT_FOLLOW_SYSTEM
        }
        AppCompatDelegate.setDefaultNightMode(mode)
    }

    @JvmStatic
    fun applyTheme(context: Context): Context {
        val themePref = getThemePref(context)
        if (themePref == THEME_SYSTEM) return context

        val configuration = Configuration(context.resources.configuration)
        configuration.uiMode = (configuration.uiMode and Configuration.UI_MODE_NIGHT_MASK.inv()) or
                if (themePref == THEME_DARK) Configuration.UI_MODE_NIGHT_YES
                else Configuration.UI_MODE_NIGHT_NO
        return context.createConfigurationContext(configuration)
    }

    @JvmStatic
    fun isThemeStale(context: Context): Boolean {
        val themePref = getThemePref(context)
        val currentNightMode = context.resources.configuration.uiMode and Configuration.UI_MODE_NIGHT_MASK

        val expectedNightMode = when (themePref) {
            THEME_SYSTEM -> Resources.getSystem().configuration.uiMode and Configuration.UI_MODE_NIGHT_MASK
            THEME_DARK -> Configuration.UI_MODE_NIGHT_YES
            else -> Configuration.UI_MODE_NIGHT_NO
        }
        return currentNightMode != expectedNightMode
    }
}
