package android.media;

public final class MediaRouter2Manager {
    public static final int REQUEST_ID_NONE = 0;
    public static final int TRANSFER_TIMEOUT_MS = 30000;
    final android.os.Handler mHandler = null;
    final java.util.concurrent.CopyOnWriteArrayList<android.media.MediaRouter2Manager.CallbackRecord> mCallbackRecords = null;
    final java.util.concurrent.ConcurrentMap<java.lang.String, android.media.RouteDiscoveryPreference> mDiscoveryPreferenceMap = null;
    public static android.media.MediaRouter2Manager getInstance(android.content.Context p0) { return null; }
    public void registerCallback(java.util.concurrent.Executor p0, android.media.MediaRouter2Manager.Callback p1) {}
    public void unregisterCallback(android.media.MediaRouter2Manager.Callback p0) {}
    public void registerScanRequest() {}
    public void unregisterScanRequest() {}
    public android.media.session.MediaController getMediaControllerForRoutingSession(android.media.RoutingSessionInfo p0) { return null; }
    public java.util.List<android.media.MediaRoute2Info> getAvailableRoutes(java.lang.String p0) { return null; }
    public java.util.List<android.media.MediaRoute2Info> getTransferableRoutes(java.lang.String p0) { return null; }
    public java.util.List<android.media.MediaRoute2Info> getAvailableRoutes(android.media.RoutingSessionInfo p0) { return null; }
    public java.util.List<android.media.MediaRoute2Info> getTransferableRoutes(android.media.RoutingSessionInfo p0) { return null; }
    public android.media.RouteDiscoveryPreference getDiscoveryPreference(java.lang.String p0) { return null; }
    public android.media.RouteListingPreference getRouteListingPreference(java.lang.String p0) { return null; }
    public android.media.RoutingSessionInfo getSystemRoutingSession(java.lang.String p0) { return null; }
    public android.media.RoutingSessionInfo getRoutingSessionForMediaController(android.media.session.MediaController p0) { return null; }
    public java.util.List<android.media.RoutingSessionInfo> getRoutingSessions(java.lang.String p0) { return null; }
    public java.util.List<android.media.RoutingSessionInfo> getRemoteSessions() { return null; }
    public java.util.List<android.media.MediaRoute2Info> getAllRoutes() { return null; }
    public void transfer(java.lang.String p0, android.media.MediaRoute2Info p1) {}
    public void transfer(android.media.RoutingSessionInfo p0, android.media.MediaRoute2Info p1) {}
    public void setRouteVolume(android.media.MediaRoute2Info p0, int p1) {}
    public void setSessionVolume(android.media.RoutingSessionInfo p0, int p1) {}
    void updateRoutesOnHandler(java.util.List<android.media.MediaRoute2Info> p0) {}
    void createSessionOnHandler(int p0, android.media.RoutingSessionInfo p1) {}
    void handleFailureOnHandler(int p0, int p1) {}
    void handleSessionsUpdatedOnHandler(android.media.RoutingSessionInfo p0) {}
    void notifySessionUpdated(android.media.RoutingSessionInfo p0) {}
    void notifySessionReleased(android.media.RoutingSessionInfo p0) {}
    void notifyRequestFailed(int p0) {}
    void notifyTransferred(android.media.RoutingSessionInfo p0, android.media.RoutingSessionInfo p1) {}
    void notifyTransferFailed(android.media.RoutingSessionInfo p0, android.media.MediaRoute2Info p1) {}
    void updateDiscoveryPreference(java.lang.String p0, android.media.RouteDiscoveryPreference p1) {}
    public java.util.List<android.media.MediaRoute2Info> getSelectedRoutes(android.media.RoutingSessionInfo p0) { return null; }
    public java.util.List<android.media.MediaRoute2Info> getSelectableRoutes(android.media.RoutingSessionInfo p0) { return null; }
    public java.util.List<android.media.MediaRoute2Info> getDeselectableRoutes(android.media.RoutingSessionInfo p0) { return null; }
    public void selectRoute(android.media.RoutingSessionInfo p0, android.media.MediaRoute2Info p1) {}
    public void deselectRoute(android.media.RoutingSessionInfo p0, android.media.MediaRoute2Info p1) {}
    public void releaseSession(android.media.RoutingSessionInfo p0) {}

    public static interface Callback {
        default public void onRoutesUpdated() {}
        default public void onSessionUpdated(android.media.RoutingSessionInfo p0) {}
        default public void onSessionReleased(android.media.RoutingSessionInfo p0) {}
        default public void onTransferred(android.media.RoutingSessionInfo p0, android.media.RoutingSessionInfo p1) {}
        default public void onTransferFailed(android.media.RoutingSessionInfo p0, android.media.MediaRoute2Info p1) {}
        default public void onPreferredFeaturesChanged(java.lang.String p0, java.util.List<java.lang.String> p1) {}
        default public void onDiscoveryPreferenceChanged(java.lang.String p0, android.media.RouteDiscoveryPreference p1) {}
        default public void onRouteListingPreferenceUpdated(java.lang.String p0, android.media.RouteListingPreference p1) {}
        default public void onRequestFailed(int p0) {}
    }

    final class CallbackRecord {
        public final java.util.concurrent.Executor mExecutor = null;
        public final android.media.MediaRouter2Manager.Callback mCallback = null;
        CallbackRecord(android.media.MediaRouter2Manager p0, java.util.concurrent.Executor p1, android.media.MediaRouter2Manager.Callback p2) {}
        public boolean equals(java.lang.Object p0) { return false; }
        public int hashCode() { return 0; }
    }

    class Client extends android.media.IMediaRouter2Manager.Stub {
        Client(android.media.MediaRouter2Manager p0) { super(); }
        public void notifySessionCreated(int p0, android.media.RoutingSessionInfo p1) {}
        public void notifySessionUpdated(android.media.RoutingSessionInfo p0) {}
        public void notifySessionReleased(android.media.RoutingSessionInfo p0) {}
        public void notifyRequestFailed(int p0, int p1) {}
        public void notifyDiscoveryPreferenceChanged(java.lang.String p0, android.media.RouteDiscoveryPreference p1) {}
        public void notifyRouteListingPreferenceChange(java.lang.String p0, android.media.RouteListingPreference p1) {}
        public void notifyRoutesUpdated(java.util.List<android.media.MediaRoute2Info> p0) {}
    }

    static final class TransferRequest {
        public final int mRequestId = 0;
        public final android.media.RoutingSessionInfo mOldSessionInfo = null;
        public final android.media.MediaRoute2Info mTargetRoute = null;
        TransferRequest(int p0, android.media.RoutingSessionInfo p1, android.media.MediaRoute2Info p2) {}
    }
}
