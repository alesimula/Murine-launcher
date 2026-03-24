package android.app;

public class ActivityTaskManager {
    public static final int INVALID_STACK_ID = -1;
    public static final int INVALID_TASK_ID = -1;
    public static final int INVALID_WINDOWING_MODE = -1;
    public static final int RESIZE_MODE_SYSTEM = 0;
    public static final int RESIZE_MODE_PRESERVE_WINDOW = 1;
    public static final int RESIZE_MODE_USER = 1;
    public static final int RESIZE_MODE_FORCED = 2;
    public static final int RESIZE_MODE_USER_FORCED = 3;
    public static final java.lang.String EXTRA_OPTIONS = "android.app.extra.OPTIONS";
    public static final java.lang.String EXTRA_IGNORE_TARGET_SECURITY = "android.app.extra.EXTRA_IGNORE_TARGET_SECURITY";
    public static final int DEFAULT_MINIMAL_SPLIT_SCREEN_DISPLAY_SIZE_DP = 440;
    public static android.app.ActivityTaskManager getInstance() { return null; }
    public static android.app.IActivityTaskManager getService() { return null; }
    @android.annotation.RequiresPermission("android.permission.MANAGE_ACTIVITY_TASKS")
    public void removeRootTasksInWindowingModes(int[] p0) {}
    @android.annotation.RequiresPermission("android.permission.MANAGE_ACTIVITY_TASKS")
    public void removeRootTasksWithActivityTypes(int[] p0) {}
    @android.annotation.RequiresPermission("android.permission.REMOVE_TASKS")
    public void removeAllVisibleRecentTasks() {}
    public static int getMaxRecentTasksStatic() { return 0; }
    public void onSplashScreenViewCopyFinished(int p0, android.window.SplashScreenView.SplashScreenViewParcelable p1) {}
    public static int getDefaultAppRecentsLimitStatic() { return 0; }
    public static int getMaxAppRecentsLimitStatic() { return 0; }
    public static boolean supportsMultiWindow(android.content.Context p0) { return false; }
    public static boolean supportsSplitScreenMultiWindow(android.content.Context p0) { return false; }
    @android.annotation.RequiresPermission("android.permission.MANAGE_ACTIVITY_TASKS")
    public void startSystemLockTaskMode(int p0) {}
    @android.annotation.RequiresPermission("android.permission.MANAGE_ACTIVITY_TASKS")
    public void stopSystemLockTaskMode() {}
    @android.annotation.RequiresPermission("android.permission.MANAGE_ACTIVITY_TASKS")
    public void moveTaskToRootTask(int p0, int p1, boolean p2) {}
    @android.annotation.RequiresPermission("android.permission.MANAGE_ACTIVITY_TASKS")
    public void resizeTask(int p0, android.graphics.Rect p1) {}
    @android.annotation.RequiresPermission("android.permission.MANAGE_ACTIVITY_TASKS")
    public void clearLaunchParamsForPackages(java.util.List<java.lang.String> p0) {}
    public static boolean currentUiModeSupportsErrorDialogs(android.content.res.Configuration p0) { return false; }
    public static boolean currentUiModeSupportsErrorDialogs(android.content.Context p0) { return false; }
    public static int getMaxNumPictureInPictureActions(android.content.Context p0) { return 0; }
    public java.util.List<android.app.ActivityManager.RunningTaskInfo> getTasks(int p0) { return null; }
    public java.util.List<android.app.ActivityManager.RunningTaskInfo> getTasks(int p0, boolean p1) { return null; }
    public java.util.List<android.app.ActivityManager.RunningTaskInfo> getTasks(int p0, boolean p1, boolean p2) { return null; }
    public java.util.List<android.app.ActivityManager.RunningTaskInfo> getTasks(int p0, boolean p1, boolean p2, int p3) { return null; }
    public java.util.List<android.app.ActivityManager.RecentTaskInfo> getRecentTasks(int p0, int p1, int p2) { return null; }
    public void registerTaskStackListener(android.app.TaskStackListener p0) {}
    public void unregisterTaskStackListener(android.app.TaskStackListener p0) {}
    public android.graphics.Rect getTaskBounds(int p0) { return null; }
    public void registerRemoteAnimationsForDisplay(int p0, android.view.RemoteAnimationDefinition p1) {}
    public boolean isInLockTaskMode() { return false; }
    @android.annotation.RequiresPermission("android.permission.MANAGE_ACTIVITY_TASKS")
    public boolean removeTask(int p0) { return false; }
    public boolean canBeUniversalResizeable(android.content.pm.ApplicationInfo p0) { return false; }
    @android.annotation.RequiresPermission("android.permission.CONTROL_REMOTE_APP_TRANSITION_ANIMATIONS")
    public void detachNavigationBarFromApp(android.os.IBinder p0) {}
    @android.annotation.RequiresPermission("android.permission.UPDATE_LOCK_TASK_PACKAGES")
    public void updateLockTaskPackages(android.content.Context p0, java.lang.String[] p1) {}

    public static class RootTaskInfo extends android.app.TaskInfo implements android.os.Parcelable {
        public android.graphics.Rect bounds;
        public int[] childTaskIds;
        public java.lang.String[] childTaskNames;
        public android.graphics.Rect[] childTaskBounds;
        public int[] childTaskUserIds;
        public boolean visible;
        public int position;
        @android.annotation.NonNull
        public static final android.os.Parcelable.Creator<android.app.ActivityTaskManager.RootTaskInfo> CREATOR = null;
        public int describeContents() { return 0; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
        void readFromParcel(android.os.Parcel p0) {}
        public RootTaskInfo() { super((android.os.Parcel)null); }
        public java.lang.String toString() { return null; }
    }
}
