/*
 * Copyright (C) 2026
 * SPDX-License-Identifier: Apache-2.0
 */
package app.murinelauncher.backup

import android.app.Application
import android.content.Context
import android.content.ContextWrapper
import android.content.SharedPreferences
import android.database.sqlite.SQLiteDatabase
import android.net.Uri
import android.system.Os
import android.system.OsConstants
import com.android.launcher3.LauncherFiles
import com.android.launcher3.LauncherSettings
import com.android.launcher3.model.DeviceGridState
import io.airlift.compress.tar.TarEntry
import io.airlift.compress.tar.TarOutputStream
import org.junit.Assert.*
import org.junit.Rule
import org.junit.Test
import org.junit.Before
import org.junit.rules.TemporaryFolder
import org.junit.runner.RunWith
import org.robolectric.RobolectricTestRunner
import org.robolectric.RuntimeEnvironment
import org.robolectric.shadows.ShadowLog
import org.robolectric.annotation.Config
import org.robolectric.annotation.SQLiteMode
import org.robolectric.annotation.Implements
import org.robolectric.annotation.Implementation
import org.robolectric.shadow.api.Shadow
import org.robolectric.util.ReflectionHelpers.ClassParameter
import java.io.File
import java.io.FileDescriptor
import java.io.IOException
import java.nio.channels.FileChannel
import java.nio.file.Files
import java.nio.file.StandardCopyOption
import java.nio.file.StandardOpenOption
import java.util.concurrent.ConcurrentHashMap
import java.util.zip.ZipEntry
import java.util.zip.ZipOutputStream

@RunWith(RobolectricTestRunner::class)
@Config(sdk = [28], application = Application::class,
    shadows = [RestoreReliabilityTest.DirectoryOsShadow::class])
@SQLiteMode(SQLiteMode.Mode.NATIVE)
class RestoreReliabilityTest {
    @get:Rule val temporary = TemporaryFolder()
    private val prefsName = LauncherFiles.SHARED_PREFERENCES_KEY + ".xml"
    private val allowed = LauncherFiles.GRID_DB_FILES.toSet() + prefsName
    @Before fun logs() {
        ShadowLog.stream = System.out
    }

    // ShadowLinux cannot open directories for fsync.
    @Implements(Os::class)
    class DirectoryOsShadow {
        companion object {
            private val directories = ConcurrentHashMap<FileDescriptor, FileChannel>()

            @JvmStatic @Implementation
            fun open(path: String, flags: Int, mode: Int): FileDescriptor {
                if (File(path).isDirectory && flags == OsConstants.O_RDONLY) {
                    val descriptor = FileDescriptor()
                    directories[descriptor] = FileChannel.open(File(path).toPath(), StandardOpenOption.READ)
                    return descriptor
                }
                return Shadow.directlyOn(Os::class.java, "open",
                    ClassParameter.from(String::class.java, path),
                    ClassParameter.from(Int::class.javaPrimitiveType, flags),
                    ClassParameter.from(Int::class.javaPrimitiveType, mode))
            }

            @JvmStatic @Implementation
            fun fsync(descriptor: FileDescriptor) {
                val directory = directories[descriptor]
                if (directory != null) directory.force(true)
                else Shadow.directlyOn<Void, Os>(Os::class.java, "fsync",
                    ClassParameter.from(FileDescriptor::class.java, descriptor))
            }

            @JvmStatic @Implementation
            fun close(descriptor: FileDescriptor) {
                val directory = directories.remove(descriptor)
                if (directory != null) directory.close()
                else Shadow.directlyOn<Void, Os>(Os::class.java, "close",
                    ClassParameter.from(FileDescriptor::class.java, descriptor))
            }
        }
    }

    private fun move(source: File, target: File) {
        Files.move(source.toPath(), target.toPath(), StandardCopyOption.ATOMIC_MOVE,
            StandardCopyOption.REPLACE_EXISTING)
    }

    private fun database(file: File, title: String = "old") {
        SQLiteDatabase.openOrCreateDatabase(file, null).use { db ->
            LauncherSettings.Favorites.addTableToDb(db, 0, false)
            db.execSQL("INSERT INTO favorites (_id,title,container,itemType,appWidgetId) " +
                "VALUES (1,?,-100,2,-1),(2,?,1,0,-1),(3,?,-100,4,71)",
                arrayOf(title, title, title))
            db.version = 32
        }
    }

