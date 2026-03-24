package android.graphics;

public final class BLASTBufferQueue {
    private long mNativeObject;
    private static native long nativeCreate(long p0, long p1, long p2, boolean p3);
    private static native void nativeDestroy(long p0);
    private static native android.view.Surface nativeGetSurface(long p0);
    private static native void nativeSetNextTransaction(long p0, long p1);
    private static native void nativeUpdate(long p0, long p1, long p2, long p3);
    public BLASTBufferQueue(android.view.SurfaceControl p0, int p1, int p2, boolean p3) {}
    public void destroy() {}
    public android.view.Surface getSurface() { return null; }
    public void setNextTransaction(android.view.SurfaceControl.Transaction p0) {}
    public void update(android.view.SurfaceControl p0, int p1, int p2) {}
    protected void finalize() throws java.lang.Throwable {}
}
