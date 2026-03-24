package com.android.internal.jank;

public class InteractionJankMonitor {
    static final long EXECUTOR_TASK_TIMEOUT = 500L;
    public static final java.lang.String ACTION_SESSION_END = null;
    public static final java.lang.String ACTION_SESSION_CANCEL = null;
    @java.lang.Deprecated
    public static final int CUJ_NOTIFICATION_SHADE_EXPAND_COLLAPSE = 0;
    @java.lang.Deprecated
    public static final int CUJ_NOTIFICATION_SHADE_SCROLL_FLING = 2;
    @java.lang.Deprecated
    public static final int CUJ_NOTIFICATION_SHADE_ROW_EXPAND = 3;
    @java.lang.Deprecated
    public static final int CUJ_NOTIFICATION_SHADE_ROW_SWIPE = 4;
    @java.lang.Deprecated
    public static final int CUJ_NOTIFICATION_SHADE_QS_EXPAND_COLLAPSE = 5;
    @java.lang.Deprecated
    public static final int CUJ_NOTIFICATION_SHADE_QS_SCROLL_SWIPE = 6;
    @java.lang.Deprecated
    public static final int CUJ_NOTIFICATION_HEADS_UP_APPEAR = 12;
    @java.lang.Deprecated
    public static final int CUJ_NOTIFICATION_HEADS_UP_DISAPPEAR = 13;
    @java.lang.Deprecated
    public static final int CUJ_NOTIFICATION_ADD = 14;
    @java.lang.Deprecated
    public static final int CUJ_NOTIFICATION_REMOVE = 15;
    @java.lang.Deprecated
    public static final int CUJ_NOTIFICATION_APP_START = 16;
    @java.lang.Deprecated
    public static final int CUJ_LOCKSCREEN_PASSWORD_APPEAR = 17;
    @java.lang.Deprecated
    public static final int CUJ_LOCKSCREEN_PATTERN_APPEAR = 18;
    @java.lang.Deprecated
    public static final int CUJ_LOCKSCREEN_PIN_APPEAR = 19;
    @java.lang.Deprecated
    public static final int CUJ_LOCKSCREEN_PASSWORD_DISAPPEAR = 20;
    @java.lang.Deprecated
    public static final int CUJ_LOCKSCREEN_PATTERN_DISAPPEAR = 21;
    @java.lang.Deprecated
    public static final int CUJ_LOCKSCREEN_PIN_DISAPPEAR = 22;
    @java.lang.Deprecated
    public static final int CUJ_LOCKSCREEN_TRANSITION_FROM_AOD = 23;
    @java.lang.Deprecated
    public static final int CUJ_LOCKSCREEN_TRANSITION_TO_AOD = 24;
    @java.lang.Deprecated
    public static final int CUJ_SETTINGS_PAGE_SCROLL = 28;
    @java.lang.Deprecated
    public static final int CUJ_LOCKSCREEN_UNLOCK_ANIMATION = 29;
    @java.lang.Deprecated
    public static final int CUJ_SHADE_APP_LAUNCH_FROM_HISTORY_BUTTON = 30;
    @java.lang.Deprecated
    public static final int CUJ_SHADE_APP_LAUNCH_FROM_MEDIA_PLAYER = 31;
    @java.lang.Deprecated
    public static final int CUJ_SHADE_APP_LAUNCH_FROM_QS_TILE = 32;
    @java.lang.Deprecated
    public static final int CUJ_SHADE_APP_LAUNCH_FROM_SETTINGS_BUTTON = 33;
    @java.lang.Deprecated
    public static final int CUJ_STATUS_BAR_APP_LAUNCH_FROM_CALL_CHIP = 34;
    @java.lang.Deprecated
    public static final int CUJ_PIP_TRANSITION = 35;
    @java.lang.Deprecated
    public static final int CUJ_USER_SWITCH = 37;
    @java.lang.Deprecated
    public static final int CUJ_SPLASHSCREEN_AVD = 38;
    @java.lang.Deprecated
    public static final int CUJ_SPLASHSCREEN_EXIT_ANIM = 39;
    @java.lang.Deprecated
    public static final int CUJ_SCREEN_OFF = 40;
    @java.lang.Deprecated
    public static final int CUJ_SCREEN_OFF_SHOW_AOD = 41;
    @java.lang.Deprecated
    public static final int CUJ_UNFOLD_ANIM = 44;
    @java.lang.Deprecated
    public static final int CUJ_SUW_LOADING_TO_SHOW_INFO_WITH_ACTIONS = 45;
    @java.lang.Deprecated
    public static final int CUJ_SUW_SHOW_FUNCTION_SCREEN_WITH_ACTIONS = 46;
    @java.lang.Deprecated
    public static final int CUJ_SUW_LOADING_TO_NEXT_FLOW = 47;
    @java.lang.Deprecated
    public static final int CUJ_SUW_LOADING_SCREEN_FOR_STATUS = 48;
    @java.lang.Deprecated
    public static final int CUJ_SPLIT_SCREEN_RESIZE = 52;
    @java.lang.Deprecated
    public static final int CUJ_SETTINGS_SLIDER = 53;
    @java.lang.Deprecated
    public static final int CUJ_TAKE_SCREENSHOT = 54;
    @java.lang.Deprecated
    public static final int CUJ_VOLUME_CONTROL = 55;
    @java.lang.Deprecated
    public static final int CUJ_BIOMETRIC_PROMPT_TRANSITION = 56;
    @java.lang.Deprecated
    public static final int CUJ_SETTINGS_TOGGLE = 57;
    @java.lang.Deprecated
    public static final int CUJ_SHADE_DIALOG_OPEN = 58;
    @java.lang.Deprecated
    public static final int CUJ_USER_DIALOG_OPEN = 59;
    @java.lang.Deprecated
    public static final int CUJ_TASKBAR_EXPAND = 60;
    @java.lang.Deprecated
    public static final int CUJ_TASKBAR_COLLAPSE = 61;
    @java.lang.Deprecated
    public static final int CUJ_SHADE_CLEAR_ALL = 62;
    @java.lang.Deprecated
    public static final int CUJ_LOCKSCREEN_OCCLUSION = 64;
    @java.lang.Deprecated
    public static final int CUJ_LOCKSCREEN_CLOCK_MOVE_ANIMATION = 70;
    @java.lang.Deprecated
    public static final int CUJ_SPLIT_SCREEN_DOUBLE_TAP_DIVIDER = 82;
    @java.lang.Deprecated
    public static final int CUJ_PREDICTIVE_BACK_CROSS_ACTIVITY = 84;
    @java.lang.Deprecated
    public static final int CUJ_PREDICTIVE_BACK_CROSS_TASK = 85;
    @java.lang.Deprecated
    public static final int CUJ_PREDICTIVE_BACK_HOME = 86;
    @java.lang.Deprecated
    public static final int CUJ_LAUNCHER_LAUNCH_APP_PAIR_FROM_WORKSPACE = 91;
    @java.lang.Deprecated
    public static final int CUJ_LAUNCHER_LAUNCH_APP_PAIR_FROM_TASKBAR = 92;
    @java.lang.Deprecated
    public static final int CUJ_LAUNCHER_SAVE_APP_PAIR = 93;
    @java.lang.Deprecated
    public static final int CUJ_LAUNCHER_ALL_APPS_SEARCH_BACK = 95;
    @java.lang.Deprecated
    public static final int CUJ_LAUNCHER_TASKBAR_ALL_APPS_CLOSE_BACK = 96;
    @java.lang.Deprecated
    public static final int CUJ_LAUNCHER_TASKBAR_ALL_APPS_SEARCH_BACK = 97;
    @java.lang.Deprecated
    public static final int CUJ_LAUNCHER_WIDGET_PICKER_CLOSE_BACK = 98;
    @java.lang.Deprecated
    public static final int CUJ_LAUNCHER_WIDGET_PICKER_SEARCH_BACK = 99;
    @java.lang.Deprecated
    public static final int CUJ_LAUNCHER_WIDGET_BOTTOM_SHEET_CLOSE_BACK = 100;
    @java.lang.Deprecated
    public static final int CUJ_LAUNCHER_WIDGET_EDU_SHEET_CLOSE_BACK = 101;
    public static com.android.internal.jank.InteractionJankMonitor getInstance() { return null; }
    @android.annotation.RequiresPermission("android.permission.READ_DEVICE_CONFIG")
    public InteractionJankMonitor(android.os.HandlerThread p0) {}
    public com.android.internal.jank.FrameTracker createFrameTracker(com.android.internal.jank.InteractionJankMonitor.Configuration p0) { return null; }
    public boolean isInstrumenting(int p0) { return false; }
    public boolean begin(android.view.View p0, int p1) { return false; }
    public boolean begin(com.android.internal.jank.InteractionJankMonitor.Configuration.Builder p0) { return false; }
    public boolean shouldMonitor() { return false; }
    public void scheduleTimeoutAction(com.android.internal.jank.InteractionJankMonitor.Configuration p0, java.lang.Runnable p1) {}
    public boolean end(int p0) { return false; }
    public boolean cancel(int p0) { return false; }
    public boolean cancel(int p0, int p1) { return false; }
    public void updateProperties(android.provider.DeviceConfig.Properties p0) {}
    @java.lang.Deprecated
    public static java.lang.String getNameOfInteraction(int p0) { return null; }
    @java.lang.Deprecated
    public static java.lang.String getNameOfCuj(int p0) { return null; }
    public void configDebugOverlay(int p0, double p1) {}

