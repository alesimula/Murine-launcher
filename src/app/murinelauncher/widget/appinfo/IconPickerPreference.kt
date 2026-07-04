package app.murinelauncher.widget.appinfo

import android.content.Context
import android.util.AttributeSet
import android.view.View
import androidx.preference.Preference
import androidx.preference.PreferenceViewHolder
import com.android.launcher3.R

/**
 * [Preference] with an optional action button in the widget area (end of the card);
 * Used by the app info sheet's icon pack entry to open the per-app custom icon picker.
 */
class IconPickerPreference @JvmOverloads constructor(context: Context, attrs: AttributeSet? = null) : Preference(context, attrs) {

    /** Invoked when the widget button is tapped. */
    var onPickIconClick: (() -> Unit)? = null

    /** Shows the widget button only when a real pack overrides this app's icon. */
    var pickButtonVisible: Boolean = false
        set(value) {
            if (field != value) {
                field = value
                notifyChanged()
            }
        }

    init {
        widgetLayoutResource = R.layout.pref_widget_icon_picker
    }

    override fun onBindViewHolder(holder: PreferenceViewHolder) {
        super.onBindViewHolder(holder)
        holder.findViewById(R.id.icon_picker_button)?.apply {
            visibility = if (pickButtonVisible) View.VISIBLE else View.GONE
            setOnClickListener { onPickIconClick?.invoke() }
        }
    }
}
