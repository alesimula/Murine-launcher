package app.murinelauncher.icons

import android.content.ComponentName
import android.content.Context
import android.content.Intent
import android.content.pm.ApplicationInfo
import android.content.pm.PackageManager
import android.content.pm.ResolveInfo
import android.graphics.Bitmap
import android.graphics.Canvas
import android.graphics.Matrix
import android.graphics.Paint
import android.graphics.Color
import android.graphics.Path
import android.graphics.PorterDuff
import android.graphics.PorterDuffXfermode
import android.graphics.Rect
import android.graphics.RectF
import android.graphics.Region
import android.graphics.drawable.AdaptiveIconDrawable
import android.graphics.drawable.BitmapDrawable
import android.graphics.drawable.ColorDrawable
import android.graphics.drawable.Drawable
import androidx.core.content.res.ResourcesCompat
import app.murinelauncher.widget.radio.RadioGroupPreference
import com.android.launcher3.LauncherFiles
import com.android.launcher3.R
import com.android.launcher3.icons.BaseIconFactory
import com.android.launcher3.icons.LauncherIconProvider
import com.android.launcher3.icons.LauncherIcons
import org.xmlpull.v1.XmlPullParser

/**
 * Manages icon pack discovery, selection, and icon resolution.
 *
 * Icon packs are discovered via standard launcher theme intents.
 * The selected pack and its settings are persisted in SharedPreferences.
 *
 * can be layered on top by adding a Map<ComponentName, String> (component -> pack+drawable) lookup,
 * checked before the global pack in [getIconForComponent].
 */
object IconPackManager {
    const val PREFS_DB_ICON_OVERRIDE = "app.murinelauncher.ICON_OVERRIDE_DATABASE"
    const val PREF_ICON_PACK = "pref_icon_pack"
    const val PREF_ICON_PACK_SYSTEM_ONLY = "pref_icon_pack_system_only"
    const val PREF_ICON_PACK_IGNORE_SHAPE = "pref_icon_pack_ignore_shape"
    const val PREF_ICON_READAPT_FRAME = "pref_icon_readapt_frame"
    const val PREF_ICON_PACK_THEMED_ONLY = "pref_icon_pack_themed_only"

    /** Pseudo-value indicating the launcher to use system's default icons */
    const val SYSTEM_ICON_PACK = ""

    /** Pseudo-value for the "Default (use global setting)" entry in per-app icon overrides */
    const val ICON_PACK_DEFAULT_GLOBAL = "\u001F\u001E§__default_global__§\u001E\u001F"

    @JvmField
    val SYSTEM_ICON_PACK_INFO = IconPackInfo(SYSTEM_ICON_PACK, "System default")

    /** Resolution for sampling pack shape drawable into a Path */
    private const val SHAPE_SAMPLE_SIZE = 200

    /** Standard intents that icon packs declare (parsed via appfilter.xml) */
    private val ICON_PACK_INTENTS = listOf(
        "org.adw.launcher.THEMES",
        "com.gau.go.launcherex.theme",
        "com.novalauncher.THEME",
        "com.dlto.atom.launcher.THEME",
        "com.fede.launcher.THEME_ICONPACK",
        "com.anddoes.launcher.THEME",
        "com.teslacoilsw.launcher.THEME",
        "ch.deletescape.lawnchair.ICONPACK"
        // TODO net.oneplus.launcher.icons.ACTION_PICK_ICON (can't parse via appfilter.xml, needs custom handling)
    )

    // Icon pack discovery

    data class IconPackInfo(
        val packageName: String,
        val label: CharSequence,
    )

    /**
     * Returns the list of installed icon packs, with [SYSTEM_ICON_PACK] as the first entry.
     */
    fun getInstalledPacks(context: Context): List<IconPackInfo> {
        val pm = context.packageManager
        val seen = mutableSetOf<String>()
        val packs = mutableListOf<IconPackInfo>()

        for (action in ICON_PACK_INTENTS) {
            val infos: List<ResolveInfo> = pm.queryIntentActivities(Intent(action), PackageManager.GET_META_DATA)
            for (info in infos) {
                val pkg = info.activityInfo.packageName
                if (pkg == context.packageName) continue
                if (!seen.add(pkg)) continue
                packs.add(IconPackInfo(pkg, info.loadLabel(pm)))
            }
        }

        packs.sortBy { it.label.toString().lowercase() }
        packs.add(0, SYSTEM_ICON_PACK_INFO)
        return packs
    }

    // Preferences

