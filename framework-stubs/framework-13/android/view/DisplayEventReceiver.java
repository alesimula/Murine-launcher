package android.view;

public abstract class DisplayEventReceiver {
    public static final int VSYNC_SOURCE_APP = 0;
    public static final int VSYNC_SOURCE_SURFACE_FLINGER = 1;
    public static final int EVENT_REGISTRATION_MODE_CHANGED_FLAG = 1;
    public static final int EVENT_REGISTRATION_FRAME_RATE_OVERRIDE_FLAG = 2;
    public DisplayEventReceiver(android.os.Looper p0) {}
    public DisplayEventReceiver(android.os.Looper p0, int p1, int p2) {}
    protected void finalize() throws java.lang.Throwable {}
    public void dispose() {}
    public void onVsync(long p0, long p1, int p2, android.view.DisplayEventReceiver.VsyncEventData p3) {}
    public void onHotplug(long p0, long p1, boolean p2) {}
    public void onModeChanged(long p0, long p1, int p2) {}
    public void onFrameRateOverridesChanged(long p0, long p1, android.view.DisplayEventReceiver.FrameRateOverride[] p2) {}
    public void scheduleVsync() {}
    android.view.DisplayEventReceiver.VsyncEventData getLatestVsyncEventData() { return null; }

    public static class FrameRateOverride {
        public final int uid = 0;
        public final float frameRateHz = 0.0f;
        public FrameRateOverride(int p0, float p1) {}
        public java.lang.String toString() { return null; }
    }

    static final class VsyncEventData {
        static final android.view.DisplayEventReceiver.VsyncEventData.FrameTimeline[] INVALID_FRAME_TIMELINES = null;
        public final long frameInterval = 0L;
        public final android.view.DisplayEventReceiver.VsyncEventData.FrameTimeline[] frameTimelines = null;
        public final int preferredFrameTimelineIndex = 0;
        VsyncEventData(android.view.DisplayEventReceiver.VsyncEventData.FrameTimeline[] p0, int p1, long p2) {}
        VsyncEventData() {}
        public android.view.DisplayEventReceiver.VsyncEventData.FrameTimeline preferredFrameTimeline() { return null; }

        public static class FrameTimeline {
            public final long vsyncId = 0L;
            public final long expectedPresentTime = 0L;
            public final long deadline = 0L;
            FrameTimeline(long p0, long p1, long p2) {}
        }
    }
}
