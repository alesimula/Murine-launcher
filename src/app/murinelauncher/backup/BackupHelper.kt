package app.murinelauncher.backup

import android.content.Context
import android.content.SharedPreferences
import android.database.sqlite.SQLiteDatabase
import android.net.Uri
import android.os.Build
import android.system.Os
import android.system.OsConstants
import android.util.Log
import android.widget.Toast
import androidx.annotation.WorkerThread
import app.murinelauncher.icons.IconPackManager
import com.android.launcher3.LauncherFiles
import com.android.launcher3.LauncherPrefs
import com.android.launcher3.LauncherSettings
import com.android.launcher3.R
import com.android.launcher3.model.DeviceGridState
import com.android.launcher3.provider.RestoreDbTask
import io.airlift.compress.tar.TarEntry
import io.airlift.compress.tar.TarOutputStream
import io.airlift.compress.zstd.ZstdInputStream
import io.airlift.compress.zstd.ZstdOutputStream
import java.io.BufferedInputStream
import java.io.File
import java.io.FileOutputStream
import java.io.IOException
import java.nio.file.Files
import java.nio.file.StandardCopyOption

/**
 * Local backup ("*.rat", a zstd-compressed archive) of the same file set AOSP cloud backup uses;
 * Stages the restore, restarts the application and loads the backup through [RestoreDbTask].
 */
object BackupHelper {

    private const val TAG = "BackupHelper"
    private const val STAGING_DIR = "murine_restore_staging"
    private const val TMP_PREFS = "murine_backup_tmp_prefs"
    private const val DOWNGRADE_JSON = "downgrade_schema.json"
    private const val MAIN_PREFS_XML = LauncherFiles.SHARED_PREFERENCES_KEY + ".xml"
    @Volatile private var restoreActive = false
    @Volatile private var restoreBlocked = false
    private var restoreFailed = false

    @JvmStatic fun isRestoreActive() = restoreActive
    @JvmStatic fun isRestoreBlocked() = restoreBlocked
    // Current implementation only supports level 1 to 4, default is 2
    // NOTE: maybe set to 2 instead if backup grows bigger in the future (e.g. inserts a preview image) to execute faster
    private const val ZSTD_COMPRESSION_LEVEL = 3

    /** Backed up prefs; IMPORTANT: also check backupscheme.xml **/
    private val PREF_FILES = listOf(
        LauncherFiles.SHARED_PREFERENCES_KEY,
        IconPackManager.PREFS_DB_ICON_OVERRIDE,
    )

    /**
     * Writes the backup tar to [uri] (SAF, no storage permission). To be called on MODEL_EXECUTOR.
     */
    @WorkerThread
    fun backup(context: Context, uri: Uri): Boolean = try {
        val snap = File(context.cacheDir, "backup_snapshot").apply { deleteRecursively(); mkdirs() }
        // Snapshot databases, then scrub redundant blobs from the (private) snapshot copy
        LauncherFiles.GRID_DB_FILES.map(context::getDatabasePath).filter(File::exists).forEach { db ->
            val snapshot = File(snap, db.name)
            snapshotDatabase(db, snapshot)
            SQLiteDatabase.openDatabase(snapshot.path, null, SQLiteDatabase.OPEN_READWRITE).use { snapshotDb ->
                // Scrub statements' potential failures are catched individually
                listOf(
                    // Only keep legacy shortcuts' icons (their custom bitmap can exist nowhere else)
                    "UPDATE favorites SET icon = NULL WHERE itemType != 1",
                    // Migration scratch tables
                    "DROP TABLE IF EXISTS " + LauncherSettings.Favorites.HYBRID_HOTSEAT_BACKUP_TABLE,
                    "DROP TABLE IF EXISTS " + LauncherSettings.Favorites.TMP_TABLE,
                    // Rewrite the file so the freed pages are actually gone from the backup
                    "VACUUM"
                ).forEach { sql -> try {
                    snapshotDb.execSQL(sql)
                } catch (e: Exception) {
                    Log.w(TAG, "Scrub statement skipped for " + db.name + ": " + sql, e)
                }}
            }
        }
        // Add all files to archive; each pref file is dumped through a temp SharedPreferences
        context.contentResolver.openOutputStream(uri, "wt")!!
            .let { ZstdOutputStream(it, ZSTD_COMPRESSION_LEVEL) }.let(::TarOutputStream).use { tar ->
            snap.listFiles()!!.forEach { tar.add(it.name, it) }
            PREF_FILES.forEach { name ->
                context.getSharedPreferences(TMP_PREFS, Context.MODE_PRIVATE).edit().clear().also { ed ->
                    context.getSharedPreferences(name, Context.MODE_PRIVATE).all.forEach { (k, v) -> ed.putAny(k, v) }
                }.commit().also { check(it) { "Cannot write backup preferences" } }
                tar.add("$name.xml", prefsFile(context, TMP_PREFS))
            }
            File(context.filesDir, DOWNGRADE_JSON).takeIf(File::exists)
                ?.let { tar.add(DOWNGRADE_JSON, it) }
        }
        snap.deleteRecursively()
        context.deleteSharedPreferences(TMP_PREFS)
        true
    } catch (e: Exception) {
        Log.e(TAG, "Backup failed", e)
        false
    }

