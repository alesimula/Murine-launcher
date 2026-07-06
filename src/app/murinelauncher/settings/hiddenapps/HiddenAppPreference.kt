package app.murinelauncher.settings.hiddenapps

import android.content.Context
import android.view.View
import android.widget.ImageView
import androidx.preference.Preference
import androidx.preference.PreferenceViewHolder
import com.android.launcher3.R

class HiddenAppPreference(context: Context) : Preference(context) {
    var isAppHidden: Boolean = false; set(value) { if (field != value) { field = value; notifyChanged() } }
    var isAppLocked: Boolean = false; set(value) { if (field != value) { field = value; notifyChanged() } }
    /** Set only when the native App Lock feature is available; see [AppLock.isAvailable]. */
    var onLockClick: (() -> Unit)? = null

    init {
        widgetLayoutResource = R.layout.hidden_app_eye_widget
    }

    override fun onBindViewHolder(holder: PreferenceViewHolder) {
        super.onBindViewHolder(holder)
        (holder.findViewById(R.id.app_visibility_icon) as? ImageView)?.setImageResource(
            if (isAppHidden) R.drawable.ic_eye_hidden else R.drawable.ic_eye_visible
        )
        (holder.findViewById(R.id.app_lock_icon) as? ImageView)?.apply {
            visibility = if (onLockClick != null) View.VISIBLE else View.GONE
            setImageResource(
                if (isAppLocked) R.drawable.ic_app_lock_locked else R.drawable.ic_app_lock_unlocked
            )
            setOnClickListener { onLockClick?.invoke() }
        }
    }
}
