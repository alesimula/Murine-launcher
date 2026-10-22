/*
 * Copyright 2026 Murine Categories contributors
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may obtain a copy at https://www.apache.org/licenses/LICENSE-2.0
 * Distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND.
 */
package app.murinelauncher.drawer

import android.content.Context
import android.content.pm.LauncherApps
import android.os.Process
import android.os.UserHandle
import android.util.Log
import app.murinelauncher.settings.hiddenapps.HiddenAppsRepository
import com.android.launcher3.LauncherPrefs
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

    /** What the picker needs to know about an app to place it. */
    data class PickerApp(val key: String, val packageName: String, val androidCategory: Int)

    fun categoryFor(app: AppInfo): String = state().categoryFor(
        key(app), app.componentName?.packageName.orEmpty(), app.appCategory,
    )

    fun pickerApp(app: AppInfo) = PickerApp(key(app), app.componentName?.packageName.orEmpty(),
        app.appCategory)

    /** Visible launcher apps of every profile, one per package. Makes binder calls: not on main. */
    fun installedApps(): List<PickerApp> {
        val launcherApps = context.getSystemService(LauncherApps::class.java)
        val hidden = HiddenAppsRepository.getHiddenComponents(context)
        return UserCache.INSTANCE.get(context).userProfiles.flatMap { user ->
            launcherApps.getActivityList(null, user)
                .filter { it.componentName.flattenToString() !in hidden }
                .map { PickerApp(key(user, it.componentName.packageName),
                    it.componentName.packageName, it.applicationInfo.category) }
        }.distinctBy { it.key }
    }

    fun key(app: AppInfo): String = key(app.user, app.componentName?.packageName.orEmpty())

    private fun key(user: UserHandle, packageName: String): String {
        val profile = if (user == Process.myUserHandle()) "personal" else {
            // Profile serials alone may identify a different profile after cross-device restore.
            // Keep those corrections device-bound; personal-app corrections remain portable.
            "profile:$profileScope:${UserCache.INSTANCE.get(context).getSerialNumberForUser(user)}"
        }
        return "$profile/$packageName"
    }

    fun title(category: CategoryState.Category): String = category.name.ifEmpty { title(category.id) }

    /** The built-in name, ignoring any rename. */
    fun title(id: String): String = context.getString(CategoryIcons.label(id))
}
