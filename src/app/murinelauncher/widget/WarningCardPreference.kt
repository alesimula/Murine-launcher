package app.murinelauncher.widget

import android.content.Context
import android.content.res.ColorStateList
import android.graphics.drawable.GradientDrawable
import android.text.Html
import android.util.AttributeSet
import android.widget.ImageView
import android.widget.TextView
import androidx.core.text.method.LinkMovementMethodCompat
import androidx.core.widget.ImageViewCompat
import androidx.preference.Preference
import androidx.preference.PreferenceViewHolder
import com.android.launcher3.R
import com.android.settingslib.widget.GroupSectionDividerMixin
import com.android.settingslib.widget.NormalPaddingMixin

class WarningCardPreference @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0,
    defStyleRes: Int = 0
) : Preference(context, attrs, defStyleAttr, defStyleRes),
    GroupSectionDividerMixin,
    NormalPaddingMixin {

    private val cardIconRes: Int
    private val cardText: CharSequence?
    private val formathtml: Boolean
    private val cardBackgroundColor: Int
    private val cardContentColor: Int

    init {
        layoutResource = R.layout.pref_warning_card
        isSelectable = false

        val a = context.obtainStyledAttributes(attrs, R.styleable.WarningCardPreference)
        cardIconRes = a.getResourceId(R.styleable.WarningCardPreference_cardIcon, 0)
        cardText = a.getText(R.styleable.WarningCardPreference_cardText)
        formathtml = a.getBoolean(R.styleable.WarningCardPreference_formatHtml, false)
        cardBackgroundColor = a.getColor(R.styleable.WarningCardPreference_cardBackgroundColor, 0)
        cardContentColor = a.getColor(
            R.styleable.WarningCardPreference_cardContentColor,
            context.getColor(com.android.settingslib.widget.theme.R.color.settingslib_materialColorOnSurface))
        a.recycle()
    }

    override fun onBindViewHolder(holder: PreferenceViewHolder) {
        super.onBindViewHolder(holder)

        val container = holder.findViewById(R.id.warning_card_container)
        if (container != null && cardBackgroundColor != 0) {
            val cornerRadius = context.resources.getDimension(
                com.android.settingslib.widget.theme.R.dimen.settingslib_expressive_radius_extralarge1)
            container.background = GradientDrawable().apply {
                shape = GradientDrawable.RECTANGLE
                setColor(cardBackgroundColor)
                this.cornerRadius = cornerRadius
            }
        }

        val icon = holder.findViewById(R.id.warning_icon) as? ImageView
        if (icon != null) {
            if (cardIconRes != 0) icon.setImageResource(cardIconRes)
            ImageViewCompat.setImageTintList(icon, ColorStateList.valueOf(cardContentColor))
        }

        val text = holder.findViewById(R.id.warning_text) as? TextView
        if (text != null) {
            if (cardText != null) text.text = if (formathtml)
                Html.fromHtml(cardText.toString(), Html.FROM_HTML_MODE_LEGACY) else cardText
            text.setTextColor(cardContentColor)
            text.movementMethod = LinkMovementMethodCompat.getInstance()
        }
    }
}