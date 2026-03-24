package android.media;

public interface IMediaRouter2Manager extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.media.IMediaRouter2Manager";
    public void notifySessionCreated(int p0, android.media.RoutingSessionInfo p1) throws android.os.RemoteException;
    public void notifySessionUpdated(android.media.RoutingSessionInfo p0) throws android.os.RemoteException;
    public void notifySessionReleased(android.media.RoutingSessionInfo p0) throws android.os.RemoteException;
    public void notifyDiscoveryPreferenceChanged(java.lang.String p0, android.media.RouteDiscoveryPreference p1) throws android.os.RemoteException;
    public void notifyRouteListingPreferenceChange(java.lang.String p0, android.media.RouteListingPreference p1) throws android.os.RemoteException;
    public void notifyDeviceSuggestionsUpdated(java.lang.String p0, java.lang.String p1, java.util.List<android.media.SuggestedDeviceInfo> p2) throws android.os.RemoteException;
    public void notifyDeviceSuggestionRequested() throws android.os.RemoteException;
    public void notifyRoutesUpdated(java.util.List<android.media.MediaRoute2Info> p0) throws android.os.RemoteException;
    public void notifyRequestFailed(int p0, int p1) throws android.os.RemoteException;
    public void invalidateInstance() throws android.os.RemoteException;

    public static class Default implements android.media.IMediaRouter2Manager {
        public Default() {}
        public void notifySessionCreated(int p0, android.media.RoutingSessionInfo p1) throws android.os.RemoteException {}
        public void notifySessionUpdated(android.media.RoutingSessionInfo p0) throws android.os.RemoteException {}
        public void notifySessionReleased(android.media.RoutingSessionInfo p0) throws android.os.RemoteException {}
        public void notifyDiscoveryPreferenceChanged(java.lang.String p0, android.media.RouteDiscoveryPreference p1) throws android.os.RemoteException {}
        public void notifyRouteListingPreferenceChange(java.lang.String p0, android.media.RouteListingPreference p1) throws android.os.RemoteException {}
        public void notifyDeviceSuggestionsUpdated(java.lang.String p0, java.lang.String p1, java.util.List<android.media.SuggestedDeviceInfo> p2) throws android.os.RemoteException {}
        public void notifyDeviceSuggestionRequested() throws android.os.RemoteException {}
        public void notifyRoutesUpdated(java.util.List<android.media.MediaRoute2Info> p0) throws android.os.RemoteException {}
        public void notifyRequestFailed(int p0, int p1) throws android.os.RemoteException {}
        public void invalidateInstance() throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.media.IMediaRouter2Manager {
        static final int TRANSACTION_notifySessionCreated = 1;
        static final int TRANSACTION_notifySessionUpdated = 2;
        static final int TRANSACTION_notifySessionReleased = 3;
        static final int TRANSACTION_notifyDiscoveryPreferenceChanged = 4;
        static final int TRANSACTION_notifyRouteListingPreferenceChange = 5;
        static final int TRANSACTION_notifyDeviceSuggestionsUpdated = 6;
        static final int TRANSACTION_notifyDeviceSuggestionRequested = 7;
        static final int TRANSACTION_notifyRoutesUpdated = 8;
        static final int TRANSACTION_notifyRequestFailed = 9;
        static final int TRANSACTION_invalidateInstance = 10;
        public Stub() { super(); }
        public static android.media.IMediaRouter2Manager asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.media.IMediaRouter2Manager {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void notifySessionCreated(int p0, android.media.RoutingSessionInfo p1) throws android.os.RemoteException {}
            public void notifySessionUpdated(android.media.RoutingSessionInfo p0) throws android.os.RemoteException {}
            public void notifySessionReleased(android.media.RoutingSessionInfo p0) throws android.os.RemoteException {}
            public void notifyDiscoveryPreferenceChanged(java.lang.String p0, android.media.RouteDiscoveryPreference p1) throws android.os.RemoteException {}
            public void notifyRouteListingPreferenceChange(java.lang.String p0, android.media.RouteListingPreference p1) throws android.os.RemoteException {}
            public void notifyDeviceSuggestionsUpdated(java.lang.String p0, java.lang.String p1, java.util.List<android.media.SuggestedDeviceInfo> p2) throws android.os.RemoteException {}
            public void notifyDeviceSuggestionRequested() throws android.os.RemoteException {}
            public void notifyRoutesUpdated(java.util.List<android.media.MediaRoute2Info> p0) throws android.os.RemoteException {}
            public void notifyRequestFailed(int p0, int p1) throws android.os.RemoteException {}
            public void invalidateInstance() throws android.os.RemoteException {}
        }
    }
}
