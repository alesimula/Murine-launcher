/*
 * Copyright 2026 r4l.launcher contributors
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may obtain a copy at https://www.apache.org/licenses/LICENSE-2.0
 * Distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND.
 */
package app.murinelauncher.drawer

import android.content.Context
import android.content.res.ColorStateList
import android.graphics.Rect
import android.view.HapticFeedbackConstants
import android.view.View
import android.view.ViewGroup
import android.widget.RelativeLayout
import com.android.launcher3.BubbleTextView
import com.android.launcher3.DropTarget
import com.android.launcher3.Launcher
import com.android.launcher3.LauncherState
import com.android.launcher3.R
import com.android.launcher3.allapps.ActivityAllAppsContainerView
import com.android.launcher3.dragndrop.DragController
import com.android.launcher3.dragndrop.DragLayer
import com.android.launcher3.dragndrop.DragOptions
import com.android.launcher3.dragndrop.DragView
import com.android.launcher3.model.data.AppInfo
import com.android.launcher3.views.Snackbar
import com.google.android.material.color.MaterialColors
import com.google.android.material.shape.MaterialShapeDrawable
import com.google.android.material.shape.ShapeAppearanceModel
import com.google.android.material.textview.MaterialTextView
import com.google.android.material.R as MaterialR

/**
 * Keeps an app drag inside the categorized drawer. Dropping on a visible category button moves
 * the app there, and pausing over the grid opens a gap that sets its position in the category.
 * Holding over the top home zone hands the drag to the home screen, as a drawer drag did before.
 * Any other drop returns the icon to where it was picked up.
 */
