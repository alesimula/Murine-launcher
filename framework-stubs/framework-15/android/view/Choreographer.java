package android.view;

public final class Choreographer {
    android.graphics.FrameInfo mFrameInfo;
    public static final int CALLBACK_INPUT = 0;
    public static final int CALLBACK_ANIMATION = 1;
    public static final int CALLBACK_INSETS_ANIMATION = 2;
    public static final int CALLBACK_TRAVERSAL = 3;
    public static final int CALLBACK_COMMIT = 4;
    public static android.view.Choreographer getInstance() { return null; }
    public static android.view.Choreographer getSfInstance() { return null; }
    @android.annotation.NonNull
    static android.view.Choreographer getInstanceForSurfaceControl(long p0, android.os.Looper p1) { return null; }
    public static android.view.Choreographer getMainThreadInstance() { return null; }
    public static void releaseInstance() {}
    void invalidate() {}
    boolean isTheLooperSame(android.os.Looper p0) { return false; }
    public android.os.Looper getLooper() { return null; }
    public static long getFrameDelay() { return 0L; }
    public static void setFrameDelay(long p0) {}
    public static long subtractFrameDelay(long p0) { return 0L; }
    public long getFrameIntervalNanos() { return 0L; }
    void dump(java.lang.String p0, java.io.PrintWriter p1) {}
    public void postCallback(int p0, java.lang.Runnable p1, java.lang.Object p2) {}
    public void postCallbackDelayed(int p0, java.lang.Runnable p1, java.lang.Object p2, long p3) {}
    public void postVsyncCallback(android.view.Choreographer.VsyncCallback p0) {}
    public void removeCallbacks(int p0, java.lang.Runnable p1, java.lang.Object p2) {}
    public void postFrameCallback(android.view.Choreographer.FrameCallback p0) {}
    public void postFrameCallbackDelayed(android.view.Choreographer.FrameCallback p0, long p1) {}
    public void removeFrameCallback(android.view.Choreographer.FrameCallback p0) {}
    public void removeVsyncCallback(android.view.Choreographer.VsyncCallback p0) {}
    public long getFrameTime() { return 0L; }
    @android.annotation.FlaggedApi("android.view.flags.expected_presentation_time_api")
    public long getFrameTimeNanos() { return 0L; }
    public long getLastFrameTimeNanos() { return 0L; }
    public long getExpectedPresentationTimeNanos() { return 0L; }
    public long getExpectedPresentationTimeMillis() { return 0L; }
    public long getLatestExpectedPresentTimeNanos() { return 0L; }
    public long getVsyncId() { return 0L; }
    public long getFrameDeadline() { return 0L; }
    void setFPSDivisor(int p0) {}
    void doFrame(long p0, int p1, android.view.DisplayEventReceiver.VsyncEventData p2) {}
    void doCallbacks(int p0, long p1) {}
    void doScheduleVsync() {}
    void doScheduleCallback(int p0) {}

    private final class CallbackQueue {
        public boolean hasDueCallbacksLocked(long p0) { return false; }
        public android.view.Choreographer.CallbackRecord extractDueCallbacksLocked(long p0) { return null; }
        public void addCallbackLocked(long p0, java.lang.Object p1, java.lang.Object p2) {}
        public void removeCallbacksLocked(java.lang.Object p0, java.lang.Object p1) {}
    }

    private static final class CallbackRecord {
        public android.view.Choreographer.CallbackRecord next;
        public long dueTime;
        public java.lang.Object action;
        public java.lang.Object token;
        public void run(long p0) {}
        void run(android.view.Choreographer.FrameData p0) {}
    }

    public static interface FrameCallback {
        public void doFrame(long p0);
    }

    public static class FrameData {
        FrameData() {}
        public long getFrameTimeNanos() { return 0L; }
        @android.annotation.NonNull
        @android.annotation.SuppressLint("ArrayReturn")
        public android.view.Choreographer.FrameTimeline[] getFrameTimelines() { return null; }
        @android.annotation.NonNull
        public android.view.Choreographer.FrameTimeline getPreferredFrameTimeline() { return null; }
        void setInCallback(boolean p0) {}
        android.view.Choreographer.FrameTimeline update(long p0, android.view.DisplayEventReceiver.VsyncEventData p1) { return null; }
        android.view.Choreographer.FrameTimeline update(long p0, android.view.DisplayEventReceiver p1, long p2) { return null; }
        void update(long p0, int p1) {}
    }

    private final class FrameDisplayEventReceiver extends android.view.DisplayEventReceiver implements java.lang.Runnable {
        FrameDisplayEventReceiver(android.view.Choreographer p0, android.os.Looper p1, int p2, long p3) { super((android.os.Looper)null); }
        public void onVsync(long p0, long p1, int p2, android.view.DisplayEventReceiver.VsyncEventData p3) {}
        public void run() {}
    }

    private final class FrameHandler extends android.os.Handler {
        public FrameHandler(android.view.Choreographer p0, android.os.Looper p1) { super(); }
        public void handleMessage(android.os.Message p0) {}
    }

    public static class FrameTimeline {
        FrameTimeline() {}
        void setInCallback(boolean p0) {}
        void update(long p0, long p1, long p2) {}
        public long getVsyncId() { return 0L; }
        public long getExpectedPresentationTimeNanos() { return 0L; }
        public long getDeadlineNanos() { return 0L; }
    }

    public static interface VsyncCallback {
        public void onVsync(android.view.Choreographer.FrameData p0);
    }
}
