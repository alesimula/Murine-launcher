/*
 * Copyright 2026 Murine Categories contributors
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may obtain a copy at https://www.apache.org/licenses/LICENSE-2.0
 * Distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND.
 */
package app.murinelauncher.drawer

import org.json.JSONArray
import org.json.JSONObject
import java.util.UUID

/** Persistent category definitions and explicit assignments. No installed-app data is required. */
class CategoryState(
    val categories: MutableList<Category> = DEFAULT_IDS.map { Category(it) }.toMutableList(),
    val assignments: MutableMap<String, String> = linkedMapOf(),
    /** Custom app order per category id, as app keys; apps missing from it sort A–Z after it. */
    val orders: MutableMap<String, MutableList<String>> = linkedMapOf(),
) {
    /** Assignment and orders captured before a move, so Undo restores both exactly. */
    class Snapshot internal constructor(
        val appKey: String,
        val assignment: String?,
        val orders: Map<String, List<String>>,
    )

    data class Category(val id: String, val name: String = "", val icon: String = "") {
        val iconId: String get() = icon.ifEmpty { id.takeIf { it in ICON_IDS } ?: "folder" }
    }

    fun categoryFor(appKey: String, packageName: String, androidCategory: Int): String {
        val candidate = assignments[appKey] ?: OfflineAppClassifier.classify(packageName, androidCategory)
        return candidate.takeIf { id -> categories.any { it.id == id } } ?: OTHER
    }

    /** A moved app leaves its other categories' orders and joins the destination's A–Z tail. */
    fun assign(appKey: String, categoryId: String) {
        require(categories.any { it.id == categoryId })
        if (assignments.put(appKey, categoryId) == categoryId) return
        orders.values.forEach { it.remove(appKey) }
        orders.values.removeAll { it.isEmpty() }
    }

    /** Restores an assignment captured before a move; null means the automatic category. */
    fun restoreAssignment(appKey: String, previous: String?) {
        if (previous != null && categories.any { it.id == previous }) {
            assignments[appKey] = previous
        } else {
            assignments.remove(appKey)
        }
    }

    fun order(categoryId: String): List<String> = orders[categoryId].orEmpty()

    fun hasOrder(categoryId: String): Boolean = orders[categoryId]?.isNotEmpty() == true

    fun setOrder(categoryId: String, appKeys: List<String>) {
        require(categories.any { it.id == categoryId })
        if (appKeys.isEmpty()) orders.remove(categoryId) else orders[categoryId] = appKeys.toMutableList()
    }

    fun clearOrder(categoryId: String) {
        orders.remove(categoryId)
    }

    fun capture(appKey: String) = Snapshot(appKey, assignments[appKey],
        orders.mapValues { it.value.toList() })

    fun restore(snapshot: Snapshot) {
        restoreAssignment(snapshot.appKey, snapshot.assignment)
        orders.clear()
        snapshot.orders.forEach { (id, keys) ->
            if (categories.any { it.id == id }) orders[id] = keys.toMutableList()
        }
    }

    fun create(name: String): String {
        require(name.isNotBlank())
        val id = UUID.randomUUID().toString()
        categories.add(categories.lastIndex, Category(id, name.trim()))
        return id
    }

    fun rename(id: String, name: String) {
        require(name.isNotBlank())
        val index = categories.indexOfFirst { it.id == id }
        require(index >= 0)
        categories[index] = categories[index].copy(name = name.trim())
    }

    fun setIcon(id: String, icon: String) {
        require(icon in ICON_IDS)
        val index = categories.indexOfFirst { it.id == id }
        require(index >= 0)
        categories[index] = categories[index].copy(icon = icon)
    }

    fun move(id: String, delta: Int) {
        val index = categories.indexOfFirst { it.id == id }
        if (index < 0) return
        val target = (index + delta).coerceIn(0, categories.lastIndex)
        categories.add(target, categories.removeAt(index))
    }

    fun delete(id: String) {
        require(id != OTHER) // The fallback must always exist, even when its tab is hidden.
        categories.removeAll { it.id == id }
        orders.remove(id)
        assignments.replaceAll { _, category -> if (category == id) OTHER else category }
    }

    fun encode(): String = JSONObject().apply {
        put("version", 1)
        put("categories", JSONArray().apply {
            categories.forEach { put(JSONObject().put("id", it.id).put("name", it.name).put("icon", it.icon)) }
        })
        put("assignments", JSONObject(assignments as Map<*, *>))
        put("orders", JSONObject().apply { orders.forEach { (id, keys) -> put(id, JSONArray(keys)) } })
    }.toString()

    companion object {
        const val OTHER = "other"
        val DEFAULT_IDS = listOf(
            "games", "communication", "media", "productivity", "news", "maps", "tools", OTHER,
        )

        val ICON_IDS = DEFAULT_IDS + "folder"

        /** Invalid state is rejected; callers can keep the original data and fall back safely. */
        fun decode(serialized: String): CategoryState {
            if (serialized.isEmpty()) return CategoryState()
            val root = JSONObject(serialized)
            require(root.getInt("version") == 1)
            val array = root.getJSONArray("categories")
            val categories = (0 until array.length()).map { index ->
                val entry = array.getJSONObject(index)
                Category(entry.getString("id"), entry.optString("name"),
                    entry.optString("icon").takeIf { it in ICON_IDS }.orEmpty())
            }.toMutableList()
            require(categories.all { it.id.isNotBlank() && (it.id in DEFAULT_IDS || it.name.isNotBlank()) })
            require(categories.map { it.id }.distinct().size == categories.size)
            if (categories.none { it.id == OTHER }) categories.add(Category(OTHER))
            val assignments = linkedMapOf<String, String>()
            val jsonAssignments = root.getJSONObject("assignments")
            jsonAssignments.keys().forEach { key ->
                val id = jsonAssignments.getString(key)
                assignments[key] = id.takeIf { value -> categories.any { it.id == value } } ?: OTHER
            }
            // Older backups have no orders; unknown categories' orders are dropped.
            val orders = linkedMapOf<String, MutableList<String>>()
            root.optJSONObject("orders")?.let { jsonOrders ->
                jsonOrders.keys().forEach { id ->
                    if (categories.none { it.id == id }) return@forEach
                    val array = jsonOrders.getJSONArray(id)
                    val keys = (0 until array.length()).map(array::getString).distinct()
                    if (keys.isNotEmpty()) orders[id] = keys.toMutableList()
                }
            }
            return CategoryState(categories, assignments, orders)
        }
    }
}

