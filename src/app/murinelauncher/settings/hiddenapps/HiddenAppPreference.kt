package app.murinelauncher.settings.hiddenapps

import android.content.Context
import android.widget.ImageView
import androidx.preference.Preference
import androidx.preference.PreferenceViewHolder
import com.android.launcher3.R

class HiddenAppPreference(context: Context) : Preference(context) {
    var isAppHidden: Boolean = false; set(value) { if (field != value) { field = value; notifyChanged() } }

    init {
        widgetLayoutResource = R.layout.hidden_app_eye_widget
    }

    override fun onBindViewHolder(holder: PreferenceViewHolder) {
        super.onBindViewHolder(holder)
        (holder.findViewById(R.id.app_visibility_icon) as? ImageView)?.setImageResource(
            if (isAppHidden) R.drawable.ic_eye_hidden else R.drawable.ic_eye_visible
        )
    }
}
