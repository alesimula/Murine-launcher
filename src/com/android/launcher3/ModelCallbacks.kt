package com.android.launcher3

import android.annotation.TargetApi
import android.os.Build
import android.util.Log
import androidx.annotation.UiThread
import androidx.tracing.Trace
import com.android.launcher3.Flags.enableSmartspaceRemovalToggle
import com.android.launcher3.LauncherConstants.TraceEvents
import com.android.launcher3.Utilities.SHOULD_SHOW_FIRST_PAGE_WIDGET
import com.android.launcher3.WorkspaceLayoutManager.FIRST_SCREEN_ID
import com.android.launcher3.allapps.AllAppsStore
import com.android.launcher3.config.FeatureFlags
import com.android.launcher3.debug.TestEventEmitter
import com.android.launcher3.debug.TestEventEmitter.TestEvent
import com.android.launcher3.model.BgDataModel
import com.android.launcher3.model.StringCache
import com.android.launcher3.model.data.AppInfo
import com.android.launcher3.model.data.ItemInfo
import com.android.launcher3.popup.PopupContainerWithArrow
import com.android.launcher3.util.ComponentKey
import com.android.launcher3.util.IntArray as LIntArray
import com.android.launcher3.util.IntSet as LIntSet
import com.android.launcher3.util.PackageUserKey
import com.android.launcher3.util.Preconditions
import com.android.launcher3.util.RunnableList
import com.android.launcher3.util.TraceHelper
import com.android.launcher3.util.ViewOnDrawExecutor
import java.util.function.Predicate
import android.content.ComponentName
import app.murinelauncher.widget.smartspace.MurineClockWidgetPlugin
import app.murinelauncher.widget.smartspace.SmartspaceMode
import com.android.launcher3.model.data.LauncherAppWidgetInfo
import com.android.launcher3.widget.custom.CustomWidgetManager
import com.android.launcher3.celllayout.CellLayoutLayoutParams
import com.android.launcher3.widget.LauncherAppWidgetProviderInfo
import com.android.launcher3.widget.model.WidgetsListBaseEntry

private const val TAG = "ModelCallbacks"

class ModelCallbacks(private var launcher: Launcher) : BgDataModel.Callbacks {

    var synchronouslyBoundPages = LIntSet()
    var pagesToBindSynchronously = LIntSet()

    private var isFirstPagePinnedItemEnabled =
        (BuildConfig.QSB_ON_FIRST_SCREEN && !enableSmartspaceRemovalToggle())

    var stringCache: StringCache? = null

    var pendingExecutor: ViewOnDrawExecutor? = null

    var workspaceLoading = true

    /**
     * Refreshes the shortcuts shown on the workspace.
     *
     * Implementation of the method from LauncherModel.Callbacks.
     */
    override fun startBinding() {
        TraceHelper.INSTANCE.beginSection("startBinding")
        // Floating panels (except the full widget sheet) are associated with individual icons. If
        // we are starting a fresh bind, close all such panels as all the icons are about
        // to go away.
        AbstractFloatingView.closeOpenViews(
            launcher,
            true,
            AbstractFloatingView.TYPE_ALL and AbstractFloatingView.TYPE_REBIND_SAFE.inv(),
        )
        workspaceLoading = true

        // Clear the workspace because it's going to be rebound
        launcher.dragController.cancelDrag()
        launcher.workspace.clearDropTargets()
        launcher.workspace.removeAllWorkspaceScreens()
        // Avoid clearing the widget update listeners for staying up-to-date with widget info
        launcher.appWidgetHolder.clearWidgetViews()
        // TODO(b/335141365): Remove this log after the bug is fixed.
        Log.d(
            TAG,
            "startBinding: " +
                "hotseat layout was vertical: ${launcher.hotseat?.isHasVerticalHotseat}" +
                " and is setting to ${launcher.deviceProfile.isVerticalBarLayout}",
        )
        launcher.hotseat?.resetLayout(launcher.deviceProfile.isVerticalBarLayout)
        TraceHelper.INSTANCE.endSection()
    }

