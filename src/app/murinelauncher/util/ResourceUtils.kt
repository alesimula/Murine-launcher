package app.murinelauncher.util

import android.content.res.AssetManager
import android.content.res.Resources
import android.os.Build
import android.util.Log
import java.lang.reflect.Method
import java.util.function.Supplier

/**
 * Lies to the resource resolver about the platform version so that -v26 qualified adaptive icons
 * stop matching and the app's legacy drawable is picked instead. Same approach Lawnchair 1.2 used
 * in AdaptiveIconProvider (`res.overrideSdk(25) { ... }`).
 *
 * AssetManager.setConfiguration is @UnsupportedAppUsage with no maxTargetSdk, so it stays reachable,
 * but its signature moved three times, hence resolving it by shape instead of by a fixed signature:
 *
 *   8.0 - 13  18 args  (mcc, mnc, String locale,   orientation .. uiMode, colorMode, majorVersion)
 *   14 - 16   19 args  + grammaticalGender before majorVersion
 *   17        20 args  (mcc, mnc, String defaultLocale, String[] locales, .. sdkVersionFull)
 *                      the single-locale overload is gone, and the trailing version is packed
 *                      major*100000 + minor (Build.VERSION_CODES_FULL.SDK_INT_MULTIPLIER)
 *
 * @see [original class](https://github.com/LawnchairLauncher/lawnchair/blob/1.2.0.1884/app/src/main/java/ch/deletescape/lawnchair/util/ResourceUtils.kt)
 */
private const val TAG = "ResourceUtils"
private const val SDK_INT_MULTIPLIER = 100000

/** Non-null only when [SetConfig.method] resolved; everything degrades to a no-op otherwise. */
private class SetConfig(val method: Method, val localesAsArray: Boolean, val fullSdk: Boolean) {
    /** Value to hand the trailing version parameter for a given major SDK level. */
    fun encode(sdk: Int) = if (fullSdk) sdk * SDK_INT_MULTIPLIER else sdk

    /** The platform's own value, used to put things back. */
    val current: Int = if (fullSdk) {
        try {
            Build.VERSION::class.java.getField("SDK_INT_FULL").getInt(null)
        } catch (_: Throwable) {
            encode(Build.VERSION.SDK_INT)
        }
    } else {
        Build.VERSION.SDK_INT
    }
}

private val setConfig: SetConfig? by lazy {
    try {
        // Prefer the shortest overload: the single-locale one where it still exists, the
        // String[] one on 17+. setConfigurationInternal has a different name, so it can't match.
        val m = AssetManager::class.java.declaredMethods
            .filter {
                it.name == "setConfiguration" &&
                    it.parameterTypes.size >= 17 &&
                    it.parameterTypes[2] == String::class.java
            }
            .minByOrNull { it.parameterTypes.size }
        if (m == null) {
            Log.w(TAG, "No usable AssetManager.setConfiguration overload")
            return@lazy null
        }
        m.isAccessible = true
        val localesAsArray = m.parameterTypes[3] == Array<String>::class.java
        // The packed version arrived with SDK_INT_FULL; its presence is the reliable signal.
        val fullSdk = try {
            Build.VERSION::class.java.getField("SDK_INT_FULL"); true
        } catch (_: Throwable) {
            false
        }
        SetConfig(m, localesAsArray, fullSdk)
    } catch (t: Throwable) {
        Log.w(TAG, "AssetManager.setConfiguration unavailable", t)
        null
    }
}

private fun setResSdk(res: Resources, versionArg: Int): Boolean {
    val cfg = setConfig ?: return false
    return try {
        val c = res.configuration
        val m = res.displayMetrics
        val width = maxOf(m.widthPixels, m.heightPixels)
        val height = minOf(m.widthPixels, m.heightPixels)
        val locale = c.locales[0].toLanguageTag()

        val args = ArrayList<Any?>(cfg.method.parameterTypes.size)
        args.add(c.mcc); args.add(c.mnc); args.add(locale)
        if (cfg.localesAsArray) args.add(arrayOf(locale))
        args.add(c.orientation); args.add(c.touchscreen); args.add(c.densityDpi)
        args.add(c.keyboard); args.add(c.keyboardHidden); args.add(c.navigation)
        args.add(width); args.add(height); args.add(c.smallestScreenWidthDp)
        args.add(c.screenWidthDp); args.add(c.screenHeightDp); args.add(c.screenLayout)
        args.add(c.uiMode)
        // Whatever sits between uiMode and the trailing version: colorMode, then
        // grammaticalGender on 14+. Undefined (0) is fine for the latter, we restore right after.
        repeat(cfg.method.parameterTypes.size - args.size - 1) { i ->
            args.add(if (i == 0) c.colorMode else 0)
        }
        args.add(versionArg)

        cfg.method.invoke(res.assets, *args.toTypedArray())
        true
    } catch (t: Throwable) {
        Log.w(TAG, "Could not override resource sdk", t)
        false
    }
}

/**
 * Whether [withLegacyIcons] can actually do anything on this platform, i.e. whether an
 * AssetManager.setConfiguration overload matching the known shape exists on this API version.
 * False means a new Android release moved it again and the resolver above needs updating.
 */
fun isResourceHackSupported(): Boolean = setConfig != null

/**
 * Runs [body] with [res] resolving resources as if the platform were pre-Oreo, so apps that ship
 * both a legacy and an adaptive icon hand back the legacy one. Falls through untouched when the
 * hidden method is not reachable.
 */
fun <T> withLegacyIcons(res: Resources, body: Supplier<T>): T {
    val cfg = setConfig ?: return body.get()
    if (!setResSdk(res, cfg.encode(Build.VERSION_CODES.N_MR1))) return body.get()
    try {
        return body.get()
    } finally {
        // restores SDK_INT(_FULL), not RESOURCES_SDK_INT; they only differ on in-development builds with an active codename.
        setResSdk(res, cfg.current)
    }
}
