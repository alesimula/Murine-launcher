package app.murinelauncher.settings.prefs

import androidx.annotation.StringRes
import com.android.launcher3.R

/**
 * Controls whether legacy (non-adaptive) app icons are wrapped into an AdaptiveIconDrawable.
 *
 * TODO [should change?] icon pack icons are never affected: they either bake in their own shape (BaseIconFactory.CONFIG_HINT_NO_WRAP) or are already adaptive.
 */
enum class AdaptiveIcons(@StringRes val title: Int) {
    /** Wrap every legacy icon (stock behaviour) */
    ALWAYS(R.string.label_visibility_always),
    /** Leave system app icons alone, wrap everything else */
    EXCEPT_SYSTEM(R.string.pref_adaptive_icons_except_system),
    /** Never wrap; legacy icons keep their original size and cannot be reshaped */
    NEVER(R.string.label_visibility_never),
}
