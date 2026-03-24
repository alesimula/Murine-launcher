package com.android.internal.jank;

public class FrameTracker extends android.view.SurfaceControl.OnJankDataListener implements android.graphics.HardwareRendererObserver.OnFrameMetricsAvailableListener {
    public static final int NANOS_IN_MILLISECOND = 1000000;
    static final int REASON_END_UNKNOWN = -1;
    static final int REASON_END_NORMAL = 0;
    static final int REASON_END_SURFACE_DESTROYED = 1;
    static final int REASON_CANCEL_NORMAL = 16;
    static final int REASON_CANCEL_NOT_BEGUN = 17;
    static final int REASON_CANCEL_SAME_VSYNC = 18;
    static final int REASON_CANCEL_TIMEOUT = 19;
    public final boolean mSurfaceOnly = false;
    public FrameTracker(com.android.internal.jank.InteractionJankMonitor.Configuration p0, com.android.internal.jank.FrameTracker.ThreadedRendererWrapper p1, com.android.internal.jank.FrameTracker.ViewRootWrapper p2, com.android.internal.jank.FrameTracker.SurfaceControlWrapper p3, com.android.internal.jank.FrameTracker.ChoreographerWrapper p4, com.android.internal.jank.FrameTracker.FrameMetricsWrapper p5, com.android.internal.jank.FrameTracker.StatsLogWrapper p6, int p7, int p8, com.android.internal.jank.FrameTracker.FrameTrackerListener p9) { super(); }
    public void begin() {}
    public void postTraceStartMarker(java.lang.Runnable p0) {}
    public boolean end(int p0) { return false; }
    public boolean cancel(int p0) { return false; }
    public void onJankDataAvailable(android.view.SurfaceControl.JankData[] p0) {}
    public void postCallback(java.lang.Runnable p0) {}
    public void onFrameMetricsAvailable(int p0) {}
    com.android.internal.jank.FrameTracker.ThreadedRendererWrapper getThreadedRenderer() { return null; }
    com.android.internal.jank.FrameTracker.ViewRootWrapper getViewRoot() { return null; }
    public void removeObservers() {}

    public static class ChoreographerWrapper {
        public ChoreographerWrapper(android.view.Choreographer p0) {}
        public long getVsyncId() { return 0L; }
    }

    public static class FrameMetricsWrapper {
        public FrameMetricsWrapper() {}
        public long[] getTiming() { return null; }
        public long getMetric(int p0) { return 0L; }
    }

    public static interface FrameTrackerListener {
        public void onCujEvents(com.android.internal.jank.FrameTracker p0, java.lang.String p1, int p2);
        public void triggerPerfetto(com.android.internal.jank.InteractionJankMonitor.Configuration p0);
    }

    private static class JankInfo {
        long frameVsyncId;
        long totalDurationNanos;
        boolean isFirstFrame;
        boolean hwuiCallbackFired;
        boolean surfaceControlCallbackFired;
        int jankType;
        int refreshRate;
        static com.android.internal.jank.FrameTracker.JankInfo createFromHwuiCallback(long p0, long p1, boolean p2) { return null; }
        static com.android.internal.jank.FrameTracker.JankInfo createFromSurfaceControlCallback(long p0, int p1, int p2) { return null; }
        public java.lang.String toString() { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Reasons {
    }

    public static class StatsLogWrapper {
        public StatsLogWrapper(com.android.internal.jank.DisplayResolutionTracker p0) {}
        public void write(int p0, int p1, int p2, int p3, long p4, long p5, long p6, long p7, long p8, long p9) {}
    }

    public static class SurfaceControlWrapper {
        public SurfaceControlWrapper() {}
        public void addJankStatsListener(android.view.SurfaceControl.OnJankDataListener p0, android.view.SurfaceControl p1) {}
        public void removeJankStatsListener(android.view.SurfaceControl.OnJankDataListener p0) {}
    }

    public static class ThreadedRendererWrapper {
        public ThreadedRendererWrapper(android.view.ThreadedRenderer p0) {}
        public void addObserver(android.graphics.HardwareRendererObserver p0) {}
        public void removeObserver(android.graphics.HardwareRendererObserver p0) {}
    }

    public static class ViewRootWrapper {
        public ViewRootWrapper(android.view.ViewRootImpl p0) {}
        public void addSurfaceChangedCallback(android.view.ViewRootImpl.SurfaceChangedCallback p0) {}
        public void removeSurfaceChangedCallback(android.view.ViewRootImpl.SurfaceChangedCallback p0) {}
        public android.view.SurfaceControl getSurfaceControl() { return null; }
        void requestInvalidateRootRenderNode() {}
        void addWindowCallbacks(android.view.WindowCallbacks p0) {}
        void removeWindowCallbacks(android.view.WindowCallbacks p0) {}
        android.view.View getView() { return null; }
        int dipToPx(int p0) { return 0; }
    }
}
