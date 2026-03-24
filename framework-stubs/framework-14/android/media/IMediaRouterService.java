package android.media;

public interface IMediaRouterService extends android.os.IInterface {
    public void registerClientAsUser(android.media.IMediaRouterClient p0, java.lang.String p1, int p2) throws android.os.RemoteException;
    public void unregisterClient(android.media.IMediaRouterClient p0) throws android.os.RemoteException;
    public void registerClientGroupId(android.media.IMediaRouterClient p0, java.lang.String p1) throws android.os.RemoteException;
    public android.media.MediaRouterClientState getState(android.media.IMediaRouterClient p0) throws android.os.RemoteException;
    public boolean isPlaybackActive(android.media.IMediaRouterClient p0) throws android.os.RemoteException;
    public void setBluetoothA2dpOn(android.media.IMediaRouterClient p0, boolean p1) throws android.os.RemoteException;
    public void setDiscoveryRequest(android.media.IMediaRouterClient p0, int p1, boolean p2) throws android.os.RemoteException;
    public void setSelectedRoute(android.media.IMediaRouterClient p0, java.lang.String p1, boolean p2) throws android.os.RemoteException;
    public void requestSetVolume(android.media.IMediaRouterClient p0, java.lang.String p1, int p2) throws android.os.RemoteException;
    public void requestUpdateVolume(android.media.IMediaRouterClient p0, java.lang.String p1, int p2) throws android.os.RemoteException;
    public boolean verifyPackageExists(java.lang.String p0) throws android.os.RemoteException;
    public java.util.List<android.media.MediaRoute2Info> getSystemRoutes() throws android.os.RemoteException;
    public android.media.RoutingSessionInfo getSystemSessionInfo() throws android.os.RemoteException;
    public void registerRouter2(android.media.IMediaRouter2 p0, java.lang.String p1) throws android.os.RemoteException;
    public void unregisterRouter2(android.media.IMediaRouter2 p0) throws android.os.RemoteException;
    public void setDiscoveryRequestWithRouter2(android.media.IMediaRouter2 p0, android.media.RouteDiscoveryPreference p1) throws android.os.RemoteException;
    public void setRouteListingPreference(android.media.IMediaRouter2 p0, android.media.RouteListingPreference p1) throws android.os.RemoteException;
    public void setRouteVolumeWithRouter2(android.media.IMediaRouter2 p0, android.media.MediaRoute2Info p1, int p2) throws android.os.RemoteException;
    public void requestCreateSessionWithRouter2(android.media.IMediaRouter2 p0, int p1, long p2, android.media.RoutingSessionInfo p3, android.media.MediaRoute2Info p4, android.os.Bundle p5) throws android.os.RemoteException;
    public void selectRouteWithRouter2(android.media.IMediaRouter2 p0, java.lang.String p1, android.media.MediaRoute2Info p2) throws android.os.RemoteException;
    public void deselectRouteWithRouter2(android.media.IMediaRouter2 p0, java.lang.String p1, android.media.MediaRoute2Info p2) throws android.os.RemoteException;
    public void transferToRouteWithRouter2(android.media.IMediaRouter2 p0, java.lang.String p1, android.media.MediaRoute2Info p2) throws android.os.RemoteException;
    public void setSessionVolumeWithRouter2(android.media.IMediaRouter2 p0, java.lang.String p1, int p2) throws android.os.RemoteException;
    public void releaseSessionWithRouter2(android.media.IMediaRouter2 p0, java.lang.String p1) throws android.os.RemoteException;
    public java.util.List<android.media.RoutingSessionInfo> getRemoteSessions(android.media.IMediaRouter2Manager p0) throws android.os.RemoteException;
    public android.media.RoutingSessionInfo getSystemSessionInfoForPackage(android.media.IMediaRouter2Manager p0, java.lang.String p1) throws android.os.RemoteException;
    public void registerManager(android.media.IMediaRouter2Manager p0, java.lang.String p1) throws android.os.RemoteException;
    public void unregisterManager(android.media.IMediaRouter2Manager p0) throws android.os.RemoteException;
    public void setRouteVolumeWithManager(android.media.IMediaRouter2Manager p0, int p1, android.media.MediaRoute2Info p2, int p3) throws android.os.RemoteException;
    public void startScan(android.media.IMediaRouter2Manager p0) throws android.os.RemoteException;
    public void stopScan(android.media.IMediaRouter2Manager p0) throws android.os.RemoteException;
    public void requestCreateSessionWithManager(android.media.IMediaRouter2Manager p0, int p1, android.media.RoutingSessionInfo p2, android.media.MediaRoute2Info p3) throws android.os.RemoteException;
    public void selectRouteWithManager(android.media.IMediaRouter2Manager p0, int p1, java.lang.String p2, android.media.MediaRoute2Info p3) throws android.os.RemoteException;
    public void deselectRouteWithManager(android.media.IMediaRouter2Manager p0, int p1, java.lang.String p2, android.media.MediaRoute2Info p3) throws android.os.RemoteException;
    public void transferToRouteWithManager(android.media.IMediaRouter2Manager p0, int p1, java.lang.String p2, android.media.MediaRoute2Info p3) throws android.os.RemoteException;
    public void setSessionVolumeWithManager(android.media.IMediaRouter2Manager p0, int p1, java.lang.String p2, int p3) throws android.os.RemoteException;
    public void releaseSessionWithManager(android.media.IMediaRouter2Manager p0, int p1, java.lang.String p2) throws android.os.RemoteException;
    public boolean showMediaOutputSwitcher(java.lang.String p0) throws android.os.RemoteException;

