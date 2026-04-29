package app.murinelauncher.widget.appinfo

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.preference.SwitchPreferenceCompat
import app.murinelauncher.widget.radio.RadioGroupBottomSheet
import app.murinelauncher.widget.radio.RadioGroupBottomSheet.RadioPreferenceFragment
import com.android.launcher3.R

/**
 * Subclass of [RadioGroupBottomSheet] that injects a "Show all packs" toggle;
 * When the toggle is OFF (default), the [isVisibleProvider] set via [configure] filters the list;
 * When ON, all entries are shown regardless of the provider.
 */
class FilterableIconPackSheet : RadioGroupBottomSheet() {
    var showAll = false

    override fun getTheme(): Int =
        com.android.settingslib.widget.theme.R.style.Theme_SettingsLib_BottomSheetDialog

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        childFragmentManager.registerFragmentLifecycleCallbacks(
            object : FragmentManager.FragmentLifecycleCallbacks() {
                override fun onFragmentCreated(fm: FragmentManager, f: Fragment, savedInstanceState: Bundle?) {
                    if (f !is RadioPreferenceFragment) return
                    injectShowAllSwitch(f)
                }
            }, false
        )
        super.onViewCreated(view, savedInstanceState)
    }

    private fun injectShowAllSwitch(fragment: RadioPreferenceFragment) {
        val screen = fragment.preferenceScreen ?: return
        val switchPref = SwitchPreferenceCompat(fragment.preferenceManager.context).apply {
            key = "show_all_packs"
            title = getString(R.string.app_info_icon_pack_show_all)
            isPersistent = false
            isChecked = showAll
            order = -1
            setOnPreferenceChangeListener { _, newValue ->
                showAll = newValue as Boolean
                childFragmentManager.beginTransaction()
                    .replace(R.id.prefs_container, RadioPreferenceFragment())
                    .commitAllowingStateLoss()
                true
            }
        }
        screen.addPreference(switchPref)
    }
}
