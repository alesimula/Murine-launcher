package com.android.internal.util;

public class LatencyTracker {
    public static final java.lang.String SETTINGS_ENABLED_KEY = "enabled";
    public static final int ACTION_EXPAND_PANEL = 0;
    public static final int ACTION_TOGGLE_RECENTS = 1;
    public static final int ACTION_FINGERPRINT_WAKE_AND_UNLOCK = 2;
    public static final int ACTION_CHECK_CREDENTIAL = 3;
    public static final int ACTION_CHECK_CREDENTIAL_UNLOCKED = 4;
    public static final int ACTION_TURN_ON_SCREEN = 5;
    public static final int ACTION_ROTATE_SCREEN = 6;
    public static final int ACTION_FACE_WAKE_AND_UNLOCK = 7;
    public static final int ACTION_START_RECENTS_ANIMATION = 8;
    public static final int ACTION_ROTATE_SCREEN_SENSOR = 9;
    public static final int ACTION_ROTATE_SCREEN_CAMERA_CHECK = 10;
    public static final int ACTION_LOCKSCREEN_UNLOCK = 11;
    public static final int ACTION_USER_SWITCH = 12;
    public static final int ACTION_SWITCH_DISPLAY_UNFOLD = 13;
    public static final int ACTION_UDFPS_ILLUMINATE = 14;
    public static final int ACTION_SHOW_BACK_ARROW = 15;
    public static final int ACTION_LOAD_SHARE_SHEET = 16;
    public static com.android.internal.util.LatencyTracker getInstance(android.content.Context p0) { return null; }
    public static java.lang.String getNameOfAction(int p0) { return null; }
    public static boolean isEnabled(android.content.Context p0) { return false; }
    public boolean isEnabled() { return false; }
    public void onActionStart(int p0) {}
    public void onActionStart(int p0, java.lang.String p1) {}
    public void onActionEnd(int p0) {}
    public void onActionCancel(int p0) {}
    public void logAction(int p0, int p1) {}
    public static void logActionDeprecated(int p0, int p1, boolean p2) {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Action {
    }

    static class Session {
        Session(int p0, java.lang.String p1) {}
        java.lang.String name() { return null; }
        java.lang.String traceName() { return null; }
        void begin(java.lang.Runnable p0) {}
        void end() {}
        void cancel() {}
        int duration() { return 0; }
    }
}
