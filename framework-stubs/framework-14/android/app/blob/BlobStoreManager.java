package android.app.blob;

public class BlobStoreManager {
    public static final int COMMIT_RESULT_SUCCESS = 0;
    public static final int COMMIT_RESULT_ERROR = 1;
    public static final int INVALID_RES_ID = -1;
    public BlobStoreManager(android.content.Context p0, android.app.blob.IBlobStoreManager p1) {}
    public long createSession(android.app.blob.BlobHandle p0) throws java.io.IOException { return 0L; }
    public android.app.blob.BlobStoreManager.Session openSession(long p0) throws java.io.IOException { return null; }
    public void abandonSession(long p0) throws java.io.IOException {}
    public android.os.ParcelFileDescriptor openBlob(android.app.blob.BlobHandle p0) throws java.io.IOException { return null; }
    public void acquireLease(android.app.blob.BlobHandle p0, int p1, long p2) throws java.io.IOException {}
    public void acquireLease(android.app.blob.BlobHandle p0, java.lang.CharSequence p1, long p2) throws java.io.IOException {}
    public void acquireLease(android.app.blob.BlobHandle p0, int p1) throws java.io.IOException {}
    public void acquireLease(android.app.blob.BlobHandle p0, java.lang.CharSequence p1) throws java.io.IOException {}
    public void releaseLease(android.app.blob.BlobHandle p0) throws java.io.IOException {}
    public void releaseAllLeases() throws java.lang.Exception {}
    public long getRemainingLeaseQuotaBytes() { return 0L; }
    public void waitForIdle(long p0) throws java.lang.InterruptedException, java.util.concurrent.TimeoutException {}
    public java.util.List<android.app.blob.BlobInfo> queryBlobsForUser(android.os.UserHandle p0) throws java.io.IOException { return null; }
    public void deleteBlob(android.app.blob.BlobInfo p0) throws java.io.IOException {}
    public java.util.List<android.app.blob.BlobHandle> getLeasedBlobs() throws java.io.IOException { return null; }
    public android.app.blob.LeaseInfo getLeaseInfo(android.app.blob.BlobHandle p0) throws java.io.IOException { return null; }

    public static class Session implements java.io.Closeable {
        public android.os.ParcelFileDescriptor openWrite(long p0, long p1) throws java.io.IOException { return null; }
        public android.os.ParcelFileDescriptor openRead() throws java.io.IOException { return null; }
        public long getSize() throws java.io.IOException { return 0L; }
        public void close() throws java.io.IOException {}
        public void abandon() throws java.io.IOException {}
        public void allowPackageAccess(java.lang.String p0, byte[] p1) throws java.io.IOException {}
        public boolean isPackageAccessAllowed(java.lang.String p0, byte[] p1) throws java.io.IOException { return false; }
        public void allowSameSignatureAccess() throws java.io.IOException {}
        public boolean isSameSignatureAccessAllowed() throws java.io.IOException { return false; }
        public void allowPublicAccess() throws java.io.IOException {}
        public boolean isPublicAccessAllowed() throws java.io.IOException { return false; }
        public void commit(java.util.concurrent.Executor p0, java.util.function.Consumer<java.lang.Integer> p1) throws java.io.IOException {}
    }
}
