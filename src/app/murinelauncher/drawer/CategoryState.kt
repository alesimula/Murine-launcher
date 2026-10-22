/*
 * Copyright 2026 Murine Categories contributors
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may obtain a copy at https://www.apache.org/licenses/LICENSE-2.0
 * Distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND.
 */
package app.murinelauncher.drawer

import org.json.JSONArray
import org.json.JSONObject

/**
 * Persistent category state. Every catalog category is kept, with its name, icon, manual
 * assignments and order, but only the [selected] ones and Other are shown. Unpicking a
 * category therefore loses nothing: picking it again brings back the user's changes.
 */
class CategoryState(
    /** Every catalog category plus Other, in tab order; Other is always last. */
    val categories: MutableList<Category> = (CATALOG + OTHER).map { Category(it) }.toMutableList(),
    /** Exactly [PICK_COUNT] catalog ids once [confirmed]; before that, a suggestion to start from. */
    val selected: MutableList<String> = mutableListOf(),
    val assignments: MutableMap<String, String> = linkedMapOf(),
    /** Custom app order per category id, as app keys; apps missing from it sort A–Z after it. */
    val orders: MutableMap<String, MutableList<String>> = linkedMapOf(),
    /** False until the user has saved or dismissed the category picker. */
    var confirmed: Boolean = false,
) {
    /** Assignment and orders captured before a move, so Undo restores both exactly. */
    class Snapshot internal constructor(
        val appKey: String,
        val assignment: String?,
        val orders: Map<String, List<String>>,
    )

    data class Category(val id: String, val name: String = "", val icon: String = "") {
        val iconId: String get() = icon.ifEmpty { id }
    }

    /** Selected categories and Other, in tab order. */
    val shown: List<Category> get() = categories.filter { it.id == OTHER || it.id in selected }

    fun isShown(id: String): Boolean = id == OTHER || id in selected

    /** The category an app belongs in before the selection is applied. */
    fun primaryFor(appKey: String, packageName: String, androidCategory: Int): String =
        assignments[appKey] ?: OfflineAppClassifier.classify(packageName, androidCategory)

    /**
     * A manual move wins while its category is shown. Otherwise the app goes to its automatic
     * category, then that category's [FALLBACKS] entry, then Other.
     */
    @JvmOverloads
    fun categoryFor(
        appKey: String, packageName: String, androidCategory: Int,
        selection: Collection<String> = selected,
    ): String {
        assignments[appKey]?.let { if (it == OTHER || it in selection) return it }
        val automatic = OfflineAppClassifier.classify(packageName, androidCategory)
        if (automatic in selection) return automatic
        return FALLBACKS[automatic]?.takeIf { it in selection } ?: OTHER
    }

    /** Saves the user's pick; the tab order of the categories is unchanged. */
    fun select(ids: Collection<String>) {
        require(ids.toSet().size == PICK_COUNT && ids.all { it in CATALOG })
        selected.clear()
        selected.addAll(CATALOG.filter { it in ids })
        confirmed = true
    }

    /** Replaces an unconfirmed selection with [suggest]ions, keeping as much of it as fits. */
    fun preselect(primaries: Collection<String>) {
        val ids = suggest(primaries, selected)
        selected.clear()
        selected.addAll(CATALOG.filter { it in ids })
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

    /** Swaps [id] with the shown tab [delta] places away. Other stays last. */
    fun move(id: String, delta: Int) {
        if (id == OTHER || delta == 0) return
        val tabs = shown.map { it.id }.filter { it != OTHER }
        val index = tabs.indexOf(id)
        if (index < 0) return
        val neighbor = tabs[(index + delta).coerceIn(0, tabs.lastIndex)]
        if (neighbor == id) return
        val category = categories.removeAt(categories.indexOfFirst { it.id == id })
        val target = categories.indexOfFirst { it.id == neighbor }
        categories.add(if (delta > 0) target + 1 else target, category)
    }

    fun encode(): String = JSONObject().apply {
        put("version", 2)
        put("categories", JSONArray().apply {
            categories.forEach { put(JSONObject().put("id", it.id).put("name", it.name).put("icon", it.icon)) }
        })
        put("selected", JSONArray(selected))
        put("confirmed", confirmed)
        put("assignments", JSONObject(assignments as Map<*, *>))
        put("orders", JSONObject().apply { orders.forEach { (id, keys) -> put(id, JSONArray(keys)) } })
    }.toString()

    companion object {
        const val OTHER = "other"
        const val PICK_COUNT = 5

        /** Categories the user can pick from, in their default tab order. */
        val CATALOG = listOf(
            "games", "social", "messaging", "music", "video", "photos", "productivity",
            "news", "maps", "shopping", "finance", "health", "internet", "tools",
        )

        /** Where an app goes when its own category isn't picked; one step, then Other. */
        val FALLBACKS = mapOf(
            "messaging" to "social",
            "social" to "messaging",
            "music" to "video",
            "video" to "music",
            "photos" to "social",
            "news" to "productivity",
            "maps" to "tools",
            "shopping" to "finance",
            "finance" to "shopping",
            "health" to "tools",
            "internet" to "tools",
            "tools" to "productivity",
            "productivity" to "tools",
        )

        val ICON_IDS = CATALOG + OTHER + "folder"

        /** Version 1 built-in ids that survive the move to the catalog. */
        private val LEGACY_IDS = mapOf(
            "games" to "games",
            "communication" to "messaging",
            "media" to "video",
            "productivity" to "productivity",
            "news" to "news",
            "maps" to "maps",
            "tools" to "tools",
            OTHER to OTHER,
        )

        /**
         * The [PICK_COUNT] categories holding the most apps, given each app's primary category.
         * [preferred] ids are taken first, so an upgrade keeps the user's old tabs where it can.
         */
        fun suggest(primaries: Collection<String>, preferred: Collection<String> = emptyList()): List<String> {
            val counts = primaries.groupingBy { it }.eachCount()
            val ranked = CATALOG.sortedByDescending { counts[it] ?: 0 }
            return (ranked.filter { it in preferred } + ranked.filter { it !in preferred })
                .take(PICK_COUNT)
        }

        /** Invalid state is rejected; callers can keep the original data and fall back safely. */
        fun decode(serialized: String): CategoryState {
            if (serialized.isEmpty()) return CategoryState()
            val root = JSONObject(serialized)
            return when (root.getInt("version")) {
                1 -> decodeV1(root)
                2 -> decodeV2(root)
                else -> throw IllegalArgumentException("Unsupported category state")
            }
        }

        private fun decodeV2(root: JSONObject): CategoryState {
            val categories = readCategories(root.getJSONArray("categories")) { it }
            val array = root.getJSONArray("selected")
            val selected = (0 until array.length()).map(array::getString).filter { it in CATALOG }.distinct()
            val confirmed = root.optBoolean("confirmed") && selected.size == PICK_COUNT
            return CategoryState(categories, selected.toMutableList(),
                readAssignments(root) { it }, readOrders(root) { it }, confirmed)
        }

        /**
         * Old built-ins map to their catalog ids and become the suggested pick; custom
         * categories are dropped, and apps moved into them go back to automatic placement.
         */
        private fun decodeV1(root: JSONObject): CategoryState {
            val array = root.getJSONArray("categories")
            val categories = readCategories(array, LEGACY_IDS::get)
            val selected = (0 until array.length())
                .mapNotNull { LEGACY_IDS[array.getJSONObject(it).getString("id")] }
                .filter { it in CATALOG }
            return CategoryState(categories, selected.toMutableList(),
                readAssignments(root, LEGACY_IDS::get), readOrders(root, LEGACY_IDS::get))
        }

        /** Known categories in saved order, then missing catalog entries, then Other. */
        private fun readCategories(array: JSONArray, map: (String) -> String?): MutableList<Category> {
            val saved = (0 until array.length()).mapNotNull { index ->
                val entry = array.getJSONObject(index)
                val id = map(entry.getString("id"))?.takeIf { it in CATALOG || it == OTHER }
                    ?: return@mapNotNull null
                val icon = entry.optString("icon").let { map(it) ?: it }
                Category(id, entry.optString("name"), icon.takeIf { it in ICON_IDS }.orEmpty())
            }
            require(saved.map { it.id }.distinct().size == saved.size)
            val savedIds = saved.map { it.id }.toSet()
            val other = saved.firstOrNull { it.id == OTHER } ?: Category(OTHER)
            return (saved.filter { it.id != OTHER } +
                CATALOG.filter { it !in savedIds }.map { Category(it) } + other).toMutableList()
        }

        private fun readAssignments(root: JSONObject, map: (String) -> String?): MutableMap<String, String> {
            val assignments = linkedMapOf<String, String>()
            val json = root.getJSONObject("assignments")
            json.keys().forEach { key ->
                map(json.getString(key))?.takeIf { it in CATALOG || it == OTHER }
                    ?.let { assignments[key] = it }
            }
            return assignments
        }

        // Older backups have no orders; unknown categories' orders are dropped.
        private fun readOrders(root: JSONObject, map: (String) -> String?): MutableMap<String, MutableList<String>> {
            val orders = linkedMapOf<String, MutableList<String>>()
            root.optJSONObject("orders")?.let { json ->
                json.keys().forEach { savedId ->
                    val id = map(savedId)?.takeIf { it in CATALOG || it == OTHER } ?: return@forEach
                    val array = json.getJSONArray(savedId)
                    val keys = (0 until array.length()).map(array::getString).distinct()
                    if (keys.isNotEmpty()) orders[id] = keys.toMutableList()
                }
            }
            return orders
        }
    }
}

/** Conservative, local rules. Unknown packages stay in Other rather than guessing from labels. */
object OfflineAppClassifier {
    private val knownPackages = buildMap {
        fun add(category: String, vararg packages: String) = packages.forEach { put(it, category) }
        add("messaging",
            "com.whatsapp", "com.whatsapp.w4b", "org.telegram.messenger", "org.telegram.plus",
            "org.thoughtcrime.securesms", "com.facebook.orca", "com.discord", "com.Slack",
            "com.android.dialer", "com.google.android.dialer", "com.android.contacts",
            "com.google.android.contacts", "com.google.android.apps.messaging",
            "com.android.messaging", "com.google.android.gm", "com.microsoft.office.outlook",
            "com.fsck.k9", "net.thunderbird.android", "com.google.android.apps.tachyon",
            "com.microsoft.teams", "com.skype.raider")
        add("social",
            "com.instagram.android", "com.instagram.barcelona", "com.facebook.katana",
            "com.facebook.lite", "com.twitter.android", "com.zhiliaoapp.musically",
            "com.ss.android.ugc.trill", "com.reddit.frontpage", "com.linkedin.android",
            "com.pinterest", "com.snapchat.android", "xyz.blueskyweb.app",
            "org.joinmastodon.android", "com.tumblr", "com.kwai.video")
        add("music",
            "com.spotify.music", "deezer.android.app", "com.google.android.apps.youtube.music",
            "com.soundcloud.android", "com.amazon.mp3", "com.apple.android.music",
            "au.com.shiftyjelly.pocketcasts", "com.shazam.android", "com.aspiro.tidal")
        add("video",
            "com.google.android.youtube", "com.netflix.mediaclient", "com.disney.disneyplus",
            "com.amazon.avod.thirdpartyclient", "com.globo.globotv", "com.wbd.stream",
            "tv.twitch.android.app", "org.videolan.vlc", "is.xyz.mpv", "com.mxtech.videoplayer.ad",
            "com.google.android.videos", "com.crunchyroll.crunchyroid")
        add("photos",
            "com.google.android.apps.photos", "com.android.camera2", "com.motorola.camera3",
            "com.google.android.GoogleCamera", "com.sec.android.app.camera",
            "com.sec.android.gallery3d", "com.adobe.lrmobile", "com.vsco.cam",
            "com.niksoftware.snapseed", "org.fossify.gallery")
        add("productivity",
            "com.google.android.calendar", "com.google.android.keep", "com.google.android.apps.docs",
            "com.google.android.apps.docs.editors.docs", "com.google.android.apps.docs.editors.sheets",
            "com.google.android.apps.docs.editors.slides", "com.google.android.apps.tasks",
            "com.microsoft.office.officehubrow", "com.microsoft.todos", "com.notion.id",
            "com.todoist", "md.obsidian", "com.dropbox.android", "com.microsoft.skydrive",
            "com.canva.editor")
        add("news",
            "com.google.android.apps.magazines", "com.google.android.apps.books",
            "com.amazon.kindle", "flipboard.app", "com.medium.reader", "com.feedly.android",
            "com.nytimes.android", "bbc.mobile.news.ww")
        add("maps",
            "com.google.android.apps.maps", "app.organicmaps", "net.osmand", "net.osmand.plus",
            "com.waze", "com.ubercab", "com.taxis99", "com.booking", "com.airbnb.android",
            "com.latam.app", "br.com.goldenlinhas", "com.azul.android", "com.moovit")
        add("shopping",
            "com.mercadolibre", "com.shopee.br", "com.amazon.mShop.android.shopping",
            "com.alibaba.aliexpresshd", "com.einnovation.temu", "com.zzkko",
            "com.luizalabs.mlapp", "br.com.brainweb.ifood", "com.ubercab.eats",
            "com.olx.br", "com.americanas.app")
        add("finance",
            "com.nu.production", "com.itau", "br.com.intermedium", "com.bradesco",
            "br.com.bb.android", "br.com.gabba.Caixa", "com.santander.app", "com.c6bank.app",
            "com.picpay", "com.mercadopago.wallet", "com.paypal.android.p2pmobile",
            "com.google.android.apps.walletnfcrel", "com.revolut.revolut",
            "com.transferwise.android", "br.com.xp.carteira", "com.btgpactual.pf")
        add("health",
            "com.google.android.apps.fitness", "com.strava", "com.sec.android.app.shealth",
            "com.fitbit.FitbitMobile", "com.myfitnesspal.android", "com.calm.android",
            "com.getsomeheadspace.android", "com.google.android.apps.healthdata")
        add("internet",
            "com.android.chrome", "org.mozilla.firefox", "org.mozilla.fenix",
            "org.mozilla.focus", "com.brave.browser", "com.duckduckgo.mobile.android",
            "com.opera.browser", "com.sec.android.app.sbrowser", "com.microsoft.emmx",
            "com.vivaldi.browser", "org.torproject.torbrowser", "com.android.vending",
            "org.fdroid.fdroid", "org.fdroid.basic", "com.aurora.store")
        add("tools",
            "com.android.settings", "com.google.android.deskclock", "com.android.deskclock",
            "com.google.android.calculator", "com.android.calculator2",
            "com.google.android.apps.nbu.files", "com.google.android.documentsui",
            "com.android.documentsui", "com.google.android.apps.authenticator2",
            "com.google.android.apps.recorder", "com.android.soundrecorder")
    }

    fun classify(packageName: String, androidCategory: Int): String =
        knownPackages[packageName] ?: when (androidCategory) {
            // android.content.pm.ApplicationInfo.CATEGORY_* values, available since API 26.
            0 -> "games"
            1 -> "music"
            2 -> "video"
            3 -> "photos"
            4 -> "social"
            5 -> "news"
            6 -> "maps"
            7 -> "productivity"
            8 -> "tools"
            else -> CategoryState.OTHER
        }
}
