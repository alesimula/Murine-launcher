package app.murinelauncher.settings

import android.util.Log
import androidx.preference.ListPreference
import androidx.preference.Preference
import androidx.preference.SwitchPreferenceCompat
import app.murinelauncher.graphics.WorkspaceBlurUtils
import app.murinelauncher.i18n.LanguageOverride
import app.murinelauncher.settings.common.AbstractSettingsFragment
import app.murinelauncher.icons.IconPackManager
import app.murinelauncher.theme.ThemeOverride
import com.android.launcher3.Launcher
import com.android.launcher3.LauncherAppState
import com.android.launcher3.LauncherPrefs
import com.android.launcher3.R
import com.android.launcher3.util.DisplayController
import com.android.settingslib.widget.SegmentedButtonPreference

public final class SettingsGeneralFragment: AbstractSettingsFragment() {

    companion object {
        const val LAUNCHER_THEME_DAY_NIGHT: String = "pref_launcher_theme_day_night"
        const val LAUNCHER_LANGUAGE: String = LanguageOverride.PREF_LANGUAGE
        const val BLUR_PREVIEW: String = "pref_blur_preview"
        const val BLUR_WARNING: String = "pref_blur_warning"
    }

    override fun getPreferenceScreenResId() = R.xml.murine_prefs_general

    override fun getPreferenceTitle(): Int? = R.string.pref_category_general_title

    private fun updateBlurWarningVisibility(value: Boolean) {
        findPreference<Preference>(BLUR_WARNING)?.isVisible =
            value && !WorkspaceBlurUtils.isBlurSupported
    }

    override fun initPreference(preference: Preference, info: DisplayController.Info): Boolean {
        when (preference.key) {
            LAUNCHER_LANGUAGE -> {
                preference as ListPreference
                preference.value = LanguageOverride.getLanguage(requireContext())
                preference.summaryProvider = ListPreference.SimpleSummaryProvider.getInstance()
                preference.setOnPreferenceChangeListener { _, newValue ->
                    LanguageOverride.setLanguage(requireContext(), newValue as String)
                    Launcher.ACTIVITY_TRACKER.getCreatedContext<Launcher>()?.recreate()
                    tryRecreateActivity()
                    true
                }
                return true
            }
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
                        // UI theme flip: reload if an icon pack is selected to allow icons to refresh
                        if (IconPackManager.isAnyPackActive(preference.context))
                            LauncherAppState.getInstance(preference.context).model.forceReload()
                        tryRecreateActivity()
                        Log.d("Settings.Theme", "Selected UI theme: $selectedIndex")
                    }
                }
                return true
            }
            BLUR_PREVIEW -> {
                preference as SwitchPreferenceCompat
                val currentEntry = LauncherPrefs.BLUR_PREVIEW.get(requireContext())
                val isVisible = WorkspaceBlurUtils.isBlurSupportedSDK
                preference.isChecked = currentEntry
                preference.isVisible = isVisible
                updateBlurWarningVisibility(if (isVisible) currentEntry else false)
                if (isVisible) preference.setOnPreferenceChangeListener { _, newValue ->
                    updateBlurWarningVisibility(newValue as Boolean)
                    true
                }
                return true
            }
            else -> return true
        }
    }
}
