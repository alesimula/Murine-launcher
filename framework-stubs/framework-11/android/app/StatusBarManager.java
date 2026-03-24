package android.app;

public class StatusBarManager {
    public static final int DISABLE_EXPAND = 65536;
    public static final int DISABLE_NOTIFICATION_ICONS = 131072;
    public static final int DISABLE_NOTIFICATION_ALERTS = 262144;
    @java.lang.Deprecated
    public static final int DISABLE_NOTIFICATION_TICKER = 524288;
    public static final int DISABLE_SYSTEM_INFO = 1048576;
    public static final int DISABLE_HOME = 2097152;
    public static final int DISABLE_RECENT = 16777216;
    public static final int DISABLE_BACK = 4194304;
    public static final int DISABLE_CLOCK = 8388608;
    public static final int DISABLE_SEARCH = 33554432;
    @java.lang.Deprecated
    public static final int DISABLE_NAVIGATION = 18874368;
    public static final int DISABLE_NONE = 0;
    public static final int DISABLE_MASK = 67043328;
    public static final int DISABLE2_QUICK_SETTINGS = 1;
    public static final int DISABLE2_SYSTEM_ICONS = 2;
    public static final int DISABLE2_NOTIFICATION_SHADE = 4;
    public static final int DISABLE2_GLOBAL_ACTIONS = 8;
    public static final int DISABLE2_ROTATE_SUGGESTIONS = 16;
    public static final int DISABLE2_NONE = 0;
    public static final int DISABLE2_MASK = 31;
    public static final int DEFAULT_SETUP_DISABLE_FLAGS = 61145088;
    public static final int DEFAULT_SETUP_DISABLE2_FLAGS = 16;
    private static final int DEFAULT_SIM_LOCKED_DISABLED_FLAGS = 65536;
    public static final int NAVIGATION_HINT_BACK_ALT = 1;
    public static final int NAVIGATION_HINT_IME_SHOWN = 2;
    public static final int WINDOW_STATUS_BAR = 1;
    public static final int WINDOW_NAVIGATION_BAR = 2;
    public static final int WINDOW_STATE_SHOWING = 0;
    public static final int WINDOW_STATE_HIDING = 1;
    public static final int WINDOW_STATE_HIDDEN = 2;
    public static final int CAMERA_LAUNCH_SOURCE_WIGGLE = 0;
    public static final int CAMERA_LAUNCH_SOURCE_POWER_DOUBLE_TAP = 1;
    public static final int CAMERA_LAUNCH_SOURCE_LIFT_TRIGGER = 2;
    private android.content.Context mContext;
    private com.android.internal.statusbar.IStatusBarService mService;
    private android.os.IBinder mToken;
    StatusBarManager(android.content.Context p0) {}
    private synchronized com.android.internal.statusbar.IStatusBarService getService() { return null; }
    public void disable(int p0) {}
    public void disable2(int p0) {}
    public void expandNotificationsPanel() {}
    public void collapsePanels() {}
    public void expandSettingsPanel() {}
    public void expandSettingsPanel(java.lang.String p0) {}
    public void setIcon(java.lang.String p0, int p1, int p2, java.lang.String p3) {}
    public void removeIcon(java.lang.String p0) {}
    public void setIconVisibility(java.lang.String p0, boolean p1) {}
    @android.annotation.SystemApi
    public void setDisabledForSetup(boolean p0) {}
    public void setDisabledForSimNetworkLock(boolean p0) {}
    @android.annotation.SystemApi
    public android.app.StatusBarManager.DisableInfo getDisableInfo() { return null; }
    public static java.lang.String windowStateToString(int p0) { return null; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Disable2Flags {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface DisableFlags {
    }

    @android.annotation.SystemApi
    public static final class DisableInfo {
        private boolean mStatusBarExpansion;
        private boolean mNavigateHome;
        private boolean mNotificationPeeking;
        private boolean mRecents;
        private boolean mSearch;
        private boolean mSystemIcons;
        private boolean mClock;
        private boolean mNotificationIcons;
        public DisableInfo(int p0, int p1) {}
        public DisableInfo() {}
        @android.annotation.SystemApi
        public boolean isStatusBarExpansionDisabled() { return false; }
        public void setStatusBarExpansionDisabled(boolean p0) {}
        @android.annotation.SystemApi
        public boolean isNavigateToHomeDisabled() { return false; }
        public void setNagivationHomeDisabled(boolean p0) {}
        @android.annotation.SystemApi
        public boolean isNotificationPeekingDisabled() { return false; }
        public void setNotificationPeekingDisabled(boolean p0) {}
        @android.annotation.SystemApi
        public boolean isRecentsDisabled() { return false; }
        public void setRecentsDisabled(boolean p0) {}
        @android.annotation.SystemApi
        public boolean isSearchDisabled() { return false; }
        public void setSearchDisabled(boolean p0) {}
        public boolean areSystemIconsDisabled() { return false; }
        public void setSystemIconsDisabled(boolean p0) {}
        public boolean isClockDisabled() { return false; }
        public void setClockDisabled(boolean p0) {}
        public boolean areNotificationIconsDisabled() { return false; }
        public void setNotificationIconsDisabled(boolean p0) {}
        @android.annotation.SystemApi
        public boolean areAllComponentsEnabled() { return false; }
        public void setEnableAll() {}
        public boolean areAllComponentsDisabled() { return false; }
        public void setDisableAll() {}
        public java.lang.String toString() { return null; }
        public android.util.Pair<java.lang.Integer, java.lang.Integer> toFlags() { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface WindowType {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface WindowVisibleState {
    }
}
