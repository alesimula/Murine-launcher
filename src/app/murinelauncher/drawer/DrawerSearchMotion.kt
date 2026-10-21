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
import android.content.res.ColorStateList
import android.graphics.Color
import android.graphics.Outline
import android.view.ContextThemeWrapper
import android.view.View
import android.view.ViewOutlineProvider
import android.view.animation.AnimationUtils
import com.android.launcher3.R
import com.google.android.material.button.MaterialButton
import com.google.android.material.color.MaterialColors
import com.google.android.material.motion.MotionUtils
import kotlin.math.abs
import com.google.android.material.R as MaterialR

/**
 * Grows the existing search field out of the detached search action until it covers the category
 * bar, without moving the field's touch bounds.
 */
class DrawerSearchMotion(
    context: Context,
    private val field: View,
    private val tabs: DrawerCategoryBar,
    private val action: DrawerSearchAction,
    onClose: Runnable,
) {
    val closeButton = MaterialButton(ContextThemeWrapper(context,
        R.style.ThemeOverlay_MurineCategories_CategoryButton), null,
        MaterialR.attr.materialButtonStyle).apply {
        id = R.id.drawer_category_search_close
        setIconResource(R.drawable.ic_drawer_search_back)
        iconGravity = MaterialButton.ICON_GRAVITY_TEXT_START
        isCheckable = false
        contentDescription = context.getString(R.string.accessibility_close)
        tooltipText = contentDescription
        backgroundTintList = ColorStateList.valueOf(Color.TRANSPARENT)
        iconTint = ColorStateList.valueOf(MaterialColors.getColor(context,
            MaterialR.attr.colorOnSurface, "DrawerSearch"))
        visibility = View.GONE
        setOnClickListener { onClose.run() }
    }
    private val originalOutline = field.outlineProvider
    private val originalClip = field.clipToOutline
    private val duration = MotionUtils.resolveThemeDuration(context,
        MaterialR.attr.motionDurationMedium2, 300).toLong()
    private val easing = MotionUtils.resolveThemeInterpolator(context,
        MaterialR.attr.motionEasingEmphasizedInterpolator,
        AnimationUtils.loadInterpolator(context, MaterialR.interpolator.m3_sys_motion_easing_emphasized))
    private val density = context.resources.displayMetrics.density
    private val actionSize = DrawerSearchAction.SIZE_DP * density
    private val actionCorner = DrawerCategoryTheme.SEARCH_ACTION_CORNER_DP * density
    private var animator: ValueAnimator? = null
    private var progress = 0f
    private var expanded = false
    private var enabled = false
    private val revealOutline = object : ViewOutlineProvider() {
        override fun getOutline(view: View, outline: Outline) {
            // Collapsed, the field matches the action's rounded square at the end of the row.
            val inset = ((view.width - actionSize).coerceAtLeast(0f) * (1 - progress)).toInt()
            val radius = actionCorner + (view.height / 2f - actionCorner) * progress
            if (view.layoutDirection == View.LAYOUT_DIRECTION_RTL) {
                outline.setRoundRect(0, 0, view.width - inset, view.height, radius)
            } else {
                outline.setRoundRect(inset, 0, view.width, view.height, radius)
            }
        }
    }

    fun setEnabled(value: Boolean) {
        if (enabled == value) return
        cancel()
        enabled = value
        expanded = false
        progress = 0f
        field.outlineProvider = if (value) revealOutline else originalOutline
        field.clipToOutline = value || originalClip
        applyProgress()
    }

    fun setExpanded(value: Boolean, animate: Boolean = true) {
        if (!enabled || expanded == value) return
        expanded = value
        cancel()
        val target = if (value) 1f else 0f
        if (!animate || !ValueAnimator.areAnimatorsEnabled() || !field.isLaidOut) {
            progress = target
            applyProgress()
            return
        }
        val running = ValueAnimator.ofFloat(progress, target)
        animator = running
        running.duration = (duration * abs(target - progress)).toLong().coerceAtLeast(1)
        running.interpolator = easing
        running.addUpdateListener {
            if (animator === running) {
                progress = it.animatedValue as Float
                applyProgress()
            }
        }
        running.addListener(object : AnimatorListenerAdapter() {
            override fun onAnimationEnd(animation: Animator) {
                if (animator === running) {
                    animator = null
                    progress = target
                    applyProgress()
                }
            }
        })
        applyProgress()
        running.start()
    }

    /** Finish at the requested state when leaving the drawer or detaching its views. */
    fun finish() {
        cancel()
        progress = if (expanded) 1f else 0f
        applyProgress()
    }

    private fun cancel() {
        val previous = animator
        animator = null
        previous?.cancel()
    }

    private fun applyProgress() {
        field.visibility = if (!enabled || expanded || progress > 0f) View.VISIBLE else View.INVISIBLE
        field.invalidateOutline()
        tabs.setSearchProgress(if (enabled) progress else 0f)
        // The field's own surface takes over quickly, so the two materials never stack for long.
        action.alpha = if (enabled) (1 - progress / 0.3f).coerceIn(0f, 1f) else 1f
        action.isEnabled = !enabled || progress == 0f
        closeButton.visibility = if (enabled && (expanded || progress > 0f)) View.VISIBLE else View.GONE
        closeButton.alpha = ((progress - 0.35f) / 0.65f).coerceIn(0f, 1f)
        closeButton.isEnabled = expanded && progress > 0.6f
    }
}
