package app.murinelauncher.settings

import androidx.preference.Preference
import androidx.preference.TwoStatePreference
import app.murinelauncher.settings.common.AbstractSettingsFragment
import app.murinelauncher.widget.CustomSeekBarPreference
import app.murinelauncher.widget.smartspace.glance.NowPlayingProvider
import com.android.launcher3.LauncherPrefs
import com.android.launcher3.R
import com.android.launcher3.util.DisplayController
import com.android.settingslib.widget.SegmentedButtonPreference

/**
 * Settings of the At a Glance widget, opened from the widget itself.
 */
class SettingsGlanceFragment : AbstractSettingsFragment() {

    companion object {
        const val GOOGLE = "pref_glance_google"
        const val BATTERY = "pref_glance_battery"
        const val TORCH = "pref_glance_torch"
        const val MEDIA = "pref_glance_media"
        const val ALPHA = "pref_glance_alpha"
        const val THEME = "pref_glance_theme"
        /** Theme values, the same order as the UI theme in General: default (the launcher's), light, dark */
        const val THEME_DEFAULT = 0
        const val THEME_LIGHT = 1
    }

    override fun getPreferenceScreenResId() = R.xml.murine_prefs_glance

    override fun getPreferenceTitle(): Int? = R.string.glance_widget_label

    override fun initPreference(preference: Preference, info: DisplayController.Info): Boolean {
        if (preference.key == THEME) (preference as SegmentedButtonPreference).apply {
            // Same buttons as the UI theme in General
            setUpButton(0, getString(R.string.pref_subcategory_day_night), R.drawable.ic_pref_ui_mode_system)
            setUpButton(1, getString(R.string.pref_label_ui_mode_day), R.drawable.ic_pref_ui_mode_day)
            setUpButton(2, getString(R.string.pref_label_ui_mode_night), R.drawable.ic_pref_ui_mode_night)
            for (i in 0..2) setButtonVisibility(i, true)
            setCheckedIndex(LauncherPrefs.GLANCE_THEME.get(context))
            setOnButtonClickListener { _, _, _ -> LauncherPrefs.get(context).put(LauncherPrefs.GLANCE_THEME, getCheckedIndex()) }
        }
        if (preference.key == ALPHA) {
            (preference as CustomSeekBarPreference).setDefaultValue(LauncherPrefs.GLANCE_ALPHA.defaultValue)
        }
        if (preference.key == MEDIA) {
            // Saved on its own, but shown off until notification access is granted: turning it on
            // without access sends the user to notification dots, highlighted
            mediaPref = preference as TwoStatePreference
            preference.setOnPreferenceChangeListener { _, enabled ->
                val context = requireContext()
                LauncherPrefs.get(context).put(LauncherPrefs.GLANCE_MEDIA, enabled as Boolean)
                if (enabled && !NowPlayingProvider.hasNotificationAccess(context)) {
                    startActivity(NowPlayingProvider.notificationDotsSettingsIntent(context))
                    false
                } else {
                    true
                }
            }
        }
        return true
    }

    private var mediaPref: TwoStatePreference? = null

    override fun onResume() {
        super.onResume()
        val context = requireContext()
        val hasAccess = NowPlayingProvider.hasNotificationAccess(context)
        mediaPref?.isChecked = LauncherPrefs.GLANCE_MEDIA.get(context) && hasAccess
        mediaPref?.summary = if (hasAccess) null else getString(R.string.title_missing_notification_access)
    }
}
