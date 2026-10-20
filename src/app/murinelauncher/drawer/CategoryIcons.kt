/*
 * Copyright 2026 Murine Categories contributors
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may obtain a copy at https://www.apache.org/licenses/LICENSE-2.0
 * Distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND.
 */
package app.murinelauncher.drawer

import com.android.launcher3.R

/** Stable icon ids keep backups independent of generated Android resource ids. */
object CategoryIcons {
    fun drawable(id: String): Int = when (id) {
        "games" -> R.drawable.ic_category_games
        "communication" -> R.drawable.ic_category_communication
        "media" -> R.drawable.ic_category_media
        "productivity" -> R.drawable.ic_category_productivity
        "news" -> R.drawable.ic_category_news
        "maps" -> R.drawable.ic_category_maps
        "tools" -> R.drawable.ic_category_tools
        "other" -> R.drawable.ic_category_other
        else -> R.drawable.ic_category_folder
    }

    fun label(id: String): Int = when (id) {
        "games" -> R.string.drawer_category_games
        "communication" -> R.string.drawer_category_communication
        "media" -> R.string.drawer_category_media
        "productivity" -> R.string.drawer_category_productivity
        "news" -> R.string.drawer_category_news
        "maps" -> R.string.drawer_category_maps
        "tools" -> R.string.drawer_category_tools
        "other" -> R.string.drawer_category_other
        else -> R.string.drawer_category_folder
    }
}
