/*
 * Copyright 2026 r4l.launcher contributors
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may obtain a copy at https://www.apache.org/licenses/LICENSE-2.0
 * Distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND.
 */
package app.murinelauncher.drawer

import org.junit.Assert.*
import org.junit.Test

class CategoryOrderTest {
    @Test fun moveTakesTheHoveredPosition() {
        val keys = listOf("a", "b", "c", "d")
        assertEquals(listOf("b", "c", "a", "d"), CategoryOrder.move(keys, "a", 2))
        assertEquals(listOf("d", "a", "b", "c"), CategoryOrder.move(keys, "d", 0))
        assertEquals(listOf("a", "b", "c", "d"), CategoryOrder.move(keys, "b", 1))
    }

    @Test fun moveInsertsAnAppFromAnotherCategory() {
        assertEquals(listOf("a", "x", "b"), CategoryOrder.move(listOf("a", "b"), "x", 1))
        assertEquals(listOf("a", "b", "x"), CategoryOrder.move(listOf("a", "b"), "x", 9))
    }

    @Test fun mergeKeepsHiddenProfileAppsAndDropsUninstalled() {
        val merged = CategoryOrder.merge(
            visible = listOf("personal/b", "personal/a"),
            saved = listOf("personal/a", "work/z", "personal/gone", "personal/b"),
            installed = setOf("personal/a", "personal/b", "work/z"),
        )
        assertEquals(listOf("personal/b", "personal/a", "work/z"), merged)
    }

    @Test fun positionsFollowTheOrder() {
        assertEquals(mapOf("b" to 0, "a" to 1), CategoryOrder.positions(listOf("b", "a")))
    }
}
