package android.media;

public final class MediaRouter2 {
    private static final java.lang.String TAG = "MR2";
    private static final boolean DEBUG = Boolean.valueOf(false);
    private static final java.lang.Object sRouterLock = null;
    private static final int TRANSFER_TIMEOUT_MS = 30000;
    private static final long MANAGER_REQUEST_ID_NONE = 0L;
    private static android.media.MediaRouter2 sInstance;
    private final android.content.Context mContext = null;
    private final android.media.IMediaRouterService mMediaRouterService = null;
    private final java.util.concurrent.CopyOnWriteArrayList<android.media.MediaRouter2.RouteCallbackRecord> mRouteCallbackRecords = null;
    private final java.util.concurrent.CopyOnWriteArrayList<android.media.MediaRouter2.TransferCallbackRecord> mTransferCallbackRecords = null;
    private final java.util.concurrent.CopyOnWriteArrayList<android.media.MediaRouter2.ControllerCallbackRecord> mControllerCallbackRecords = null;
    private final java.util.concurrent.CopyOnWriteArrayList<android.media.MediaRouter2.ControllerCreationRequest> mControllerCreationRequests = null;
    private final java.lang.String mPackageName = null;
    final java.util.Map<java.lang.String, android.media.MediaRoute2Info> mRoutes = null;
    final android.media.MediaRouter2.RoutingController mSystemController = null;
    private android.media.RouteDiscoveryPreference mDiscoveryPreference;
    android.media.MediaRouter2.MediaRouter2Stub mStub;
    private final java.util.Map<java.lang.String, android.media.MediaRouter2.RoutingController> mNonSystemRoutingControllers = null;
    private final java.util.concurrent.atomic.AtomicInteger mNextRequestId = null;
    final android.os.Handler mHandler = null;
    private boolean mShouldUpdateRoutes;
    private volatile java.util.List<android.media.MediaRoute2Info> mFilteredRoutes;
    private volatile android.media.MediaRouter2.OnGetControllerHintsListener mOnGetControllerHintsListener;
    public static android.media.MediaRouter2 getInstance(android.content.Context p0) { return null; }
    private MediaRouter2(android.content.Context p0) {}
    static boolean checkRouteListContainsRouteId(java.util.List<android.media.MediaRoute2Info> p0, java.lang.String p1) { return false; }
    public void registerRouteCallback(java.util.concurrent.Executor p0, android.media.MediaRouter2.RouteCallback p1, android.media.RouteDiscoveryPreference p2) {}
    public void unregisterRouteCallback(android.media.MediaRouter2.RouteCallback p0) {}
    private boolean updateDiscoveryPreferenceIfNeededLocked() { return false; }
    public java.util.List<android.media.MediaRoute2Info> getRoutes() { return null; }
    public void registerTransferCallback(java.util.concurrent.Executor p0, android.media.MediaRouter2.TransferCallback p1) {}
    public void unregisterTransferCallback(android.media.MediaRouter2.TransferCallback p0) {}
    public void registerControllerCallback(java.util.concurrent.Executor p0, android.media.MediaRouter2.ControllerCallback p1) {}
    public void unregisterControllerCallback(android.media.MediaRouter2.ControllerCallback p0) {}
    public void setOnGetControllerHintsListener(android.media.MediaRouter2.OnGetControllerHintsListener p0) {}
    public void transferTo(android.media.MediaRoute2Info p0) {}
    public void stop() {}
    void transfer(android.media.MediaRouter2.RoutingController p0, android.media.MediaRoute2Info p1) {}
    void requestCreateController(android.media.MediaRouter2.RoutingController p0, android.media.MediaRoute2Info p1, long p2) {}
    private android.media.MediaRouter2.RoutingController getCurrentController() { return null; }
    public android.media.MediaRouter2.RoutingController getSystemController() { return null; }
    public java.util.List<android.media.MediaRouter2.RoutingController> getControllers() { return null; }
    public void setRouteVolume(android.media.MediaRoute2Info p0, int p1) {}
    void syncRoutesOnHandler(java.util.List<android.media.MediaRoute2Info> p0, android.media.RoutingSessionInfo p1) {}
    void addRoutesOnHandler(java.util.List<android.media.MediaRoute2Info> p0) {}
    void removeRoutesOnHandler(java.util.List<android.media.MediaRoute2Info> p0) {}
    void changeRoutesOnHandler(java.util.List<android.media.MediaRoute2Info> p0) {}
    void createControllerOnHandler(int p0, android.media.RoutingSessionInfo p1) {}
    void updateControllerOnHandler(android.media.RoutingSessionInfo p0) {}
    void releaseControllerOnHandler(android.media.RoutingSessionInfo p0) {}
    void onRequestCreateControllerByManagerOnHandler(android.media.RoutingSessionInfo p0, android.media.MediaRoute2Info p1, long p2) {}
    private java.util.List<android.media.MediaRoute2Info> filterRoutes(java.util.List<android.media.MediaRoute2Info> p0, android.media.RouteDiscoveryPreference p1) { return null; }
    private void notifyRoutesAdded(java.util.List<android.media.MediaRoute2Info> p0) {}
    private void notifyRoutesRemoved(java.util.List<android.media.MediaRoute2Info> p0) {}
    private void notifyRoutesChanged(java.util.List<android.media.MediaRoute2Info> p0) {}
    private void notifyTransfer(android.media.MediaRouter2.RoutingController p0, android.media.MediaRouter2.RoutingController p1) {}
    private void notifyTransferFailure(android.media.MediaRoute2Info p0) {}
    private void notifyStop(android.media.MediaRouter2.RoutingController p0) {}
    private void notifyControllerUpdated(android.media.MediaRouter2.RoutingController p0) {}

