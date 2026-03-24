package android.os;

public final class Looper {
    private static final java.lang.String TAG = "Looper";
    static final java.lang.ThreadLocal<android.os.Looper> sThreadLocal = null;
    private static android.os.Looper sMainLooper;
    private static android.os.Looper.Observer sObserver;
    final android.os.MessageQueue mQueue = null;
    final java.lang.Thread mThread = null;
    private boolean mInLoop;
    private android.util.Printer mLogging;
    private long mTraceTag;
    private long mSlowDispatchThresholdMs;
    private long mSlowDeliveryThresholdMs;
    private boolean mSlowDeliveryDetected;
    public static void prepare() {}
    private static void prepare(boolean p0) {}
    @java.lang.Deprecated
    public static void prepareMainLooper() {}
    public static android.os.Looper getMainLooper() { return null; }
    public static void setObserver(android.os.Looper.Observer p0) {}
    private static boolean loopOnce(android.os.Looper p0, long p1, int p2) { return false; }
    public static void loop() {}
    private static boolean showSlowLog(long p0, long p1, long p2, java.lang.String p3, android.os.Message p4) { return false; }
    public static android.os.Looper myLooper() { return null; }
    public static android.os.MessageQueue myQueue() { return null; }
    private Looper(boolean p0) {}
    public boolean isCurrentThread() { return false; }
    public void setMessageLogging(android.util.Printer p0) {}
    public void setTraceTag(long p0) {}
    public void setSlowLogThresholdMs(long p0, long p1) {}
    public void quit() {}
    public void quitSafely() {}
    public java.lang.Thread getThread() { return null; }
    public android.os.MessageQueue getQueue() { return null; }
    public void dump(android.util.Printer p0, java.lang.String p1) {}
    public void dump(android.util.Printer p0, java.lang.String p1, android.os.Handler p2) {}
    public void dumpDebug(android.util.proto.ProtoOutputStream p0, long p1) {}
    public java.lang.String toString() { return null; }

    public static interface Observer {
        public java.lang.Object messageDispatchStarting();
        public void messageDispatched(java.lang.Object p0, android.os.Message p1);
        public void dispatchingThrewException(java.lang.Object p0, android.os.Message p1, java.lang.Exception p2);
    }
}