    private fun prefs(context: Context) =
        context.getSharedPreferences(LauncherFiles.SHARED_PREFERENCES_KEY, Context.MODE_PRIVATE)

    fun getSelectedPack(context: Context): String =
        prefs(context).getString(PREF_ICON_PACK, SYSTEM_ICON_PACK) ?: SYSTEM_ICON_PACK

    fun isSystemOnly(context: Context): Boolean =
        prefs(context).getBoolean(PREF_ICON_PACK_SYSTEM_ONLY, false)

    fun isIgnoreShape(context: Context): Boolean =
        prefs(context).getBoolean(PREF_ICON_PACK_IGNORE_SHAPE, false)

    fun isReadaptFrame(context: Context): Boolean =
        prefs(context).getBoolean(PREF_ICON_READAPT_FRAME, false)

    fun isThemedOnly(context: Context): Boolean =
        prefs(context).getBoolean(PREF_ICON_PACK_THEMED_ONLY, false)

    // Per-component icon pack overrides

    private fun componentPrefs(context: Context) = context.getSharedPreferences(PREFS_DB_ICON_OVERRIDE, Context.MODE_PRIVATE)

    /**
     * Returns the icon pack override for a specific component, or null if using global.
     */
    fun getComponentOverride(context: Context, componentKey: String): String? = componentPrefs(context).getString(componentKey, null)

    /**
     * Sets the icon pack override for a specific component;
     * Pass [SYSTEM_ICON_PACK] to force system icons regardless of global pack.
     */
    fun setComponentOverride(context: Context, componentKey: String, packPackage: String) {
        componentPrefs(context).edit().putString(componentKey, packPackage).apply()
    }

    /**
     * Removes the per-app icon override, falling back to global.
     */
    fun resetComponentOverride(context: Context, componentKey: String) {
        componentPrefs(context).edit().remove(componentKey).apply()
    }

    /**
     * Returns true if any per-app icon overrides exist.
     */
    fun hasAnyComponentOverrides(context: Context): Boolean = componentPrefs(context).all.isNotEmpty()

    /**
     * Clears all per-app icon pack overrides.
     */
    fun clearAllComponentOverrides(context: Context) {
        componentPrefs(context).edit().clear().apply()
    }

    /**
     * Returns the set of package names that have per-app icon overrides;
     * Useful for triggering icon cache refresh before/after clearing.
     */
    fun getOverriddenPackageNames(context: Context): Set<String> =
        componentPrefs(context).all.keys.mapNotNull { key ->
            // key is ComponentName.flattenToString() ("package/class")
            key.substringBefore('/').takeIf { it.isNotEmpty() }
        }.toSet()

    /**
     * Returns the effective pack for a given component: per-app icon override if set, else global.
     */
    fun getEffectivePack(context: Context, componentKey: String): String {
        return getComponentOverride(context, componentKey) ?: getSelectedPack(context)
    }

    /**
     * Returns true when the selected pack enforces a custom shape.
     */
    fun enforcesShape(context: Context): Boolean {
        val pack = getSelectedPack(context)
        if (pack == SYSTEM_ICON_PACK) return false
        return ensureDataLoaded(context, pack).enforcesShape
    }

    /**
     * Returns true when the selected icon pack declares a global shape
     * (iconback / iconmask), meaning it is trying to enforce its own shape
     * on all icons.  Adaptive-only packs return false here.
     */
    fun hasGlobalTreatment(context: Context): Boolean {
        val pack = getSelectedPack(context)
        if (pack == SYSTEM_ICON_PACK) return false
        return ensureDataLoaded(context, pack).hasGlobalTreatment()
    }

    // appfilter.xml parsing

    /**
     * Holds everything parsed from a pack's appfilter.xml:
     * per-component drawable map AND global shape declarations.
     */
    private class AppFilterData {
        val componentMap = mutableMapOf<String, String>() // item.component -> item.drawable
        val queriedMisses = mutableSetOf<String>() // components confirmed not in pack (override cache only)
        val backDrawables = mutableListOf<String>() // iconback
        var maskDrawable: String? = null // iconmask
        var uponDrawable: String? = null // iconupon
        var scaleFactor: Float = 1.0f // scale.factor
        var enforcesShape: Boolean = false
        var packShapePath: Path? = null
        var shapeComputed: Boolean = false // true after fullParseAndCompute; false for lightweight entries

        fun hasGlobalTreatment() = backDrawables.isNotEmpty() || maskDrawable != null
    }

    private var cachedPackPackage: String? = null
    private var cachedData: AppFilterData = AppFilterData()
    private val overrideCache = mutableMapOf<String, AppFilterData>()

