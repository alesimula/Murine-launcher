/*
 * Copyright 2026 Murine Categories contributors
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may obtain a copy at https://www.apache.org/licenses/LICENSE-2.0
 * Distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND.
 */
package app.murinelauncher.drawer

import org.junit.Assert.*
import org.junit.Test

class CategoryBarLayoutTest {
    @Test fun commonPhoneWidthsFitWholeTouchTargets() {
        for (screen in listOf(320, 360, 393, 434, 600)) {
            val layout = CategoryBarLayout.calculate(screen - 16, 48, 20)
            assertTrue((0 until layout.capacity).all { layout.slotWidth(it) >= 48 })
            assertEquals(screen - 16, (0 until layout.capacity).sumOf(layout::slotWidth))
            assertTrue(layout.width / (layout.capacity + 1) < 48)
        }
    }

    @Test fun pixelRemaindersDoNotClipTheLastButton() {
        val layout = CategoryBarLayout.calculate(971, 135, 20)
        assertEquals(7, layout.capacity)
        assertEquals(971, (0 until layout.capacity).sumOf(layout::slotWidth))
        assertTrue((0 until layout.capacity).all { layout.slotWidth(it) >= 135 })
        assertEquals(3, layout.pageCount)
        assertEquals(1, layout.pageFor(7))
        assertEquals(2, layout.pageFor(19))
    }

    @Test fun resizingRecomputesCapacityAndTheSelectedPage() {
        val portrait = CategoryBarLayout.calculate(329, 48, 9)
        val landscape = CategoryBarLayout.calculate(736, 48, 9)
        assertEquals(6, portrait.capacity)
        assertEquals(2, portrait.pageCount)
        assertEquals(1, portrait.pageFor(8))
        assertEquals(9, landscape.capacity)
        assertEquals(1, landscape.pageCount)
        assertEquals(0, landscape.pageFor(8))
    }

    @Test fun emptyAndNotYetMeasuredRowsAreSafe() {
        val empty = CategoryBarLayout.calculate(0, 48, 0)
        assertEquals(0, empty.pageCount)
        assertEquals(0, empty.pageFor(-1))
        assertEquals(1, CategoryBarLayout.calculate(0, 48, 5).capacity)
    }
}
