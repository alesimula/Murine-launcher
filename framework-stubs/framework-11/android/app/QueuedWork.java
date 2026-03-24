package android.app;

public class QueuedWork {
    private static final java.lang.String LOG_TAG = null;
    private static final boolean DEBUG = false;
    private static final long DELAY = 100L;
    private static final long MAX_WAIT_TIME_MILLIS = 512L;
    private static final java.lang.Object sLock = null;
    private static java.lang.Object sProcessingWork;
    private static final java.util.LinkedList<java.lang.Runnable> sFinishers = null;
    private static android.os.Handler sHandler;
    private static final java.util.LinkedList<java.lang.Runnable> sWork = null;
    private static boolean sCanDelay;
    private static final com.android.internal.util.ExponentiallyBucketedHistogram mWaitTimes = null;
    private static int mNumWaits;
    public QueuedWork() {}
    private static android.os.Handler getHandler() { return null; }
    public static void addFinisher(java.lang.Runnable p0) {}
    public static void removeFinisher(java.lang.Runnable p0) {}
    public static void waitToFinish() {}
    public static void queue(java.lang.Runnable p0, boolean p1) {}
    public static boolean hasPendingWork() { return false; }
    private static void processPendingWork() {}

    private static class QueuedWorkHandler extends android.os.Handler {
        static final int MSG_RUN = 1;
        QueuedWorkHandler(android.os.Looper p0) { super(); }
        public void handleMessage(android.os.Message p0) {}
    }
}