    @TargetApi(Build.VERSION_CODES.S)
    override fun onInitialBindComplete(
        boundPages: LIntSet,
        pendingTasks: RunnableList,
        onCompleteSignal: RunnableList,
        workspaceItemCount: Int,
        isBindSync: Boolean,
    ) {
        Trace.endAsyncSection(
            TraceEvents.DISPLAY_WORKSPACE_TRACE_METHOD_NAME,
            TraceEvents.DISPLAY_WORKSPACE_TRACE_COOKIE,
        )
        synchronouslyBoundPages = boundPages
        pagesToBindSynchronously = LIntSet()
        clearPendingBinds()
        if (!launcher.isInState(LauncherState.ALL_APPS) && !Flags.enableWorkspaceInflation()) {
            launcher.appsView.appsStore.enableDeferUpdates(AllAppsStore.DEFER_UPDATES_NEXT_DRAW)
            pendingTasks.add {
                launcher.appsView.appsStore.disableDeferUpdates(
                    AllAppsStore.DEFER_UPDATES_NEXT_DRAW
                )
            }
        }
        val executor =
            ViewOnDrawExecutor(pendingTasks) {
                if (pendingExecutor == it) {
                    pendingExecutor = null
                }
            }
        pendingExecutor = executor

        if (Flags.enableWorkspaceInflation()) {
            // Finish the executor as soon as the pending inflation is completed
            onCompleteSignal.add(executor::markCompleted)
        } else {
            // Pending executor is already completed, wait until first draw to run the tasks
            executor.attachTo(launcher)
        }
        launcher.bindComplete(workspaceItemCount, isBindSync)
    }

    /**
     * Callback saying that there aren't any more items to bind.
     *
     * Implementation of the method from LauncherModel.Callbacks.
     */
    override fun finishBindingItems(pagesBoundFirst: LIntSet?) {
        TraceHelper.INSTANCE.beginSection("finishBindingItems")
        val deviceProfile = launcher.deviceProfile
        launcher.workspace.restoreInstanceStateForRemainingPages()
        workspaceLoading = false
        launcher.processActivityResult()
        val currentPage =
            if (pagesBoundFirst != null && !pagesBoundFirst.isEmpty)
                launcher.workspace.getPageIndexForScreenId(pagesBoundFirst.array[0])
            else PagedView.INVALID_PAGE
        // When undoing the removal of the last item on a page, return to that page.
        // Since we are just resetting the current page without user interaction,
        // override the previous page so we don't log the page switch.
        launcher.workspace.setCurrentPage(currentPage, currentPage /* overridePrevPage */)
        pagesToBindSynchronously = LIntSet()

        // Cache one page worth of icons
        launcher.viewCache.setCacheSize(
            R.layout.folder_application,
            deviceProfile.numFolderColumns * deviceProfile.numFolderRows,
        )
        launcher.viewCache.setCacheSize(R.layout.folder_page, 2)
        TraceHelper.INSTANCE.endSection()
        launcher.workspace.removeExtraEmptyScreen(/* stripEmptyScreens= */ true)
        launcher.workspace.pageIndicator.setPauseScroll(
            /*pause=*/ false,
            deviceProfile.isTwoPanels,
        )
        TestEventEmitter.sendEvent(TestEvent.WORKSPACE_FINISH_LOADING)
    }

    /**
     * Clear any pending bind callbacks. This is called when is loader is planning to perform a full
     * rebind from scratch.
     */
    override fun clearPendingBinds() {
        pendingExecutor?.cancel() ?: return
        pendingExecutor = null

        // We might have set this flag previously and forgot to clear it.
        launcher.appsView.appsStore.disableDeferUpdatesSilently(
            AllAppsStore.DEFER_UPDATES_NEXT_DRAW
        )
    }