    /** Clears the primary (global pack) cache. Override cache is kept. */
    fun clearMainCache() {
        cachedPackPackage = null
        cachedData = AppFilterData()
    }

    /** Clears both the primary and override caches. */
    fun clearCaches() {
        cachedPackPackage = null
        cachedData = AppFilterData()
        overrideCache.clear()
    }

    /**
     * Ensures the appfilter.xml for [packPackage] is loaded and cached.
     * Parses both per-component icon mappings AND global shape declarations.
     *
     * @param overrideForComponent non-null for per-app overrides, uses the lightweight mapped cache
     *        (only stores queried component entries, but does not re-do icon shape computation).
     */
    private fun ensureDataLoaded(context: Context, packPackage: String, overrideForComponent: String? = null): AppFilterData {
        if (packPackage == SYSTEM_ICON_PACK) return AppFilterData()

        if (overrideForComponent != null) {
            val cached = overrideCache[packPackage]
            if (cached != null) {
                // Upgrade lightweight entry (from hasIconForComponent) if shape data is needed
                if (!cached.shapeComputed) {
                    val fullData = filteredParseAndCompute(context, packPackage, overrideForComponent)
                    overrideCache[packPackage] = fullData
                    fullData.backDrawables.addAll(cached.backDrawables)
                    fullData.queriedMisses.addAll(cached.queriedMisses)
                    return fullData
                }
                // If component already found or confirmed missing: return cached entry
                if (overrideForComponent in cached.componentMap || overrideForComponent in cached.queriedMisses) return cached
                // If new component for an already-cached pack: cheap XML-only re-parse (no shape computation)
                val drawableName = parseComponentOnly(context, packPackage, overrideForComponent)
                if (drawableName != null) cached.componentMap[overrideForComponent] = drawableName
                else cached.queriedMisses.add(overrideForComponent)
                return cached
            }
            // First access for this override pack: full parse + shape computation
            val fullData = filteredParseAndCompute(context, packPackage, overrideForComponent)
            overrideCache[packPackage] = fullData
            return fullData
        }

        // Primary cache path (global pack)
        if (packPackage == cachedPackPackage) return cachedData
        val data = fullParseAndCompute(context, packPackage)
        cachedPackPackage = packPackage
        cachedData = data
        return data
    }

    /**
     * Filtered parse of appfilter.xml + expensive shape computation;
     * re-filters the returned data, returning only the overridden icon
     * @see fullParseAndCompute
     */
    private fun filteredParseAndCompute(context: Context, packPackage: String, overrideForComponent: String): AppFilterData {
        val fullData = fullParseAndCompute(context, packPackage)
        val drawableName = fullData.componentMap[overrideForComponent]
        fullData.componentMap.clear()
        if (drawableName != null) fullData.componentMap[overrideForComponent] = drawableName
        else fullData.queriedMisses.add(overrideForComponent)
        return fullData
    }

    /**
     * Full parse of appfilter.xml + expensive shape computation (enforcesCustomShape / computeShapePath).
     * Used for both primary cache and first-time override cache population.
     */
    private fun fullParseAndCompute(context: Context, packPackage: String): AppFilterData {
        val data = AppFilterData()
        try {
            val pm = context.packageManager
            val packRes = pm.getResourcesForApplication(packPackage)

            val xmlId = packRes.getIdentifier("appfilter", "xml", packPackage)
            if (xmlId != 0) {
                val parser = packRes.getXml(xmlId)
                parser.use { parser -> parseAppFilterCommon(parser, data) }
            } else {
                packRes.assets.open("appfilter.xml").use { stream ->
                    val parser = android.util.Xml.newPullParser()
                    parser.setInput(stream, "UTF-8")
                    parseAppFilterCommon(parser, data)
                }
            }
        } catch (_: Exception) { /* Pack may be uninstalled, malformed, etc. */ }

        // Determine whether this pack enforces a custom shape.
        // For iconmask -> enforcement guaranteed;
        // For iconback(s) -> calculate by comparing first back drawable against the system's adaptive mask;
        // Otherwise -> marked as not enforced (uses user declared shape for other icons).
        data.enforcesShape = data.maskDrawable != null
        if (!data.enforcesShape && data.backDrawables.isNotEmpty()) {
            try {
                val pm = context.packageManager
                val packRes = pm.getResourcesForApplication(packPackage)
                val iconDpi = context.resources.configuration.densityDpi
                val backId = packRes.getIdentifier(data.backDrawables[0], "drawable", packPackage)
                if (backId != 0) {
                    val backDr = packRes.getDrawableForDensity(backId, iconDpi, null)
                    if (backDr != null) {
                        data.enforcesShape = enforcesCustomShape(backDr)
                        if (data.enforcesShape) data.packShapePath = computeShapePath(backDr, false)
                    }
                }
            } catch (_: Exception) {}
        }

        // For mask-based shape enforcement, derive the shape path from the mask
        if (data.enforcesShape && data.maskDrawable != null && data.packShapePath == null) {
            try {
                val pm = context.packageManager
                val packRes = pm.getResourcesForApplication(packPackage)
                val iconDpi = context.resources.configuration.densityDpi
                val maskId = packRes.getIdentifier(data.maskDrawable, "drawable", packPackage)
                if (maskId != 0) {
                    val maskDr = packRes.getDrawableForDensity(maskId, iconDpi, null)
                    if (maskDr != null) data.packShapePath = computeShapePath(maskDr, true)
                }
            } catch (_: Exception) {}
        }
        data.shapeComputed = true
        return data
    }

