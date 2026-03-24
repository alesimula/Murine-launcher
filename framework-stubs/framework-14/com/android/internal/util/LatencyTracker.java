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
    public static final int ACTION_ROTATE_SCREEN_CAMERA_CHECK = 9;
    public static final int ACTION_ROTATE_SCREEN_SENSOR = 10;
    public static final int ACTION_LOCKSCREEN_UNLOCK = 11;
    public static final int ACTION_USER_SWITCH = 12;
    public static final int ACTION_SWITCH_DISPLAY_UNFOLD = 13;
    public static final int ACTION_UDFPS_ILLUMINATE = 14;
    public static final int ACTION_SHOW_BACK_ARROW = 15;
    public static final int ACTION_LOAD_SHARE_SHEET = 16;
    public static final int ACTION_SHOW_SELECTION_TOOLBAR = 17;
    public static final int ACTION_FOLD_TO_AOD = 18;
    public static final int ACTION_SHOW_VOICE_INTERACTION = 19;
    public static final int ACTION_REQUEST_IME_SHOWN = 20;
    public static final int ACTION_REQUEST_IME_HIDDEN = 21;
    public static final int ACTION_SMARTSPACE_DOORBELL = 22;
    public static final int[] STATSD_ACTION = null;
    public static com.android.internal.util.LatencyTracker getInstance(android.content.Context p0) { return null; }
    @android.annotation.RequiresPermission("android.permission.READ_DEVICE_CONFIG")
    public LatencyTracker() {}
    @android.annotation.RequiresPermission("android.permission.READ_DEVICE_CONFIG")
    public void startListeningForLatencyTrackerConfigChanges() {}
    public void stopListeningForLatencyTrackerConfigChanges() {}
    public static java.lang.String getNameOfAction(int p0) { return null; }
    @java.lang.Deprecated
    public static boolean isEnabled(android.content.Context p0) { return false; }
    @java.lang.Deprecated
    public boolean isEnabled() { return false; }
    public static boolean isEnabled(android.content.Context p0, int p1) { return false; }
    public boolean isEnabled(int p0) { return false; }
    public void onActionStart(int p0) {}
    public void onActionStart(int p0, java.lang.String p1) {}
    public void onActionEnd(int p0) {}
    public void onActionCancel(int p0) {}
    public long getActiveActionStartTime(int p0) { return 0L; }
    public void logAction(int p0, int p1) {}
    public void onDeviceConfigPropertiesUpdated(android.util.SparseArray<com.android.internal.util.LatencyTracker.ActionProperties> p0) {}
    public void onTriggerPerfetto(java.lang.String p0) {}
    public void onLogToFrameworkStats(com.android.internal.util.LatencyTracker.FrameworkStatsLogEvent p0) {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Action {
    }

    public static class ActionProperties {
        static final java.lang.String ENABLE_SUFFIX = "_enable";
        static final java.lang.String SAMPLE_INTERVAL_SUFFIX = "_sample_interval";
        static final java.lang.String LEGACY_TRACE_THRESHOLD_SUFFIX = "";
        static final java.lang.String TRACE_THRESHOLD_SUFFIX = "_trace_threshold";
        public ActionProperties(int p0, boolean p1, int p2, int p3) {}
        public int getAction() { return 0; }
        public boolean isEnabled() { return false; }
        public int getSamplingInterval() { return 0; }
        public int getTraceThreshold() { return 0; }
        public java.lang.String toString() { return null; }
        public boolean equals(java.lang.Object p0) { return false; }
        public int hashCode() { return 0; }
    }

    public static class FrameworkStatsLogEvent {
        public final int action = 0;
        public final int logCode = 0;
        public final int statsdAction = 0;
        public final int durationMillis = 0;
        public java.lang.String toString() { return null; }
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

    private static final class SLatencyTrackerHolder {
    }
}
