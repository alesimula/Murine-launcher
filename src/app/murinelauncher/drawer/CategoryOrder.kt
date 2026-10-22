/*
 * Copyright 2026 r4l.launcher contributors
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may obtain a copy at https://www.apache.org/licenses/LICENSE-2.0
 * Distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND.
 */
package app.murinelauncher.drawer

/** List operations behind a category's custom app order. Keys are [CategoryRepository.key]s. */
object CategoryOrder {
    /** Moves or inserts [key] so it ends up at [index] in the result. */
    fun move(keys: List<String>, key: String, index: Int): List<String> {
        val result = keys.filter { it != key }.toMutableList()
        result.add(index.coerceIn(0, result.size), key)
        return result
    }

    /**
     * Saves [visible], the order shown for one profile, without losing saved positions of apps
     * that are installed but not shown, such as the other profile's apps.
     */
    fun merge(visible: List<String>, saved: List<String>, installed: Set<String>): List<String> {
        val shown = visible.toSet()
        return visible + saved.filter { it !in shown && it in installed }
    }

    /** Position lookup for sorting: ordered apps first, everything else after them. */
    fun positions(keys: List<String>): Map<String, Int> =
        keys.withIndex().associate { (index, key) -> key to index }
}