    private fun backup(): File {
        val directory = temporary.newFolder()
        database(File(directory, "launcher.db"), "restored")
        BackupValidation.writePreferences(File(directory, prefsName), mapOf(
            DeviceGridState.KEY_DB_FILE to "launcher.db",
            DeviceGridState.KEY_WORKSPACE_SIZE to "4,5",
            DeviceGridState.KEY_HOTSEAT_COUNT to 4,
            "boolean" to true, "set" to setOf("a", "b"), "long" to 4L, "float" to 1.5f))
        return directory
    }

    private fun reject(block: () -> Unit) {
        try {
            block()
            fail("Expected validation/I/O failure")
        } catch (_: IOException) {
        } catch (_: IllegalArgumentException) {
        } catch (_: IllegalStateException) {
        } catch (_: org.xmlpull.v1.XmlPullParserException) {
        } catch (_: android.database.sqlite.SQLiteException) {
        }
    }

    @Test fun validTarAndLegacyZipRoundTripRealDatabase() {
        listOf(false, true).forEach { zip ->
            val source = backup()
            val archive = temporary.newFile()
            if (zip) {
                ZipOutputStream(archive.outputStream()).use { output ->
                    source.listFiles()!!.forEach {
                        output.putNextEntry(ZipEntry(it.name))
                        it.inputStream().use { input -> input.copyTo(output) }
                        output.closeEntry()
                    }
                }
            } else {
                TarOutputStream(archive.outputStream()).use { output ->
                    source.listFiles()!!.forEach {
                        output.putNextEntry(TarEntry(it.name, it.length()))
                        it.inputStream().use { input -> input.copyTo(output) }
                        output.closeEntry()
                    }
                }
            }
            val target = temporary.newFolder()
            BackupValidation.extract(archive, target, allowed, zip)
            BackupValidation.validate(target)
            assertEquals(BackupValidation.readPreferences(File(source, prefsName)),
                BackupValidation.readPreferences(File(target, prefsName)))
            SQLiteDatabase.openDatabase(File(target, "launcher.db").path, null, 0).use { db ->
                db.rawQuery("SELECT container,appWidgetId FROM favorites ORDER BY _id", null).use {
                    assertEquals(3, it.count)
                    it.moveToPosition(1)
                    assertEquals(1, it.getInt(0))
                    it.moveToPosition(2)
                    assertEquals(71, it.getInt(1))
                }
            }
        }
    }

    @Test fun corruptAndIncompleteDatabasesAreRejected() {
        val source = backup()
        File(source, "launcher.db").writeText("not SQLite")
        reject { BackupValidation.validate(source) }
        File(source, "launcher.db").delete()
        reject { BackupValidation.validate(source) }
        SQLiteDatabase.openOrCreateDatabase(File(source, "launcher.db"), null).use {
            it.execSQL("CREATE TABLE favorites (_id INTEGER)")
            it.version = 32
        }
        reject { BackupValidation.validate(source) }
    }

    @Test fun wrongActiveGridAndMalformedPreferencesAreRejected() {
        val source = backup()
        val prefs = File(source, prefsName)
        val values = BackupValidation.readPreferences(prefs)
        values[DeviceGridState.KEY_DB_FILE] = "launcher_4_by_4.db"
        BackupValidation.writePreferences(prefs, values)
        reject { BackupValidation.validate(source) }
        listOf("<map><string name=\"x\">unfinished", "<map><boolean name=\"x\" value=\"maybe\"/></map>",
            "<map><int name=\"x\" value=\"1\"/><int name=\"x\" value=\"2\"/></map>",
            "<map/><map/>").forEach {
            prefs.writeText(it)
            reject { BackupValidation.readPreferences(prefs) }
        }
    }

    @Test fun fullColumnSetWithoutRequiredProfileDefaultIsRejectedBeforeApply() {
        val source = backup()
        SQLiteDatabase.openDatabase(File(source, "launcher.db").path, null, 0).use {
            it.execSQL("ALTER TABLE favorites RENAME TO original")
            it.execSQL("CREATE TABLE favorites AS SELECT * FROM original")
        }
        reject { BackupValidation.validate(source) }
    }

    @Test fun truncatedTarAndZipNeverValidate() {
        listOf(false, true).forEach { zip ->
            val archive = temporary.newFile()
            if (zip) {
                ZipOutputStream(archive.outputStream()).use {
                    it.putNextEntry(ZipEntry(prefsName))
                    it.write("<map/>".toByteArray())
                    it.closeEntry()
                }
            } else {
                TarOutputStream(archive.outputStream()).use {
                    it.putNextEntry(TarEntry(prefsName, 6))
                    it.write("<map/>".toByteArray())
                    it.closeEntry()
                }
            }
            archive.writeBytes(archive.readBytes().copyOf(archive.length().toInt() - 512.coerceAtMost(
                archive.length().toInt() / 2)))
            reject { BackupValidation.extract(archive, temporary.newFolder(), allowed, zip) }
        }
    }

