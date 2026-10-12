/*
 * Copyright (C) 2026
 * SPDX-License-Identifier: Apache-2.0
 */
package app.murinelauncher.backup

import android.database.sqlite.SQLiteDatabase
import android.util.Xml
import com.android.launcher3.LauncherFiles
import com.android.launcher3.model.DatabaseHelper
import com.android.launcher3.model.DeviceGridState
import org.xmlpull.v1.XmlPullParser
import java.io.File
import java.io.FileOutputStream
import java.io.IOException
import java.io.InputStream
import java.util.zip.CRC32
import java.util.zip.ZipFile

internal object BackupValidation {
    const val MAX_BYTES = 128L * 1024 * 1024
    private const val MAX_ENTRIES = 64

    fun extract(archive: File, destination: File, allowed: Set<String>, zip: Boolean) {
        val seen = mutableSetOf<String>()
        var total = 0L
        fun entry(name: String, size: Long, input: InputStream, crc: Long? = null) {
            require(seen.size < MAX_ENTRIES && seen.add(name)) { "Duplicate/excess backup entries" }
            require(name in allowed && size in 0..MAX_BYTES) { "Invalid backup entry" }
            total += size
            require(total <= MAX_BYTES) { "Backup too large" }
            val checksum = CRC32()
            FileOutputStream(File(destination, name)).use { out ->
                val buffer = ByteArray(8192)
                var remaining = size
                while (remaining > 0) {
                    val count = input.read(buffer, 0, minOf(buffer.size.toLong(), remaining).toInt())
                    if (count <= 0) throw IOException("Truncated backup entry")
                    out.write(buffer, 0, count)
                    checksum.update(buffer, 0, count)
                    remaining -= count
                }
                out.fd.sync()
            }
            require(crc == null || crc == checksum.value) { "Backup checksum mismatch" }
        }
        if (zip) {
            ZipFile(archive).use { file ->
                file.entries().asSequence().forEach { item ->
                    require(!item.isDirectory)
                    file.getInputStream(item).use {
                        entry(item.name, item.size, it, item.crc)
                        require(it.read() == -1)
                    }
                }
            }
        } else {
            archive.inputStream().buffered().use { input ->
                fun block(): ByteArray {
                    val block = ByteArray(512)
                    var offset = 0
                    while (offset < block.size) {
                        val count = input.read(block, offset, block.size - offset)
                        if (count < 0) throw IOException("Truncated tar archive")
                        offset += count
                    }
                    return block
                }
                fun ByteArray.text(start: Int, size: Int, trim: Boolean = true): String {
                    val text = copyOfRange(start, start + size).toString(Charsets.US_ASCII)
                        .substringBefore('\u0000')
                    return if (trim) text.trim() else text
                }
                while (true) {
                    val header = block()
                    if (header.all { it == 0.toByte() }) {
                        require(block().all { it == 0.toByte() }) { "Missing tar footer" }
                        while (true) {
                            val value = input.read()
                            if (value < 0) break
                            require(value == 0) { "Unexpected tar trailing data" }
                        }
                        break
                    }
                    val expected = header.text(148, 8).toLong(8)
                    val actual = header.indices.sumOf {
                        if (it in 148..155) 32L else (header[it].toInt() and 255).toLong()
                    }
                    require(expected == actual) { "Invalid tar checksum" }
                    require(header[156] == 0.toByte() || header[156] == '0'.code.toByte())
                    require(header.text(345, 155, false).isEmpty()) { "Unsupported tar path" }
                    val size = header.text(124, 12).toLong(8)
                    entry(header.text(0, 100, false), size, input)
                    repeat(((512 - size % 512) % 512).toInt()) {
                        require(input.read() == 0) { "Invalid tar padding" }
                    }
                }
            }
        }
    }

    fun readPreferences(file: File): MutableMap<String, Any> {
        require(file.length() <= 8 * 1024 * 1024) { "Preferences too large" }
        val result = linkedMapOf<String, Any>()
        file.inputStream().use { input ->
            val parser = Xml.newPullParser()
            parser.setInput(input, "UTF-8")
            require(parser.nextTag() == XmlPullParser.START_TAG && parser.name == "map")
            while (parser.nextTag() == XmlPullParser.START_TAG) {
                val type = parser.name
                val name = requireNotNull(parser.getAttributeValue(null, "name"))
                require(name !in result) { "Duplicate preference" }
                val value = parser.getAttributeValue(null, "value")
                result[name] = when (type) {
                    "string" -> parser.nextText()
                    "set" -> {
                        val values = linkedSetOf<String>()
                        while (parser.nextTag() == XmlPullParser.START_TAG) {
                            require(parser.name == "string")
                            values.add(parser.nextText())
                        }
                        require(parser.name == "set")
                        values
                    }
                    else -> {
                        val scalar: Any = when (type) {
                            "boolean" -> when (value) {
                                "true" -> true
                                "false" -> false
                                else -> throw IOException("Invalid boolean preference")
                            }
                            "int" -> requireNotNull(value).toInt()
                            "long" -> requireNotNull(value).toLong()
                            "float" -> requireNotNull(value).toFloat().also { require(it.isFinite()) }
                            else -> throw IOException("Unsupported preference type")
                        }
                        require(parser.nextTag() == XmlPullParser.END_TAG && parser.name == type)
                        scalar
                    }
                }
            }
            require(parser.eventType == XmlPullParser.END_TAG && parser.name == "map")
            while (parser.next() != XmlPullParser.END_DOCUMENT) {
                require(parser.eventType == XmlPullParser.TEXT && parser.isWhitespace)
            }
        }
        return result
    }

