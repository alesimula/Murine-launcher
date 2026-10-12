package app.murinelauncher.widget.search

import android.app.SearchManager
import android.content.ActivityNotFoundException
import android.content.Context
import android.content.Intent
import android.graphics.Point
import android.graphics.Rect
import android.graphics.drawable.Drawable
import android.graphics.drawable.GradientDrawable
import android.text.Editable
import android.text.TextWatcher
import android.util.AttributeSet
import android.util.Log
import android.view.KeyEvent
import android.view.LayoutInflater
import android.view.MotionEvent
import android.view.View
import android.view.View.MeasureSpec
import android.view.ViewGroup
import android.view.inputmethod.EditorInfo
import android.widget.FrameLayout
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.content.res.AppCompatResources
import androidx.core.graphics.ColorUtils
import androidx.core.view.ViewCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import app.murinelauncher.graphics.WorkspaceBlurUtils
import app.murinelauncher.graphics.WorkspaceBlurUtils.Companion.isBlurDrawable
import app.murinelauncher.voice.VoiceRecognizer
import app.murinelauncher.voice.VoiceSearchPresenter
import app.murinelauncher.voice.VoiceSearchPresenter.MicState
import app.murinelauncher.widget.search.MurineSearchBarView.Companion.TAG
import app.murinelauncher.widget.search.voice.VoiceSearch
import com.android.launcher3.AbstractFloatingView
import com.android.launcher3.BubbleTextView
import com.android.launcher3.DragSource
import com.android.launcher3.DropTarget
import com.android.launcher3.ExtendedEditText
import com.android.launcher3.Flags
import com.android.launcher3.Launcher
import com.android.launcher3.LauncherPrefs
import com.android.launcher3.R
import com.android.launcher3.Utilities
import com.android.launcher3.allapps.search.DefaultAppSearchAlgorithm
import com.android.launcher3.dragndrop.DragController
import com.android.launcher3.dragndrop.DragOptions
import com.android.launcher3.dragndrop.DragView
import com.android.launcher3.graphics.DragPreviewProvider
import com.android.launcher3.model.data.AppInfo
import com.android.launcher3.model.data.ItemInfoWithIcon.FLAG_NOT_PINNABLE
import com.android.launcher3.popup.PopupContainerWithArrow
import com.android.launcher3.touch.ItemLongClickListener
import com.android.launcher3.views.ActivityContext
import java.util.stream.Collectors
import org.json.JSONArray

