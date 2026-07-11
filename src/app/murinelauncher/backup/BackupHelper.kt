package app.murinelauncher.backup

import android.content.Context
import android.content.SharedPreferences
import android.database.sqlite.SQLiteDatabase
import android.net.Uri
import android.util.Log
import androidx.annotation.WorkerThread
import app.murinelauncher.icons.IconPackManager
import com.android.launcher3.LauncherFiles
import com.android.launcher3.LauncherPrefs
import com.android.launcher3.provider.RestoreDbTask
import java.io.File
import java.util.zip.ZipEntry
import java.util.zip.ZipInputStream
import java.util.zip.ZipOutputStream

/**
 * Local backup ("*.rat", a plain zip) of the same file set AOSP cloud backup uses;
 * Stages the restore, restarts the application and loads the backup through [RestoreDbTask].
 */
object BackupHelper {

    private const val TAG = "BackupHelper"
    private const val STAGING_DIR = "murine_restore_staging"
    private const val TMP_PREFS = "murine_backup_tmp_prefs"
    private const val DOWNGRADE_JSON = "downgrade_schema.json"
    private const val MAIN_PREFS_XML = LauncherFiles.SHARED_PREFERENCES_KEY + ".xml"

    /** Backed up prefs; IMPORTANT: also check backupscheme.xml **/
    private val PREF_FILES = listOf(
        LauncherFiles.SHARED_PREFERENCES_KEY,
        IconPackManager.PREFS_DB_ICON_OVERRIDE,
    )

    /**
     * Writes the backup zip to [uri] (SAF, no storage permission). To be called on MODEL_EXECUTOR.
     */
    @WorkerThread
    fun backup(context: Context, uri: Uri): Boolean = try {
        val snap = File(context.cacheDir, "backup_snapshot").apply { deleteRecursively(); mkdirs() }
        // Snapshot databases
        LauncherFiles.GRID_DB_FILES.map(context::getDatabasePath).filter(File::exists).forEach { db ->
            SQLiteDatabase.openDatabase(db.path, null, SQLiteDatabase.OPEN_READONLY).use {
                it.execSQL("VACUUM INTO ?", arrayOf<Any>(File(snap, db.name).path))
            }
        }
        // Add all files to archive; each pref file is dumped through a temp SharedPreferences
        context.contentResolver.openOutputStream(uri, "wt")!!.let(::ZipOutputStream).use { zip ->
            snap.listFiles()!!.forEach { zip.add(it.name, it) }
            PREF_FILES.forEach { name ->
                context.getSharedPreferences(TMP_PREFS, Context.MODE_PRIVATE).edit().clear().also { ed ->
                    context.getSharedPreferences(name, Context.MODE_PRIVATE).all.forEach { (k, v) -> ed.putAny(k, v) }
                }.commit()
                zip.add("$name.xml", prefsFile(context, TMP_PREFS))
            }
            File(context.filesDir, DOWNGRADE_JSON).takeIf(File::exists)
                ?.let { zip.add(DOWNGRADE_JSON, it) }
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
        val tmp = tmpStagingDir(context).apply { deleteRecursively(); mkdirs() }
        stagingDir(context).deleteRecursively()
        context.contentResolver.openInputStream(uri)!!.let(::ZipInputStream).use { zip ->
            generateSequence { zip.nextEntry }.forEach { entry ->
                // Whitelist of exact file names for content validation
                if (entry.name in LauncherFiles.GRID_DB_FILES || entry.name.removeSuffix(".xml") in PREF_FILES || entry.name == DOWNGRADE_JSON)
                    File(tmp, entry.name).outputStream().use(zip::copyTo)
            }
        }
        val valid = File(tmp, MAIN_PREFS_XML).exists() && tmp.list()!!.any { it.endsWith(".db") }
        (valid && tmp.renameTo(stagingDir(context))).also { if (!it) tmp.deleteRecursively() }
    } catch (e: Exception) {
        Log.e(TAG, "Staging restore failed", e)
        tmpStagingDir(context).deleteRecursively()
        false
    }

    /**
     * Always ran in [android.app.Application.onCreate], no-op unless staged restore.
     */
    fun applyStagedRestoreIfNeeded(context: Context) {
        tmpStagingDir(context).deleteRecursively()
        val staging = stagingDir(context)
        if (!staging.exists()) return
        try {
            // Drop all current grid DBs
            LauncherFiles.GRID_DB_FILES.map(context::getDatabasePath).forEach { db ->
                listOf("", "-wal", "-shm", "-journal").forEach { File(db.path + it).delete() }
            }
            val stagedFiles = staging.list()!!.toSet()
            staging.listFiles()!!.forEach { f ->
                when {
                    f.name.endsWith(".db") -> context.getDatabasePath(f.name)
                        .also { it.parentFile?.mkdirs() }.let(f::renameTo)
                    f.name == DOWNGRADE_JSON -> f.renameTo(File(context.filesDir, DOWNGRADE_JSON))
                    f.name.endsWith(".xml") -> {
                        // Read the xml as a temp SharedPreferences then commit to target prefs.
                        context.deleteSharedPreferences(TMP_PREFS)
                        f.renameTo(prefsFile(context, TMP_PREFS))
                        val restored = context.getSharedPreferences(TMP_PREFS, Context.MODE_PRIVATE).all
                        context.getSharedPreferences(f.name.removeSuffix(".xml"), Context.MODE_PRIVATE).edit().clear().also { ed ->
                            restored.forEach { (k, v) -> ed.putAny(k, v) }
                        }.commit()
                        context.deleteSharedPreferences(TMP_PREFS)
                    }
                }
            }
            // Delete preferences in backupscheme present in the current app config but not in the backup
            PREF_FILES.forEach { name ->
                if ("$name.xml" !in stagedFiles) context.deleteSharedPreferences(name)
            }
            context.deleteSharedPreferences(LauncherPrefs.BOOT_AWARE_PREFS_KEY)
            context.createDeviceProtectedStorageContext().deleteSharedPreferences(LauncherPrefs.BOOT_AWARE_PREFS_KEY)
            RestoreDbTask.setPending(context, true)
            Log.d(TAG, "Staged restore applied, RestoreDbTask pending")
        } catch (e: Exception) {
            Log.e(TAG, "Applying staged restore failed", e)
        } finally {
            staging.deleteRecursively()
        }
    }

    private fun stagingDir(context: Context) = File(context.filesDir, STAGING_DIR)

    private fun tmpStagingDir(context: Context) = File(context.filesDir, "$STAGING_DIR.tmp")

    private fun prefsFile(context: Context, name: String) =
        File(context.dataDir, "shared_prefs/$name.xml")

    private fun ZipOutputStream.add(name: String, file: File) {
        putNextEntry(ZipEntry(name))
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