    override fun preAddApps() {
        // If there's an undo snackbar, force it to complete to ensure empty screens are removed
        // before trying to add new items.
        launcher.modelWriter.commitDelete()
        val snackbar =
            AbstractFloatingView.getOpenView<AbstractFloatingView>(
                launcher,
                AbstractFloatingView.TYPE_SNACKBAR,
            )
        snackbar?.post { snackbar.close(true) }
    }

    @UiThread
    override fun bindAllApplications(
        apps: Array<AppInfo?>?,
        flags: Int,
        packageUserKeytoUidMap: Map<PackageUserKey?, Int?>?,
    ) {
        Preconditions.assertUIThread()
        val hadWorkApps = launcher.appsView.shouldShowTabs()
        launcher.appsView.appsStore.setApps(apps, flags, packageUserKeytoUidMap)
        PopupContainerWithArrow.dismissInvalidPopup(launcher)
        if (
            hadWorkApps != launcher.appsView.shouldShowTabs() &&
                launcher.stateManager.state == LauncherState.ALL_APPS
        ) {
            launcher.stateManager.goToState(LauncherState.NORMAL)
        }
    }

    /**
     * Copies LauncherModel's map of activities to shortcut counts to Launcher's. This is necessary
     * because LauncherModel's map is updated in the background, while Launcher runs on the UI.
     */
    override fun bindDeepShortcutMap(deepShortcutMapCopy: HashMap<ComponentKey?, Int?>?) {
        launcher.popupDataProvider.setDeepShortcutMap(deepShortcutMapCopy)
    }

    override fun bindIncrementalDownloadProgressUpdated(app: AppInfo?) {
        launcher.appsView.appsStore.updateProgressBar(app)
    }

    /**
     * Update the state of a package, typically related to install state. Implementation of the
     * method from LauncherModel.Callbacks.
     */
    override fun bindItemsUpdated(updates: Set<ItemInfo>) {
        launcher.workspace.updateContainerItems(updates, launcher)
        PopupContainerWithArrow.dismissInvalidPopup(launcher)
    }

    /**
     * A package was uninstalled/updated. We take both the super set of packageNames in addition to
     * specific applications to remove, the reason being that this can be called when a package is
     * updated as well. In that scenario, we only remove specific components from the workspace and
     * hotseat, where as package-removal should clear all items by package name.
     */
    override fun bindWorkspaceComponentsRemoved(matcher: Predicate<ItemInfo?>?) {
        launcher.workspace.removeItemsByMatcher(matcher)
        launcher.dragController.onAppsRemoved(matcher)
        PopupContainerWithArrow.dismissInvalidPopup(launcher)
    }

    override fun bindAllWidgets(allWidgets: List<WidgetsListBaseEntry>) {
        launcher.widgetPickerDataProvider.setWidgets(allWidgets)
    }

    /** Returns the ids of the workspaces to bind. */
    override fun getPagesToBindSynchronously(orderedScreenIds: LIntArray): LIntSet {
        // If workspace binding is still in progress, getCurrentPageScreenIds won't be
        // accurate, and we should use mSynchronouslyBoundPages that's set during initial binding.
        val visibleIds =
            when {
                !pagesToBindSynchronously.isEmpty -> pagesToBindSynchronously
                !workspaceLoading -> launcher.workspace.currentPageScreenIds
                else -> synchronouslyBoundPages
            }
        // Launcher IntArray has the same name as Kotlin IntArray
        val result = LIntSet()
        if (visibleIds.isEmpty) {
            return result
        }
        val actualIds = orderedScreenIds.clone()
        val firstId = visibleIds.first()
        val pairId = launcher.workspace.getScreenPair(firstId)
        // Double check that actual screenIds contains the visibleId, as empty screens are hidden
        // in single panel.
        if (actualIds.contains(firstId)) {
            result.add(firstId)
            if (launcher.deviceProfile.isTwoPanels && actualIds.contains(pairId)) {
                result.add(pairId)
            }
        } else if (
            LauncherAppState.getIDP(launcher).supportedProfiles.any(DeviceProfile::isTwoPanels) &&
                actualIds.contains(pairId)
        ) {
            // Add the right panel if left panel is hidden when switching display, due to empty
            // pages being hidden in single panel.
            result.add(pairId)
        }
        return result
    }

