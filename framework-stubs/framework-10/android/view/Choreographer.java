package android.view;

public final class Choreographer {
    private static final java.lang.String TAG = "Choreographer";
    private static final boolean DEBUG_JANK = false;
    private static final boolean DEBUG_FRAMES = false;
    private static final long DEFAULT_FRAME_DELAY = 10L;
    private static volatile long sFrameDelay;
    private static final java.lang.ThreadLocal<android.view.Choreographer> sThreadInstance = null;
    private static volatile android.view.Choreographer mMainInstance;
    private static final java.lang.ThreadLocal<android.view.Choreographer> sSfThreadInstance = null;
    @android.annotation.UnsupportedAppUsage(maxTargetSdk=28, trackingBug=123769497L)
    private static final boolean USE_VSYNC = Boolean.valueOf(false);
    private static final boolean USE_FRAME_TIME = Boolean.valueOf(false);
    private static final int SKIPPED_FRAME_WARNING_LIMIT = Integer.valueOf(0);
    private static final int MSG_DO_FRAME = 0;
    private static final int MSG_DO_SCHEDULE_VSYNC = 1;
    private static final int MSG_DO_SCHEDULE_CALLBACK = 2;
    private static final java.lang.Object FRAME_CALLBACK_TOKEN = null;
    @android.annotation.UnsupportedAppUsage(maxTargetSdk=28, trackingBug=115609023L)
    private final java.lang.Object mLock = null;
    private final android.os.Looper mLooper = null;
    private final android.view.Choreographer.FrameHandler mHandler = null;
    @android.annotation.UnsupportedAppUsage
    private final android.view.Choreographer.FrameDisplayEventReceiver mDisplayEventReceiver = null;
    private android.view.Choreographer.CallbackRecord mCallbackPool;
    @android.annotation.UnsupportedAppUsage
    private final android.view.Choreographer.CallbackQueue[] mCallbackQueues = null;
    private boolean mFrameScheduled;
    private boolean mCallbacksRunning;
    @android.annotation.UnsupportedAppUsage
    private long mLastFrameTimeNanos;
    @android.annotation.UnsupportedAppUsage
    private long mFrameIntervalNanos;
    private boolean mDebugPrintNextFrameTimeDelta;
    private int mFPSDivisor;
    android.graphics.FrameInfo mFrameInfo;
    private static final java.lang.String[] CALLBACK_TRACE_TITLES = null;
    public static final int CALLBACK_INPUT = 0;
    public static final int CALLBACK_ANIMATION = 1;
    public static final int CALLBACK_INSETS_ANIMATION = 2;
    public static final int CALLBACK_TRAVERSAL = 3;
    public static final int CALLBACK_COMMIT = 4;
    private static final int CALLBACK_LAST = 4;
    private Choreographer(android.os.Looper p0, int p1) {}
    private static float getRefreshRate() { return 0.0f; }
    public static android.view.Choreographer getInstance() { return null; }
    @android.annotation.UnsupportedAppUsage
    public static android.view.Choreographer getSfInstance() { return null; }
    public static android.view.Choreographer getMainThreadInstance() { return null; }
    public static void releaseInstance() {}
    private void dispose() {}
    public static long getFrameDelay() { return 0L; }
    public static void setFrameDelay(long p0) {}
    public static long subtractFrameDelay(long p0) { return 0L; }
    public long getFrameIntervalNanos() { return 0L; }
    void dump(java.lang.String p0, java.io.PrintWriter p1) {}
    public void postCallback(int p0, java.lang.Runnable p1, java.lang.Object p2) {}
    public void postCallbackDelayed(int p0, java.lang.Runnable p1, java.lang.Object p2, long p3) {}
    private void postCallbackDelayedInternal(int p0, java.lang.Object p1, java.lang.Object p2, long p3) {}
    public void removeCallbacks(int p0, java.lang.Runnable p1, java.lang.Object p2) {}
    private void removeCallbacksInternal(int p0, java.lang.Object p1, java.lang.Object p2) {}
    public void postFrameCallback(android.view.Choreographer.FrameCallback p0) {}
    public void postFrameCallbackDelayed(android.view.Choreographer.FrameCallback p0, long p1) {}
    public void removeFrameCallback(android.view.Choreographer.FrameCallback p0) {}
    @android.annotation.UnsupportedAppUsage
    public long getFrameTime() { return 0L; }
    @android.annotation.UnsupportedAppUsage
    public long getFrameTimeNanos() { return 0L; }
    public long getLastFrameTimeNanos() { return 0L; }
    private void scheduleFrameLocked(long p0) {}
    void setFPSDivisor(int p0) {}
    @android.annotation.UnsupportedAppUsage
    void doFrame(long p0, int p1) {}
    void doCallbacks(int p0, long p1) {}
    void doScheduleVsync() {}
    void doScheduleCallback(int p0) {}
    @android.annotation.UnsupportedAppUsage
    private void scheduleVsyncLocked() {}
    private boolean isRunningOnLooperThreadLocked() { return false; }
    private android.view.Choreographer.CallbackRecord obtainCallbackLocked(long p0, java.lang.Object p1, java.lang.Object p2) { return null; }
    private void recycleCallbackLocked(android.view.Choreographer.CallbackRecord p0) {}

    private final class FrameHandler extends android.os.Handler {
        public FrameHandler(android.view.Choreographer p0, android.os.Looper p1) { super(); }
        public void handleMessage(android.os.Message p0) {}
    }

    private final class FrameDisplayEventReceiver extends android.view.DisplayEventReceiver implements java.lang.Runnable {
        private boolean mHavePendingVsync;
        private long mTimestampNanos;
        private int mFrame;
        public FrameDisplayEventReceiver(android.view.Choreographer p0, android.os.Looper p1, int p2) { super((android.os.Looper)null); }
        public void onVsync(long p0, long p1, int p2) {}
        public void run() {}
    }

    public static interface FrameCallback {
        public void doFrame(long p0);
    }

    private static final class CallbackRecord {
        public android.view.Choreographer.CallbackRecord next;
        public long dueTime;
        public java.lang.Object action;
        public java.lang.Object token;
        private CallbackRecord() {}
        @android.annotation.UnsupportedAppUsage
        public void run(long p0) {}
    }

    private final class CallbackQueue {
        private android.view.Choreographer.CallbackRecord mHead;
        private CallbackQueue(android.view.Choreographer p0) {}
        public boolean hasDueCallbacksLocked(long p0) { return false; }
        public android.view.Choreographer.CallbackRecord extractDueCallbacksLocked(long p0) { return null; }
        @android.annotation.UnsupportedAppUsage
        public void addCallbackLocked(long p0, java.lang.Object p1, java.lang.Object p2) {}
        public void removeCallbacksLocked(java.lang.Object p0, java.lang.Object p1) {}
    }
}
