/*
 * Copyright (C) 2026
 * SPDX-License-Identifier: Apache-2.0
 */
package com.android.launcher3.model

import android.app.Application
import android.content.Context
import android.content.ContextWrapper
import android.database.sqlite.SQLiteDatabase
import app.murinelauncher.backup.BackupHelper
import app.murinelauncher.backup.BackupValidation
import app.murinelauncher.backup.RestoreReliabilityTest
import com.android.launcher3.InvariantDeviceProfile
import com.android.launcher3.LauncherApplication
import com.android.launcher3.LauncherFiles
import com.android.launcher3.LauncherPrefs
import com.android.launcher3.LauncherSettings
import com.android.launcher3.AutoInstallsLayout
import com.android.launcher3.dagger.LauncherAppComponent
import com.android.launcher3.pm.UserCache
import com.android.launcher3.provider.LauncherDbUtils
import com.android.launcher3.provider.RestoreDbTask
import com.android.launcher3.util.NoLocaleSQLiteHelper
import com.android.launcher3.widget.LauncherWidgetHolder
import org.junit.Assert.*
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.rules.TemporaryFolder
import org.junit.runner.RunWith
import org.mockito.Mockito.*
import org.robolectric.RobolectricTestRunner
import org.robolectric.RuntimeEnvironment
import org.robolectric.annotation.Config
import org.robolectric.annotation.SQLiteMode
import java.io.File

@RunWith(RobolectricTestRunner::class)
@Config(sdk = [35], application = Application::class,
    shadows = [RestoreReliabilityTest.DirectoryOsShadow::class])
@SQLiteMode(SQLiteMode.Mode.NATIVE)
class LayoutFailureTest {
    @get:Rule val temporary = TemporaryFolder()
    private lateinit var context: Context
    private lateinit var prefs: LauncherPrefs
    private lateinit var users: UserCache
    private lateinit var idp: InvariantDeviceProfile

    @Before fun setup() {
        org.robolectric.shadows.ShadowLog.stream = System.out
        val app = mock(LauncherApplication::class.java)
        val component = mock(LauncherAppComponent::class.java)
        val base = RuntimeEnvironment.getApplication()
        context = object : ContextWrapper(base) {
            override fun getApplicationContext(): Context = app
        }
        prefs = object : LauncherPrefs(context) {
            override fun registerObservedItems() {}
        }
        users = mock(UserCache::class.java)
        idp = mock(InvariantDeviceProfile::class.java)
        idp.dbFile = "launcher.db"
        idp.numColumns = 4
        idp.numRows = 5
        idp.numDatabaseHotseatIcons = 4
        `when`(app.appComponent).thenReturn(component)
        `when`(component.launcherPrefs).thenReturn(prefs)
        `when`(component.userCache).thenReturn(users)
        `when`(component.apiWrapper).thenReturn(mock(com.android.launcher3.util.ApiWrapper::class.java))
        `when`(component.getIDP()).thenReturn(idp)
        BackupHelper.applyStagedRestoreIfNeeded(context)
    }

    private fun helper(name: String) = object : DatabaseHelper(context, name, { 0L }, {}) {
        override fun onOpen(db: SQLiteDatabase) {}
    }

    private fun favorites(db: SQLiteDatabase) {
        db.execSQL("INSERT INTO favorites (_id,title,itemType,container,screen,cellX,cellY," +
            "spanX,spanY,appWidgetId) VALUES (1,'folder',2,-100,0,0,0,1,1,-1)," +
            "(2,'child',0,1,0,0,0,1,1,-1),(3,'widget',4,-100,0,1,1,2,2,71)")
    }

    private fun count(db: SQLiteDatabase) = db.rawQuery("SELECT COUNT(*) FROM favorites", null)
        .use { it.moveToFirst(); it.getInt(0) }

    private fun stageLayout(): Pair<ByteArray, ByteArray> {
        helper("launcher.db").use { favorites(it.writableDatabase) }
        val mainPrefs = File(context.dataDir,
            "shared_prefs/${LauncherFiles.SHARED_PREFERENCES_KEY}.xml")
        mainPrefs.parentFile!!.mkdirs()
        BackupValidation.writePreferences(mainPrefs, mapOf("original" to "old preferences"))
        val original = context.getDatabasePath("launcher.db").readBytes() to mainPrefs.readBytes()
        val staging = File(context.filesDir, "murine_restore_staging").apply { mkdir() }
        helper("incoming.db").use {
            favorites(it.writableDatabase)
            it.writableDatabase.execSQL("UPDATE favorites SET title='restored layout'")
        }
        context.getDatabasePath("incoming.db").copyTo(File(staging, "launcher.db"))
        BackupValidation.writePreferences(File(staging, mainPrefs.name), mapOf(
            DeviceGridState.KEY_DB_FILE to "launcher.db",
            DeviceGridState.KEY_WORKSPACE_SIZE to "4,5",
            DeviceGridState.KEY_HOTSEAT_COUNT to 4))
        BackupHelper.applyStagedRestoreIfNeeded(context)
        assertTrue(BackupHelper.isRestoreActive())
        return original
    }

