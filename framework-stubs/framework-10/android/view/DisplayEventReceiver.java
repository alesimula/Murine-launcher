package android.view;

public abstract class DisplayEventReceiver {
    public static final int VSYNC_SOURCE_APP = 0;
    public static final int VSYNC_SOURCE_SURFACE_FLINGER = 1;
    public static final int CONFIG_CHANGED_EVENT_SUPPRESS = 0;
    public static final int CONFIG_CHANGED_EVENT_DISPATCH = 1;
    private static final java.lang.String TAG = "DisplayEventReceiver";
    @android.annotation.UnsupportedAppUsage
    private long mReceiverPtr;
    private android.os.MessageQueue mMessageQueue;
    private static native long nativeInit(java.lang.ref.WeakReference<android.view.DisplayEventReceiver> p0, android.os.MessageQueue p1, int p2, int p3);
    private static native void nativeDispose(long p0);
    private static native void nativeScheduleVsync(long p0);
    @android.annotation.UnsupportedAppUsage
    public DisplayEventReceiver(android.os.Looper p0) {}
    public DisplayEventReceiver(android.os.Looper p0, int p1, int p2) {}
    protected void finalize() throws java.lang.Throwable {}
    public void dispose() {}
    private void dispose(boolean p0) {}
    @android.annotation.UnsupportedAppUsage
    public void onVsync(long p0, long p1, int p2) {}
    @android.annotation.UnsupportedAppUsage
    public void onHotplug(long p0, long p1, boolean p2) {}
    public void onConfigChanged(long p0, long p1, int p2) {}
    @android.annotation.UnsupportedAppUsage
    public void scheduleVsync() {}
    @android.annotation.UnsupportedAppUsage
    private void dispatchVsync(long p0, long p1, int p2) {}
    @android.annotation.UnsupportedAppUsage
    private void dispatchHotplug(long p0, long p1, boolean p2) {}
    private void dispatchConfigChanged(long p0, long p1, int p2) {}
}
