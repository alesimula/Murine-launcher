package android.view;

public abstract class DisplayEventReceiver {
    public static final int VSYNC_SOURCE_APP = 0;
    public static final int VSYNC_SOURCE_SURFACE_FLINGER = 1;
    public static final int EVENT_REGISTRATION_MODE_CHANGED_FLAG = 1;
    public static final int EVENT_REGISTRATION_FRAME_RATE_OVERRIDE_FLAG = 2;
    public DisplayEventReceiver(android.os.Looper p0) {}
    public DisplayEventReceiver(android.os.Looper p0, int p1, int p2) {}
    public DisplayEventReceiver(android.os.Looper p0, int p1, int p2, long p3) {}
    public void dispose() {}
    public void onVsync(long p0, long p1, int p2, android.view.DisplayEventReceiver.VsyncEventData p3) {}
    public void onHotplug(long p0, long p1, boolean p2) {}
    public void onHotplugConnectionError(long p0, int p1) {}
    public void onModeChanged(long p0, long p1, int p2, long p3, long p4, long p5) {}
    public void onModeAndFrameRateOverridesChanged(long p0, long p1, int p2, long p3, long p4, long p5, android.view.DisplayEventReceiver.FrameRateOverride[] p6) {}
    public void onModeRejected(long p0, int p1) {}
    public void onHdcpLevelsChanged(long p0, int p1, int p2) {}
    public void onFrameRateOverridesChanged(long p0, long p1, android.view.DisplayEventReceiver.FrameRateOverride[] p2) {}
    public void scheduleVsync() {}
    android.view.DisplayEventReceiver.VsyncEventData getLatestVsyncEventData() { return null; }

    public static class FrameRateOverride {
        public final int uid = 0;
        public final float frameRateHz = 0.0f;
        public FrameRateOverride(int p0, float p1) {}
        public java.lang.String toString() { return null; }
    }

    public static final class VsyncEventData {
        static final int FRAME_TIMELINES_CAPACITY = 7;
        public long frameInterval;
        public final android.view.DisplayEventReceiver.VsyncEventData.FrameTimeline[] frameTimelines = null;
        public int preferredFrameTimelineIndex;
        public int frameTimelinesLength;
        public int numberQueuedBuffers;
        VsyncEventData() {}
        VsyncEventData(android.view.DisplayEventReceiver.VsyncEventData.FrameTimeline[] p0, int p1, int p2, long p3, int p4) {}
        void copyFrom(android.view.DisplayEventReceiver.VsyncEventData p0) {}
        public android.view.DisplayEventReceiver.VsyncEventData.FrameTimeline preferredFrameTimeline() { return null; }

        public static class FrameTimeline {
            public long vsyncId;
            public long expectedPresentationTime;
            public long deadline;
            FrameTimeline() {}
            FrameTimeline(long p0, long p1, long p2) {}
            void copyFrom(android.view.DisplayEventReceiver.VsyncEventData.FrameTimeline p0) {}
        }
    }
}
