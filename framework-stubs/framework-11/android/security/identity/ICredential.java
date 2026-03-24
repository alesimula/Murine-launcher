package android.security.identity;

public interface ICredential extends android.os.IInterface {
    public static final int STATUS_OK = 0;
    public static final int STATUS_NO_SUCH_ENTRY = 1;
    public static final int STATUS_NOT_REQUESTED = 2;
    public static final int STATUS_NOT_IN_REQUEST_MESSAGE = 3;
    public static final int STATUS_USER_AUTHENTICATION_FAILED = 4;
    public static final int STATUS_READER_AUTHENTICATION_FAILED = 5;
    public static final int STATUS_NO_ACCESS_CONTROL_PROFILES = 6;
    public byte[] createEphemeralKeyPair() throws android.os.RemoteException;
    public void setReaderEphemeralPublicKey(byte[] p0) throws android.os.RemoteException;
    public byte[] deleteCredential() throws android.os.RemoteException;
    public byte[] getCredentialKeyCertificateChain() throws android.os.RemoteException;
    public long selectAuthKey(boolean p0) throws android.os.RemoteException;
    public android.security.identity.GetEntriesResultParcel getEntries(byte[] p0, android.security.identity.RequestNamespaceParcel[] p1, byte[] p2, byte[] p3, boolean p4) throws android.os.RemoteException;
    public void setAvailableAuthenticationKeys(int p0, int p1) throws android.os.RemoteException;
    public android.security.identity.AuthKeyParcel[] getAuthKeysNeedingCertification() throws android.os.RemoteException;
    public void storeStaticAuthenticationData(android.security.identity.AuthKeyParcel p0, byte[] p1) throws android.os.RemoteException;
    public int[] getAuthenticationDataUsageCount() throws android.os.RemoteException;

    public static class Default implements android.security.identity.ICredential {
        public Default() {}
        public byte[] createEphemeralKeyPair() throws android.os.RemoteException { return null; }
        public void setReaderEphemeralPublicKey(byte[] p0) throws android.os.RemoteException {}
        public byte[] deleteCredential() throws android.os.RemoteException { return null; }
        public byte[] getCredentialKeyCertificateChain() throws android.os.RemoteException { return null; }
        public long selectAuthKey(boolean p0) throws android.os.RemoteException { return 0L; }
        public android.security.identity.GetEntriesResultParcel getEntries(byte[] p0, android.security.identity.RequestNamespaceParcel[] p1, byte[] p2, byte[] p3, boolean p4) throws android.os.RemoteException { return null; }
        public void setAvailableAuthenticationKeys(int p0, int p1) throws android.os.RemoteException {}
        public android.security.identity.AuthKeyParcel[] getAuthKeysNeedingCertification() throws android.os.RemoteException { return null; }
        public void storeStaticAuthenticationData(android.security.identity.AuthKeyParcel p0, byte[] p1) throws android.os.RemoteException {}
        public int[] getAuthenticationDataUsageCount() throws android.os.RemoteException { return null; }
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.security.identity.ICredential {
        private static final java.lang.String DESCRIPTOR = "android.security.identity.ICredential";
        static final int TRANSACTION_createEphemeralKeyPair = 1;
        static final int TRANSACTION_setReaderEphemeralPublicKey = 2;
        static final int TRANSACTION_deleteCredential = 3;
        static final int TRANSACTION_getCredentialKeyCertificateChain = 4;
        static final int TRANSACTION_selectAuthKey = 5;
        static final int TRANSACTION_getEntries = 6;
        static final int TRANSACTION_setAvailableAuthenticationKeys = 7;
        static final int TRANSACTION_getAuthKeysNeedingCertification = 8;
        static final int TRANSACTION_storeStaticAuthenticationData = 9;
        static final int TRANSACTION_getAuthenticationDataUsageCount = 10;
        public Stub() { super(); }
        public static android.security.identity.ICredential asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.security.identity.ICredential p0) { return false; }
        public static android.security.identity.ICredential getDefaultImpl() { return null; }

        private static class Proxy implements android.security.identity.ICredential {
            private android.os.IBinder mRemote;
            public static android.security.identity.ICredential sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public byte[] createEphemeralKeyPair() throws android.os.RemoteException { return null; }
            public void setReaderEphemeralPublicKey(byte[] p0) throws android.os.RemoteException {}
            public byte[] deleteCredential() throws android.os.RemoteException { return null; }
            public byte[] getCredentialKeyCertificateChain() throws android.os.RemoteException { return null; }
            public long selectAuthKey(boolean p0) throws android.os.RemoteException { return 0L; }
            public android.security.identity.GetEntriesResultParcel getEntries(byte[] p0, android.security.identity.RequestNamespaceParcel[] p1, byte[] p2, byte[] p3, boolean p4) throws android.os.RemoteException { return null; }
            public void setAvailableAuthenticationKeys(int p0, int p1) throws android.os.RemoteException {}
            public android.security.identity.AuthKeyParcel[] getAuthKeysNeedingCertification() throws android.os.RemoteException { return null; }
            public void storeStaticAuthenticationData(android.security.identity.AuthKeyParcel p0, byte[] p1) throws android.os.RemoteException {}
            public int[] getAuthenticationDataUsageCount() throws android.os.RemoteException { return null; }
        }
    }
}
