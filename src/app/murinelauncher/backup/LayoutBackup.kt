/*
 * Copyright (C) 2026 The Murine Launcher Authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package app.murinelauncher.backup

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.net.Uri
import android.util.Log
import app.murinelauncher.settings.SettingsHomeFragment
import com.android.launcher3.LauncherFiles
import com.android.launcher3.model.DatabaseHelper
import com.android.launcher3.model.DeviceGridState
import org.json.JSONObject
import org.xmlpull.v1.XmlPullParser
import org.xmlpull.v1.XmlPullParserFactory
import java.io.File
import java.io.StringReader
import java.util.zip.ZipEntry
import java.util.zip.ZipInputStream
import java.util.zip.ZipOutputStream

/**
 * Import / export of the workspace layout as a zip archive.
 *
 * The archive holds the raw Launcher3 workspace database plus the shared
 * preferences file, which is the same shape a Lawnchair backup uses:
 *
 *   launcher.db                      the `favorites` table
 *   com.android.launcher3.prefs.xml  grid size, `pref_appNameMap`
 *
 * Lawnchair is also a Launcher3 fork, so its `.lawnchairbackup` files import
 * directly as long as the schema version matches — no conversion, and deep
 * shortcuts, widgets and work-profile items all survive.
 *
 * An import cannot be applied while the launcher is running: [ModelDbController]
 * holds the database open and would flush its WAL back over the file we just
 * wrote. So [stageImport] parks everything under [STAGING_DIR] and
 * [applyPendingImport] moves it into place from `LauncherApplication.onCreate`,
 * before anything opens the database.
 *
 * Note we deliberately do NOT call `RestoreDbTask.setPending`. Its `sanitizeDB`
 * deletes every row whose `profileId` is not in the restored-profile mapping,
 * and that mapping is only populated by a real Android Backup restore (via
 * ancestral serial numbers). On a same-device import the profile ids are already
 * correct, so sanitizing would silently drop every work-profile item.
 */
object LayoutBackup {

    private const val TAG = "LayoutBackup"

    private const val STAGING_DIR = "pending_layout_import"
    private const val PREFS_ENTRY = "${LauncherFiles.SHARED_PREFERENCES_KEY}.xml"

    /** Set once a staged import is ready; read on the next process start. */
    private const val KEY_PENDING_IMPORT = "pending_layout_import"

    /** Mirrors the private `ModelDbController.EMPTY_DATABASE_CREATED`. */
    private const val EMPTY_DATABASE_CREATED = "EMPTY_DATABASE_CREATED"

    /** Lawnchair / Launcher3 grid prefs, carried across verbatim. */
    private const val KEY_SRC_COLUMNS = "pref_workspaceColumns"
    private const val KEY_SRC_ROWS = "pref_workspaceRows"

    /** Preference keys worth carrying over from a foreign backup. */
    private val PORTABLE_PREF_KEYS = listOf(
        "pref_appNameMap",      // per-app custom labels; identical format in Lawnchair
        "pref_instanceLabelMap",
        "themed_icons",
        "pref_allowRotation",
        "pref_add_icon_to_home",
    )

    class ImportError(message: String) : Exception(message)

    /** What an archive contains, for the confirmation dialog. */
    data class Summary(
        val items: Int,
        val folders: Int,
        val widgets: Int,
        val shortcuts: Int,
        val pages: Int,
        val columns: Int,
        val rows: Int,
        val customLabels: Int,
    )

    // ---------------------------------------------------------------- export

    fun export(context: Context, uri: Uri) {
        val dbFile = context.getDatabasePath(LauncherFiles.LAUNCHER_DB)
        if (!dbFile.exists()) throw ImportError("No workspace database to export")

        // Fold the write-ahead log back into the main file so the copy is whole.
        checkpoint(dbFile)

        context.contentResolver.openOutputStream(uri).use { out ->
            ZipOutputStream(requireNotNull(out)).use { zip ->
                zip.putNextEntry(ZipEntry(LauncherFiles.LAUNCHER_DB))
                dbFile.inputStream().use { it.copyTo(zip) }
                zip.closeEntry()

                val prefsFile = sharedPrefsFile(context)
                if (prefsFile.exists()) {
                    zip.putNextEntry(ZipEntry(PREFS_ENTRY))
                    prefsFile.inputStream().use { it.copyTo(zip) }
                    zip.closeEntry()
                }
            }
        }
    }

    // ---------------------------------------------------------------- import

