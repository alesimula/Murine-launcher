package android.view;

public class FrameMetricsObserver {
    @android.annotation.UnsupportedAppUsage
    private android.os.MessageQueue mMessageQueue;
    private java.lang.ref.WeakReference<android.view.Window> mWindow;
    @android.annotation.UnsupportedAppUsage
    private android.view.FrameMetrics mFrameMetrics;
    android.view.Window.OnFrameMetricsAvailableListener mListener;
    public com.android.internal.util.VirtualRefBasePtr mNative;
    FrameMetricsObserver(android.view.Window p0, android.os.Looper p1, android.view.Window.OnFrameMetricsAvailableListener p2) {}
    @android.annotation.UnsupportedAppUsage
    private void notifyDataAvailable(int p0) {}
}
