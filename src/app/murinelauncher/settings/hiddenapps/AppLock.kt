package app.murinelauncher.settings.hiddenapps

import android.app.PendingIntent
import android.content.Context
import android.content.pm.ApplicationInfo
import android.content.pm.PackageManager
import android.util.Log

/**
 * Thin wrapper around Android's native App Lock
 * TODO at the moment, it's only on certain specific canary builds; a way to test properly is needed.
 *
 * [isAvailable] is the master gate: when it returns false the lock UI is never shown
 * and no other member of this object is reached.
 */
object AppLock {
    private const val TAG = "MurineAppLock"
    private const val PERMISSION_LOCK_APPS = "android.permission.LOCK_APPS"

    private val isAppLockSupportedField = runCatching { ApplicationInfo::class.java.getField("isAppLockSupported") }.getOrNull()
    private val isAppLockEnabledField = runCatching { ApplicationInfo::class.java.getField("isAppLockEnabled") }.getOrNull()
    private val getEnableAppLockIntent = runCatching {
        PackageManager::class.java.getMethod("getEnableAppLockIntentForPackage", String::class.java, Boolean::class.javaPrimitiveType)
    }.getOrNull()

    /**
     * True only when the framework has the App Lock API and the LOCK_APPS permission is held;
     * The launcher must be set as default home app.
     */
    @JvmStatic
    fun isAvailable(context: Context): Boolean =
        getEnableAppLockIntent != null && isAppLockSupportedField != null &&
            context.checkSelfPermission(PERMISSION_LOCK_APPS) == PackageManager.PERMISSION_GRANTED

    /**
     * The system marks exempt apps (and every app, while the feature flag is off) as unsupported.
     */
    @JvmStatic
    fun isSupported(appInfo: ApplicationInfo): Boolean =
        runCatching { isAppLockSupportedField?.getBoolean(appInfo) == true }.getOrDefault(false)

    /**
     * Current lock state for a specific app; false on any error or when the feature is absent.
     */
    @JvmStatic
    fun isLocked(appInfo: ApplicationInfo): Boolean =
        runCatching { isAppLockEnabledField?.getBoolean(appInfo) == true }.getOrDefault(false)

    @JvmStatic
    fun isLocked(context: Context, packageName: String): Boolean = runCatching {
        isLocked(context.packageManager.getApplicationInfo(packageName, 0))
    }.getOrDefault(false)

    /**
     * Toggles App Lock for [packageName], the system asks for user authentication.
     */
    @JvmStatic
    fun requestSetAppLock(context: Context, packageName: String) {
        try {
            val pendingIntent = getEnableAppLockIntent?.invoke(
                context.packageManager, packageName, !isLocked(context, packageName)
            ) as? PendingIntent
            pendingIntent?.send() ?: Log.w(TAG, "No App Lock PendingIntent for $packageName")
        } catch (e: Exception) {
            Log.w(TAG, "App Lock toggle failed for $packageName", e)
        }
    }
}
