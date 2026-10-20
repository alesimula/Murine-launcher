/*
 * Copyright 2026 Murine Categories contributors
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may obtain a copy at https://www.apache.org/licenses/LICENSE-2.0
 * Distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND.
 */
package app.murinelauncher.drawer

import org.junit.Assert.*
import org.junit.Test

class CategorySwipeGestureTest {
    private fun gesture() = CategorySwipeGesture(8f, 48f, 500)

    @Test fun leftAndRightNavigateInOppositeDirections() {
        val swipe = gesture()
        swipe.begin(100f, 100f, 0)
        assertTrue(swipe.move(20f, 105f, 100))
        assertEquals(1, swipe.finish(false, false))
        swipe.begin(100f, 100f, 0)
        assertTrue(swipe.move(180f, 105f, 100))
        assertEquals(-1, swipe.finish(false, false))
    }

    @Test fun rtlReversesCategoryOrder() {
        val swipe = gesture()
        swipe.begin(100f, 100f, 0)
        swipe.move(20f, 100f, 100)
        assertEquals(-1, swipe.finish(false, true))
    }

    @Test fun verticalScrollCannotTurnIntoACategorySwipe() {
        val swipe = gesture()
        swipe.begin(100f, 100f, 0)
        assertFalse(swipe.move(105f, 140f, 50))
        assertFalse(swipe.move(250f, 160f, 100))
        assertEquals(0, swipe.finish(false, false))
    }

    @Test fun aShortHorizontalDragSettlesWithoutChangingCategory() {
        val swipe = gesture()
        swipe.begin(100f, 100f, 0)
        assertTrue(swipe.move(125f, 100f, 100))
        assertEquals(0, swipe.finish(false, false))
    }

    @Test fun lateMovementLeavesLongPressOwnershipAlone() {
        val swipe = gesture()
        swipe.begin(100f, 100f, 0)
        assertFalse(swipe.move(200f, 100f, 501))
        assertEquals(0, swipe.finish(false, false))
    }

    @Test fun anAlreadyClaimedSwipeCanFinishSlowly() {
        val swipe = gesture()
        swipe.begin(100f, 100f, 0)
        assertTrue(swipe.move(120f, 100f, 50))
        assertTrue(swipe.move(200f, 100f, 1500))
        assertEquals(-1, swipe.finish(false, false))
    }

    @Test fun cancelledSwipesDoNotNavigateAndResetTheirState() {
        val swipe = gesture()
        swipe.begin(100f, 100f, 0)
        swipe.move(200f, 100f, 100)
        assertEquals(0, swipe.finish(true, false))
        assertFalse(swipe.active)
        assertEquals(0f, swipe.deltaX)
    }

    @Test fun tapsAndAmbiguousDiagonalsNeverClaimTheGrid() {
        val swipe = gesture()
        swipe.begin(100f, 100f, 0)
        assertEquals(0, swipe.finish(false, false))
        swipe.begin(100f, 100f, 0)
        assertFalse(swipe.move(130f, 130f, 100))
        assertEquals(0, swipe.finish(false, false))
    }
}
