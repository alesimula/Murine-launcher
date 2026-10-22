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
        "social" -> R.drawable.ic_category_social
        "messaging" -> R.drawable.ic_category_messaging
        "music" -> R.drawable.ic_category_music
        "video" -> R.drawable.ic_category_video
        "photos" -> R.drawable.ic_category_photos
        "productivity" -> R.drawable.ic_category_productivity
        "news" -> R.drawable.ic_category_news
        "maps" -> R.drawable.ic_category_maps
        "shopping" -> R.drawable.ic_category_shopping
        "finance" -> R.drawable.ic_category_finance
        "health" -> R.drawable.ic_category_health
        "internet" -> R.drawable.ic_category_internet
        "tools" -> R.drawable.ic_category_tools
        "other" -> R.drawable.ic_category_other
        else -> R.drawable.ic_category_folder
    }

    fun label(id: String): Int = when (id) {
        "games" -> R.string.drawer_category_games
        "social" -> R.string.drawer_category_social
        "messaging" -> R.string.drawer_category_messaging
        "music" -> R.string.drawer_category_music
        "video" -> R.string.drawer_category_video
        "photos" -> R.string.drawer_category_photos
        "productivity" -> R.string.drawer_category_productivity
        "news" -> R.string.drawer_category_news
        "maps" -> R.string.drawer_category_maps
        "shopping" -> R.string.drawer_category_shopping
        "finance" -> R.string.drawer_category_finance
        "health" -> R.string.drawer_category_health
        "internet" -> R.string.drawer_category_internet
        "tools" -> R.string.drawer_category_tools
        "other" -> R.string.drawer_category_other
        else -> R.string.drawer_category_folder
    }
}
