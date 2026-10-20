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
    private val categories = CategoryState().categories

    @Test fun coldStartRetainsOtherUntilItsAppsArrive() {
        val loading = CategorySelection.resolve(categories, "other", emptySet())
        assertEquals("other", loading.selected)
        assertTrue(loading.categories.any { it.id == "other" })
        val loaded = CategorySelection.resolve(categories, loading.selected, setOf("tools", "other"))
        assertEquals("other", loaded.selected)
    }

    @Test fun deletingSelectedCategoryShowsTheFallbackDestination() {
        val remaining = categories.filter { it.id != "communication" }
        val resolved = CategorySelection.resolve(remaining, "communication", setOf("tools", "other"))
        assertEquals("other", resolved.selected)
    }

    @Test fun deletionBeforeTheAppModelLoadsStillShowsItsDestination() {
        val remaining = categories.filter { it.id != "communication" }
        val resolved = CategorySelection.resolve(remaining, "communication", emptySet())
        assertEquals("other", resolved.selected)
        assertTrue(resolved.categories.any { it.id == "other" })
    }

    @Test fun firstOpenChoosesANonEmptyCategoryAndHidesAnEmptyFallback() {
        val resolved = CategorySelection.resolve(categories, "", setOf("communication"))
        assertEquals("communication", resolved.selected)
        assertFalse(resolved.categories.any { it.id == "other" })
    }

    @Test fun aSavedCategorySurvivesWhileTheModelIsLoading() {
        assertEquals("tools", CategorySelection.resolve(categories, "tools", emptySet()).selected)
    }
}
