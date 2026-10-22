/*
 * Copyright 2026 r4l.launcher contributors
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may obtain a copy at https://www.apache.org/licenses/LICENSE-2.0
 * Distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND.
 */
package app.murinelauncher.drawer

import android.animation.Animator
import android.animation.AnimatorListenerAdapter
import android.animation.ValueAnimator
import android.content.Context
import android.graphics.Canvas
import android.graphics.Paint
import android.graphics.Path
import android.graphics.RectF
import android.view.Gravity
import android.view.View
import android.widget.ImageView
import android.widget.LinearLayout
import androidx.core.graphics.ColorUtils
import com.android.launcher3.R
import com.google.android.material.color.MaterialColors
import com.google.android.material.textview.MaterialTextView
import com.google.android.material.R as MaterialR

/**
 * Top strip shown while an app is dragged in the categorized drawer. Holding over it fills the
 * strip; once full, the drag continues on the home screen. Context must be M3 themed.
 */
class DrawerHomeZone(context: Context) : LinearLayout(context) {
    private val fillPaint = Paint(Paint.ANTI_ALIAS_FLAG)
    private val clip = Path()
    private val bounds = RectF()
    private var progress = 0f
    private var fill: ValueAnimator? = null

    init {
        id = R.id.drawer_drag_home_zone
        orientation = HORIZONTAL
        gravity = Gravity.CENTER
        visibility = GONE
        alpha = 0f
        setWillNotDraw(false)
        background = DrawerCategoryTheme.surface(context)
        val onSurface = MaterialColors.getColor(context, MaterialR.attr.colorOnSurface, javaClass.name)
        fillPaint.color = ColorUtils.setAlphaComponent(
            MaterialColors.getColor(context, androidx.appcompat.R.attr.colorPrimary, javaClass.name), 0x66)
        addView(ImageView(context).apply {
            setImageResource(R.drawable.ic_drawer_drag_home)
            setColorFilter(onSurface)
            importantForAccessibility = IMPORTANT_FOR_ACCESSIBILITY_NO
        }, LayoutParams(dp(24), dp(24)).apply { marginEnd = dp(12) })
        addView(MaterialTextView(context).apply {
            setTextAppearance(MaterialR.style.TextAppearance_Material3_LabelLarge)
            setTextColor(onSurface)
            setText(R.string.drawer_drag_home)
        })
    }

    fun show() {
        cancelFill()
        background = DrawerCategoryTheme.surface(context)
        visibility = VISIBLE
        translationY = -dp(16).toFloat()
        animate().alpha(1f).translationY(0f).setDuration(FADE_MS).withEndAction(null).start()
    }

    fun hide() {
        cancelFill()
        if (visibility != VISIBLE) return
        animate().alpha(0f).translationY(-dp(16).toFloat()).setDuration(FADE_MS)
            .withEndAction { visibility = GONE }.start()
    }

    /** Fills the strip over [durationMs]; [onFull] runs only if the fill is not cancelled. */
    fun startFill(durationMs: Long, onFull: () -> Unit) {
        if (fill != null) return
        fill = ValueAnimator.ofFloat(progress, 1f).apply {
            duration = durationMs
            addUpdateListener { setProgress(it.animatedValue as Float) }
            addListener(object : AnimatorListenerAdapter() {
                private var cancelled = false
                override fun onAnimationCancel(animation: Animator) { cancelled = true }
                override fun onAnimationEnd(animation: Animator) {
                    if (fill === animation) fill = null
                    if (!cancelled) onFull()
                }
            })
            start()
        }
    }

    fun cancelFill() {
        fill?.let {
            fill = null
            it.cancel()
        }
        setProgress(0f)
    }

    private fun setProgress(value: Float) {
        progress = value
        invalidate()
    }

    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)
        if (progress <= 0f) return
        val radius = dp(28).toFloat()
        bounds.set(0f, 0f, width.toFloat(), height.toFloat())
        clip.reset()
        clip.addRoundRect(bounds, radius, radius, Path.Direction.CW)
        canvas.save()
        canvas.clipPath(clip)
        val filled = width * progress
        if (layoutDirection == View.LAYOUT_DIRECTION_RTL) {
            canvas.drawRect(width - filled, 0f, width.toFloat(), height.toFloat(), fillPaint)
        } else {
            canvas.drawRect(0f, 0f, filled, height.toFloat(), fillPaint)
        }
        canvas.restore()
    }

    private fun dp(value: Int): Int = (value * resources.displayMetrics.density).toInt()

    companion object {
        const val HEIGHT_DP = 56
        private const val FADE_MS = 150L
    }
}
