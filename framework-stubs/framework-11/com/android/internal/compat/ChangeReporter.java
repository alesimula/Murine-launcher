package com.android.internal.compat;

public final class ChangeReporter {
    private static final java.lang.String TAG = "CompatibilityChangeReporter";
    private int mSource;
    private final java.util.Map<java.lang.Integer, java.util.Set<com.android.internal.compat.ChangeReporter.ChangeReport>> mReportedChanges = null;
    private boolean mDebugLogAll;
    public static final int STATE_UNKNOWN_STATE = 0;
    public static final int STATE_ENABLED = 1;
    public static final int STATE_DISABLED = 2;
    public static final int STATE_LOGGED = 3;
    public static final int SOURCE_UNKNOWN_SOURCE = 0;
    public static final int SOURCE_APP_PROCESS = 1;
    public static final int SOURCE_SYSTEM_SERVER = 2;
    public ChangeReporter(int p0) {}
    public void reportChange(int p0, long p1, int p2) {}
    public void startDebugLogAll() {}
    public void stopDebugLogAll() {}
    public boolean shouldWriteToStatsLog(int p0, long p1, int p2) { return false; }
    public boolean shouldWriteToDebug(int p0, long p1, int p2) { return false; }
    private boolean isAlreadyReported(int p0, com.android.internal.compat.ChangeReporter.ChangeReport p1) { return false; }
    private void markAsReported(int p0, com.android.internal.compat.ChangeReporter.ChangeReport p1) {}
    public void resetReportedChanges(int p0) {}
    private void debugLog(int p0, long p1, int p2) {}
    private static java.lang.String stateToString(int p0) { return null; }

    private static final class ChangeReport {
        long mChangeId;
        int mState;
        ChangeReport(long p0, int p1) {}
        public boolean equals(java.lang.Object p0) { return false; }
        public int hashCode() { return 0; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Source {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface State {
    }
}
