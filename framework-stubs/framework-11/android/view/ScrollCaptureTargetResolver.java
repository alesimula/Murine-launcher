package android.view;

public class ScrollCaptureTargetResolver {
    private static final java.lang.String TAG = "ScrollCaptureTargetRes";
    private static final boolean DEBUG = true;
    private final java.lang.Object mLock = null;
    private final java.util.Queue<android.view.ScrollCaptureTarget> mTargets = null;
    private android.os.Handler mHandler;
    private long mTimeLimitMillis;
    private java.util.function.Consumer<android.view.ScrollCaptureTarget> mWhenComplete;
    private int mPendingBoundsRequests;
    private long mDeadlineMillis;
    private android.view.ScrollCaptureTarget mResult;
    private boolean mFinished;
    private boolean mStarted;
    private final java.lang.Runnable mTimeoutRunnable = null;
    private static int area(android.graphics.Rect p0) { return 0; }
    private static boolean nullOrEmpty(android.graphics.Rect p0) { return false; }
    private static android.view.ScrollCaptureTarget chooseTarget(android.view.ScrollCaptureTarget p0, android.view.ScrollCaptureTarget p1) { return null; }
    public ScrollCaptureTargetResolver(java.util.Queue<android.view.ScrollCaptureTarget> p0) {}
    void checkThread() {}
    public android.view.ScrollCaptureTarget waitForResult() throws java.lang.InterruptedException { return null; }
    private void supplyResult(android.view.ScrollCaptureTarget p0) {}
    public void start(android.os.Handler p0, long p1, java.util.function.Consumer<android.view.ScrollCaptureTarget> p2) {}
    private void run(long p0, java.util.function.Consumer<android.view.ScrollCaptureTarget> p1) {}
    private void queryTarget(android.view.ScrollCaptureTarget p0) {}
    private void onScrollBoundsProvided(android.view.ScrollCaptureTarget p0, android.graphics.Rect p1) {}
    private static boolean hasIncludeHint(android.view.View p0) { return false; }
    private static boolean isDescendant(android.view.View p0, android.view.View p1) { return false; }
    private static int findRelation(android.view.View p0, android.view.View p1) { return 0; }

    static class SingletonConsumer<T extends java.lang.Object> implements java.util.function.Consumer<T> {
        final java.util.concurrent.atomic.AtomicReference<java.util.function.Consumer<T>> mAtomicRef = null;
        SingletonConsumer(java.util.function.Consumer<T> p0) {}
        public void accept(T p0) {}
    }
}
