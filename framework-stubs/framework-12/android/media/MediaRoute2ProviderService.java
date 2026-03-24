package android.media;

public abstract class MediaRoute2ProviderService extends android.app.Service {
    private static final java.lang.String TAG = "MR2ProviderService";
    private static final boolean DEBUG = Boolean.valueOf(false);
    public static final java.lang.String SERVICE_INTERFACE = "android.media.MediaRoute2ProviderService";
    public static final long REQUEST_ID_NONE = 0L;
    public static final int REASON_UNKNOWN_ERROR = 0;
    public static final int REASON_REJECTED = 1;
    public static final int REASON_NETWORK_ERROR = 2;
    public static final int REASON_ROUTE_NOT_AVAILABLE = 3;
    public static final int REASON_INVALID_COMMAND = 4;
    private static final int MAX_REQUEST_IDS_SIZE = 500;
    private final android.os.Handler mHandler = null;
    private final java.lang.Object mSessionLock = null;
    private final java.lang.Object mRequestIdsLock = null;
    private final java.util.concurrent.atomic.AtomicBoolean mStatePublishScheduled = null;
    private final java.util.concurrent.atomic.AtomicBoolean mSessionUpdateScheduled = null;
    private android.media.MediaRoute2ProviderService.MediaRoute2ProviderServiceStub mStub;
    private android.media.IMediaRoute2ProviderServiceCallback mRemoteCallback;
    private volatile android.media.MediaRoute2ProviderInfo mProviderInfo;
    private final java.util.Deque<java.lang.Long> mRequestIds = null;
    private final android.util.ArrayMap<java.lang.String, android.media.RoutingSessionInfo> mSessionInfo = null;
    public MediaRoute2ProviderService() { super(); }
    public android.os.IBinder onBind(android.content.Intent p0) { return null; }
    public abstract void onSetRouteVolume(long p0, java.lang.String p1, int p2);
    public abstract void onSetSessionVolume(long p0, java.lang.String p1, int p2);
    public final android.media.RoutingSessionInfo getSessionInfo(java.lang.String p0) { return null; }
    public final java.util.List<android.media.RoutingSessionInfo> getAllSessionInfo() { return null; }
    public final void notifySessionCreated(long p0, android.media.RoutingSessionInfo p1) {}
    public final void notifySessionUpdated(android.media.RoutingSessionInfo p0) {}
    public final void notifySessionReleased(java.lang.String p0) {}
    public final void notifyRequestFailed(long p0, int p1) {}
    public abstract void onCreateSession(long p0, java.lang.String p1, java.lang.String p2, android.os.Bundle p3);
    public abstract void onReleaseSession(long p0, java.lang.String p1);
    public abstract void onSelectRoute(long p0, java.lang.String p1, java.lang.String p2);
    public abstract void onDeselectRoute(long p0, java.lang.String p1, java.lang.String p2);
    public abstract void onTransferToRoute(long p0, java.lang.String p1, java.lang.String p2);
    public void onDiscoveryPreferenceChanged(android.media.RouteDiscoveryPreference p0) {}
    public final void notifyRoutes(java.util.Collection<android.media.MediaRoute2Info> p0) {}
    void setCallback(android.media.IMediaRoute2ProviderServiceCallback p0) {}
    void schedulePublishState() {}
    private void publishState() {}
    void scheduleUpdateSessions() {}
    private void updateSessions() {}
    private void addRequestId(long p0) {}
    private boolean removeRequestId(long p0) { return false; }

    final class MediaRoute2ProviderServiceStub extends android.media.IMediaRoute2ProviderService.Stub {
        MediaRoute2ProviderServiceStub(android.media.MediaRoute2ProviderService p0) { super(); }
        private boolean checkCallerIsSystem() { return false; }
        private boolean checkSessionIdIsValid(java.lang.String p0, java.lang.String p1) { return false; }
        private boolean checkRouteIdIsValid(java.lang.String p0, java.lang.String p1) { return false; }
        public void setCallback(android.media.IMediaRoute2ProviderServiceCallback p0) {}
        public void updateDiscoveryPreference(android.media.RouteDiscoveryPreference p0) {}
        public void setRouteVolume(long p0, java.lang.String p1, int p2) {}
        public void requestCreateSession(long p0, java.lang.String p1, java.lang.String p2, android.os.Bundle p3) {}
        public void selectRoute(long p0, java.lang.String p1, java.lang.String p2) {}
        public void deselectRoute(long p0, java.lang.String p1, java.lang.String p2) {}
        public void transferToRoute(long p0, java.lang.String p1, java.lang.String p2) {}
        public void setSessionVolume(long p0, java.lang.String p1, int p2) {}
        public void releaseSession(long p0, java.lang.String p1) {}
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Reason {
    }
}
