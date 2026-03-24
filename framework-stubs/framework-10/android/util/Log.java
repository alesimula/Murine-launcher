package android.util;

public final class Log {
    public static final int VERBOSE = 2;
    public static final int DEBUG = 3;
    public static final int INFO = 4;
    public static final int WARN = 5;
    public static final int ERROR = 6;
    public static final int ASSERT = 7;
    private static android.util.Log.TerribleFailureHandler sWtfHandler;
    public static final int LOG_ID_MAIN = 0;
    public static final int LOG_ID_RADIO = 1;
    public static final int LOG_ID_EVENTS = 2;
    public static final int LOG_ID_SYSTEM = 3;
    public static final int LOG_ID_CRASH = 4;
    private Log() {}
    public static int v(java.lang.String p0, java.lang.String p1) { return 0; }
    public static int v(java.lang.String p0, java.lang.String p1, java.lang.Throwable p2) { return 0; }
    public static int d(java.lang.String p0, java.lang.String p1) { return 0; }
    public static int d(java.lang.String p0, java.lang.String p1, java.lang.Throwable p2) { return 0; }
    public static int i(java.lang.String p0, java.lang.String p1) { return 0; }
    public static int i(java.lang.String p0, java.lang.String p1, java.lang.Throwable p2) { return 0; }
    public static int w(java.lang.String p0, java.lang.String p1) { return 0; }
    public static int w(java.lang.String p0, java.lang.String p1, java.lang.Throwable p2) { return 0; }
    public static native boolean isLoggable(java.lang.String p0, int p1);
    public static int w(java.lang.String p0, java.lang.Throwable p1) { return 0; }
    public static int e(java.lang.String p0, java.lang.String p1) { return 0; }
    public static int e(java.lang.String p0, java.lang.String p1, java.lang.Throwable p2) { return 0; }
    public static int wtf(java.lang.String p0, java.lang.String p1) { return 0; }
    public static int wtfStack(java.lang.String p0, java.lang.String p1) { return 0; }
    public static int wtf(java.lang.String p0, java.lang.Throwable p1) { return 0; }
    public static int wtf(java.lang.String p0, java.lang.String p1, java.lang.Throwable p2) { return 0; }
    @android.annotation.UnsupportedAppUsage
    static int wtf(int p0, java.lang.String p1, java.lang.String p2, java.lang.Throwable p3, boolean p4, boolean p5) { return 0; }
    static void wtfQuiet(int p0, java.lang.String p1, java.lang.String p2, boolean p3) {}
    public static android.util.Log.TerribleFailureHandler setWtfHandler(android.util.Log.TerribleFailureHandler p0) { return null; }
    public static java.lang.String getStackTraceString(java.lang.Throwable p0) { return null; }
    public static int println(int p0, java.lang.String p1, java.lang.String p2) { return 0; }
    @android.annotation.UnsupportedAppUsage
    public static native int println_native(int p0, int p1, java.lang.String p2, java.lang.String p3);
    private static native int logger_entry_max_payload_native();
    public static int printlns(int p0, int p1, java.lang.String p2, java.lang.String p3, java.lang.Throwable p4) { return 0; }

    public static interface TerribleFailureHandler {
        public void onTerribleFailure(java.lang.String p0, android.util.Log.TerribleFailure p1, boolean p2);
    }

    public static class TerribleFailure extends java.lang.Exception {
        TerribleFailure(java.lang.String p0, java.lang.Throwable p1) { super(); }
    }

    static class PreloadHolder {
        public static final int LOGGER_ENTRY_MAX_PAYLOAD = Integer.valueOf(0);
        PreloadHolder() {}
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Level {
    }

    private static class ImmediateLogWriter extends java.io.Writer {
        private int bufID;
        private int priority;
        private java.lang.String tag;
        private int written;
        public ImmediateLogWriter(int p0, int p1, java.lang.String p2) { super(); }
        public int getWritten() { return 0; }
        public void write(char[] p0, int p1, int p2) {}
        public void flush() {}
        public void close() {}
    }
}