    override fun bindSmartspaceWidget() {
        val mode = LauncherPrefs.SMARTSPACE_MODE.get(launcher)
        val cl = launcher.workspace.getScreenWithId(FIRST_SCREEN_ID) ?: run {
            android.util.Log.w(TAG, "bindSmartspaceWidget: first screen not found")
            return
        }
        val idp = InvariantDeviceProfile.INSTANCE.get(launcher)
        // Clamp to actual grid columns — after a grid resize numSearchContainerColumns
        // may momentarily exceed the CellLayout column count.
        val spanX = idp.numSearchContainerColumns.coerceAtMost(idp.numColumns).coerceAtLeast(1)
        android.util.Log.d(TAG, "bindSmartspaceWidget: mode=$mode spanX=$spanX " +
            "cols=${idp.numColumns} searchCols=${idp.numSearchContainerColumns}")

        // Both widget types are persisted in DB.
        val existingInDb = findExistingSmartspaceInBgModel()
        val existingView = findExistingSmartspaceView(cl)
        android.util.Log.d(TAG, "bindSmartspaceWidget: existingInDb=${existingInDb?.providerName} " +
            "pos=(${existingInDb?.cellX},${existingInDb?.cellY}) span=${existingInDb?.spanX} " +
            "existingView=${existingView != null}")

        // If DB widget matches desired mode, span, AND position, keep it — fix up the view if needed
        if (existingInDb != null
            && existingMatchesMode(existingInDb, mode)
            && existingInDb.spanX == spanX
            && existingInDb.cellX == 0 && existingInDb.cellY == 0
        ) {
            // Reinforce canReorder=false (may have been reset by workspace rebuild)
            if (existingView != null) {
                (existingView.layoutParams as? CellLayoutLayoutParams)?.canReorder = false
            }
            // For the Murine clock, the view inflated on BG thread may be empty because
            // CustomWidgetManager.onPluginConnected runs async on MAIN_EXECUTOR and
            // wasn't ready when WidgetInflater ran. Recreate the VIEW (not DB entry).
            if (mode == SmartspaceMode.MURINE_CLOCK && existingView != null) {
                val vg = existingView as? android.view.ViewGroup
                if (vg == null || vg.childCount == 0) {
                    launcher.workspace.removeWorkspaceItem(existingView)
                    recreateClockView(cl, existingInDb)
                }
            }
            android.util.Log.d(TAG, "bindSmartspaceWidget: keeping existing, match OK")
            return
        }

        // TODO fix user defined smartspace being deleted
        // Mismatch or missing — remove existing from DB and workspace
        if (existingInDb != null) {
            android.util.Log.d(TAG, "bindSmartspaceWidget: removing stale widget from DB")
            launcher.modelWriter.deleteWidgetInfo(
                existingInDb, launcher.appWidgetHolder, "smartspace cleanup"
            )
        }
        // TODO fix user defined smartspace being deleted
        if (existingView != null) {
            android.util.Log.d(TAG, "bindSmartspaceWidget: removing stale view")
            launcher.workspace.removeWorkspaceItem(existingView)
        }

        if (mode == SmartspaceMode.DISABLED) return

        // Force-clear any non-smartspace items that might occupy the target region
        // (e.g. icons shifted to (0,0) by grid migration after a grid resize).
        clearSmartspaceRegion(cl, spanX)

        android.util.Log.d(TAG, "bindSmartspaceWidget: creating new widget, mode=$mode")
        when (mode) {
            SmartspaceMode.MURINE_CLOCK -> addMurineClockWidget(cl, spanX)
            SmartspaceMode.GOOGLE_SMARTSPACE -> addGoogleSmartspaceWidget(cl, spanX)
            else -> {}
        }
    }

