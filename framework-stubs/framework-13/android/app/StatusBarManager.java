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
    public static final int DISABLE_ONGOING_CALL_CHIP = 67108864;
    @java.lang.Deprecated
    public static final int DISABLE_NAVIGATION = 18874368;
    public static final int DISABLE_NONE = 0;
    public static final int DISABLE_MASK = 134152192;
    public static final int DISABLE2_QUICK_SETTINGS = 1;
    public static final int DISABLE2_SYSTEM_ICONS = 2;
    public static final int DISABLE2_NOTIFICATION_SHADE = 4;
    public static final int DISABLE2_GLOBAL_ACTIONS = 8;
    public static final int DISABLE2_ROTATE_SUGGESTIONS = 16;
    public static final int DISABLE2_NONE = 0;
    public static final int DISABLE2_MASK = 31;
    public static final int DEFAULT_SETUP_DISABLE_FLAGS = 61145088;
    public static final int DEFAULT_SETUP_DISABLE2_FLAGS = 0;
    public static final int NAVIGATION_HINT_BACK_ALT = 1;
    public static final int NAVIGATION_HINT_IME_SHOWN = 2;
    public static final int NAVIGATION_HINT_IME_SWITCHER_SHOWN = 4;
    public static final int WINDOW_STATUS_BAR = 1;
    public static final int WINDOW_NAVIGATION_BAR = 2;
    public static final int WINDOW_STATE_SHOWING = 0;
    public static final int WINDOW_STATE_HIDING = 1;
    public static final int WINDOW_STATE_HIDDEN = 2;
    public static final int CAMERA_LAUNCH_SOURCE_WIGGLE = 0;
    public static final int CAMERA_LAUNCH_SOURCE_POWER_DOUBLE_TAP = 1;
    public static final int CAMERA_LAUNCH_SOURCE_LIFT_TRIGGER = 2;
    public static final int CAMERA_LAUNCH_SOURCE_QUICK_AFFORDANCE = 3;
    public static final int CAMERA_LAUNCH_SOURCE_SCREEN_GESTURE = 4;
    public static final int SESSION_KEYGUARD = 1;
    public static final int SESSION_BIOMETRIC_PROMPT = 2;
    public static final java.util.Set<java.lang.Integer> ALL_SESSIONS = null;
    public static final int TILE_ADD_REQUEST_RESULT_TILE_NOT_ADDED = 0;
    public static final int TILE_ADD_REQUEST_RESULT_TILE_ALREADY_ADDED = 1;
    public static final int TILE_ADD_REQUEST_RESULT_TILE_ADDED = 2;
    public static final int TILE_ADD_REQUEST_RESULT_DIALOG_DISMISSED = 3;
    public static final int TILE_ADD_REQUEST_ERROR_MISMATCHED_PACKAGE = 1000;
    public static final int TILE_ADD_REQUEST_ERROR_REQUEST_IN_PROGRESS = 1001;
    public static final int TILE_ADD_REQUEST_ERROR_BAD_COMPONENT = 1002;
    public static final int TILE_ADD_REQUEST_ERROR_NOT_CURRENT_USER = 1003;
    public static final int TILE_ADD_REQUEST_ERROR_APP_NOT_IN_FOREGROUND = 1004;
    public static final int TILE_ADD_REQUEST_ERROR_NO_STATUS_BAR_SERVICE = 1005;
    @android.annotation.SystemApi
    public static final int NAV_BAR_MODE_DEFAULT = 0;
    @android.annotation.SystemApi
    public static final int NAV_BAR_MODE_KIDS = 1;
    @android.annotation.SystemApi
    public static final int MEDIA_TRANSFER_SENDER_STATE_ALMOST_CLOSE_TO_START_CAST = 0;
    @android.annotation.SystemApi
    public static final int MEDIA_TRANSFER_SENDER_STATE_ALMOST_CLOSE_TO_END_CAST = 1;
    @android.annotation.SystemApi
    public static final int MEDIA_TRANSFER_SENDER_STATE_TRANSFER_TO_RECEIVER_TRIGGERED = 2;
    @android.annotation.SystemApi
    public static final int MEDIA_TRANSFER_SENDER_STATE_TRANSFER_TO_THIS_DEVICE_TRIGGERED = 3;
    @android.annotation.SystemApi
    public static final int MEDIA_TRANSFER_SENDER_STATE_TRANSFER_TO_RECEIVER_SUCCEEDED = 4;
    @android.annotation.SystemApi
    public static final int MEDIA_TRANSFER_SENDER_STATE_TRANSFER_TO_THIS_DEVICE_SUCCEEDED = 5;
    @android.annotation.SystemApi
    public static final int MEDIA_TRANSFER_SENDER_STATE_TRANSFER_TO_RECEIVER_FAILED = 6;
    @android.annotation.SystemApi
    public static final int MEDIA_TRANSFER_SENDER_STATE_TRANSFER_TO_THIS_DEVICE_FAILED = 7;
    @android.annotation.SystemApi
    public static final int MEDIA_TRANSFER_SENDER_STATE_FAR_FROM_RECEIVER = 8;
    @android.annotation.SystemApi
    public static final int MEDIA_TRANSFER_RECEIVER_STATE_CLOSE_TO_SENDER = 0;
    @android.annotation.SystemApi
    public static final int MEDIA_TRANSFER_RECEIVER_STATE_FAR_FROM_SENDER = 1;
    public static final int MEDIA_TRANSFER_RECEIVER_STATE_TRANSFER_TO_RECEIVER_SUCCEEDED = 2;
    public static final int MEDIA_TRANSFER_RECEIVER_STATE_TRANSFER_TO_RECEIVER_FAILED = 3;
    StatusBarManager(android.content.Context p0) {}
    public void disable(int p0) {}
    public void disable2(int p0) {}
    public void clickNotification(java.lang.String p0, int p1, int p2, boolean p3) {}
    public void sendNotificationFeedback(java.lang.String p0, android.os.Bundle p1) {}
    public void expandNotificationsPanel() {}
    @android.annotation.RequiresPermission("android.permission.STATUS_BAR")
    public void collapsePanels() {}
    @android.annotation.RequiresPermission("android.permission.STATUS_BAR")
    public void togglePanel() {}
    @android.annotation.RequiresPermission("android.permission.STATUS_BAR")
    public void handleSystemKey(int p0) {}
    public void expandSettingsPanel() {}
    public void expandSettingsPanel(java.lang.String p0) {}
    public void setIcon(java.lang.String p0, int p1, int p2, java.lang.String p3) {}
    public void removeIcon(java.lang.String p0) {}
    public void setIconVisibility(java.lang.String p0, boolean p1) {}
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.STATUS_BAR")
    public void setDisabledForSetup(boolean p0) {}
    @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.MODULE_LIBRARIES)
    @android.annotation.RequiresPermission("android.permission.STATUS_BAR")
    public void setExpansionDisabledForSimNetworkLock(boolean p0) {}
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.STATUS_BAR")
    public android.app.StatusBarManager.DisableInfo getDisableInfo() { return null; }
    public void requestTileServiceListeningState(android.content.ComponentName p0) {}
    public void requestAddTileService(android.content.ComponentName p0, java.lang.CharSequence p1, android.graphics.drawable.Icon p2, java.util.concurrent.Executor p3, java.util.function.Consumer<java.lang.Integer> p4) {}
    public void cancelRequestAddTile(java.lang.String p0) {}
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.STATUS_BAR")
    public void setNavBarMode(int p0) {}
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.STATUS_BAR")
    public int getNavBarMode() { return 0; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.MEDIA_CONTENT_CONTROL")
    public void updateMediaTapToTransferSenderDisplay(int p0, android.media.MediaRoute2Info p1, java.util.concurrent.Executor p2, java.lang.Runnable p3) {}
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.MEDIA_CONTENT_CONTROL")
    public void updateMediaTapToTransferReceiverDisplay(int p0, android.media.MediaRoute2Info p1, android.graphics.drawable.Icon p2, java.lang.CharSequence p3) {}
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.MEDIA_CONTENT_CONTROL")
    public void registerNearbyMediaDevicesProvider(android.media.NearbyMediaDevicesProvider p0) {}
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.MEDIA_CONTENT_CONTROL")
    public void unregisterNearbyMediaDevicesProvider(android.media.NearbyMediaDevicesProvider p0) {}
    @android.annotation.RequiresPermission(allOf={"android.permission.READ_COMPAT_CHANGE_CONFIG", "android.permission.LOG_COMPAT_CHANGE"})
    public static boolean useMediaSessionActionsForApp(java.lang.String p0, android.os.UserHandle p1) { return false; }
    public static java.lang.String windowStateToString(int p0) { return null; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Disable2Flags {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface DisableFlags {
    }

    @android.annotation.SystemApi
    public static final class DisableInfo {
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
        public boolean isRotationSuggestionDisabled() { return false; }
        @android.annotation.SystemApi
        public boolean areAllComponentsEnabled() { return false; }
        public void setEnableAll() {}
        public boolean areAllComponentsDisabled() { return false; }
        public void setDisableAll() {}
        public java.lang.String toString() { return null; }
        public android.util.Pair<java.lang.Integer, java.lang.Integer> toFlags() { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface MediaTransferReceiverState {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface MediaTransferSenderState {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface NavBarMode {
    }

    static final class NearbyMediaDevicesProviderWrapper extends android.media.INearbyMediaDevicesProvider.Stub {
        NearbyMediaDevicesProviderWrapper(android.media.NearbyMediaDevicesProvider p0) { super(); }
        public void registerNearbyDevicesCallback(android.media.INearbyMediaDevicesUpdateCallback p0) {}
        public void unregisterNearbyDevicesCallback(android.media.INearbyMediaDevicesUpdateCallback p0) {}
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface RequestResult {
    }

    static final class RequestResultCallback extends com.android.internal.statusbar.IAddTileResultCallback.Stub {
        RequestResultCallback(java.util.concurrent.Executor p0, java.util.function.Consumer<java.lang.Integer> p1) { super(); }
        public void onTileRequest(int p0) {}
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface SessionFlags {
    }

    static final class UndoCallback extends com.android.internal.statusbar.IUndoMediaTransferCallback.Stub {
        UndoCallback(java.util.concurrent.Executor p0, java.lang.Runnable p1) { super(); }
        public void onUndoTriggered() {}
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface WindowType {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface WindowVisibleState {
    }
}
