package android.app;

public class UiModeManager {
    public static java.lang.String ACTION_ENTER_CAR_MODE;
    @android.annotation.SystemApi
    public static final java.lang.String ACTION_ENTER_CAR_MODE_PRIORITIZED = "android.app.action.ENTER_CAR_MODE_PRIORITIZED";
    public static java.lang.String ACTION_EXIT_CAR_MODE;
    @android.annotation.SystemApi
    public static final java.lang.String ACTION_EXIT_CAR_MODE_PRIORITIZED = "android.app.action.EXIT_CAR_MODE_PRIORITIZED";
    public static java.lang.String ACTION_ENTER_DESK_MODE;
    public static java.lang.String ACTION_EXIT_DESK_MODE;
    @android.annotation.SystemApi
    public static final java.lang.String EXTRA_CALLING_PACKAGE = "android.app.extra.CALLING_PACKAGE";
    @android.annotation.SystemApi
    public static final java.lang.String EXTRA_PRIORITY = "android.app.extra.PRIORITY";
    public static final int MODE_NIGHT_AUTO = 0;
    public static final int MODE_NIGHT_CUSTOM = 3;
    public static final int MODE_NIGHT_NO = 1;
    public static final int MODE_NIGHT_YES = 2;
    @android.annotation.SystemApi
    public static final int MODE_NIGHT_CUSTOM_TYPE_UNKNOWN = -1;
    @android.annotation.SystemApi
    public static final int MODE_NIGHT_CUSTOM_TYPE_SCHEDULE = 0;
    @android.annotation.SystemApi
    public static final int MODE_NIGHT_CUSTOM_TYPE_BEDTIME = 1;
    public static final int ENABLE_CAR_MODE_GO_CAR_HOME = 1;
    public static final int ENABLE_CAR_MODE_ALLOW_SLEEP = 2;
    public static final int DISABLE_CAR_MODE_GO_HOME = 1;
    public static final int DISABLE_CAR_MODE_ALL_PRIORITIES = 2;
    @android.annotation.SystemApi
    public static final int DEFAULT_PRIORITY = 0;
    @android.annotation.SystemApi
    public static final int PROJECTION_TYPE_NONE = 0;
    @android.annotation.SystemApi
    public static final int PROJECTION_TYPE_AUTOMOTIVE = 1;
    @android.annotation.SystemApi
    public static final int PROJECTION_TYPE_ALL = -1;
    UiModeManager() throws android.os.ServiceManager.ServiceNotFoundException {}
    UiModeManager(android.content.Context p0) throws android.os.ServiceManager.ServiceNotFoundException {}
    public void enableCarMode(int p0) {}
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.ENTER_CAR_MODE_PRIORITIZED")
    public void enableCarMode(int p0, int p1) {}
    public void disableCarMode(int p0) {}
    public int getCurrentModeType() { return 0; }
    public void setNightMode(int p0) {}
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.MODIFY_DAY_NIGHT_MODE")
    public void setNightModeCustomType(int p0) {}
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.MODIFY_DAY_NIGHT_MODE")
    public int getNightModeCustomType() { return 0; }
    public void setApplicationNightMode(int p0) {}
    public int getNightMode() { return 0; }
    public boolean isUiModeLocked() { return false; }
    public boolean isNightModeLocked() { return false; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.MODIFY_DAY_NIGHT_MODE")
    public boolean setNightModeActivatedForCustomMode(int p0, boolean p1) { return false; }
    @android.annotation.RequiresPermission("android.permission.MODIFY_DAY_NIGHT_MODE")
    public boolean setNightModeActivated(boolean p0) { return false; }
    public java.time.LocalTime getCustomNightModeStart() { return null; }
    public void setCustomNightModeStart(java.time.LocalTime p0) {}
    public java.time.LocalTime getCustomNightModeEnd() { return null; }
    public void setCustomNightModeEnd(java.time.LocalTime p0) {}
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission(value="android.permission.TOGGLE_AUTOMOTIVE_PROJECTION", conditional=true)
    public boolean requestProjection(int p0) { return false; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission(value="android.permission.TOGGLE_AUTOMOTIVE_PROJECTION", conditional=true)
    public boolean releaseProjection(int p0) { return false; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.READ_PROJECTION_STATE")
    public java.util.Set<java.lang.String> getProjectingPackages(int p0) { return null; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.READ_PROJECTION_STATE")
    public int getActiveProjectionTypes() { return 0; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.READ_PROJECTION_STATE")
    public void addOnProjectionStateChangedListener(int p0, java.util.concurrent.Executor p1, android.app.UiModeManager.OnProjectionStateChangedListener p2) {}
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.READ_PROJECTION_STATE")
    public void removeOnProjectionStateChangedListener(android.app.UiModeManager.OnProjectionStateChangedListener p0) {}
    public float getContrast() { return 0.0f; }
    public void addContrastChangeListener(java.util.concurrent.Executor p0, android.app.UiModeManager.ContrastChangeListener p1) {}
    public void removeContrastChangeListener(android.app.UiModeManager.ContrastChangeListener p0) {}

    public static interface ContrastChangeListener {
        public void onContrastChanged(float p0);
    }

    public static class ContrastUtils {
        public static final float CONTRAST_DEFAULT_VALUE = 0.0f;
        public static final int CONTRAST_LEVEL_STANDARD = 0;
        public static final int CONTRAST_LEVEL_MEDIUM = 1;
        public static final int CONTRAST_LEVEL_HIGH = 2;
        public ContrastUtils() {}
        public static int toContrastLevel(float p0) { return 0; }
        public static float fromContrastLevel(int p0) { return 0.0f; }

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public static @interface ContrastLevel {
        }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface DisableCarMode {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface EnableCarMode {
    }

    private static class InnerListener extends android.app.IOnProjectionStateChangedListener.Stub {
        public void onProjectionStateChanged(int p0, java.util.List<java.lang.String> p1) {}
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface NightMode {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface NightModeCustomReturnType {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface NightModeCustomType {
    }

    @android.annotation.SystemApi
    public static interface OnProjectionStateChangedListener {
        public void onProjectionStateChanged(int p0, java.util.Set<java.lang.String> p1);
    }

    private static class OnProjectionStateChangedListenerResourceManager {
        void put(android.app.UiModeManager.InnerListener p0, java.util.concurrent.Executor p1, android.app.UiModeManager.OnProjectionStateChangedListener p2) {}
        void remove(android.app.UiModeManager.InnerListener p0) {}
        android.app.UiModeManager.OnProjectionStateChangedListener getOuterListener(android.app.UiModeManager.InnerListener p0) { return null; }
        java.util.concurrent.Executor getExecutor(android.app.UiModeManager.InnerListener p0) { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ProjectionType {
    }
}
