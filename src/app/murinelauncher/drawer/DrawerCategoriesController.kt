/*
 * Copyright 2026 Murine Categories contributors
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may obtain a copy at https://www.apache.org/licenses/LICENSE-2.0
 * Distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND.
 */
package app.murinelauncher.drawer

import android.os.Parcelable
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
        setTextColor(context.getColor(R.color.all_apps_label_text_color))
        gravity = Gravity.CENTER_VERTICAL or Gravity.START
        minHeight = dp(56)
        setPadding(0, dp(12), 0, dp(12))
        ViewCompat.setAccessibilityHeading(this, true)
    }
    val headingHeight: Int get() = maxOf(heading.minHeight, heading.measuredHeight)
    val tabs = DrawerCategoryBar(materialContext, repository::title, ::select,
        { CategoryDialogs.edit(context, repository, it) },
        { CategoryDialogs.manage(context, repository) })
    private val scrollStates = mutableMapOf<String, Parcelable?>()
    private var selected = prefs.get(LauncherPrefs.DRAWER_LAST_CATEGORY)
    private var visible = emptyList<CategoryState.Category>()
    private var lastProfile = -1
    private var enabled = false

    init {
        host.addView(tabs, RelativeLayout.LayoutParams(-1, dp(60)).apply {
            addRule(RelativeLayout.ALIGN_PARENT_BOTTOM)
            leftMargin = dp(4)
            rightMargin = dp(4)
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
            heading.visibility = View.GONE
            if (wasEnabled) host.applyCategoryFilter()
            host.updateDrawerControlsLayout()
            return
        }
        val apps = host.categoryApps
        val selection = CategorySelection.resolve(repository.state().categories, selected,
            apps.map(repository::categoryFor).toSet())
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
        if (id == selected) return
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

    private fun dp(value: Int): Int = (value * context.resources.displayMetrics.density).toInt()
}
