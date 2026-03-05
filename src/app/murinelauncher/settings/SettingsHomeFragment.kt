package app.murinelauncher.settings

import android.content.pm.ActivityInfo
import androidx.annotation.VisibleForTesting
import androidx.preference.Preference
import com.android.launcher3.BuildConfig
import com.android.launcher3.Flags
import com.android.launcher3.InvariantDeviceProfile
import com.android.launcher3.LauncherPrefs
import com.android.launcher3.R
import com.android.launcher3.states.RotationHelper
import com.android.launcher3.util.DisplayController

public final class SettingsHomeFragment: AbstractSettingsFragment() {

    companion object {
        const val FIXED_LANDSCAPE_MODE: String = "pref_fixed_landscape_mode"
        const val GRID_SIZE_WIDTH: String = "pref_grid_size_width"
        const val GRID_SIZE_HEIGHT: String = "pref_grid_size_height"
    }

    override fun getPreferenceScreenResId() = R.xml.murine_prefs_home

    override fun getPreferenceTitle(): Int? = R.string.pref_category_home_title

    override fun initPreference(preference: Preference, info: DisplayController.Info): Boolean {
        var isTablet = InvariantDeviceProfile.INSTANCE.get(requireContext()).deviceType == InvariantDeviceProfile.TYPE_TABLET;
        when (preference.key) {
            RotationHelper.ALLOW_ROTATION_PREFERENCE_KEY -> {
                if (Flags.oneGridSpecs()) {
                    return false
                }
                if (info.isTablet(info.realBounds)) {
                    // Launcher supports rotation by default. No need to show this setting.
                    return false
                }
                // Initialize the UI once
                preference.setDefaultValue(RotationHelper.getAllowRotationDefaultValue(info))
                return true
            }
            FIXED_LANDSCAPE_MODE -> {
                if (!Flags.oneGridSpecs() // adding this condition until fixing b/378972567
                    || (InvariantDeviceProfile.INSTANCE.get(getContext()).deviceType
                            == InvariantDeviceProfile.TYPE_MULTI_DISPLAY) || (InvariantDeviceProfile.INSTANCE.get(
                        getContext()
                    ).deviceType
                            == InvariantDeviceProfile.TYPE_TABLET)
                ) {
                    return false
                }
                // When the setting changes rotate the screen accordingly to showcase the result
                // of the setting
                preference.setOnPreferenceChangeListener(
                    Preference.OnPreferenceChangeListener { pref: Preference?, newValue: Any? ->
                        requireActivity().setRequestedOrientation(
                            if (newValue as Boolean)
                                ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE
                            else
                                ActivityInfo.SCREEN_ORIENTATION_USER
                        )
                        true
                    }
                )
                return !info.isTablet(info.realBounds)
            }
            GRID_SIZE_WIDTH -> {
                preference.setDefaultValue(LauncherPrefs.defaultGridWidth(isTablet))
                return true
            }
            GRID_SIZE_HEIGHT -> {
                preference.setDefaultValue(LauncherPrefs.defaultGridHeight(isTablet))
                return true
            }
            else -> return true
        }
    }
}