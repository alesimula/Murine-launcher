package app.murinelauncher.settings

import androidx.appcompat.content.res.AppCompatResources
import androidx.preference.Preference
import androidx.preference.PreferenceGroup
import androidx.preference.PreferenceScreen
import androidx.preference.TwoStatePreference
import app.murinelauncher.graphics.WorkspaceBlurUtils
import app.murinelauncher.settings.common.AbstractSettingsFragment
import app.murinelauncher.widget.CustomSeekBarPreference
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
        const val SEARCH_BUBBLE_BLUR: String = "qsb_box_blur"
        const val SEARCH_BAR_ALPHA: String = "qsb_bar_alpha"
        const val SEARCH_BUBBLE_ALPHA: String = "qsb_box_alpha"
    }

    override fun getPreferenceScreenResId() = R.xml.murine_prefs_qsb

    override fun getPreferenceTitle(): Int? = R.string.pref_category_qsb_title

    override fun getStickyKeys(): Set<String> = setOf(SHOW_SEARCH_BAR)

    val MASTER_DISABLED_PREFS = ArrayDeque<Preference>()

    var searchBubbleAlpha: CustomSeekBarPreference? = null

    fun initPreferenceImpl(preference: Preference, info: DisplayController.Info, masterSwitch: Boolean): Boolean {
        // The master switch switches off QSB and the rest of the preferences in this page
        val masterSwitch = LauncherPrefs.QSB_SHOW_SEARCH_BAR.get(requireContext())
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
                    setDefaultValue(LauncherPrefs.QSB_SEARCH_PROVIDER.defaultValue)
                    setTextProvider { _, provider -> provider.displayName }
                    setIconProvider { ctx, provider -> AppCompatResources.getDrawable(ctx, provider.iconRes) }
                }
                return true
            }
            SEARCH_BUBBLE_BLUR -> {
                preference as TwoStatePreference
                preference.setDefaultValue(LauncherPrefs.QSB_BUBBLE_BLUR.defaultValue)
                preference.isVisible = WorkspaceBlurUtils.isBlurSupportedSDK
                preference.setOnPreferenceChangeListener {
                    _, newValue ->
                    searchBubbleAlpha?.isEnabled = !(newValue as Boolean)
                    true
                }
                return true
            }
            SEARCH_BAR_ALPHA -> {
                preference as CustomSeekBarPreference
                preference.setDefaultValue(LauncherPrefs.QSB_ALPHA.defaultValue)
                return true
            }
            SEARCH_BUBBLE_ALPHA -> {
                searchBubbleAlpha = preference as CustomSeekBarPreference
                preference.setDefaultValue(LauncherPrefs.QSB_BUBBLE_ALPHA.defaultValue)
                preference.isEnabled = !LauncherPrefs.QSB_BUBBLE_BLUR.get(requireContext())
                return true
            }
            else -> return true
        }
    }

    override fun initAnonymousPreference(preference: Preference, info: DisplayController.Info): Boolean {
        // Only show master switch when QSB is disabled
        val masterSwitch = LauncherPrefs.QSB_SHOW_SEARCH_BAR.get(requireContext())
        if (!masterSwitch && preference.key != SHOW_SEARCH_BAR && preference.parent is PreferenceScreen) {
            MASTER_DISABLED_PREFS.push(preference)
            return false
        }
        return true
    }

    override fun initPreference(preference: Preference, info: DisplayController.Info): Boolean {
        // Only show master switch when QSB is disabled
        val masterSwitch = LauncherPrefs.QSB_SHOW_SEARCH_BAR.get(requireContext())
        val initPref = initPreferenceImpl(preference, info, masterSwitch);
        if (initPref && !masterSwitch && preference.key != SHOW_SEARCH_BAR && preference.parent is PreferenceScreen) {
            MASTER_DISABLED_PREFS.push(preference)
            return false
        }
        return initPref
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
