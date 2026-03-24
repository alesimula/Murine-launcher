package android.service.dataloader;

@android.annotation.SystemApi
public abstract class DataLoaderService extends android.app.Service {
    private static final java.lang.String TAG = "DataLoaderService";
    private final android.service.dataloader.DataLoaderService.DataLoaderBinderService mBinder = null;
    public DataLoaderService() { super(); }
    @android.annotation.SystemApi
    public android.service.dataloader.DataLoaderService.DataLoader onCreateDataLoader(android.content.pm.DataLoaderParams p0) { return null; }
    public final android.os.IBinder onBind(android.content.Intent p0) { return null; }
    private native boolean nativeCreateDataLoader(int p0, android.content.pm.FileSystemControlParcel p1, android.content.pm.DataLoaderParamsParcel p2, android.content.pm.IDataLoaderStatusListener p3);
    private native boolean nativeStartDataLoader(int p0);
    private native boolean nativeStopDataLoader(int p0);
    private native boolean nativeDestroyDataLoader(int p0);
    private native boolean nativePrepareImage(int p0, android.content.pm.InstallationFileParcel[] p1, java.lang.String[] p2);
    private static native void nativeWriteData(long p0, java.lang.String p1, long p2, long p3, android.os.ParcelFileDescriptor p4);

    @android.annotation.SystemApi
    public static interface DataLoader {
        public boolean onCreate(android.content.pm.DataLoaderParams p0, android.service.dataloader.DataLoaderService.FileSystemConnector p1);
        public boolean onPrepareImage(java.util.Collection<android.content.pm.InstallationFile> p0, java.util.Collection<java.lang.String> p1);
    }

    private class DataLoaderBinderService extends android.content.pm.IDataLoader.Stub {
        private DataLoaderBinderService(android.service.dataloader.DataLoaderService p0) { super(); }
        public void create(int p0, android.content.pm.DataLoaderParamsParcel p1, android.content.pm.FileSystemControlParcel p2, android.content.pm.IDataLoaderStatusListener p3) throws java.lang.RuntimeException {}
        public void start(int p0) {}
        public void stop(int p0) {}
        public void destroy(int p0) {}
        public void prepareImage(int p0, android.content.pm.InstallationFileParcel[] p1, java.lang.String[] p2) {}
    }

    @android.annotation.SystemApi
    public static final class FileSystemConnector {
        private final long mNativeInstance = 0L;
        FileSystemConnector(long p0) {}
        @android.annotation.RequiresPermission("android.permission.INSTALL_PACKAGES")
        public void writeData(java.lang.String p0, long p1, long p2, android.os.ParcelFileDescriptor p3) throws java.io.IOException {}
    }
}
