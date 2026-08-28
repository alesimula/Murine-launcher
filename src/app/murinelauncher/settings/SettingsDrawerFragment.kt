package app.murinelauncher.settings

import android.util.Log
import androidx.preference.Preference
import androidx.preference.SwitchPreferenceCompat
import app.murinelauncher.graphics.WorkspaceBlurUtils
import app.murinelauncher.settings.common.AbstractSettingsFragment
import app.murinelauncher.widget.CustomSeekBarPreference
import com.android.launcher3.InvariantDeviceProfile
import com.android.launcher3.LauncherPrefs
import com.android.launcher3.R
import com.android.launcher3.util.DisplayController
import com.android.settingslib.widget.SegmentedButtonPreference


public final class SettingsDrawerFragment: AbstractSettingsFragment() {

    companion object {
        const val DRAWER_TYPE: String = "pref_drawer_type"
        const val BLUR_WARNING: String = "pref_blur_warning"
        const val GRID_SIZE_WIDTH_DRAWER_OVERRIDE_SWITCH: String = "pref_grid_size_width_drawer_override_switch"
        const val GRID_SIZE_WIDTH_DRAWER_OVERRIDE: String = "pref_grid_size_width_drawer_override"
        const val DRAWER_PADDING: String = "pref_drawer_padding"
    }

    override fun getPreferenceScreenResId() = R.xml.murine_prefs_drawer

    override fun getPreferenceTitle(): Int? = R.string.pref_category_drawer_title

    private fun updateBlurWarningVisibility(selectedType: WorkspaceBlurUtils.DrawerBlurType) {
        findPreference<Preference>(BLUR_WARNING)?.isVisible =
            selectedType.radius > 0 && !WorkspaceBlurUtils.isBlurSupported
    }

    private fun updateDrawerGridWidthOverrideVisibility(enabled: Boolean) {
        findPreference<CustomSeekBarPreference>(GRID_SIZE_WIDTH_DRAWER_OVERRIDE)?.apply {
            isEnabled = enabled
            isVisible = enabled
            min = if (enabled) 3 else 0
        }
    }

    override fun initPreference(preference: Preference, info: DisplayController.Info): Boolean {
        when (preference.key) {
            DRAWER_TYPE -> {
                preference as SegmentedButtonPreference
                preference.apply {
                    val entries = WorkspaceBlurUtils.Companion.DRAWER_TYPES.entries
                    val resources = context.resources
                    for (i in 0..Math.min(entries.size - 1, 3)) {
                        var entry = entries[i]
                        setUpButton(i, resources.getString(entry.label), entry.icon)
                        setButtonEnabled(i, entry.type.radius == 0 || WorkspaceBlurUtils.isBlurSupportedSDK)
                        setButtonVisibility(i, true)
                    }

                    // Set initial state from saved settings
                    val launcherPrefs = LauncherPrefs.get(preference.context)
                    val currentEntry = launcherPrefs.get(LauncherPrefs.DRAWER_TYPE)
                    setCheckedIndex(entries.indexOf(currentEntry))
                    updateBlurWarningVisibility(currentEntry.type)

                    // Use the custom listener provided by the class
                    setOnButtonClickListener { _, _, _ ->
                        val idx = getCheckedIndex()
                        val selected = entries[idx]
                        setCheckedIndex(idx)
                        updateBlurWarningVisibility(selected.type)
                        launcherPrefs.put(LauncherPrefs.DRAWER_TYPE, selected)
                        // Handle your logic based on the 0, 1 index
                        Log.d("Settings.Theme", "Selected drawer type: $selected")
                    }
                }
                return true
            }
            GRID_SIZE_WIDTH_DRAWER_OVERRIDE_SWITCH -> {
                val isTablet = InvariantDeviceProfile.INSTANCE.get(requireContext()).deviceType == InvariantDeviceProfile.TYPE_TABLET
                val launcherPrefs = LauncherPrefs.get(preference.context)
                val currentValue = launcherPrefs.get(LauncherPrefs.DRAWER_GRID_WIDTH_OVERRIDE)
                preference as SwitchPreferenceCompat
                preference.isChecked = currentValue != 0
                updateDrawerGridWidthOverrideVisibility(currentValue != 0)
                preference.setOnPreferenceChangeListener { _, newValue ->
                    val enabled = newValue as Boolean
                    if (enabled) {
                        val defaultValue = LauncherPrefs.defaultGridWidth(isTablet)
                        launcherPrefs.put(LauncherPrefs.DRAWER_GRID_WIDTH_OVERRIDE, defaultValue)
                        findPreference<CustomSeekBarPreference>(GRID_SIZE_WIDTH_DRAWER_OVERRIDE)?.setValue(defaultValue)
                    } else {
                        launcherPrefs.put(LauncherPrefs.DRAWER_GRID_WIDTH_OVERRIDE, 0)
                    }
                    updateDrawerGridWidthOverrideVisibility(enabled)
                    true
                }
                return true
            }
            GRID_SIZE_WIDTH_DRAWER_OVERRIDE -> {
                preference as CustomSeekBarPreference
                val isTablet = InvariantDeviceProfile.INSTANCE.get(requireContext()).deviceType == InvariantDeviceProfile.TYPE_TABLET
                preference.setDefaultValue(LauncherPrefs.defaultGridWidth(isTablet))
                preference.min = if (LauncherPrefs.DRAWER_GRID_WIDTH_OVERRIDE.get(requireContext()) == 0) 0 else 3
                return true
            }
            DRAWER_PADDING -> {
                // For now only affects murine_drawer_padding_phone, it is displayed differently on tablets and would scale the whole sheet
                return InvariantDeviceProfile.INSTANCE.get(requireContext()).deviceType != InvariantDeviceProfile.TYPE_TABLET
            }
            BLUR_WARNING -> return true
            else -> return true
        }
    }
}
