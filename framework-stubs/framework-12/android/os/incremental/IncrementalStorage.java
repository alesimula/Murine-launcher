package android.os.incremental;

public final class IncrementalStorage {
    private static final java.lang.String TAG = "IncrementalStorage";
    private final int mId = 0;
    private final android.os.incremental.IIncrementalService mService = null;
    private static final int UUID_BYTE_SIZE = 16;
    private static final int INCFS_MAX_HASH_SIZE = 32;
    private static final int INCFS_MAX_ADD_DATA_SIZE = 128;
    public IncrementalStorage(android.os.incremental.IIncrementalService p0, int p1) {}
    public int getId() { return 0; }
    public void bind(java.lang.String p0) throws java.io.IOException {}
    public void bind(java.lang.String p0, java.lang.String p1) throws java.io.IOException {}
    public void bindPermanent(java.lang.String p0) throws java.io.IOException {}
    public void bindPermanent(java.lang.String p0, java.lang.String p1) throws java.io.IOException {}
    public void unBind(java.lang.String p0) throws java.io.IOException {}
    public void makeDirectory(java.lang.String p0) throws java.io.IOException {}
    public void makeDirectories(java.lang.String p0) throws java.io.IOException {}
    public void makeFile(java.lang.String p0, long p1, java.util.UUID p2, byte[] p3, byte[] p4, byte[] p5) throws java.io.IOException {}
    public void makeFileFromRange(java.lang.String p0, java.lang.String p1, long p2, long p3) throws java.io.IOException {}
    public void makeLink(java.lang.String p0, android.os.incremental.IncrementalStorage p1, java.lang.String p2) throws java.io.IOException {}
    public void unlink(java.lang.String p0) throws java.io.IOException {}
    public void moveFile(java.lang.String p0, java.lang.String p1) throws java.io.IOException {}
    public void moveDir(java.lang.String p0, java.lang.String p1) throws java.io.IOException {}
    public boolean isFileFullyLoaded(java.lang.String p0) throws java.io.IOException { return false; }
    public boolean isFullyLoaded() throws java.io.IOException { return false; }
    public float getLoadingProgress() throws java.io.IOException { return 0.0f; }
    public byte[] getFileMetadata(java.lang.String p0) { return null; }
    public byte[] getFileMetadata(java.util.UUID p0) { return null; }
    public boolean startLoading(android.content.pm.DataLoaderParams p0, android.content.pm.IDataLoaderStatusListener p1, android.os.incremental.StorageHealthCheckParams p2, android.os.incremental.IStorageHealthListener p3, android.os.incremental.PerUidReadTimeouts[] p4) { return false; }
    public void onInstallationComplete() {}
    public static byte[] idToBytes(java.util.UUID p0) { return null; }
    public static java.util.UUID bytesToId(byte[] p0) throws java.lang.IllegalArgumentException { return null; }
    public void disallowReadLogs() {}
    private static void validateV4Signature(byte[] p0) throws java.io.IOException {}
    public boolean configureNativeBinaries(java.lang.String p0, java.lang.String p1, java.lang.String p2, boolean p3) { return false; }
    public boolean waitForNativeBinariesExtraction() { return false; }
    public boolean registerLoadingProgressListener(android.os.incremental.IStorageLoadingProgressListener p0) { return false; }
    public boolean unregisterLoadingProgressListener() { return false; }
    public android.os.PersistableBundle getMetrics() { return null; }
}
