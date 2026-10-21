/*
 * Copyright 2026 Murine Categories contributors
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may obtain a copy at https://www.apache.org/licenses/LICENSE-2.0
 * Distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND.
 */
package app.murinelauncher.drawer

import kotlin.math.abs

/** A horizontal gesture must win early; vertical scrolling and long presses keep ownership. */
class CategorySwipeGesture(
    private val slop: Float,
    private val minimumDistance: Float,
    private val longPressTimeout: Long,
) {
    var active = false
        private set
    var deltaX = 0f
        private set
    private var tracking = false
    private var startX = 0f
    private var startY = 0f
    private var startTime = 0L

    fun begin(x: Float, y: Float, time: Long) {
        cancel()
        tracking = true
        startX = x
        startY = y
        startTime = time
    }

    fun move(x: Float, y: Float, time: Long): Boolean {
        if (!tracking) return false
        val dx = x - startX
        val dy = y - startY
        if (!active) {
            if (time - startTime >= longPressTimeout || (abs(dy) > slop && abs(dy) > abs(dx))) {
                cancel()
                return false
            }
            active = abs(dx) > slop && abs(dx) > abs(dy) * 1.5f
        }
        deltaX = dx
        return active
    }

    fun finish(cancelled: Boolean, rtl: Boolean): Int {
        val step = if (!cancelled && active && abs(deltaX) >= minimumDistance) {
            (if (deltaX < 0) 1 else -1) * (if (rtl) -1 else 1)
        } else 0
        cancel()
        return step
    }

    fun cancel() {
        active = false
        tracking = false
        deltaX = 0f
    }
}
