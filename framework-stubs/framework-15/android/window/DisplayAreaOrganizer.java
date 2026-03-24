package android.window;

public class DisplayAreaOrganizer extends android.window.WindowOrganizer {
    public static final java.lang.String KEY_ROOT_DISPLAY_AREA_ID = "root_display_area_id";
    public static final int FEATURE_UNDEFINED = -1;
    public static final int FEATURE_SYSTEM_FIRST = 0;
    public static final int FEATURE_ROOT = 0;
    public static final int FEATURE_DEFAULT_TASK_CONTAINER = 1;
    public static final int FEATURE_WINDOW_TOKENS = 2;
    public static final int FEATURE_ONE_HANDED = 3;
    public static final int FEATURE_WINDOWED_MAGNIFICATION = 4;
    public static final int FEATURE_FULLSCREEN_MAGNIFICATION = 5;
    public static final int FEATURE_HIDE_DISPLAY_CUTOUT = 6;
    public static final int FEATURE_IME_PLACEHOLDER = 7;
    public static final int FEATURE_IME = 8;
    public static final int FEATURE_WINDOWING_LAYER = 9;
    public static final int FEATURE_SYSTEM_LAST = 10000;
    public static final int FEATURE_VENDOR_FIRST = 10001;
    public static final int FEATURE_VENDOR_LAST = 20001;
    public static final int FEATURE_RUNTIME_TASK_CONTAINER_FIRST = 20002;
    public DisplayAreaOrganizer(java.util.concurrent.Executor p0) { super(); }
    @android.annotation.NonNull
    public java.util.concurrent.Executor getExecutor() { return null; }
    @android.annotation.RequiresPermission("android.permission.MANAGE_ACTIVITY_TASKS")
    @android.annotation.NonNull
    public java.util.List<android.window.DisplayAreaAppearedInfo> registerOrganizer(int p0) { return null; }
    @android.annotation.RequiresPermission("android.permission.MANAGE_ACTIVITY_TASKS")
    public void unregisterOrganizer() {}
    @android.annotation.RequiresPermission("android.permission.MANAGE_ACTIVITY_TASKS")
    @android.annotation.NonNull
    public android.window.DisplayAreaAppearedInfo createTaskDisplayArea(int p0, int p1, java.lang.String p2) { return null; }
    @android.annotation.RequiresPermission("android.permission.MANAGE_ACTIVITY_TASKS")
    public void deleteTaskDisplayArea(android.window.WindowContainerToken p0) {}
    public void onDisplayAreaAppeared(android.window.DisplayAreaInfo p0, android.view.SurfaceControl p1) {}
    public void onDisplayAreaVanished(android.window.DisplayAreaInfo p0) {}
    public void onDisplayAreaInfoChanged(android.window.DisplayAreaInfo p0) {}
}
