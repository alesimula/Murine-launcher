package com.android.internal.os;

public class BinderCallsStats implements com.android.internal.os.BinderInternal.Observer {
    public static final boolean ENABLED_DEFAULT = true;
    public static final boolean DETAILED_TRACKING_DEFAULT = true;
    public static final int PERIODIC_SAMPLING_INTERVAL_DEFAULT = 1000;
    public static final boolean DEFAULT_TRACK_SCREEN_INTERACTIVE = false;
    public static final boolean DEFAULT_TRACK_DIRECT_CALLING_UID = true;
    public static final int MAX_BINDER_CALL_STATS_COUNT_DEFAULT = 1500;
    private static final java.lang.String DEBUG_ENTRY_PREFIX = "__DEBUG_";
    private static final java.lang.String TAG = "BinderCallsStats";
    private static final int CALL_SESSIONS_POOL_SIZE = 100;
    private static final int MAX_EXCEPTION_COUNT_SIZE = 50;
    private static final java.lang.String EXCEPTION_COUNT_OVERFLOW_NAME = "overflow";
    private static final java.lang.Class<? extends android.os.Binder> OVERFLOW_BINDER = null;
    private static final boolean OVERFLOW_SCREEN_INTERACTIVE = false;
    private static final int OVERFLOW_DIRECT_CALLING_UID = -1;
    private static final int OVERFLOW_TRANSACTION_CODE = -1;
    private boolean mDetailedTracking;
    private int mPeriodicSamplingInterval;
    private int mMaxBinderCallStatsCount;
    private final android.util.SparseArray<com.android.internal.os.BinderCallsStats.UidEntry> mUidEntries = null;
    private final android.util.ArrayMap<java.lang.String, java.lang.Integer> mExceptionCounts = null;
    private final java.util.Queue<com.android.internal.os.BinderInternal.CallSession> mCallSessionsPool = null;
    private final java.lang.Object mLock = null;
    private final java.util.Random mRandom = null;
    private long mStartCurrentTime;
    private long mStartElapsedTime;
    private long mCallStatsCount;
    private boolean mAddDebugEntries;
    private boolean mTrackDirectCallingUid;
    private boolean mTrackScreenInteractive;
    private com.android.internal.os.CachedDeviceState.Readonly mDeviceState;
    private com.android.internal.os.CachedDeviceState.TimeInStateStopwatch mBatteryStopwatch;
    public BinderCallsStats(com.android.internal.os.BinderCallsStats.Injector p0) {}
    public void setDeviceState(com.android.internal.os.CachedDeviceState.Readonly p0) {}
    public com.android.internal.os.BinderInternal.CallSession callStarted(android.os.Binder p0, int p1, int p2) { return null; }
    private com.android.internal.os.BinderInternal.CallSession obtainCallSession() { return null; }
    public void callEnded(com.android.internal.os.BinderInternal.CallSession p0, int p1, int p2, int p3) {}
    private void processCallEnded(com.android.internal.os.BinderInternal.CallSession p0, int p1, int p2, int p3) {}
    private com.android.internal.os.BinderCallsStats.UidEntry getUidEntry(int p0) { return null; }
    public void callThrewException(com.android.internal.os.BinderInternal.CallSession p0, java.lang.Exception p1) {}
    private java.lang.reflect.Method getDefaultTransactionNameMethod(java.lang.Class<? extends android.os.Binder> p0) { return null; }
    private java.lang.String resolveTransactionCode(java.lang.reflect.Method p0, int p1) { return null; }
    public java.util.ArrayList<com.android.internal.os.BinderCallsStats.ExportedCallStat> getExportedCallStats() { return null; }
    private com.android.internal.os.BinderCallsStats.ExportedCallStat createDebugEntry(java.lang.String p0, long p1) { return null; }
    public android.util.ArrayMap<java.lang.String, java.lang.Integer> getExportedExceptionStats() { return null; }
    public void dump(java.io.PrintWriter p0, com.android.internal.os.AppIdToPackageMap p1, boolean p2) {}
    private void dumpLocked(java.io.PrintWriter p0, com.android.internal.os.AppIdToPackageMap p1, boolean p2) {}
    protected long getThreadTimeMicro() { return 0L; }
    protected int getCallingUid() { return 0; }
    protected long getElapsedRealtimeMicro() { return 0L; }
    protected boolean shouldRecordDetailedData() { return false; }
    public void setDetailedTracking(boolean p0) {}
    public void setTrackScreenInteractive(boolean p0) {}
    public void setTrackDirectCallerUid(boolean p0) {}
    public void setAddDebugEntries(boolean p0) {}
    public void setMaxBinderCallStats(int p0) {}
    public void setSamplingInterval(int p0) {}
    public void reset() {}
    public android.util.SparseArray<com.android.internal.os.BinderCallsStats.UidEntry> getUidEntries() { return null; }
    public android.util.ArrayMap<java.lang.String, java.lang.Integer> getExceptionCounts() { return null; }
    public static <T extends java.lang.Object> java.util.List<T> getHighestValues(java.util.List<T> p0, java.util.function.ToDoubleFunction<T> p1, double p2) { return null; }
    private static int compareByCpuDesc(com.android.internal.os.BinderCallsStats.ExportedCallStat p0, com.android.internal.os.BinderCallsStats.ExportedCallStat p1) { return 0; }
    private static int compareByBinderClassAndCode(com.android.internal.os.BinderCallsStats.ExportedCallStat p0, com.android.internal.os.BinderCallsStats.ExportedCallStat p1) { return 0; }

