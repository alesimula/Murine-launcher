package app.murinelauncher.settings

import androidx.preference.Preference
import app.murinelauncher.settings.common.AbstractSettingsFragment
import com.android.launcher3.LauncherPrefs
import com.android.launcher3.R
import com.android.launcher3.util.DisplayController
import com.android.settingslib.widget.SegmentedButtonPreference

/** Settings of the Clock widget, opened from the widget itself. */
class SettingsClockFragment : AbstractSettingsFragment() {

    companion object {
        /** 0: start (default), 1: center, 2: end */
        const val ALIGNMENT = "pref_clock_alignment"
        const val OPEN_APP = "pref_clock_open_app"
    }

    override fun getPreferenceScreenResId() = R.xml.murine_prefs_clock

    override fun getPreferenceTitle(): Int? = R.string.smartspace_mode_clock

    override fun initPreference(preference: Preference, info: DisplayController.Info): Boolean {
        if (preference.key == ALIGNMENT) (preference as SegmentedButtonPreference).apply {
            setUpButton(0, "", R.drawable.ic_pref_align_start)
            setUpButton(1, "", R.drawable.ic_pref_align_center)
            setUpButton(2, "", R.drawable.ic_pref_align_end)
            for (i in 0..2) setButtonVisibility(i, true)
            setCheckedIndex(LauncherPrefs.CLOCK_ALIGNMENT.get(context))
            setOnButtonClickListener { _, _, _ -> LauncherPrefs.get(context).put(LauncherPrefs.CLOCK_ALIGNMENT, getCheckedIndex()) }
        }
        return true
    }
}
