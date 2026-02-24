package app.murinelauncher.settings

import android.content.pm.ActivityInfo
import android.util.Log
import androidx.annotation.VisibleForTesting
import androidx.preference.Preference
import com.android.launcher3.BuildConfig
import com.android.launcher3.Flags
import com.android.launcher3.InvariantDeviceProfile
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
                    setUpButton(0, "System", R.drawable.ic_setting)
                    setUpButton(1, "Light", R.drawable.ic_setting)
                    setUpButton(2, "Dark", R.drawable.ic_setting)

                    // Explicitly hide the remaining unused slots in the layout
                    setButtonVisibility(0, true)
                    setButtonVisibility(1, true)
                    setButtonVisibility(2, true)
                    setButtonVisibility(3, false)

                    // Set initial state (e.g., from saved settings)
                    setCheckedIndex(0)

                    // Use the custom listener provided by the class
                    setOnButtonClickListener { _, _, _ ->
                        val selectedIndex = getCheckedIndex()
                        // Handle your logic based on the 0, 1 index
                        Log.d("Settings", "Selected index: $selectedIndex")
                    }
                }
                return true
            }
            else -> return true
        }
    }
}