    @Test fun failedRealRestoreVerificationRollsBackOriginalLayoutAndPreferences() {
        val (oldDatabase, oldPreferences) = stageLayout()
        helper("launcher.db").use {
            val controller = mock(ModelDbController::class.java)
            `when`(controller.db).thenReturn(it.writableDatabase)
            it.writableDatabase.execSQL("ALTER TABLE favorites RENAME TO failed_restore")
            assertThrows(IllegalStateException::class.java) {
                RestoreDbTask.restoreIfNeeded(context, controller)
            }
            verify(controller, never()).createEmptyDB()
            assertThrows(IllegalStateException::class.java) { BackupHelper.commitRestore(context) }
        }
        BackupHelper.applyStagedRestoreIfNeeded(context)
        assertFalse(BackupHelper.isRestoreBlocked())
        assertArrayEquals(oldDatabase, context.getDatabasePath("launcher.db").readBytes())
        assertArrayEquals(oldPreferences, File(context.dataDir,
            "shared_prefs/${LauncherFiles.SHARED_PREFERENCES_KEY}.xml").readBytes())
    }

    @Test fun verifiedRestoreCommitsAndCleansOriginalOnlyAfterSuccessfulLoad() {
        stageLayout()
        val saved = File(context.getDatabasePath("launcher.db").path + ".restore-old")
        assertTrue(saved.exists())
        assertThrows(IllegalStateException::class.java) { BackupHelper.commitRestore(context) }
        helper("launcher.db").use {
            val controller = mock(ModelDbController::class.java)
            `when`(controller.db).thenReturn(it.writableDatabase)
            RestoreDbTask.restoreIfNeeded(context, controller)
            assertFalse(prefs.has(LauncherPrefs.RESTORE_DEVICE))
            assertEquals(3, count(it.writableDatabase))
            assertTrue(saved.exists())
            BackupHelper.commitRestore(context)
            assertFalse(saved.exists())
            assertFalse(BackupHelper.isRestoreActive())
            assertFalse(File(context.filesDir, "murine_restore_staging").exists())
        }
    }

    @Test fun duplicateWidgetProviderColumnRollsBackUpgradeWithoutRecreatingFavorites() {
        val file = context.getDatabasePath("failed-upgrade.db")
        file.parentFile!!.mkdirs()
        SQLiteDatabase.openOrCreateDatabase(file, null).use { db ->
            LauncherSettings.Favorites.addTableToDb(db, 0, false)
            favorites(db)
            db.version = 13
        }
        val before = file.readBytes()
        helper(file.name).use { helper ->
            assertThrows(android.database.sqlite.SQLiteException::class.java) {
                helper.writableDatabase
            }
        }
        SQLiteDatabase.openDatabase(file.path, null, 0).use {
            assertEquals(13, it.version)
            assertEquals(3, count(it))
        }
        assertTrue(before.isNotEmpty())
    }

    @Test fun restoreVerificationFailureDoesNotResetOrClearPendingMetadata() {
        helper("verification.db").use { helper ->
            val db = helper.writableDatabase
            favorites(db)
            db.execSQL("ALTER TABLE favorites RENAME TO preserved_favorites")
            val controller = mock(ModelDbController::class.java)
            `when`(controller.db).thenReturn(db)
            prefs.putSyncChecked(LauncherPrefs.RESTORE_DEVICE.to(0))
            assertThrows(IllegalStateException::class.java) {
                RestoreDbTask.restoreIfNeeded(context, controller)
            }
            verify(controller, never()).createEmptyDB()
            assertTrue(prefs.has(LauncherPrefs.RESTORE_DEVICE))
            db.rawQuery("SELECT COUNT(*) FROM preserved_favorites", null).use {
                it.moveToFirst()
                assertEquals(3, it.getInt(0))
            }
        }
    }

    @Test fun staleEmptyFlagCannotReplaceExistingFavorites() {
        helper("launcher.db").use { helper ->
            favorites(helper.writableDatabase)
            prefs.putSyncChecked(LauncherPrefs.DB_FILE.to("launcher.db"))
            context.getSharedPreferences(LauncherFiles.SHARED_PREFERENCES_KEY, 0).edit()
                .putBoolean("EMPTY_DATABASE_CREATED", true).commit()
            val controller = object : ModelDbController(context, idp, prefs, users,
                mock(LayoutParserFactory::class.java)) {
                override fun createDatabaseHelper(forMigration: Boolean, dbFile: String) = helper
            }
            controller.loadDefaultFavoritesIfNecessary()
            assertEquals(3, count(helper.writableDatabase))
        }
    }