    fun writePreferences(file: File, values: Map<String, Any>) {
        FileOutputStream(file).use { output ->
            val xml = Xml.newSerializer()
            xml.setOutput(output, "UTF-8")
            xml.startDocument("UTF-8", true)
            xml.startTag(null, "map")
            values.forEach { (name, value) ->
                val type = when (value) {
                    is String -> "string"
                    is Boolean -> "boolean"
                    is Int -> "int"
                    is Long -> "long"
                    is Float -> "float"
                    is Set<*> -> "set"
                    else -> throw IOException("Unsupported preference type")
                }
                xml.startTag(null, type).attribute(null, "name", name)
                when (value) {
                    is String -> xml.text(value)
                    is Set<*> -> value.forEach {
                        require(it is String)
                        xml.startTag(null, "string").text(it).endTag(null, "string")
                    }
                    else -> xml.attribute(null, "value", value.toString())
                }
                xml.endTag(null, type)
            }
            xml.endTag(null, "map")
            xml.endDocument()
            xml.flush()
            output.fd.sync()
        }
    }

    fun validate(directory: File) {
        val preferences = readPreferences(
            File(directory, LauncherFiles.SHARED_PREFERENCES_KEY + ".xml"))
        val active = preferences[DeviceGridState.KEY_DB_FILE]
        require(active is String && active in LauncherFiles.GRID_DB_FILES
                && File(directory, active).isFile) { "Active grid database missing" }
        val size = preferences[DeviceGridState.KEY_WORKSPACE_SIZE]
        require(size is String && size.matches(Regex("[1-9][0-9]*,[1-9][0-9]*")))
        require(size.split(',').all { it.toInt() in 1..100 }) { "Invalid grid dimensions" }
        require(preferences[DeviceGridState.KEY_HOTSEAT_COUNT] is Int
                && (preferences[DeviceGridState.KEY_HOTSEAT_COUNT] as Int) in 1..100)
        listOf(DeviceGridState.KEY_DEVICE_TYPE, DeviceGridState.KEY_GRID_TYPE).forEach {
            require(it !in preferences || preferences[it] is Int) { "Invalid grid metadata" }
        }
        directory.listFiles()!!.filter { it.extension == "xml" }.forEach(::readPreferences)
        LauncherFiles.GRID_DB_FILES.map { File(directory, it) }.filter(File::exists).forEach {
            validateDatabase(it)
        }
    }

    private fun validateDatabase(file: File) {
        SQLiteDatabase.openDatabase(file.path, null,
            SQLiteDatabase.OPEN_READWRITE or SQLiteDatabase.NO_LOCALIZED_COLLATORS,
            { throw IOException("Corrupt backup database") }).use { db ->
            db.rawQuery("PRAGMA integrity_check", null).use {
                require(it.moveToFirst() && it.getString(0) == "ok" && !it.moveToNext()) {
                    "Backup database integrity check failed"
                }
            }
            require(db.version in 12..DatabaseHelper.SCHEMA_VERSION) {
                "Backup requires a compatible launcher version"
            }
            db.rawQuery("SELECT name FROM sqlite_master WHERE type IN ('view','trigger')",
                null).use { require(!it.moveToFirst()) { "Unexpected database schema objects" } }
            val columns = mutableSetOf<String>()
            db.rawQuery("PRAGMA table_info(favorites)", null).use {
                while (it.moveToNext()) {
                    val name = it.getString(1)
                    columns.add(name)
                    if (name == "profileId" && db.version >= 20) {
                        require(it.getString(4)?.toLongOrNull() != null) {
                            "Missing default profile in favorites schema"
                        }
                    }
                }
            }
            val required = mutableSetOf("_id", "title", "intent", "container", "screen",
                "cellX", "cellY", "spanX", "spanY", "itemType", "appWidgetId", "icon")
            if (db.version >= 14) required.add("appWidgetProvider")
            if (db.version >= 15) required.add("modified")
            if (db.version >= 16) required.add("restored")
            if (db.version >= 20) required.add("profileId")
            if (db.version >= 21) required.add("rank")
            if (db.version >= 23) required.add("options")
            if (db.version >= 29) required.add("appWidgetSource")
            if (db.version <= 31) {
                required.add("iconPackage")
                required.add("iconResource")
            }
            require(columns.containsAll(required)) { "Incomplete favorites schema" }
            db.rawQuery("SELECT _id FROM favorites WHERE _id IS NULL OR _id < 0 " +
                "UNION ALL SELECT _id FROM favorites GROUP BY _id HAVING COUNT(*) > 1", null).use {
                require(!it.moveToFirst()) { "Invalid favorite IDs" }
            }
            db.rawQuery("SELECT f._id FROM favorites f LEFT JOIN favorites p ON " +
                "f.container=p._id WHERE f.container >= 0 AND " +
                "(p._id IS NULL OR p.itemType NOT IN (2,10)) LIMIT 1", null).use {
                require(!it.moveToFirst()) { "Missing favorite container" }
            }
            if (db.version <= 27) {
                db.rawQuery("SELECT _id, screenRank FROM workspaceScreens LIMIT 0", null).close()
            }
        }
    }
}