    /**
     * XML-only re-parse to find a single component's drawable;
     * Does not populate the full componentMap or compute shape data;
     * Used when the override cache already has the pack's global treatment / shape data
     *  but a new component needs to be looked up.
     */
    private fun parseComponentOnly(context: Context, packPackage: String, componentKey: String): String? {
        try {
            val pm = context.packageManager
            val packRes = pm.getResourcesForApplication(packPackage)
            val xmlId = packRes.getIdentifier("appfilter", "xml", packPackage)
            if (xmlId != 0) {
                packRes.getXml(xmlId).use { parser -> return findComponentInXml(parser, componentKey) }
            } else {
                packRes.assets.open("appfilter.xml").use { stream ->
                    val parser = android.util.Xml.newPullParser()
                    parser.setInput(stream, "UTF-8")
                    return findComponentInXml(parser, componentKey)
                }
            }
        } catch (_: Exception) {}
        return null
    }

    /** Scans appfilter.xml item entries for a specific component, returns early on match. */
    private fun findComponentInXml(parser: XmlPullParser, targetComponent: String): String? {
        var eventType = parser.eventType
        while (eventType != XmlPullParser.END_DOCUMENT) {
            if (eventType == XmlPullParser.START_TAG && parser.name == "item") {
                val component = parser.getAttributeValue(null, "component")
                val drawable = parser.getAttributeValue(null, "drawable")
                if (component != null && drawable != null) {
                    val cn = extractComponentName(component)
                    if (cn == targetComponent) return drawable
                }
            }
            eventType = parser.next()
        }
        return null
    }

    /**
     * Compares the iconback shape against the system's adaptive icon mask;
     * If the iconback extends significantly beyond the system shape, the pack is enforcing a custom shape.
     */
    private fun enforcesCustomShape(backDrawable: Drawable): Boolean {
        // Adaptive drawables follow the system shape
        if (backDrawable is AdaptiveIconDrawable) return false

        val s = SHAPE_SAMPLE_SIZE

        // Render the system's adaptive icon shape
        val sysBmp = Bitmap.createBitmap(s, s, Bitmap.Config.ARGB_8888)
        Canvas(sysBmp).also {
            val sysIcon = AdaptiveIconDrawable(ColorDrawable(Color.WHITE), null)
            sysIcon.setBounds(0, 0, s, s)
            sysIcon.draw(it)
        }

        // Render the iconback
        val backBmp = Bitmap.createBitmap(s, s, Bitmap.Config.ARGB_8888)
        Canvas(backBmp).also {
            backDrawable.setBounds(0, 0, s, s)
            backDrawable.draw(it)
        }

        // Bidirectional comparison against the system shape.
        var shapeDiff = 0
        for (y in 0 until s) {
            for (x in 0 until s) {
                val sysAlpha = sysBmp.getPixel(x, y) ushr 24
                val backAlpha = backBmp.getPixel(x, y) ushr 24
                val sysOpaque = sysAlpha > 128
                val backOpaque = backAlpha > 128
                if (sysOpaque != backOpaque) shapeDiff++
            }
        }

        sysBmp.recycle()
        backBmp.recycle()

        // If >0.5% of total area extends beyond the system shape, the pack enforces a custom shape.
        return shapeDiff > s * s * 0.005
    }

