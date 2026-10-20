/*
 * Copyright 2026 Murine Categories contributors
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may obtain a copy at https://www.apache.org/licenses/LICENSE-2.0
 * Distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND.
 */
package app.murinelauncher.drawer

/** Resolve tab visibility without treating a still-empty app model as a deleted selection. */
data class CategorySelection(val categories: List<CategoryState.Category>, val selected: String) {
    companion object {
        fun resolve(
            categories: List<CategoryState.Category>,
            saved: String,
            nonEmptyIds: Set<String>,
            appsLoaded: Boolean = true,
        ): CategorySelection {
            require(categories.isNotEmpty())
            val requested = if (saved.isNotEmpty() && categories.none { it.id == saved }) {
                CategoryState.OTHER
            } else saved
            // Loading has no visible tabs yet, but must not discard the saved selection.
            if (!appsLoaded) return CategorySelection(emptyList(), requested)
            val visible = categories.filter { it.id in nonEmptyIds }
            val selected = requested.takeIf { id -> visible.any { it.id == id } }
                ?: visible.firstOrNull()?.id.orEmpty()
            return CategorySelection(visible, selected)
        }
    }
}
