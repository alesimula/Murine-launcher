package android.security.keystore;

public interface IKeystoreOperationResultCallback extends android.os.IInterface {
    public void onFinished(android.security.keymaster.OperationResult p0) throws android.os.RemoteException;

    public static abstract class Stub extends android.os.Binder implements android.security.keystore.IKeystoreOperationResultCallback {
        private static final java.lang.String DESCRIPTOR = "android.security.keystore.IKeystoreOperationResultCallback";
        static final int TRANSACTION_onFinished = 1;
        public Stub() { super(); }
        public static android.security.keystore.IKeystoreOperationResultCallback asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.security.keystore.IKeystoreOperationResultCallback p0) { return false; }
        public static android.security.keystore.IKeystoreOperationResultCallback getDefaultImpl() { return null; }

        private static class Proxy implements android.security.keystore.IKeystoreOperationResultCallback {
            private android.os.IBinder mRemote;
            public static android.security.keystore.IKeystoreOperationResultCallback sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onFinished(android.security.keymaster.OperationResult p0) throws android.os.RemoteException {}
        }
    }

    public static class Default implements android.security.keystore.IKeystoreOperationResultCallback {
        public Default() {}
        public void onFinished(android.security.keymaster.OperationResult p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }
}
