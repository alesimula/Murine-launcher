package android.net.wifi.aware;

public interface IWifiAwareEventCallback extends android.os.IInterface {
    public void onConnectSuccess(int p0) throws android.os.RemoteException;
    public void onConnectFail(int p0) throws android.os.RemoteException;
    public void onIdentityChanged(byte[] p0) throws android.os.RemoteException;

    public static abstract class Stub extends android.os.Binder implements android.net.wifi.aware.IWifiAwareEventCallback {
        private static final java.lang.String DESCRIPTOR = "android.net.wifi.aware.IWifiAwareEventCallback";
        static final int TRANSACTION_onConnectSuccess = 1;
        static final int TRANSACTION_onConnectFail = 2;
        static final int TRANSACTION_onIdentityChanged = 3;
        public Stub() { super(); }
        public static android.net.wifi.aware.IWifiAwareEventCallback asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.net.wifi.aware.IWifiAwareEventCallback p0) { return false; }
        public static android.net.wifi.aware.IWifiAwareEventCallback getDefaultImpl() { return null; }

        private static class Proxy implements android.net.wifi.aware.IWifiAwareEventCallback {
            private android.os.IBinder mRemote;
            public static android.net.wifi.aware.IWifiAwareEventCallback sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onConnectSuccess(int p0) throws android.os.RemoteException {}
            public void onConnectFail(int p0) throws android.os.RemoteException {}
            public void onIdentityChanged(byte[] p0) throws android.os.RemoteException {}
        }
    }

    public static class Default implements android.net.wifi.aware.IWifiAwareEventCallback {
        public Default() {}
        public void onConnectSuccess(int p0) throws android.os.RemoteException {}
        public void onConnectFail(int p0) throws android.os.RemoteException {}
        public void onIdentityChanged(byte[] p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }
}
