package app.murinelauncher.settings.hiddenapps

import android.content.ComponentName
import android.content.Context
import com.android.launcher3.LauncherFiles

/**
 * Manages the set of hidden apps, persisted in SharedPreferences.
 */
object HiddenAppsRepository {
    private const val KEY_HIDDEN_APPS = "hidden_app_components"

    private fun prefs(context: Context) =
        context.getSharedPreferences(LauncherFiles.SHARED_PREFERENCES_KEY, Context.MODE_PRIVATE)

    @JvmStatic
    fun getHiddenComponents(context: Context): Set<String> =
        prefs(context).getStringSet(KEY_HIDDEN_APPS, emptySet()) ?: emptySet()

    @JvmStatic
    fun isHidden(context: Context, component: ComponentName): Boolean =
        getHiddenComponents(context).contains(component.flattenToString())

    @JvmStatic
    fun setHidden(context: Context, component: ComponentName, hidden: Boolean) {
        val current = getHiddenComponents(context).toMutableSet()
        val flat = component.flattenToString()
        if (hidden) current.add(flat) else current.remove(flat)
        prefs(context).edit().putStringSet(KEY_HIDDEN_APPS, current).apply()
    }

    @JvmStatic
    fun setHiddenComponents(context: Context, components: Set<String>) {
        prefs(context).edit().putStringSet(KEY_HIDDEN_APPS, components).apply()
    }
}
