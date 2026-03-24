package android.net.wifi;

public interface INetworkRequestMatchCallback extends android.os.IInterface {
    public void onUserSelectionCallbackRegistration(android.net.wifi.INetworkRequestUserSelectionCallback p0) throws android.os.RemoteException;
    public void onAbort() throws android.os.RemoteException;
    public void onMatch(java.util.List<android.net.wifi.ScanResult> p0) throws android.os.RemoteException;
    public void onUserSelectionConnectSuccess(android.net.wifi.WifiConfiguration p0) throws android.os.RemoteException;
    public void onUserSelectionConnectFailure(android.net.wifi.WifiConfiguration p0) throws android.os.RemoteException;

    public static abstract class Stub extends android.os.Binder implements android.net.wifi.INetworkRequestMatchCallback {
        private static final java.lang.String DESCRIPTOR = "android.net.wifi.INetworkRequestMatchCallback";
        static final int TRANSACTION_onUserSelectionCallbackRegistration = 1;
        static final int TRANSACTION_onAbort = 2;
        static final int TRANSACTION_onMatch = 3;
        static final int TRANSACTION_onUserSelectionConnectSuccess = 4;
        static final int TRANSACTION_onUserSelectionConnectFailure = 5;
        public Stub() { super(); }
        public static android.net.wifi.INetworkRequestMatchCallback asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.net.wifi.INetworkRequestMatchCallback p0) { return false; }
        public static android.net.wifi.INetworkRequestMatchCallback getDefaultImpl() { return null; }

        private static class Proxy implements android.net.wifi.INetworkRequestMatchCallback {
            private android.os.IBinder mRemote;
            public static android.net.wifi.INetworkRequestMatchCallback sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onUserSelectionCallbackRegistration(android.net.wifi.INetworkRequestUserSelectionCallback p0) throws android.os.RemoteException {}
            public void onAbort() throws android.os.RemoteException {}
            public void onMatch(java.util.List<android.net.wifi.ScanResult> p0) throws android.os.RemoteException {}
            public void onUserSelectionConnectSuccess(android.net.wifi.WifiConfiguration p0) throws android.os.RemoteException {}
            public void onUserSelectionConnectFailure(android.net.wifi.WifiConfiguration p0) throws android.os.RemoteException {}
        }
    }

    public static class Default implements android.net.wifi.INetworkRequestMatchCallback {
        public Default() {}
        public void onUserSelectionCallbackRegistration(android.net.wifi.INetworkRequestUserSelectionCallback p0) throws android.os.RemoteException {}
        public void onAbort() throws android.os.RemoteException {}
        public void onMatch(java.util.List<android.net.wifi.ScanResult> p0) throws android.os.RemoteException {}
        public void onUserSelectionConnectSuccess(android.net.wifi.WifiConfiguration p0) throws android.os.RemoteException {}
        public void onUserSelectionConnectFailure(android.net.wifi.WifiConfiguration p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }
}