    /**
     * Converts a drawable's alpha channel into a [Path] via [Region.getBoundaryPath].
     * @param invertAlpha true for iconmask (shape = where mask is transparent),
     *                    false for iconback (shape = where back is opaque).
     */
    private fun computeShapePath(drawable: Drawable, invertAlpha: Boolean): Path? {
        val s = SHAPE_SAMPLE_SIZE
        val bmp = Bitmap.createBitmap(s, s, Bitmap.Config.ARGB_8888)
        val canvas = Canvas(bmp)
        drawable.setBounds(0, 0, s, s)
        drawable.draw(canvas)

        val region = Region()
        for (y in 0 until s) {
            var spanStart = -1
            for (x in 0 until s) {
                val alpha = bmp.getPixel(x, y) ushr 24
                val include = if (invertAlpha) alpha < 128 else alpha > 128
                if (include && spanStart == -1) {
                    spanStart = x
                } else if (!include && spanStart != -1) {
                    region.op(Rect(spanStart, y, x, y + 1), Region.Op.UNION)
                    spanStart = -1
                }
            }
            if (spanStart != -1) {
                region.op(Rect(spanStart, y, s, y + 1), Region.Op.UNION)
            }
        }
        bmp.recycle()

        if (region.isEmpty) return null
        val path = Path()
        region.getBoundaryPath(path)
        return path
    }

    /**
     * @return the icon pack's shape [Path] scaled to [bounds],
     *         or null if the current pack does not enforce a custom shape.
     */
    fun getPackShapePath(context: Context, bounds: Rect): Path? {
        val pack = getSelectedPack(context)
        if (pack == SYSTEM_ICON_PACK) return null
        val data = ensureDataLoaded(context, pack)
        val basePath = data.packShapePath ?: return null

        val result = Path(basePath)
        val matrix = Matrix()
        matrix.setRectToRect(
            RectF(0f, 0f, SHAPE_SAMPLE_SIZE.toFloat(), SHAPE_SAMPLE_SIZE.toFloat()),
            RectF(bounds),
            Matrix.ScaleToFit.FILL
        )
        result.transform(matrix)
        return result
    }

    /**
     * Parser for appfilter.xml, populates the [AppFilterData] object
     */
    private fun parseAppFilterCommon(parser: XmlPullParser, data: AppFilterData) {
        var eventType = parser.eventType
        while (eventType != XmlPullParser.END_DOCUMENT) {
            if (eventType == XmlPullParser.START_TAG) {
                when (parser.name) {
                    "item" -> {
                        val component = parser.getAttributeValue(null, "component")
                        val drawable = parser.getAttributeValue(null, "drawable")
                        if (component != null && drawable != null) {
                            val cn = extractComponentName(component)
                            if (cn != null) data.componentMap[cn] = drawable
                        }
                    }
                    "iconback" -> data.backDrawables.addAll(collectImgAttributes(parser))
                    "iconmask" -> {
                        val imgs = collectImgAttributes(parser)
                        if (imgs.isNotEmpty()) data.maskDrawable = imgs[0]
                    }
                    "iconupon" -> {
                        val imgs = collectImgAttributes(parser)
                        if (imgs.isNotEmpty()) data.uponDrawable = imgs[0]
                    }
                    "scale" -> {
                        val factor = parser.getAttributeValue(null, "factor")
                        if (factor != null) data.scaleFactor = factor.toFloatOrNull() ?: 1.0f
                    }
                }
            }
            eventType = parser.next()
        }
    }

    /**
     * Parser - Collects all img attribute values from the current element.
     * @see parseAppFilterCommon
     */
    private fun collectImgAttributes(parser: XmlPullParser): List<String> {
        val result = mutableListOf<String>()
        for (i in 0 until parser.attributeCount) {
            val name = parser.getAttributeName(i)
            if (name.startsWith("img")) {
                val value = parser.getAttributeValue(i)
                if (!value.isNullOrEmpty()) result.add(value)
            }
        }
        return result
    }

    /**
     * Parser - Extracts the flattened component name from appfilter format:
     * E.g. "ComponentInfo{com.example/com.example.Activity}" -> "com.example/com.example.Activity"
     * @see parseAppFilterCommon
     */
    private fun extractComponentName(raw: String): String? {
        val start = raw.indexOf('{')
        val end = raw.indexOf('}')
        if (start < 0 || end < 0 || end <= start) return null
        return raw.substring(start + 1, end)
    }

    // Icon resolution

