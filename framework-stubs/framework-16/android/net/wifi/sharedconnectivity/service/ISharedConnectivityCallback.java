package android.net.wifi.sharedconnectivity.service;

public interface ISharedConnectivityCallback extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.net.wifi.sharedconnectivity.service.ISharedConnectivityCallback";
    public void onHotspotNetworksUpdated(java.util.List<android.net.wifi.sharedconnectivity.app.HotspotNetwork> p0) throws android.os.RemoteException;
    public void onHotspotNetworkConnectionStatusChanged(android.net.wifi.sharedconnectivity.app.HotspotNetworkConnectionStatus p0) throws android.os.RemoteException;
    public void onKnownNetworksUpdated(java.util.List<android.net.wifi.sharedconnectivity.app.KnownNetwork> p0) throws android.os.RemoteException;
    public void onKnownNetworkConnectionStatusChanged(android.net.wifi.sharedconnectivity.app.KnownNetworkConnectionStatus p0) throws android.os.RemoteException;
    public void onSharedConnectivitySettingsChanged(android.net.wifi.sharedconnectivity.app.SharedConnectivitySettingsState p0) throws android.os.RemoteException;
    public void onServiceConnected() throws android.os.RemoteException;
    public void onServiceDisconnected() throws android.os.RemoteException;

    public static class Default implements android.net.wifi.sharedconnectivity.service.ISharedConnectivityCallback {
        public Default() {}
        public void onHotspotNetworksUpdated(java.util.List<android.net.wifi.sharedconnectivity.app.HotspotNetwork> p0) throws android.os.RemoteException {}
        public void onHotspotNetworkConnectionStatusChanged(android.net.wifi.sharedconnectivity.app.HotspotNetworkConnectionStatus p0) throws android.os.RemoteException {}
        public void onKnownNetworksUpdated(java.util.List<android.net.wifi.sharedconnectivity.app.KnownNetwork> p0) throws android.os.RemoteException {}
        public void onKnownNetworkConnectionStatusChanged(android.net.wifi.sharedconnectivity.app.KnownNetworkConnectionStatus p0) throws android.os.RemoteException {}
        public void onSharedConnectivitySettingsChanged(android.net.wifi.sharedconnectivity.app.SharedConnectivitySettingsState p0) throws android.os.RemoteException {}
        public void onServiceConnected() throws android.os.RemoteException {}
        public void onServiceDisconnected() throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.net.wifi.sharedconnectivity.service.ISharedConnectivityCallback {
        static final int TRANSACTION_onHotspotNetworksUpdated = 1;
        static final int TRANSACTION_onHotspotNetworkConnectionStatusChanged = 2;
        static final int TRANSACTION_onKnownNetworksUpdated = 3;
        static final int TRANSACTION_onKnownNetworkConnectionStatusChanged = 4;
        static final int TRANSACTION_onSharedConnectivitySettingsChanged = 5;
        static final int TRANSACTION_onServiceConnected = 6;
        static final int TRANSACTION_onServiceDisconnected = 7;
        public Stub() { super(); }
        public static android.net.wifi.sharedconnectivity.service.ISharedConnectivityCallback asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.net.wifi.sharedconnectivity.service.ISharedConnectivityCallback {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onHotspotNetworksUpdated(java.util.List<android.net.wifi.sharedconnectivity.app.HotspotNetwork> p0) throws android.os.RemoteException {}
            public void onHotspotNetworkConnectionStatusChanged(android.net.wifi.sharedconnectivity.app.HotspotNetworkConnectionStatus p0) throws android.os.RemoteException {}
            public void onKnownNetworksUpdated(java.util.List<android.net.wifi.sharedconnectivity.app.KnownNetwork> p0) throws android.os.RemoteException {}
            public void onKnownNetworkConnectionStatusChanged(android.net.wifi.sharedconnectivity.app.KnownNetworkConnectionStatus p0) throws android.os.RemoteException {}
            public void onSharedConnectivitySettingsChanged(android.net.wifi.sharedconnectivity.app.SharedConnectivitySettingsState p0) throws android.os.RemoteException {}
            public void onServiceConnected() throws android.os.RemoteException {}
            public void onServiceDisconnected() throws android.os.RemoteException {}
        }
    }
}
