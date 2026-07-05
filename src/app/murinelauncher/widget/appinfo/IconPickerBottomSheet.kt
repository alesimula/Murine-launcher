package app.murinelauncher.widget.appinfo

import android.content.Context
import android.graphics.Bitmap
import android.graphics.Canvas
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.util.LruCache
import android.util.TypedValue
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import app.murinelauncher.icons.IconPackManager
import android.icu.text.Collator
import android.icu.text.RuleBasedCollator
import android.icu.text.SearchIterator
import android.icu.text.StringSearch
import app.murinelauncher.widget.radio.RadioGroupBottomSheet
import java.text.StringCharacterIterator
import com.android.launcher3.R
import com.android.launcher3.util.Executors
import com.google.android.material.bottomsheet.BottomSheetDialogFragment

/**
 * Bottom sheet that lets the user pick a specific drawable from an icon pack
 * as the per-app icon override.
 *
 * Icons the pack associates with the app itself (appfilter entries for its package)
 * are listed first under a separator, followed by the pack's full drawable list.
 * Listing follows [IconPackManager]'s cache policy: the globally selected pack goes
 * through the primary cache, any other pack is parsed volatilely.
 */
class IconPickerBottomSheet : BottomSheetDialogFragment() {

    fun interface OnIconPickedListener {
        fun onIconPicked(drawableName: String)
    }

    private var packPackage: String? = null
    private var componentKey: String = ""
    private var sheetTitle: CharSequence = ""
    private var listener: OnIconPickedListener? = null

    fun configure(packPackage: String, title: CharSequence, componentKey: String, listener: OnIconPickedListener) {
        this.packPackage = packPackage
        this.sheetTitle = title
        this.componentKey = componentKey
        this.listener = listener
    }