    @Test fun duplicateAndUnsafeArchiveNamesAreRejected() {
        listOf(listOf(prefsName, prefsName), listOf("../$prefsName"), listOf("/$prefsName"),
            listOf(" $prefsName")).forEach {
            val archive = temporary.newFile()
            TarOutputStream(archive.outputStream()).use { tar ->
                it.forEach { name ->
                    tar.putNextEntry(TarEntry(name, 6))
                    tar.write("<map/>".toByteArray())
                    tar.closeEntry()
                }
            }
            reject { BackupValidation.extract(archive, temporary.newFolder(), allowed, false) }
        }
    }

    @Test fun failureAtEveryMoveAndDirectorySyncRestoresExactOriginals() {
        for (failure in 1..24) {
            val root = temporary.newFolder()
            val staging = File(root, "staging").apply { mkdir() }
            val targets = listOf("launcher.db", "launcher.db-wal", "launcher.db-shm",
                "prefs.xml", "prefs.xml.bak", "device-protected.xml", "absent.db")
                .map { File(root, it) }
            targets.dropLast(1).forEachIndexed { index, file -> file.writeText("original-$index") }
            val originals = targets.map { if (it.exists()) it.readBytes() else null }
            val replacement = File(staging, "incoming").apply { writeText("new") }
            var operations = 0
            fun fault() {
                if (++operations == failure) throw IOException("injected")
            }
            val journal = RestoreJournal(staging, targets, { fault() }, { from, to ->
                fault()
                move(from, to)
            })
            try { journal.install(mapOf(targets.first() to replacement, targets.last() to replacement)) }
            catch (_: IOException) { }
            val restarted = RestoreJournal(staging, targets, {}, ::move)
            if (restarted.exists()) {
                restarted.rollback()
                restarted.rollback()
                restarted.cleanup()
            }
            targets.forEachIndexed { index, target ->
                if (originals[index] == null) assertFalse(target.exists())
                else assertArrayEquals(originals[index], target.readBytes())
            }
        }
    }

    @Test fun restartRollbackPreservesRealSqliteFoldersWidgetsAndWal() {
        val root = temporary.newFolder()
        val staging = File(root, "staging").apply { mkdir() }
        val dbFile = File(root, "launcher.db")
        database(dbFile)
        val db = SQLiteDatabase.openDatabase(dbFile.path, null, 0)
        db.enableWriteAheadLogging()
        db.rawQuery("PRAGMA wal_autocheckpoint=0", null).use { it.moveToFirst() }
        db.execSQL("UPDATE favorites SET title='wal-value' WHERE _id=2")
        val wal = File(dbFile.path + "-wal").readBytes()
        val base = dbFile.readBytes()
        db.close()
        dbFile.writeBytes(base)
        File(dbFile.path + "-wal").writeBytes(wal)
        val replacement = File(staging, "incoming.db")
        database(replacement, "new")
        val targets = listOf("", "-wal", "-shm", "-journal").map { File(dbFile.path + it) }
        val journal = RestoreJournal(staging, targets, {}, ::move)
        journal.install(mapOf(dbFile to replacement))
        RestoreJournal(staging, targets, {}, ::move).rollback()
        SQLiteDatabase.openDatabase(dbFile.path, null, 0).use { restored ->
            restored.rawQuery("SELECT title,container,appWidgetId FROM favorites ORDER BY _id",
                null).use {
                assertEquals(3, it.count)
                it.moveToPosition(1)
                assertEquals("wal-value", it.getString(0))
                assertEquals(1, it.getInt(1))
                it.moveToPosition(2)
                assertEquals(71, it.getInt(2))
            }
        }
    }

    @Test fun successfulCommitRetainsReplacementAndCanCleanTwice() {
        val root = temporary.newFolder()
        val staging = File(root, "staging").apply { mkdir() }
        val target = File(root, "live").apply { writeText("old") }
        val incoming = File(staging, "incoming").apply { writeText("new") }
        val journal = RestoreJournal(staging, listOf(target), {}, ::move)
        journal.install(mapOf(target to incoming))
        assertTrue(File(target.path + ".restore-old").exists())
        journal.commit()
        journal.cleanup()
        journal.cleanup()
        assertEquals("new", target.readText())
        assertFalse(File(target.path + ".restore-old").exists())
        assertTrue(incoming.exists())
    }

