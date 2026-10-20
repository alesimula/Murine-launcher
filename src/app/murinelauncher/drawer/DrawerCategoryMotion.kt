/*
 * Copyright 2026 Murine Categories contributors
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may obtain a copy at https://www.apache.org/licenses/LICENSE-2.0
 * Distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND.
 */
package app.murinelauncher.drawer

import android.animation.Animator
import android.animation.AnimatorListenerAdapter
import android.animation.ValueAnimator
import android.content.Context
import android.view.View
import android.view.animation.AnimationUtils
import android.view.animation.LinearInterpolator
import com.google.android.material.motion.MotionUtils
import com.google.android.material.R as MaterialR

/** Owns only category translations/alpha; never snapshots or duplicates the app grid. */
class DrawerCategoryMotion(context: Context, private val views: () -> List<View>) {
    private val distance = context.resources.getDimension(
        MaterialR.dimen.mtrl_transition_shared_axis_slide_distance)
    private val easing = MotionUtils.resolveThemeInterpolator(context,
        MaterialR.attr.motionEasingEmphasizedInterpolator,
        AnimationUtils.loadInterpolator(context, MaterialR.interpolator.m3_sys_motion_easing_emphasized))
    private val duration = MotionUtils.resolveThemeDuration(context,
        MaterialR.attr.motionDurationMedium2, 300).toLong()
    private val moved = mutableSetOf<View>()
    private var animator: ValueAnimator? = null
    private var pending: (() -> Unit)? = null

    fun drag(delta: Float) {
        if (!ValueAnimator.areAnimatorsEnabled()) return
        val offset = (delta * 0.15f).coerceIn(-distance * 0.8f, distance * 0.8f)
        views().forEach { view ->
            moved.add(view)
            view.translationX = offset
        }
    }

    /** Rapid gestures finish the preceding selection before starting another one. */
    fun finish() {
        val change = pending
        cancel()
        change?.invoke()
    }

    fun finishAnimation() {
        if (animator != null) finish()
    }

    fun cancel() {
        pending = null
        val previous = animator
        animator = null
        previous?.cancel()
        moved.forEach { it.translationX = 0f; it.alpha = 1f }
        moved.clear()
    }

    fun settle() {
        val targets = moved.associateWith { it.translationX }
        animate(150) { fraction ->
            targets.forEach { (view, start) -> view.translationX = start * (1 - easing.getInterpolation(fraction)) }
        }
    }

    fun switch(direction: Int, change: () -> Unit) {
        if (!ValueAnimator.areAnimatorsEnabled()) {
            cancel()
            change()
            return
        }
        pending = change
        val outgoing = views().associateWith { it.translationX }
        moved.addAll(outgoing.keys)
        var changed = false
        animate(duration) { fraction ->
            if (fraction < 0.3f) {
                val progress = easing.getInterpolation(fraction / 0.3f)
                outgoing.forEach { (view, start) ->
                    view.translationX = start + (-direction * distance - start) * progress
                    view.alpha = 1 - progress
                }
            } else {
                if (!changed) {
                    changed = true
                    val apply = pending
                    pending = null
                    apply?.invoke()
                }
                val progress = easing.getInterpolation((fraction - 0.3f) / 0.7f)
                views().forEach { view ->
                    moved.add(view)
                    view.translationX = direction * distance * (1 - progress)
                    view.alpha = progress
                }
            }
        }
    }

    private fun animate(length: Long, update: (Float) -> Unit) {
        val running = ValueAnimator.ofFloat(0f, 1f)
        animator = running
        running.duration = length
        running.interpolator = LinearInterpolator()
        running.addUpdateListener {
            if (animator === running) update(it.animatedValue as Float)
        }
        running.addListener(object : AnimatorListenerAdapter() {
            override fun onAnimationEnd(animation: Animator) {
                if (animator === running) finish()
            }
        })
        running.start()
    }
}
