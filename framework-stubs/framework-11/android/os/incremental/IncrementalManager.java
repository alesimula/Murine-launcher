package android.os.incremental;

public final class IncrementalManager {
    private static final java.lang.String TAG = "IncrementalManager";
    private static final java.lang.String ALLOWED_PROPERTY = "incremental.allowed";
    public static final int CREATE_MODE_TEMPORARY_BIND = 1;
    public static final int CREATE_MODE_PERMANENT_BIND = 2;
    public static final int CREATE_MODE_CREATE = 4;
    public static final int CREATE_MODE_OPEN_EXISTING = 8;
    private final android.os.incremental.IIncrementalService mService = null;
    private final android.util.SparseArray<android.os.incremental.IncrementalStorage> mStorages = null;
    public IncrementalManager(android.os.incremental.IIncrementalService p0) {}
    public android.os.incremental.IncrementalStorage getStorage(int p0) { return null; }
    public android.os.incremental.IncrementalStorage createStorage(java.lang.String p0, android.content.pm.DataLoaderParams p1, int p2, boolean p3, android.content.pm.IDataLoaderStatusListener p4, android.os.incremental.StorageHealthCheckParams p5, android.os.incremental.IStorageHealthListener p6) { return null; }
    public android.os.incremental.IncrementalStorage openStorage(java.lang.String p0) { return null; }
    public android.os.incremental.IncrementalStorage createStorage(java.lang.String p0, android.os.incremental.IncrementalStorage p1, int p2) { return null; }
    public void renameCodePath(java.io.File p0, java.io.File p1) throws java.lang.IllegalArgumentException, java.io.IOException {}
    private void linkFiles(android.os.incremental.IncrementalStorage p0, java.io.File p1, java.lang.String p2, android.os.incremental.IncrementalStorage p3, java.lang.String p4) throws java.io.IOException {}
    public void closeStorage(java.lang.String p0) {}
    public static boolean isFeatureEnabled() { return false; }
    public static boolean isAllowed() { return false; }
    public static boolean isIncrementalPath(java.lang.String p0) { return false; }
    public static byte[] unsafeGetFileSignature(java.lang.String p0) { return null; }
    private static native boolean nativeIsEnabled();
    private static native boolean nativeIsIncrementalPath(java.lang.String p0);
    private static native byte[] nativeUnsafeGetFileSignature(java.lang.String p0);

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface CreateMode {
    }
}