    @Test fun tableReplacementIsTransactionalAndCopiesLargeLegacyIconWithoutCursorWindow() {
        helper("source.db").use { source ->
            helper("target.db").use { target ->
                val sourceDb = source.writableDatabase
                val targetDb = target.writableDatabase
                favorites(sourceDb)
                favorites(targetDb)
                val icon = ByteArray(3 * 1024 * 1024) { (it % 251).toByte() }
                sourceDb.execSQL("UPDATE favorites SET icon=?, itemType=1 WHERE _id=2",
                    arrayOf(icon))
                LauncherDbUtils.TableCopy(sourceDb, targetDb, context).use { tables ->
                    LauncherDbUtils.SQLiteTransaction(targetDb).use {
                        tables.copy("favorites", "favorites")
                        targetDb.execSQL("DELETE FROM favorites")
                    }
                }
                assertEquals(3, count(targetDb))
                targetDb.rawQuery("SELECT length(icon) FROM favorites WHERE _id=2", null).use {
                    it.moveToFirst()
                    assertTrue(it.isNull(0))
                }
                LauncherDbUtils.TableCopy(sourceDb, targetDb, context).use { tables ->
                    LauncherDbUtils.SQLiteTransaction(targetDb).use {
                        tables.copy("favorites", "favorites")
                        it.commit()
                    }
                }
                targetDb.rawQuery("SELECT length(icon),hex(substr(icon,1,16)) " +
                    "FROM favorites WHERE _id=2", null).use {
                    it.moveToFirst()
                    assertEquals(icon.size, it.getInt(0))
                    assertEquals("000102030405060708090A0B0C0D0E0F", it.getString(1))
                }
            }
        }
    }

    @Test fun migrationFailureKeepsSourceTargetMetadataAndCallbacksUnchanged() {
        helper("source.db").use { source ->
            helper("target.db").use { target ->
                favorites(source.writableDatabase)
                favorites(target.writableDatabase)
                val src = DeviceGridState(4, 4, 4, 0, "source.db", 0)
                val dest = DeviceGridState(4, 5, 4, 0, "target.db", 0)
                src.writeToPrefsSync(context)
                val delegate = mock(ModelDelegate::class.java)
                source.writableDatabase.execSQL("ALTER TABLE favorites RENAME TO original")
                assertThrows(Exception::class.java) {
                    GridSizeMigrationLogic().migrateGrid(context, src, dest, target,
                        source.writableDatabase, true, delegate)
                }
                assertEquals("source.db", prefs.get(LauncherPrefs.DB_FILE))
                assertEquals(3, count(target.writableDatabase))
                verify(delegate, never()).gridMigrationComplete(src, dest)
            }
        }
    }

    @Test fun freshInstallStillSeedsDefaultsButOnlyOnce() {
        val holder = mock(LauncherWidgetHolder::class.java)
        val parser = mock(AutoInstallsLayout::class.java)
        val factory = mock(LayoutParserFactory::class.java)
        var seeded = 0
        val helper = object : DatabaseHelper(context, "launcher.db", { 0L }, {
            context.getSharedPreferences(LauncherFiles.SHARED_PREFERENCES_KEY, 0).edit()
                .putBoolean("EMPTY_DATABASE_CREATED", true).commit()
        }) {
            override fun onOpen(db: SQLiteDatabase) {}
            override fun newLauncherWidgetHolder() = holder
            override fun loadFavorites(db: SQLiteDatabase, loader: AutoInstallsLayout): Int {
                seeded++
                favorites(db)
                return 3
            }
        }
        `when`(factory.createExternalLayoutParser(holder, helper)).thenReturn(parser)
        val controller = object : ModelDbController(context, idp, prefs, users, factory) {
            override fun createDatabaseHelper(forMigration: Boolean, dbFile: String) = helper
        }
        helper.writableDatabase
        controller.attemptMigrateDb(null, mock(ModelDelegate::class.java))
        controller.loadDefaultFavoritesIfNecessary()
        controller.loadDefaultFavoritesIfNecessary()
        assertEquals(1, seeded)
        assertEquals(3, count(helper.writableDatabase))
        helper.close()
    }

    @Test fun disposableCacheHelperKeepsDefaultCorruptionRecovery() {
        val file = context.getDatabasePath("disposable-cache.db")
        file.parentFile!!.mkdirs()
        file.writeText("corrupt cache")
        val cache = object : NoLocaleSQLiteHelper(context, file.name, 1) {
            override fun onCreate(db: SQLiteDatabase) {
                db.execSQL("CREATE TABLE cache (_id INTEGER PRIMARY KEY)")
            }
            override fun onUpgrade(db: SQLiteDatabase, oldVersion: Int, newVersion: Int) {}
        }
        cache.use {
            it.writableDatabase.rawQuery("SELECT COUNT(*) FROM cache", null).use { cursor ->
                cursor.moveToFirst()
                assertEquals(0, cursor.getInt(0))
            }
        }
    }
}
