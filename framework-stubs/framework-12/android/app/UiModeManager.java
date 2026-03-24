package android.app;

public class UiModeManager {
    private static final java.lang.String TAG = "UiModeManager";
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
    private android.app.IUiModeManager mService;
    private android.content.Context mContext;
    private final java.lang.Object mLock = null;
    private final java.util.Map<android.app.UiModeManager.OnProjectionStateChangedListener, android.app.UiModeManager.InnerListener> mProjectionStateListenerMap = null;
    private final android.app.UiModeManager.OnProjectionStateChangedListenerResourceManager mOnProjectionStateChangedListenerResourceManager = null;
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
    public void setApplicationNightMode(int p0) {}
    public int getNightMode() { return 0; }
    public boolean isUiModeLocked() { return false; }
    public boolean isNightModeLocked() { return false; }
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

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface DisableCarMode {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface EnableCarMode {
    }

    private static class InnerListener extends android.app.IOnProjectionStateChangedListener.Stub {
        private final java.lang.ref.WeakReference<android.app.UiModeManager.OnProjectionStateChangedListenerResourceManager> mResourceManager = null;
        private InnerListener(java.util.concurrent.Executor p0, android.app.UiModeManager.OnProjectionStateChangedListener p1, android.app.UiModeManager.OnProjectionStateChangedListenerResourceManager p2) { super(); }
        public void onProjectionStateChanged(int p0, java.util.List<java.lang.String> p1) {}
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface NightMode {
    }

    @android.annotation.SystemApi
    public static interface OnProjectionStateChangedListener {
        public void onProjectionStateChanged(int p0, java.util.Set<java.lang.String> p1);
    }

    private static class OnProjectionStateChangedListenerResourceManager {
        private final java.util.Map<android.app.UiModeManager.InnerListener, android.app.UiModeManager.OnProjectionStateChangedListener> mOuterListenerMap = null;
        private final java.util.Map<android.app.UiModeManager.InnerListener, java.util.concurrent.Executor> mExecutorMap = null;
        private OnProjectionStateChangedListenerResourceManager() {}
        void put(android.app.UiModeManager.InnerListener p0, java.util.concurrent.Executor p1, android.app.UiModeManager.OnProjectionStateChangedListener p2) {}
        void remove(android.app.UiModeManager.InnerListener p0) {}
        android.app.UiModeManager.OnProjectionStateChangedListener getOuterListener(android.app.UiModeManager.InnerListener p0) { return null; }
        java.util.concurrent.Executor getExecutor(android.app.UiModeManager.InnerListener p0) { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ProjectionType {
    }
}
