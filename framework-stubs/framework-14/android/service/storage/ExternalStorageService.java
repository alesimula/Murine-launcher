package android.service.storage;

@android.annotation.SystemApi
public abstract class ExternalStorageService extends android.app.Service {
    public static final java.lang.String SERVICE_INTERFACE = "android.service.storage.ExternalStorageService";
    public static final int FLAG_SESSION_TYPE_FUSE = 1;
    public static final int FLAG_SESSION_ATTRIBUTE_INDEXABLE = 2;
    public static final java.lang.String EXTRA_SESSION_ID = "android.service.storage.extra.session_id";
    public static final java.lang.String EXTRA_ERROR = "android.service.storage.extra.error";
    public static final java.lang.String EXTRA_PACKAGE_NAME = "android.service.storage.extra.package_name";
    public ExternalStorageService() { super(); }
    public abstract void onStartSession(java.lang.String p0, int p1, android.os.ParcelFileDescriptor p2, java.io.File p3, java.io.File p4) throws java.io.IOException;
    public abstract void onEndSession(java.lang.String p0) throws java.io.IOException;
    public abstract void onVolumeStateChanged(android.os.storage.StorageVolume p0) throws java.io.IOException;
    public void onFreeCache(java.util.UUID p0, long p1) throws java.io.IOException {}
    public void onAnrDelayStarted(java.lang.String p0, int p1, int p2, int p3) {}
    public final android.os.IBinder onBind(android.content.Intent p0) { return null; }

    private class ExternalStorageServiceWrapper extends android.service.storage.IExternalStorageService.Stub {
        public void startSession(java.lang.String p0, int p1, android.os.ParcelFileDescriptor p2, java.lang.String p3, java.lang.String p4, android.os.RemoteCallback p5) throws android.os.RemoteException {}
        public void notifyVolumeStateChanged(java.lang.String p0, android.os.storage.StorageVolume p1, android.os.RemoteCallback p2) {}
        public void freeCache(java.lang.String p0, java.lang.String p1, long p2, android.os.RemoteCallback p3) {}
        public void endSession(java.lang.String p0, android.os.RemoteCallback p1) throws android.os.RemoteException {}
        public void notifyAnrDelayStarted(java.lang.String p0, int p1, int p2, int p3) throws android.os.RemoteException {}
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface SessionFlag {
    }
}
