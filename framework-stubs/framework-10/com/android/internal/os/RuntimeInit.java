package com.android.internal.os;

public class RuntimeInit {
    static final java.lang.String TAG = "AndroidRuntime";
    static final boolean DEBUG = false;
    @android.annotation.UnsupportedAppUsage
    private static boolean initialized;
    @android.annotation.UnsupportedAppUsage
    private static android.os.IBinder mApplicationObject;
    private static volatile boolean mCrashing;
    public RuntimeInit() {}
    private static final native void nativeFinishInit();
    private static final native void nativeSetExitWithoutCleanup(boolean p0);
    private static int Clog_e(java.lang.String p0, java.lang.String p1, java.lang.Throwable p2) { return 0; }
    @android.annotation.UnsupportedAppUsage
    protected static final void commonInit() {}
    private static java.lang.String getDefaultUserAgent() { return null; }
    protected static java.lang.Runnable findStaticMain(java.lang.String p0, java.lang.String[] p1, java.lang.ClassLoader p2) { return null; }
    @android.annotation.UnsupportedAppUsage
    public static final void main(java.lang.String[] p0) {}
    protected static java.lang.Runnable applicationInit(int p0, java.lang.String[] p1, java.lang.ClassLoader p2) { return null; }
    public static void redirectLogStreams() {}
    public static void wtf(java.lang.String p0, java.lang.Throwable p1, boolean p2) {}
    public static final void setApplicationObject(android.os.IBinder p0) {}
    @android.annotation.UnsupportedAppUsage
    public static final android.os.IBinder getApplicationObject() { return null; }
    static final void enableDdms() {}

    static class MethodAndArgsCaller implements java.lang.Runnable {
        private final java.lang.reflect.Method mMethod = null;
        private final java.lang.String[] mArgs = null;
        public MethodAndArgsCaller(java.lang.reflect.Method p0, java.lang.String[] p1) {}
        public void run() {}
    }

    private static class LoggingHandler implements java.lang.Thread.UncaughtExceptionHandler {
        public volatile boolean mTriggered;
        private LoggingHandler() {}
        public void uncaughtException(java.lang.Thread p0, java.lang.Throwable p1) {}
    }

    private static class KillApplicationHandler implements java.lang.Thread.UncaughtExceptionHandler {
        private final com.android.internal.os.RuntimeInit.LoggingHandler mLoggingHandler = null;
        public KillApplicationHandler(com.android.internal.os.RuntimeInit.LoggingHandler p0) {}
        public void uncaughtException(java.lang.Thread p0, java.lang.Throwable p1) {}
        private void ensureLogging(java.lang.Thread p0, java.lang.Throwable p1) {}
    }

    static class Arguments {
        java.lang.String startClass;
        java.lang.String[] startArgs;
        Arguments(java.lang.String[] p0) throws java.lang.IllegalArgumentException {}
        private void parseArgs(java.lang.String[] p0) throws java.lang.IllegalArgumentException {}
    }
}
