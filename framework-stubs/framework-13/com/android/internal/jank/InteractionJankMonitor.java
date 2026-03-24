package com.android.internal.jank;

public class InteractionJankMonitor {
    static final long EXECUTOR_TASK_TIMEOUT = 500L;
    public static final int MAX_LENGTH_OF_CUJ_NAME = 80;
    public static final java.lang.String ACTION_SESSION_END = null;
    public static final java.lang.String ACTION_SESSION_CANCEL = null;
    public static final int CUJ_NOTIFICATION_SHADE_EXPAND_COLLAPSE = 0;
    public static final int CUJ_NOTIFICATION_SHADE_SCROLL_FLING = 2;
    public static final int CUJ_NOTIFICATION_SHADE_ROW_EXPAND = 3;
    public static final int CUJ_NOTIFICATION_SHADE_ROW_SWIPE = 4;
    public static final int CUJ_NOTIFICATION_SHADE_QS_EXPAND_COLLAPSE = 5;
    public static final int CUJ_NOTIFICATION_SHADE_QS_SCROLL_SWIPE = 6;
    public static final int CUJ_LAUNCHER_APP_LAUNCH_FROM_RECENTS = 7;
    public static final int CUJ_LAUNCHER_APP_LAUNCH_FROM_ICON = 8;
    public static final int CUJ_LAUNCHER_APP_CLOSE_TO_HOME = 9;
    public static final int CUJ_LAUNCHER_APP_CLOSE_TO_PIP = 10;
    public static final int CUJ_LAUNCHER_QUICK_SWITCH = 11;
    public static final int CUJ_NOTIFICATION_HEADS_UP_APPEAR = 12;
    public static final int CUJ_NOTIFICATION_HEADS_UP_DISAPPEAR = 13;
    public static final int CUJ_NOTIFICATION_ADD = 14;
    public static final int CUJ_NOTIFICATION_REMOVE = 15;
    public static final int CUJ_NOTIFICATION_APP_START = 16;
    public static final int CUJ_LOCKSCREEN_PASSWORD_APPEAR = 17;
    public static final int CUJ_LOCKSCREEN_PATTERN_APPEAR = 18;
    public static final int CUJ_LOCKSCREEN_PIN_APPEAR = 19;
    public static final int CUJ_LOCKSCREEN_PASSWORD_DISAPPEAR = 20;
    public static final int CUJ_LOCKSCREEN_PATTERN_DISAPPEAR = 21;
    public static final int CUJ_LOCKSCREEN_PIN_DISAPPEAR = 22;
    public static final int CUJ_LOCKSCREEN_TRANSITION_FROM_AOD = 23;
    public static final int CUJ_LOCKSCREEN_TRANSITION_TO_AOD = 24;
    public static final int CUJ_LAUNCHER_OPEN_ALL_APPS = 25;
    public static final int CUJ_LAUNCHER_ALL_APPS_SCROLL = 26;
    public static final int CUJ_LAUNCHER_APP_LAUNCH_FROM_WIDGET = 27;
    public static final int CUJ_SETTINGS_PAGE_SCROLL = 28;
    public static final int CUJ_LOCKSCREEN_UNLOCK_ANIMATION = 29;
    public static final int CUJ_SHADE_APP_LAUNCH_FROM_HISTORY_BUTTON = 30;
    public static final int CUJ_SHADE_APP_LAUNCH_FROM_MEDIA_PLAYER = 31;
    public static final int CUJ_SHADE_APP_LAUNCH_FROM_QS_TILE = 32;
    public static final int CUJ_SHADE_APP_LAUNCH_FROM_SETTINGS_BUTTON = 33;
    public static final int CUJ_STATUS_BAR_APP_LAUNCH_FROM_CALL_CHIP = 34;
    public static final int CUJ_PIP_TRANSITION = 35;
    public static final int CUJ_WALLPAPER_TRANSITION = 36;
    public static final int CUJ_USER_SWITCH = 37;
    public static final int CUJ_SPLASHSCREEN_AVD = 38;
    public static final int CUJ_SPLASHSCREEN_EXIT_ANIM = 39;
    public static final int CUJ_SCREEN_OFF = 40;
    public static final int CUJ_SCREEN_OFF_SHOW_AOD = 41;
    public static final int CUJ_ONE_HANDED_ENTER_TRANSITION = 42;
    public static final int CUJ_ONE_HANDED_EXIT_TRANSITION = 43;
    public static final int CUJ_UNFOLD_ANIM = 44;
    public static final int CUJ_SUW_LOADING_TO_SHOW_INFO_WITH_ACTIONS = 45;
    public static final int CUJ_SUW_SHOW_FUNCTION_SCREEN_WITH_ACTIONS = 46;
    public static final int CUJ_SUW_LOADING_TO_NEXT_FLOW = 47;
    public static final int CUJ_SUW_LOADING_SCREEN_FOR_STATUS = 48;
    public static final int CUJ_SPLIT_SCREEN_ENTER = 49;
    public static final int CUJ_SPLIT_SCREEN_EXIT = 50;
    public static final int CUJ_LOCKSCREEN_LAUNCH_CAMERA = 51;
    public static final int CUJ_SPLIT_SCREEN_RESIZE = 52;
    public static final int CUJ_SETTINGS_SLIDER = 53;
    public static final int CUJ_TAKE_SCREENSHOT = 54;
    public static final int CUJ_VOLUME_CONTROL = 55;
    public static final int CUJ_BIOMETRIC_PROMPT_TRANSITION = 56;
    public static final int CUJ_SETTINGS_TOGGLE = 57;
    public static final int CUJ_SHADE_DIALOG_OPEN = 58;
    public static final int CUJ_USER_DIALOG_OPEN = 59;
    public static final int CUJ_TASKBAR_EXPAND = 60;
    public static final int CUJ_TASKBAR_COLLAPSE = 61;
    public static final int CUJ_SHADE_CLEAR_ALL = 62;
    public static final int CUJ_LAUNCHER_UNLOCK_ENTRANCE_ANIMATION = 63;
    public static final int CUJ_LOCKSCREEN_OCCLUSION = 64;
    public static final int CUJ_RECENTS_SCROLLING = 65;
    public static final int CUJ_LAUNCHER_APP_SWIPE_TO_RECENTS = 66;
    public static final int CUJ_LAUNCHER_CLOSE_ALL_APPS_SWIPE = 67;
    public static final int CUJ_LAUNCHER_CLOSE_ALL_APPS_TO_HOME = 68;
    public static final int CUJ_LOCKSCREEN_CLOCK_MOVE_ANIMATION = 70;
    public static final int[] CUJ_TO_STATSD_INTERACTION_TYPE = null;
    public static com.android.internal.jank.InteractionJankMonitor getInstance() { return null; }
    public InteractionJankMonitor(android.os.HandlerThread p0) {}
    public com.android.internal.jank.FrameTracker createFrameTracker(com.android.internal.jank.InteractionJankMonitor.Configuration p0, com.android.internal.jank.InteractionJankMonitor.Session p1) { return null; }
    public boolean isInstrumenting(int p0) { return false; }
    public boolean begin(android.view.View p0, int p1) { return false; }
    public boolean begin(com.android.internal.jank.InteractionJankMonitor.Configuration.Builder p0) { return false; }
    public boolean shouldMonitor(int p0) { return false; }
    public void scheduleTimeoutAction(int p0, long p1, java.lang.Runnable p2) {}
    public boolean end(int p0) { return false; }
    public boolean cancel(int p0) { return false; }
    public boolean cancel(int p0, int p1) { return false; }
    public android.provider.DeviceConfig.OnPropertiesChangedListener getPropertiesChangedListener() { return null; }
    public void trigger(com.android.internal.jank.InteractionJankMonitor.Session p0) {}
    public static java.lang.String getNameOfInteraction(int p0) { return null; }
    public static java.lang.String getNameOfCuj(int p0) { return null; }

