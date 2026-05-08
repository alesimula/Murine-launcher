package app.lawnchair.icons

import android.app.ActivityThread
import android.content.Context
import android.content.SharedPreferences
import android.content.pm.LauncherActivityInfo
import android.graphics.Bitmap
import android.graphics.Canvas
import android.graphics.drawable.BitmapDrawable
import android.graphics.drawable.Drawable
import androidx.core.graphics.ColorUtils
import androidx.palette.graphics.Palette
import com.android.launcher3.icons.BaseIconFactory.DEFAULT_WRAPPER_BACKGROUND
import com.android.launcher3.util.ComponentKey
import org.json.JSONObject
import java.util.concurrent.ConcurrentHashMap

private const val SHARED_PREFERENCES_KEY: String = "com.android.launcher3.prefs"

val Context.prefs: SharedPreferences get() = applicationContext.getSharedPreferences(SHARED_PREFERENCES_KEY, Context.MODE_PRIVATE)

fun shouldWrapAdaptive(context: Context) = context.prefs.getBoolean("prefs_wrapAdaptive", true)
fun Context.shouldTransparentBGIcons(): Boolean = prefs.getBoolean("prefs_transparentIconBackground", false)
fun Context.shouldShadowBGIcons(): Boolean = prefs.getBoolean("pref_shadowBGIcons", true)

fun Context.isThemedIconsEnabled(): Boolean = prefs.getBoolean("themed_icons", false)
fun Context.shouldTintIconPackBackgrounds(): Boolean = prefs.getBoolean("tint_icon_pack_backgrounds", false)

val prefsNoContext: SharedPreferences get() = ActivityThread.currentApplication()
    .getSharedPreferences(SHARED_PREFERENCES_KEY, Context.MODE_PRIVATE)

fun shouldForceMonochrome(): Boolean {
    val prefs = prefsNoContext

    return prefs.getBoolean("pref_forceIconMonochrome", false)
}

fun getCustomAppNameForComponent(info: LauncherActivityInfo): CharSequence? {
    val key = ComponentKey(info.componentName, info.user).toString()
    val customLabel = getCustomLabelForKey(key)
    return if (customLabel.isNullOrEmpty()) info.label else customLabel
}

private class LabelMapCache(private val prefKey: String) {
    @Volatile private var cache: ConcurrentHashMap<String, String>? = null

    fun get(prefs: SharedPreferences): ConcurrentHashMap<String, String> {
        var cache = this.cache
        if (cache != null) return cache
        synchronized(this) {
            cache = this.cache
            if (cache != null) return cache
            val newCache = ConcurrentHashMap<String, String>()
            val mapJson = prefs.getString(prefKey, "{}") ?: "{}"
            if (mapJson != "{}") {
                val obj = JSONObject(mapJson)
                obj.keys().forEach { newCache[it] = obj.getString(it) }
            }
            cache = newCache
            return newCache
        }
    }

    fun set(prefs: SharedPreferences, key: String, label: String?) {
        val isRemoval = label.isNullOrEmpty()

        val obj = JSONObject(prefs.getString(prefKey, "{}") ?: "{}")
        if (isRemoval) obj.remove(key)
        else obj.put(key, label)
        prefs.edit().putString(prefKey, obj.toString()).apply()

        val cache = get(prefs)
        if (isRemoval) cache.remove(key)
        else cache[key] = label
    }
}

private val appNameMap = LabelMapCache("pref_appNameMap")
private val instanceLabelMap = LabelMapCache("pref_instanceLabelMap")

fun getCustomLabelForKey(componentKeyStr: String): String? {
    val prefs = prefsNoContext
    return appNameMap.get(prefs)[componentKeyStr]
}

fun setCustomLabelForKey(componentKeyStr: String, label: String?) {
    val prefs = prefsNoContext
    appNameMap.set(prefs, componentKeyStr, label)
}

fun getCustomInstanceLabelForId(itemId: Int): String? {
    if (itemId < 0) return null
    val prefs = prefsNoContext
    return instanceLabelMap.get(prefs)[itemId.toString()]
}

fun setCustomInstanceLabelForId(itemId: Int, label: String?) {
    if (itemId < 0) return
    val prefs = prefsNoContext
    instanceLabelMap.set(prefs, itemId.toString(), label)
}

fun getWrapperBackgroundColor(context: Context, icon: Drawable): Int {
    val lightness = context.prefs.getFloat("pref_coloredBackgroundLightness", 1f)
    val palette = Palette.Builder(drawableToBitmap(icon)).generate()
    val dominantColor = palette.getDominantColor(DEFAULT_WRAPPER_BACKGROUND)
    return setLightness(dominantColor, lightness)
}

private fun setLightness(color: Int, lightness: Float): Int {
    if (color == DEFAULT_WRAPPER_BACKGROUND) {
        return color
    }
    val outHsl = floatArrayOf(0f, 0f, 0f)
    ColorUtils.colorToHSL(color, outHsl)
    outHsl[2] = lightness
    return ColorUtils.HSLToColor(outHsl)
}

fun drawableToBitmap(drawable: Drawable): Bitmap {
    if (drawable is BitmapDrawable) {
        return drawable.bitmap
    }

    val width = drawable.intrinsicWidth.coerceAtLeast(1)
    val height = drawable.intrinsicHeight.coerceAtLeast(1)
    val bitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888)
    val canvas = Canvas(bitmap)
    drawable.setBounds(0, 0, canvas.width, canvas.height)
    drawable.draw(canvas)
    return bitmap
}