    /**
     * Unpack [uri] into the staging directory and validate it. Nothing outside
     * the staging directory is touched, so a failure here leaves the current
     * layout intact. Returns a summary of what will be imported.
     */
    fun stageImport(context: Context, uri: Uri): Summary {
        val staging = File(context.filesDir, STAGING_DIR)
        staging.deleteRecursively()
        staging.mkdirs()

        var db: File? = null
        var prefsXml: String? = null

        try {
            context.contentResolver.openInputStream(uri).use { input ->
                ZipInputStream(requireNotNull(input)).use { zip ->
                    while (true) {
                        val entry = zip.nextEntry ?: break
                        when (sanitizedName(entry)) {
                            LauncherFiles.LAUNCHER_DB -> {
                                db = File(staging, LauncherFiles.LAUNCHER_DB)
                                    .also { f -> f.outputStream().use { zip.copyTo(it) } }
                            }
                            PREFS_ENTRY -> prefsXml = zip.readBytes().toString(Charsets.UTF_8)
                        }
                        zip.closeEntry()
                    }
                }
            }
        } catch (e: Exception) {
            staging.deleteRecursively()
            throw ImportError("Could not read the archive: ${e.message}")
        }

        val dbFile = db ?: run {
            staging.deleteRecursively()
            throw ImportError("Archive has no ${LauncherFiles.LAUNCHER_DB}")
        }

        val summary = try {
            inspect(dbFile, prefsXml)
        } catch (e: Exception) {
            staging.deleteRecursively()
            throw if (e is ImportError) e else ImportError("Invalid workspace database: ${e.message}")
        }

        // Keep only the preference keys we understand. Copying the whole file
        // would import a foreign DeviceGridState (Lawnchair records its own
        // `migration_src_db_file`), which sends Launcher3 looking for a
        // database that does not exist here.
        prefsXml?.let { xml ->
            val carried = readPrefStrings(xml).filterKeys { it in PORTABLE_PREF_KEYS }
            if (carried.isNotEmpty()) {
                val obj = JSONObject()
                carried.forEach { (key, value) -> obj.put(key, value) }
                File(staging, "prefs.json").writeText(obj.toString())
            }
        }
        File(staging, "grid").writeText("${summary.columns},${summary.rows}")
        return summary
    }

    /**
     * Arm the staged import. Split from [stageImport] so that dying between the
     * file picker and the confirmation dialog leaves an inert staging directory
     * rather than an import nobody agreed to.
     */
    fun commitPendingImport(context: Context) {
        if (!File(context.filesDir, STAGING_DIR).exists()) return
        prefs(context).edit().putBoolean(KEY_PENDING_IMPORT, true).commit()
    }

    /**
     * Move a staged import into place. Must run before anything opens the
     * workspace database — see `LauncherApplication.onCreate`.
     */
    @JvmStatic
    fun applyPendingImport(context: Context) {
        val prefs = prefs(context)
        if (!prefs.getBoolean(KEY_PENDING_IMPORT, false)) return

        // Clear the flag first. A crash mid-apply must not wedge the launcher
        // into retrying a bad import on every launch.
        prefs.edit().remove(KEY_PENDING_IMPORT).commit()

        val staging = File(context.filesDir, STAGING_DIR)
        val staged = File(staging, LauncherFiles.LAUNCHER_DB)
        if (!staged.exists()) {
            staging.deleteRecursively()
            return
        }

        try {
            val target = context.getDatabasePath(LauncherFiles.LAUNCHER_DB)
            target.parentFile?.mkdirs()
            staged.inputStream().use { input ->
                target.outputStream().use { input.copyTo(it) }
            }
            // Stale journal files would be replayed over the database we just wrote.
            File(target.path + "-wal").delete()
            File(target.path + "-shm").delete()
            File(target.path + "-journal").delete()

            val editor = prefs.edit()

            // Select the grid the backup was laid out on. Cells are stored as
            // absolute (cellX, cellY), so importing a 5x6 workspace onto a 4x5
            // grid would push everything off the right and bottom edges.
            File(staging, "grid").takeIf { it.exists() }?.readText()?.split(",")?.let { (c, r) ->
                editor.putInt(SettingsHomeFragment.GRID_SIZE_WIDTH, c.toInt())
                editor.putInt(SettingsHomeFragment.GRID_SIZE_HEIGHT, r.toInt())
                editor.putString(DeviceGridState.KEY_WORKSPACE_SIZE, "$c,$r")
            }
            // `DeviceGridState.isCompatible` compares nothing but the db file, so
            // recording ours is what stops GridSizeMigrationDBController from
            // reflowing the workspace we just imported.
            editor.putString(DeviceGridState.KEY_DB_FILE, LauncherFiles.LAUNCHER_DB)

            // Set while a fresh install builds its database. Left standing,
            // `loadDefaultFavoritesIfNecessary` would lay the stock workspace
            // over the import on the very next load.
            editor.putBoolean(EMPTY_DATABASE_CREATED, false)

            File(staging, "prefs.json").takeIf { it.exists() }?.readText()?.let { json ->
                val obj = JSONObject(json)
                for (key in obj.keys()) {
                    if (key == "pref_appNameMap" || key == "pref_instanceLabelMap") {
                        editor.putString(key, mergeLabelMap(prefs.getString(key, "{}"), obj.getString(key)))
                    } else when (val v = obj.get(key)) {
                        is Boolean -> editor.putBoolean(key, v)
                        is Int -> editor.putInt(key, v)
                        is String -> editor.putString(key, v)
                        else -> Log.w(TAG, "skipping $key of unsupported type")
                    }
                }
            }
            editor.commit()
            Log.i(TAG, "applied staged layout import")
        } catch (e: Exception) {
            Log.e(TAG, "failed to apply staged layout import", e)
        } finally {
            staging.deleteRecursively()
        }
    }

