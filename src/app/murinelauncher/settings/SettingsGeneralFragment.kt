package app.murinelauncher.settings

import android.content.pm.ActivityInfo
import android.util.Log
import androidx.annotation.VisibleForTesting
import androidx.preference.Preference
import com.android.launcher3.BuildConfig
import com.android.launcher3.Flags
import com.android.launcher3.InvariantDeviceProfile
import com.android.launcher3.LauncherPrefs
import app.murinelauncher.theme.ThemeOverride
import com.android.launcher3.R
import com.android.launcher3.states.RotationHelper
import com.android.launcher3.util.DisplayController
import com.android.settingslib.widget.SegmentedButtonPreference

public final class SettingsGeneralFragment: AbstractSettingsFragment() {

    companion object {
        const val LAUNCHER_THEME_DAY_NIGHT: String = "pref_launcher_theme_day_night"
    }

    override fun getPreferenceScreenResId() = R.xml.murine_prefs_general

    override fun getPreferenceTitle(): Int? = R.string.pref_category_general_title

    override fun initPreference(preference: Preference, info: DisplayController.Info): Boolean {
        when (preference.key) {
            LAUNCHER_THEME_DAY_NIGHT -> {
                preference as SegmentedButtonPreference
                preference.apply {
                    // Configure the visible buttons (0-indexed)
                    setUpButton(0, getString(R.string.pref_label_ui_mode_system), R.drawable.ic_pref_ui_mode_system)
                    setUpButton(1, getString(R.string.pref_label_ui_mode_day), R.drawable.ic_pref_ui_mode_day)
                    setUpButton(2, getString(R.string.pref_label_ui_mode_night), R.drawable.ic_pref_ui_mode_night)

                    // Hide "System" on SDKs without system-wide dark theme
                    setButtonVisibility(0, ThemeOverride.supportsSystemTheme)
                    setButtonVisibility(1, true)
                    setButtonVisibility(2, true)
                    setButtonVisibility(3, false)

                    // Set initial state from saved settings
                    val prefs = LauncherPrefs.getPrefs(preference.context)
                    setCheckedIndex(prefs.getInt(LAUNCHER_THEME_DAY_NIGHT, ThemeOverride.defaultTheme))

                    // Use the custom listener provided by the class
                    setOnButtonClickListener { _, _, _ ->
                        val selectedIndex = getCheckedIndex()
                        prefs.edit().putInt(LAUNCHER_THEME_DAY_NIGHT, selectedIndex).apply()
                        ThemeOverride.syncNightMode(preference.context)
                        tryRecreateActivity()
                        Log.d("Settings.Theme", "Selected UI theme: $selectedIndex")
                    }
                }
                return true
            }
            else -> return true
        }
    }
}