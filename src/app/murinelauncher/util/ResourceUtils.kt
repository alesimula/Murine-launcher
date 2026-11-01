package app.murinelauncher.util

import android.content.pm.ApplicationInfo
import android.content.res.AssetManager
import android.content.res.Resources
import android.graphics.BitmapFactory
import android.graphics.drawable.AdaptiveIconDrawable
import android.graphics.drawable.Drawable
import android.os.Build
import android.util.Log
import android.util.TypedValue
import java.io.BufferedInputStream
import java.io.EOFException
import java.io.IOException
import java.io.InputStream
import java.lang.reflect.Method
import java.util.function.Supplier
import java.util.zip.ZipFile

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

// ---- Legacy icon fallback -------------------------------------------------------------------
// Apps built with minSdk >= 26 lose -v26 on mipmap-anydpi-v26 (aapt2 strips it), so the adaptive
// value matches at any sdk and [withLegacyIcons] can't skip it. This reads the app's density
// (non-anydpi) value for the icon straight from resources.arsc instead.
// Format: frameworks/base/libs/androidfw/include/androidfw/ResourceTypes.h

private const val MASK32 = 0xffffffffL
private const val DENSITY_ANY = 0xfffe
private const val TYPE_REFERENCE = 0x01
private const val TYPE_STRING = 0x03
private const val TYPE_DYNAMIC_REFERENCE = 0x07

/** A density value of the icon: its config density and Res_value, plus where its string pool is. */
internal class LegacyValue(val density: Int, val type: Int, val data: Int, val pool: Long)

/**
 * The app's legacy (non-adaptive) icon for [resId] at [density], or null if it has none.
 * Only reads the resource table entries of that one resource; bodies of other chunks are skipped.
 */
fun loadLegacyIcon(res: Resources, appInfo: ApplicationInfo, resId: Int, density: Int): Drawable? {
    try {
        var best: LegacyValue? = null
        var bestPath: String? = null
        // Density values live in the config splits when installed from a bundle, else in the base
        for (path in listOfNotNull(*appInfo.splitSourceDirs.orEmpty(), appInfo.sourceDir)) {
            val value = ZipFile(path).use { findLegacyValue(it, resId, density) }
            if (value != null && (best == null || densityScore(value.density, density) < densityScore(best.density, density))) {
                best = value
                bestPath = path
            }
        }
        val value = best ?: return null
        return when (value.type) {
            TYPE_STRING -> ZipFile(bestPath!!).use { apk ->
                val file = readPoolString(apk, value.pool, value.data) ?: return null
                if (file.endsWith(".xml")) {
                    val parser = res.assets.openXmlResourceParser(file)
                    try {
                        Drawable.createFromXml(res, parser).takeUnless { it is AdaptiveIconDrawable }
                    } finally {
                        parser.close()
                    }
                } else {
                    val entry = apk.getEntry(file) ?: return null
                    val typed = TypedValue().apply { this.density = value.density }
                    val opts = BitmapFactory.Options().apply { inTargetDensity = density }
                    // Deprecated overload, but the only one taking inTargetDensity (keeps full icon resolution)
                    @Suppress("DEPRECATION")
                    apk.getInputStream(entry).use { Drawable.createFromResourceStream(res, typed, it, file, opts) }
                }
            }
            else -> res.getDrawableForDensity(value.data, density, null).takeUnless { it is AdaptiveIconDrawable }
        }
    } catch (t: Exception) {
        Log.w(TAG, "Could not read the legacy icon of ${appInfo.packageName}", t)
        return null
    }
}

/** Lower is better: the smallest density at or above [target], then the largest below it (like the framework). */
private fun densityScore(configDensity: Int, target: Int): Int {
    val d = when (configDensity) {
        0 -> 160                 // DENSITY_DEFAULT
        0xffff -> target         // nodpi: never scaled
        else -> configDensity
    }
    return if (d >= target) d - target else 0x10000 + target - d
}

/** The best density value of [resId] in [apk]'s resources.arsc, if it has one. */
internal fun findLegacyValue(apk: ZipFile, resId: Int, density: Int): LegacyValue? {
    val entry = apk.getEntry("resources.arsc") ?: return null
    var best: LegacyValue? = null
    apk.getInputStream(entry).use { stream ->
        val r = LeInput(stream)
        if (r.u16() != 0x0002) return null           // RES_TABLE_TYPE
        r.skipTo(r.u16().toLong())
        var pool = -1L
        while (r.pos + 8 <= entry.size) {
            val start = r.pos
            val type = r.u16()
            val headerSize = r.u16()
            val size = r.i32().toLong() and MASK32
            if (size < 8) break
            if (type == 0x0001 && pool < 0) {         // global string pool: file paths
                pool = start
            } else if (type == 0x0200 && r.i32() == resId ushr 24) {   // package
                r.skipTo(start + headerSize)
                best = scanPackage(r, start + size, resId, density, pool, best)
            }
            r.skipTo(start + size)
        }
    }
    return best
}

