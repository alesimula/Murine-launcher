package android.window;

public final class SurfaceSyncGroup {
    public static final int TRANSACTION_READY_TIMEOUT = Integer.valueOf(0);
    public final android.window.ISurfaceSyncGroup mISurfaceSyncGroup = null;
    public static void setTransactionFactory(java.util.function.Supplier<android.view.SurfaceControl.Transaction> p0) {}
    public SurfaceSyncGroup(java.lang.String p0) {}
    public SurfaceSyncGroup(java.lang.String p0, java.util.function.Consumer<android.view.SurfaceControl.Transaction> p1) {}
    public void addSyncCompleteCallback(java.util.concurrent.Executor p0, java.lang.Runnable p1) {}
    public void markSyncReady() {}
    public boolean add(android.view.SurfaceView p0, java.util.function.Consumer<android.window.SurfaceSyncGroup.SurfaceViewFrameCallback> p1) { return false; }
    public boolean add(android.view.AttachedSurfaceControl p0, java.lang.Runnable p1) { return false; }
    public boolean add(android.view.SurfaceControlViewHost.SurfacePackage p0, java.lang.Runnable p1) { return false; }
    public boolean add(android.window.SurfaceSyncGroup p0, java.lang.Runnable p1) { return false; }
    public boolean add(android.window.ISurfaceSyncGroup p0, boolean p1, java.lang.Runnable p2) { return false; }
    public void addTransaction(android.view.SurfaceControl.Transaction p0) {}
    public void setAddedToSyncListener(java.lang.Runnable p0) {}
    public java.lang.String getName() { return null; }
    public android.window.ITransactionReadyCallback createTransactionReadyCallback(boolean p0) { return null; }
    public void toggleTimeout(boolean p0) {}

    private class ISurfaceSyncGroupImpl extends android.window.ISurfaceSyncGroup.Stub {
        public boolean onAddedToSyncGroup(android.os.IBinder p0, boolean p1) { return false; }
        public boolean addToSync(android.window.ISurfaceSyncGroup p0, boolean p1) { return false; }
        android.window.SurfaceSyncGroup getSurfaceSyncGroup() { return null; }
    }

    public static interface SurfaceViewFrameCallback {
        public void onFrameStarted();
    }
}
