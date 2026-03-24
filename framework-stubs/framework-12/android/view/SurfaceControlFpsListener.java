package android.view;

public abstract class SurfaceControlFpsListener {
    private long mNativeListener;
    public SurfaceControlFpsListener() {}
    protected void destroy() {}
    protected void finalize() throws java.lang.Throwable {}
    public abstract void onFpsReported(float p0);
    public void register(int p0) {}
    public void unregister() {}
    private static void dispatchOnFpsReported(android.view.SurfaceControlFpsListener p0, float p1) {}
    private static native long nativeCreate(android.view.SurfaceControlFpsListener p0);
    private static native void nativeDestroy(long p0);
    private static native void nativeRegister(long p0, int p1);
    private static native void nativeUnregister(long p0);
}
