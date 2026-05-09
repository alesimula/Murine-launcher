package app.murinelauncher.settings

import android.content.Intent
import android.content.pm.PackageManager
import android.provider.Settings
import androidx.preference.Preference
import app.murinelauncher.settings.common.AbstractSettingsFragment
import com.android.launcher3.R
import com.android.launcher3.util.DisplayController


public final class SettingsMiscFragment: AbstractSettingsFragment() {

    companion object {
        const val PREF_DEFAULT_LAUNCHER: String = "pref_default_launcher"
    }

    override fun getPreferenceScreenResId() = R.xml.murine_prefs_misc

    override fun getPreferenceTitle(): Int? = R.string.pref_category_misc_title


    override fun initPreference(preference: Preference, info: DisplayController.Info): Boolean {
        val context = requireContext()
        when (preference.key) {
            PREF_DEFAULT_LAUNCHER -> {
                val pm = context.packageManager
                val homeIntent = Intent(Intent.ACTION_MAIN).addCategory(Intent.CATEGORY_HOME)
                val resolveInfo = pm.resolveActivity(homeIntent, PackageManager.MATCH_DEFAULT_ONLY)
                preference.summary = if (resolveInfo == null || resolveInfo.activityInfo.packageName == "android") "???" else
                    resolveInfo.loadLabel(pm).toString()
                preference.setOnPreferenceClickListener {
                    context.startActivity(Intent(Settings.ACTION_HOME_SETTINGS))
                    true
                }
                return true
            }
            else -> return true
        }
    }
}