class DrawerCategoryDrag(
    private val host: ActivityAllAppsContainerView<*>,
    materialContext: Context,
    private val tabs: DrawerCategoryBar,
    private val searchAction: View,
    private val repository: CategoryRepository,
    private val categories: DrawerCategoriesController,
) : DropTarget, DragController.DragListener {
    private val context = host.context
    val homeZone = DrawerHomeZone(materialContext)
    private val label = MaterialTextView(materialContext).apply {
        id = R.id.drawer_drag_category_label
        setTextAppearance(MaterialR.style.TextAppearance_Material3_LabelLarge)
        setTextColor(MaterialColors.getColor(materialContext, MaterialR.attr.colorOnSecondaryContainer,
            javaClass.name))
        background = MaterialShapeDrawable(ShapeAppearanceModel.builder()
            .setAllCornerSizes(dp(8).toFloat()).build()).apply {
            fillColor = ColorStateList.valueOf(MaterialColors.getColor(materialContext,
                MaterialR.attr.colorSecondaryContainer, javaClass.name))
        }
        setPadding(dp(12), dp(6), dp(12), dp(6))
        isSingleLine = true
        visibility = View.GONE
        importantForAccessibility = View.IMPORTANT_FOR_ACCESSIBILITY_NO
    }
    private val bounds = Rect()
    private var app: AppInfo? = null
    private var appKey = ""
    private var hovered: String? = null
    // Order shown while dragging over the grid, and the next one waiting out the reorder pause.
    private var shown: List<String>? = null
    private var pending: List<String>? = null
    private val applyPending = Runnable {
        pending?.let { keys ->
            pending = null
            shown = keys
            categories.previewOrder(keys, appKey)
            host.performHapticFeedback(HapticFeedbackConstants.CLOCK_TICK)
        }
    }
    private var scrollDirection = 0
    private val autoScroll = object : Runnable {
        override fun run() {
            val grid = host.categoryRecyclerView
            if (scrollDirection == 0 || grid == null || !grid.canScrollVertically(scrollDirection)) {
                scrollDirection = 0
                return
            }
            grid.scrollBy(0, scrollDirection * dp(SCROLL_STEP_DP))
            launcher.dragController.forceTouchMove()
            host.postOnAnimation(this)
        }
    }

    init {
        host.addView(homeZone, RelativeLayout.LayoutParams(-1, dp(DrawerHomeZone.HEIGHT_DP)).apply {
            addRule(RelativeLayout.ALIGN_PARENT_TOP)
        })
        host.addView(label, RelativeLayout.LayoutParams(-2, -2).apply {
            addRule(RelativeLayout.ALIGN_PARENT_TOP)
            addRule(RelativeLayout.ALIGN_PARENT_LEFT)
        })
    }

    private val launcher: Launcher get() = Launcher.getLauncher(context)

    /** Called on long-press, before the drag starts, so no listener sees a home-screen drag. */
    fun hold(app: AppInfo) {
        val controller = launcher.dragController
        this.app = app
        appKey = repository.key(app)
        controller.setExclusiveDropTarget(this)
        controller.addDragListener(this)
    }

    /** Places the home zone below the status bar, inside the drawer's side padding. */
    fun setInsets(top: Int, left: Int, right: Int) {
        val lp = homeZone.layoutParams as RelativeLayout.LayoutParams
        if (lp.topMargin == top + dp(8) && lp.leftMargin == left && lp.rightMargin == right) return
        lp.topMargin = top + dp(8)
        lp.leftMargin = left
        lp.rightMargin = right
        homeZone.layoutParams = lp
    }

    override fun onDragStart(dragObject: DropTarget.DragObject, options: DragOptions) {
        if (options.isAccessibleDrag) {
            release()
            return
        }
        // The pop-up and search close; the bar must be on screen to accept the drop.
        host.closeSearchForCategoryDrag()
        homeZone.bringToFront()
        label.bringToFront()
        homeZone.show()
        searchAction.animate().alpha(0f).setDuration(FADE_MS).start()
        val key = appKey
        host.setCategoryDragIcon { it is AppInfo && repository.key(it) == key }
    }

    override fun onDragEnd() {
        launcher.dragController.removeDragListener(this)
        launcher.dragController.setExclusiveDropTarget(null)
        setHover(null)
        homeZone.hide()
        stopReorder()
        host.setCategoryDragIcon(null)
        searchAction.animate().alpha(1f).setDuration(FADE_MS).start()
        app = null
    }

    /** Hands the drag to the home screen exactly as an unheld drawer drag would have started. */
    private fun goHome() {
        val launcher = launcher
        val controller = launcher.dragController
        if (!controller.isDragging) return
        release()
        launcher.stateManager.goToState(LauncherState.SPRING_LOADED)
        launcher.dropTargetBar.animateToVisibility(true)
        controller.forceTouchMove()
    }

    private fun release() {
        launcher.dragController.setExclusiveDropTarget(null)
        setHover(null)
        homeZone.hide()
        stopReorder()
    }

    /** Drops any pending or shown preview so the grid returns to the saved order. */
    private fun stopReorder() {
        host.removeCallbacks(applyPending)
        pending = null
        shown = null
        scrollDirection = 0
        categories.clearPreview()
    }

    override fun onDragEnter(dragObject: DropTarget.DragObject) = onDragOver(dragObject)

    override fun onDragOver(dragObject: DropTarget.DragObject) {
        val x = dragObject.x
        val y = dragObject.y
        if (inHomeZone(y)) {
            setHover(null)
            setScroll(0)
            cancelPending()
            homeZone.startFill(HOME_DWELL_MS, ::goHome)
            return
        }
        homeZone.cancelFill()
        val target = targetAt(x, y)
        setHover(target)
        if (target != null || !gridContains(x, y)) {
            setScroll(0)
            cancelPending()
            return
        }
        setScroll(scrollDirectionAt(y))
        if (scrollDirection != 0) cancelPending() else schedule(gridIndexAt(x, y))
    }

    override fun onDragExit(dragObject: DropTarget.DragObject) {
        homeZone.cancelFill()
        setHover(null)
        setScroll(0)
        cancelPending()
    }

    override fun acceptDrop(dragObject: DropTarget.DragObject): Boolean = true

    override fun onDrop(dragObject: DropTarget.DragObject, options: DragOptions) {
        val app = app
        val x = dragObject.x
        val y = dragObject.y
        setScroll(0)
        dragObject.deferDragViewCleanupPostAnimation = true
        // Dropping on the home zone before it fills cancels, like any other non-target drop.
        val home = inHomeZone(y)
        val target = if (home) null else targetAt(x, y)
        val button = target?.let(tabs::buttonFor)
        if (app != null && target != null && button != null) {
            animateInto(dragObject, button)
            move(app, target, null)
            return
        }
        if (app != null && !home && gridContains(x, y)) {
            // A drop during the reorder pause still lands where the finger is.
            if (pending != null) {
                host.removeCallbacks(applyPending)
                applyPending.run()
            }
            val keys = shown
            if (keys != null) {
                val sameCategory = repository.categoryFor(app) == categories.selectedCategory
                if (sameCategory) {
                    repository.edit { categories.saveOrder(it, keys) }
                } else {
                    move(app, categories.selectedCategory, keys)
                }
                val view = dragObject.dragView
                val grid = host.categoryRecyclerView
                if (view != null && grid != null) {
                    // Let a preview applied just now lay out before finding the app's cell.
                    grid.post { animateIntoCell(view, grid) }
                    return
                }
            }
        }
        stopReorder()
        launcher.dragController.animateDragViewToOriginalPosition(null, null, -1)
    }

    /** Moves [app] to [target]; [keys] also places it in the target's order. Undo restores both. */
    private fun move(app: AppInfo, target: String, keys: List<String>?) {
        val key = repository.key(app)
        val before = repository.state().capture(key)
        repository.edit {
            it.assign(key, target)
            if (keys != null) categories.saveOrder(it, keys)
        }
        val category = repository.state().categories.firstOrNull { it.id == target } ?: return
        val message = context.getString(R.string.drawer_category_moved, app.title,
            repository.title(category))
        tabs.getGlobalVisibleRect(bounds)
        val dragLayer = launcher.dragLayer
        val above = dragLayer.height - bounds.top + dp(8)
        Snackbar.show(launcher, message, R.string.undo, null, {
            repository.edit { it.restore(before) }
        }, above)
    }

    private fun animateIntoCell(view: DragView<*>, grid: ViewGroup) {
        val dragLayer = launcher.dragLayer
        val cell = cellFor(grid, appKey)
        if (cell == null) {
            // Scrolled out of view: fade where it was dropped rather than fly somewhere wrong.
            val left = view.translationX.toInt()
            val top = view.translationY.toInt()
            dragLayer.animateView(view, Rect(left, top, left + view.measuredWidth,
                top + view.measuredHeight), 0f, 1f, 1f, FADE_MS.toInt(), null, null,
                DragLayer.ANIMATION_END_DISAPPEAR, null)
            return
        }
        cell.getIconBounds(bounds)
        val center = floatArrayOf(bounds.exactCenterX(), bounds.exactCenterY())
        dragLayer.getDescendantCoordRelativeToSelf(cell, center)
        val left = (center[0] - view.measuredWidth / 2f).toInt()
        val top = (center[1] - view.measuredHeight / 2f).toInt()
        dragLayer.animateView(view, Rect(left, top, left + view.measuredWidth,
            top + view.measuredHeight), 1f, 1f, 1f, -1, null, null,
            DragLayer.ANIMATION_END_DISAPPEAR, null)
    }

    private fun cellFor(grid: ViewGroup, key: String): BubbleTextView? {
        for (i in 0 until grid.childCount) {
            val child = grid.getChildAt(i) as? BubbleTextView ?: continue
            val info = child.tag as? AppInfo ?: continue
            if (repository.key(info) == key) return child
        }
        return null
    }

    /** The grid's content area in host coordinates, excluding padding under the controls. */
    private fun gridBounds(out: Rect): Boolean {
        val grid = host.categoryRecyclerView ?: return false
        if (!grid.isShown) return false
        out.set(0, grid.paddingTop, grid.width, grid.height - grid.paddingBottom)
        host.offsetDescendantRectToMyCoords(grid, out)
        return true
    }

    private fun gridContains(x: Int, y: Int): Boolean = gridBounds(bounds) && bounds.contains(x, y)

    private fun scrollDirectionAt(y: Int): Int {
        if (!gridBounds(bounds)) return 0
        val grid = host.categoryRecyclerView ?: return 0
        val edge = dp(SCROLL_EDGE_DP)
        return when {
            y < bounds.top + edge && grid.canScrollVertically(-1) -> -1
            y > bounds.bottom - edge && grid.canScrollVertically(1) -> 1
            else -> 0
        }
    }

    private fun setScroll(direction: Int) {
        val wasScrolling = scrollDirection != 0
        scrollDirection = direction
        if (!wasScrolling && direction != 0) host.postOnAnimation(autoScroll)
    }

    /**
     * Index in the shown order that the app would take at ([x], [y]): the hovered app's place,
     * or the end when past the last app. Null keeps the current preview.
     */
    private fun gridIndexAt(x: Int, y: Int): Int? {
        val grid = host.categoryRecyclerView ?: return null
        val keys = categories.shownKeys()
        val cell = Rect()
        var lastCell: View? = null
        for (i in 0 until grid.childCount) {
            val child = grid.getChildAt(i) as? BubbleTextView ?: continue
            val info = child.tag as? AppInfo ?: continue
            val index = keys.indexOf(repository.key(info))
            if (index < 0) continue
            cell.set(0, 0, child.width, child.height)
            host.offsetDescendantRectToMyCoords(child, cell)
            if (cell.contains(x, y)) return index
            if (index == keys.lastIndex) lastCell = child
        }
        val last = lastCell ?: return null
        cell.set(0, 0, last.width, last.height)
        host.offsetDescendantRectToMyCoords(last, cell)
        val rtl = host.layoutDirection == View.LAYOUT_DIRECTION_RTL
        val pastEnd = y > cell.bottom || (y >= cell.top && if (rtl) x < cell.left else x > cell.right)
        return if (pastEnd) keys.size else null
    }

    private fun schedule(index: Int?) {
        if (index == null) {
            cancelPending()
            return
        }
        val keys = categories.shownKeys()
        val next = CategoryOrder.move(keys, appKey, index)
        if (next == keys) {
            cancelPending()
            return
        }
        if (next == pending) return
        pending = next
        host.removeCallbacks(applyPending)
        host.postDelayed(applyPending, REORDER_DWELL_MS)
    }

    private fun cancelPending() {
        if (pending == null) return
        pending = null
        host.removeCallbacks(applyPending)
    }

    private fun animateInto(dragObject: DropTarget.DragObject, button: View) {
        val dragLayer = launcher.dragLayer
        val view = dragObject.dragView
        val center = floatArrayOf(button.width / 2f, button.height / 2f)
        dragLayer.getDescendantCoordRelativeToSelf(button, center)
        val left = (center[0] - view.measuredWidth / 2f).toInt()
        val top = (center[1] - view.measuredHeight / 2f).toInt()
        dragLayer.animateView(view, Rect(left, top, left + view.measuredWidth,
            top + view.measuredHeight), 0f, DROP_SCALE, DROP_SCALE, -1, null, null,
            DragLayer.ANIMATION_END_DISAPPEAR, null)
    }

    /** Only other categories are targets; the app's own category is a no-op. */
    private fun targetAt(x: Int, y: Int): String? {
        val app = app ?: return null
        return tabs.categoryAt(host, x, y)?.takeIf { it != repository.categoryFor(app) }
    }

    private fun inHomeZone(y: Int): Boolean =
        homeZone.visibility == View.VISIBLE && homeZone.alpha > 0f && y < homeZone.bottom

    private fun setHover(id: String?) {
        if (id == hovered) return
        hovered = id
        tabs.setDropHover(id)
        val button = id?.let(tabs::buttonFor)
        val category = repository.state().categories.firstOrNull { it.id == id }
        if (button == null || category == null) {
            label.visibility = View.GONE
            return
        }
        tabs.performHapticFeedback(HapticFeedbackConstants.CLOCK_TICK)
        label.text = repository.title(category)
        label.measure(View.MeasureSpec.UNSPECIFIED, View.MeasureSpec.UNSPECIFIED)
        bounds.set(0, 0, button.width, button.height)
        host.offsetDescendantRectToMyCoords(button, bounds)
        val margin = dp(8)
        // The label is laid out at the host's padded origin; translate from there.
        label.translationX = ((bounds.centerX() - label.measuredWidth / 2)
            .coerceIn(margin, (host.width - label.measuredWidth - margin).coerceAtLeast(margin))
            - host.paddingLeft).toFloat()
        label.translationY = (bounds.top - label.measuredHeight - margin - host.paddingTop).toFloat()
        label.visibility = View.VISIBLE
    }

    override fun isDropEnabled(): Boolean = true

    override fun prepareAccessibilityDrop() {}

    override fun getHitRectRelativeToDragLayer(outRect: Rect) {
        launcher.dragLayer.getDescendantRectRelativeToSelf(host, outRect)
    }

    override fun getDropView(): View = host

    private fun dp(value: Int): Int = (value * context.resources.displayMetrics.density).toInt()

    private companion object {
        const val HOME_DWELL_MS = 300L
        const val FADE_MS = 150L
        const val DROP_SCALE = 0.3f
        const val REORDER_DWELL_MS = 150L
        const val SCROLL_EDGE_DP = 48
        const val SCROLL_STEP_DP = 10
    }
}
