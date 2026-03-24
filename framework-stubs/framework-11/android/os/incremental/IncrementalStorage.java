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
    public void makeFile(java.lang.String p0, long p1, java.util.UUID p2, byte[] p3, byte[] p4) throws java.io.IOException {}
    public void makeFileFromRange(java.lang.String p0, java.lang.String p1, long p2, long p3) throws java.io.IOException {}
    public void makeLink(java.lang.String p0, android.os.incremental.IncrementalStorage p1, java.lang.String p2) throws java.io.IOException {}
    public void unlink(java.lang.String p0) throws java.io.IOException {}
    public void moveFile(java.lang.String p0, java.lang.String p1) throws java.io.IOException {}
    public void moveDir(java.lang.String p0, java.lang.String p1) throws java.io.IOException {}
    public boolean isFileFullyLoaded(java.lang.String p0) { return false; }
    public boolean isFileRangeLoaded(java.lang.String p0, long p1, long p2) { return false; }
    public byte[] getFileMetadata(java.lang.String p0) { return null; }
    public byte[] getFileMetadata(java.util.UUID p0) { return null; }
    public boolean startLoading() { return false; }
    public static byte[] idToBytes(java.util.UUID p0) { return null; }
    public static java.util.UUID bytesToId(byte[] p0) throws java.lang.IllegalArgumentException { return null; }
    public void disableReadLogs() {}
    private static void validateV4Signature(byte[] p0) throws java.io.IOException {}
    public boolean configureNativeBinaries(java.lang.String p0, java.lang.String p1, java.lang.String p2, boolean p3) { return false; }
    public boolean waitForNativeBinariesExtraction() { return false; }
}
