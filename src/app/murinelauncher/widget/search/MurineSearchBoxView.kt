package app.murinelauncher.widget.search

import android.app.SearchManager
import android.content.ActivityNotFoundException
import android.content.Context
import android.content.Intent
import android.graphics.drawable.GradientDrawable
import android.util.AttributeSet
import android.util.Log
import android.view.KeyEvent
import android.view.LayoutInflater
import android.view.MotionEvent
import android.view.View
import android.view.ViewGroup
import android.view.inputmethod.EditorInfo
import android.widget.LinearLayout
import android.widget.TextView
import androidx.core.graphics.ColorUtils
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import app.murinelauncher.graphics.WorkspaceBlurUtils
import app.murinelauncher.graphics.WorkspaceBlurUtils.Companion.isBlurDrawable
import app.murinelauncher.widget.search.MurineSearchBarView.Companion.TAG
import com.android.launcher3.AbstractFloatingView
import com.android.launcher3.ExtendedEditText
import com.android.launcher3.Launcher
import com.android.launcher3.LauncherPrefs
import com.android.launcher3.R
import com.android.launcher3.Utilities
import com.android.launcher3.views.ActivityContext
import org.json.JSONArray

class MurineSearchBoxView(context: Context, attrs: AttributeSet?) :
    AbstractFloatingView(context, attrs) {

    private lateinit var searchInput: ExtendedEditText
    private lateinit var historyList: RecyclerView
    private lateinit var container: LinearLayout
    private val launcher: Launcher = ActivityContext.lookupContext<Launcher>(context)
    private val launcherPrefs = LauncherPrefs.get(context)
    private var isBlurEnabled = false
    private var maxAlpha = 0.9f
    private var maxContainerHeight = 0

    override fun onFinishInflate() {
        super.onFinishInflate()
        container = findViewById(R.id.search_box_container)
        searchInput = findViewById(R.id.search_input)
        historyList = findViewById(R.id.search_history_list)

        searchInput.setOnEditorActionListener { _, actionId, event ->
            if (actionId == EditorInfo.IME_ACTION_SEARCH ||
                (event != null && event.keyCode == KeyEvent.KEYCODE_ENTER)
            ) {
                performSearch(searchInput.text.toString())
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

        setupHistory()
    }

    private fun setupHistory() {
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
        if (lp.height == ViewGroup.LayoutParams.WRAP_CONTENT) return
        // Temporarily set wrap_content to measure height
        lp.height = ViewGroup.LayoutParams.WRAP_CONTENT
        container.requestLayout()
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
        searchInput.hideKeyboard()
        if (animate) {
            var animator = container.animate().translationY(-container.height.toFloat())
            if (container.background.isBlurDrawable) container.alpha = 1f
            else animator.alpha(0f)
            animator.setDuration(200)
                .withEndAction { launcher.dragLayer.removeView(this) }
                .start()
            animate().alpha(0f).setDuration(200).start()
        } else {
            launcher.dragLayer.removeView(this)
        }
    }

    override fun isOfType(type: Int): Boolean = type and TYPE_OPTIONS_POPUP != 0

    override fun onControllerInterceptTouchEvent(ev: MotionEvent): Boolean {
        if (ev.action == MotionEvent.ACTION_DOWN) {
            if (!launcher.dragLayer.isEventOverView(container, ev)) {
                close(true)
                return true
            }
        }
        return false
    }

    override fun onAttachedToWindow() {
        super.onAttachedToWindow()

        container.alpha = 0f
        isBlurEnabled = LauncherPrefs.QSB_BUBBLE_BLUR.get(launcher)
        maxAlpha = LauncherPrefs.QSB_BUBBLE_ALPHA.get(launcher) / 100f
        container.post {
            val screenHeight = resources.displayMetrics.heightPixels
            val maxAllowedHeight = (screenHeight) / 2

            maxContainerHeight = maxAllowedHeight
            if (container.height > maxAllowedHeight) {
                container.layoutParams.height = maxAllowedHeight
                container.requestLayout()
                container.post { startEnterAnimation() }
            } else {
                startEnterAnimation()
            }
        }

        searchInput.postDelayed({
            searchInput.showKeyboard()
        }, 100)
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

    private class HistoryAdapter(
        private val items: MutableList<String>,
        private val onClick: (String) -> Unit,
        private val onDelete: (String, Int) -> Unit
    ) : RecyclerView.Adapter<HistoryAdapter.ViewHolder>() {

        class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
            val textView: TextView = view.findViewById(R.id.history_text)
            val deleteButton: View = view.findViewById(R.id.history_delete)
        }

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
            val view = LayoutInflater.from(parent.context)
                .inflate(R.layout.murine_search_history_item, parent, false)
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

        fun show(launcher: Launcher) {
            val view = launcher.layoutInflater.inflate(
                R.layout.murine_search_box,
                launcher.dragLayer,
                false
            ) as MurineSearchBoxView
            launcher.dragLayer.addView(view)
            view.mIsOpen = true
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
            }
        }

        private fun performSearchImpl(context: Context, historyPrefs: LauncherPrefs, query: String) {
            if (query.isBlank()) return
            saveToHistory(historyPrefs, query)

            try {
                val intent = SearchProvider.current.buildSearchIntent(query).apply {
                    addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
                }
                context.startActivity(intent)
            } catch (e: ActivityNotFoundException) {
                Log.w(TAG, "Could not open search provider", e)
                performSystemSearch(context, query)
            }
        }

        @JvmStatic
        public fun performDetachedWebSearch(context: Context, query: String) {
            performSearchImpl(context, LauncherPrefs.get(context), query)
        }
    }
}
