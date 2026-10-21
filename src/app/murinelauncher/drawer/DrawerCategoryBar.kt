/*
 * Copyright 2026 Murine Categories contributors
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may obtain a copy at https://www.apache.org/licenses/LICENSE-2.0
 * Distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND.
 */
package app.murinelauncher.drawer

import android.annotation.SuppressLint
import android.content.Context
import android.content.res.ColorStateList
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.view.ContextThemeWrapper
import android.view.Gravity
import android.view.MotionEvent
import android.view.View
import android.view.ViewGroup
import android.widget.FrameLayout
import android.widget.LinearLayout
import androidx.core.graphics.ColorUtils
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.PagerSnapHelper
import androidx.recyclerview.widget.RecyclerView
import com.android.launcher3.R
import com.google.android.material.button.MaterialButton
import com.google.android.material.color.MaterialColors
import com.google.android.material.R as MaterialR

/** Responsive pages of complete category buttons; long-press a category to manage them. */
// Programmatic-only view: construction requires category action callbacks.
@SuppressLint("ViewConstructor")
class DrawerCategoryBar(
    context: Context,
    private val title: (CategoryState.Category) -> String,
    private val onSelect: (String) -> Unit,
    private val onManage: () -> Unit,
    onSearch: () -> Unit,
) : LinearLayout(context) {
    private var categories = emptyList<CategoryState.Category>()
    private var selected = ""
    private var sizing = CategoryBarLayout.calculate(0, dp(48), 0)
    private val manager = LinearLayoutManager(context, RecyclerView.HORIZONTAL, false)
    private val pages = PageAdapter()
    private val pager = RecyclerView(context).apply {
        id = R.id.drawer_category_pages
        layoutManager = manager
        adapter = pages
        overScrollMode = View.OVER_SCROLL_NEVER
        isNestedScrollingEnabled = false
        itemAnimator = null
    }
    private val indicator = PageIndicator(context)
    private val snap = PagerSnapHelper()
    private val controls = FrameLayout(context)
    private val searchButton = button(R.drawable.ic_allapps_search,
        context.getString(R.string.all_apps_search_bar_hint)).apply {
        id = R.id.drawer_category_search
        isCheckable = false
        visibility = View.GONE
        setOnClickListener { onSearch() }
        backgroundTintList = ColorStateList.valueOf(color(MaterialR.attr.colorPrimaryContainer))
        iconTint = ColorStateList.valueOf(color(MaterialR.attr.colorOnPrimaryContainer))
    }
    private var searchEnabled = false
    private var searchProgress = 0f

    init {
        id = R.id.drawer_category_tabs
        orientation = VERTICAL
        setPadding(dp(4), dp(4), dp(4), 0)
        background = DrawerCategoryTheme.surface(context)
        controls.addView(pager, FrameLayout.LayoutParams(-1, dp(48)))
        controls.addView(searchButton, FrameLayout.LayoutParams(dp(48), dp(48), Gravity.CENTER))
        addView(controls, LayoutParams(-1, dp(48)))
        addView(indicator, LayoutParams(-1, dp(8)))
        snap.attachToRecyclerView(pager)
        pager.addOnLayoutChangeListener { _, left, _, right, _, oldLeft, _, oldRight, _ ->
            if (right - left != oldRight - oldLeft) pager.post { rebuild() }
        }
        pager.addOnScrollListener(object : RecyclerView.OnScrollListener() {
            override fun onScrollStateChanged(view: RecyclerView, state: Int) {
                if (state == RecyclerView.SCROLL_STATE_IDLE) {
                    snap.findSnapView(manager)?.let { showPage(manager.getPosition(it)) }
                }
            }
        })
    }

    fun setSearchEnabled(enabled: Boolean) {
        if (searchEnabled == enabled) return
        searchEnabled = enabled
        searchButton.visibility = if (enabled) View.VISIBLE else View.GONE
        pager.post { rebuild() }
    }

    /** Picks up a changed drawer type without rebuilding the category pages. */
    fun refreshSurface() {
        background = DrawerCategoryTheme.surface(context)
        setSearchProgress(searchProgress)
    }

    fun setSearchProgress(progress: Float) {
        searchProgress = progress
        background?.alpha = (255 * (1 - progress)).toInt()
        controls.alpha = 1 - progress
        controls.scaleX = 1 - 0.08f * progress
        indicator.alpha = 1 - progress
        importantForAccessibility = if (progress > 0) IMPORTANT_FOR_ACCESSIBILITY_NO_HIDE_DESCENDANTS
            else IMPORTANT_FOR_ACCESSIBILITY_AUTO
    }

    override fun onInterceptTouchEvent(event: MotionEvent): Boolean =
        searchProgress > 0 || super.onInterceptTouchEvent(event)

    fun update(categories: List<CategoryState.Category>, selected: String) {
        this.categories = categories
        this.selected = selected
        if (pager.isComputingLayout) pager.post { rebuild() } else rebuild()
    }

    private fun rebuild() {
        if (pager.width <= 0) return
        val previousCount = sizing.pageCount
        pager.stopScroll()
        sizing = if (searchEnabled) CategoryBarLayout.centered(pager.width, dp(48), categories.size)
            else CategoryBarLayout.calculate(pager.width, dp(48), categories.size)
        val count = sizing.pageCount
        if (count > previousCount) pages.notifyItemRangeInserted(previousCount, count - previousCount)
        if (count < previousCount) pages.notifyItemRangeRemoved(count, previousCount - count)
        val changed = minOf(previousCount, count)
        if (changed > 0) pages.notifyItemRangeChanged(0, changed)
        val page = sizing.pageFor(categories.indexOfFirst { it.id == selected })
        manager.scrollToPositionWithOffset(page, 0)
        showPage(page)
    }

    private fun showPage(page: Int) {
        val current = page.coerceIn(0, (sizing.pageCount - 1).coerceAtLeast(0))
        indicator.page = current
        indicator.count = sizing.pageCount
        indicator.invalidate()
        pager.contentDescription = context.getString(
            R.string.drawer_category_page, current + 1, sizing.pageCount.coerceAtLeast(1),
        )
    }

    private inner class PageAdapter : RecyclerView.Adapter<PageHolder>() {
        override fun getItemCount(): Int = sizing.pageCount
        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PageHolder =
            PageHolder(LinearLayout(context).apply { gravity = Gravity.CENTER })

        override fun onBindViewHolder(holder: PageHolder, position: Int) {
            holder.row.layoutParams = RecyclerView.LayoutParams(sizing.width, dp(48))
            holder.row.removeAllViews()
            repeat(sizing.capacity) { slot ->
                if (searchEnabled && slot == sizing.leftCapacity) {
                    holder.row.addView(View(context), LayoutParams(sizing.searchWidth, dp(48)))
                }
                val category = categories.getOrNull(position * sizing.capacity + slot)
                if (category == null && !searchEnabled) return@repeat
                val cell = FrameLayout(context)
                category?.let {
                    cell.addView(button(CategoryIcons.drawable(category.iconId), title(category),
                        category.id == selected).apply {
                        setOnClickListener { onSelect(category.id) }
                        setOnLongClickListener { onManage(); true }
                    }, FrameLayout.LayoutParams(dp(48), dp(48), Gravity.CENTER))
                }
                holder.row.addView(cell, LayoutParams(sizing.slotWidth(slot), dp(48)))
            }
        }
    }

    private class PageHolder(val row: LinearLayout) : RecyclerView.ViewHolder(row)

    private fun button(icon: Int, label: String, active: Boolean = false): MaterialButton =
        MaterialButton(ContextThemeWrapper(context, R.style.ThemeOverlay_MurineCategories_CategoryButton),
            null, MaterialR.attr.materialButtonStyle).apply {
            setIconResource(icon)
            iconGravity = MaterialButton.ICON_GRAVITY_TEXT_START
            contentDescription = label
            tooltipText = label
            isCheckable = true
            setToggleCheckedStateOnClick(false)
            isChecked = active
            isSelected = active
            backgroundTintList = states(color(MaterialR.attr.colorSecondaryContainer), Color.TRANSPARENT)
            iconTint = states(color(MaterialR.attr.colorOnSecondaryContainer),
                color(MaterialR.attr.colorOnSurfaceVariant))
        }

    private fun states(checked: Int, normal: Int) = ColorStateList(
        arrayOf(intArrayOf(android.R.attr.state_checked), intArrayOf()),
        intArrayOf(checked, normal),
    )

    private fun color(attribute: Int): Int = MaterialColors.getColor(context, attribute, javaClass.name)
    private fun dp(value: Int): Int = (value * resources.displayMetrics.density + 0.5f).toInt()

    private inner class PageIndicator(context: Context) : View(context) {
        var page = 0
        var count = 0
        private val paint = Paint(Paint.ANTI_ALIAS_FLAG)
        init { importantForAccessibility = IMPORTANT_FOR_ACCESSIBILITY_NO }
        override fun onDraw(canvas: Canvas) {
            if (count < 2) return
            val step = minOf(dp(8).toFloat(), width.toFloat() / count)
            val start = (width - step * (count - 1)) / 2f
            val onSurface = color(MaterialR.attr.colorOnSurface)
            repeat(count) { index ->
                paint.color = if (index == page) onSurface else
                    ColorUtils.setAlphaComponent(onSurface, 80)
                val position = if (layoutDirection == LAYOUT_DIRECTION_RTL) count - 1 - index else index
                canvas.drawCircle(start + position * step, height / 2f,
                    minOf(dp(2).toFloat(), step / 4), paint)
            }
        }
    }
}
