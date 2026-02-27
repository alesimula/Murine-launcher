package app.murinelauncher.settings

import android.os.SystemProperties
import android.util.Log
import android.view.WindowManager
import androidx.preference.Preference
import app.murinelauncher.graphics.WorkspaceBlurUtils
import com.android.launcher3.LauncherPrefs
import com.android.launcher3.R
import com.android.launcher3.Utilities.getSystemProperty
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
                    setCheckedIndex(entries.indexOf(launcherPrefs.get(LauncherPrefs.DRAWER_TYPE)))

                    // Use the custom listener provided by the class
                    setOnButtonClickListener { _, _, _ ->
                        val selected = entries[getCheckedIndex()]
                        launcherPrefs.put(LauncherPrefs.DRAWER_TYPE, selected)
                        // Handle your logic based on the 0, 1 index
                        Log.d("Settings.Theme", "Selected drawer type: $selected")
                    }
                }
                return true
            }
            else -> return true
        }
    }
}