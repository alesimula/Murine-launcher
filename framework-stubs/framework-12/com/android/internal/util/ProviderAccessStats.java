package com.android.internal.util;

public class ProviderAccessStats {
    private final java.lang.Object mLock = null;
    private final long mStartUptime = 0L;
    private final android.util.SparseBooleanArray mAllCallingUids = null;
    private final android.util.SparseLongArray mQueryStats = null;
    private final android.util.SparseLongArray mBatchStats = null;
    private final android.util.SparseLongArray mInsertStats = null;
    private final android.util.SparseLongArray mUpdateStats = null;
    private final android.util.SparseLongArray mDeleteStats = null;
    private final android.util.SparseLongArray mInsertInBatchStats = null;
    private final android.util.SparseLongArray mUpdateInBatchStats = null;
    private final android.util.SparseLongArray mDeleteInBatchStats = null;
    private final android.util.SparseLongArray mOperationDurationMillis = null;
    private final java.lang.ThreadLocal<com.android.internal.util.ProviderAccessStats.PerThreadData> mThreadLocal = null;
    public ProviderAccessStats() {}
    private void incrementStats(int p0, android.util.SparseLongArray p1) {}
    private void incrementStats(int p0, boolean p1, android.util.SparseLongArray p2, android.util.SparseLongArray p3) {}
    public final void incrementInsertStats(int p0, boolean p1) {}
    public final void incrementUpdateStats(int p0, boolean p1) {}
    public final void incrementDeleteStats(int p0, boolean p1) {}
    public final void incrementQueryStats(int p0) {}
    public final void incrementBatchStats(int p0) {}
    public void finishOperation(int p0) {}
    public void dump(java.io.PrintWriter p0, java.lang.String p1) {}

    private static class PerThreadData {
        public int nestCount;
        public long startUptimeMillis;
        private PerThreadData() {}
    }
}
