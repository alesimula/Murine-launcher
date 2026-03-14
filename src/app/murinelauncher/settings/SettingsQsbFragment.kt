package app.murinelauncher.settings

import androidx.preference.Preference
import androidx.preference.TwoStatePreference
import app.murinelauncher.settings.common.AbstractSettingsFragment
import app.murinelauncher.widget.radio.RadioGroupPreference
import app.murinelauncher.widget.search.SearchProvider
import com.android.launcher3.LauncherPrefs
import com.android.launcher3.R
import com.android.launcher3.util.DisplayController
import java.util.ArrayDeque


public final class SettingsQsbFragment: AbstractSettingsFragment() {

    companion object {
        const val SHOW_SEARCH_BAR: String = "qsb_show_search_bar" // Master switch
        const val SHOW_LENS: String = "qsb_enable_lens"
        const val SEARCH_PROVIDER: String = "qsb_search_provider"
    }

    override fun getPreferenceScreenResId() = R.xml.murine_prefs_qsb

    override fun getPreferenceTitle(): Int? = R.string.pref_category_qsb_title

    override fun getStickyKeys(): Set<String> = setOf(SHOW_SEARCH_BAR)

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
            SEARCH_PROVIDER -> {
                preference as RadioGroupPreference
                preference.asEnum(SearchProvider::class.java).apply {
                    setTextProvider { _, provider -> provider.displayName }
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
