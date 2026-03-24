package android.util;

public class TimingsTraceLog {
    private static final boolean DEBUG_BOOT_TIME = Boolean.valueOf(false);
    private final java.util.Deque<android.util.Pair<java.lang.String, java.lang.Long>> mStartTimes = null;
    private final java.lang.String mTag = null;
    private long mTraceTag;
    private long mThreadId;
    public TimingsTraceLog(java.lang.String p0, long p1) {}
    public void traceBegin(java.lang.String p0) {}
    public void traceEnd() {}
    private void assertSameThread() {}
    public void logDuration(java.lang.String p0, long p1) {}
}
