package android.window;

public final class WindowContainerTransaction implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.window.WindowContainerTransaction> CREATOR = null;
    public WindowContainerTransaction() {}
    public void clear() {}
    @android.annotation.NonNull
    public android.window.WindowContainerTransaction setBounds(android.window.WindowContainerToken p0, android.graphics.Rect p1) { return null; }
    @android.annotation.NonNull
    public android.window.WindowContainerTransaction setAppBounds(android.window.WindowContainerToken p0, android.graphics.Rect p1) { return null; }
    @android.annotation.NonNull
    public android.window.WindowContainerTransaction setScreenSizeDp(android.window.WindowContainerToken p0, int p1, int p2) { return null; }
    @android.annotation.NonNull
    public android.window.WindowContainerTransaction setDensityDpi(android.window.WindowContainerToken p0, int p1) { return null; }
    @android.annotation.NonNull
    public android.window.WindowContainerTransaction setBoundsChangeTransaction(android.window.WindowContainerToken p0, android.view.SurfaceControl.Transaction p1) { return null; }
    @android.annotation.NonNull
    public android.window.WindowContainerTransaction setActivityWindowingMode(android.window.WindowContainerToken p0, int p1) { return null; }
    @android.annotation.NonNull
    public android.window.WindowContainerTransaction setWindowingMode(android.window.WindowContainerToken p0, int p1) { return null; }
    @android.annotation.NonNull
    public android.window.WindowContainerTransaction setLaunchNextToBubble(android.window.WindowContainerToken p0, boolean p1) { return null; }
    @android.annotation.NonNull
    public android.window.WindowContainerTransaction setFocusable(android.window.WindowContainerToken p0, boolean p1) { return null; }
    @android.annotation.SuppressLint("UnflaggedApi")
    @android.annotation.NonNull
    public android.window.WindowContainerTransaction setExcludeImeInsets(android.window.WindowContainerToken p0, boolean p1) { return null; }
    @android.annotation.NonNull
    public android.window.WindowContainerTransaction setSystemBarVisibilityOverride(android.window.WindowContainerToken p0, android.os.IBinder p1, int p2, int p3) { return null; }
    @android.annotation.NonNull
    public android.window.WindowContainerTransaction setHidden(android.window.WindowContainerToken p0, boolean p1) { return null; }
    @android.annotation.NonNull
    public android.window.WindowContainerTransaction setSmallestScreenWidthDp(android.window.WindowContainerToken p0, int p1) { return null; }
    @android.annotation.NonNull
    public android.window.WindowContainerTransaction setIgnoreOrientationRequest(android.window.WindowContainerToken p0, boolean p1) { return null; }
    @android.annotation.NonNull
    public android.window.WindowContainerTransaction setForceTranslucent(android.window.WindowContainerToken p0, boolean p1) { return null; }
    @android.annotation.NonNull
    public android.window.WindowContainerTransaction setRelativeBounds(android.window.WindowContainerToken p0, android.graphics.Rect p1) { return null; }
    @android.annotation.NonNull
    public android.window.WindowContainerTransaction setDragResizing(android.window.WindowContainerToken p0, boolean p1) { return null; }
    @android.annotation.NonNull
    public android.window.WindowContainerTransaction setAlwaysOnTop(android.window.WindowContainerToken p0, boolean p1) { return null; }
    @android.annotation.NonNull
    public android.window.WindowContainerTransaction setReparentLeafTaskIfRelaunch(android.window.WindowContainerToken p0, boolean p1) { return null; }
    @android.annotation.NonNull
    public android.window.WindowContainerTransaction deferConfigToTransitionEnd(android.window.WindowContainerToken p0) { return null; }
    @android.annotation.NonNull
    public android.window.WindowContainerTransaction setTaskTrimmableFromRecents(android.window.WindowContainerToken p0, boolean p1) { return null; }
    @android.annotation.NonNull
    @android.annotation.FlaggedApi("com.android.window.flags.safe_region_letterboxing")
    public android.window.WindowContainerTransaction setSafeRegionBounds(android.window.WindowContainerToken p0, android.graphics.Rect p1) { return null; }
    @android.annotation.NonNull
    public android.window.WindowContainerTransaction setTaskForceExcludedFromRecents(android.window.WindowContainerToken p0, boolean p1) { return null; }
    @android.annotation.NonNull
    public android.window.WindowContainerTransaction setSelfMovable(android.window.WindowContainerToken p0, int p1) { return null; }
    @android.annotation.NonNull
    public android.window.WindowContainerTransaction setIsTaskMoveAllowed(android.window.WindowContainerToken p0, boolean p1) { return null; }
    @android.annotation.NonNull
    public android.window.WindowContainerTransaction setInterceptBackPressedOnTaskRoot(android.window.WindowContainerToken p0, boolean p1) { return null; }
    @android.annotation.NonNull
    public android.window.WindowContainerTransaction reorder(android.window.WindowContainerToken p0, boolean p1) { return null; }
    @android.annotation.NonNull
    public android.window.WindowContainerTransaction reorder(android.window.WindowContainerToken p0, boolean p1, boolean p2) { return null; }
    @android.annotation.NonNull
    public android.window.WindowContainerTransaction reparent(android.window.WindowContainerToken p0, android.window.WindowContainerToken p1, boolean p2) { return null; }
    @android.annotation.NonNull
    public android.window.WindowContainerTransaction reparentTasks(android.window.WindowContainerToken p0, android.window.WindowContainerToken p1, int[] p2, int[] p3, boolean p4, boolean p5) { return null; }
    @android.annotation.NonNull
    public android.window.WindowContainerTransaction reparentTasks(android.window.WindowContainerToken p0, android.window.WindowContainerToken p1, int[] p2, int[] p3, boolean p4) { return null; }
    @android.annotation.NonNull
    public android.window.WindowContainerTransaction removeTask(android.window.WindowContainerToken p0) { return null; }
    @android.annotation.NonNull
    public android.window.WindowContainerTransaction removeRootTask(android.window.WindowContainerToken p0) { return null; }
    @android.annotation.NonNull
    public android.window.WindowContainerTransaction restoreTransientOrder(android.window.WindowContainerToken p0) { return null; }
    @android.annotation.NonNull
    public android.window.WindowContainerTransaction restoreBackNavi() { return null; }
    @android.annotation.NonNull
    public android.window.WindowContainerTransaction startTask(int p0, android.os.Bundle p1) { return null; }
    @android.annotation.NonNull
    public android.window.WindowContainerTransaction sendPendingIntent(android.app.PendingIntent p0, android.content.Intent p1, android.os.Bundle p2) { return null; }
    @android.annotation.NonNull
    public android.window.WindowContainerTransaction startShortcut(java.lang.String p0, android.content.pm.ShortcutInfo p1, android.os.Bundle p2) { return null; }
    @android.annotation.NonNull
    public android.window.WindowContainerTransaction setLaunchRoot(android.window.WindowContainerToken p0, int[] p1, int[] p2) { return null; }
    @java.lang.Deprecated
    @android.annotation.NonNull
    public android.window.WindowContainerTransaction setAdjacentRoots(android.window.WindowContainerToken p0, android.window.WindowContainerToken p1) { return null; }
    @android.annotation.NonNull
    public android.window.WindowContainerTransaction setAdjacentRootSet(android.window.WindowContainerToken... p0) { return null; }
    @android.annotation.NonNull
    public android.window.WindowContainerTransaction clearAdjacentRoots(android.window.WindowContainerToken p0) { return null; }
    @android.annotation.NonNull
    public android.window.WindowContainerTransaction setLaunchAdjacentFlagRoot(android.window.WindowContainerToken p0) { return null; }
    @android.annotation.NonNull
    public android.window.WindowContainerTransaction clearLaunchAdjacentFlagRoot(android.window.WindowContainerToken p0) { return null; }
    @android.annotation.NonNull
    public android.window.WindowContainerTransaction setDisableLaunchAdjacent(android.window.WindowContainerToken p0, boolean p1) { return null; }
    @android.annotation.NonNull
    public android.window.WindowContainerTransaction movePipActivityToPinnedRootTask(android.window.WindowContainerToken p0, android.graphics.Rect p1) { return null; }
    @android.annotation.NonNull
    public android.window.WindowContainerTransaction scheduleFinishEnterPip(android.window.WindowContainerToken p0, android.graphics.Rect p1) { return null; }
    @android.annotation.NonNull
    public android.window.WindowContainerTransaction setDoNotPip(android.window.WindowContainerToken p0) { return null; }
    @android.annotation.NonNull
    public android.window.WindowContainerTransaction setDisablePip(android.window.WindowContainerToken p0, boolean p1) { return null; }
    @android.annotation.NonNull
    public android.window.WindowContainerTransaction addInsetsSource(android.window.WindowContainerToken p0, android.os.IBinder p1, int p2, int p3, android.graphics.Rect p4, android.graphics.Rect[] p5, int p6) { return null; }
    @android.annotation.NonNull
    public android.window.WindowContainerTransaction addInsetsSource(android.window.WindowContainerToken p0, android.os.IBinder p1, int p2, int p3, android.graphics.Insets p4, android.graphics.Rect[] p5, int p6) { return null; }
    @android.annotation.NonNull
    public android.window.WindowContainerTransaction removeInsetsSource(android.window.WindowContainerToken p0, android.os.IBinder p1, int p2, int p3) { return null; }
    @android.annotation.NonNull
    public android.window.WindowContainerTransaction addKeyguardState(android.window.KeyguardState p0) { return null; }
    @android.annotation.NonNull
    public android.window.WindowContainerTransaction setTaskFragmentOrganizer(android.window.ITaskFragmentOrganizer p0) { return null; }
    @android.annotation.NonNull
    public android.window.WindowContainerTransaction setErrorCallbackToken(android.os.IBinder p0) { return null; }
    @android.annotation.NonNull
    public android.window.WindowContainerTransaction createTaskFragment(android.window.TaskFragmentCreationParams p0) { return null; }
    @android.annotation.NonNull
    public android.window.WindowContainerTransaction deleteTaskFragment(android.os.IBinder p0) { return null; }
    @android.annotation.NonNull
    public android.window.WindowContainerTransaction startActivityInTaskFragment(android.os.IBinder p0, android.os.IBinder p1, android.content.Intent p2, android.os.Bundle p3) { return null; }
    @android.annotation.NonNull
    public android.window.WindowContainerTransaction reparentActivityToTaskFragment(android.os.IBinder p0, android.os.IBinder p1) { return null; }
    @android.annotation.NonNull
    public android.window.WindowContainerTransaction setAdjacentTaskFragments(android.os.IBinder p0, android.os.IBinder p1, android.window.WindowContainerTransaction.TaskFragmentAdjacentParams p2) { return null; }
    @android.annotation.NonNull
    public android.window.WindowContainerTransaction clearAdjacentTaskFragments(android.os.IBinder p0) { return null; }
    @android.annotation.NonNull
    public android.window.WindowContainerTransaction requestFocusOnTaskFragment(android.os.IBinder p0) { return null; }
    @android.annotation.NonNull
    public android.window.WindowContainerTransaction finishActivity(android.os.IBinder p0) { return null; }
    @android.annotation.NonNull
    public android.window.WindowContainerTransaction setCompanionTaskFragment(android.os.IBinder p0, android.os.IBinder p1) { return null; }
    @android.annotation.NonNull
    public android.window.WindowContainerTransaction addTaskFragmentOperation(android.os.IBinder p0, android.window.TaskFragmentOperation p1) { return null; }
    public android.window.WindowContainerTransaction setReachabilityOffset(android.window.WindowContainerToken p0, int p1, int p2, int p3) { return null; }
    public void merge(android.window.WindowContainerTransaction p0, boolean p1) {}
    public boolean isEmpty() { return false; }
    @android.annotation.NonNull
    public java.util.Map<android.os.IBinder, android.window.WindowContainerTransaction.Change> getChanges() { return null; }
    @android.annotation.NonNull
    public java.util.List<android.window.WindowContainerTransaction.HierarchyOp> getHierarchyOps() { return null; }
    @android.annotation.Nullable
    public android.os.IBinder getErrorCallbackToken() { return null; }
    @android.annotation.Nullable
    public android.window.ITaskFragmentOrganizer getTaskFragmentOrganizer() { return null; }
    @android.annotation.NonNull
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int describeContents() { return 0; }

    public static class Change implements android.os.Parcelable {
        public static final int CHANGE_FOCUSABLE = 1;
        public static final int CHANGE_BOUNDS_TRANSACTION = 2;
        public static final int CHANGE_PIP_CALLBACK = 4;
        public static final int CHANGE_HIDDEN = 8;
        public static final int CHANGE_IGNORE_ORIENTATION_REQUEST = 16;
        public static final int CHANGE_FORCE_NO_PIP = 32;
        public static final int CHANGE_FORCE_TRANSLUCENT = 64;
        public static final int CHANGE_DRAG_RESIZING = 128;
        public static final int CHANGE_RELATIVE_BOUNDS = 256;
        public static final int CHANGE_FORCE_EXCLUDED_FROM_RECENTS = 512;
        public static final int CHANGE_LAUNCH_NEXT_TO_BUBBLE = 1024;
        public static final int CHANGE_DISABLE_PIP = 2048;
        public static final int CHANGE_DISABLE_LAUNCH_ADJACENT = 4096;
        public static final int CHANGE_IS_TASK_MOVE_ALLOWED = 8192;
        public static final int CHANGE_INTERCEPT_BACK_PRESSED = 16384;
        public static final android.os.Parcelable.Creator<android.window.WindowContainerTransaction.Change> CREATOR = null;
        public void merge(android.window.WindowContainerTransaction.Change p0, boolean p1) {}
        public int getWindowingMode() { return 0; }
        public int getActivityWindowingMode() { return 0; }
        @android.annotation.NonNull
        public android.content.res.Configuration getConfiguration() { return null; }
        public boolean getLaunchNextToBubble() { return false; }
        public boolean getFocusable() { return false; }
        public boolean getHidden() { return false; }
        public boolean getIgnoreOrientationRequest() { return false; }
        public boolean getForceTranslucent() { return false; }
        public boolean getDragResizing() { return false; }
        public boolean getForceExcludedFromRecents() { return false; }
        public boolean getDisablePip() { return false; }
        public boolean getDisableLaunchAdjacent() { return false; }
        public boolean getInterceptBackPressed() { return false; }
        public boolean getConfigAtTransitionEnd() { return false; }
        @android.app.TaskInfo.SelfMovable
        public int getSelfMovable() { return 0; }
        public boolean getIsTaskMoveAllowed() { return false; }
        public int getChangeMask() { return 0; }
        public int getConfigSetMask() { return 0; }
        @android.app.WindowConfiguration.WindowConfig
        public int getWindowSetMask() { return 0; }
        @android.annotation.Nullable
        public android.view.SurfaceControl.Transaction getBoundsChangeTransaction() { return null; }
        @android.annotation.Nullable
        public android.graphics.Rect getRelativeBounds() { return null; }
        public java.lang.String toString() { return null; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
        public int describeContents() { return 0; }

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public static @interface ChangeMask {
        }
    }

    public static final class HierarchyOp implements android.os.Parcelable {
        public static final int HIERARCHY_OP_TYPE_REPARENT = 0;
        public static final int HIERARCHY_OP_TYPE_REORDER = 1;
        public static final int HIERARCHY_OP_TYPE_CHILDREN_TASKS_REPARENT = 2;
        public static final int HIERARCHY_OP_TYPE_SET_LAUNCH_ROOT = 3;
        public static final int HIERARCHY_OP_TYPE_SET_ADJACENT_ROOTS = 4;
        public static final int HIERARCHY_OP_TYPE_LAUNCH_TASK = 5;
        public static final int HIERARCHY_OP_TYPE_SET_LAUNCH_ADJACENT_FLAG_ROOT = 6;
        public static final int HIERARCHY_OP_TYPE_PENDING_INTENT = 7;
        public static final int HIERARCHY_OP_TYPE_START_SHORTCUT = 8;
        public static final int HIERARCHY_OP_TYPE_RESTORE_TRANSIENT_ORDER = 9;
        public static final int HIERARCHY_OP_TYPE_ADD_INSETS_FRAME_PROVIDER = 10;
        public static final int HIERARCHY_OP_TYPE_REMOVE_INSETS_FRAME_PROVIDER = 11;
        public static final int HIERARCHY_OP_TYPE_SET_ALWAYS_ON_TOP = 12;
        public static final int HIERARCHY_OP_TYPE_REMOVE_TASK = 13;
        public static final int HIERARCHY_OP_TYPE_FINISH_ACTIVITY = 14;
        public static final int HIERARCHY_OP_TYPE_CLEAR_ADJACENT_ROOTS = 15;
        public static final int HIERARCHY_OP_TYPE_SET_REPARENT_LEAF_TASK_IF_RELAUNCH = 16;
        public static final int HIERARCHY_OP_TYPE_ADD_TASK_FRAGMENT_OPERATION = 17;
        public static final int HIERARCHY_OP_TYPE_MOVE_PIP_ACTIVITY_TO_PINNED_TASK = 18;
        public static final int HIERARCHY_OP_TYPE_SET_IS_TRIMMABLE = 19;
        public static final int HIERARCHY_OP_TYPE_RESTORE_BACK_NAVIGATION = 20;
        public static final int HIERARCHY_OP_TYPE_SET_EXCLUDE_INSETS_TYPES = 21;
        public static final int HIERARCHY_OP_TYPE_SET_KEYGUARD_STATE = 22;
        public static final int HIERARCHY_OP_TYPE_REMOVE_ROOT_TASK = 23;
        public static final int HIERARCHY_OP_TYPE_APP_COMPAT_REACHABILITY = 24;
        public static final int HIERARCHY_OP_TYPE_SET_SAFE_REGION_BOUNDS = 25;
        public static final int HIERARCHY_OP_TYPE_SET_SYSTEM_BAR_VISIBILITY_OVERRIDE = 26;
        public static final java.lang.String LAUNCH_KEY_TASK_ID = "android:transaction.hop.taskId";
        public static final java.lang.String LAUNCH_KEY_SHORTCUT_CALLING_PACKAGE = "android:transaction.hop.shortcut_calling_package";
        public static final java.lang.String REACHABILITY_EVENT_X = "android:transaction.reachability_x";
        public static final java.lang.String REACHABILITY_EVENT_Y = "android:transaction.reachability_y";
        public static final android.os.Parcelable.Creator<android.window.WindowContainerTransaction.HierarchyOp> CREATOR = null;
        @android.annotation.NonNull
        public static android.window.WindowContainerTransaction.HierarchyOp createForReparent(android.os.IBinder p0, android.os.IBinder p1, boolean p2) { return null; }
        @android.annotation.NonNull
        public static android.window.WindowContainerTransaction.HierarchyOp createForReorder(android.os.IBinder p0, boolean p1, boolean p2) { return null; }
        @android.annotation.NonNull
        public static android.window.WindowContainerTransaction.HierarchyOp createForChildrenTasksReparent(android.os.IBinder p0, android.os.IBinder p1, int[] p2, int[] p3, boolean p4, boolean p5) { return null; }
        @android.annotation.NonNull
        public static android.window.WindowContainerTransaction.HierarchyOp createForSetLaunchRoot(android.os.IBinder p0, int[] p1, int[] p2) { return null; }
        @android.annotation.NonNull
        public static android.window.WindowContainerTransaction.HierarchyOp createForAdjacentRoots(android.os.IBinder p0, android.os.IBinder p1) { return null; }
        @android.annotation.NonNull
        public static android.window.WindowContainerTransaction.HierarchyOp createForTaskLaunch(int p0, android.os.Bundle p1) { return null; }
        @android.annotation.NonNull
        public static android.window.WindowContainerTransaction.HierarchyOp createForStartShortcut(java.lang.String p0, android.content.pm.ShortcutInfo p1, android.os.Bundle p2) { return null; }
        @android.annotation.NonNull
        public static android.window.WindowContainerTransaction.HierarchyOp createForSetLaunchAdjacentFlagRoot(android.os.IBinder p0, boolean p1) { return null; }
        @android.annotation.NonNull
        public static android.window.WindowContainerTransaction.HierarchyOp createForRemoveTask(android.os.IBinder p0) { return null; }
        @android.annotation.NonNull
        public static android.window.WindowContainerTransaction.HierarchyOp createForRemoveRootTask(android.os.IBinder p0) { return null; }
        @android.annotation.NonNull
        public static android.window.WindowContainerTransaction.HierarchyOp createForClearAdjacentRoots(android.os.IBinder p0) { return null; }
        @android.annotation.NonNull
        public static android.window.WindowContainerTransaction.HierarchyOp createForReachability(android.os.IBinder p0, int p1, int p2, int p3) { return null; }
        @android.annotation.NonNull
        @android.annotation.FlaggedApi("com.android.window.flags.enable_desktop_windowing_wallpaper_activity")
        public static android.window.WindowContainerTransaction.HierarchyOp createForSetTaskTrimmableFromRecents(android.os.IBinder p0, boolean p1) { return null; }
        @android.annotation.NonNull
        @android.annotation.FlaggedApi("com.android.window.flags.safe_region_letterboxing")
        public static android.window.WindowContainerTransaction.HierarchyOp createForSetSafeRegionBounds(android.os.IBinder p0, android.graphics.Rect p1) { return null; }
        public HierarchyOp(android.window.WindowContainerTransaction.HierarchyOp p0) {}
        public int getType() { return 0; }
        public boolean isReparent() { return false; }
        @android.annotation.Nullable
        public android.os.IBinder getNewParent() { return null; }
        @android.annotation.Nullable
        public android.view.InsetsFrameProvider getInsetsFrameProvider() { return null; }
        @android.annotation.Nullable
        public android.os.IBinder getCaller() { return null; }
        @android.annotation.NonNull
        public android.os.IBinder getContainer() { return null; }
        @android.annotation.NonNull
        public android.os.IBinder[] getContainers() { return null; }
        public boolean getToTop() { return false; }
        public boolean getReparentTopOnly() { return false; }
        @android.annotation.Nullable
        public int[] getWindowingModes() { return null; }
        @android.annotation.Nullable
        public int[] getActivityTypes() { return null; }
        @android.annotation.Nullable
        public android.os.Bundle getLaunchOptions() { return null; }
        @android.annotation.Nullable
        public android.os.Bundle getAppCompatOptions() { return null; }
        @android.annotation.Nullable
        public android.content.Intent getActivityIntent() { return null; }
        public boolean isAlwaysOnTop() { return false; }
        public boolean isReparentLeafTaskIfRelaunch() { return false; }
        @android.annotation.Nullable
        public android.window.TaskFragmentOperation getTaskFragmentOperation() { return null; }
        @android.annotation.Nullable
        public android.window.KeyguardState getKeyguardState() { return null; }
        @android.annotation.Nullable
        public android.app.PendingIntent getPendingIntent() { return null; }
        @android.annotation.Nullable
        public android.content.pm.ShortcutInfo getShortcutInfo() { return null; }
        @android.annotation.NonNull
        public android.graphics.Rect getBounds() { return null; }
        public boolean includingParents() { return false; }
        public boolean isTrimmableFromRecents() { return false; }
        public int getExcludeInsetsTypes() { return 0; }
        public int getForciblyShowingInsetsTypes() { return 0; }
        public int getForciblyHidingInsetsTypes() { return 0; }
        @android.annotation.Nullable
        public android.graphics.Rect getSafeRegionBounds() { return null; }
        public static java.lang.String hopToString(int p0) { return null; }
        public java.lang.String toString() { return null; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
        public int describeContents() { return 0; }

        private static class Builder {
            Builder(int p0) {}
            android.window.WindowContainerTransaction.HierarchyOp.Builder setContainer(android.os.IBinder p0) { return null; }
            android.window.WindowContainerTransaction.HierarchyOp.Builder setContainers(android.os.IBinder[] p0) { return null; }
            android.window.WindowContainerTransaction.HierarchyOp.Builder setReparentContainer(android.os.IBinder p0) { return null; }
            android.window.WindowContainerTransaction.HierarchyOp.Builder setInsetsFrameProvider(android.view.InsetsFrameProvider p0) { return null; }
            android.window.WindowContainerTransaction.HierarchyOp.Builder setCaller(android.os.IBinder p0) { return null; }
            android.window.WindowContainerTransaction.HierarchyOp.Builder setToTop(boolean p0) { return null; }
            android.window.WindowContainerTransaction.HierarchyOp.Builder setReparentTopOnly(boolean p0) { return null; }
            android.window.WindowContainerTransaction.HierarchyOp.Builder setWindowingModes(int[] p0) { return null; }
            android.window.WindowContainerTransaction.HierarchyOp.Builder setActivityTypes(int[] p0) { return null; }
            android.window.WindowContainerTransaction.HierarchyOp.Builder setLaunchOptions(android.os.Bundle p0) { return null; }
            android.window.WindowContainerTransaction.HierarchyOp.Builder setAppCompatOptions(android.os.Bundle p0) { return null; }
            android.window.WindowContainerTransaction.HierarchyOp.Builder setActivityIntent(android.content.Intent p0) { return null; }
            android.window.WindowContainerTransaction.HierarchyOp.Builder setPendingIntent(android.app.PendingIntent p0) { return null; }
            android.window.WindowContainerTransaction.HierarchyOp.Builder setAlwaysOnTop(boolean p0) { return null; }
            android.window.WindowContainerTransaction.HierarchyOp.Builder setTaskFragmentOperation(android.window.TaskFragmentOperation p0) { return null; }
            android.window.WindowContainerTransaction.HierarchyOp.Builder setKeyguardState(android.window.KeyguardState p0) { return null; }
            android.window.WindowContainerTransaction.HierarchyOp.Builder setReparentLeafTaskIfRelaunch(boolean p0) { return null; }
            android.window.WindowContainerTransaction.HierarchyOp.Builder setShortcutInfo(android.content.pm.ShortcutInfo p0) { return null; }
            android.window.WindowContainerTransaction.HierarchyOp.Builder setBounds(android.graphics.Rect p0) { return null; }
            android.window.WindowContainerTransaction.HierarchyOp.Builder setIncludingParents(boolean p0) { return null; }
            android.window.WindowContainerTransaction.HierarchyOp.Builder setIsTrimmableFromRecents(boolean p0) { return null; }
            android.window.WindowContainerTransaction.HierarchyOp.Builder setExcludeInsetsTypes(int p0) { return null; }
            android.window.WindowContainerTransaction.HierarchyOp.Builder setSystemBarVisibilityOverride(int p0, int p1) { return null; }
            android.window.WindowContainerTransaction.HierarchyOp.Builder setSafeRegionBounds(android.graphics.Rect p0) { return null; }
            @android.annotation.NonNull
            android.window.WindowContainerTransaction.HierarchyOp build() { return null; }
        }

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public static @interface HierarchyOpType {
        }
    }

    public static class TaskFragmentAdjacentParams {
        public TaskFragmentAdjacentParams() {}
        public TaskFragmentAdjacentParams(android.os.Bundle p0) {}
        public void setShouldDelayPrimaryLastActivityRemoval(boolean p0) {}
        public void setShouldDelaySecondaryLastActivityRemoval(boolean p0) {}
        public boolean shouldDelayPrimaryLastActivityRemoval() { return false; }
        public boolean shouldDelaySecondaryLastActivityRemoval() { return false; }
        @android.annotation.NonNull
        android.os.Bundle toBundle() { return null; }
    }
}