    /**
     * Unzips [uri] into a staging dir and validates it;
     * Restarts the process on success, [applyStagedRestoreIfNeeded] is called on restart.
     */
    @WorkerThread
    fun stageRestore(context: Context, uri: Uri): Boolean = try {
        check(!restoreActive && !restoreBlocked && !stagingDir(context).exists()) {
            "A restore is already pending"
        }
        val tmp = tmpStagingDir(context)
        deleteStagingWithStateLast(tmp)
        check(tmp.mkdirs()) { "Cannot create restore staging directory" }
        val archive = File(tmp, "archive")
        var zip = false
        BufferedInputStream(requireNotNull(context.contentResolver.openInputStream(uri))).use { src ->
            BufferedInputStream(src.decompressed()).use { input ->
                zip = input.isZip()
                FileOutputStream(archive).use { output ->
                    val buffer = ByteArray(8192)
                    var total = 0L
                    while (true) {
                        val count = input.read(buffer)
                        if (count < 0) break
                        total += count
                        require(total <= BackupValidation.MAX_BYTES) { "Backup too large" }
                        output.write(buffer, 0, count)
                    }
                    output.fd.sync()
                }
            }
        }
        val allowed = LauncherFiles.GRID_DB_FILES.toSet() +
            PREF_FILES.map { "$it.xml" } + DOWNGRADE_JSON
        BackupValidation.extract(archive, tmp, allowed, zip)
        BackupValidation.validate(tmp)
        check(archive.delete())
        syncDirectory(tmp)
        move(tmp, stagingDir(context))
        syncDirectory(context.filesDir)
        true
    } catch (e: Exception) {
        Log.e(TAG, "Staging restore failed (${e.javaClass.simpleName})")
        false
    }

    fun applyStagedRestoreIfNeeded(context: Context) {
        restoreActive = false
        restoreBlocked = false
        restoreFailed = false
        val staging = stagingDir(context)
        if (!staging.exists()) return
        val journal = journal(context)
        if (journal.exists()) {
            try {
                if (journal.phase() != "committed") {
                    journal.rollback()
                    restoreFailed = true
                }
                journal.cleanup()
                deleteStagingWithStateLast(staging)
            } catch (e: Exception) {
                restoreFailed = true
                restoreBlocked = !isTerminal(journal)
                Log.e(TAG, "Restore recovery deferred (${e.javaClass.simpleName})")
            }
            return
        }
        try {
            BackupValidation.validate(staging)
            val main = BackupValidation.readPreferences(File(staging, MAIN_PREFS_XML))
            main.keys.removeAll { it.startsWith("EMPTY_DATABASE_CREATED") }
            main[RestoreDbTask.RESTORED_DEVICE_TYPE] =
                main[DeviceGridState.KEY_DEVICE_TYPE] ?: 0
            main.remove(RestoreDbTask.APPWIDGET_IDS)
            main.remove(RestoreDbTask.APPWIDGET_OLD_IDS)
            val preparedMain = File(staging, "prepared-main")
            BackupValidation.writePreferences(preparedMain, main)
            val deviceFile = prefsFile(context, LauncherFiles.DEVICE_PREFERENCES_KEY)
            val deviceBackup = File(deviceFile.path + ".bak")
            val device = when {
                deviceBackup.exists() -> BackupValidation.readPreferences(deviceBackup)
                deviceFile.exists() -> BackupValidation.readPreferences(deviceFile)
                else -> mutableMapOf()
            }
            device["restore_user_initiated"] = true
            device[RestoreDbTask.FIRST_LOAD_AFTER_RESTORE_KEY] = true
            val preparedDevice = File(staging, "prepared-device")
            BackupValidation.writePreferences(preparedDevice, device)
            val replacements = linkedMapOf<File, File>()
            LauncherFiles.GRID_DB_FILES.forEach { name ->
                File(staging, name).takeIf(File::exists)?.let {
                    replacements[context.getDatabasePath(name)] = it
                }
            }
            PREF_FILES.forEach { name ->
                File(staging, "$name.xml").takeIf(File::exists)?.let {
                    replacements[prefsFile(context, name)] = it
                }
            }
            replacements[prefsFile(context, LauncherFiles.SHARED_PREFERENCES_KEY)] = preparedMain
            replacements[deviceFile] = preparedDevice
            journal.install(replacements)
            restoreActive = true
        } catch (e: Exception) {
            Log.e(TAG, "Applying restore failed (${e.javaClass.simpleName})")
            restoreFailed = true
            try {
                if (journal.exists()) {
                    journal.rollback()
                    journal.cleanup()
                }
                deleteStagingWithStateLast(staging)
            } catch (rollback: Exception) {
                restoreBlocked = journal.exists() && !isTerminal(journal)
                Log.e(TAG, "Restore recovery blocked (${rollback.javaClass.simpleName})")
            }
        }
    }