    fun hasPendingImport(context: Context) = prefs(context).getBoolean(KEY_PENDING_IMPORT, false)

    fun discardPendingImport(context: Context) {
        prefs(context).edit().remove(KEY_PENDING_IMPORT).commit()
        File(context.filesDir, STAGING_DIR).deleteRecursively()
    }

    // --------------------------------------------------------------- helpers

    /**
     * Read the archive's workspace and reject anything the model could not load.
     * A newer schema cannot be downgraded; an older one is fine because
     * [DatabaseHelper] will run its own upgrade path.
     */
    private fun inspect(dbFile: File, prefsXml: String?): Summary {
        SQLiteDatabase.openDatabase(dbFile.path, null, SQLiteDatabase.OPEN_READONLY).use { db ->
            if (db.version > DatabaseHelper.SCHEMA_VERSION) {
                throw ImportError(
                    "Backup uses workspace schema v${db.version}, this launcher understands " +
                        "v${DatabaseHelper.SCHEMA_VERSION}. It was made by a newer launcher."
                )
            }
            db.rawQuery(
                "select name from sqlite_master where type='table' and name='favorites'", null
            ).use { if (!it.moveToFirst()) throw ImportError("Archive has no `favorites` table") }

            fun count(where: String) = db.rawQuery("select count(*) from favorites where $where", null)
                .use { it.moveToFirst(); it.getInt(0) }

            val columns = readInt(prefsXml, KEY_SRC_COLUMNS)
                ?: (db.rawQuery("select max(cellX) from favorites where container=-100", null)
                    .use { it.moveToFirst(); it.getInt(0) } + 1)
            val rows = readInt(prefsXml, KEY_SRC_ROWS)
                ?: (db.rawQuery("select max(cellY) from favorites where container=-100", null)
                    .use { it.moveToFirst(); it.getInt(0) } + 1)
            val pages = db.rawQuery(
                "select count(distinct screen) from favorites where container=-100", null
            ).use { it.moveToFirst(); it.getInt(0) }

            val labels = prefsXml?.let { xml ->
                readPrefStrings(xml)["pref_appNameMap"]?.let { JSONObject(it as String).length() }
            } ?: 0

            return Summary(
                items = count("itemType in (0, 1)"),
                folders = count("itemType = 2"),
                widgets = count("itemType in (4, 5)"),
                shortcuts = count("itemType = 6"),
                pages = pages,
                columns = columns,
                rows = rows,
                customLabels = labels,
            )
        }
    }

    /** Union of two `pref_appNameMap`-style JSON objects; the import wins on conflict. */
    private fun mergeLabelMap(existing: String?, incoming: String): String {
        val merged = JSONObject(existing?.takeIf { it.isNotBlank() } ?: "{}")
        val add = JSONObject(incoming)
        for (key in add.keys()) merged.put(key, add.getString(key))
        return merged.toString()
    }

    /**
     * Pull `<string>`, `<int>` and `<boolean>` entries out of a SharedPreferences
     * XML file. We parse rather than copy so a foreign backup cannot smuggle in
     * keys the launcher would misread.
     */
    private fun readPrefStrings(xml: String): Map<String, Any> {
        val out = mutableMapOf<String, Any>()
        val parser = XmlPullParserFactory.newInstance().newPullParser()
        parser.setInput(StringReader(xml))
        var event = parser.eventType
        while (event != XmlPullParser.END_DOCUMENT) {
            if (event == XmlPullParser.START_TAG) {
                val name = parser.getAttributeValue(null, "name")
                if (name != null) when (parser.name) {
                    "string" -> parser.nextText()?.let { out[name] = it }
                    "int" -> parser.getAttributeValue(null, "value")?.toIntOrNull()?.let { out[name] = it }
                    "boolean" -> parser.getAttributeValue(null, "value")?.let { out[name] = it == "true" }
                }
            }
            event = parser.next()
        }
        return out
    }

    private fun readInt(xml: String?, key: String): Int? =
        xml?.let { readPrefStrings(it)[key] as? Int }

    /** Zip entries may carry directory components; we only ever want the leaf. */
    private fun sanitizedName(entry: ZipEntry) = entry.name.substringAfterLast('/')

    private fun checkpoint(dbFile: File) {
        try {
            SQLiteDatabase.openDatabase(dbFile.path, null, SQLiteDatabase.OPEN_READWRITE).use {
                it.rawQuery("pragma wal_checkpoint(TRUNCATE)", null).use { c -> c.moveToFirst() }
            }
        } catch (e: Exception) {
            Log.w(TAG, "wal checkpoint failed; exporting anyway", e)
        }
    }

    private fun sharedPrefsFile(context: Context) =
        File(context.dataDir, "shared_prefs/$PREFS_ENTRY")

    private fun prefs(context: Context) = context.applicationContext
        .getSharedPreferences(LauncherFiles.SHARED_PREFERENCES_KEY, Context.MODE_PRIVATE)
}
