package com.android.internal.util;

public class LatencyTracker {
    private static final java.lang.String TAG = "LatencyTracker";
    private static final java.lang.String SETTINGS_ENABLED_KEY = "enabled";
    private static final java.lang.String SETTINGS_SAMPLING_INTERVAL_KEY = "sampling_interval";
    private static final boolean DEFAULT_ENABLED = Boolean.valueOf(false);
    private static final int DEFAULT_SAMPLING_INTERVAL = 5;
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
    private static final int[] ACTIONS_ALL = null;
    private static final int[] STATSD_ACTION = null;
    private static com.android.internal.util.LatencyTracker sLatencyTracker;
    private final java.lang.Object mLock = null;
    private final android.util.SparseLongArray mStartRtc = null;
    private final int[] mTraceThresholdPerAction = null;
    private int mSamplingInterval;
    private boolean mEnabled;
    public static com.android.internal.util.LatencyTracker getInstance(android.content.Context p0) { return null; }
    private LatencyTracker() {}
    private void updateProperties(android.provider.DeviceConfig.Properties p0) {}
    public static java.lang.String getNameOfAction(int p0) { return null; }
    private static java.lang.String getTraceNameOfAction(int p0) { return null; }
    private static java.lang.String getTraceTriggerNameForAction(int p0) { return null; }
    public static boolean isEnabled(android.content.Context p0) { return false; }
    public boolean isEnabled() { return false; }
    public void onActionStart(int p0) {}
    public void onActionEnd(int p0) {}
    public void logAction(int p0, int p1) {}
    public static void logActionDeprecated(int p0, int p1, boolean p2) {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Action {
    }
}
