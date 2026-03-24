package android.security.identity;

public interface IWritableCredential extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.security.identity.IWritableCredential";
    public byte[] getCredentialKeyCertificateChain(byte[] p0) throws android.os.RemoteException;
    public byte[] personalize(android.security.identity.AccessControlProfileParcel[] p0, android.security.identity.EntryNamespaceParcel[] p1, long p2) throws android.os.RemoteException;

    public static class Default implements android.security.identity.IWritableCredential {
        public Default() {}
        public byte[] getCredentialKeyCertificateChain(byte[] p0) throws android.os.RemoteException { return null; }
        public byte[] personalize(android.security.identity.AccessControlProfileParcel[] p0, android.security.identity.EntryNamespaceParcel[] p1, long p2) throws android.os.RemoteException { return null; }
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.security.identity.IWritableCredential {
        static final int TRANSACTION_getCredentialKeyCertificateChain = 1;
        static final int TRANSACTION_personalize = 2;
        public Stub() { super(); }
        public static android.security.identity.IWritableCredential asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.security.identity.IWritableCredential {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public byte[] getCredentialKeyCertificateChain(byte[] p0) throws android.os.RemoteException { return null; }
            public byte[] personalize(android.security.identity.AccessControlProfileParcel[] p0, android.security.identity.EntryNamespaceParcel[] p1, long p2) throws android.os.RemoteException { return null; }
        }
    }
}
