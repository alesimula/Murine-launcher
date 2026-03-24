package android.security.identity;

public interface ICredentialStoreFactory extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.security.identity.ICredentialStoreFactory";
    public static final int CREDENTIAL_STORE_TYPE_DEFAULT = 0;
    public static final int CREDENTIAL_STORE_TYPE_DIRECT_ACCESS = 1;
    public android.security.identity.ICredentialStore getCredentialStore(int p0) throws android.os.RemoteException;

    public static class Default implements android.security.identity.ICredentialStoreFactory {
        public Default() {}
        public android.security.identity.ICredentialStore getCredentialStore(int p0) throws android.os.RemoteException { return null; }
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.security.identity.ICredentialStoreFactory {
        static final int TRANSACTION_getCredentialStore = 1;
        public Stub() { super(); }
        public static android.security.identity.ICredentialStoreFactory asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.security.identity.ICredentialStoreFactory {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public android.security.identity.ICredentialStore getCredentialStore(int p0) throws android.os.RemoteException { return null; }
        }
    }
}
