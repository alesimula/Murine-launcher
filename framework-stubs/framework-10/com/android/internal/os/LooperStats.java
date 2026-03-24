package com.android.internal.os;

public class LooperStats implements android.os.Looper.Observer {
    public static final java.lang.String DEBUG_ENTRY_PREFIX = "__DEBUG_";
    private static final int SESSION_POOL_SIZE = 50;
    private static final boolean DISABLED_SCREEN_STATE_TRACKING_VALUE = false;
    private final android.util.SparseArray<com.android.internal.os.LooperStats.Entry> mEntries = null;
    private final java.lang.Object mLock = null;
    private final com.android.internal.os.LooperStats.Entry mOverflowEntry = null;
    private final com.android.internal.os.LooperStats.Entry mHashCollisionEntry = null;
    private final java.util.concurrent.ConcurrentLinkedQueue<com.android.internal.os.LooperStats.DispatchSession> mSessionPool = null;
    private final int mEntriesSizeCap = 0;
    private int mSamplingInterval;
    private com.android.internal.os.CachedDeviceState.Readonly mDeviceState;
    private com.android.internal.os.CachedDeviceState.TimeInStateStopwatch mBatteryStopwatch;
    private long mStartCurrentTime;
    private long mStartElapsedTime;
    private boolean mAddDebugEntries;
    private boolean mTrackScreenInteractive;
    public LooperStats(int p0, int p1) {}
    public void setDeviceState(com.android.internal.os.CachedDeviceState.Readonly p0) {}
    public void setAddDebugEntries(boolean p0) {}
    public java.lang.Object messageDispatchStarting() { return null; }
    public void messageDispatched(java.lang.Object p0, android.os.Message p1) {}
    public void dispatchingThrewException(java.lang.Object p0, android.os.Message p1, java.lang.Exception p2) {}
    private boolean deviceStateAllowsCollection() { return false; }
    public java.util.List<com.android.internal.os.LooperStats.ExportedEntry> getEntries() { return null; }
    private com.android.internal.os.LooperStats.ExportedEntry createDebugEntry(java.lang.String p0, long p1) { return null; }
    public long getStartTimeMillis() { return 0L; }
    public long getStartElapsedTimeMillis() { return 0L; }
    public long getBatteryTimeMillis() { return 0L; }
    private void maybeAddSpecialEntry(java.util.List<com.android.internal.os.LooperStats.ExportedEntry> p0, com.android.internal.os.LooperStats.Entry p1) {}
    public void reset() {}
    public void setSamplingInterval(int p0) {}
    public void setTrackScreenInteractive(boolean p0) {}
    private com.android.internal.os.LooperStats.Entry findEntry(android.os.Message p0, boolean p1) { return null; }
    private void recycleSession(com.android.internal.os.LooperStats.DispatchSession p0) {}
    protected long getThreadTimeMicro() { return 0L; }
    protected long getElapsedRealtimeMicro() { return 0L; }
    protected long getSystemUptimeMillis() { return 0L; }
    protected boolean shouldCollectDetailedData() { return false; }

    public static class ExportedEntry {
        public final int workSourceUid = 0;
        public final java.lang.String handlerClassName = null;
        public final java.lang.String threadName = null;
        public final java.lang.String messageName = null;
        public final boolean isInteractive = false;
        public final long messageCount = 0L;
        public final long recordedMessageCount = 0L;
        public final long exceptionCount = 0L;
        public final long totalLatencyMicros = 0L;
        public final long maxLatencyMicros = 0L;
        public final long cpuUsageMicros = 0L;
        public final long maxCpuUsageMicros = 0L;
        public final long maxDelayMillis = 0L;
        public final long delayMillis = 0L;
        public final long recordedDelayMessageCount = 0L;
        ExportedEntry(com.android.internal.os.LooperStats.Entry p0) {}
    }

    private static class Entry {
        public final int workSourceUid = 0;
        public final android.os.Handler handler = null;
        public final java.lang.String messageName = null;
        public final boolean isInteractive = false;
        public long messageCount;
        public long recordedMessageCount;
        public long exceptionCount;
        public long totalLatencyMicro;
        public long maxLatencyMicro;
        public long cpuUsageMicro;
        public long maxCpuUsageMicro;
        public long recordedDelayMessageCount;
        public long delayMillis;
        public long maxDelayMillis;
        Entry(android.os.Message p0, boolean p1) {}
        Entry(java.lang.String p0) {}
        void reset() {}
        static int idFor(android.os.Message p0, boolean p1) { return 0; }
    }

    private static class DispatchSession {
        static final com.android.internal.os.LooperStats.DispatchSession NOT_SAMPLED = null;
        public long startTimeMicro;
        public long cpuStartMicro;
        public long systemUptimeMillis;
        private DispatchSession() {}
    }
}
