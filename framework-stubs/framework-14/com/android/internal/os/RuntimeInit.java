package com.android.internal.os;

public class RuntimeInit {
    static final java.lang.String TAG = "AndroidRuntime";
    static final boolean DEBUG = false;
    public RuntimeInit() {}
    public static void logUncaught(java.lang.String p0, java.lang.String p1, int p2, java.lang.Throwable p3) {}
    public static void preForkInit() {}
    protected static final void commonInit() {}
    protected static java.lang.Runnable findStaticMain(java.lang.String p0, java.lang.String[] p1, java.lang.ClassLoader p2) { return null; }
    public static final void main(java.lang.String[] p0) {}
    protected static java.lang.Runnable applicationInit(int p0, long[] p1, java.lang.String[] p2, java.lang.ClassLoader p3) { return null; }
    public static void redirectLogStreams() {}
    public static void wtf(java.lang.String p0, java.lang.Throwable p1, boolean p2) {}
    public static void setDefaultApplicationWtfHandler(com.android.internal.os.RuntimeInit.ApplicationWtfHandler p0) {}
    public static final void setApplicationObject(android.os.IBinder p0) {}
    public static final android.os.IBinder getApplicationObject() { return null; }

    public static interface ApplicationWtfHandler {
        public boolean handleApplicationWtf(android.os.IBinder p0, java.lang.String p1, boolean p2, android.app.ApplicationErrorReport.ParcelableCrashInfo p3, int p4);
    }

    static class Arguments {
        java.lang.String startClass;
        java.lang.String[] startArgs;
        Arguments(java.lang.String[] p0) throws java.lang.IllegalArgumentException {}
    }

    private static class KillApplicationHandler implements java.lang.Thread.UncaughtExceptionHandler {
        public KillApplicationHandler(com.android.internal.os.RuntimeInit.LoggingHandler p0) {}
        public void uncaughtException(java.lang.Thread p0, java.lang.Throwable p1) {}
    }

    private static class LoggingHandler implements java.lang.Thread.UncaughtExceptionHandler {
        public volatile boolean mTriggered;
        public void uncaughtException(java.lang.Thread p0, java.lang.Throwable p1) {}
    }

    static class MethodAndArgsCaller implements java.lang.Runnable {
        public MethodAndArgsCaller(java.lang.reflect.Method p0, java.lang.String[] p1) {}
        public void run() {}
    }
}
