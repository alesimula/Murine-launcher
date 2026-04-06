package app.murinelauncher.settings

import android.os.Handler
import android.os.Looper
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
    }

    override fun getPreferenceScreenResId() = R.xml.murine_prefs_icon_pack

    override fun getPreferenceTitle(): Int = R.string.pref_category_icon_pack_title

    override fun initPreference(preference: Preference, info: DisplayController.Info): Boolean {
        when (preference.key) {
            KEY_ICON_PACK -> {
                val ctx = requireContext()
                val packs = IconPackManager.getInstalledPacks(ctx)

                preference as RadioGroupPreference
                preference.setTintSheetIcons(false)
                preference.asList(packs) { it.packageName }.apply {
                    setTextProvider { _, pack -> pack.label }
                    setIconProvider { c, pack -> IconPackManager.getPackIcon(c, pack.packageName) }
                    setDefaultValue(SYSTEM_ICON_PACK_INFO)
                    setOnSelected { pack ->
                        IconPackManager.clearCache()
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
                        IconPackManager.clearCache()
                        reloadLauncher()
                    }
                    true
                }
                return true
            }
            else -> return true
        }
    }

    private fun reloadLauncher() {
        val ctx = context ?: return
        LauncherAppState.getInstance(ctx).model.forceReload()
    }
}
