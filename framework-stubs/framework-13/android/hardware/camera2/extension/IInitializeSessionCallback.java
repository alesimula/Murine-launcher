package android.hardware.camera2.extension;

public interface IInitializeSessionCallback extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.hardware.camera2.extension.IInitializeSessionCallback";
    public void onSuccess() throws android.os.RemoteException;
    public void onFailure() throws android.os.RemoteException;

    public static class Default implements android.hardware.camera2.extension.IInitializeSessionCallback {
        public Default() {}
        public void onSuccess() throws android.os.RemoteException {}
        public void onFailure() throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.hardware.camera2.extension.IInitializeSessionCallback {
        static final int TRANSACTION_onSuccess = 1;
        static final int TRANSACTION_onFailure = 2;
        public Stub() { super(); }
        public static android.hardware.camera2.extension.IInitializeSessionCallback asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.hardware.camera2.extension.IInitializeSessionCallback {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onSuccess() throws android.os.RemoteException {}
            public void onFailure() throws android.os.RemoteException {}
        }
    }
}
