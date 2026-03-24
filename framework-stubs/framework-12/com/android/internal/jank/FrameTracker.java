package com.android.internal.jank;

public class FrameTracker extends android.view.SurfaceControl.OnJankDataListener implements android.graphics.HardwareRendererObserver.OnFrameMetricsAvailableListener {
    private static final java.lang.String TAG = "FrameTracker";
    private static final boolean DEBUG = false;
    private static final long INVALID_ID = -1L;
    public static final int NANOS_IN_MILLISECOND = 1000000;
    static final int REASON_END_UNKNOWN = -1;
    static final int REASON_END_NORMAL = 0;
    static final int REASON_END_SURFACE_DESTROYED = 1;
    static final int REASON_CANCEL_NORMAL = 16;
    static final int REASON_CANCEL_NOT_BEGUN = 17;
    static final int REASON_CANCEL_SAME_VSYNC = 18;
    private final android.graphics.HardwareRendererObserver mObserver = null;
    private android.view.SurfaceControl mSurfaceControl;
    private final int mTraceThresholdMissedFrames = 0;
    private final int mTraceThresholdFrameTimeMillis = 0;
    private final com.android.internal.jank.FrameTracker.ThreadedRendererWrapper mRendererWrapper = null;
    private final com.android.internal.jank.FrameTracker.FrameMetricsWrapper mMetricsWrapper = null;
    private final android.util.SparseArray<com.android.internal.jank.FrameTracker.JankInfo> mJankInfos = null;
    private final com.android.internal.jank.InteractionJankMonitor.Session mSession = null;
    private final com.android.internal.jank.FrameTracker.ViewRootWrapper mViewRoot = null;
    private final com.android.internal.jank.FrameTracker.SurfaceControlWrapper mSurfaceControlWrapper = null;
    private final android.view.ViewRootImpl.SurfaceChangedCallback mSurfaceChangedCallback = null;
    private final android.os.Handler mHandler = null;
    private final com.android.internal.jank.FrameTracker.ChoreographerWrapper mChoreographer = null;
    private long mBeginVsyncId;
    private long mEndVsyncId;
    private boolean mMetricsFinalized;
    private boolean mCancelled;
    private com.android.internal.jank.FrameTracker.FrameTrackerListener mListener;
    private boolean mTracingStarted;
    public FrameTracker(com.android.internal.jank.InteractionJankMonitor.Session p0, android.os.Handler p1, com.android.internal.jank.FrameTracker.ThreadedRendererWrapper p2, com.android.internal.jank.FrameTracker.ViewRootWrapper p3, com.android.internal.jank.FrameTracker.SurfaceControlWrapper p4, com.android.internal.jank.FrameTracker.ChoreographerWrapper p5, com.android.internal.jank.FrameTracker.FrameMetricsWrapper p6, int p7, int p8, com.android.internal.jank.FrameTracker.FrameTrackerListener p9) { super(); }
    public synchronized void begin() {}
    public void postTraceStartMarker() {}
    public synchronized void end(int p0) {}
    public synchronized void cancel(int p0) {}
    public synchronized void onJankDataAvailable(android.view.SurfaceControl.JankData[] p0) {}
    private com.android.internal.jank.FrameTracker.JankInfo findJankInfo(long p0) { return null; }
    private boolean isInRange(long p0) { return false; }
    public synchronized void onFrameMetricsAvailable(int p0) {}
    private int getIndexOnOrAfterEnd() { return 0; }
    private void processJankInfos() {}
    private void finish(int p0) {}
    public void removeObservers() {}
    public void triggerPerfetto() {}

    public static class ChoreographerWrapper {
        private final android.view.Choreographer mChoreographer = null;
        public ChoreographerWrapper(android.view.Choreographer p0) {}
        public long getVsyncId() { return 0L; }
    }

    public static class FrameMetricsWrapper {
        private final android.view.FrameMetrics mFrameMetrics = null;
        public FrameMetricsWrapper() {}
        public long[] getTiming() { return null; }
        public long getMetric(int p0) { return 0L; }
    }

    public static interface FrameTrackerListener {
        public void onCujEvents(com.android.internal.jank.InteractionJankMonitor.Session p0, java.lang.String p1);
    }

    private static class JankInfo {
        long frameVsyncId;
        long totalDurationNanos;
        boolean isFirstFrame;
        boolean hwuiCallbackFired;
        boolean surfaceControlCallbackFired;
        int jankType;
        static com.android.internal.jank.FrameTracker.JankInfo createFromHwuiCallback(long p0, long p1, boolean p2) { return null; }
        static com.android.internal.jank.FrameTracker.JankInfo createFromSurfaceControlCallback(long p0, int p1) { return null; }
        private JankInfo(long p0, boolean p1, boolean p2, int p3, long p4, boolean p5) {}
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Reasons {
    }

    public static class SurfaceControlWrapper {
        public SurfaceControlWrapper() {}
        public void addJankStatsListener(android.view.SurfaceControl.OnJankDataListener p0, android.view.SurfaceControl p1) {}
        public void removeJankStatsListener(android.view.SurfaceControl.OnJankDataListener p0) {}
    }

    public static class ThreadedRendererWrapper {
        private final android.view.ThreadedRenderer mRenderer = null;
        public ThreadedRendererWrapper(android.view.ThreadedRenderer p0) {}
        public void addObserver(android.graphics.HardwareRendererObserver p0) {}
        public void removeObserver(android.graphics.HardwareRendererObserver p0) {}
    }

    public static class ViewRootWrapper {
        private final android.view.ViewRootImpl mViewRoot = null;
        public ViewRootWrapper(android.view.ViewRootImpl p0) {}
        public void addSurfaceChangedCallback(android.view.ViewRootImpl.SurfaceChangedCallback p0) {}
        public void removeSurfaceChangedCallback(android.view.ViewRootImpl.SurfaceChangedCallback p0) {}
        public android.view.SurfaceControl getSurfaceControl() { return null; }
    }
}
