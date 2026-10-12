package app.murinelauncher.settings.common

import android.animation.Animator
import android.animation.AnimatorListenerAdapter
import android.animation.AnimatorSet
import android.animation.ValueAnimator
import android.graphics.drawable.LayerDrawable
import androidx.core.content.ContextCompat
import androidx.preference.PreferenceGroup
import androidx.preference.PreferenceViewHolder
import androidx.recyclerview.widget.RecyclerView
import com.android.settingslib.widget.SettingsPreferenceGroupAdapter

/**
 * SettingsLib's card adapter, plus the flash Android Settings uses to point at a setting
 */
class HighlightablePreferenceAdapter(group: PreferenceGroup) : SettingsPreferenceGroupAdapter(group) {

    private var highlightPosition = RecyclerView.NO_POSITION

    /** Scrolls [list] to the preference with [key] and flashes it; false if it isn't on this screen. */
    fun highlight(list: RecyclerView, key: String): Boolean {
        val position = getPreferenceAdapterPosition(key)
        if (position < 0) return false
        list.itemAnimator = null // as in Settings: a change animation would fade the rebound card
        highlightPosition = position
        list.smoothScrollToPosition(position)
        notifyItemChanged(position) // flashes when bound, i.e. once it scrolls into view
        return true
    }

    override fun onBindViewHolder(holder: PreferenceViewHolder, position: Int) {
        super.onBindViewHolder(holder, position)
        if (position != highlightPosition) return
        highlightPosition = RecyclerView.NO_POSITION
        val view = holder.itemView
        val res = getRoundCornerDrawableRes(position, isSelected = false, isHighlighted = true)
        val flash = (if (res != 0) ContextCompat.getDrawable(view.context, res) else null) ?: return
        val card = view.background?.mutate() // its alpha changes below, and drawable state is shared otherwise
        flash.alpha = 0
        // Stacked, not nested: by default each layer is inset by the padding of the ones below, and the card
        // drawables carry padding for the row's content, which would shrink the flash inside the card
        view.background = LayerDrawable(listOfNotNull(card, flash).toTypedArray())
            .apply { paddingMode = LayerDrawable.PADDING_MODE_STACK }
        holder.setIsRecyclable(false) // the card keeps its flash layer until it's put back below
        val fade = { from: Int, to: Int -> ValueAnimator.ofInt(from, to).apply {
            addUpdateListener {
                val alpha = it.animatedValue as Int
                flash.alpha = alpha
                card?.alpha = 255 - alpha
            }
        } }
        AnimatorSet().apply {
            // Same timing as PreferenceHighlighter: three pulses, held a while, then a slow fade out
            playSequentially(
                fade(0, 255).apply { duration = 200; repeatMode = ValueAnimator.REVERSE; repeatCount = 4 },
                fade(255, 0).apply { duration = 500; startDelay = 15_000 })
            addListener(object : AnimatorListenerAdapter() {
                override fun onAnimationEnd(animation: Animator) {
                    card?.alpha = 255
                    view.background = card
                    holder.setIsRecyclable(true)
                }
            })
            start()
        }
    }
}
