package app.murinelauncher.settings

import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import androidx.preference.Preference
import androidx.preference.TwoStatePreference
import com.android.launcher3.LauncherPrefs
import com.android.launcher3.R
import com.android.launcher3.util.DisplayController
import com.android.settingslib.widget.MainSwitchBar
import com.android.settingslib.widget.MainSwitchPreference
import com.google.android.material.appbar.AppBarLayout
import java.util.ArrayDeque


public final class SettingsQsbFragment: AbstractSettingsFragment() {

    companion object {
        const val SHOW_SEARCH_BAR: String = "qsb_show_search_bar" // Master switch
        const val SHOW_LENS: String = "qsb_enable_lens"
    }

    override fun getPreferenceScreenResId() = R.xml.murine_prefs_qsb

    override fun getPreferenceTitle(): Int? = R.string.pref_category_qsb_title

    val MASTER_DISABLED_PREFS = ArrayDeque<Preference>()


    override fun initPreference(preference: Preference, info: DisplayController.Info): Boolean {
        // Only show master switch when QSB is disabled
        val masterSwitch = LauncherPrefs.QSB_SHOW_SEARCH_BAR.get(requireContext())
        if (!masterSwitch && preference.key != SHOW_SEARCH_BAR) {
            MASTER_DISABLED_PREFS.push(preference)
            return false
        }

        when (preference.key) {
            SHOW_SEARCH_BAR -> {
                (preference as TwoStatePreference).isChecked = masterSwitch
                preference.setOnPreferenceChangeListener { _, newValue ->
                    val isEnabled = newValue as Boolean
                    if (isEnabled) masterSwitchRestorePreferences()
                    else masterSwitchDisablePreferences()
                    true
                }
                return true
            }
            else -> return true
        }
    }

    private fun masterSwitchDisablePreferences() {
        val screen = preferenceScreen
        (screen.preferenceCount - 1 downTo 0).map(screen::getPreference).filter { it.key != SHOW_SEARCH_BAR }
            .forEach { MASTER_DISABLED_PREFS.push(it); screen.removePreference(it) }
    }

    private fun masterSwitchRestorePreferences() {
        val screen = preferenceScreen
        for (pref in generateSequence { MASTER_DISABLED_PREFS.pollFirst() }) screen.addPreference(pref)
    }
}
