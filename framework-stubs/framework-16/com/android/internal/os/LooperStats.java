package com.android.internal.os;

public class LooperStats implements android.os.Looper.Observer {
    public static final java.lang.String DEBUG_ENTRY_PREFIX = "__DEBUG_";
    public static final boolean DEFAULT_IGNORE_BATTERY_STATUS = false;
    public LooperStats(int p0, int p1) {}
    public void setDeviceState(com.android.internal.os.CachedDeviceState.Readonly p0) {}
    public void setAddDebugEntries(boolean p0) {}
    public java.lang.Object messageDispatchStarting() { return null; }
    public void messageDispatched(java.lang.Object p0, android.os.Message p1) {}
    public void dispatchingThrewException(java.lang.Object p0, android.os.Message p1, java.lang.Exception p2) {}
    public java.util.List<com.android.internal.os.LooperStats.ExportedEntry> getEntries() { return null; }
    public long getStartTimeMillis() { return 0L; }
    public long getStartElapsedTimeMillis() { return 0L; }
    public long getBatteryTimeMillis() { return 0L; }
    public void reset() {}
    public void setSamplingInterval(int p0) {}
    public void setTrackScreenInteractive(boolean p0) {}
    public void setIgnoreBatteryStatus(boolean p0) {}
    protected long getThreadTimeMicro() { return 0L; }
    protected long getElapsedRealtimeMicro() { return 0L; }
    protected long getSystemUptimeMillis() { return 0L; }
    protected boolean shouldCollectDetailedData() { return false; }

    private static class DispatchSession {
        static final com.android.internal.os.LooperStats.DispatchSession NOT_SAMPLED = null;
        public long startTimeMicro;
        public long cpuStartMicro;
        public long systemUptimeMillis;
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
}
