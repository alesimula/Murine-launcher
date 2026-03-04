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


public final class SettingsMiscFragment: AbstractSettingsFragment() {

    companion object {
    }

    override fun getPreferenceScreenResId() = R.xml.murine_prefs_misc

    override fun getPreferenceTitle(): Int? = R.string.pref_category_misc_title


    override fun initPreference(preference: Preference, info: DisplayController.Info): Boolean {
        when (preference.key) {
            else -> return true
        }
    }
}