    /**
     * Returns the icon pack drawable for the given component, or null if filtered or the pack does not provide one.
     *
     * The returned drawable is a raw pack icon; The caller ([LauncherIconProvider]) is responsible
     * for setting CONFIG_HINT_NO_WRAP if the pack's shape should be preserved.
     */
    fun getIconForComponent(context: Context, componentName: ComponentName, iconDpi: Int): Drawable? {
        // Check per-component override first
        val componentKey = componentName.flattenToString()
        val override = getComponentOverride(context, componentKey)
        if (override != null) {
            if (override == SYSTEM_ICON_PACK) return null // forced system icon
            return loadIconFromPack(context, componentName, override, iconDpi)
        }

        val pack = getSelectedPack(context)
        if (pack == SYSTEM_ICON_PACK) return null

        // System-only mode: skip non-system apps
        if (isSystemOnly(context)) {
            try {
                val ai = context.packageManager.getApplicationInfo(componentName.packageName, 0)
                val isSystem = (ai.flags and ApplicationInfo.FLAG_SYSTEM) != 0
                if (!isSystem) return null
            } catch (_: PackageManager.NameNotFoundException) {
                return null
            }
        }

        val data = ensureDataLoaded(context, pack)
        val drawableName = data.componentMap[componentName.flattenToString()] ?: return null
        return loadDrawableFromPack(context, pack, drawableName, iconDpi)
    }

    /**
     * Loads an icon from a specific pack for a specific component (used by per-component overrides).
     */
    private fun loadIconFromPack(context: Context, componentName: ComponentName, packPackage: String, iconDpi: Int): Drawable? {
        val data = ensureDataLoaded(context, packPackage, overrideForComponent = componentName.flattenToString())
        val drawableName = data.componentMap[componentName.flattenToString()] ?: return null
        return loadDrawableFromPack(context, packPackage, drawableName, iconDpi)
    }

    private fun loadDrawableFromPack(context: Context, packPackage: String, drawableName: String, iconDpi: Int, ): Drawable? {
        return try {
            val pm = context.packageManager
            val packRes = pm.getResourcesForApplication(packPackage)
            val id = packRes.getIdentifier(drawableName, "drawable", packPackage)
            if (id == 0) return null
            packRes.getDrawableForDensity(id, iconDpi, null)
        } catch (_: Exception) {
            null
        }
    }

    /**
     * Applies the icon pack's global shape treatment (iconback / iconmask / iconupon / scale)
     * to icons not directly present in an icon pack.
     *
     * Renders the default icon to a properly-sized bitmap using [LauncherIcons.createScaledBitmap];
     * Apply scaleFactor, then iconmask (DST_OUT), iconback (DST_OVER) and iconupon (SRC_ATOP);
     * @return a plain [BitmapDrawable] to the caller, who then sets the CONFIG_HINT_NO_WRAP flag,
     *         or null, when the component should be skipped.
     */
    fun applyGlobalTreatment(context: Context, componentName: ComponentName, defaultIcon: Drawable, iconDpi: Int): Drawable? {
        val componentKey = componentName.flattenToString()
        val override = getComponentOverride(context, componentKey)

        // Determine effective pack: per-app icon override takes precedence over global.
        val pack: String
        val isOverride: Boolean
        if (override != null) {
            if (override == SYSTEM_ICON_PACK) return null // forced system icon
            pack = override
            isOverride = true
        } else {
            pack = getSelectedPack(context)
            if (pack == SYSTEM_ICON_PACK) return null
            isOverride = false
        }

        // System-only flag check
        if (!isOverride && isSystemOnly(context)) {
            try {
                val ai = context.packageManager.getApplicationInfo(componentName.packageName, 0)
                if ((ai.flags and ApplicationInfo.FLAG_SYSTEM) == 0) return null
            } catch (_: PackageManager.NameNotFoundException) {
                return null
            }
        }

        val data = ensureDataLoaded(context, pack, overrideForComponent = if (isOverride) componentKey else null)
        if (!data.hasGlobalTreatment()) return null

        // Check "Ignore pack shape" flag: when ON, disable applyGlobalTreatment when shape is enforced (TODO is there a better way?).
        // Non-shape-enforcing packs just provide a background; the user's shape is applied via AdaptiveIconDrawable wrapping regardless.
        if (data.enforcesShape && isIgnoreShape(context)) return null

        // Check "Readapt to frame" flag: when ON, adaptive default icons in shape-enforcing packs
        // bypass compositing and instead get the pack's shape applied directly via getShapePath.
        if (data.enforcesShape && isReadaptFrame(context) && defaultIcon is AdaptiveIconDrawable) {
            defaultIcon.changingConfigurations = defaultIcon.changingConfigurations or BaseIconFactory.CONFIG_HINT_PACK_SHAPE
            return null
        }

        return try {
            val packRes = context.packageManager.getResourcesForApplication(pack)
            val hashCode = componentName.hashCode() and 0xFFFF

            // Render the default icon into a properly-sized bitmap through the normal icon pipeline (wrapping, shaping, shadow).
            val li = LauncherIcons.obtain(context)
            val bitmap = li.createScaledBitmap(defaultIcon, BaseIconFactory.MODE_WITH_SHADOW)
            li.close()
            val canvas = Canvas(bitmap)

            // Scale the icon content by the pack's scale factor
            scaleBitmap(bitmap, canvas, data.scaleFactor)

            // Apply iconmask via DST_OUT (clips icon to pack shape)
            if (data.maskDrawable != null) {
                val maskId = packRes.getIdentifier(data.maskDrawable, "drawable", pack)
                if (maskId != 0) {
                    val maskDr = packRes.getDrawableForDensity(maskId, iconDpi, null)
                    if (maskDr != null) maskBitmap(bitmap, canvas, maskDr)
                }
            }

            // Apply iconback via DST_OVER (draws behind existing content)
            if (data.backDrawables.isNotEmpty()) {
                val idx = hashCode % data.backDrawables.size
                val backName = data.backDrawables[idx]
                val backId = packRes.getIdentifier(backName, "drawable", pack)
                if (backId != 0) {
                    val backDr = packRes.getDrawableForDensity(backId, iconDpi, null)
                    if (backDr != null) backBitmap(bitmap, canvas, backDr)
                }
            }

            // Apply iconupon via SRC_ATOP (draws on top, within alpha)
            if (data.uponDrawable != null) {
                val uponId = packRes.getIdentifier(data.uponDrawable, "drawable", pack)
                if (uponId != 0) {
                    val uponDr = packRes.getDrawableForDensity(uponId, iconDpi, null)
                    if (uponDr != null) uponBitmap(bitmap, canvas, uponDr)
                }
            }

            if (data.enforcesShape) {
                // Pack enforces a specific shape (via mask or shaped back); preserve baked-in shape.
                BitmapDrawable(context.resources, bitmap)
            } else {
                // Pack does not enforce a shape; wrap as AdaptiveIconDrawable to apply user's chosen shape.
                AdaptiveIconDrawable(ColorDrawable(0xFFFFFF), BitmapDrawable(context.resources, bitmap))
            }
        } catch (_: Exception) {
            null
        }
    }

