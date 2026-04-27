package app.murinelauncher.settings

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.preference.Preference
import androidx.preference.SwitchPreferenceCompat
import app.murinelauncher.icons.IconPackManager
import app.murinelauncher.icons.IconPackManager.SYSTEM_ICON_PACK_INFO
import app.murinelauncher.settings.common.AbstractSettingsFragment
import app.murinelauncher.widget.radio.RadioGroupPreference
import com.android.launcher3.LauncherAppState
import com.android.launcher3.R
import com.android.launcher3.util.DisplayController

class SettingsIconPackFragment : AbstractSettingsFragment() {

    companion object {
        const val KEY_ICON_PACK = IconPackManager.PREF_ICON_PACK
        const val KEY_SYSTEM_ONLY = IconPackManager.PREF_ICON_PACK_SYSTEM_ONLY
        const val KEY_IGNORE_SHAPE = IconPackManager.PREF_ICON_PACK_IGNORE_SHAPE
        const val KEY_THEMED_ONLY = IconPackManager.PREF_ICON_PACK_THEMED_ONLY
        const val KEY_READAPT_FRAME = IconPackManager.PREF_ICON_READAPT_FRAME
        const val KEY_CLEAR_CUSTOM_ICONS = "pref_clear_custom_icons"
    }

    override fun getPreferenceScreenResId() = R.xml.murine_prefs_icon_pack

    override fun getPreferenceTitle(): Int = R.string.pref_category_icon_pack_title

    override fun initPreference(preference: Preference, info: DisplayController.Info): Boolean {
        when (preference.key) {
            KEY_ICON_PACK -> {
                preference as RadioGroupPreference
                IconPackManager.configureIconPackPreference(preference).apply {
                    setDefaultValue(SYSTEM_ICON_PACK_INFO)
                    setOnSelected { pack ->
                        IconPackManager.clearMainCache()
                        reloadLauncher()
                    }
                    setSummaryProvider { _, pack ->
                        if (pack.packageName == IconPackManager.SYSTEM_ICON_PACK) null
                        else pack.label
                    }
                }
                return true
            }
            KEY_SYSTEM_ONLY, KEY_IGNORE_SHAPE, KEY_THEMED_ONLY, KEY_READAPT_FRAME -> {
                preference as SwitchPreferenceCompat
                preference.setOnPreferenceChangeListener { _, _ ->
                    Handler(Looper.getMainLooper()).post {
                        IconPackManager.clearMainCache()
                        reloadLauncher()
                    }
                    true
                }
                return true
            }
            KEY_CLEAR_CUSTOM_ICONS -> {
                updateClearCustomIconsPref(preference)
                preference.setOnPreferenceClickListener {
                    AlertDialog.Builder(requireContext())
                        .setTitle(R.string.pref_clear_custom_icons_confirm_title)
                        .setMessage(R.string.pref_clear_custom_icons_confirm_message)
                        .setPositiveButton(android.R.string.ok) { _, _ ->
                            val ctx = requireContext()
                            val packages = IconPackManager.getOverriddenPackageNames(ctx)
                            IconPackManager.clearAllComponentOverrides(ctx)
                            IconPackManager.clearCaches()
                            // Refresh each affected package immediately
                            val appState = LauncherAppState.getInstance(ctx)
                            packages.forEach { pkg ->
                                appState.model.onAppIconChanged(pkg, android.os.Process.myUserHandle())
                            }
                            updateClearCustomIconsPref(preference)
                            Toast.makeText(requireContext(), R.string.pref_clear_custom_icons_toast, Toast.LENGTH_SHORT).show()
                        }
                        .setNegativeButton(android.R.string.cancel, null)
                        .show()
                    true
                }
                return true
            }
            else -> return true
        }
    }

    private fun updateClearCustomIconsPref(preference: Preference) {
        val ctx = context ?: return
        val hasOverrides = IconPackManager.hasAnyComponentOverrides(ctx)
        preference.isEnabled = hasOverrides
        preference.summary = if (hasOverrides) getString(R.string.pref_clear_custom_icons_summary) else
            getString(R.string.pref_clear_custom_icons_summary_none)
    }

    private fun reloadLauncher() {
        val ctx = context ?: return
        LauncherAppState.getInstance(ctx).model.forceReload()
    }
}
