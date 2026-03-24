package android.graphics;

public final class BLASTBufferQueue {
    public long mNativeObject;
    public BLASTBufferQueue(java.lang.String p0, android.view.SurfaceControl p1, int p2, int p3, int p4) {}
    public BLASTBufferQueue(java.lang.String p0, boolean p1) {}
    public void destroy() {}
    public android.view.Surface createSurface() { return null; }
    public android.view.Surface createSurfaceWithHandle() { return null; }
    public void syncNextTransaction(boolean p0, java.util.function.Consumer<android.view.SurfaceControl.Transaction> p1) {}
    public void syncNextTransaction(java.util.function.Consumer<android.view.SurfaceControl.Transaction> p0) {}
    public void stopContinuousSyncTransaction() {}
    public void update(android.view.SurfaceControl p0, int p1, int p2, int p3) {}
    protected void finalize() throws java.lang.Throwable {}
    public void mergeWithNextTransaction(android.view.SurfaceControl.Transaction p0, long p1) {}
    public void mergeWithNextTransaction(long p0, long p1) {}
    public void applyPendingTransactions(long p0) {}
    public long getLastAcquiredFrameNum() { return 0L; }
    public boolean isSameSurfaceControl(android.view.SurfaceControl p0) { return false; }
    public android.view.SurfaceControl.Transaction gatherPendingTransactions(long p0) { return null; }
    public void setTransactionHangCallback(android.graphics.BLASTBufferQueue.TransactionHangCallback p0) {}

    public static interface TransactionHangCallback {
        public void onTransactionHang(boolean p0);
    }
}
