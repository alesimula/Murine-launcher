package com.android.internal.os;

public class BinderInternal {
    static java.lang.ref.WeakReference<com.android.internal.os.BinderInternal.GcWatcher> sGcWatcher;
    static java.util.ArrayList<java.lang.Runnable> sGcWatchers;
    static java.lang.Runnable[] sTmpWatchers;
    static long sLastGcTime;
    static final com.android.internal.os.BinderInternal.BinderProxyCountEventListenerDelegate sBinderProxyCountEventListenerDelegate = null;
    public BinderInternal() {}
    public static void addGcWatcher(java.lang.Runnable p0) {}
    public static final native void joinThreadPool();
    public static long getLastGcTime() { return 0L; }
    public static final native android.os.IBinder getContextObject();
    public static final native void disableBackgroundScheduling(boolean p0);
    public static final native void setMaxThreads(int p0);
    static final native void handleGc();
    public static void forceGc(java.lang.String p0) {}
    static void forceBinderGc() {}
    public static final native void nSetBinderProxyCountEnabled(boolean p0);
    public static final native android.util.SparseIntArray nGetBinderProxyPerUidCounts();
    public static final native int nGetBinderProxyCount(int p0);
    public static final native void nSetBinderProxyCountWatermarks(int p0, int p1, int p2);
    public static void binderProxyLimitCallbackFromNative(int p0) {}
    public static void binderProxyWarningCallbackFromNative(int p0) {}
    public static void setBinderProxyCountCallback(com.android.internal.os.BinderInternal.BinderProxyCountEventListener p0, android.os.Handler p1) {}
    public static void clearBinderProxyCountCallback() {}

    public static interface BinderProxyCountEventListener {
        public void onLimitReached(int p0);
        default public void onWarningThresholdReached(int p0) {}
    }

    private static class BinderProxyCountEventListenerDelegate {
        void setListener(com.android.internal.os.BinderInternal.BinderProxyCountEventListener p0, android.os.Handler p1) {}
        void notifyLimitReached(int p0) {}
        void notifyWarningReached(int p0) {}
    }

    public static class CallSession {
        public java.lang.Class<? extends android.os.Binder> binderClass;
        public int transactionCode;
        long cpuTimeStarted;
        long timeStarted;
        boolean exceptionThrown;
        public boolean recordedCall;
        public CallSession() {}
    }

    public static interface CallStatsObserver {
        public void noteCallStats(int p0, long p1, java.util.Collection<com.android.internal.os.BinderCallsStats.CallStat> p2);
        public void noteBinderThreadNativeIds(int[] p0);
    }

    static final class GcWatcher {
        GcWatcher() {}
        protected void finalize() throws java.lang.Throwable {}
    }

    public static interface Observer {
        public com.android.internal.os.BinderInternal.CallSession callStarted(android.os.Binder p0, int p1, int p2);
        public void callEnded(com.android.internal.os.BinderInternal.CallSession p0, int p1, int p2, int p3);
        public void callThrewException(com.android.internal.os.BinderInternal.CallSession p0, java.lang.Exception p1);
    }

    @java.lang.FunctionalInterface
    public static interface WorkSourceProvider {
        public int resolveWorkSourceUid(int p0);
    }
}