    public static class CallStat {
        public final int callingUid = 0;
        public final java.lang.Class<? extends android.os.Binder> binderClass = null;
        public final int transactionCode = 0;
        public final boolean screenInteractive = false;
        public long recordedCallCount;
        public long callCount;
        public long cpuTimeMicros;
        public long maxCpuTimeMicros;
        public long latencyMicros;
        public long maxLatencyMicros;
        public long maxRequestSizeBytes;
        public long maxReplySizeBytes;
        public long exceptionCount;
        CallStat(int p0, java.lang.Class<? extends android.os.Binder> p1, int p2, boolean p3) {}
    }

    public static class CallStatKey {
        public int callingUid;
        public java.lang.Class<? extends android.os.Binder> binderClass;
        public int transactionCode;
        private boolean screenInteractive;
        public CallStatKey() {}
        public boolean equals(java.lang.Object p0) { return false; }
        public int hashCode() { return 0; }
    }

    public static class ExportedCallStat {
        public int callingUid;
        public int workSourceUid;
        public java.lang.String className;
        public java.lang.String methodName;
        public boolean screenInteractive;
        public long cpuTimeMicros;
        public long maxCpuTimeMicros;
        public long latencyMicros;
        public long maxLatencyMicros;
        public long callCount;
        public long recordedCallCount;
        public long maxRequestSizeBytes;
        public long maxReplySizeBytes;
        public long exceptionCount;
        java.lang.Class<? extends android.os.Binder> binderClass;
        int transactionCode;
        public ExportedCallStat() {}
    }

    public static class Injector {
        public Injector() {}
        public java.util.Random getRandomGenerator() { return null; }
    }

    private static class OverflowBinder extends android.os.Binder {
        private OverflowBinder() { super(); }
    }

    public static class UidEntry {
        public int workSourceUid;
        public long recordedCallCount;
        public long callCount;
        public long cpuTimeMicros;
        private java.util.Map<com.android.internal.os.BinderCallsStats.CallStatKey, com.android.internal.os.BinderCallsStats.CallStat> mCallStats;
        private com.android.internal.os.BinderCallsStats.CallStatKey mTempKey;
        UidEntry(int p0) {}
        com.android.internal.os.BinderCallsStats.CallStat get(int p0, java.lang.Class<? extends android.os.Binder> p1, int p2, boolean p3) { return null; }
        com.android.internal.os.BinderCallsStats.CallStat getOrCreate(int p0, java.lang.Class<? extends android.os.Binder> p1, int p2, boolean p3, boolean p4) { return null; }
        public java.util.Collection<com.android.internal.os.BinderCallsStats.CallStat> getCallStatsList() { return null; }
        public java.lang.String toString() { return null; }
        public boolean equals(java.lang.Object p0) { return false; }
        public int hashCode() { return 0; }
    }
}