    // Bitmap helper methods

    private fun scaleBitmap(bitmap: Bitmap, canvas: Canvas, scale: Float) {
        if (scale == 1.0f) return
        val scaled = Bitmap.createScaledBitmap(
            bitmap,
            (bitmap.width * scale).toInt(),
            (bitmap.height * scale).toInt(),
            true
        )
        val offset = (1.0f - scale) * 0.5f
        val matrix = Matrix()
        matrix.postTranslate(bitmap.width * offset, bitmap.height * offset)
        bitmap.eraseColor(0)
        canvas.setBitmap(bitmap)
        canvas.drawBitmap(scaled, matrix, null)
        scaled.recycle()
    }

    private fun maskBitmap(bitmap: Bitmap, canvas: Canvas, mask: Drawable) {
        val w = bitmap.width
        val h = bitmap.height
        val maskBmp = Bitmap.createBitmap(w, h, Bitmap.Config.ARGB_8888)
        val maskCanvas = Canvas(maskBmp)
        mask.setBounds(0, 0, w, h)
        mask.draw(maskCanvas)

        val paint = Paint(Paint.ANTI_ALIAS_FLAG).apply {
            xfermode = PorterDuffXfermode(PorterDuff.Mode.DST_OUT)
        }
        canvas.setBitmap(bitmap)
        canvas.drawBitmap(maskBmp, 0f, 0f, paint)
        maskBmp.recycle()
    }

    private fun backBitmap(bitmap: Bitmap, canvas: Canvas, back: Drawable) {
        val w = bitmap.width
        val h = bitmap.height
        val backBmp = Bitmap.createBitmap(w, h, Bitmap.Config.ARGB_8888)
        val backCanvas = Canvas(backBmp)
        back.setBounds(0, 0, w, h)
        back.draw(backCanvas)

        val paint = Paint(Paint.ANTI_ALIAS_FLAG).apply {
            xfermode = PorterDuffXfermode(PorterDuff.Mode.DST_OVER)
        }
        canvas.setBitmap(bitmap)
        canvas.drawBitmap(backBmp, 0f, 0f, paint)
        backBmp.recycle()
    }