    public static class Configuration {
        boolean hasValidView() { return false; }
        public boolean isSurfaceOnly() { return false; }
        public android.view.SurfaceControl getSurfaceControl() { return null; }
        public android.view.View getView() { return null; }
        public boolean shouldDeferMonitor() { return false; }
        public android.os.Handler getHandler() { return null; }

        public static class Builder {
            public static com.android.internal.jank.InteractionJankMonitor.Configuration.Builder withSurface(int p0, android.content.Context p1, android.view.SurfaceControl p2) { return null; }
            public static com.android.internal.jank.InteractionJankMonitor.Configuration.Builder withView(int p0, android.view.View p1) { return null; }
            public com.android.internal.jank.InteractionJankMonitor.Configuration.Builder setTimeout(long p0) { return null; }
            public com.android.internal.jank.InteractionJankMonitor.Configuration.Builder setTag(java.lang.String p0) { return null; }
            public com.android.internal.jank.InteractionJankMonitor.Configuration.Builder setDeferMonitorForAnimationStart(boolean p0) { return null; }
            public com.android.internal.jank.InteractionJankMonitor.Configuration build() throws java.lang.IllegalArgumentException { return null; }
        }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface CujType {
    }

    public static class Session {
        public Session(int p0, java.lang.String p1) {}
        public int getCuj() { return 0; }
        public int getStatsdInteractionType() { return 0; }
        public boolean logToStatsd() { return false; }
        public java.lang.String getPerfettoTrigger() { return null; }
        public java.lang.String getName() { return null; }
        public long getTimeStamp() { return 0L; }
        public void setReason(int p0) {}
        public int getReason() { return 0; }
    }

    private static class TrackerResult {
    }
}
