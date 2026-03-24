package com.android.internal.os;

public class BinderInternal {
    private static final java.lang.String TAG = "BinderInternal";
    static java.lang.ref.WeakReference<com.android.internal.os.BinderInternal.GcWatcher> sGcWatcher;
    static java.util.ArrayList<java.lang.Runnable> sGcWatchers;
    static java.lang.Runnable[] sTmpWatchers;
    static long sLastGcTime;
    static final com.android.internal.os.BinderInternal.BinderProxyLimitListenerDelegate sBinderProxyLimitListenerDelegate = null;
    public BinderInternal() {}
    public static void addGcWatcher(java.lang.Runnable p0) {}
    public static final native void joinThreadPool();
    public static long getLastGcTime() { return 0L; }
    @android.annotation.UnsupportedAppUsage
    public static final native android.os.IBinder getContextObject();
    public static final native void disableBackgroundScheduling(boolean p0);
    public static final native void setMaxThreads(int p0);
    @android.annotation.UnsupportedAppUsage
    static final native void handleGc();
    public static void forceGc(java.lang.String p0) {}
    static void forceBinderGc() {}
    public static final native void nSetBinderProxyCountEnabled(boolean p0);
    public static final native android.util.SparseIntArray nGetBinderProxyPerUidCounts();
    public static final native int nGetBinderProxyCount(int p0);
    public static final native void nSetBinderProxyCountWatermarks(int p0, int p1);
    public static void binderProxyLimitCallbackFromNative(int p0) {}
    public static void setBinderProxyCountCallback(com.android.internal.os.BinderInternal.BinderProxyLimitListener p0, android.os.Handler p1) {}
    public static void clearBinderProxyCountCallback() {}

    @java.lang.FunctionalInterface
    public static interface WorkSourceProvider {
        public int resolveWorkSourceUid(int p0);
    }

    public static interface Observer {
        public com.android.internal.os.BinderInternal.CallSession callStarted(android.os.Binder p0, int p1, int p2);
        public void callEnded(com.android.internal.os.BinderInternal.CallSession p0, int p1, int p2, int p3);
        public void callThrewException(com.android.internal.os.BinderInternal.CallSession p0, java.lang.Exception p1);
    }

    static final class GcWatcher {
        GcWatcher() {}
        protected void finalize() throws java.lang.Throwable {}
    }

    public static class CallSession {
        public java.lang.Class<? extends android.os.Binder> binderClass;
        public int transactionCode;
        long cpuTimeStarted;
        long timeStarted;
        boolean exceptionThrown;
        public CallSession() {}
    }

    private static class BinderProxyLimitListenerDelegate {
        private com.android.internal.os.BinderInternal.BinderProxyLimitListener mBinderProxyLimitListener;
        private android.os.Handler mHandler;
        private BinderProxyLimitListenerDelegate() {}
        void setListener(com.android.internal.os.BinderInternal.BinderProxyLimitListener p0, android.os.Handler p1) {}
        void notifyClient(int p0) {}
    }

    public static interface BinderProxyLimitListener {
        public void onLimitReached(int p0);
    }
}
