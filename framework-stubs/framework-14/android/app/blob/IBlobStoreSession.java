package android.app.blob;

public interface IBlobStoreSession extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.app.blob.IBlobStoreSession";
    public android.os.ParcelFileDescriptor openWrite(long p0, long p1) throws android.os.RemoteException;
    public android.os.ParcelFileDescriptor openRead() throws android.os.RemoteException;
    public void allowPackageAccess(java.lang.String p0, byte[] p1) throws android.os.RemoteException;
    public void allowSameSignatureAccess() throws android.os.RemoteException;
    public void allowPublicAccess() throws android.os.RemoteException;
    public boolean isPackageAccessAllowed(java.lang.String p0, byte[] p1) throws android.os.RemoteException;
    public boolean isSameSignatureAccessAllowed() throws android.os.RemoteException;
    public boolean isPublicAccessAllowed() throws android.os.RemoteException;
    public long getSize() throws android.os.RemoteException;
    public void close() throws android.os.RemoteException;
    public void abandon() throws android.os.RemoteException;
    public void commit(android.app.blob.IBlobCommitCallback p0) throws android.os.RemoteException;

    public static class Default implements android.app.blob.IBlobStoreSession {
        public Default() {}
        public android.os.ParcelFileDescriptor openWrite(long p0, long p1) throws android.os.RemoteException { return null; }
        public android.os.ParcelFileDescriptor openRead() throws android.os.RemoteException { return null; }
        public void allowPackageAccess(java.lang.String p0, byte[] p1) throws android.os.RemoteException {}
        public void allowSameSignatureAccess() throws android.os.RemoteException {}
        public void allowPublicAccess() throws android.os.RemoteException {}
        public boolean isPackageAccessAllowed(java.lang.String p0, byte[] p1) throws android.os.RemoteException { return false; }
        public boolean isSameSignatureAccessAllowed() throws android.os.RemoteException { return false; }
        public boolean isPublicAccessAllowed() throws android.os.RemoteException { return false; }
        public long getSize() throws android.os.RemoteException { return 0L; }
        public void close() throws android.os.RemoteException {}
        public void abandon() throws android.os.RemoteException {}
        public void commit(android.app.blob.IBlobCommitCallback p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.app.blob.IBlobStoreSession {
        static final int TRANSACTION_openWrite = 1;
        static final int TRANSACTION_openRead = 2;
        static final int TRANSACTION_allowPackageAccess = 3;
        static final int TRANSACTION_allowSameSignatureAccess = 4;
        static final int TRANSACTION_allowPublicAccess = 5;
        static final int TRANSACTION_isPackageAccessAllowed = 6;
        static final int TRANSACTION_isSameSignatureAccessAllowed = 7;
        static final int TRANSACTION_isPublicAccessAllowed = 8;
        static final int TRANSACTION_getSize = 9;
        static final int TRANSACTION_close = 10;
        static final int TRANSACTION_abandon = 11;
        static final int TRANSACTION_commit = 12;
        public Stub() { super(); }
        public static android.app.blob.IBlobStoreSession asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.app.blob.IBlobStoreSession {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public android.os.ParcelFileDescriptor openWrite(long p0, long p1) throws android.os.RemoteException { return null; }
            public android.os.ParcelFileDescriptor openRead() throws android.os.RemoteException { return null; }
            public void allowPackageAccess(java.lang.String p0, byte[] p1) throws android.os.RemoteException {}
            public void allowSameSignatureAccess() throws android.os.RemoteException {}
            public void allowPublicAccess() throws android.os.RemoteException {}
            public boolean isPackageAccessAllowed(java.lang.String p0, byte[] p1) throws android.os.RemoteException { return false; }
            public boolean isSameSignatureAccessAllowed() throws android.os.RemoteException { return false; }
            public boolean isPublicAccessAllowed() throws android.os.RemoteException { return false; }
            public long getSize() throws android.os.RemoteException { return 0L; }
            public void close() throws android.os.RemoteException {}
            public void abandon() throws android.os.RemoteException {}
            public void commit(android.app.blob.IBlobCommitCallback p0) throws android.os.RemoteException {}
        }
    }
}
