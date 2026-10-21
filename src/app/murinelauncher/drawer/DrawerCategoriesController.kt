/*
 * Copyright 2026 Murine Categories contributors
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may obtain a copy at https://www.apache.org/licenses/LICENSE-2.0
 * Distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND.
 */
package app.murinelauncher.drawer

import android.graphics.Rect
import android.graphics.Typeface
import android.os.Parcelable
import android.view.MotionEvent
import android.view.ViewConfiguration
import android.view.Gravity
import android.view.View
import android.widget.RelativeLayout
import androidx.core.view.ViewCompat
import com.android.launcher3.LauncherPrefs
import com.android.launcher3.R
import com.android.launcher3.allapps.ActivityAllAppsContainerView
import com.android.launcher3.model.data.AppInfo
import com.android.launcher3.model.data.ItemInfo
import com.google.android.material.textview.MaterialTextView
import com.google.android.material.R as MaterialR

/** Category UI filters existing profile lists; it never merges or replaces Android profiles. */
class DrawerCategoriesController(private val host: ActivityAllAppsContainerView<*>) {
    private val context = host.context
    private val prefs = LauncherPrefs.get(context)
    private val repository = CategoryRepository(context)
    private val materialContext = DrawerCategoryTheme.wrap(context)
    val heading = MaterialTextView(materialContext).apply {
        id = R.id.drawer_category_heading
        setTextAppearance(MaterialR.style.TextAppearance_Material3_TitleLarge)
        setTypeface(typeface, Typeface.BOLD)
        setTextColor(context.getColor(R.color.all_apps_label_text_color))
        gravity = Gravity.CENTER_VERTICAL or Gravity.START
        minHeight = dp(56)
        setPadding(0, dp(12), 0, dp(12))
        ViewCompat.setAccessibilityHeading(this, true)
    }
    val headingHeight: Int get() = maxOf(heading.minHeight, heading.measuredHeight)
    val tabs = DrawerCategoryBar(materialContext, repository::title, ::select,
        { CategoryDialogs.manage(context, repository) })
    val searchAction = DrawerSearchAction(materialContext, host::openCategorySearch).apply {
        visibility = View.GONE
    }
    private val motion = DrawerCategoryMotion(materialContext) {
        listOfNotNull(host.activeRecyclerView, heading)
    }
    private val gesture = CategorySwipeGesture(
        ViewConfiguration.get(context).scaledTouchSlop.toFloat(), dp(48).toFloat(),
        ViewConfiguration.getLongPressTimeout().toLong())
    private val swipeBounds = Rect()
    private val scrollStates = mutableMapOf<String, Parcelable?>()
    private var selected = prefs.get(LauncherPrefs.DRAWER_LAST_CATEGORY)
    private var visible = emptyList<CategoryState.Category>()
    val hasVisibleCategories: Boolean get() = visible.isNotEmpty()
    private var lastProfile = -1
    private var enabled = false

    init {
        host.addView(tabs, RelativeLayout.LayoutParams(-1, dp(60)).apply {
            addRule(RelativeLayout.ALIGN_PARENT_BOTTOM)
        })
        host.addView(searchAction, RelativeLayout.LayoutParams(
            dp(DrawerSearchAction.SIZE_DP), dp(DrawerSearchAction.SIZE_DP)).apply {
            addRule(RelativeLayout.ALIGN_PARENT_BOTTOM)
            addRule(RelativeLayout.ALIGN_PARENT_END)
        })
        host.addView(heading, RelativeLayout.LayoutParams(-1, -2))
        heading.addOnLayoutChangeListener { _, _, top, _, bottom, _, oldTop, _, oldBottom ->
            if (bottom - top != oldBottom - oldTop) host.post { host.updateDrawerControlsLayout() }
        }
    }

    fun refresh() {
        val previousSelection = selected
        selected = prefs.get(LauncherPrefs.DRAWER_LAST_CATEGORY)
        val wasEnabled = enabled
        enabled = prefs.get(LauncherPrefs.DRAWER_CATEGORIES)
        if (!enabled) {
            tabs.visibility = View.GONE
            searchAction.visibility = View.GONE
            heading.visibility = View.GONE
            if (wasEnabled) host.applyCategoryFilter()
            host.updateDrawerControlsLayout()
            return
        }
        val apps = host.categoryApps
        val selection = CategorySelection.resolve(repository.state().categories, selected,
            apps.map(repository::categoryFor).toSet(), host.appsStore.isLoaded)
        visible = selection.categories
        selected = selection.selected
        if (prefs.get(LauncherPrefs.DRAWER_LAST_CATEGORY) != selected) {
            prefs.put(LauncherPrefs.DRAWER_LAST_CATEGORY, selected)
        }
        scrollStates.keys.retainAll(visible.map { it.id }.toSet())
        if (lastProfile != host.categoryProfile) {
            lastProfile = host.categoryProfile
            scrollStates.clear()
        }
        heading.text = visible.firstOrNull { it.id == selected }?.let(repository::title).orEmpty()
        tabs.update(visible, selected)
        host.applyCategoryFilter()
        if (selected != previousSelection) host.activeRecyclerView?.scrollToTop()
        host.updateDrawerControlsLayout()
    }

