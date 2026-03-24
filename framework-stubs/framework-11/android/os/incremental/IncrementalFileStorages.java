package android.os.incremental;

public final class IncrementalFileStorages {
    private static final java.lang.String TAG = "IncrementalFileStorages";
    private final android.os.incremental.IncrementalManager mIncrementalManager = null;
    private final java.io.File mStageDir = null;
    private android.os.incremental.IncrementalStorage mDefaultStorage;
    public static android.os.incremental.IncrementalFileStorages initialize(android.content.Context p0, java.io.File p1, android.content.pm.DataLoaderParams p2, android.content.pm.IDataLoaderStatusListener p3, android.os.incremental.StorageHealthCheckParams p4, android.os.incremental.IStorageHealthListener p5, java.util.List<android.content.pm.InstallationFileParcel> p6) throws java.io.IOException { return null; }
    private IncrementalFileStorages(java.io.File p0, android.os.incremental.IncrementalManager p1, android.content.pm.DataLoaderParams p2, android.content.pm.IDataLoaderStatusListener p3, android.os.incremental.StorageHealthCheckParams p4, android.os.incremental.IStorageHealthListener p5) throws java.io.IOException {}
    private void addApkFile(android.content.pm.InstallationFileParcel p0) throws java.io.IOException {}
    public void startLoading() throws java.io.IOException {}
    public void disableReadLogs() {}
    public void cleanUp() {}
}
