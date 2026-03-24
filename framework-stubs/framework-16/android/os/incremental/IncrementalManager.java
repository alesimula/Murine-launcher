package android.os.incremental;

public final class IncrementalManager {
    public static final int MIN_VERSION_TO_SUPPORT_FSVERITY = 2;
    public static final int CREATE_MODE_TEMPORARY_BIND = 1;
    public static final int CREATE_MODE_PERMANENT_BIND = 2;
    public static final int CREATE_MODE_CREATE = 4;
    public static final int CREATE_MODE_OPEN_EXISTING = 8;
    public IncrementalManager(android.os.incremental.IIncrementalService p0) {}
    @android.annotation.Nullable
    public android.os.incremental.IncrementalStorage createStorage(java.lang.String p0, android.content.pm.DataLoaderParams p1, int p2) { return null; }
    @android.annotation.Nullable
    public android.os.incremental.IncrementalStorage openStorage(java.lang.String p0) { return null; }
    @android.annotation.Nullable
    public android.os.incremental.IncrementalStorage createStorage(java.lang.String p0, android.os.incremental.IncrementalStorage p1, int p2) { return null; }
    public void linkCodePath(java.io.File p0, java.io.File p1) throws java.lang.IllegalArgumentException, java.io.IOException {}
    public static boolean isFeatureEnabled() { return false; }
    public static int getVersion() { return 0; }
    public static boolean isAllowed() { return false; }
    public static boolean isIncrementalPath(java.lang.String p0) { return false; }
    public static boolean isIncrementalFileFd(java.io.FileDescriptor p0) { return false; }
    @android.annotation.Nullable
    public static byte[] unsafeGetFileSignature(java.lang.String p0) { return null; }
    public void rmPackageDir(java.io.File p0) {}
    public boolean registerLoadingProgressCallback(java.lang.String p0, android.content.pm.IPackageLoadingProgressCallback p1) { return false; }
    public void unregisterLoadingProgressCallbacks(java.lang.String p0) {}
    public android.os.incremental.IncrementalMetrics getMetrics(java.lang.String p0) { return null; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface CreateMode {
    }

    private static class LoadingProgressCallbacks extends android.os.incremental.IStorageLoadingProgressListener.Stub {
        public void cleanUpCallbacks(android.os.incremental.IncrementalStorage p0) {}
        public boolean registerCallback(android.os.incremental.IncrementalStorage p0, android.content.pm.IPackageLoadingProgressCallback p1) { return false; }
        public void onStorageLoadingProgressChanged(int p0, float p1) {}
    }
}
