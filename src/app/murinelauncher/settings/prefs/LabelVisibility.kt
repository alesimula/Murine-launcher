package app.murinelauncher.settings.prefs

import androidx.annotation.StringRes
import com.android.launcher3.R

/**
 * Controls icon labels on the workspace and inside workspace folders.
 */
enum class LabelVisibility(@StringRes val title: Int) {
    /** Hide all labels, both in workspace and app drawer */
    NEVER_FULL(R.string.label_visibility_never),
    /** Hide all labels on workspace (keep them on drawer) */
    NEVER(R.string.label_visibility_drawer_only), // kept enum name for backwards-compatibility
    /** Stock AOSP behaviour: show labels if they fit */
    AUTO(R.string.label_visibility_auto),
    /** Bypasses vertical bar layout space check and always shows labels. May clip when tight */
    ALWAYS(R.string.label_visibility_always),
}