    fun matches(item: ItemInfo): Boolean = !enabled || item !is AppInfo ||
        repository.categoryFor(item) == selected

    private fun select(id: String) {
        motion.finishAnimation()
        if (id == selected || visible.none { it.id == id }) return
        val step = if (visible.indexOfFirst { it.id == id } > visible.indexOfFirst { it.id == selected }) 1 else -1
        val direction = step * if (host.layoutDirection == View.LAYOUT_DIRECTION_RTL) -1 else 1
        motion.switch(direction) { applySelection(id) }
    }

    private fun applySelection(id: String) {
        if (!enabled || visible.none { it.id == id }) return
        val recycler = host.activeRecyclerView
        scrollStates[selected] = recycler?.layoutManager?.onSaveInstanceState()
        selected = id
        prefs.put(LauncherPrefs.DRAWER_LAST_CATEGORY, id)
        refresh()
        recycler?.layoutManager?.let { manager ->
            val saved = scrollStates[id]
            if (saved == null) recycler.scrollToTop() else manager.onRestoreInstanceState(saved)
        }
    }

    fun interceptSwipe(event: MotionEvent): Boolean {
        if (event.actionMasked == MotionEvent.ACTION_DOWN) {
            cancelMotion(finishSelection = true)
            if (!enabled || host.isSearching || host.isCategorySearchExpanded
                || tabs.visibility != View.VISIBLE) return false
            val recycler = host.activeRecyclerView ?: return false
            swipeBounds.set(0, 0, recycler.width, recycler.height)
            host.offsetDescendantRectToMyCoords(recycler, swipeBounds)
            // Keep gestures away from Android's back edges and outside the actual app grid.
            val edge = dp(24)
            if (event.x < edge || event.x > host.width - edge ||
                !swipeBounds.contains(event.x.toInt(), event.y.toInt())) return false
            gesture.begin(event.x, event.y, event.eventTime)
        }
        if (event.pointerCount > 1) {
            gesture.cancel()
            motion.settle()
            return false
        }
        if (event.actionMasked == MotionEvent.ACTION_MOVE &&
            gesture.move(event.x, event.y, event.eventTime)) {
            host.parent?.requestDisallowInterceptTouchEvent(true)
            return true
        }
        if (event.actionMasked == MotionEvent.ACTION_UP || event.actionMasked == MotionEvent.ACTION_CANCEL) {
            gesture.cancel()
        }
        return false
    }

    fun touchSwipe(event: MotionEvent): Boolean {
        if (!gesture.active) return false
        when (event.actionMasked) {
            MotionEvent.ACTION_MOVE -> {
                if (event.pointerCount > 1) {
                    gesture.finish(true, false)
                    motion.settle()
                } else {
                    gesture.move(event.x, event.y, event.eventTime)
                    motion.drag(gesture.deltaX)
                }
            }
            MotionEvent.ACTION_UP, MotionEvent.ACTION_CANCEL -> {
                if (event.actionMasked == MotionEvent.ACTION_UP) {
                    gesture.move(event.x, event.y, event.eventTime)
                }
                val step = gesture.finish(event.actionMasked == MotionEvent.ACTION_CANCEL,
                    host.layoutDirection == View.LAYOUT_DIRECTION_RTL)
                val target = visible.getOrNull(visible.indexOfFirst { it.id == selected } + step)
                if (step != 0 && target != null) select(target.id) else motion.settle()
                host.parent?.requestDisallowInterceptTouchEvent(false)
            }
        }
        return true
    }

    @JvmOverloads
    fun cancelMotion(finishSelection: Boolean = false) {
        gesture.cancel()
        if (finishSelection) motion.finish() else motion.cancel()
    }

    private fun dp(value: Int): Int = (value * context.resources.displayMetrics.density).toInt()
}
