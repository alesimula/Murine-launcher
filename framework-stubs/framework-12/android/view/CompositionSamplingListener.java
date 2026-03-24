package android.view;

public abstract class CompositionSamplingListener {
    private long mNativeListener;
    private final java.util.concurrent.Executor mExecutor = null;
    public CompositionSamplingListener(java.util.concurrent.Executor p0) {}
    public void destroy() {}
    protected void finalize() throws java.lang.Throwable {}
    public abstract void onSampleCollected(float p0);
    public static void register(android.view.CompositionSamplingListener p0, int p1, android.view.SurfaceControl p2, android.graphics.Rect p3) {}
    public static void unregister(android.view.CompositionSamplingListener p0) {}
    private static void dispatchOnSampleCollected(android.view.CompositionSamplingListener p0, float p1) {}
    private static native long nativeCreate(android.view.CompositionSamplingListener p0);
    private static native void nativeDestroy(long p0);
    private static native void nativeRegister(long p0, long p1, int p2, int p3, int p4, int p5);
    private static native void nativeUnregister(long p0);
}
