package android.os;

public final class Looper {
    static final java.lang.ThreadLocal<android.os.Looper> sThreadLocal = null;
    final android.os.MessageQueue mQueue = null;
    final java.lang.Thread mThread = null;
    public static void prepare() {}
    @java.lang.Deprecated
    public static void prepareMainLooper() {}
    public static android.os.Looper getMainLooper() { return null; }
    public static void setMainLooperForTest(android.os.Looper p0) {}
    public static void clearMainLooperForTest() {}
    public static void setObserver(android.os.Looper.Observer p0) {}
    public static void loop() {}
    @android.annotation.Nullable
    public static android.os.Looper myLooper() { return null; }
    @android.annotation.NonNull
    public static android.os.MessageQueue myQueue() { return null; }
    public boolean isCurrentThread() { return false; }
    public void setMessageLogging(android.util.Printer p0) {}
    public void setTraceTag(long p0) {}
    public void setSlowLogThresholdMs(long p0, long p1) {}
    public void quit() {}
    public void quitSafely() {}
    @android.annotation.NonNull
    public java.lang.Thread getThread() { return null; }
    @android.annotation.NonNull
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