/** Conservative, local rules. Unknown packages stay in Other rather than guessing from labels. */
object OfflineAppClassifier {
    private val knownPackages = mapOf(
        "com.whatsapp" to "communication",
        "com.whatsapp.w4b" to "communication",
        "org.telegram.messenger" to "communication",
        "org.thoughtcrime.securesms" to "communication",
        "com.android.dialer" to "communication",
        "com.google.android.dialer" to "communication",
        "com.android.contacts" to "communication",
        "com.google.android.contacts" to "communication",
        "com.google.android.apps.messaging" to "communication",
        "com.google.android.gm" to "communication",
        "com.fsck.k9" to "communication",
        "net.thunderbird.android" to "communication",
        "com.discord" to "communication",
        "com.Slack" to "communication",
        "com.google.android.youtube" to "media",
        "com.spotify.music" to "media",
        "org.videolan.vlc" to "media",
        "com.google.android.apps.photos" to "media",
        "com.android.camera2" to "media",
        "com.motorola.camera3" to "media",
        "com.google.android.calendar" to "productivity",
        "com.google.android.keep" to "productivity",
        "com.google.android.apps.docs" to "productivity",
        "com.android.settings" to "tools",
        "com.android.chrome" to "tools",
        "org.mozilla.firefox" to "tools",
        "org.mozilla.fenix" to "tools",
        "com.brave.browser" to "tools",
        "com.duckduckgo.mobile.android" to "tools",
        "org.fdroid.fdroid" to "tools",
        "org.fdroid.basic" to "tools",
        "com.aurora.store" to "tools",
        "com.google.android.deskclock" to "tools",
        "com.google.android.calculator" to "tools",
        "com.google.android.apps.nbu.files" to "tools",
        "com.google.android.apps.maps" to "maps",
        "app.organicmaps" to "maps",
        "net.osmand" to "maps",
        "net.osmand.plus" to "maps",
    )

    fun classify(packageName: String, androidCategory: Int): String =
        knownPackages[packageName] ?: when (androidCategory) {
            // android.content.pm.ApplicationInfo.CATEGORY_* values, available since API 26.
            0 -> "games"
            1, 2, 3 -> "media"
            4 -> "communication"
            5 -> "news"
            6 -> "maps"
            7 -> "productivity"
            8 -> "tools"
            else -> CategoryState.OTHER
        }
}
