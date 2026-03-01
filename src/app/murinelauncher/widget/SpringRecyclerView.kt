package app.murinelauncher.widget

import android.content.Context
import android.graphics.Canvas
import android.util.AttributeSet
import android.widget.EdgeEffect
import androidx.recyclerview.widget.RecyclerView
import app.murinelauncher.ui.StretchEdgeEffect

/**
 * A RecyclerView that applies [StretchEdgeEffect] stretch transformations.
 */
class SpringRecyclerView @JvmOverloads constructor(
    context: Context, attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
) : RecyclerView(context, attrs, defStyleAttr) {
    private val mEdgeEffectTop: StretchEdgeEffect
    private val mEdgeEffectBottom: StretchEdgeEffect

    init {
        mEdgeEffectTop = StretchEdgeEffect(context, { invalidate() }, { postInvalidateOnAnimation() })
        mEdgeEffectBottom = StretchEdgeEffect(context, { invalidate() }, { postInvalidateOnAnimation() })

        setEdgeEffectFactory(object : EdgeEffectFactory() {
            override fun createEdgeEffect(view: RecyclerView, direction: Int): EdgeEffect {
                return when (direction) {
                    DIRECTION_TOP -> mEdgeEffectTop
                    DIRECTION_BOTTOM -> mEdgeEffectBottom
                    else -> StretchEdgeEffect(context, { invalidate() }, { postInvalidateOnAnimation() })
                }
            }
        })
    }

    override fun draw(canvas: Canvas) {
        val needsStretch = !mEdgeEffectTop.isFinished() || !mEdgeEffectBottom.isFinished()
        if (needsStretch) {
            val saveCount = canvas.save()
            var isAnimating = false
            if (!mEdgeEffectTop.isFinished()) {
                mEdgeEffectTop.setSize(getWidth(), getHeight())
                isAnimating = mEdgeEffectTop.applyStretch(canvas, StretchEdgeEffect.POSITION_TOP)
            }
            if (!mEdgeEffectBottom.isFinished()) {
                mEdgeEffectBottom.setSize(getWidth(), getHeight())
                isAnimating = isAnimating or mEdgeEffectBottom.applyStretch(canvas, StretchEdgeEffect.POSITION_BOTTOM)
            }
            super.draw(canvas)
            canvas.restoreToCount(saveCount)
            if (isAnimating) postInvalidateOnAnimation()
        } else {
            super.draw(canvas)
        }
    }
}
