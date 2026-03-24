package android.service.dataloader;

@android.annotation.SystemApi
public abstract class DataLoaderService extends android.app.Service {
    public DataLoaderService() { super(); }
    @android.annotation.SystemApi
    @android.annotation.Nullable
    public android.service.dataloader.DataLoaderService.DataLoader onCreateDataLoader(android.content.pm.DataLoaderParams p0) { return null; }
    @android.annotation.NonNull
    public final android.os.IBinder onBind(android.content.Intent p0) { return null; }

    @android.annotation.SystemApi
    public static interface DataLoader {
        public boolean onCreate(android.content.pm.DataLoaderParams p0, android.service.dataloader.DataLoaderService.FileSystemConnector p1);
        public boolean onPrepareImage(java.util.Collection<android.content.pm.InstallationFile> p0, java.util.Collection<java.lang.String> p1);
    }

    private class DataLoaderBinderService extends android.content.pm.IDataLoader.Stub {
        public void create(int p0, android.content.pm.DataLoaderParamsParcel p1, android.content.pm.FileSystemControlParcel p2, android.content.pm.IDataLoaderStatusListener p3) throws java.lang.RuntimeException {}
        public void start(int p0) {}
        public void stop(int p0) {}
        public void destroy(int p0) {}
        public void prepareImage(int p0, android.content.pm.InstallationFileParcel[] p1, java.lang.String[] p2) {}
    }

    @android.annotation.SystemApi
    public static final class FileSystemConnector {
        FileSystemConnector(long p0) {}
        @android.annotation.RequiresPermission("android.permission.INSTALL_PACKAGES")
        public void writeData(java.lang.String p0, long p1, long p2, android.os.ParcelFileDescriptor p3) throws java.io.IOException {}
    }
}
