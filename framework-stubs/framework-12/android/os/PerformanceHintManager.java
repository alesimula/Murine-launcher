package android.os;

public final class PerformanceHintManager {
    private final long mNativeManagerPtr = 0L;
    public static android.os.PerformanceHintManager create() throws android.os.ServiceManager.ServiceNotFoundException { return null; }
    private PerformanceHintManager(long p0) {}
    public android.os.PerformanceHintManager.Session createHintSession(int[] p0, long p1) { return null; }
    public long getPreferredUpdateRateNanos() { return 0L; }
    private static native long nativeAcquireManager();
    private static native long nativeGetPreferredUpdateRateNanos(long p0);
    private static native long nativeCreateSession(long p0, int[] p1, long p2);
    private static native void nativeUpdateTargetWorkDuration(long p0, long p1);
    private static native void nativeReportActualWorkDuration(long p0, long p1);
    private static native void nativeCloseSession(long p0);

    public static class Session implements java.io.Closeable {
        private long mNativeSessionPtr;
        public Session(long p0) {}
        protected void finalize() throws java.lang.Throwable {}
        public void updateTargetWorkDuration(long p0) {}
        public void reportActualWorkDuration(long p0) {}
        public void close() {}
    }
}
