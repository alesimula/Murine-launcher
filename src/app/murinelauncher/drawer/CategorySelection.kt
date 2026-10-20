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
        ): CategorySelection {
            require(categories.isNotEmpty())
            val requested = if (saved.isNotEmpty() && categories.none { it.id == saved }) {
                CategoryState.OTHER
            } else saved
            val visible = categories.filter {
                it.id != CategoryState.OTHER || it.id in nonEmptyIds ||
                    (nonEmptyIds.isEmpty() && requested == CategoryState.OTHER)
            }.ifEmpty { listOf(categories.first()) }
            val selected = requested.takeIf { id -> visible.any { it.id == id } }
                ?: visible.firstOrNull { it.id in nonEmptyIds }?.id ?: visible.first().id
            return CategorySelection(visible, selected)
        }
    }
}