    private fun isTerminal(journal: RestoreJournal): Boolean = try {
        journal.phase() in listOf("committed", "rolled-back")
    } catch (_: IOException) {
        false
    }

    @JvmStatic fun commitRestore(context: Context) {
        if (!restoreActive) return
        check(!restoreBlocked) { "Restore recovery is required" }
        check(!context.getSharedPreferences(LauncherFiles.SHARED_PREFERENCES_KEY,
            Context.MODE_PRIVATE).contains(RestoreDbTask.RESTORED_DEVICE_TYPE)) {
            "Restored database has not been verified"
        }
        (PREF_FILES + LauncherFiles.DEVICE_PREFERENCES_KEY).forEach {
            check(context.getSharedPreferences(it, Context.MODE_PRIVATE).edit().commit()) {
                "Cannot persist restored preferences"
            }
        }
        listOf(context, context.createDeviceProtectedStorageContext()).forEach {
            check(it.getSharedPreferences(LauncherPrefs.BOOT_AWARE_PREFS_KEY,
                Context.MODE_PRIVATE).edit().commit()) { "Cannot persist boot preferences" }
        }
        LauncherFiles.GRID_DB_FILES.map(context::getDatabasePath).filter(File::exists).forEach {
            SQLiteDatabase.openDatabase(it.path, null, SQLiteDatabase.OPEN_READWRITE,
                { throw IOException("Corrupt restored database") }).use { db ->
                db.rawQuery("PRAGMA wal_checkpoint(FULL)", null).use { result ->
                    check(result.moveToFirst() && result.getInt(0) == 0) {
                        "Restored database checkpoint is busy"
                    }
                }
            }
            FileOutputStream(it, true).use { output -> output.fd.sync() }
        }
        journal(context).commit()
        restoreActive = false
        try {
            journal(context).cleanup()
            deleteStagingWithStateLast(stagingDir(context))
        } catch (e: Exception) {
            Log.w(TAG, "Restore cleanup deferred (${e.javaClass.simpleName})")
        }
    }

    @JvmStatic fun onLoadFailure(context: Context) {
        showFailure(context)
        if (!restoreActive || restoreBlocked) return
        restoreBlocked = true
        com.android.launcher3.Utilities.restart()
    }

    fun showRestoreFailureIfNeeded(context: Context) {
        if (restoreFailed || restoreBlocked) showFailure(context)
    }

    private fun showFailure(context: Context) {
        com.android.launcher3.util.Executors.MAIN_EXECUTOR.execute {
            Toast.makeText(context, context.getString(R.string.remote_action_failed, "")
                .trim().trimEnd(':', '\uFF1A'), Toast.LENGTH_LONG).show()
        }
    }

    private fun targets(context: Context): List<File> = buildList {
        LauncherFiles.GRID_DB_FILES.forEach { name ->
            listOf("", "-wal", "-shm", "-journal").forEach {
                add(File(context.getDatabasePath(name).path + it))
            }
        }
        (PREF_FILES + LauncherFiles.DEVICE_PREFERENCES_KEY +
            LauncherPrefs.BOOT_AWARE_PREFS_KEY).forEach { name ->
            val file = prefsFile(context, name)
            add(file)
            add(File(file.path + ".bak"))
        }
        val boot = prefsFile(context.createDeviceProtectedStorageContext(),
            LauncherPrefs.BOOT_AWARE_PREFS_KEY)
        add(boot)
        add(File(boot.path + ".bak"))
        add(File(context.filesDir, DOWNGRADE_JSON))
    }

    private fun journal(context: Context) = RestoreJournal(
        stagingDir(context), targets(context), ::syncDirectory, ::move)

    private fun move(source: File, target: File) {
        Files.move(source.toPath(), target.toPath(), StandardCopyOption.ATOMIC_MOVE,
            StandardCopyOption.REPLACE_EXISTING)
    }

    private fun syncDirectory(directory: File) {
        val fd = Os.open(directory.path, OsConstants.O_RDONLY, 0)
        try { Os.fsync(fd) } finally { Os.close(fd) }
    }

