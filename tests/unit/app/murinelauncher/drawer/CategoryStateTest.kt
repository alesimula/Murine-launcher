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
    @Test fun manualCorrectionWinsOverAutomaticClassificationAndUpdates() {
        val state = CategoryState()
        state.assign("personal/com.whatsapp", "productivity")
        assertEquals("productivity", state.categoryFor("personal/com.whatsapp", "com.whatsapp", 4))
        assertEquals("productivity", state.categoryFor("personal/com.whatsapp", "com.whatsapp", 0))
        state.assign("personal/com.whatsapp", "communication")
        assertEquals(1, state.assignments.size)
        assertEquals("communication", state.categoryFor("personal/com.whatsapp", "com.whatsapp", 0))
    }

    @Test fun undoRestoresPinnedOrAutomaticAssignment() {
        val state = CategoryState()
        state.assign("personal/com.whatsapp", "media")
        state.assign("personal/com.whatsapp", "tools")
        state.restoreAssignment("personal/com.whatsapp", "media")
        assertEquals("media", state.assignments["personal/com.whatsapp"])
        state.restoreAssignment("personal/com.whatsapp", null)
        assertFalse(state.assignments.containsKey("personal/com.whatsapp"))
        assertEquals("communication", state.categoryFor("personal/com.whatsapp", "com.whatsapp", -1))
    }

    @Test fun undoToDeletedCategoryFallsBackToAutomatic() {
        val state = CategoryState()
        val custom = state.create("Work")
        state.assign("personal/example", "tools")
        state.delete(custom)
        state.restoreAssignment("personal/example", custom)
        assertFalse(state.assignments.containsKey("personal/example"))
    }

    @Test fun profilesDoNotShareManualCorrections() {
        val state = CategoryState()
        state.assign("personal/com.whatsapp", "productivity")
        assertEquals("communication", state.categoryFor("work/com.whatsapp", "com.whatsapp", 4))
    }

    @Test fun deletedCategoryRoutesAutomaticAndManualMembersToOther() {
        val state = CategoryState()
        state.assign("personal/example", "games")
        state.delete("games")
        assertEquals("other", state.categoryFor("personal/example", "example", -1))
        assertEquals("other", state.categoryFor("personal/game", "game", 0))
        assertFalse(state.categories.any { it.id == "games" })
    }

    @Test fun backupRoundTripPreservesCustomNamesOrderAndAssignments() {
        val state = CategoryState()
        val custom = state.create("Trabalho & estudo 📚")
        state.rename("communication", "Conversas")
        state.move(custom, -100)
        state.assign("personal/example.app", custom)
        val restored = CategoryState.decode(state.encode())
        assertEquals(state.categories, restored.categories)
        assertEquals(state.assignments, restored.assignments)
        assertEquals(custom, restored.categories.first().id)
        assertEquals(custom, restored.categoryFor("personal/example.app", "example.app", 0))
    }

    @Test fun chosenIconSurvivesRenameReorderAndBackup() {
        val state = CategoryState()
        val custom = state.create("Work")
        assertEquals("folder", state.categories.first { it.id == custom }.iconId)
        state.setIcon(custom, "productivity")
        state.rename(custom, "Study")
        state.move(custom, -100)
        val restored = CategoryState.decode(state.encode()).categories.first()
        assertEquals(custom, restored.id)
        assertEquals("Study", restored.name)
        assertEquals("productivity", restored.iconId)
    }

    @Test fun oldBackupsKeepDefaultIconsAndUnknownIconsFallBack() {
        val old = CategoryState.decode("""{"version":1,"categories":[{"id":"games"},{"id":"custom","name":"Study","icon":"future"}],"assignments":{}}""")
        assertEquals("games", old.categories[0].iconId)
        assertEquals("folder", old.categories[1].iconId)
    }

    @Test(expected = IllegalArgumentException::class)
    fun fallbackCannotBeDeleted() {
        CategoryState().delete("other")
    }

    @Test fun unknownAppsHaveExactlyOneVisibleFallback() {
        val state = CategoryState()
        assertEquals("other", state.categoryFor("personal/example", "example", -1))
        assertEquals("other", state.categoryFor("personal/example", "example", 100))
        assertEquals(1, state.categories.count { it.id == "other" })
    }

    @Test fun restoreRepairsMissingFallbackAndDanglingAssignment() {
        val state = CategoryState.decode("""{"version":1,"categories":[],"assignments":{"personal/app":"missing"}}""")
        assertEquals(listOf(CategoryState.Category("other")), state.categories)
        assertEquals("other", state.categoryFor("personal/app", "app", 0))
    }

    @Test(expected = IllegalArgumentException::class)
    fun unsupportedBackupVersionIsRejected() {
        CategoryState.decode("""{"version":2,"categories":[],"assignments":{}}""")
    }

    @Test(expected = IllegalArgumentException::class)
    fun duplicateCategoryIdentifiersAreRejected() {
        CategoryState.decode("""{"version":1,"categories":[{"id":"games"},{"id":"games"}],"assignments":{}}""")
    }

    @Test fun deletingCustomCategoryPreservesAppAndAllowsReassignment() {
        val state = CategoryState()
        val custom = state.create("Work")
        state.assign("personal/app", custom)
        state.delete(custom)
        assertEquals("other", state.assignments["personal/app"])
        state.assign("personal/app", "tools")
        assertEquals("tools", state.categoryFor("personal/app", "app", -1))
    }

    @Test fun offlineRulesUseExactPackagesRatherThanGuessingFromSubstrings() {
        assertEquals("communication", OfflineAppClassifier.classify("com.whatsapp", -1))
        assertEquals("other", OfflineAppClassifier.classify("com.fake.whatsapp", -1))
        assertEquals("games", OfflineAppClassifier.classify("example.game", 0))
        assertEquals("media", OfflineAppClassifier.classify("example.camera", 3))
        assertEquals("maps", OfflineAppClassifier.classify("example.maps", 6))
    }
}
