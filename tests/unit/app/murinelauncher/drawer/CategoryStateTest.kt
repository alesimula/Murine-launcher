/*
 * Copyright 2026 Murine Categories contributors
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may obtain a copy at https://www.apache.org/licenses/LICENSE-2.0
 * Distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND.
 */
package app.murinelauncher.drawer

import org.junit.Assert.*
import org.junit.Test

class CategoryStateTest {
    private val pick = listOf("games", "social", "messaging", "productivity", "tools")

    private fun picked(ids: List<String> = pick) = CategoryState().apply { select(ids) }

    @Test fun manualCorrectionWinsOverAutomaticClassificationAndUpdates() {
        val state = picked()
        state.assign("personal/com.whatsapp", "productivity")
        assertEquals("productivity", state.categoryFor("personal/com.whatsapp", "com.whatsapp", 4))
        state.assign("personal/com.whatsapp", "messaging")
        assertEquals(1, state.assignments.size)
        assertEquals("messaging", state.categoryFor("personal/com.whatsapp", "com.whatsapp", 0))
    }

    @Test fun undoRestoresPinnedOrAutomaticAssignment() {
        val state = picked()
        state.assign("personal/com.whatsapp", "games")
        state.assign("personal/com.whatsapp", "tools")
        state.restoreAssignment("personal/com.whatsapp", "games")
        assertEquals("games", state.assignments["personal/com.whatsapp"])
        state.restoreAssignment("personal/com.whatsapp", null)
        assertFalse(state.assignments.containsKey("personal/com.whatsapp"))
        assertEquals("messaging", state.categoryFor("personal/com.whatsapp", "com.whatsapp", -1))
    }

    @Test fun movingAnAppDropsItsPositionsAndUndoRestoresThem() {
        val state = picked()
        state.setOrder("tools", listOf("personal/a", "personal/b"))
        state.setOrder("games", listOf("personal/m", "personal/b"))
        val before = state.capture("personal/b")
        state.assign("personal/b", "games")
        assertEquals(listOf("personal/a"), state.order("tools"))
        assertEquals(listOf("personal/m"), state.order("games"))
        state.setOrder("games", listOf("personal/b", "personal/m"))
        state.restore(before)
        assertFalse(state.assignments.containsKey("personal/b"))
        assertEquals(listOf("personal/a", "personal/b"), state.order("tools"))
        assertEquals(listOf("personal/m", "personal/b"), state.order("games"))
    }

    @Test fun reassigningToTheSameCategoryKeepsItsPosition() {
        val state = picked()
        state.assign("personal/a", "tools")
        state.setOrder("tools", listOf("personal/b", "personal/a"))
        state.assign("personal/a", "tools")
        assertEquals(listOf("personal/b", "personal/a"), state.order("tools"))
    }

    @Test fun profilesDoNotShareManualCorrections() {
        val state = picked()
        state.assign("personal/com.whatsapp", "productivity")
        assertEquals("messaging", state.categoryFor("work/com.whatsapp", "com.whatsapp", 4))
    }

    @Test(expected = IllegalArgumentException::class)
    fun fewerThanFiveCannotBeSaved() {
        CategoryState().select(pick.take(4))
    }

    @Test(expected = IllegalArgumentException::class)
    fun moreThanFiveCannotBeSaved() {
        CategoryState().select(pick + "finance")
    }

    @Test(expected = IllegalArgumentException::class)
    fun otherCannotBePicked() {
        CategoryState().select(pick.take(4) + "other")
    }

    @Test fun onlyPickedCategoriesAndOtherAreShown() {
        val state = picked()
        assertEquals(pick + "other", state.shown.map { it.id })
        assertTrue(state.confirmed)
    }

    @Test fun anUnpickedCategoryFallsBackOneStepThenToOther() {
        // Music isn't picked and neither is its fallback, Video.
        val state = picked()
        assertEquals("messaging", state.categoryFor("personal/a", "org.telegram.messenger", -1))
        assertEquals("other", state.categoryFor("personal/b", "com.spotify.music", -1))
        val withVideo = picked(listOf("games", "social", "video", "productivity", "tools"))
        assertEquals("social", withVideo.categoryFor("personal/c", "org.telegram.messenger", -1))
        assertEquals("video", withVideo.categoryFor("personal/b", "com.spotify.music", -1))
        assertEquals("tools", withVideo.categoryFor("personal/d", "com.android.chrome", -1))
    }