    public static abstract class ControllerCallback {
        public ControllerCallback() {}
        public void onControllerUpdated(android.media.MediaRouter2.RoutingController p0) {}
    }

    static final class ControllerCallbackRecord {
        public final java.util.concurrent.Executor mExecutor = null;
        public final android.media.MediaRouter2.ControllerCallback mCallback = null;
        ControllerCallbackRecord(java.util.concurrent.Executor p0, android.media.MediaRouter2.ControllerCallback p1) {}
        public boolean equals(java.lang.Object p0) { return false; }
        public int hashCode() { return 0; }
    }

    static final class ControllerCreationRequest {
        public final int mRequestId = 0;
        public final long mManagerRequestId = 0L;
        public final android.media.MediaRoute2Info mRoute = null;
        public final android.media.MediaRouter2.RoutingController mOldController = null;
        ControllerCreationRequest(int p0, long p1, android.media.MediaRoute2Info p2, android.media.MediaRouter2.RoutingController p3) {}
    }

    class MediaRouter2Stub extends android.media.IMediaRouter2.Stub {
        MediaRouter2Stub(android.media.MediaRouter2 p0) { super(); }
        public void notifyRouterRegistered(java.util.List<android.media.MediaRoute2Info> p0, android.media.RoutingSessionInfo p1) {}
        public void notifyRoutesAdded(java.util.List<android.media.MediaRoute2Info> p0) {}
        public void notifyRoutesRemoved(java.util.List<android.media.MediaRoute2Info> p0) {}
        public void notifyRoutesChanged(java.util.List<android.media.MediaRoute2Info> p0) {}
        public void notifySessionCreated(int p0, android.media.RoutingSessionInfo p1) {}
        public void notifySessionInfoChanged(android.media.RoutingSessionInfo p0) {}
        public void notifySessionReleased(android.media.RoutingSessionInfo p0) {}
        public void requestCreateSessionByManager(long p0, android.media.RoutingSessionInfo p1, android.media.MediaRoute2Info p2) {}
    }

    public static interface OnGetControllerHintsListener {
        public android.os.Bundle onGetControllerHints(android.media.MediaRoute2Info p0);
    }

