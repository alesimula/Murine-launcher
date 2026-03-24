package android.credentials;

public interface IPrepareGetCredentialCallback extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.credentials.IPrepareGetCredentialCallback";
    public void onResponse(android.credentials.PrepareGetCredentialResponseInternal p0) throws android.os.RemoteException;
    public void onError(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException;

    public static class Default implements android.credentials.IPrepareGetCredentialCallback {
        public Default() {}
        public void onResponse(android.credentials.PrepareGetCredentialResponseInternal p0) throws android.os.RemoteException {}
        public void onError(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.credentials.IPrepareGetCredentialCallback {
        static final int TRANSACTION_onResponse = 1;
        static final int TRANSACTION_onError = 2;
        public Stub() { super(); }
        public static android.credentials.IPrepareGetCredentialCallback asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.credentials.IPrepareGetCredentialCallback {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onResponse(android.credentials.PrepareGetCredentialResponseInternal p0) throws android.os.RemoteException {}
            public void onError(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException {}
        }
    }
}
