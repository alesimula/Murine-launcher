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

public final class SettingsDrawerFragment: AbstractSettingsFragment() {

    companion object {
        const val DRAWER_TYPE: String = "pref_drawer_type"
    }

    override fun getPreferenceScreenResId() = R.xml.murine_prefs_drawer

    override fun getPreferenceTitle(): Int? = R.string.pref_category_drawer_title

    override fun initPreference(preference: Preference, info: DisplayController.Info): Boolean {
        when (preference.key) {
            DRAWER_TYPE -> {
                preference as SegmentedButtonPreference
                preference.apply {
                    // Configure the visible buttons (0-indexed)
                    setUpButton(0, "Option 1", R.drawable.ic_setting)
                    setUpButton(1, "Option 2", R.drawable.ic_setting)

                    // Explicitly hide the remaining unused slots in the layout
                    setButtonVisibility(0, true)
                    setButtonVisibility(1, true)
                    setButtonVisibility(2, false)
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