    public static class Default implements android.media.IMediaRouterService {
        public Default() {}
        public void registerClientAsUser(android.media.IMediaRouterClient p0, java.lang.String p1, int p2) throws android.os.RemoteException {}
        public void unregisterClient(android.media.IMediaRouterClient p0) throws android.os.RemoteException {}
        public void registerClientGroupId(android.media.IMediaRouterClient p0, java.lang.String p1) throws android.os.RemoteException {}
        public android.media.MediaRouterClientState getState(android.media.IMediaRouterClient p0) throws android.os.RemoteException { return null; }
        public boolean isPlaybackActive(android.media.IMediaRouterClient p0) throws android.os.RemoteException { return false; }
        public void setBluetoothA2dpOn(android.media.IMediaRouterClient p0, boolean p1) throws android.os.RemoteException {}
        public void setDiscoveryRequest(android.media.IMediaRouterClient p0, int p1, boolean p2) throws android.os.RemoteException {}
        public void setSelectedRoute(android.media.IMediaRouterClient p0, java.lang.String p1, boolean p2) throws android.os.RemoteException {}
        public void requestSetVolume(android.media.IMediaRouterClient p0, java.lang.String p1, int p2) throws android.os.RemoteException {}
        public void requestUpdateVolume(android.media.IMediaRouterClient p0, java.lang.String p1, int p2) throws android.os.RemoteException {}
        public boolean verifyPackageExists(java.lang.String p0) throws android.os.RemoteException { return false; }
        public java.util.List<android.media.MediaRoute2Info> getSystemRoutes() throws android.os.RemoteException { return null; }
        public android.media.RoutingSessionInfo getSystemSessionInfo() throws android.os.RemoteException { return null; }
        public void registerRouter2(android.media.IMediaRouter2 p0, java.lang.String p1) throws android.os.RemoteException {}
        public void unregisterRouter2(android.media.IMediaRouter2 p0) throws android.os.RemoteException {}
        public void setDiscoveryRequestWithRouter2(android.media.IMediaRouter2 p0, android.media.RouteDiscoveryPreference p1) throws android.os.RemoteException {}
        public void setRouteListingPreference(android.media.IMediaRouter2 p0, android.media.RouteListingPreference p1) throws android.os.RemoteException {}
        public void setRouteVolumeWithRouter2(android.media.IMediaRouter2 p0, android.media.MediaRoute2Info p1, int p2) throws android.os.RemoteException {}
        public void requestCreateSessionWithRouter2(android.media.IMediaRouter2 p0, int p1, long p2, android.media.RoutingSessionInfo p3, android.media.MediaRoute2Info p4, android.os.Bundle p5) throws android.os.RemoteException {}
        public void selectRouteWithRouter2(android.media.IMediaRouter2 p0, java.lang.String p1, android.media.MediaRoute2Info p2) throws android.os.RemoteException {}
        public void deselectRouteWithRouter2(android.media.IMediaRouter2 p0, java.lang.String p1, android.media.MediaRoute2Info p2) throws android.os.RemoteException {}
        public void transferToRouteWithRouter2(android.media.IMediaRouter2 p0, java.lang.String p1, android.media.MediaRoute2Info p2) throws android.os.RemoteException {}
        public void setSessionVolumeWithRouter2(android.media.IMediaRouter2 p0, java.lang.String p1, int p2) throws android.os.RemoteException {}
        public void releaseSessionWithRouter2(android.media.IMediaRouter2 p0, java.lang.String p1) throws android.os.RemoteException {}
        public java.util.List<android.media.RoutingSessionInfo> getRemoteSessions(android.media.IMediaRouter2Manager p0) throws android.os.RemoteException { return null; }
        public android.media.RoutingSessionInfo getSystemSessionInfoForPackage(android.media.IMediaRouter2Manager p0, java.lang.String p1) throws android.os.RemoteException { return null; }
        public void registerManager(android.media.IMediaRouter2Manager p0, java.lang.String p1) throws android.os.RemoteException {}
        public void unregisterManager(android.media.IMediaRouter2Manager p0) throws android.os.RemoteException {}
        public void setRouteVolumeWithManager(android.media.IMediaRouter2Manager p0, int p1, android.media.MediaRoute2Info p2, int p3) throws android.os.RemoteException {}
        public void startScan(android.media.IMediaRouter2Manager p0) throws android.os.RemoteException {}
        public void stopScan(android.media.IMediaRouter2Manager p0) throws android.os.RemoteException {}
        public void requestCreateSessionWithManager(android.media.IMediaRouter2Manager p0, int p1, android.media.RoutingSessionInfo p2, android.media.MediaRoute2Info p3) throws android.os.RemoteException {}
        public void selectRouteWithManager(android.media.IMediaRouter2Manager p0, int p1, java.lang.String p2, android.media.MediaRoute2Info p3) throws android.os.RemoteException {}
        public void deselectRouteWithManager(android.media.IMediaRouter2Manager p0, int p1, java.lang.String p2, android.media.MediaRoute2Info p3) throws android.os.RemoteException {}
        public void transferToRouteWithManager(android.media.IMediaRouter2Manager p0, int p1, java.lang.String p2, android.media.MediaRoute2Info p3) throws android.os.RemoteException {}
        public void setSessionVolumeWithManager(android.media.IMediaRouter2Manager p0, int p1, java.lang.String p2, int p3) throws android.os.RemoteException {}
        public void releaseSessionWithManager(android.media.IMediaRouter2Manager p0, int p1, java.lang.String p2) throws android.os.RemoteException {}
        public boolean showMediaOutputSwitcher(java.lang.String p0) throws android.os.RemoteException { return false; }
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.media.IMediaRouterService {
        public static final java.lang.String DESCRIPTOR = "android.media.IMediaRouterService";
        static final int TRANSACTION_registerClientAsUser = 1;
        static final int TRANSACTION_unregisterClient = 2;
        static final int TRANSACTION_registerClientGroupId = 3;
        static final int TRANSACTION_getState = 4;
        static final int TRANSACTION_isPlaybackActive = 5;
        static final int TRANSACTION_setBluetoothA2dpOn = 6;
        static final int TRANSACTION_setDiscoveryRequest = 7;
        static final int TRANSACTION_setSelectedRoute = 8;
        static final int TRANSACTION_requestSetVolume = 9;
        static final int TRANSACTION_requestUpdateVolume = 10;
        static final int TRANSACTION_verifyPackageExists = 11;
        static final int TRANSACTION_getSystemRoutes = 12;
        static final int TRANSACTION_getSystemSessionInfo = 13;
        static final int TRANSACTION_registerRouter2 = 14;
        static final int TRANSACTION_unregisterRouter2 = 15;
        static final int TRANSACTION_setDiscoveryRequestWithRouter2 = 16;
        static final int TRANSACTION_setRouteListingPreference = 17;
        static final int TRANSACTION_setRouteVolumeWithRouter2 = 18;
        static final int TRANSACTION_requestCreateSessionWithRouter2 = 19;
        static final int TRANSACTION_selectRouteWithRouter2 = 20;
        static final int TRANSACTION_deselectRouteWithRouter2 = 21;
        static final int TRANSACTION_transferToRouteWithRouter2 = 22;
        static final int TRANSACTION_setSessionVolumeWithRouter2 = 23;
        static final int TRANSACTION_releaseSessionWithRouter2 = 24;
        static final int TRANSACTION_getRemoteSessions = 25;
        static final int TRANSACTION_getSystemSessionInfoForPackage = 26;
        static final int TRANSACTION_registerManager = 27;
        static final int TRANSACTION_unregisterManager = 28;
        static final int TRANSACTION_setRouteVolumeWithManager = 29;
        static final int TRANSACTION_startScan = 30;
        static final int TRANSACTION_stopScan = 31;
        static final int TRANSACTION_requestCreateSessionWithManager = 32;
        static final int TRANSACTION_selectRouteWithManager = 33;
        static final int TRANSACTION_deselectRouteWithManager = 34;
        static final int TRANSACTION_transferToRouteWithManager = 35;
        static final int TRANSACTION_setSessionVolumeWithManager = 36;
        static final int TRANSACTION_releaseSessionWithManager = 37;
        static final int TRANSACTION_showMediaOutputSwitcher = 38;
        public Stub() { super(); }
        public static android.media.IMediaRouterService asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.media.IMediaRouterService {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void registerClientAsUser(android.media.IMediaRouterClient p0, java.lang.String p1, int p2) throws android.os.RemoteException {}
            public void unregisterClient(android.media.IMediaRouterClient p0) throws android.os.RemoteException {}
            public void registerClientGroupId(android.media.IMediaRouterClient p0, java.lang.String p1) throws android.os.RemoteException {}
            public android.media.MediaRouterClientState getState(android.media.IMediaRouterClient p0) throws android.os.RemoteException { return null; }
            public boolean isPlaybackActive(android.media.IMediaRouterClient p0) throws android.os.RemoteException { return false; }
            public void setBluetoothA2dpOn(android.media.IMediaRouterClient p0, boolean p1) throws android.os.RemoteException {}
            public void setDiscoveryRequest(android.media.IMediaRouterClient p0, int p1, boolean p2) throws android.os.RemoteException {}
            public void setSelectedRoute(android.media.IMediaRouterClient p0, java.lang.String p1, boolean p2) throws android.os.RemoteException {}
            public void requestSetVolume(android.media.IMediaRouterClient p0, java.lang.String p1, int p2) throws android.os.RemoteException {}
            public void requestUpdateVolume(android.media.IMediaRouterClient p0, java.lang.String p1, int p2) throws android.os.RemoteException {}
            public boolean verifyPackageExists(java.lang.String p0) throws android.os.RemoteException { return false; }
            public java.util.List<android.media.MediaRoute2Info> getSystemRoutes() throws android.os.RemoteException { return null; }
            public android.media.RoutingSessionInfo getSystemSessionInfo() throws android.os.RemoteException { return null; }
            public void registerRouter2(android.media.IMediaRouter2 p0, java.lang.String p1) throws android.os.RemoteException {}
            public void unregisterRouter2(android.media.IMediaRouter2 p0) throws android.os.RemoteException {}
            public void setDiscoveryRequestWithRouter2(android.media.IMediaRouter2 p0, android.media.RouteDiscoveryPreference p1) throws android.os.RemoteException {}
            public void setRouteListingPreference(android.media.IMediaRouter2 p0, android.media.RouteListingPreference p1) throws android.os.RemoteException {}
            public void setRouteVolumeWithRouter2(android.media.IMediaRouter2 p0, android.media.MediaRoute2Info p1, int p2) throws android.os.RemoteException {}
            public void requestCreateSessionWithRouter2(android.media.IMediaRouter2 p0, int p1, long p2, android.media.RoutingSessionInfo p3, android.media.MediaRoute2Info p4, android.os.Bundle p5) throws android.os.RemoteException {}
            public void selectRouteWithRouter2(android.media.IMediaRouter2 p0, java.lang.String p1, android.media.MediaRoute2Info p2) throws android.os.RemoteException {}
            public void deselectRouteWithRouter2(android.media.IMediaRouter2 p0, java.lang.String p1, android.media.MediaRoute2Info p2) throws android.os.RemoteException {}
            public void transferToRouteWithRouter2(android.media.IMediaRouter2 p0, java.lang.String p1, android.media.MediaRoute2Info p2) throws android.os.RemoteException {}
            public void setSessionVolumeWithRouter2(android.media.IMediaRouter2 p0, java.lang.String p1, int p2) throws android.os.RemoteException {}
            public void releaseSessionWithRouter2(android.media.IMediaRouter2 p0, java.lang.String p1) throws android.os.RemoteException {}
            public java.util.List<android.media.RoutingSessionInfo> getRemoteSessions(android.media.IMediaRouter2Manager p0) throws android.os.RemoteException { return null; }
            public android.media.RoutingSessionInfo getSystemSessionInfoForPackage(android.media.IMediaRouter2Manager p0, java.lang.String p1) throws android.os.RemoteException { return null; }
            public void registerManager(android.media.IMediaRouter2Manager p0, java.lang.String p1) throws android.os.RemoteException {}
            public void unregisterManager(android.media.IMediaRouter2Manager p0) throws android.os.RemoteException {}
            public void setRouteVolumeWithManager(android.media.IMediaRouter2Manager p0, int p1, android.media.MediaRoute2Info p2, int p3) throws android.os.RemoteException {}
            public void startScan(android.media.IMediaRouter2Manager p0) throws android.os.RemoteException {}
            public void stopScan(android.media.IMediaRouter2Manager p0) throws android.os.RemoteException {}
            public void requestCreateSessionWithManager(android.media.IMediaRouter2Manager p0, int p1, android.media.RoutingSessionInfo p2, android.media.MediaRoute2Info p3) throws android.os.RemoteException {}
            public void selectRouteWithManager(android.media.IMediaRouter2Manager p0, int p1, java.lang.String p2, android.media.MediaRoute2Info p3) throws android.os.RemoteException {}
            public void deselectRouteWithManager(android.media.IMediaRouter2Manager p0, int p1, java.lang.String p2, android.media.MediaRoute2Info p3) throws android.os.RemoteException {}
            public void transferToRouteWithManager(android.media.IMediaRouter2Manager p0, int p1, java.lang.String p2, android.media.MediaRoute2Info p3) throws android.os.RemoteException {}
            public void setSessionVolumeWithManager(android.media.IMediaRouter2Manager p0, int p1, java.lang.String p2, int p3) throws android.os.RemoteException {}
            public void releaseSessionWithManager(android.media.IMediaRouter2Manager p0, int p1, java.lang.String p2) throws android.os.RemoteException {}
            public boolean showMediaOutputSwitcher(java.lang.String p0) throws android.os.RemoteException { return false; }
        }
    }
}
