/*
 * Copyright 2026 Murine Categories contributors
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may obtain a copy at https://www.apache.org/licenses/LICENSE-2.0
 * Distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND.
 */
package app.murinelauncher.drawer

/** Whole, equally distributed touch targets; widths include pixel-rounding remainders. */
data class CategoryBarLayout(
    val width: Int,
    val capacity: Int,
    val categoryCount: Int,
    val leftCapacity: Int = capacity,
    val searchWidth: Int = 0,
) {
    val leftWidth: Int get() = if (searchWidth == 0) width else (width - searchWidth) / 2
    val rightWidth: Int get() = width - leftWidth - searchWidth
    val pageCount: Int get() = (categoryCount + capacity - 1) / capacity
    fun pageFor(index: Int): Int = index.coerceIn(0, (categoryCount - 1).coerceAtLeast(0)) / capacity
    fun slotWidth(index: Int): Int {
        val left = index < leftCapacity
        val count = if (left) leftCapacity else capacity - leftCapacity
        val space = if (left) leftWidth else rightWidth
        val slot = if (left) index else index - leftCapacity
        return space * (slot + 1) / count - space * slot / count
    }

    companion object {
        fun calculate(width: Int, minimumTarget: Int, categoryCount: Int): CategoryBarLayout {
            require(minimumTarget > 0 && categoryCount >= 0)
            val available = width.coerceAtLeast(0)
            val capacity = (available / minimumTarget).coerceAtLeast(1)
                .coerceAtMost(categoryCount.coerceAtLeast(1))
            return CategoryBarLayout(available, capacity, categoryCount)
        }

        /** Equal wings keep search at the bar's center. */
        fun centered(width: Int, minimumTarget: Int, categoryCount: Int): CategoryBarLayout {
            require(minimumTarget > 0 && categoryCount >= 0)
            val available = width.coerceAtLeast(3 * minimumTarget)
            val leftWidth = (available - minimumTarget) / 2
            val rightWidth = available - leftWidth - minimumTarget
            val left = (leftWidth / minimumTarget).coerceAtLeast(1)
            val right = rightWidth / minimumTarget
            return CategoryBarLayout(available, left + right, categoryCount,
                left, minimumTarget)
        }
    }
}
