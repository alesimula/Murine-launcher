package app.murinelauncher.widget.smartspace

import android.content.Context
import android.text.SpannableString
import android.text.Spanned
import android.text.style.ForegroundColorSpan
import android.util.AttributeSet
import android.widget.TextClock

/**
 * A [TextClock] that paints only its first character in an accent color (e.g. the "2" of
 * "22") and the rest in the normal text color. Set the accent with [setAccent]; 0 = no accent.
 */
class FirstCharAccentTextClock @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null
) : TextClock(context, attrs) {

    private var accent: Int = 0

    fun setAccent(color: Int) {
        accent = color
        val current = text
        if (!current.isNullOrEmpty()) setText(current.toString())
    }

    override fun setText(text: CharSequence?, type: BufferType?) {
        if (accent == 0 || text.isNullOrEmpty()) {
            super.setText(text, type)
            return
        }
        val styled = SpannableString(text.toString())
        styled.setSpan(ForegroundColorSpan(accent), 0, 1, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)
        super.setText(styled, BufferType.SPANNABLE)
    }
}
