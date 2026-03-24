package com.android.internal.os;

public class TimeoutRecord {
    public final int mKind = 0;
    public final java.lang.String mReason = null;
    public final long mEndUptimeMillis = 0L;
    public final boolean mEndTakenBeforeLocks = false;
    public final com.android.internal.os.anr.AnrLatencyTracker mLatencyTracker = null;
    public static com.android.internal.os.TimeoutRecord forBroadcastReceiver(android.content.Intent p0, java.lang.String p1, java.lang.String p2) { return null; }
    public static com.android.internal.os.TimeoutRecord forBroadcastReceiver(android.content.Intent p0) { return null; }
    public static com.android.internal.os.TimeoutRecord forBroadcastReceiver(android.content.Intent p0, long p1) { return null; }
    public static com.android.internal.os.TimeoutRecord forInputDispatchNoFocusedWindow(java.lang.String p0) { return null; }
    public static com.android.internal.os.TimeoutRecord forInputDispatchWindowUnresponsive(java.lang.String p0) { return null; }
    public static com.android.internal.os.TimeoutRecord forServiceExec(java.lang.String p0) { return null; }
    public static com.android.internal.os.TimeoutRecord forServiceStartWithEndTime(java.lang.String p0, long p1) { return null; }
    public static com.android.internal.os.TimeoutRecord forContentProvider(java.lang.String p0) { return null; }
    public static com.android.internal.os.TimeoutRecord forApp(java.lang.String p0) { return null; }
    public static com.android.internal.os.TimeoutRecord forShortFgsTimeout(java.lang.String p0) { return null; }
    public static com.android.internal.os.TimeoutRecord forJobService(java.lang.String p0) { return null; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface TimeoutKind {
        public static final int INPUT_DISPATCH_NO_FOCUSED_WINDOW = 1;
        public static final int INPUT_DISPATCH_WINDOW_UNRESPONSIVE = 2;
        public static final int BROADCAST_RECEIVER = 3;
        public static final int SERVICE_START = 4;
        public static final int SERVICE_EXEC = 5;
        public static final int CONTENT_PROVIDER = 6;
        public static final int APP_REGISTERED = 7;
        public static final int SHORT_FGS_TIMEOUT = 8;
        public static final int JOB_SERVICE = 9;
    }
}