    private val MURINE_CLOCK_CN = ComponentName(
        "android",
        LauncherAppWidgetProviderInfo.CLS_CUSTOM_WIDGET_PREFIX +
            MurineClockWidgetPlugin::class.java.name
    )

    private val GOOGLE_SMARTSPACE_CN = ComponentName(
        SmartspaceMode.GOOGLE_SMARTSPACE_PACKAGE,
        SmartspaceMode.GOOGLE_SMARTSPACE_PROVIDER
    )

    private fun findExistingSmartspaceInBgModel(): LauncherAppWidgetInfo? {
        val bgDataModel = LauncherAppState.getInstance(launcher).model.bgDataModel
        synchronized(bgDataModel) {
            for (i in 0 until bgDataModel.itemsIdMap.size()) {
                val item = bgDataModel.itemsIdMap.valueAt(i)
                if (item is LauncherAppWidgetInfo
                    && item.container == LauncherSettings.Favorites.CONTAINER_DESKTOP
                    && item.screenId == FIRST_SCREEN_ID
                    && (item.providerName == MURINE_CLOCK_CN || item.providerName == GOOGLE_SMARTSPACE_CN)
                ) {
                    return item
                }
            }
        }
        return null
    }

    private fun existingMatchesMode(info: LauncherAppWidgetInfo, mode: SmartspaceMode): Boolean {
        return when (mode) {
            SmartspaceMode.MURINE_CLOCK -> info.isCustomWidget() && info.providerName == MURINE_CLOCK_CN
            SmartspaceMode.GOOGLE_SMARTSPACE -> !info.isCustomWidget() && info.providerName == GOOGLE_SMARTSPACE_CN
            SmartspaceMode.DISABLED -> false
        }
    }

    private fun findExistingSmartspaceView(cl: CellLayout): android.view.View? {
        val container = cl.shortcutsAndWidgets
        for (i in 0 until container.childCount) {
            val child = container.getChildAt(i) ?: continue
            val info = child.tag as? LauncherAppWidgetInfo ?: continue
            if (info.providerName == MURINE_CLOCK_CN || info.providerName == GOOGLE_SMARTSPACE_CN) {
                return child
            }
        }
        return null
    }

    private fun clearSmartspaceRegion(cl: CellLayout, spanX: Int) {
        val container = cl.shortcutsAndWidgets
        val toRemove = mutableListOf<android.view.View>()
        for (i in 0 until container.childCount) {
            val child = container.getChildAt(i) ?: continue
            val lp = child.layoutParams as? CellLayoutLayoutParams ?: continue
            // Remove any item whose cells overlap with the smartspace region (0,0)→(spanX-1,0)
            if (lp.getCellY() == 0 && lp.getCellX() < spanX
                && lp.getCellX() + lp.cellHSpan > 0
            ) {
                toRemove.add(child)
            }
        }
        for (view in toRemove) {
            val info = view.tag as? ItemInfo
            launcher.workspace.removeWorkspaceItem(view)
            if (info != null) {
                launcher.modelWriter.deleteItemFromDatabase(info, "cleared for smartspace")
            }
        }
    }

    private fun recreateClockView(cl: CellLayout, info: LauncherAppWidgetInfo) {
        val cwm = CustomWidgetManager.INSTANCE.get(launcher)
        val providerInfo = cwm.getWidgetProvider(MURINE_CLOCK_CN) ?: return
        val hostView = launcher.appWidgetHolder.createView(info.appWidgetId, providerInfo)
        hostView.setTag(info)
        hostView.visibility = android.view.View.VISIBLE
        // Pre-set layout params with canReorder=false so addInScreen reuses them
        hostView.layoutParams = CellLayoutLayoutParams(0, 0, info.spanX, info.spanY).apply {
            canReorder = false
        }
        launcher.workspace.addInScreen(hostView, info)
    }

