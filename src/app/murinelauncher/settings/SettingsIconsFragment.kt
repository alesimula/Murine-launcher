package app.murinelauncher.settings

import androidx.preference.Preference
import app.murinelauncher.graphics.IconShapeDrawables
import app.murinelauncher.settings.common.AbstractSettingsFragment
import app.murinelauncher.settings.prefs.AdaptiveIcons
import app.murinelauncher.util.isResourceHackSupported
import app.murinelauncher.settings.prefs.LabelVisibility
import app.murinelauncher.widget.radio.RadioGroupPreference
import com.android.launcher3.BuildConfig
import com.android.launcher3.LauncherAppState
import com.android.launcher3.LauncherPrefs
import com.android.launcher3.R
import com.android.launcher3.graphics.ThemeManager
import com.android.launcher3.Utilities
import com.android.launcher3.shapes.ShapesProvider
import com.android.launcher3.util.DisplayController

public final class SettingsIconsFragment: AbstractSettingsFragment() {

    companion object {
        const val NOTIFICATION_DOTS_PREFERENCE_KEY: String = "pref_icon_badging"
        const val ICON_SIZE_KEY: String = "pref_icon_bitmap_size"
        const val ICON_LABEL_SIZE_KEY: String = "pref_icon_label_size"
        const val ICON_SHAPE_KEY: String = "pref_icon_shape"
        const val NOTIFICATION_BADGE_COUNT_KEY: String = "pref_notification_badge_count"
        const val LABEL_VISIBILITY_KEY: String = "pref_label_visibility_mode"
        const val ADAPTIVE_ICONS_KEY: String = "pref_adaptive_icons"
    }

    override fun getPreferenceScreenResId() = R.xml.murine_prefs_icons

    override fun getPreferenceTitle(): Int? = R.string.pref_category_icons_title

    override fun initPreference(preference: Preference, info: DisplayController.Info): Boolean {
        when (preference.key) {
            NOTIFICATION_DOTS_PREFERENCE_KEY -> return BuildConfig.NOTIFICATION_DOTS_ENABLED
            ICON_SHAPE_KEY -> {
                preference as RadioGroupPreference
                preference.asEnum(ShapesProvider.IconShape::class.java).apply {
                    setDefaultValue(ThemeManager.PREF_ICON_SHAPE.defaultValue)
                    setTextProvider { ctx, shape -> ctx.getString(shape.title) }
                    setIconProvider { ctx, shape -> IconShapeDrawables.getShapePreviewDrawable(ctx, shape) }
                }
                return true
            }
            LABEL_VISIBILITY_KEY -> {
                preference as RadioGroupPreference
                preference.asEnum(LabelVisibility::class.java).apply {
                    setDefaultValue(LauncherPrefs.LABEL_VISIBILITY.defaultValue)
                    setTextProvider { ctx, mode -> ctx.getString(mode.title) }
                }
                return true
            }
            ADAPTIVE_ICONS_KEY -> {
                preference as RadioGroupPreference
                preference.asEnum(AdaptiveIcons::class.java).apply {
                    setDefaultValue(LauncherPrefs.ADAPTIVE_ICONS.defaultValue)
                    setTextProvider { ctx, mode -> ctx.getString(mode.title) }
                    // Greyed out when a platform update moved AssetManager.setConfiguration again
                    setEnabledProvider { _, mode ->
                        mode != AdaptiveIcons.FORCE_LEGACY || isResourceHackSupported()
                    }
                    setOnPreferenceChangeListener { _ ->
                        context?.let { LauncherAppState.getInstance(it).model.forceReload() }
                        true
                    }
                }
                return true
            }
            ThemeManager.KEY_THEMED_ICONS -> {
                preference.setOnPreferenceChangeListener { _, _ ->
                    context?.let { LauncherAppState.getInstance(it).model.forceReload() }
                    true
                }
                return Utilities.ATLEAST_T
            }
            else -> return true
        }
    }
}