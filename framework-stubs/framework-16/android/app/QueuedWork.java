package android.app;

public class QueuedWork {
    public QueuedWork() {}
    public static void resetHandler() {}
    public static void addFinisher(java.lang.Runnable p0) {}
    public static void removeFinisher(java.lang.Runnable p0) {}
    public static void waitToFinish() {}
    public static void queue(java.lang.Runnable p0, boolean p1) {}
    public static boolean hasPendingWork() { return false; }

    private static class QueuedWorkHandler extends android.os.Handler {
        static final int MSG_RUN = 1;
        QueuedWorkHandler(android.os.Looper p0) { super(); }
        public void handleMessage(android.os.Message p0) {}
    }
}
