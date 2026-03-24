package android.window;

public class SystemPerformanceHinter {
    public static final int HINT_SF_EARLY_WAKEUP = 1;
    public static final int HINT_SF_FRAME_RATE = 2;
    public static final int HINT_ADPF = 4;
    public static final int HINT_SF = 3;
    public static final int HINT_ALL = 7;
    public long mTraceTag;
    public SystemPerformanceHinter(android.content.Context p0, android.window.SystemPerformanceHinter.DisplayRootProvider p1) {}
    public SystemPerformanceHinter(android.content.Context p0, android.window.SystemPerformanceHinter.DisplayRootProvider p1, java.util.function.Supplier<android.view.SurfaceControl.Transaction> p2) {}
    public void setAdpfSession(android.os.PerformanceHintManager.Session p0) {}
    public android.window.SystemPerformanceHinter.HighPerfSession createSession(int p0, int p1, java.lang.String p2) { return null; }
    public android.window.SystemPerformanceHinter.HighPerfSession startSession(int p0, int p1, java.lang.String p2) { return null; }
    public void dump(java.io.PrintWriter p0, java.lang.String p1) {}

    public static interface DisplayRootProvider {
        @android.annotation.Nullable
        public android.view.SurfaceControl getRootForDisplay(int p0);
    }

    public class HighPerfSession implements java.lang.AutoCloseable {
        protected HighPerfSession(android.window.SystemPerformanceHinter p0, int p1, int p2, java.lang.String p3) {}
        public void start() {}
        public void close() {}
        public void finalize() {}
        boolean asyncTraceBegin() { return false; }
        boolean asyncTraceEnd() { return false; }
    }

    private static @interface HintFlags {
    }

    private class NoOpHighPerfSession extends android.window.SystemPerformanceHinter.HighPerfSession {
        public NoOpHighPerfSession(android.window.SystemPerformanceHinter p0) { super(null, 0, 0, null); }
        public void start() {}
        public void close() {}
    }
}
