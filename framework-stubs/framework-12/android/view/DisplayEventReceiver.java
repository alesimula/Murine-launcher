package android.view;

public abstract class DisplayEventReceiver {
    public static final int VSYNC_SOURCE_APP = 0;
    public static final int VSYNC_SOURCE_SURFACE_FLINGER = 1;
    public static final int EVENT_REGISTRATION_MODE_CHANGED_FLAG = 1;
    public static final int EVENT_REGISTRATION_FRAME_RATE_OVERRIDE_FLAG = 2;
    private static final java.lang.String TAG = "DisplayEventReceiver";
    private long mReceiverPtr;
    private android.os.MessageQueue mMessageQueue;
    private static native long nativeInit(java.lang.ref.WeakReference<android.view.DisplayEventReceiver> p0, android.os.MessageQueue p1, int p2, int p3);
    private static native void nativeDispose(long p0);
    private static native void nativeScheduleVsync(long p0);
    public DisplayEventReceiver(android.os.Looper p0) {}
    public DisplayEventReceiver(android.os.Looper p0, int p1, int p2) {}
    protected void finalize() throws java.lang.Throwable {}
    public void dispose() {}
    private void dispose(boolean p0) {}
    public void onVsync(long p0, long p1, int p2, android.view.DisplayEventReceiver.VsyncEventData p3) {}
    public void onHotplug(long p0, long p1, boolean p2) {}
    public void onModeChanged(long p0, long p1, int p2) {}
    public void onFrameRateOverridesChanged(long p0, long p1, android.view.DisplayEventReceiver.FrameRateOverride[] p2) {}
    public void scheduleVsync() {}
    private void dispatchVsync(long p0, long p1, int p2, long p3, long p4, long p5) {}
    private void dispatchHotplug(long p0, long p1, boolean p2) {}
    private void dispatchModeChanged(long p0, long p1, int p2) {}
    private void dispatchFrameRateOverrides(long p0, long p1, android.view.DisplayEventReceiver.FrameRateOverride[] p2) {}

    public static class FrameRateOverride {
        public final int uid = 0;
        public final float frameRateHz = 0.0f;
        public FrameRateOverride(int p0, float p1) {}
        public java.lang.String toString() { return null; }
    }

    static final class VsyncEventData {
        public final long id = 0L;
        public final long frameDeadline = 0L;
        public final long frameInterval = 0L;
        VsyncEventData(long p0, long p1, long p2) {}
        VsyncEventData() {}
    }
}