    public static abstract class RouteCallback {
        public RouteCallback() {}
        public void onRoutesAdded(java.util.List<android.media.MediaRoute2Info> p0) {}
        public void onRoutesRemoved(java.util.List<android.media.MediaRoute2Info> p0) {}
        public void onRoutesChanged(java.util.List<android.media.MediaRoute2Info> p0) {}
    }

    static final class RouteCallbackRecord {
        public final java.util.concurrent.Executor mExecutor = null;
        public final android.media.MediaRouter2.RouteCallback mRouteCallback = null;
        public final android.media.RouteDiscoveryPreference mPreference = null;
        RouteCallbackRecord(java.util.concurrent.Executor p0, android.media.MediaRouter2.RouteCallback p1, android.media.RouteDiscoveryPreference p2) {}
        public boolean equals(java.lang.Object p0) { return false; }
        public int hashCode() { return 0; }
    }

    public class RoutingController {
        private final java.lang.Object mControllerLock = null;
        private static final int CONTROLLER_STATE_UNKNOWN = 0;
        private static final int CONTROLLER_STATE_ACTIVE = 1;
        private static final int CONTROLLER_STATE_RELEASING = 2;
        private static final int CONTROLLER_STATE_RELEASED = 3;
        private android.media.RoutingSessionInfo mSessionInfo;
        private int mState;
        RoutingController(android.media.MediaRouter2 p0, android.media.RoutingSessionInfo p1) {}
        public java.lang.String getId() { return null; }
        public java.lang.String getOriginalId() { return null; }
        public android.os.Bundle getControlHints() { return null; }
        public java.util.List<android.media.MediaRoute2Info> getSelectedRoutes() { return null; }
        public java.util.List<android.media.MediaRoute2Info> getSelectableRoutes() { return null; }
        public java.util.List<android.media.MediaRoute2Info> getDeselectableRoutes() { return null; }
        public int getVolumeHandling() { return 0; }
        public int getVolumeMax() { return 0; }
        public int getVolume() { return 0; }
        public boolean isReleased() { return false; }
        public void selectRoute(android.media.MediaRoute2Info p0) {}
        public void deselectRoute(android.media.MediaRoute2Info p0) {}
        void transferToRoute(android.media.MediaRoute2Info p0) {}
        public void setVolume(int p0) {}
        public void release() {}
        boolean scheduleRelease() { return false; }
        void releaseInternal(boolean p0) {}
        public java.lang.String toString() { return null; }
        android.media.RoutingSessionInfo getRoutingSessionInfo() { return null; }
        void setRoutingSessionInfo(android.media.RoutingSessionInfo p0) {}
        private java.util.List<android.media.MediaRoute2Info> getRoutesWithIds(java.util.List<java.lang.String> p0) { return null; }
    }

    class SystemRoutingController extends android.media.MediaRouter2.RoutingController {
        SystemRoutingController(android.media.MediaRouter2 p0, android.media.RoutingSessionInfo p1) { super(null, null); }
        public boolean isReleased() { return false; }
        boolean scheduleRelease() { return false; }
        void releaseInternal(boolean p0) {}
    }

    public static abstract class TransferCallback {
        public TransferCallback() {}
        public void onTransfer(android.media.MediaRouter2.RoutingController p0, android.media.MediaRouter2.RoutingController p1) {}
        public void onTransferFailure(android.media.MediaRoute2Info p0) {}
        public void onStop(android.media.MediaRouter2.RoutingController p0) {}
    }

    static final class TransferCallbackRecord {
        public final java.util.concurrent.Executor mExecutor = null;
        public final android.media.MediaRouter2.TransferCallback mTransferCallback = null;
        TransferCallbackRecord(java.util.concurrent.Executor p0, android.media.MediaRouter2.TransferCallback p1) {}
        public boolean equals(java.lang.Object p0) { return false; }
        public int hashCode() { return 0; }
    }
}
