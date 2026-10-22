/*
 * Copyright 2026 Murine Categories contributors
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may obtain a copy at https://www.apache.org/licenses/LICENSE-2.0
 * Distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND.
 */
package app.murinelauncher.drawer

import org.junit.Assert.*
import org.junit.Test

class CategorySelectionTest {
    private val categories = CategoryState().apply {
        select(listOf("games", "messaging", "news", "productivity", "tools"))
    }.shown

    @Test fun coldStartRetainsOtherUntilItsAppsArrive() {
        val loading = CategorySelection.resolve(categories, "other", emptySet(), appsLoaded = false)
        assertEquals("other", loading.selected)
        assertTrue(loading.categories.isEmpty())
        val loaded = CategorySelection.resolve(categories, loading.selected, setOf("tools", "other"))
        assertEquals("other", loaded.selected)
    }

    @Test fun anUnpickedSelectedCategoryShowsOther() {
        val resolved = CategorySelection.resolve(categories, "finance", setOf("tools", "other"))
        assertEquals("other", resolved.selected)
    }

    @Test fun anUnpickedSelectionBeforeTheAppModelLoadsKeepsOther() {
        val resolved = CategorySelection.resolve(categories, "finance", emptySet(), appsLoaded = false)
        assertEquals("other", resolved.selected)
        assertTrue(resolved.categories.isEmpty())
    }

    @Test fun firstOpenChoosesTheFirstTabAndHidesAnEmptyOther() {
        val resolved = CategorySelection.resolve(categories, "", setOf("messaging"))
        assertEquals("games", resolved.selected)
        assertFalse(resolved.categories.any { it.id == "other" })
    }

    @Test fun pickedCategoriesShowEvenWhenEmpty() {
        val resolved = CategorySelection.resolve(categories, "news", setOf("tools", "games"))
        assertEquals(listOf("games", "messaging", "productivity", "news", "tools"),
            resolved.categories.map { it.id })
        assertEquals("news", resolved.selected)
    }

    @Test fun otherShowsLastOnceItHoldsApps() {
        val resolved = CategorySelection.resolve(categories, "other", setOf("other"))
        assertEquals("other", resolved.categories.last().id)
        assertEquals(6, resolved.categories.size)
        assertEquals("other", resolved.selected)
    }

    @Test fun aSavedCategorySurvivesWhileTheModelIsLoading() {
        assertEquals("tools", CategorySelection.resolve(categories, "tools", emptySet(), appsLoaded = false).selected)
    }
}