class MurineSearchBoxView(context: Context, attrs: AttributeSet?) :
    AbstractFloatingView(context, attrs), DragSource, DragController.DragListener,
    VoiceSearchPresenter.SearchBox {

    private lateinit var searchInput: ExtendedEditText
    private lateinit var historyList: RecyclerView
    private lateinit var container: LinearLayout
    private val launcher: Launcher = ActivityContext.lookupContext<Launcher>(context)
    private val launcherPrefs = LauncherPrefs.get(context)
    private var isBlurEnabled = false
    private var maxAlpha = 0.9f
    private var maxContainerHeight = 0
    private var topResult: AppInfo? = null
    private var deferRemoval = false
    private var dragIcon: BubbleTextView? = null
    private var dragView: DragView<*>? = null
    private val lastTouch = Point()

    private lateinit var voiceContainer: View
    private lateinit var voiceButton: ImageButton
    private lateinit var voiceProgress: View
    private lateinit var voiceLevel: View
    private var defaultHint: CharSequence? = null
    private var voice: VoiceSearchPresenter? = null
    private var startWithVoice = false
    private var initialQuery: String? = null
    private var fillingInTranscript = false

    override fun onFinishInflate() {
        super.onFinishInflate()
        container = findViewById(R.id.search_box_container)
        searchInput = findViewById(R.id.search_input)
        historyList = findViewById(R.id.search_history_list)
        defaultHint = searchInput.hint
        setupVoice()

        searchInput.setOnEditorActionListener { _, actionId, event ->
            if (actionId == EditorInfo.IME_ACTION_SEARCH ||
                (event != null && event.keyCode == KeyEvent.KEYCODE_ENTER)
            ) {
                onSubmit()
                true
            } else {
                false
            }
        }
        searchInput.setOnBackKeyListener {
            close(true)
            true
        }

        historyList.addOnScrollListener(object : RecyclerView.OnScrollListener() {
            override fun onScrollStateChanged(recyclerView: RecyclerView, newState: Int) {
                if (newState == RecyclerView.SCROLL_STATE_DRAGGING) {
                    searchInput.hideKeyboard()
                }
            }
        })

        searchInput.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(s: Editable?) {
                if (!fillingInTranscript && voice?.state == MicState.LISTENING) voice?.cancel()
                onQueryChanged(s?.toString().orEmpty())
            }
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}
            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {}
        })

        setupHistory()
    }

    private fun setupVoice() {
        voiceContainer = findViewById(R.id.search_voice_container)
        voiceButton = findViewById(R.id.search_voice_button)
        voiceProgress = findViewById(R.id.search_voice_progress)
        voiceLevel = findViewById(R.id.search_voice_level)
        if (!VoiceSearch.isOfflineEnabled(context)) return
        voiceContainer.visibility = View.VISIBLE
        searchInput.setPaddingRelative(searchInput.paddingStart, searchInput.paddingTop,
            resources.getDimensionPixelSize(R.dimen.murine_search_input_mic_clearance), searchInput.paddingBottom)
        voiceButton.setOnClickListener {
            val presenter = voicePresenter()
            if (presenter.state == MicState.IDLE) VoiceSearch.onMicTapped(launcher)
            else presenter.onMicTapped()
        }
    }

    private fun voicePresenter(): VoiceSearchPresenter = voice
        ?: VoiceSearchPresenter(this) { listener -> VoiceSearch.newRecognizer(context, listener) }
            .also { voice = it }

    override fun setMicState(state: MicState) {
        voiceLevel.animate().cancel()
        when (state) {
            MicState.IDLE -> {
                voiceProgress.visibility = View.GONE
                voiceButton.imageAlpha = 255
                voiceLevel.alpha = 0f
                searchInput.hint = defaultHint
                voiceButton.contentDescription = context.getString(R.string.murine_voice_search_desc)
            }
            MicState.LISTENING -> {
                searchInput.hideKeyboard()
                voiceProgress.visibility = View.GONE
                voiceButton.imageAlpha = 255
                voiceLevel.alpha = LEVEL_MIN_ALPHA
                searchInput.hint = context.getString(R.string.voice_search_listening)
                voiceButton.contentDescription = context.getString(R.string.voice_search_stop_desc)
            }
            MicState.PROCESSING -> {
                voiceProgress.visibility = View.VISIBLE
                voiceButton.imageAlpha = 0
                voiceLevel.alpha = 0f
                searchInput.hint = context.getString(R.string.voice_search_transcribing)
                voiceButton.contentDescription = context.getString(R.string.voice_search_cancel_desc)
            }
        }
        ViewCompat.setStateDescription(voiceButton, if (state == MicState.IDLE) null else searchInput.hint)
    }

    override fun setLevel(level: Float) {
        voiceLevel.animate()
            .alpha(LEVEL_MIN_ALPHA + (LEVEL_MAX_ALPHA - LEVEL_MIN_ALPHA) * level)
            .scaleX(0.75f + 0.45f * level)
            .scaleY(0.75f + 0.45f * level)
            .setDuration(80)
            .start()
    }

    override fun setQuery(text: String) {
        fillingInTranscript = true
        searchInput.setText(text)
        searchInput.setSelection(searchInput.length())
        fillingInTranscript = false
    }

    override fun showFailure(failure: VoiceRecognizer.Failure) {
        Toast.makeText(context, VoiceSearch.failureMessage(failure), Toast.LENGTH_SHORT).show()
    }

    /**
     * Enter / the IME search key. With a web provider this searches the web as before;
     * in [SearchProvider.APPS_ONLY] it opens the first app result, like the drawer search does.
     */
    override fun submit() = onSubmit()

    private fun onSubmit() {
        val query = searchInput.text.toString()
        if (SearchProvider.current.searchesWeb) performSearch(query)
        else topResult?.let { launchApp(it, searchInput) }
    }

    private fun onQueryChanged(query: String) {
        if (query.isBlank()) {
            topResult = null
            setupHistory()
        } else {
            val max = SearchBarConfig.MAX_SEARCH_RESULTS
            val unbounded = max < 0
            // The web row, when shown, is always first and counts towards the limit
            val webRow = SearchProvider.current.searchesWeb && (unbounded || max > 0)
            val appSlots = if (unbounded) Long.MAX_VALUE else (max - if (webRow) 1 else 0).toLong()
            val apps = launcher.appsView?.appsStore?.apps?.let { store ->
                DefaultAppSearchAlgorithm.getTitleMatchApps(context, store.asList(), query)
                    .limit(appSlots)
                    .collect(Collectors.toList())
            }.orEmpty()
            topResult = apps.firstOrNull()

            if (!webRow && apps.isEmpty()) {
                // APPS_ONLY with nothing matching
                historyList.visibility = View.GONE
            } else {
                historyList.visibility = View.VISIBLE
                if (historyList.layoutManager == null) {
                    historyList.layoutManager = LinearLayoutManager(context)
                }
                historyList.adapter = ResultsAdapter(
                    webQuery = if (webRow) query else null,
                    providerIcon = AppCompatResources.getDrawable(context, SearchProvider.current.iconRes),
                    apps = apps,
                    onWeb = { performSearch(query) },
                    onApp = { app, view -> launchApp(app, view) },
                    onAppLongClick = { app, row -> startAppDrag(app, row) }
                )
            }
        }
        resizeContainerIfNeeded()
    }

    /**
     * Long-pressing a result shows the menu and drags the app to the home screen, like for the app drawer;
     * @return false when dragging, so the touch keeps flowing to the drag controller.
     */
    private fun startAppDrag(app: AppInfo, row: View): Boolean {
        if (!ItemLongClickListener.canStartDrag(launcher)) return false
        val locked = !launcher.isDraggingEnabled

        val dp = launcher.deviceProfile
        val dragLayer = launcher.dragLayer
        // Inflate the drawer's own icon view
        val icon = launcher.layoutInflater
            .inflate(R.layout.all_apps_icon, dragLayer, false) as BubbleTextView
        icon.applyFromApplicationInfo(app)
        icon.alpha = 0f
        dragLayer.addView(icon)

        // Displayed a teeny tiny little up-left of the finger so it stays visible
        val shift = (dp.allAppsIconSizePx * DRAG_ICON_SHIFT_RATIO).toInt()
        val w = dp.allAppsCellWidthPx
        val h = dp.allAppsCellHeightPx
        val left = lastTouch.x - shift - w / 2
        val top = lastTouch.y - shift - icon.paddingTop - dp.allAppsIconSizePx / 2
        icon.measure(
            MeasureSpec.makeMeasureSpec(w, MeasureSpec.EXACTLY),
            MeasureSpec.makeMeasureSpec(h, MeasureSpec.EXACTLY)
        )
        icon.layout(left, top, left + w, top + h)

        searchInput.hideKeyboard()
        if (locked) {
            // Home screen locked: menu only, the hidden icon is just its anchor and goes away with it
            val popup = PopupContainerWithArrow.showForIcon(icon)
            if (popup == null) {
                dragLayer.removeView(icon)
                return false
            }
            popup.addOnCloseCallback { dragLayer.removeView(icon) }
            row.parent?.requestDisallowInterceptTouchEvent(true)
        } else {
            dragIcon = icon
            // Hidden until dragging starts: clip, as the cancel animation resets alpha and visibility
            dragView = launcher.workspace.beginDragShared(
                icon, icon, this, app, DragPreviewProvider(icon), DragOptions()
            ).also { it.clipBounds = Rect() }
        }
        // Zero its bounds, so a tap / scroll near it dismisses the popup instead of hitting the row behind
        icon.layoutParams = icon.layoutParams.also { it.width = 0; it.height = 0 }
        icon.layout(0, 0, 0, 0)
        return locked
    }

    override fun onDropCompleted(target: View?, d: DropTarget.DragObject?, success: Boolean) = Unit

    override fun onDragStart(dragObject: DropTarget.DragObject?, options: DragOptions?) {
        dragView?.clipBounds = null
        deferRemoval = true // Removing mid-drag interferes with touch handling, defer removal
        close(true)
    }

    override fun onDragEnd() {
        dragIcon?.let { launcher.dragLayer.removeView(it) }
        dragIcon = null
        dragView = null
        if (deferRemoval) {
            deferRemoval = false
            launcher.dragLayer.removeView(this)
        }
    }

    private fun launchApp(app: AppInfo, view: View) {
        searchInput.hideKeyboard()
        launcher.startActivitySafely(view, app.getIntent(), app)
        close(true)
    }

    private fun setupHistory() {
        if (!SearchProvider.current.searchesWeb) {
            historyList.visibility = View.GONE
            return
        }
        val history = trimHistory(launcherPrefs)
        if (history.isNotEmpty()) {
            historyList.visibility = View.VISIBLE
            historyList.layoutManager = LinearLayoutManager(context)
            historyList.adapter = HistoryAdapter(history, onClick = { query ->
                searchInput.setText(query)
                performSearch(query)
            }, onDelete = { _, _ ->
                saveHistory(launcherPrefs, history)
                if (history.isEmpty()) historyList.visibility = View.GONE
                resizeContainerIfNeeded()
            })
        } else {
            historyList.visibility = View.GONE
        }
    }

    private fun resizeContainerIfNeeded() {
        if (maxContainerHeight <= 0) return
        val lp = container.layoutParams
        if (lp.height != ViewGroup.LayoutParams.WRAP_CONTENT) {
            lp.height = ViewGroup.LayoutParams.WRAP_CONTENT
            container.requestLayout()
        }
        container.post {
            // Re-cap if content still exceeds the limit
            if (container.height > maxContainerHeight) {
                container.layoutParams.height = maxContainerHeight
                container.requestLayout()
            }
        }
    }

    private fun performSearch(query: String) {
        performSearchImpl(context, launcherPrefs, query)
        close(true)
    }

    override fun handleClose(animate: Boolean) {
        voice?.cancel()
        searchInput.hideKeyboard()
        if (animate) {
            var animator = container.animate().translationY(-container.height.toFloat())
            if (container.background.isBlurDrawable) container.alpha = 1f
            else animator.alpha(0f)
            animator.setDuration(200)
                .withEndAction { removeSelf() }
                .start()
            animate().alpha(0f).setDuration(200).start()
        } else {
            removeSelf()
        }
    }

    private fun removeSelf() {
        // Stays attached until the drag ends: hide it to hide the blur backdrop.
        if (deferRemoval) visibility = View.GONE else launcher.dragLayer.removeView(this)
    }

    override fun isOfType(type: Int): Boolean = type and TYPE_OPTIONS_POPUP != 0

    override fun onControllerInterceptTouchEvent(ev: MotionEvent): Boolean {
        if (ev.action == MotionEvent.ACTION_DOWN) {
            lastTouch.set(ev.x.toInt(), ev.y.toInt())
            if (!launcher.dragLayer.isEventOverView(container, ev)) {
                close(true)
                return true
            }
        }
        return false
    }

    override fun onDetachedFromWindow() {
        super.onDetachedFromWindow()
        voice?.cancel()
        launcher.dragController.removeDragListener(this)
    }

    override fun onAttachedToWindow() {
        super.onAttachedToWindow()
        launcher.dragController.addDragListener(this)

        container.alpha = 0f
        isBlurEnabled = LauncherPrefs.QSB_BUBBLE_BLUR.get(launcher)
        maxAlpha = LauncherPrefs.QSB_BUBBLE_ALPHA.get(launcher) / 100f
        maxContainerHeight = resources.displayMetrics.heightPixels / 2
        container.post {
            if (container.height > maxContainerHeight) {
                container.layoutParams.height = maxContainerHeight
                container.requestLayout()
                container.post { startEnterAnimation() }
            } else {
                startEnterAnimation()
            }
        }

        val query = initialQuery
        initialQuery = null
        when {
            query != null -> setQuery(query)
            startWithVoice -> post { if (isOpen) voicePresenter().start() }
            else -> searchInput.postDelayed({
                searchInput.showKeyboard()
            }, 100)
        }
    }

    private fun startEnterAnimation() {
        val background = container.background as GradientDrawable
        val dark = Utilities.isDarkTheme(getContext())
        val blurColor = background.color?.defaultColor?.let { ColorUtils.setAlphaComponent(it, if (dark) 200 else 165) }
        if (isBlurEnabled) WorkspaceBlurUtils.SEARCH.withBlurDrawable(launcher) {drawable, isNew, isChanged ->
            drawable.setCornerRadius(background.cornerRadius)
            if (blurColor != null) drawable.setColor(blurColor)
            drawable.setBlurRadius(WorkspaceBlurUtils.SEARCH.radius)
            container.background = drawable
        }

        container.translationY = -container.height.toFloat()
        var animator = container.animate()
        if (container.background.isBlurDrawable) container.alpha = 1f
        else animator.alpha(maxAlpha)
        animator.translationY(0f).setDuration(300).start()
    }

    private class ResultsAdapter(
        private val webQuery: String?,
        private val providerIcon: Drawable?,
        private val apps: List<AppInfo>,
        private val onWeb: () -> Unit,
        private val onApp: (AppInfo, View) -> Unit,
        private val onAppLongClick: (AppInfo, View) -> Boolean
    ) : RecyclerView.Adapter<ResultsAdapter.ViewHolder>() {

        class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
            val icon: ImageView = view.findViewById(R.id.search_row_icon)
            val textView: TextView = view.findViewById(R.id.search_row_text)
            val defaultTint = icon.imageTintList

            init {
                view.findViewById<View>(R.id.search_row_delete).visibility = View.GONE
                // No padding unlike the history glyph's inset
                icon.setPadding(0, 0, 0, 0)
            }
        }

        private val webRows = if (webQuery == null) 0 else 1

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
            val view = LayoutInflater.from(parent.context)
                .inflate(R.layout.murine_search_row, parent, false)
            return ViewHolder(view)
        }

        override fun onBindViewHolder(holder: ViewHolder, position: Int) {
            if (position < webRows) {
                holder.icon.imageTintList = holder.defaultTint
                holder.icon.setImageDrawable(providerIcon)
                holder.textView.text = webQuery
                holder.itemView.setOnClickListener { onWeb() }
                holder.itemView.setOnLongClickListener(null)   // nothing to drag on the web row
                return
            }
            val app = apps[position - webRows]
            holder.icon.imageTintList = null
            holder.icon.setImageDrawable(app.bitmap.newIcon(holder.itemView.context))
            holder.textView.text = app.title
            holder.itemView.setOnClickListener { onApp(app, holder.itemView) }
            holder.itemView.setOnLongClickListener { onAppLongClick(app, it) }
        }

        override fun getItemCount() = webRows + apps.size
    }

    private class HistoryAdapter(
        private val items: MutableList<String>,
        private val onClick: (String) -> Unit,
        private val onDelete: (String, Int) -> Unit
    ) : RecyclerView.Adapter<HistoryAdapter.ViewHolder>() {

        class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
            val textView: TextView = view.findViewById(R.id.search_row_text)
            val deleteButton: View = view.findViewById(R.id.search_row_delete)
        }

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
            val view = LayoutInflater.from(parent.context)
                .inflate(R.layout.murine_search_row, parent, false)
            return ViewHolder(view)
        }

        override fun onBindViewHolder(holder: ViewHolder, position: Int) {
            val item = items[position]
            holder.textView.text = item
            holder.itemView.setOnClickListener { onClick(item) }
            holder.deleteButton.setOnClickListener {
                val pos = holder.bindingAdapterPosition
                if (pos != RecyclerView.NO_POSITION) {
                    val removed = items[pos]
                    items.removeAt(pos)
                    notifyItemRemoved(pos)
                    onDelete(removed, pos)
                }
            }
        }

        override fun getItemCount() = items.size
    }

    companion object {
        /** How far up-left of the finger the dragged icon spawns, as a fraction of icon size. */
        private const val DRAG_ICON_SHIFT_RATIO = 0.42f
        private const val LEVEL_MIN_ALPHA = 0.2f
        private const val LEVEL_MAX_ALPHA = 0.6f

        fun show(launcher: Launcher) {
            show(launcher) {}
        }

        private fun show(launcher: Launcher, setup: (MurineSearchBoxView) -> Unit) {
            val view = launcher.layoutInflater.inflate(
                R.layout.murine_search_box,
                launcher.dragLayer,
                false
            ) as MurineSearchBoxView
            setup(view)
            launcher.dragLayer.addView(view)
            view.mIsOpen = true
        }

        private fun openBox(launcher: Launcher): MurineSearchBoxView? {
            val dragLayer = launcher.dragLayer ?: return null
            return (0 until dragLayer.childCount).map(dragLayer::getChildAt)
                .filterIsInstance<MurineSearchBoxView>()
                .firstOrNull { it.isOpen }
        }

        @JvmStatic
        fun showForVoice(launcher: Launcher) {
            val open = openBox(launcher)
            if (open != null) {
                if (open.voiceContainer.visibility == View.VISIBLE) open.voicePresenter().start()
                return
            }
            show(launcher) { it.startWithVoice = true }
        }

        @JvmStatic
        fun showWithQuery(launcher: Launcher, query: String) {
            val open = openBox(launcher)
            if (open != null) open.setQuery(query) else show(launcher) { it.initialQuery = query }
        }

        @JvmStatic
        fun cancelVoiceInput(launcher: Launcher) {
            openBox(launcher)?.voice?.cancel()
        }

        private fun getLauncherPrefs(context: Context) = LauncherPrefs.get(context)

        private fun getHistory(prefs: LauncherPrefs): MutableList<String> {
            val jsonArray = JSONArray(prefs.get(LauncherPrefs.QSB_SEARCH_HISTORY))
            return MutableList(jsonArray.length()) { jsonArray.getString(it) }
        }

        private fun saveHistory(prefs: LauncherPrefs, history: List<String>) {
            prefs.put(LauncherPrefs.QSB_SEARCH_HISTORY.to(JSONArray(history).toString()))
        }

        private fun trimHistory(prefs: LauncherPrefs): MutableList<String> {
            val maxSize = prefs.get(LauncherPrefs.QSB_HISTORY_SIZE)
            val history = getHistory(prefs)
            if (history.size > maxSize) {
                val trimmed = history.take(maxSize).toMutableList()
                saveHistory(prefs, trimmed)
                return trimmed
            }
            return history
        }

        @JvmStatic
        fun clearHistory(context: Context) {
            val prefs = LauncherPrefs.get(context)
            prefs.put(LauncherPrefs.QSB_SEARCH_HISTORY.to("[]"))
        }

        private fun saveToHistory(prefs: LauncherPrefs, query: String) {
            val maxSize = prefs.get(LauncherPrefs.QSB_HISTORY_SIZE)
            val currentHistory = getHistory(prefs)
            currentHistory.remove(query)
            currentHistory.add(0, query)
            val jsonArray = JSONArray(currentHistory.take(maxSize))
            prefs.put(LauncherPrefs.QSB_SEARCH_HISTORY.to(jsonArray.toString()))
        }

        private fun performSystemSearch(context: Context, query: String) {
            try {
                val intent = Intent(Intent.ACTION_WEB_SEARCH).apply {
                    addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
                    putExtra(SearchManager.QUERY, query)
                }
                context.startActivity(intent)
            } catch (e: ActivityNotFoundException) {
                Log.w(TAG, "No web search activity found", e)
                Toast.makeText(context, R.string.activity_not_found, Toast.LENGTH_SHORT).show()
            } catch (e: SecurityException) {
                Log.w(TAG, "Web search activity not launchable", e)
                Toast.makeText(context, R.string.activity_not_found, Toast.LENGTH_SHORT).show()
            }
        }

        private fun performSearchImpl(context: Context, historyPrefs: LauncherPrefs, query: String) {
            if (query.isBlank()) return
            saveToHistory(historyPrefs, query)

            try {
                val intent = SearchProvider.current.buildSearchIntent(context, query).apply {
                    addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
                }
                context.startActivity(intent)
            } catch (e: ActivityNotFoundException) {
                Log.w(TAG, "Could not open search provider", e)
                performSystemSearch(context, query)
            } catch (e: SecurityException) {
                // In case of a browser without expoerted activity, fall back to the system web-search action instead of crashing
                Log.w(TAG, "Search provider activity not launchable", e)
                performSystemSearch(context, query)
            }
        }

    }
}
