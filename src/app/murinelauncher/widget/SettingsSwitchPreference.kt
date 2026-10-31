package app.murinelauncher.widget

import android.content.Context
import android.content.res.ColorStateList
import android.graphics.drawable.RippleDrawable
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.View
import android.view.Gravity
import android.widget.LinearLayout
import android.widget.TextView
import androidx.core.graphics.ColorUtils
import androidx.preference.PreferenceViewHolder
import androidx.preference.SwitchPreferenceCompat
import com.android.launcher3.R

/** A switch with a settings button before it: the gear and divider of SettingsLib's SelectorWithWidgetPreference. */
class SettingsSwitchPreference(context: Context, attrs: AttributeSet?) : SwitchPreferenceCompat(context, attrs) {

    var onSettingsClick: View.OnClickListener? = null

    override fun onBindViewHolder(holder: PreferenceViewHolder) {
        super.onBindViewHolder(holder)
        val frame = holder.findViewById(android.R.id.widget_frame) as? LinearLayout ?: return
        // Stacked vertically in some SettingsLib layouts: side by side here (this view type is only ours)
        frame.orientation = LinearLayout.HORIZONTAL
        frame.gravity = Gravity.CENTER_VERTICAL
        val button = frame.findViewById(R.id.pref_settings_button)
            ?: LayoutInflater.from(context).inflate(R.layout.murine_pref_widget_settings, frame, false)
                .also { frame.addView(it, 0) }.findViewById<View>(R.id.pref_settings_button).apply {
                    // The settings theme's highlight is plain white below Android 12: the app info sheet's 10% of the text color instead
                    val text = (holder.findViewById(android.R.id.title) as TextView).currentTextColor
                    (background.mutate() as RippleDrawable).setColor(ColorStateList.valueOf(ColorUtils.setAlphaComponent(text, 0x19)))
                }
        button.setOnClickListener(onSettingsClick)
    }
}
