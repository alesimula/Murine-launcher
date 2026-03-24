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
    public static final int ENABLE_CAR_MODE_GO_CAR_HOME = 1;
    public static final int ENABLE_CAR_MODE_ALLOW_SLEEP = 2;
    public static final int DISABLE_CAR_MODE_GO_HOME = 1;
    public static final int DISABLE_CAR_MODE_ALL_PRIORITIES = 2;
    @android.annotation.SystemApi
    public static final int DEFAULT_PRIORITY = 0;
    UiModeManager() throws android.os.ServiceManager.ServiceNotFoundException {}
    UiModeManager(android.content.Context p0) throws android.os.ServiceManager.ServiceNotFoundException {}
    public void enableCarMode(int p0) {}
    @android.annotation.SystemApi
    public void enableCarMode(int p0, int p1) {}
    public void disableCarMode(int p0) {}
    public int getCurrentModeType() { return 0; }
    public void setNightMode(int p0) {}
    public int getNightMode() { return 0; }
    public boolean isUiModeLocked() { return false; }
    public boolean isNightModeLocked() { return false; }
    public boolean setNightModeActivated(boolean p0) { return false; }
    public java.time.LocalTime getCustomNightModeStart() { return null; }
    public void setCustomNightModeStart(java.time.LocalTime p0) {}
    public java.time.LocalTime getCustomNightModeEnd() { return null; }
    public void setCustomNightModeEnd(java.time.LocalTime p0) {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface DisableCarMode {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface EnableCarMode {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface NightMode {
    }
}
