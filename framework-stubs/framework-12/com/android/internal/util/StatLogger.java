package com.android.internal.util;

public class StatLogger {
    private static final java.lang.String TAG = "StatLogger";
    private final java.lang.Object mLock = null;
    private final int SIZE = 0;
    private final int[] mCountStats = null;
    private final long[] mDurationStats = null;
    private final int[] mCallsPerSecond = null;
    private final long[] mDurationPerSecond = null;
    private final int[] mMaxCallsPerSecond = null;
    private final long[] mMaxDurationPerSecond = null;
    private final long[] mMaxDurationStats = null;
    private long mNextTickTime;
    private final java.lang.String[] mLabels = null;
    private final java.lang.String mStatsTag = null;
    public StatLogger(java.lang.String[] p0) {}
    public StatLogger(java.lang.String p0, java.lang.String[] p1) {}
    public long getTime() { return 0L; }
    public long logDurationStat(int p0, long p1) { return 0L; }
    public void dump(java.io.PrintWriter p0, java.lang.String p1) {}
    public void dump(android.util.IndentingPrintWriter p0) {}
    public void dumpProto(android.util.proto.ProtoOutputStream p0, long p1) {}
}