    private fun context(): Context {
        val root = temporary.newFolder()
        val device = temporary.newFolder()
        fun wrapped(directory: File) = object : ContextWrapper(RuntimeEnvironment.getApplication()) {
            override fun getDataDir() = directory
            override fun getFilesDir() = File(directory, "files").apply { mkdirs() }
            override fun getCacheDir() = File(directory, "cache").apply { mkdirs() }
            override fun getDatabasePath(name: String) =
                File(directory, "databases/$name").also { it.parentFile!!.mkdirs() }
        }
        return object : ContextWrapper(wrapped(root)) {
            override fun createDeviceProtectedStorageContext(): Context = wrapped(device)
        }
    }

    private fun prepareStaging(context: Context) {
        val staged = File(context.filesDir, "murine_restore_staging").apply { mkdir() }
        backup().listFiles()!!.forEach { it.copyTo(File(staged, it.name)) }
    }

    @Test fun startupApplyAndRestartRecoveryPreservePreferencesAndWidgetDatabase() {
        val context = context()
        val live = context.getDatabasePath("launcher.db")
        database(live)
        val prefs = File(context.dataDir, "shared_prefs/$prefsName")
        prefs.parentFile!!.mkdirs()
        prefs.writeText("<map><string name=\"original\">current</string></map>")
        val oldBak = File(prefs.path + ".bak")
        oldBak.writeText("<map><string name=\"original\">backup</string></map>")
        val boot = File(context.createDeviceProtectedStorageContext().dataDir,
            "shared_prefs/boot_aware_prefs.xml")
        boot.parentFile!!.mkdirs()
        boot.writeText("<map><boolean name=\"original\" value=\"true\"/></map>")
        val originals = listOf(live, prefs, oldBak, boot).associateWith { it.readBytes() }
        prepareStaging(context)
        BackupHelper.applyStagedRestoreIfNeeded(context)
        assertTrue(BackupHelper.isRestoreActive())
        assertFalse(oldBak.exists())
        assertFalse(boot.exists())
        assertEquals("launcher.db",
            BackupValidation.readPreferences(prefs)[DeviceGridState.KEY_DB_FILE])
        BackupHelper.applyStagedRestoreIfNeeded(context)
        assertFalse(BackupHelper.isRestoreActive())
        assertFalse(BackupHelper.isRestoreBlocked())
        originals.forEach { (file, bytes) -> assertArrayEquals(bytes, file.readBytes()) }
        BackupHelper.applyStagedRestoreIfNeeded(context)
        originals.forEach { (file, bytes) -> assertArrayEquals(bytes, file.readBytes()) }
    }

    @Test fun failedRollbackBlocksDataAccessWithoutThrowingFromStartup() {
        val context = context()
        database(context.getDatabasePath("launcher.db"))
        prepareStaging(context)
        BackupHelper.applyStagedRestoreIfNeeded(context)
        assertTrue(BackupHelper.isRestoreActive())
        val old = File(context.getDatabasePath("launcher.db").path + ".restore-old")
        val unavailable = File(old.path + ".unavailable")
        move(old, unavailable)
        BackupHelper.applyStagedRestoreIfNeeded(context)
        assertTrue(BackupHelper.isRestoreBlocked())
        assertTrue(unavailable.exists())
        assertTrue(File(context.filesDir, "murine_restore_staging/state").exists())
        move(unavailable, old)
        BackupHelper.applyStagedRestoreIfNeeded(context)
        assertFalse(BackupHelper.isRestoreBlocked())
    }

    @Test fun failedPreferenceCommitKeepsRollbackSource() {
        val context = context()
        val live = context.getDatabasePath("launcher.db")
        database(live)
        val original = live.readBytes()
        prepareStaging(context)
        BackupHelper.applyStagedRestoreIfNeeded(context)
        val realPreferences = RuntimeEnvironment.getApplication()
            .getSharedPreferences("fault", Context.MODE_PRIVATE)
        val failing = object : SharedPreferences by realPreferences {
            override fun edit(): SharedPreferences.Editor {
                val realEditor = realPreferences.edit()
                return object : SharedPreferences.Editor by realEditor {
                    override fun commit() = false
                }
            }
        }
        val failingContext = object : ContextWrapper(context) {
            override fun getSharedPreferences(name: String, mode: Int) = failing
        }
        reject { BackupHelper.commitRestore(failingContext) }
        assertEquals("loading",
            File(context.filesDir, "murine_restore_staging/state").readText())
        assertTrue(File(live.path + ".restore-old").exists())
        BackupHelper.applyStagedRestoreIfNeeded(context)
        assertArrayEquals(original, live.readBytes())
    }

