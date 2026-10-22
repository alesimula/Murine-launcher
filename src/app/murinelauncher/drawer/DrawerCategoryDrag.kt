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
import android.widget.RelativeLayout
import com.android.launcher3.DropTarget
import com.android.launcher3.Launcher
import com.android.launcher3.LauncherState
import com.android.launcher3.R
import com.android.launcher3.allapps.ActivityAllAppsContainerView
import com.android.launcher3.dragndrop.DragController
import com.android.launcher3.dragndrop.DragLayer
import com.android.launcher3.dragndrop.DragOptions
import com.android.launcher3.model.data.AppInfo
import com.android.launcher3.views.Snackbar
import com.google.android.material.color.MaterialColors
import com.google.android.material.shape.MaterialShapeDrawable
import com.google.android.material.shape.ShapeAppearanceModel
import com.google.android.material.textview.MaterialTextView
import com.google.android.material.R as MaterialR

/**
 * Keeps an app drag inside the categorized drawer. Dropping on a visible category button moves
 * the app there; holding over the top home zone hands the drag to the home screen, as a drawer
 * drag did before. Any other drop returns the icon to where it was picked up.
 */
class DrawerCategoryDrag(
    private val host: ActivityAllAppsContainerView<*>,
    materialContext: Context,
    private val tabs: DrawerCategoryBar,
    private val searchAction: View,
    private val repository: CategoryRepository,
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
    private var hovered: String? = null

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
    }

    override fun onDragEnd() {
        launcher.dragController.removeDragListener(this)
        launcher.dragController.setExclusiveDropTarget(null)
        setHover(null)
        homeZone.hide()
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
    }

    override fun onDragEnter(dragObject: DropTarget.DragObject) = onDragOver(dragObject)

    override fun onDragOver(dragObject: DropTarget.DragObject) {
        if (inHomeZone(dragObject.y)) {
            setHover(null)
            homeZone.startFill(HOME_DWELL_MS, ::goHome)
        } else {
            homeZone.cancelFill()
            setHover(targetAt(dragObject.x, dragObject.y))
        }
    }

    override fun onDragExit(dragObject: DropTarget.DragObject) {
        homeZone.cancelFill()
        setHover(null)
    }

    override fun acceptDrop(dragObject: DropTarget.DragObject): Boolean = true

    override fun onDrop(dragObject: DropTarget.DragObject, options: DragOptions) {
        val app = app
        // Dropping on the home zone before it fills cancels, like any other non-target drop.
        val target = if (inHomeZone(dragObject.y)) null else targetAt(dragObject.x, dragObject.y)
        val button = target?.let(tabs::buttonFor)
        dragObject.deferDragViewCleanupPostAnimation = true
        if (app == null || target == null || button == null) {
            launcher.dragController.animateDragViewToOriginalPosition(null, null, -1)
            return
        }
        animateInto(dragObject, button)
        move(app, target)
    }

    private fun move(app: AppInfo, target: String) {
        val key = repository.key(app)
        val previous = repository.state().assignments[key]
        repository.edit { it.assign(key, target) }
        val category = repository.state().categories.firstOrNull { it.id == target } ?: return
        val message = context.getString(R.string.drawer_category_moved, app.title,
            repository.title(category))
        tabs.getGlobalVisibleRect(bounds)
        val dragLayer = launcher.dragLayer
        val above = dragLayer.height - bounds.top + dp(8)
        Snackbar.show(launcher, message, R.string.undo, null, {
            repository.edit { it.restoreAssignment(key, previous) }
        }, above)
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
    }
}
