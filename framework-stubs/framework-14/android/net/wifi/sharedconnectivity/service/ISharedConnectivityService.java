package android.net.wifi.sharedconnectivity.service;

public interface ISharedConnectivityService extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.net.wifi.sharedconnectivity.service.ISharedConnectivityService";
    public void registerCallback(android.net.wifi.sharedconnectivity.service.ISharedConnectivityCallback p0) throws android.os.RemoteException;
    public void unregisterCallback(android.net.wifi.sharedconnectivity.service.ISharedConnectivityCallback p0) throws android.os.RemoteException;
    public void connectHotspotNetwork(android.net.wifi.sharedconnectivity.app.HotspotNetwork p0) throws android.os.RemoteException;
    public void disconnectHotspotNetwork(android.net.wifi.sharedconnectivity.app.HotspotNetwork p0) throws android.os.RemoteException;
    public void connectKnownNetwork(android.net.wifi.sharedconnectivity.app.KnownNetwork p0) throws android.os.RemoteException;
    public void forgetKnownNetwork(android.net.wifi.sharedconnectivity.app.KnownNetwork p0) throws android.os.RemoteException;
    public java.util.List<android.net.wifi.sharedconnectivity.app.HotspotNetwork> getHotspotNetworks() throws android.os.RemoteException;
    public java.util.List<android.net.wifi.sharedconnectivity.app.KnownNetwork> getKnownNetworks() throws android.os.RemoteException;
    public android.net.wifi.sharedconnectivity.app.SharedConnectivitySettingsState getSettingsState() throws android.os.RemoteException;
    public android.net.wifi.sharedconnectivity.app.HotspotNetworkConnectionStatus getHotspotNetworkConnectionStatus() throws android.os.RemoteException;
    public android.net.wifi.sharedconnectivity.app.KnownNetworkConnectionStatus getKnownNetworkConnectionStatus() throws android.os.RemoteException;

    public static class Default implements android.net.wifi.sharedconnectivity.service.ISharedConnectivityService {
        public Default() {}
        public void registerCallback(android.net.wifi.sharedconnectivity.service.ISharedConnectivityCallback p0) throws android.os.RemoteException {}
        public void unregisterCallback(android.net.wifi.sharedconnectivity.service.ISharedConnectivityCallback p0) throws android.os.RemoteException {}
        public void connectHotspotNetwork(android.net.wifi.sharedconnectivity.app.HotspotNetwork p0) throws android.os.RemoteException {}
        public void disconnectHotspotNetwork(android.net.wifi.sharedconnectivity.app.HotspotNetwork p0) throws android.os.RemoteException {}
        public void connectKnownNetwork(android.net.wifi.sharedconnectivity.app.KnownNetwork p0) throws android.os.RemoteException {}
        public void forgetKnownNetwork(android.net.wifi.sharedconnectivity.app.KnownNetwork p0) throws android.os.RemoteException {}
        public java.util.List<android.net.wifi.sharedconnectivity.app.HotspotNetwork> getHotspotNetworks() throws android.os.RemoteException { return null; }
        public java.util.List<android.net.wifi.sharedconnectivity.app.KnownNetwork> getKnownNetworks() throws android.os.RemoteException { return null; }
        public android.net.wifi.sharedconnectivity.app.SharedConnectivitySettingsState getSettingsState() throws android.os.RemoteException { return null; }
        public android.net.wifi.sharedconnectivity.app.HotspotNetworkConnectionStatus getHotspotNetworkConnectionStatus() throws android.os.RemoteException { return null; }
        public android.net.wifi.sharedconnectivity.app.KnownNetworkConnectionStatus getKnownNetworkConnectionStatus() throws android.os.RemoteException { return null; }
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.net.wifi.sharedconnectivity.service.ISharedConnectivityService {
        static final int TRANSACTION_registerCallback = 1;
        static final int TRANSACTION_unregisterCallback = 2;
        static final int TRANSACTION_connectHotspotNetwork = 3;
        static final int TRANSACTION_disconnectHotspotNetwork = 4;
        static final int TRANSACTION_connectKnownNetwork = 5;
        static final int TRANSACTION_forgetKnownNetwork = 6;
        static final int TRANSACTION_getHotspotNetworks = 7;
        static final int TRANSACTION_getKnownNetworks = 8;
        static final int TRANSACTION_getSettingsState = 9;
        static final int TRANSACTION_getHotspotNetworkConnectionStatus = 10;
        static final int TRANSACTION_getKnownNetworkConnectionStatus = 11;
        public Stub() { super(); }
        public static android.net.wifi.sharedconnectivity.service.ISharedConnectivityService asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.net.wifi.sharedconnectivity.service.ISharedConnectivityService {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void registerCallback(android.net.wifi.sharedconnectivity.service.ISharedConnectivityCallback p0) throws android.os.RemoteException {}
            public void unregisterCallback(android.net.wifi.sharedconnectivity.service.ISharedConnectivityCallback p0) throws android.os.RemoteException {}
            public void connectHotspotNetwork(android.net.wifi.sharedconnectivity.app.HotspotNetwork p0) throws android.os.RemoteException {}
            public void disconnectHotspotNetwork(android.net.wifi.sharedconnectivity.app.HotspotNetwork p0) throws android.os.RemoteException {}
            public void connectKnownNetwork(android.net.wifi.sharedconnectivity.app.KnownNetwork p0) throws android.os.RemoteException {}
            public void forgetKnownNetwork(android.net.wifi.sharedconnectivity.app.KnownNetwork p0) throws android.os.RemoteException {}
            public java.util.List<android.net.wifi.sharedconnectivity.app.HotspotNetwork> getHotspotNetworks() throws android.os.RemoteException { return null; }
            public java.util.List<android.net.wifi.sharedconnectivity.app.KnownNetwork> getKnownNetworks() throws android.os.RemoteException { return null; }
            public android.net.wifi.sharedconnectivity.app.SharedConnectivitySettingsState getSettingsState() throws android.os.RemoteException { return null; }
            public android.net.wifi.sharedconnectivity.app.HotspotNetworkConnectionStatus getHotspotNetworkConnectionStatus() throws android.os.RemoteException { return null; }
            public android.net.wifi.sharedconnectivity.app.KnownNetworkConnectionStatus getKnownNetworkConnectionStatus() throws android.os.RemoteException { return null; }
        }
    }
}
