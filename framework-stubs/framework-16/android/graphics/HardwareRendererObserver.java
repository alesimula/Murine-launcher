package android.graphics;

public final class HardwareRendererObserver {
    public HardwareRendererObserver(android.graphics.HardwareRendererObserver.OnFrameMetricsAvailableListener p0, long[] p1, android.os.Handler p2, boolean p3) {}
    long getNativeInstance() { return 0L; }
    static boolean invokeDataAvailable(java.lang.ref.WeakReference<android.graphics.HardwareRendererObserver> p0) { return false; }

    public static interface OnFrameMetricsAvailableListener {
        public void onFrameMetricsAvailable(int p0);
    }
}
