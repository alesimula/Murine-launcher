package android.os;

public final class PerfettoTrace {
    public static final android.os.PerfettoTrace.Category MQ_CATEGORY = null;
    public PerfettoTrace() {}
    public static android.os.PerfettoTrackEventExtra.Builder instant(android.os.PerfettoTrace.Category p0, java.lang.String p1) { return null; }
    public static android.os.PerfettoTrackEventExtra.Builder begin(android.os.PerfettoTrace.Category p0, java.lang.String p1) { return null; }
    public static android.os.PerfettoTrackEventExtra.Builder end(android.os.PerfettoTrace.Category p0) { return null; }
    public static android.os.PerfettoTrackEventExtra.Builder counter(android.os.PerfettoTrace.Category p0, long p1) { return null; }
    public static android.os.PerfettoTrackEventExtra.Builder counter(android.os.PerfettoTrace.Category p0, long p1, java.lang.String p2) { return null; }
    public static android.os.PerfettoTrackEventExtra.Builder counter(android.os.PerfettoTrace.Category p0, double p1) { return null; }
    public static android.os.PerfettoTrackEventExtra.Builder counter(android.os.PerfettoTrace.Category p0, double p1, java.lang.String p2) { return null; }
    public static int getFlowId() { return 0; }
    public static long getGlobalTrackUuid() { return 0L; }
    public static long getProcessTrackUuid() { return 0L; }
    public static long getThreadTrackUuid(long p0) { return 0L; }
    public static void activateTrigger(java.lang.String p0, int p1) {}
    public static void register(boolean p0) {}
    public static void registerCategories() {}

    public static final class Category implements android.os.PerfettoTrackEventExtra.PerfettoPointer {
        public Category(java.lang.String p0) {}
        public Category(java.lang.String p0, java.lang.String p1) {}
        public Category(java.lang.String p0, java.lang.String p1, java.lang.String p2) {}
        public android.os.PerfettoTrace.Category register() { return null; }
        public android.os.PerfettoTrace.Category unregister() { return null; }
        public boolean isEnabled() { return false; }
        public boolean isEnabled$ravenwood() { return false; }
        public boolean isRegistered() { return false; }
        public long getPtr() { return 0L; }
    }

    public static final class Session {
        public Session(boolean p0, byte[] p1) {}
        public byte[] close() { return null; }
    }
}
