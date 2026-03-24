package android.window;

public class SurfaceSyncer {
    public SurfaceSyncer() {}
    public static void setTransactionFactory(java.util.function.Supplier<android.view.SurfaceControl.Transaction> p0) {}
    public int setupSync(java.lang.Runnable p0) { return 0; }
    public int setupSync(java.util.function.Consumer<android.view.SurfaceControl.Transaction> p0) { return 0; }
    public void markSyncReady(int p0) {}
    public void merge(int p0, int p1, android.window.SurfaceSyncer p2) {}
    public boolean addToSync(int p0, android.view.SurfaceView p1, java.util.function.Consumer<android.window.SurfaceSyncer.SurfaceViewFrameCallback> p2) { return false; }
    public boolean addToSync(int p0, android.view.View p1) { return false; }
    public boolean addToSync(int p0, android.window.SurfaceSyncer.SyncTarget p1) { return false; }
    public void addTransactionToSync(int p0, android.view.SurfaceControl.Transaction p1) {}

    public static interface SurfaceViewFrameCallback {
        public void onFrameStarted();
    }

    private static class SurfaceViewSyncTarget implements android.window.SurfaceSyncer.SyncTarget {
        SurfaceViewSyncTarget(android.view.SurfaceView p0, java.util.function.Consumer<android.window.SurfaceSyncer.SurfaceViewFrameCallback> p1) {}
        public void onReadyToSync(android.window.SurfaceSyncer.SyncBufferCallback p0) {}
    }

    public static interface SyncBufferCallback {
        public void onBufferReady(android.view.SurfaceControl.Transaction p0);
    }

    private static class SyncSet {
        boolean addSyncableSurface(android.window.SurfaceSyncer.SyncTarget p0) { return false; }
        void markSyncReady() {}
        void addTransactionToSync(android.view.SurfaceControl.Transaction p0) {}
        public void updateCallback(java.util.function.Consumer<android.view.SurfaceControl.Transaction> p0) {}
        public void merge(android.window.SurfaceSyncer.SyncSet p0) {}
    }

    public static interface SyncTarget {
        public void onReadyToSync(android.window.SurfaceSyncer.SyncBufferCallback p0);
        default public void onSyncComplete() {}
    }
}