    @Test fun gamesHaveNoFallback() {
        val state = picked(listOf("social", "messaging", "music", "productivity", "tools"))
        assertEquals("other", state.categoryFor("personal/game", "example.game", 0))
    }

    @Test fun manualMovesIntoAnUnpickedCategoryComeBackWhenItIsPickedAgain() {
        val state = picked()
        state.assign("personal/app", "games")
        state.rename("games", "Jogos")
        state.setIcon("games", "folder")
        state.select(listOf("finance", "social", "messaging", "productivity", "tools"))
        assertEquals("other", state.categoryFor("personal/app", "app", -1))
        assertEquals("games", state.assignments["personal/app"])
        val restored = CategoryState.decode(state.encode())
        restored.select(pick)
        assertEquals("games", restored.categoryFor("personal/app", "app", -1))
        assertEquals("Jogos", restored.categories.first { it.id == "games" }.name)
        assertEquals("folder", restored.categories.first { it.id == "games" }.iconId)
    }

    @Test fun anUnpickedManualMoveUsesTheAutomaticCategory() {
        val state = picked()
        state.assign("personal/com.whatsapp", "finance")
        assertEquals("messaging", state.categoryFor("personal/com.whatsapp", "com.whatsapp", -1))
    }

    @Test fun suggestionsTakeTheFullestCategoriesAndPreferOldTabs() {
        val primaries = listOf("social", "social", "social", "games", "games", "music",
            "finance", "finance", "finance", "finance", "tools", "news", "other", "other")
        // Music, News and Tools tie at one app; catalog order breaks the tie.
        assertEquals(listOf("finance", "social", "games", "music", "news"),
            CategoryState.suggest(primaries))
        assertEquals(setOf("tools", "news", "finance", "social", "games"),
            CategoryState.suggest(primaries, listOf("tools", "news")).toSet())
        // Ties keep catalog order.
        assertEquals(CategoryState.CATALOG.take(5), CategoryState.suggest(emptyList()))
    }

    @Test fun preselectingTrimsAnUpgradedSelectionToFive() {
        val state = CategoryState(selected = mutableListOf("games", "messaging", "video",
            "productivity", "news", "maps", "tools"))
        state.preselect(listOf("tools", "tools", "maps", "news", "games", "video", "finance", "finance"))
        assertEquals(5, state.selected.size)
        assertFalse(state.confirmed)
        assertEquals(setOf("tools", "maps", "news", "games", "video"), state.selected.toSet())
    }

    @Test fun moveSwapsShownTabsAndKeepsOtherLast() {
        val state = picked()
        state.move("social", 1)
        assertEquals(listOf("games", "messaging", "social", "productivity", "tools", "other"),
            state.shown.map { it.id })
        state.move("tools", 1)
        state.move("other", -1)
        assertEquals("other", state.shown.last().id)
        assertEquals("other", state.categories.last().id)
        state.move("games", -100)
        assertEquals("games", state.shown.first().id)
    }

    @Test fun backupRoundTripPreservesEverything() {
        val state = picked()
        state.rename("messaging", "Conversas")
        state.move("tools", -100)
        state.assign("personal/example.app", "tools")
        state.setOrder("tools", listOf("personal/b", "personal/a"))
        val restored = CategoryState.decode(state.encode())
        assertEquals(state.categories, restored.categories)
        assertEquals(state.selected, restored.selected)
        assertEquals(state.assignments, restored.assignments)
        assertEquals(state.orders, restored.orders)
        assertTrue(restored.confirmed)
        assertEquals("tools", restored.shown.first().id)
    }

    @Test fun anUnconfirmedOrInvalidSelectionIsNotTreatedAsConfirmed() {
        val partial = CategoryState.decode("""{"version":2,"categories":[],"selected":["games","bogus"],"confirmed":true,"assignments":{}}""")
        assertFalse(partial.confirmed)
        assertEquals(listOf("games"), partial.selected)
        assertEquals(CategoryState.CATALOG + "other", partial.categories.map { it.id })
    }

