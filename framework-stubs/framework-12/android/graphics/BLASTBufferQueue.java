package android.graphics;

public final class BLASTBufferQueue {
    public long mNativeObject;
    private static native long nativeCreate(java.lang.String p0, long p1, long p2, long p3, int p4);
    private static native void nativeDestroy(long p0);
    private static native android.view.Surface nativeGetSurface(long p0, boolean p1);
    private static native void nativeSetNextTransaction(long p0, long p1);
    private static native void nativeUpdate(long p0, long p1, long p2, long p3, int p4, long p5);
    private static native void nativeFlushShadowQueue(long p0);
    private static native void nativeMergeWithNextTransaction(long p0, long p1, long p2);
    private static native void nativeSetTransactionCompleteCallback(long p0, long p1, android.graphics.BLASTBufferQueue.TransactionCompleteCallback p2);
    public BLASTBufferQueue(java.lang.String p0, android.view.SurfaceControl p1, int p2, int p3, int p4) {}
    public void destroy() {}
    public android.view.Surface createSurface() { return null; }
    public android.view.Surface createSurfaceWithHandle() { return null; }
    public void setNextTransaction(android.view.SurfaceControl.Transaction p0) {}
    public void update(android.view.SurfaceControl p0, int p1, int p2, int p3, android.view.SurfaceControl.Transaction p4) {}
    public void update(android.view.SurfaceControl p0, int p1, int p2, int p3) {}
    public void setTransactionCompleteCallback(long p0, android.graphics.BLASTBufferQueue.TransactionCompleteCallback p1) {}
    protected void finalize() throws java.lang.Throwable {}
    public void flushShadowQueue() {}
    public void mergeWithNextTransaction(android.view.SurfaceControl.Transaction p0, long p1) {}
    public void mergeWithNextTransaction(long p0, long p1) {}

    public static interface TransactionCompleteCallback {
        public void onTransactionComplete(long p0);
    }
}
