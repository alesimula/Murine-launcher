package app.murinelauncher.settings

import androidx.preference.Preference
import app.murinelauncher.settings.common.AbstractSettingsFragment
import com.android.launcher3.R
import com.android.launcher3.util.DisplayController


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
