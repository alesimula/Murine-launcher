package com.android.launcher3.views;

import android.content.Context
import android.graphics.Canvas
import android.util.AttributeSet
import android.widget.EdgeEffect
import android.widget.RelativeLayout
import androidx.recyclerview.widget.RecyclerView
import app.murinelauncher.ui.StretchEdgeEffect

@Suppress("LeakingThis")
open class SpringRelativeLayout @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0,
) : RelativeLayout(context, attrs, defStyleAttr) {
    protected val edgeEffectTop = StretchEdgeEffect(context, { invalidate() }, { postInvalidateOnAnimation() })
    protected val edgeEffectBottom = StretchEdgeEffect(context, { invalidate() }, { postInvalidateOnAnimation() })

    init {
        setWillNotDraw(false)
    }

    /**
     * Applies the stretch transformations to the provided canvas individually.
     * Returns true if either animation is still in progress.
     */
    fun applyToCanvas(canvas: Canvas): Boolean {
        var isAnimating = false
        if (!edgeEffectTop.isFinished) {
            edgeEffectTop.setSize(width, height)
            isAnimating = edgeEffectTop.applyStretch(canvas, StretchEdgeEffect.POSITION_TOP)
        }
        if (!edgeEffectBottom.isFinished) {
            edgeEffectBottom.setSize(width, height)
            isAnimating = edgeEffectBottom.applyStretch(canvas, StretchEdgeEffect.POSITION_BOTTOM)
        }
        return isAnimating
    }

    override fun draw(canvas: Canvas) {
        val needsStretch = !edgeEffectTop.isFinished || !edgeEffectBottom.isFinished
        if (needsStretch) {
            val saveCount = canvas.save()
            val isAnimating = applyToCanvas(canvas)
            super.draw(canvas)
            canvas.restoreToCount(saveCount)
            if (isAnimating) postInvalidateOnAnimation()
        } else {
            super.draw(canvas)
        }
    }

    fun absorbSwipeUpVelocity(velocity: Int) {
        edgeEffectBottom.onAbsorb(velocity)
    }

    protected fun absorbPullDeltaDistance(deltaDistance: Float, displacement: Float) {
        edgeEffectBottom.onPull(deltaDistance, displacement)
    }

    /** Returns the current top edge effect distance, or 0 if not stretching.  */
    fun getTopEdgeEffectDistance(): Float {
        return edgeEffectTop.getDistance()
    }

    /** Returns the current bottom edge effect distance, or 0 if not stretching.  */
    fun getBottomEdgeEffectDistance(): Float {
        return edgeEffectBottom.getDistance()
    }

    fun onRelease() {
        edgeEffectBottom.onRelease()
    }

    fun createEdgeEffectFactory(): RecyclerView.EdgeEffectFactory {
        return object : RecyclerView.EdgeEffectFactory() {
            override fun createEdgeEffect(view: RecyclerView, direction: Int): EdgeEffect {
                return when (direction) {
                    DIRECTION_TOP -> edgeEffectTop
                    DIRECTION_BOTTOM -> edgeEffectBottom
                    else -> super.createEdgeEffect(view, direction)
                }
            }
        }
    }
}