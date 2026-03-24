package android.security.identity;

public interface ICredentialStore extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.security.identity.ICredentialStore";
    public static final int ERROR_NONE = 0;
    public static final int ERROR_GENERIC = 1;
    public static final int ERROR_ALREADY_PERSONALIZED = 2;
    public static final int ERROR_NO_SUCH_CREDENTIAL = 3;
    public static final int ERROR_CIPHER_SUITE_NOT_SUPPORTED = 4;
    public static final int ERROR_EPHEMERAL_PUBLIC_KEY_NOT_FOUND = 5;
    public static final int ERROR_NO_AUTHENTICATION_KEY_AVAILABLE = 6;
    public static final int ERROR_INVALID_READER_SIGNATURE = 7;
    public static final int ERROR_DOCUMENT_TYPE_NOT_SUPPORTED = 8;
    public static final int ERROR_AUTHENTICATION_KEY_NOT_FOUND = 9;
    public static final int ERROR_INVALID_ITEMS_REQUEST_MESSAGE = 10;
    public static final int ERROR_SESSION_TRANSCRIPT_MISMATCH = 11;
    public static final int ERROR_NOT_SUPPORTED = 12;
    public android.security.identity.SecurityHardwareInfoParcel getSecurityHardwareInfo() throws android.os.RemoteException;
    public android.security.identity.IWritableCredential createCredential(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException;
    public android.security.identity.ICredential getCredentialByName(java.lang.String p0, int p1) throws android.os.RemoteException;
    public android.security.identity.ISession createPresentationSession(int p0) throws android.os.RemoteException;

    public static class Default implements android.security.identity.ICredentialStore {
        public Default() {}
        public android.security.identity.SecurityHardwareInfoParcel getSecurityHardwareInfo() throws android.os.RemoteException { return null; }
        public android.security.identity.IWritableCredential createCredential(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException { return null; }
        public android.security.identity.ICredential getCredentialByName(java.lang.String p0, int p1) throws android.os.RemoteException { return null; }
        public android.security.identity.ISession createPresentationSession(int p0) throws android.os.RemoteException { return null; }
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.security.identity.ICredentialStore {
        static final int TRANSACTION_getSecurityHardwareInfo = 1;
        static final int TRANSACTION_createCredential = 2;
        static final int TRANSACTION_getCredentialByName = 3;
        static final int TRANSACTION_createPresentationSession = 4;
        public Stub() { super(); }
        public static android.security.identity.ICredentialStore asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.security.identity.ICredentialStore {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public android.security.identity.SecurityHardwareInfoParcel getSecurityHardwareInfo() throws android.os.RemoteException { return null; }
            public android.security.identity.IWritableCredential createCredential(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException { return null; }
            public android.security.identity.ICredential getCredentialByName(java.lang.String p0, int p1) throws android.os.RemoteException { return null; }
            public android.security.identity.ISession createPresentationSession(int p0) throws android.os.RemoteException { return null; }
        }
    }
}
