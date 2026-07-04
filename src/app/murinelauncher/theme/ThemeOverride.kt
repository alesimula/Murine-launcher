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

    /**
     * @return true if night mode, checking the launcher's UI theme override if set, the system's otherwise.
     */
    @JvmStatic
    fun isNightMode(context: Context): Boolean = when (getThemePref(context)) {
        THEME_DARK -> true
        THEME_LIGHT -> false
        else -> (Resources.getSystem().configuration.uiMode and Configuration.UI_MODE_NIGHT_MASK) == Configuration.UI_MODE_NIGHT_YES
    }

    /**
     * @param prefContext where to read the theme pref from; lets [context] be another
     *        package's context (e.g. an icon pack) while honoring the launcher's setting.
     */
    @JvmStatic
    @JvmOverloads
    fun applyTheme(context: Context, prefContext: Context = context): Context {
        val themePref = getThemePref(prefContext)
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
