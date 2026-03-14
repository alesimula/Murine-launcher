package app.murinelauncher.settings

import androidx.annotation.VisibleForTesting
import androidx.preference.Preference
import app.murinelauncher.settings.common.AbstractSettingsFragment
import com.android.launcher3.BuildConfig
import com.android.launcher3.R
import com.android.launcher3.util.DisplayController

public final class SettingsRootFragment: AbstractSettingsFragment() {

    companion object {
        @VisibleForTesting
        const val DEVELOPER_OPTIONS_KEY: String = "pref_developer_options"
    }

    override fun getPreferenceScreenResId() = R.xml.murine_prefs_root

    override fun initPreference(preference: Preference, info: DisplayController.Info): Boolean {
        when (preference.key) {
            DEVELOPER_OPTIONS_KEY -> {
                if (BuildConfig.IS_STUDIO_BUILD) {
                    preference.setOrder(0)
                }
                return mDeveloperOptionsEnabled
            }
            else -> return true
        }
    }
}