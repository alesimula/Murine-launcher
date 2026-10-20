/*
 * Copyright 2026 Murine Categories contributors
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may obtain a copy at https://www.apache.org/licenses/LICENSE-2.0
 * Distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND.
 */
package app.murinelauncher.drawer

import android.content.Context
import android.os.Process
import android.util.Log
import com.android.launcher3.LauncherPrefs
import com.android.launcher3.R
import com.android.launcher3.model.data.AppInfo
import com.android.launcher3.pm.UserCache
import java.util.UUID

/** Uses the launcher's existing, backed-up preference file; no network or package lookups. */
class CategoryRepository(private val context: Context) {
    private val prefs = LauncherPrefs.get(context)
    private var cachedJson: String? = null
    private var cachedState = CategoryState()
    private val profileScope by lazy {
        prefs.get(LauncherPrefs.DRAWER_PROFILE_SCOPE).ifEmpty {
            UUID.randomUUID().toString().also { prefs.put(LauncherPrefs.DRAWER_PROFILE_SCOPE, it) }
        }
    }

    fun state(): CategoryState {
        val json = prefs.get(LauncherPrefs.DRAWER_CATEGORY_STATE)
        if (json != cachedJson) {
            cachedState = try {
                CategoryState.decode(json)
            } catch (e: Exception) {
                Log.w("DrawerCategories", "Invalid category state; keeping saved data", e)
                CategoryState()
            }
            cachedJson = json
        }
        return cachedState
    }

    fun edit(change: (CategoryState) -> Unit) {
        val state = state()
        change(state)
        prefs.put(LauncherPrefs.DRAWER_CATEGORY_STATE, state.encode())
    }

    fun deleteCategory(id: String) {
        // Pref listeners refresh asynchronously; select the destination in that same refresh.
        prefs.put(LauncherPrefs.DRAWER_LAST_CATEGORY, CategoryState.OTHER)
        edit { it.delete(id) }
    }

    fun categoryFor(app: AppInfo): String = state().categoryFor(
        key(app), app.componentName?.packageName.orEmpty(), app.appCategory,
    )

    fun key(app: AppInfo): String {
        val profile = if (app.user == Process.myUserHandle()) "personal" else {
            // Profile serials alone may identify a different profile after cross-device restore.
            // Keep those corrections device-bound; personal-app corrections remain portable.
            "profile:$profileScope:${UserCache.INSTANCE.get(context).getSerialNumberForUser(app.user)}"
        }
        return "$profile/${app.componentName?.packageName.orEmpty()}"
    }

    fun title(category: CategoryState.Category): String = category.name.ifEmpty {
        context.getString(when (category.id) {
            "games" -> R.string.drawer_category_games
            "communication" -> R.string.drawer_category_communication
            "media" -> R.string.drawer_category_media
            "productivity" -> R.string.drawer_category_productivity
            "news" -> R.string.drawer_category_news
            "maps" -> R.string.drawer_category_maps
            "tools" -> R.string.drawer_category_tools
            else -> R.string.drawer_category_other
        })
    }
}