private fun scanPackage(r: LeInput, end: Long, resId: Int, density: Int, pool: Long, current: LegacyValue?): LegacyValue? {
    var best = current
    val typeId = (resId ushr 16) and 0xff
    val index = resId and 0xffff
    while (r.pos + 8 <= end) {
        val start = r.pos
        val type = r.u16()
        val headerSize = r.u16()
        val size = r.i32().toLong() and MASK32
        if (size < 8) break
        // ResTable_type: id, flags, reserved, entryCount, entriesStart, config
        if (type == 0x0201 && r.u8() == typeId) {
            val flags = r.u8()
            r.u16()
            val count = r.i32()
            val entries = start + (r.i32().toLong() and MASK32)
            val config = r.bytes(headerSize - 20)
            val configDensity = le16(config, 14)
            if (configDensity != DENSITY_ANY && isLegacyDensityConfig(config)) {
                val offset = entryOffset(r, start + headerSize, flags, count, index)
                if (offset >= 0) {
                    r.skipTo(entries + offset)
                    val value = readValue(r, configDensity, pool)
                    if (value != null && (best == null || densityScore(configDensity, density) < densityScore(best.density, density))) {
                        best = value
                    }
                }
            }
        }
        r.skipTo(start + size)
    }
    return best
}

/** Only density (and an sdk below 26) may be set: no night, locale, ... variants. */
private fun isLegacyDensityConfig(config: ByteArray): Boolean {
    val size = minOf(le32(config, 0), config.size)
    if (size >= 28 && le16(config, 24) >= 26) return false
    for (i in 4 until size) {
        if (i == 14 || i == 15 || i in 24..27) continue   // density, sdkVersion, minorVersion
        if (config[i].toInt() != 0) return false
    }
    return true
}

/** Offset of entry [index] from entriesStart, or -1. */
private fun entryOffset(r: LeInput, offsets: Long, flags: Int, count: Int, index: Int): Long {
    if (flags and 0x01 != 0) {                        // FLAG_SPARSE: sorted {idx, offset / 4}
        r.skipTo(offsets)
        repeat(count) {
            val idx = r.u16()
            val offset = r.u16()
            if (idx == index) return offset * 4L
            if (idx > index) return -1
        }
        return -1
    }
    if (index >= count) return -1
    if (flags and 0x02 != 0) {                        // FLAG_OFFSET16: offset / 4, 0xffff = none
        r.skipTo(offsets + 2L * index)
        val offset = r.u16()
        return if (offset == 0xffff) -1 else offset * 4L
    }
    r.skipTo(offsets + 4L * index)
    val offset = r.i32()
    return if (offset == -1) -1 else offset.toLong() and MASK32
}

/** A file or reference value of a simple entry, else null. */
private fun readValue(r: LeInput, density: Int, pool: Long): LegacyValue? {
    val start = r.pos
    val size = r.u16()
    val flags = r.u16()
    val type: Int
    val data: Int
    when {
        flags and 0x08 != 0 -> { type = flags ushr 8; data = r.i32() }    // FLAG_COMPACT
        flags and 0x01 != 0 -> return null                                 // FLAG_COMPLEX
        else -> {
            r.skipTo(start + size)
            r.u16()
            r.u8()
            type = r.u8()
            data = r.i32()
        }
    }
    return if (type == TYPE_STRING || type == TYPE_REFERENCE || type == TYPE_DYNAMIC_REFERENCE) {
        LegacyValue(density, if (type == TYPE_STRING) TYPE_STRING else TYPE_REFERENCE, data, pool)
    } else null
}

/** String [index] of the pool chunk at [pool] in [apk]'s resources.arsc. */
internal fun readPoolString(apk: ZipFile, pool: Long, index: Int): String? {
    if (pool < 0) return null
    apk.getInputStream(apk.getEntry("resources.arsc")).use { stream ->
        val r = LeInput(stream)
        r.skipTo(pool)
        r.u16()
        val headerSize = r.u16()
        r.i32()
        val count = r.i32()
        r.i32()
        val flags = r.i32()
        val strings = r.i32().toLong() and MASK32
        if (index !in 0 until count) return null
        r.skipTo(pool + headerSize + 4L * index)
        r.skipTo(pool + strings + (r.i32().toLong() and MASK32))
        return if (flags and 0x100 != 0) {            // UTF-8: utf16 length, then utf8 length
            r.len8()
            String(r.bytes(r.len8()), Charsets.UTF_8)
        } else {
            String(r.bytes(r.len16() * 2), Charsets.UTF_16LE)
        }
    }
}

private fun le16(b: ByteArray, i: Int) = if (i + 1 < b.size) (b[i].toInt() and 0xff) or ((b[i + 1].toInt() and 0xff) shl 8) else 0
private fun le32(b: ByteArray, i: Int) = if (i + 3 < b.size) le16(b, i) or (le16(b, i + 2) shl 16) else 0

/** Forward-only little-endian reader; skips are seeks on stored zip entries. */
private class LeInput(stream: InputStream) {
    private val input = BufferedInputStream(stream, 8192)
    var pos = 0L
        private set

    fun u8(): Int {
        val b = input.read()
        if (b < 0) throw EOFException()
        pos++
        return b
    }

    fun u16() = u8() or (u8() shl 8)
    fun i32() = u16() or (u16() shl 16)
    fun len8() = u8().let { if (it and 0x80 != 0) ((it and 0x7f) shl 8) or u8() else it }
    fun len16() = u16().let { if (it and 0x8000 != 0) ((it and 0x7fff) shl 16) or u16() else it }

    fun bytes(n: Int): ByteArray {
        val out = ByteArray(n)
        var read = 0
        while (read < n) {
            val r = input.read(out, read, n - read)
            if (r < 0) throw EOFException()
            read += r
        }
        pos += n
        return out
    }

    fun skipTo(target: Long) {
        var left = target - pos
        if (left < 0) throw IOException("Backwards seek in resources.arsc")
        while (left > 0) {
            val skipped = input.skip(left)
            if (skipped <= 0) throw EOFException()
            left -= skipped
        }
        pos = target
    }
}
