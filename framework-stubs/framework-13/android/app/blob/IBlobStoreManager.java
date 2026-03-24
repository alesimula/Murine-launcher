package android.app.blob;

public interface IBlobStoreManager extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.app.blob.IBlobStoreManager";
    public long createSession(android.app.blob.BlobHandle p0, java.lang.String p1) throws android.os.RemoteException;
    public android.app.blob.IBlobStoreSession openSession(long p0, java.lang.String p1) throws android.os.RemoteException;
    public android.os.ParcelFileDescriptor openBlob(android.app.blob.BlobHandle p0, java.lang.String p1) throws android.os.RemoteException;
    public void abandonSession(long p0, java.lang.String p1) throws android.os.RemoteException;
    public void acquireLease(android.app.blob.BlobHandle p0, int p1, java.lang.CharSequence p2, long p3, java.lang.String p4) throws android.os.RemoteException;
    public void releaseLease(android.app.blob.BlobHandle p0, java.lang.String p1) throws android.os.RemoteException;
    public void releaseAllLeases(java.lang.String p0) throws android.os.RemoteException;
    public long getRemainingLeaseQuotaBytes(java.lang.String p0) throws android.os.RemoteException;
    public void waitForIdle(android.os.RemoteCallback p0) throws android.os.RemoteException;
    public java.util.List<android.app.blob.BlobInfo> queryBlobsForUser(int p0) throws android.os.RemoteException;
    public void deleteBlob(long p0) throws android.os.RemoteException;
    public java.util.List<android.app.blob.BlobHandle> getLeasedBlobs(java.lang.String p0) throws android.os.RemoteException;
    public android.app.blob.LeaseInfo getLeaseInfo(android.app.blob.BlobHandle p0, java.lang.String p1) throws android.os.RemoteException;

    public static class Default implements android.app.blob.IBlobStoreManager {
        public Default() {}
        public long createSession(android.app.blob.BlobHandle p0, java.lang.String p1) throws android.os.RemoteException { return 0L; }
        public android.app.blob.IBlobStoreSession openSession(long p0, java.lang.String p1) throws android.os.RemoteException { return null; }
        public android.os.ParcelFileDescriptor openBlob(android.app.blob.BlobHandle p0, java.lang.String p1) throws android.os.RemoteException { return null; }
        public void abandonSession(long p0, java.lang.String p1) throws android.os.RemoteException {}
        public void acquireLease(android.app.blob.BlobHandle p0, int p1, java.lang.CharSequence p2, long p3, java.lang.String p4) throws android.os.RemoteException {}
        public void releaseLease(android.app.blob.BlobHandle p0, java.lang.String p1) throws android.os.RemoteException {}
        public void releaseAllLeases(java.lang.String p0) throws android.os.RemoteException {}
        public long getRemainingLeaseQuotaBytes(java.lang.String p0) throws android.os.RemoteException { return 0L; }
        public void waitForIdle(android.os.RemoteCallback p0) throws android.os.RemoteException {}
        public java.util.List<android.app.blob.BlobInfo> queryBlobsForUser(int p0) throws android.os.RemoteException { return null; }
        public void deleteBlob(long p0) throws android.os.RemoteException {}
        public java.util.List<android.app.blob.BlobHandle> getLeasedBlobs(java.lang.String p0) throws android.os.RemoteException { return null; }
        public android.app.blob.LeaseInfo getLeaseInfo(android.app.blob.BlobHandle p0, java.lang.String p1) throws android.os.RemoteException { return null; }
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.app.blob.IBlobStoreManager {
        static final int TRANSACTION_createSession = 1;
        static final int TRANSACTION_openSession = 2;
        static final int TRANSACTION_openBlob = 3;
        static final int TRANSACTION_abandonSession = 4;
        static final int TRANSACTION_acquireLease = 5;
        static final int TRANSACTION_releaseLease = 6;
        static final int TRANSACTION_releaseAllLeases = 7;
        static final int TRANSACTION_getRemainingLeaseQuotaBytes = 8;
        static final int TRANSACTION_waitForIdle = 9;
        static final int TRANSACTION_queryBlobsForUser = 10;
        static final int TRANSACTION_deleteBlob = 11;
        static final int TRANSACTION_getLeasedBlobs = 12;
        static final int TRANSACTION_getLeaseInfo = 13;
        public Stub() { super(); }
        public static android.app.blob.IBlobStoreManager asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.app.blob.IBlobStoreManager {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public long createSession(android.app.blob.BlobHandle p0, java.lang.String p1) throws android.os.RemoteException { return 0L; }
            public android.app.blob.IBlobStoreSession openSession(long p0, java.lang.String p1) throws android.os.RemoteException { return null; }
            public android.os.ParcelFileDescriptor openBlob(android.app.blob.BlobHandle p0, java.lang.String p1) throws android.os.RemoteException { return null; }
            public void abandonSession(long p0, java.lang.String p1) throws android.os.RemoteException {}
            public void acquireLease(android.app.blob.BlobHandle p0, int p1, java.lang.CharSequence p2, long p3, java.lang.String p4) throws android.os.RemoteException {}
            public void releaseLease(android.app.blob.BlobHandle p0, java.lang.String p1) throws android.os.RemoteException {}
            public void releaseAllLeases(java.lang.String p0) throws android.os.RemoteException {}
            public long getRemainingLeaseQuotaBytes(java.lang.String p0) throws android.os.RemoteException { return 0L; }
            public void waitForIdle(android.os.RemoteCallback p0) throws android.os.RemoteException {}
            public java.util.List<android.app.blob.BlobInfo> queryBlobsForUser(int p0) throws android.os.RemoteException { return null; }
            public void deleteBlob(long p0) throws android.os.RemoteException {}
            public java.util.List<android.app.blob.BlobHandle> getLeasedBlobs(java.lang.String p0) throws android.os.RemoteException { return null; }
            public android.app.blob.LeaseInfo getLeaseInfo(android.app.blob.BlobHandle p0, java.lang.String p1) throws android.os.RemoteException { return null; }
        }
    }
}