    private fun addMurineClockWidget(cl: CellLayout, spanX: Int) {
        val cwm = CustomWidgetManager.INSTANCE.get(launcher)
        val providerInfo = cwm.getWidgetProvider(MURINE_CLOCK_CN) ?: run {
            android.util.Log.w(TAG, "addMurineClockWidget: provider is null, plugin not ready")
            return
        }
        val appWidgetId = cwm.allocateCustomAppWidgetId(MURINE_CLOCK_CN)
        val hostView = launcher.appWidgetHolder.createView(appWidgetId, providerInfo)

        val widgetInfo = LauncherAppWidgetInfo(appWidgetId, providerInfo.provider, providerInfo, hostView)
        widgetInfo.spanX = spanX
        widgetInfo.spanY = 1
        widgetInfo.minSpanX = spanX
        widgetInfo.minSpanY = 1

        launcher.modelWriter.addItemToDatabase(
            widgetInfo,
            LauncherSettings.Favorites.CONTAINER_DESKTOP,
            FIRST_SCREEN_ID,
            0, 0
        )
        hostView.setTag(widgetInfo)
        hostView.visibility = android.view.View.VISIBLE
        // Pre-set layout params with canReorder=false so addInScreen reuses them
        hostView.layoutParams = CellLayoutLayoutParams(0, 0, spanX, 1).apply {
            canReorder = false
        }
        launcher.workspace.addInScreen(hostView, widgetInfo)
    }

    private fun addGoogleSmartspaceWidget(cl: CellLayout, spanX: Int) {
        val wmh = com.android.launcher3.widget.WidgetManagerHelper(launcher)
        val providerInfo = wmh.findProvider(GOOGLE_SMARTSPACE_CN, android.os.Process.myUserHandle()) ?: run {
            android.util.Log.w(TAG, "addGoogleSmartspaceWidget: Google provider not found")
            return
        }

        val appWidgetId = launcher.appWidgetHolder.allocateAppWidgetId()
        val bound = wmh.bindAppWidgetIdIfAllowed(appWidgetId, providerInfo, null)
        if (!bound) {
            launcher.appWidgetHolder.deleteAppWidgetId(appWidgetId)
            return
        }

        val hostView = launcher.appWidgetHolder.createView(appWidgetId, providerInfo)
        val widgetInfo = LauncherAppWidgetInfo(appWidgetId, providerInfo.provider, providerInfo, hostView)
        widgetInfo.spanX = spanX
        widgetInfo.spanY = 1
        widgetInfo.minSpanX = spanX
        widgetInfo.minSpanY = 1

        launcher.modelWriter.addItemToDatabase(
            widgetInfo,
            LauncherSettings.Favorites.CONTAINER_DESKTOP,
            FIRST_SCREEN_ID,
            0, 0
        )
        hostView.setTag(widgetInfo)
        hostView.visibility = android.view.View.VISIBLE
        // Pre-set layout params with canReorder=false so addInScreen reuses them
        hostView.layoutParams = CellLayoutLayoutParams(0, 0, spanX, 1).apply {
            canReorder = false
        }
        launcher.workspace.addInScreen(hostView, widgetInfo)
    }

    override fun bindScreens(orderedScreenIds: LIntArray) {
        launcher.workspace.pageIndicator.setPauseScroll(
            /*pause=*/ true,
            launcher.deviceProfile.isTwoPanels,
        )
        val firstScreenPosition = 0
        if (
            (isFirstPagePinnedItemEnabled && !SHOULD_SHOW_FIRST_PAGE_WIDGET) &&
                orderedScreenIds.indexOf(FIRST_SCREEN_ID) != firstScreenPosition
        ) {
            orderedScreenIds.removeValue(FIRST_SCREEN_ID)
            orderedScreenIds.add(firstScreenPosition, FIRST_SCREEN_ID)
        } else if (
            (!isFirstPagePinnedItemEnabled || SHOULD_SHOW_FIRST_PAGE_WIDGET) &&
                orderedScreenIds.isEmpty
        ) {
            // If there are no screens, we need to have an empty screen
            launcher.workspace.addExtraEmptyScreens()
        }
        bindAddScreens(orderedScreenIds)

        // After we have added all the screens, if the wallpaper was locked to the default state,
        // then notify to indicate that it can be released and a proper wallpaper offset can be
        // computed before the next layout
        launcher.workspace.unlockWallpaperFromDefaultPageOnNextLayout()
    }