    private fun uponBitmap(bitmap: Bitmap, canvas: Canvas, upon: Drawable) {
        val w = bitmap.width
        val h = bitmap.height
        val uponBmp = Bitmap.createBitmap(w, h, Bitmap.Config.ARGB_8888)
        val uponCanvas = Canvas(uponBmp)
        upon.setBounds(0, 0, w, h)
        upon.draw(uponCanvas)

        val paint = Paint(Paint.ANTI_ALIAS_FLAG).apply {
            xfermode = PorterDuffXfermode(PorterDuff.Mode.SRC_ATOP)
        }
        canvas.setBitmap(bitmap)
        canvas.drawBitmap(uponBmp, 0f, 0f, paint)
        uponBmp.recycle()
    }

    // ---- Per-app icon check ----

    /**
     * Returns true if [packPackage] has an explicit icon declared for [componentKey].
     * Checks all caches first; on miss, does a targeted XML scan via [parseComponentOnly]
     * and stores the result in the override cache.
     */
    fun hasIconForComponent(context: Context, packPackage: String, componentKey: String): Boolean {
        if (packPackage == SYSTEM_ICON_PACK) return false
        // Check primary (global) cache
        if (packPackage == cachedPackPackage && componentKey in cachedData.componentMap) return true
        // Check per-app override cache
        val cached = overrideCache[packPackage]
        if (cached != null) {
            if (componentKey in cached.componentMap) return true
            if (componentKey in cached.queriedMisses) return false
        }

        // Targeted XML scan: only scans <item> tags, no shape computation
        val drawable = parseComponentOnly(context, packPackage, componentKey)
        // Cache result in override cache, or create lightweight entry (shapeComputed = false) if needed
        if (cached != null) {
            if (drawable != null) cached.componentMap[componentKey] = drawable
            else cached.queriedMisses.add(componentKey)
        } else {
            val entry = AppFilterData()
            if (drawable != null) entry.componentMap[componentKey] = drawable
            else entry.queriedMisses.add(componentKey)
            overrideCache[packPackage] = entry
        }
        return drawable != null
    }

    // ---- Shared preference builder ----

    /**
     * Builds the icon pack entry list for a picker.
     * @param perAppComponent non-null for per-app overrides; prepends "Default (global)" entry.
     */
    @JvmStatic
    fun buildIconPackEntries(context: Context, perAppComponent: String? = null): List<IconPackInfo> {
        val packs = getInstalledPacks(context)
        return if (perAppComponent != null) {
            val defaultLabel = context.getString(R.string.app_info_icon_pack_default)
            listOf(IconPackInfo(ICON_PACK_DEFAULT_GLOBAL, defaultLabel)) + packs
        } else packs
    }

    /**
     * Returns whether [pack] should be visible for a per-app picker for [componentKey].
     * The default entry and system pack are always visible.
     */
    @JvmStatic
    fun isPackVisibleForComponent(context: Context, pack: IconPackInfo, componentKey: String): Boolean =
        pack.packageName == ICON_PACK_DEFAULT_GLOBAL || pack.packageName == SYSTEM_ICON_PACK ||
                hasIconForComponent(context, pack.packageName, componentKey)

    /**
     * Configures a [RadioGroupPreference] for icon pack selection.
     * @param perAppComponent non-null for per-app overrides (component key);
     *        EDIT: discontinued for per-app overrides in favor of FilterableIconPackSheet
     */
    @JvmStatic
    @JvmOverloads
    fun configureIconPackPreference(pref: RadioGroupPreference, perAppComponent: String? = null): RadioGroupPreference.Typed<IconPackInfo> {
        val ctx = pref.context
        val entries = buildIconPackEntries(ctx, perAppComponent)
        pref.setTintSheetIcons(false)
        pref.setTintPreviewIcon(false)
        return pref.asList(entries) { it.packageName }.apply {
            setTextProvider { _, pack -> pack.label }
            setIconProvider { c, pack ->
                if (pack.packageName == ICON_PACK_DEFAULT_GLOBAL) null
                else getPackIcon(c, pack.packageName)
            }
            if (perAppComponent != null) setVisibleProvider { c, pack ->
                isPackVisibleForComponent(c, pack, perAppComponent)
            }
        }
    }

    /**
     * Loads the icon pack's app icon to display it in the settings picker.
     */
    fun getPackIcon(context: Context, packageName: String): Drawable? {
        return if (packageName == SYSTEM_ICON_PACK) AdaptiveIconDrawable(
            ResourcesCompat.getDrawable(context.resources, R.drawable.ic_default_full, null),
            null
        ) else try {
            context.packageManager.getApplicationIcon(packageName)
        } catch (_: PackageManager.NameNotFoundException) {
            null
        }
    }
}