    @Test fun versionOneUpgradeMapsBuiltInsAndDropsCustomCategories() {
        val v1 = """{"version":1,
            "categories":[{"id":"custom-1","name":"Work"},{"id":"communication","name":"Chat"},
                {"id":"other"},{"id":"media","icon":"communication"},{"id":"games"}],
            "assignments":{"personal/a":"custom-1","personal/b":"media","personal/c":"communication"},
            "orders":{"custom-1":["personal/a"],"communication":["personal/c","personal/x"]}}"""
        val state = CategoryState.decode(v1)
        assertFalse(state.confirmed)
        assertEquals(listOf("messaging", "video", "games"), state.selected)
        assertEquals(listOf("messaging", "video", "games"), state.categories.take(3).map { it.id })
        assertEquals("other", state.categories.last().id)
        assertEquals(CategoryState.CATALOG.size + 1, state.categories.size)
        assertEquals("Chat", state.categories[0].name)
        assertEquals("messaging", state.categories[1].iconId)
        assertFalse(state.assignments.containsKey("personal/a"))
        assertEquals("video", state.assignments["personal/b"])
        assertEquals("messaging", state.assignments["personal/c"])
        assertEquals(mapOf("messaging" to listOf("personal/c", "personal/x")), state.orders)
    }

    @Test fun versionOneBackupsWithoutOrdersStillDecode() {
        val legacy = """{"version":1,"categories":[{"id":"other"}],"assignments":{}}"""
        val state = CategoryState.decode(legacy)
        assertTrue(state.orders.isEmpty())
        assertTrue(state.selected.isEmpty())
    }

    @Test fun unknownIconsFallBackToTheCategoryIcon() {
        val state = CategoryState.decode("""{"version":2,"categories":[{"id":"games","icon":"future"}],"selected":[],"assignments":{}}""")
        assertEquals("games", state.categories.first().iconId)
    }

    @Test fun unknownAppsHaveExactlyOneFallback() {
        val state = picked()
        assertEquals("other", state.categoryFor("personal/example", "example", -1))
        assertEquals("other", state.categoryFor("personal/example", "example", 100))
        assertEquals(1, state.categories.count { it.id == "other" })
    }

    @Test fun danglingAssignmentsAreDropped() {
        val state = CategoryState.decode("""{"version":2,"categories":[],"selected":[],"assignments":{"personal/app":"missing"}}""")
        assertTrue(state.assignments.isEmpty())
    }

    @Test(expected = IllegalArgumentException::class)
    fun unsupportedBackupVersionIsRejected() {
        CategoryState.decode("""{"version":3,"categories":[],"assignments":{}}""")
    }

    @Test(expected = IllegalArgumentException::class)
    fun duplicateCategoryIdentifiersAreRejected() {
        CategoryState.decode("""{"version":2,"categories":[{"id":"games"},{"id":"games"}],"selected":[],"assignments":{}}""")
    }

    @Test fun offlineRulesUseExactPackagesRatherThanGuessingFromSubstrings() {
        assertEquals("messaging", OfflineAppClassifier.classify("com.whatsapp", -1))
        assertEquals("other", OfflineAppClassifier.classify("com.fake.whatsapp", -1))
        assertEquals("games", OfflineAppClassifier.classify("example.game", 0))
        assertEquals("music", OfflineAppClassifier.classify("example.audio", 1))
        assertEquals("video", OfflineAppClassifier.classify("example.video", 2))
        assertEquals("photos", OfflineAppClassifier.classify("example.camera", 3))
        assertEquals("social", OfflineAppClassifier.classify("example.social", 4))
        assertEquals("maps", OfflineAppClassifier.classify("example.maps", 6))
        assertEquals("tools", OfflineAppClassifier.classify("example.a11y", 8))
        assertEquals("finance", OfflineAppClassifier.classify("com.nu.production", 7))
    }

    @Test fun everyCatalogCategoryButGamesHasAPickableFallback() {
        CategoryState.CATALOG.filter { it != "games" }.forEach {
            val fallback = CategoryState.FALLBACKS[it]
            assertNotNull(it, fallback)
            assertTrue(fallback in CategoryState.CATALOG)
            assertNotEquals(it, fallback)
        }
    }
}
