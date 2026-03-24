package android.service.contentcapture;

@android.annotation.SystemApi
public abstract class ContentCaptureService extends android.app.Service {
    public static final java.lang.String SERVICE_INTERFACE = "android.service.contentcapture.ContentCaptureService";
    public static final java.lang.String PROTECTION_SERVICE_INTERFACE = "android.service.contentcapture.ContentProtectionService";
    public static final java.lang.String SERVICE_META_DATA = "android.content_capture";
    public static final java.lang.String ASSIST_CONTENT_ACTIVITY_START_KEY = "activity_start_assist_content";
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
    public static void setClientState(com.android.internal.os.IResultReceiver p0, int p1, android.os.IBinder p2) {}

    private static class DataShareReadAdapterDelegate extends android.service.contentcapture.IDataShareReadAdapter.Stub {
        DataShareReadAdapterDelegate(java.util.concurrent.Executor p0, android.service.contentcapture.DataShareReadAdapter p1, android.service.contentcapture.ContentCaptureService.LocalDataShareAdapterResourceManager p2) { super(); }
        public void start(android.os.ParcelFileDescriptor p0) throws android.os.RemoteException {}
        public void error(int p0) throws android.os.RemoteException {}
        public void finish() throws android.os.RemoteException {}
    }

    private static class LocalDataShareAdapterResourceManager {
        void initializeForDelegate(android.service.contentcapture.ContentCaptureService.DataShareReadAdapterDelegate p0, android.service.contentcapture.DataShareReadAdapter p1, java.util.concurrent.Executor p2) {}
        java.util.concurrent.Executor getExecutor(android.service.contentcapture.ContentCaptureService.DataShareReadAdapterDelegate p0) { return null; }
        android.service.contentcapture.DataShareReadAdapter getAdapter(android.service.contentcapture.ContentCaptureService.DataShareReadAdapterDelegate p0) { return null; }
        void clearHardReferences(android.service.contentcapture.ContentCaptureService.DataShareReadAdapterDelegate p0) {}
    }
}
