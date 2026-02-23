package app.murinelauncher.settings

import android.content.pm.ActivityInfo
import androidx.annotation.VisibleForTesting
import androidx.preference.Preference
import com.android.launcher3.BuildConfig
import com.android.launcher3.Flags
import com.android.launcher3.InvariantDeviceProfile
import com.android.launcher3.R
import com.android.launcher3.states.RotationHelper
import com.android.launcher3.util.DisplayController

public final class SettingsIconsFragment: AbstractSettingsFragment() {

    companion object {
        const val NOTIFICATION_DOTS_PREFERENCE_KEY: String = "pref_icon_badging"
        const val ICON_SIZE_KEY: String = "pref_icon_bitmap_size"
        const val ICON_LABEL_SIZE_KEY: String = "pref_icon_label_size"
    }

    override fun getPreferenceScreenResId() = R.xml.murine_prefs_icons

    override fun getPreferenceTitle(): Int? = R.string.pref_category_icons_title

    override fun initPreference(preference: Preference, info: DisplayController.Info): Boolean {
        when (preference.key) {
            NOTIFICATION_DOTS_PREFERENCE_KEY -> return BuildConfig.NOTIFICATION_DOTS_ENABLED
            else -> return true
        }
    }
}