    override fun getTheme(): Int =
        com.android.settingslib.widget.theme.R.style.Theme_SettingsLib_BottomSheetDialog

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View =
        inflater.inflate(R.layout.icon_picker_bottom_sheet, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        // Configured programmatically; nothing to restore after process recreation
        val pack = packPackage ?: run { dismissAllowingStateLoss(); return }

        view.findViewById<TextView>(R.id.sheet_title)?.text = sheetTitle
        dialog?.setOnShowListener { RadioGroupBottomSheet.applyAdjustedBackgroundTint(dialog) }

        val ctx = view.context
        val appCtx = ctx.applicationContext
        val adapter = IconGridAdapter(ctx, pack) { name ->
            listener?.onIconPicked(name)
            dismiss()
        }
        view.findViewById<RecyclerView>(R.id.icon_grid)?.apply {
            layoutManager = GridLayoutManager(ctx, SPAN_COUNT).also { glm ->
                glm.spanSizeLookup = object : GridLayoutManager.SpanSizeLookup() {
                    override fun getSpanSize(position: Int): Int =
                        if (adapter.isHeader(position)) SPAN_COUNT else 1
                }
            }
            this.adapter = adapter
        }

        view.findViewById<EditText>(R.id.search_bar)?.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(s: Editable?) = adapter.filter(s?.toString().orEmpty())
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}
            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {}
        })

        Executors.MODEL_EXECUTOR.execute {
            val appIcons = IconPackManager.getPackIconsForApp(appCtx, pack, componentKey)
            // Bucket by first character; Anything not a letter goes to "#".
            val sections = IconPackManager.listPackDrawables(appCtx, pack)
                .filterNot(appIcons.toSet()::contains)
                .sorted()
                .groupBy { name ->
                    val c = name.firstOrNull()
                    if (c?.isLetter() == true) c.uppercase() else "#"
                }
                .toList()
                .sortedBy { it.first }
            Executors.MAIN_EXECUTOR.execute {
                if (isAdded) adapter.submit(appIcons, sections)
            }
        }
    }

    /**
     * Grid adapter: optional "From this app" section, separator header, then all pack icons.
     * Icons are inflated and rasterized to cell-sized bitmaps off the main thread (in parallel),
     * kept only in a sheet-local [LruCache] (volatile; never touches [IconPackManager]'s caches).
     */
    private class IconGridAdapter(context: Context, private val packPackage: String, private val onClick: (String) -> Unit) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

        /** A row is either a section header ([header] set) or an icon cell ([icon] set). */
        private class Row(val header: CharSequence? = null, val icon: String? = null)

        private val appCtx = context.applicationContext
        private val iconDpi = context.resources.configuration.densityDpi
        /** Resolved once per sheet; each per-icon load would otherwise cost a PM IPC. */
        private val packRes by lazy { IconPackManager.getPackResources(appCtx, packPackage) }
        private val iconSizePx = dp(context, CELL_SIZE_DP - 2 * CELL_PADDING_DP)
        private val bitmapCache = LruCache<String, Bitmap>(CACHE_SIZE)
        private var appIcons: List<String> = emptyList()
        private var allSections: List<Pair<String, List<String>>> = emptyList()
        private var query = ""
        /**
         * Collator for permissive search.
         */
        private val collator = (Collator.getInstance() as? RuleBasedCollator)?.apply {
            strength = Collator.PRIMARY
            decomposition = Collator.CANONICAL_DECOMPOSITION
            setAlternateHandlingShifted(true)
        }
        private var rows: List<Row> = emptyList()

        fun isHeader(position: Int): Boolean = rows[position].header != null

        fun submit(app: List<String>, sections: List<Pair<String, List<String>>>) {
            appIcons = app
            allSections = sections
            rebuild()
        }

        fun filter(q: String) {
            query = q
            rebuild()
        }

        /** New collation search for the current query, or null when nothing should be filtered. */
        private fun newSearch(): StringSearch? {
            if (query.isEmpty() || collator == null) return null
            return try {
                StringSearch(query, StringCharacterIterator(query), collator)
            } catch (_: Exception) {
                null
            }
        }

        private fun List<String>.filterQuery(search: StringSearch?): List<String> {
            search ?: return this
            return filter { name ->
                search.setTarget(StringCharacterIterator(name))
                search.first() != SearchIterator.DONE
            }
        }

        private fun rebuild() {
            val search = newSearch()
            val app = appIcons.filterQuery(search)
            rows = buildList {
                if (app.isNotEmpty()) {
                    add(Row(header = appCtx.getString(R.string.suggested_widgets_header_title)))
                    app.forEach { add(Row(icon = it)) }
                }
                allSections.forEach { (section, icons) ->
                    val filtered = icons.filterQuery(search)
                    if (filtered.isNotEmpty()) {
                        add(Row(header = section))
                        filtered.forEach { add(Row(icon = it)) }
                    }
                }
            }
            notifyDataSetChanged()
        }

        override fun getItemCount(): Int = rows.size

        override fun getItemViewType(position: Int): Int =
            if (isHeader(position)) TYPE_HEADER else TYPE_ICON

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
            val ctx = parent.context
            return if (viewType == TYPE_HEADER) {
                val tv = TextView(ctx).apply {
                    layoutParams = RecyclerView.LayoutParams(
                        ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT)
                    setPadding(dp(ctx, 8), dp(ctx, 16), dp(ctx, 8), dp(ctx, 8))
                    setTextSize(TypedValue.COMPLEX_UNIT_SP, 14f)
                    setTextColor(ContextCompat.getColor(ctx,
                        com.android.settingslib.widget.theme.R.color.settingslib_materialColorPrimary))
                }
                object : RecyclerView.ViewHolder(tv) {}
            } else {
                val iv = ImageView(ctx).apply {
                    layoutParams = RecyclerView.LayoutParams(
                        ViewGroup.LayoutParams.MATCH_PARENT, dp(ctx, CELL_SIZE_DP))
                    val pad = dp(ctx, CELL_PADDING_DP)
                    setPadding(pad, pad, pad, pad)
                    setBackgroundResource(R.drawable.rounded_popup_ripple)
                }
                object : RecyclerView.ViewHolder(iv) {}
            }
        }

        override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
            val row = rows[position]
            if (row.header != null) {
                (holder.itemView as TextView).text = row.header
                return
            }
            val name = row.icon ?: return
            val iv = holder.itemView as ImageView
            iv.contentDescription = name
            iv.setOnClickListener { onClick(name) }
            iv.tag = name
            val cached = bitmapCache.get(name)
            if (cached != null) {
                iv.setImageBitmap(cached)
                return
            }
            iv.setImageBitmap(null)
            Executors.THREAD_POOL_EXECUTOR.execute {
                val bmp = renderIcon(name)
                if (bmp != null) {
                    bitmapCache.put(name, bmp)
                    Executors.MAIN_EXECUTOR.execute {
                        if (iv.tag == name) iv.setImageBitmap(bmp)
                    }
                }
            }
        }

        /** Inflates and rasterizes a pack icon to cell size. */
        private fun renderIcon(name: String): Bitmap? {
            val d = packRes?.let { IconPackManager.loadDrawableFromPack(it, packPackage, name, iconDpi) } ?: return null
            val bmp = Bitmap.createBitmap(iconSizePx, iconSizePx, Bitmap.Config.ARGB_8888)
            d.setBounds(0, 0, iconSizePx, iconSizePx)
            d.draw(Canvas(bmp))
            return bmp
        }

        private fun dp(ctx: Context, dp: Int): Int = (dp * ctx.resources.displayMetrics.density).toInt()

        companion object {
            const val TYPE_HEADER = 0
            const val TYPE_ICON = 1
            const val CELL_SIZE_DP = 64
            const val CELL_PADDING_DP = 10
            const val CACHE_SIZE = 256
        }
    }

    companion object {
        const val TAG = "IconPickerBottomSheet"
        private const val SPAN_COUNT = 4
    }
}
