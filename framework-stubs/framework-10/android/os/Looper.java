package android.os;

public final class Looper {
    private static final java.lang.String TAG = "Looper";
    @android.annotation.UnsupportedAppUsage
    static final java.lang.ThreadLocal<android.os.Looper> sThreadLocal = null;
    @android.annotation.UnsupportedAppUsage
    private static android.os.Looper sMainLooper;
    private static android.os.Looper.Observer sObserver;
    @android.annotation.UnsupportedAppUsage
    final android.os.MessageQueue mQueue = null;
    final java.lang.Thread mThread = null;
    @android.annotation.UnsupportedAppUsage
    private android.util.Printer mLogging;
    private long mTraceTag;
    private long mSlowDispatchThresholdMs;
    private long mSlowDeliveryThresholdMs;
    public static void prepare() {}
    private static void prepare(boolean p0) {}
    public static void prepareMainLooper() {}
    public static android.os.Looper getMainLooper() { return null; }
    public static void setObserver(android.os.Looper.Observer p0) {}
    public static void loop() {}
    private static boolean showSlowLog(long p0, long p1, long p2, java.lang.String p3, android.os.Message p4) { return false; }
    public static android.os.Looper myLooper() { return null; }
    public static android.os.MessageQueue myQueue() { return null; }
    private Looper(boolean p0) {}
    public boolean isCurrentThread() { return false; }
    public void setMessageLogging(android.util.Printer p0) {}
    @android.annotation.UnsupportedAppUsage
    public void setTraceTag(long p0) {}
    public void setSlowLogThresholdMs(long p0, long p1) {}
    public void quit() {}
    public void quitSafely() {}
    public java.lang.Thread getThread() { return null; }
    public android.os.MessageQueue getQueue() { return null; }
    public void dump(android.util.Printer p0, java.lang.String p1) {}
    public void dump(android.util.Printer p0, java.lang.String p1, android.os.Handler p2) {}
    public void writeToProto(android.util.proto.ProtoOutputStream p0, long p1) {}
    public java.lang.String toString() { return null; }

    public static interface Observer {
        public java.lang.Object messageDispatchStarting();
        public void messageDispatched(java.lang.Object p0, android.os.Message p1);
        public void dispatchingThrewException(java.lang.Object p0, android.os.Message p1, java.lang.Exception p2);
    }
}
