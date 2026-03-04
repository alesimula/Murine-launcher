package app.murinelauncher.settings

import android.os.Bundle
import android.view.View
import androidx.preference.Preference
import app.murinelauncher.widget.IconShapeBottomSheet
import com.android.launcher3.BuildConfig
import com.android.launcher3.LauncherPrefs
import com.android.launcher3.R
import com.android.launcher3.graphics.ThemeManager
import com.android.launcher3.util.DisplayController

public final class SettingsIconsFragment: AbstractSettingsFragment() {

    companion object {
        const val NOTIFICATION_DOTS_PREFERENCE_KEY: String = "pref_icon_badging"
        const val ICON_SIZE_KEY: String = "pref_icon_bitmap_size"
        const val ICON_LABEL_SIZE_KEY: String = "pref_icon_label_size"
        const val ICON_SHAPE_KEY: String = "pref_icon_shape"
    }

    override fun getPreferenceScreenResId() = R.xml.murine_prefs_icons

    override fun getPreferenceTitle(): Int? = R.string.pref_category_icons_title

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        updateIconShapePreference()
    }

    override fun initPreference(preference: Preference, info: DisplayController.Info): Boolean {
        when (preference.key) {
            NOTIFICATION_DOTS_PREFERENCE_KEY -> return BuildConfig.NOTIFICATION_DOTS_ENABLED
            ICON_SHAPE_KEY -> {
                preference.setOnPreferenceClickListener {
                    val sheet = IconShapeBottomSheet()
                    sheet.setOnShapeSelectedListener { _ -> updateIconShapePreference() }
                    sheet.show(childFragmentManager, IconShapeBottomSheet.TAG)
                    true
                }
                return true
            }
            else -> return true
        }
    }

    private fun updateIconShapePreference() {
        val pref = findPreference<Preference>(ICON_SHAPE_KEY) ?: return
        val shape = LauncherPrefs.INSTANCE.get(requireContext()).get(ThemeManager.PREF_ICON_SHAPE)
        pref.summary = requireContext().getString(shape.title)
        pref.icon = IconShapeBottomSheet.getShapePreviewDrawable(requireContext(), shape)
    }
}