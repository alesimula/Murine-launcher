package com.android.internal.util;

public class LatencyTracker {
    private static final java.lang.String ACTION_RELOAD_PROPERTY = "com.android.systemui.RELOAD_LATENCY_TRACKER_PROPERTY";
    private static final java.lang.String TAG = "LatencyTracker";
    public static final int ACTION_EXPAND_PANEL = 0;
    public static final int ACTION_TOGGLE_RECENTS = 1;
    public static final int ACTION_FINGERPRINT_WAKE_AND_UNLOCK = 2;
    public static final int ACTION_CHECK_CREDENTIAL = 3;
    public static final int ACTION_CHECK_CREDENTIAL_UNLOCKED = 4;
    public static final int ACTION_TURN_ON_SCREEN = 5;
    public static final int ACTION_ROTATE_SCREEN = 6;
    public static final int ACTION_FACE_WAKE_AND_UNLOCK = 6;
    private static final java.lang.String[] NAMES = null;
    private static com.android.internal.util.LatencyTracker sLatencyTracker;
    private final android.util.SparseLongArray mStartRtc = null;
    private boolean mEnabled;
    public static com.android.internal.util.LatencyTracker getInstance(android.content.Context p0) { return null; }
    private LatencyTracker(android.content.Context p0) {}
    private void reloadProperty() {}
    public static boolean isEnabled(android.content.Context p0) { return false; }
    public void onActionStart(int p0) {}
    public void onActionEnd(int p0) {}
    public static void logAction(int p0, int p1) {}
}
