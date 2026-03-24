package android.security.rkp;

public interface IStoreUpgradedKeyCallback extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.security.rkp.IStoreUpgradedKeyCallback";
    public void onSuccess() throws android.os.RemoteException;
    public void onError(java.lang.String p0) throws android.os.RemoteException;

    public static class Default implements android.security.rkp.IStoreUpgradedKeyCallback {
        public Default() {}
        public void onSuccess() throws android.os.RemoteException {}
        public void onError(java.lang.String p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.security.rkp.IStoreUpgradedKeyCallback {
        static final int TRANSACTION_onSuccess = 1;
        static final int TRANSACTION_onError = 2;
        public Stub() { super(); }
        public static android.security.rkp.IStoreUpgradedKeyCallback asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.security.rkp.IStoreUpgradedKeyCallback {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onSuccess() throws android.os.RemoteException {}
            public void onError(java.lang.String p0) throws android.os.RemoteException {}
        }
    }
}
