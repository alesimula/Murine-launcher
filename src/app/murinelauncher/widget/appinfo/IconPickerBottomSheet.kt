package app.murinelauncher.widget.appinfo

import android.content.Context
import android.graphics.drawable.Drawable
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
import app.murinelauncher.widget.radio.RadioGroupBottomSheet
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
            val allIcons = IconPackManager.listPackDrawables(appCtx, pack)
                .filterNot(appIcons.toSet()::contains)
            Executors.MAIN_EXECUTOR.execute {
                if (isAdded) adapter.submit(appIcons, allIcons)
            }
        }
    }

    /**
     * Grid adapter: optional "From this app" section, separator header, then all pack icons.
     * Drawables are loaded lazily off the main thread and kept only in a sheet-local
     * [LruCache] (volatile; never touches [IconPackManager]'s caches).
     */
    private class IconGridAdapter(context: Context, private val packPackage: String, private val onClick: (String) -> Unit) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

        /** A row is either a section header ([header] set) or an icon cell ([icon] set). */
        private class Row(val header: CharSequence? = null, val icon: String? = null)

        private val appCtx = context.applicationContext
        private val iconDpi = context.resources.configuration.densityDpi
        /** Resolved once per sheet; each per-icon load would otherwise cost a PM IPC. */
        private val packRes by lazy { IconPackManager.getPackResources(appCtx, packPackage) }
        private val drawableCache = LruCache<String, Drawable>(CACHE_SIZE)
        private var appIcons: List<String> = emptyList()
        private var allIcons: List<String> = emptyList()
        private var query = ""
        private var rows: List<Row> = emptyList()

        fun isHeader(position: Int): Boolean = rows[position].header != null

        fun submit(app: List<String>, all: List<String>) {
            appIcons = app
            allIcons = all
            rebuild()
        }

        fun filter(q: String) {
            query = q
            rebuild()
        }

        private fun rebuild() {
            val app = appIcons.filter { it.contains(query, ignoreCase = true) }
            val all = allIcons.filter { it.contains(query, ignoreCase = true) }
            rows = buildList {
                if (app.isNotEmpty()) {
                    add(Row(header = appCtx.getString(R.string.icon_picker_from_app)))
                    app.forEach { add(Row(icon = it)) }
                    if (all.isNotEmpty()) add(Row(header = appCtx.getString(R.string.icon_picker_all_icons)))
                }
                all.forEach { add(Row(icon = it)) }
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
                    setPadding(dp(ctx, 10), dp(ctx, 10), dp(ctx, 10), dp(ctx, 10))
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
            val cached = drawableCache.get(name)
            if (cached != null) {
                iv.setImageDrawable(cached)
                return
            }
            iv.setImageDrawable(null)
            Executors.MODEL_EXECUTOR.execute {
                val d = packRes?.let { IconPackManager.loadDrawableFromPack(it, packPackage, name, iconDpi) }
                if (d != null) {
                    drawableCache.put(name, d)
                    Executors.MAIN_EXECUTOR.execute {
                        if (iv.tag == name) iv.setImageDrawable(d)
                    }
                }
            }
        }

        private fun dp(ctx: Context, dp: Int): Int = (dp * ctx.resources.displayMetrics.density).toInt()

        companion object {
            const val TYPE_HEADER = 0
            const val TYPE_ICON = 1
            const val CELL_SIZE_DP = 64
            const val CACHE_SIZE = 256
        }
    }

    companion object {
        const val TAG = "IconPickerBottomSheet"
        private const val SPAN_COUNT = 4
    }
}
