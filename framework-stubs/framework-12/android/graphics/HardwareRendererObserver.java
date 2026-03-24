package android.graphics;

public class HardwareRendererObserver {
    private final long[] mFrameMetrics = null;
    private final android.os.Handler mHandler = null;
    private final android.graphics.HardwareRendererObserver.OnFrameMetricsAvailableListener mListener = null;
    private com.android.internal.util.VirtualRefBasePtr mNativePtr;
    public HardwareRendererObserver(android.graphics.HardwareRendererObserver.OnFrameMetricsAvailableListener p0, long[] p1, android.os.Handler p2, boolean p3) {}
    long getNativeInstance() { return 0L; }
    private void notifyDataAvailable() {}
    private native long nCreateObserver(boolean p0);
    private static native int nGetNextBuffer(long p0, long[] p1);

    public static interface OnFrameMetricsAvailableListener {
        public void onFrameMetricsAvailable(int p0);
    }
}
