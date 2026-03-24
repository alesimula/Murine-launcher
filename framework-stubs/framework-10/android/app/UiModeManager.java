package android.app;

public class UiModeManager {
    private static final java.lang.String TAG = "UiModeManager";
    public static java.lang.String ACTION_ENTER_CAR_MODE;
    public static java.lang.String ACTION_EXIT_CAR_MODE;
    public static java.lang.String ACTION_ENTER_DESK_MODE;
    public static java.lang.String ACTION_EXIT_DESK_MODE;
    public static final int MODE_NIGHT_AUTO = 0;
    public static final int MODE_NIGHT_NO = 1;
    public static final int MODE_NIGHT_YES = 2;
    private android.app.IUiModeManager mService;
    public static final int ENABLE_CAR_MODE_GO_CAR_HOME = 1;
    public static final int ENABLE_CAR_MODE_ALLOW_SLEEP = 2;
    public static final int DISABLE_CAR_MODE_GO_HOME = 1;
    @android.annotation.UnsupportedAppUsage
    UiModeManager() throws android.os.ServiceManager.ServiceNotFoundException {}
    public void enableCarMode(int p0) {}
    public void disableCarMode(int p0) {}
    public int getCurrentModeType() { return 0; }
    public void setNightMode(int p0) {}
    public int getNightMode() { return 0; }
    public boolean isUiModeLocked() { return false; }
    public boolean isNightModeLocked() { return false; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface NightMode {
    }
}