    override fun bindAppsAdded(
        newScreens: LIntArray?,
        addNotAnimated: java.util.ArrayList<ItemInfo?>?,
        addAnimated: java.util.ArrayList<ItemInfo?>?,
    ) {
        // Add the new screens
        if (newScreens != null) {
            // newScreens can contain an empty right panel that is already bound, but not known
            // by BgDataModel.
            newScreens.removeAllValues(launcher.workspace.mScreenOrder)
            bindAddScreens(newScreens)
        }

        // We add the items without animation on non-visible pages, and with
        // animations on the new page (which we will try and snap to).
        if (!addNotAnimated.isNullOrEmpty()) {
            launcher.bindItems(addNotAnimated, false)
        }
        if (!addAnimated.isNullOrEmpty()) {
            launcher.bindItems(addAnimated, true)
        }

        // Remove the extra empty screen
        launcher.workspace.removeExtraEmptyScreen(false)
    }

    private fun bindAddScreens(orderedScreenIdsArg: LIntArray) {
        var orderedScreenIds = orderedScreenIdsArg
        if (launcher.deviceProfile.isTwoPanels) {
            if (FeatureFlags.FOLDABLE_SINGLE_PAGE.get()) {
                orderedScreenIds = filterTwoPanelScreenIds(orderedScreenIds)
            } else {
                // Some empty pages might have been removed while the phone was in a single panel
                // mode, so we want to add those empty pages back.
                val screenIds = LIntSet.wrap(orderedScreenIds)
                orderedScreenIds.forEach { screenId: Int ->
                    screenIds.add(launcher.workspace.getScreenPair(screenId))
                }
                orderedScreenIds = screenIds.array
            }
        }
        orderedScreenIds
            .filterNot { screenId ->
                isFirstPagePinnedItemEnabled &&
                    !SHOULD_SHOW_FIRST_PAGE_WIDGET &&
                    screenId == WorkspaceLayoutManager.FIRST_SCREEN_ID
            }
            .forEach { screenId ->
                launcher.workspace.insertNewWorkspaceScreenBeforeEmptyScreen(screenId)
            }
    }

    /**
     * Remove odd number because they are already included when isTwoPanels and add the pair screen
     * if not present.
     */
    private fun filterTwoPanelScreenIds(orderedScreenIds: LIntArray): LIntArray {
        val screenIds = LIntSet.wrap(orderedScreenIds)
        orderedScreenIds
            .filter { screenId -> screenId % 2 == 1 }
            .forEach { screenId ->
                screenIds.remove(screenId)
                // In case the pair is not added, add it
                if (!launcher.workspace.containsScreenId(screenId - 1)) {
                    screenIds.add(screenId - 1)
                }
            }
        return screenIds.array
    }

    override fun setIsFirstPagePinnedItemEnabled(isFirstPagePinnedItemEnabled: Boolean) {
        this.isFirstPagePinnedItemEnabled = isFirstPagePinnedItemEnabled
        launcher.workspace.bindAndInitFirstWorkspaceScreen()
    }

    override fun bindStringCache(cache: StringCache) {
        stringCache = cache
        launcher.appsView.updateWorkUI()
    }

    fun getIsFirstPagePinnedItemEnabled(): Boolean = isFirstPagePinnedItemEnabled

    override fun getItemInflater() = launcher.itemInflater
}
