package android.os.incremental;

public final class IncrementalFileStorages {
    private static final java.lang.String TAG = "IncrementalFileStorages";
    private static final java.lang.String SYSTEM_DATA_LOADER_PACKAGE = "android";
    private final android.os.incremental.IncrementalManager mIncrementalManager = null;
    private final java.io.File mStageDir = null;
    private android.os.incremental.IncrementalStorage mInheritedStorage;
    private android.os.incremental.IncrementalStorage mDefaultStorage;
    public static android.os.incremental.IncrementalFileStorages initialize(android.content.Context p0, java.io.File p1, java.io.File p2, android.content.pm.DataLoaderParams p3, android.content.pm.IDataLoaderStatusListener p4, android.os.incremental.StorageHealthCheckParams p5, android.os.incremental.IStorageHealthListener p6, java.util.List<android.content.pm.InstallationFileParcel> p7, android.os.incremental.PerUidReadTimeouts[] p8, android.content.pm.IPackageLoadingProgressCallback p9) throws java.io.IOException { return null; }
    private IncrementalFileStorages(java.io.File p0, java.io.File p1, android.os.incremental.IncrementalManager p2, android.content.pm.DataLoaderParams p3) throws java.io.IOException {}
    private void addApkFile(android.content.pm.InstallationFileParcel p0) throws java.io.IOException {}
    public void startLoading(android.content.pm.DataLoaderParams p0, android.content.pm.IDataLoaderStatusListener p1, android.os.incremental.StorageHealthCheckParams p2, android.os.incremental.IStorageHealthListener p3, android.os.incremental.PerUidReadTimeouts[] p4) throws java.io.IOException {}
    public void makeFile(java.lang.String p0, byte[] p1) throws java.io.IOException {}
    public boolean makeLink(java.lang.String p0, java.lang.String p1, java.lang.String p2) throws java.io.IOException { return false; }
    public void disallowReadLogs() {}
    public void cleanUpAndMarkComplete() {}
    private android.os.incremental.IncrementalStorage cleanUp() { return null; }
}