    public static class Configuration {
        public static java.lang.String generateSessionName(java.lang.String p0, java.lang.String p1) { return null; }
        boolean hasValidView() { return false; }
        public boolean isSurfaceOnly() { return false; }
        public android.view.SurfaceControl getSurfaceControl() { return null; }
        public android.view.View getView() { return null; }
        public boolean shouldDeferMonitor() { return false; }
        public android.os.Handler getHandler() { return null; }
        public int getDisplayId() { return 0; }
        public java.lang.String getSessionName() { return null; }
        public int getStatsdInteractionType() { return 0; }
        public boolean logToStatsd() { return false; }
        public java.lang.String getPerfettoTrigger() { return null; }
        public int getCujType() { return 0; }

        public static class Builder {
            public static com.android.internal.jank.InteractionJankMonitor.Configuration.Builder withSurface(int p0, android.content.Context p1, android.view.SurfaceControl p2) { return null; }
            public static com.android.internal.jank.InteractionJankMonitor.Configuration.Builder withView(int p0, android.view.View p1) { return null; }
            public com.android.internal.jank.InteractionJankMonitor.Configuration.Builder setTimeout(long p0) { return null; }
            public com.android.internal.jank.InteractionJankMonitor.Configuration.Builder setTag(java.lang.String p0) { return null; }
            public com.android.internal.jank.InteractionJankMonitor.Configuration.Builder setDeferMonitorForAnimationStart(boolean p0) { return null; }
            public com.android.internal.jank.InteractionJankMonitor.Configuration build() throws java.lang.IllegalArgumentException { return null; }
        }
    }

    private static class InstanceHolder {
        public static final com.android.internal.jank.InteractionJankMonitor INSTANCE = null;
    }

    static class RunningTracker {
        public final com.android.internal.jank.InteractionJankMonitor.Configuration mConfig = null;
        public final com.android.internal.jank.FrameTracker mTracker = null;
        public final java.lang.Runnable mTimeoutAction = null;
        RunningTracker(com.android.internal.jank.InteractionJankMonitor.Configuration p0, com.android.internal.jank.FrameTracker p1, java.lang.Runnable p2) {}
    }

    @java.lang.FunctionalInterface
    private static interface TimeFunction {
        public void invoke(long p0, long p1, long p2);
    }

    private static class TrackerResult {
    }
}
