package android.service.contentcapture;

@android.annotation.SystemApi
public abstract class ContentCaptureService extends android.app.Service {
    private static final java.lang.String TAG = null;
    public static final java.lang.String SERVICE_INTERFACE = "android.service.contentcapture.ContentCaptureService";
    public static final java.lang.String SERVICE_META_DATA = "android.content_capture";
    private final android.service.contentcapture.ContentCaptureService.LocalDataShareAdapterResourceManager mDataShareAdapterResourceManager = null;
    private android.os.Handler mHandler;
    private android.service.contentcapture.IContentCaptureServiceCallback mCallback;
    private long mCallerMismatchTimeout;
    private long mLastCallerMismatchLog;
    private final android.service.contentcapture.IContentCaptureService mServerInterface = null;
    private final android.view.contentcapture.IContentCaptureDirectManager mClientInterface = null;
    private final android.util.SparseIntArray mSessionUids = null;
    public ContentCaptureService() { super(); }
    public void onCreate() {}
    public final android.os.IBinder onBind(android.content.Intent p0) { return null; }
    public final void setContentCaptureWhitelist(java.util.Set<java.lang.String> p0, java.util.Set<android.content.ComponentName> p1) {}
    public final void setContentCaptureConditions(java.lang.String p0, java.util.Set<android.view.contentcapture.ContentCaptureCondition> p1) {}
    public void onConnected() {}
    public void onCreateContentCaptureSession(android.view.contentcapture.ContentCaptureContext p0, android.view.contentcapture.ContentCaptureSessionId p1) {}
    public void onContentCaptureEvent(android.view.contentcapture.ContentCaptureSessionId p0, android.view.contentcapture.ContentCaptureEvent p1) {}
    public void onDataRemovalRequest(android.view.contentcapture.DataRemovalRequest p0) {}
    @android.annotation.SystemApi
    public void onDataShareRequest(android.view.contentcapture.DataShareRequest p0, android.service.contentcapture.DataShareCallback p1) {}
    public void onActivitySnapshot(android.view.contentcapture.ContentCaptureSessionId p0, android.service.contentcapture.SnapshotData p1) {}
    public void onActivityEvent(android.service.contentcapture.ActivityEvent p0) {}
    public void onDestroyContentCaptureSession(android.view.contentcapture.ContentCaptureSessionId p0) {}
    public final void disableSelf() {}
    public void onDisconnected() {}
    protected void dump(java.io.FileDescriptor p0, java.io.PrintWriter p1, java.lang.String[] p2) {}
    private void handleOnConnected(android.os.IBinder p0) {}
    private void handleOnDisconnected() {}
    private void handleOnCreateSession(android.view.contentcapture.ContentCaptureContext p0, int p1, int p2, com.android.internal.os.IResultReceiver p3, int p4) {}
    private void handleSendEvents(int p0, android.content.pm.ParceledListSlice<android.view.contentcapture.ContentCaptureEvent> p1, int p2, android.content.ContentCaptureOptions p3) {}
    private void handleOnActivitySnapshot(int p0, android.service.contentcapture.SnapshotData p1) {}
    private void handleFinishSession(int p0) {}
    private void handleOnDataRemovalRequest(android.view.contentcapture.DataRemovalRequest p0) {}
    private void handleOnDataShared(android.view.contentcapture.DataShareRequest p0, android.service.contentcapture.IDataShareCallback p1) {}
    private void handleOnActivityEvent(android.service.contentcapture.ActivityEvent p0) {}
    private boolean handleIsRightCallerFor(android.view.contentcapture.ContentCaptureEvent p0, int p1) { return false; }
    public static void setClientState(com.android.internal.os.IResultReceiver p0, int p1, android.os.IBinder p2) {}
    private void writeFlushMetrics(int p0, android.content.ComponentName p1, android.service.contentcapture.FlushMetrics p2, android.content.ContentCaptureOptions p3, int p4) {}

    private static class DataShareReadAdapterDelegate extends android.service.contentcapture.IDataShareReadAdapter.Stub {
        private final java.lang.ref.WeakReference<android.service.contentcapture.ContentCaptureService.LocalDataShareAdapterResourceManager> mResourceManagerReference = null;
        private final java.lang.Object mLock = null;
        DataShareReadAdapterDelegate(java.util.concurrent.Executor p0, android.service.contentcapture.DataShareReadAdapter p1, android.service.contentcapture.ContentCaptureService.LocalDataShareAdapterResourceManager p2) { super(); }
        public void start(android.os.ParcelFileDescriptor p0) throws android.os.RemoteException {}
        public void error(int p0) throws android.os.RemoteException {}
        public void finish() throws android.os.RemoteException {}
        private void executeAdapterMethodLocked(java.util.function.Consumer<android.service.contentcapture.DataShareReadAdapter> p0, java.lang.String p1) {}
        private void clearHardReferences() {}
    }

    private static class LocalDataShareAdapterResourceManager {
        private java.util.Map<android.service.contentcapture.ContentCaptureService.DataShareReadAdapterDelegate, android.service.contentcapture.DataShareReadAdapter> mDataShareReadAdapterHardReferences;
        private java.util.Map<android.service.contentcapture.ContentCaptureService.DataShareReadAdapterDelegate, java.util.concurrent.Executor> mExecutorHardReferences;
        private LocalDataShareAdapterResourceManager() {}
        void initializeForDelegate(android.service.contentcapture.ContentCaptureService.DataShareReadAdapterDelegate p0, android.service.contentcapture.DataShareReadAdapter p1, java.util.concurrent.Executor p2) {}
        java.util.concurrent.Executor getExecutor(android.service.contentcapture.ContentCaptureService.DataShareReadAdapterDelegate p0) { return null; }
        android.service.contentcapture.DataShareReadAdapter getAdapter(android.service.contentcapture.ContentCaptureService.DataShareReadAdapterDelegate p0) { return null; }
        void clearHardReferences(android.service.contentcapture.ContentCaptureService.DataShareReadAdapterDelegate p0) {}
    }
}
