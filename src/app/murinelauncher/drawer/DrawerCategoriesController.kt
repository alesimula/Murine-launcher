/*
 * Copyright 2026 Murine Categories contributors
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may obtain a copy at https://www.apache.org/licenses/LICENSE-2.0
 * Distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND.
 */
package app.murinelauncher.drawer

import android.graphics.drawable.GradientDrawable
import android.os.Parcelable
import android.view.Gravity
import android.view.View
import android.widget.HorizontalScrollView
import android.widget.ImageButton
import android.widget.LinearLayout
import android.widget.RelativeLayout
import androidx.core.graphics.ColorUtils
import androidx.core.view.doOnLayout
import com.android.launcher3.LauncherPrefs
import com.android.launcher3.R
import com.android.launcher3.allapps.ActivityAllAppsContainerView
import com.android.launcher3.model.data.AppInfo
import com.android.launcher3.model.data.ItemInfo

/** Category UI filters existing profile lists; it never merges or replaces Android profiles. */
class DrawerCategoriesController(private val host: ActivityAllAppsContainerView<*>) {
    private val context = host.context
    private val prefs = LauncherPrefs.get(context)
    private val repository = CategoryRepository(context)
    private val row = LinearLayout(context).apply { gravity = Gravity.CENTER }
    val tabs = HorizontalScrollView(context).apply {
        id = R.id.drawer_category_tabs
        isHorizontalScrollBarEnabled = false
        isFillViewport = true
        setPadding(dp(8), 0, dp(8), 0)
        clipToPadding = false
        addView(row)
        elevation = dp(2).toFloat()
    }
    private val scrollStates = mutableMapOf<String, Parcelable?>()
    private var selected = prefs.get(LauncherPrefs.DRAWER_LAST_CATEGORY)
    private var visible = emptyList<CategoryState.Category>()
    private var lastProfile = -1
    private var enabled = false

    init {
        host.addView(tabs, RelativeLayout.LayoutParams(-1, dp(52)).apply {
            addRule(RelativeLayout.ALIGN_PARENT_BOTTOM)
        })
    }

    fun refresh() {
        val previousSelection = selected
        val wasEnabled = enabled
        enabled = prefs.get(LauncherPrefs.DRAWER_CATEGORIES)
        if (!enabled) {
            tabs.visibility = View.GONE
            if (wasEnabled) host.applyCategoryFilter()
            host.updateDrawerControlsLayout()
            return
        }
        val apps = host.categoryApps
        val hasOther = apps.any { repository.categoryFor(it) == CategoryState.OTHER }
        visible = repository.state().categories.filter { it.id != CategoryState.OTHER || hasOther }
        // Retain a fallback even on an empty device/profile.
        if (visible.isEmpty()) visible = listOf(repository.state().categories.first())
        if (visible.none { it.id == selected }) {
            selected = visible.firstOrNull { category ->
                apps.any { repository.categoryFor(it) == category.id }
            }?.id ?: visible.first().id
            prefs.put(LauncherPrefs.DRAWER_LAST_CATEGORY, selected)
        }
        if (lastProfile != host.categoryProfile) {
            lastProfile = host.categoryProfile
            scrollStates.clear()
        }
        row.removeAllViews()
        val color = context.getColor(R.color.all_apps_label_text_color)
        visible.forEach { category ->
            val active = category.id == selected
            row.addView(ImageButton(context, null, android.R.attr.borderlessButtonStyle).apply {
                setImageResource(CategoryIcons.drawable(category.iconId))
                imageTintList = android.content.res.ColorStateList.valueOf(color)
                contentDescription = repository.title(category)
                tooltipText = repository.title(category)
                setPadding(dp(12), dp(12), dp(12), dp(12))
                isSelected = active
                isFocusable = true
                background = GradientDrawable().apply {
                    cornerRadius = dp(16).toFloat()
                    setColor(ColorUtils.setAlphaComponent(color, if (active) 45 else 0))
                }
                setOnClickListener { select(category.id) }
                setOnLongClickListener {
                    CategoryDialogs.edit(context, repository, category.id)
                    true
                }
                accessibilityDelegate = object : View.AccessibilityDelegate() {
                    override fun onInitializeAccessibilityNodeInfo(
                        host: View, info: android.view.accessibility.AccessibilityNodeInfo,
                    ) {
                        super.onInitializeAccessibilityNodeInfo(host, info)
                        info.className = "android.widget.Button"
                        info.isSelected = active
                    }
                }
            }, LinearLayout.LayoutParams(dp(48), dp(48)))
        }
        row.addView(ImageButton(context, null, android.R.attr.borderlessButtonStyle).apply {
            setImageResource(R.drawable.ic_category_manage)
            setPadding(dp(12), dp(12), dp(12), dp(12))
            imageTintList = android.content.res.ColorStateList.valueOf(color)
            contentDescription = context.getString(R.string.drawer_manage_categories)
            tooltipText = contentDescription
            setOnClickListener { CategoryDialogs.manage(context, repository) }
        }, LinearLayout.LayoutParams(dp(48), dp(48)))
        host.applyCategoryFilter()
        if (selected != previousSelection) host.activeRecyclerView?.scrollToTop()
        host.updateDrawerControlsLayout()
        row.doOnLayout {
            row.childrenAtSelected()?.let { child ->
                tabs.scrollTo(child.left - (tabs.width - child.width) / 2, 0)
            }
        }
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

    private fun LinearLayout.childrenAtSelected(): View? =
        (0 until childCount).map(::getChildAt).firstOrNull { it.isSelected }

    private fun dp(value: Int): Int = (value * context.resources.displayMetrics.density).toInt()
}
