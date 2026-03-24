package android.os;

public final class PerformanceHintManager {
    public static android.os.PerformanceHintManager create() throws android.os.ServiceManager.ServiceNotFoundException { return null; }
    public android.os.PerformanceHintManager.Session createHintSession(int[] p0, long p1) { return null; }
    public long getPreferredUpdateRateNanos() { return 0L; }

    public static class Session implements java.io.Closeable {
        public static final int CPU_LOAD_UP = 0;
        public static final int CPU_LOAD_DOWN = 1;
        public static final int CPU_LOAD_RESET = 2;
        public static final int CPU_LOAD_RESUME = 3;
        public Session(long p0) {}
        protected void finalize() throws java.lang.Throwable {}
        public void updateTargetWorkDuration(long p0) {}
        public void reportActualWorkDuration(long p0) {}
        public void close() {}
        public void sendHint(int p0) {}
        public void setThreads(int[] p0) {}
        public int[] getThreadIds() { return null; }

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public static @interface Hint {
        }
    }
}
