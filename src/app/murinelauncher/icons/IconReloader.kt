package app.murinelauncher.icons

import android.content.Context
import android.content.pm.LauncherApps
import com.android.launcher3.LauncherAppState
import com.android.launcher3.model.PackageUpdatedTask
import com.android.launcher3.model.ShortcutsChangedTask
import com.android.launcher3.pm.UserCache
import com.android.launcher3.shortcuts.ShortcutRequest

/**
 * Re-renders all app icons per package, without a full model reload.
 */
object IconReloader {
    @JvmStatic
    fun reloadAll(context: Context) {
        val app = context.applicationContext
        val model = LauncherAppState.getInstance(app).model
        val launcherApps = app.getSystemService(LauncherApps::class.java)!!
        // Only queues tasks: anything slow here delays every icon
        model.enqueueModelUpdateTask { _, dataModel, _ ->
            // Sort by home screen packages first across all profiles, everything else later
            val onHome = synchronized(dataModel) {
                dataModel.itemsIdMap.mapNotNullTo(HashSet()) { i -> i.targetPackage?.let { it to i.user } }
            }
            val users = UserCache.INSTANCE.get(app).userProfiles
            users.flatMap { user ->
                launcherApps.getActivityList(null, user)
                    .mapTo(LinkedHashSet()) { it.componentName.packageName to user }
            }.sortedBy { it !in onHome }.forEach { (pkg, user) ->
                model.enqueueModelUpdateTask(
                    PackageUpdatedTask(PackageUpdatedTask.OP_UPDATE, user, pkg))
            }
            // Pinned shortcut badges, last so they get the new icons
            users.forEach { user ->
                model.enqueueModelUpdateTask { controller, data, apps ->
                    ShortcutRequest(app, user).query(ShortcutRequest.PINNED)
                        .groupBy { it.`package` }
                        .forEach { (pkg, shortcuts) ->
                            ShortcutsChangedTask(pkg, shortcuts, user, false)
                                .execute(controller, data, apps)
                        }
                }
            }
        }
    }
}
