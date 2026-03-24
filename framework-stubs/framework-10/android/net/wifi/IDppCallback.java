package android.net.wifi;

public interface IDppCallback extends android.os.IInterface {
    public void onSuccessConfigReceived(int p0) throws android.os.RemoteException;
    public void onSuccess(int p0) throws android.os.RemoteException;
    public void onFailure(int p0) throws android.os.RemoteException;
    public void onProgress(int p0) throws android.os.RemoteException;

    public static abstract class Stub extends android.os.Binder implements android.net.wifi.IDppCallback {
        private static final java.lang.String DESCRIPTOR = "android.net.wifi.IDppCallback";
        static final int TRANSACTION_onSuccessConfigReceived = 1;
        static final int TRANSACTION_onSuccess = 2;
        static final int TRANSACTION_onFailure = 3;
        static final int TRANSACTION_onProgress = 4;
        public Stub() { super(); }
        public static android.net.wifi.IDppCallback asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.net.wifi.IDppCallback p0) { return false; }
        public static android.net.wifi.IDppCallback getDefaultImpl() { return null; }

        private static class Proxy implements android.net.wifi.IDppCallback {
            private android.os.IBinder mRemote;
            public static android.net.wifi.IDppCallback sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onSuccessConfigReceived(int p0) throws android.os.RemoteException {}
            public void onSuccess(int p0) throws android.os.RemoteException {}
            public void onFailure(int p0) throws android.os.RemoteException {}
            public void onProgress(int p0) throws android.os.RemoteException {}
        }
    }

    public static class Default implements android.net.wifi.IDppCallback {
        public Default() {}
        public void onSuccessConfigReceived(int p0) throws android.os.RemoteException {}
        public void onSuccess(int p0) throws android.os.RemoteException {}
        public void onFailure(int p0) throws android.os.RemoteException {}
        public void onProgress(int p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }
}