    private fun deleteStagingWithStateLast(directory: File) {
        if (!directory.exists()) return
        directory.listFiles()?.sortedBy { it.name == "state" }?.forEach {
            if (it.isDirectory) deleteStagingWithStateLast(it)
            else {
                if (!it.delete()) throw IOException("Cannot clean restore staging")
                syncDirectory(directory)
            }
        } ?: throw IOException("Cannot list restore staging")
        if (!directory.delete()) throw IOException("Cannot clean restore directory")
        syncDirectory(requireNotNull(directory.parentFile))
    }

    /**
     * Produces a consistent copy of the live SQLite database;
     * Favors VACUUM INTO if supported (SQLite >= 3.27 - API 30+ only).
     */
    private fun snapshotDatabase(source: File, dest: File) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.R) {
            SQLiteDatabase.openDatabase(source.path, null, SQLiteDatabase.OPEN_READONLY,
                { throw IOException("Cannot snapshot corrupt launcher database") }).use {
                it.execSQL("VACUUM INTO ?", arrayOf<Any>(dest.path))
            }
            return
        }
        // Fallback snapshot logic for older SQLite versions
        dest.createNewFile()
        SQLiteDatabase.openDatabase(source.path, null, SQLiteDatabase.OPEN_READWRITE,
            { throw IOException("Cannot snapshot corrupt launcher database") }).use { db ->
            db.execSQL("ATTACH DATABASE ? AS snapshot", arrayOf<Any>(dest.path))
            db.beginTransaction()
            try {
                db.rawQuery("SELECT name, sql FROM sqlite_master WHERE type = 'table' AND sql IS NOT NULL AND name NOT LIKE 'sqlite_%'", null).use { c ->
                    while (c.moveToNext()) {
                        val name = c.getString(0)
                        db.execSQL(c.getString(1).replaceFirst(Regex("CREATE\\s+TABLE\\s+"), "CREATE TABLE snapshot."))
                        db.execSQL("INSERT INTO snapshot.\"$name\" SELECT * FROM main.\"$name\"")
                    }
                }
                db.rawQuery("PRAGMA main.user_version", null).use { c ->
                    if (c.moveToFirst()) db.execSQL("PRAGMA snapshot.user_version = " + c.getInt(0))
                }
                db.setTransactionSuccessful()
            } finally {
                db.endTransaction()
                db.execSQL("DETACH DATABASE snapshot")
            }
        }
    }

    private fun stagingDir(context: Context) = File(context.filesDir, STAGING_DIR)

    private fun tmpStagingDir(context: Context) = File(context.filesDir, "$STAGING_DIR.tmp")

    //private val SNAPPY_MAGIC = byteArrayOf(0xFF.toByte(), 0x06, 0x00, 0x00)
    private val ZSTD_MAGIC = byteArrayOf(0x28, 0xB5.toByte(), 0x2F, 0xFD.toByte())
    private val ZIP_MAGIC = byteArrayOf('P'.code.toByte(), 'K'.code.toByte())

    /** Reads up to [count] leading bytes without consuming the stream (short on EOF). */
    private fun BufferedInputStream.peek(count: Int): ByteArray {
        mark(count)
        val bytes = ByteArray(count)
        var total = 0
        while (total < count) {
            val n = read(bytes, total, count - total)
            if (n < 0) break
            total += n
        }
        reset()
        return bytes.copyOf(total)
    }

    /**
     * Wraps the stream with the proper decompressor based on its magic bytes;
     * If none of the magic bytes are matched, it returns the original stream;
     * NOTE: unused formats have been commented for code optimization
     */
    private fun BufferedInputStream.decompressed() = when {
        //peek(4).contentEquals(SNAPPY_MAGIC) -> SnappyFramedInputStream(this)
        peek(4).contentEquals(ZSTD_MAGIC) -> ZstdInputStream(this)
        else -> this // Plain (uncompressed) archive
    }

    /**
     * True when the stream starts with the zip local-header magic.
     */
    private fun BufferedInputStream.isZip() = peek(2).contentEquals(ZIP_MAGIC)

    private fun prefsFile(context: Context, name: String) =
        File(context.dataDir, "shared_prefs/$name.xml")

    private fun TarOutputStream.add(name: String, file: File) {
        putNextEntry(TarEntry(name, file.length()))
        file.inputStream().use { it.copyTo(this) }
        closeEntry()
    }

    private fun SharedPreferences.Editor.putAny(key: String, value: Any?) {
        when (value) {
            is Boolean -> putBoolean(key, value)
            is Int -> putInt(key, value)
            is Long -> putLong(key, value)
            is Float -> putFloat(key, value)
            is String -> putString(key, value)
            is Set<*> -> putStringSet(key, value.filterIsInstance<String>().toSet())
        }
    }
}
