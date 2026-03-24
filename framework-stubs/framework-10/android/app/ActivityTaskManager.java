package android.app;

public class ActivityTaskManager {
    public static final int INVALID_STACK_ID = -1;
    public static final int INVALID_TASK_ID = -1;
    public static final int SPLIT_SCREEN_CREATE_MODE_TOP_OR_LEFT = 0;
    public static final int SPLIT_SCREEN_CREATE_MODE_BOTTOM_OR_RIGHT = 1;
    public static final int RESIZE_MODE_SYSTEM = 0;
    public static final int RESIZE_MODE_PRESERVE_WINDOW = 1;
    public static final int RESIZE_MODE_USER = 1;
    public static final int RESIZE_MODE_SYSTEM_SCREEN_ROTATION = 1;
    public static final int RESIZE_MODE_FORCED = 2;
    public static final int RESIZE_MODE_USER_FORCED = 3;
    public static final java.lang.String EXTRA_PERMISSION_TOKEN = "android.app.extra.PERMISSION_TOKEN";
    public static final java.lang.String EXTRA_OPTIONS = "android.app.extra.OPTIONS";
    public static final java.lang.String EXTRA_IGNORE_TARGET_SECURITY = "android.app.extra.EXTRA_IGNORE_TARGET_SECURITY";
    private static int sMaxRecentTasks;
    @android.annotation.UnsupportedAppUsage(trackingBug=129726065L)
    private static final android.util.Singleton<android.app.IActivityTaskManager> IActivityTaskManagerSingleton = null;
    ActivityTaskManager(android.content.Context p0, android.os.Handler p1) {}
    public static android.app.IActivityTaskManager getService() { return null; }
    public void setTaskWindowingMode(int p0, int p1, boolean p2) throws java.lang.SecurityException {}
    public void setTaskWindowingModeSplitScreenPrimary(int p0, int p1, boolean p2, boolean p3, android.graphics.Rect p4, boolean p5) throws java.lang.SecurityException {}
    public void resizeStack(int p0, android.graphics.Rect p1) throws java.lang.SecurityException {}
    public void removeStacksInWindowingModes(int[] p0) throws java.lang.SecurityException {}
    public void removeStacksWithActivityTypes(int[] p0) throws java.lang.SecurityException {}
    public void removeAllVisibleRecentTasks() {}
    public static int getMaxRecentTasksStatic() { return 0; }
    public static int getDefaultAppRecentsLimitStatic() { return 0; }
    public static int getMaxAppRecentsLimitStatic() { return 0; }
    public static boolean supportsMultiWindow(android.content.Context p0) { return false; }
    public static boolean supportsSplitScreenMultiWindow(android.content.Context p0) { return false; }
    public boolean moveTopActivityToPinnedStack(int p0, android.graphics.Rect p1) { return false; }
    public void startSystemLockTaskMode(int p0) {}
    public void stopSystemLockTaskMode() {}
    public void moveTaskToStack(int p0, int p1, boolean p2) {}
    public void resizeStack(int p0, android.graphics.Rect p1, boolean p2) {}
    public void resizeTask(int p0, android.graphics.Rect p1) {}
    public void resizeDockedStack(android.graphics.Rect p0, android.graphics.Rect p1) {}
    public java.lang.String listAllStacks() { return null; }
    public void clearLaunchParamsForPackages(java.util.List<java.lang.String> p0) {}
    public void setDisplayToSingleTaskInstance(int p0) {}
}