    @Test fun invalidSelectedArchiveDoesNotChangeExistingFiles() {
        val context = context()
        val live = context.getDatabasePath("launcher.db")
        database(live)
        val original = live.readBytes()
        val archive = temporary.newFile().apply { writeText("not an archive") }
        BackupHelper.applyStagedRestoreIfNeeded(context)
        assertFalse(BackupHelper.stageRestore(context, Uri.fromFile(archive)))
        assertArrayEquals(original, live.readBytes())
        assertFalse(File(context.filesDir, "murine_restore_staging").exists())
    }

    @Test fun newerSchemaMissingPreferencesAndTruncatedSqliteAreRejected() {
        val source = backup()
        val db = File(source, "launcher.db")
        SQLiteDatabase.openDatabase(db.path, null, 0).use { it.version = 33 }
        reject { BackupValidation.validate(source) }
        SQLiteDatabase.openDatabase(db.path, null, 0).use { it.version = 32 }
        val prefs = File(source, prefsName)
        val values = prefs.readBytes()
        prefs.delete()
        reject { BackupValidation.validate(source) }
        prefs.writeBytes(values)
        db.writeBytes(db.readBytes().copyOf(100))
        reject { BackupValidation.validate(source) }
    }

    @Test fun interruptedRollbackAlwaysRetainsItsSourceForRetry() {
        for (failure in 1..10) {
            val root = temporary.newFolder()
            val staging = File(root, "staging").apply { mkdir() }
            val targets = (1..3).map { File(root, "$it.db").apply { writeText("old-$it") } }
            val incoming = File(staging, "incoming").apply { writeText("new") }
            RestoreJournal(staging, targets, {}, ::move).install(
                targets.associateWith { incoming })
            var step = 0
            fun fault() {
                if (++step == failure) throw IOException("injected")
            }
            try {
                RestoreJournal(staging, targets, { fault() }, { from, to ->
                    fault()
                    move(from, to)
                }).rollback()
            } catch (_: IOException) { }
            targets.forEach { assertTrue(File(it.path + ".restore-old").exists()) }
            val recovery = RestoreJournal(staging, targets, {}, ::move)
            recovery.rollback()
            recovery.cleanup()
            targets.forEachIndexed { index, file -> assertEquals("old-${index + 1}", file.readText()) }
        }
    }

    @Test fun failedCommitRenameDoesNotDiscardRollbackData() {
        val root = temporary.newFolder()
        val staging = File(root, "staging").apply { mkdir() }
        val live = File(root, "live").apply { writeText("old") }
        val incoming = File(staging, "incoming").apply { writeText("new") }
        RestoreJournal(staging, listOf(live), {}, ::move).install(mapOf(live to incoming))
        val failure = RestoreJournal(staging, listOf(live), {}, { _, _ ->
            throw IOException("rename failed")
        })
        reject { failure.commit() }
        assertEquals("loading", failure.phase())
        RestoreJournal(staging, listOf(live), {}, ::move).rollback()
        assertEquals("old", live.readText())
    }

    @Test
    @Config(sdk = [28, 30])
    fun actualExporterAndStagerRoundTripAndRejectTruncatedZstd() {
        val context = RuntimeEnvironment.getApplication()
        BackupHelper.applyStagedRestoreIfNeeded(context)
        val live = context.getDatabasePath("launcher.db")
        live.parentFile!!.mkdirs()
        database(live)
        context.getSharedPreferences(LauncherFiles.SHARED_PREFERENCES_KEY, 0).edit()
            .putString(DeviceGridState.KEY_DB_FILE, "launcher.db")
            .putString(DeviceGridState.KEY_WORKSPACE_SIZE, "4,5")
            .putInt(DeviceGridState.KEY_HOTSEAT_COUNT, 4)
            .commit()
        val archive = temporary.newFile()
        assertTrue(BackupHelper.backup(context, Uri.fromFile(archive)))
        val truncated = temporary.newFile().apply {
            writeBytes(archive.readBytes().dropLast(1).toByteArray())
        }
        assertFalse(BackupHelper.stageRestore(context, Uri.fromFile(truncated)))
        assertTrue(BackupHelper.stageRestore(context, Uri.fromFile(archive)))
        BackupValidation.validate(File(context.filesDir, "murine_restore_staging"))
        SQLiteDatabase.openDatabase(live.path, null, 0).use {
            it.rawQuery("SELECT appWidgetId FROM favorites WHERE _id=3", null).use { cursor ->
                cursor.moveToFirst()
                assertEquals(71, cursor.getInt(0))
            }
        }
    }
}
