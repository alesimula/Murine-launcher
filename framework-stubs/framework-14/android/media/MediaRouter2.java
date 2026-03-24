package android.media;

public final class MediaRouter2 {
    final android.media.MediaRouter2.ManagerCallback mManagerCallback = null;
    final java.util.Map<java.lang.String, android.media.MediaRoute2Info> mRoutes = null;
    final android.media.MediaRouter2.RoutingController mSystemController = null;
    android.media.MediaRouter2.MediaRouter2Stub mStub;
    final android.os.Handler mHandler = null;
    public static android.media.MediaRouter2 getInstance(android.content.Context p0) { return null; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.MEDIA_CONTENT_CONTROL")
    public static android.media.MediaRouter2 getInstance(android.content.Context p0, java.lang.String p1) { return null; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.MEDIA_CONTENT_CONTROL")
    public void startScan() {}
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.MEDIA_CONTENT_CONTROL")
    public void stopScan() {}
    static boolean checkRouteListContainsRouteId(java.util.List<android.media.MediaRoute2Info> p0, java.lang.String p1) { return false; }
    @android.annotation.SystemApi
    public java.lang.String getClientPackageName() { return null; }
    public void registerRouteCallback(java.util.concurrent.Executor p0, android.media.MediaRouter2.RouteCallback p1, android.media.RouteDiscoveryPreference p2) {}
    public void unregisterRouteCallback(android.media.MediaRouter2.RouteCallback p0) {}
    public boolean showSystemOutputSwitcher() { return false; }
    public void setRouteListingPreference(android.media.RouteListingPreference p0) {}
    @android.annotation.SystemApi
    public java.util.List<android.media.MediaRoute2Info> getAllRoutes() { return null; }
    public java.util.List<android.media.MediaRoute2Info> getRoutes() { return null; }
    public void registerTransferCallback(java.util.concurrent.Executor p0, android.media.MediaRouter2.TransferCallback p1) {}
    public void unregisterTransferCallback(android.media.MediaRouter2.TransferCallback p0) {}
    public void registerControllerCallback(java.util.concurrent.Executor p0, android.media.MediaRouter2.ControllerCallback p1) {}
    public void unregisterControllerCallback(android.media.MediaRouter2.ControllerCallback p0) {}
    public void setOnGetControllerHintsListener(android.media.MediaRouter2.OnGetControllerHintsListener p0) {}
    public void transferTo(android.media.MediaRoute2Info p0) {}
    public void stop() {}
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.MEDIA_CONTENT_CONTROL")
    public void transfer(android.media.MediaRouter2.RoutingController p0, android.media.MediaRoute2Info p1) {}
    void requestCreateController(android.media.MediaRouter2.RoutingController p0, android.media.MediaRoute2Info p1, long p2) {}
    public android.media.MediaRouter2.RoutingController getSystemController() { return null; }
    public android.media.MediaRouter2.RoutingController getController(java.lang.String p0) { return null; }
    public java.util.List<android.media.MediaRouter2.RoutingController> getControllers() { return null; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.MEDIA_CONTENT_CONTROL")
    public void setRouteVolume(android.media.MediaRoute2Info p0, int p1) {}
    void syncRoutesOnHandler(java.util.List<android.media.MediaRoute2Info> p0, android.media.RoutingSessionInfo p1) {}
    void dispatchFilteredRoutesUpdatedOnHandler(java.util.List<android.media.MediaRoute2Info> p0) {}
    void updateRoutesOnHandler(java.util.List<android.media.MediaRoute2Info> p0) {}
    void updateFilteredRoutesLocked() {}
    void createControllerOnHandler(int p0, android.media.RoutingSessionInfo p1) {}
    void updateControllerOnHandler(android.media.RoutingSessionInfo p0) {}
    void releaseControllerOnHandler(android.media.RoutingSessionInfo p0) {}
    void onRequestCreateControllerByManagerOnHandler(android.media.RoutingSessionInfo p0, android.media.MediaRoute2Info p1, long p2) {}

    public class RoutingController {
        RoutingController(android.media.MediaRouter2 p0, android.media.RoutingSessionInfo p1) {}
        RoutingController(android.media.MediaRouter2 p0, android.media.RoutingSessionInfo p1, int p2) {}
        public java.lang.String getId() { return null; }
        public java.lang.String getOriginalId() { return null; }
        public android.os.Bundle getControlHints() { return null; }
        public java.util.List<android.media.MediaRoute2Info> getSelectedRoutes() { return null; }
        public java.util.List<android.media.MediaRoute2Info> getSelectableRoutes() { return null; }
        public java.util.List<android.media.MediaRoute2Info> getDeselectableRoutes() { return null; }
        public android.media.RoutingSessionInfo getRoutingSessionInfo() { return null; }
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
        void setRoutingSessionInfo(android.media.RoutingSessionInfo p0) {}
    }

    public static interface OnGetControllerHintsListener {
        public android.os.Bundle onGetControllerHints(android.media.MediaRoute2Info p0);
    }

    public static abstract class ControllerCallback {
        public ControllerCallback() {}
        public void onControllerUpdated(android.media.MediaRouter2.RoutingController p0) {}
    }

    public static abstract class RouteCallback {
        public RouteCallback() {}
        @java.lang.Deprecated
        public void onRoutesAdded(java.util.List<android.media.MediaRoute2Info> p0) {}
        @java.lang.Deprecated
        public void onRoutesRemoved(java.util.List<android.media.MediaRoute2Info> p0) {}
        @java.lang.Deprecated
        public void onRoutesChanged(java.util.List<android.media.MediaRoute2Info> p0) {}
        public void onRoutesUpdated(java.util.List<android.media.MediaRoute2Info> p0) {}
        @android.annotation.SystemApi
        public void onPreferredFeaturesChanged(java.util.List<java.lang.String> p0) {}
    }

    public static abstract class TransferCallback {
        public TransferCallback() {}
        public void onTransfer(android.media.MediaRouter2.RoutingController p0, android.media.MediaRouter2.RoutingController p1) {}
        public void onTransferFailure(android.media.MediaRoute2Info p0) {}
        public void onStop(android.media.MediaRouter2.RoutingController p0) {}
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

    class ManagerCallback implements android.media.MediaRouter2Manager.Callback {
        ManagerCallback(android.media.MediaRouter2 p0) {}
        public void onRoutesUpdated() {}
        public void onTransferred(android.media.RoutingSessionInfo p0, android.media.RoutingSessionInfo p1) {}
        public void onTransferFailed(android.media.RoutingSessionInfo p0, android.media.MediaRoute2Info p1) {}
        public void onSessionUpdated(android.media.RoutingSessionInfo p0) {}
        public void onSessionReleased(android.media.RoutingSessionInfo p0) {}
        public void onDiscoveryPreferenceChanged(java.lang.String p0, android.media.RouteDiscoveryPreference p1) {}
        public void onRequestFailed(int p0) {}
    }

    class MediaRouter2Stub extends android.media.IMediaRouter2.Stub {
        MediaRouter2Stub(android.media.MediaRouter2 p0) { super(); }
        public void notifyRouterRegistered(java.util.List<android.media.MediaRoute2Info> p0, android.media.RoutingSessionInfo p1) {}
        public void notifyRoutesUpdated(java.util.List<android.media.MediaRoute2Info> p0) {}
        public void notifySessionCreated(int p0, android.media.RoutingSessionInfo p1) {}
        public void notifySessionInfoChanged(android.media.RoutingSessionInfo p0) {}
        public void notifySessionReleased(android.media.RoutingSessionInfo p0) {}
        public void requestCreateSessionByManager(long p0, android.media.RoutingSessionInfo p1, android.media.MediaRoute2Info p2) {}
    }

    static final class RouteCallbackRecord {
        public final java.util.concurrent.Executor mExecutor = null;
        public final android.media.MediaRouter2.RouteCallback mRouteCallback = null;
        public final android.media.RouteDiscoveryPreference mPreference = null;
        RouteCallbackRecord(java.util.concurrent.Executor p0, android.media.MediaRouter2.RouteCallback p1, android.media.RouteDiscoveryPreference p2) {}
        public boolean equals(java.lang.Object p0) { return false; }
        public int hashCode() { return 0; }
    }

    class SystemRoutingController extends android.media.MediaRouter2.RoutingController {
        SystemRoutingController(android.media.MediaRouter2 p0, android.media.RoutingSessionInfo p1) { super((android.media.MediaRouter2)null, (android.media.RoutingSessionInfo)null); }
        public boolean isReleased() { return false; }
        boolean scheduleRelease() { return false; }
        void releaseInternal(boolean p0) {}
    }

    static final class TransferCallbackRecord {
        public final java.util.concurrent.Executor mExecutor = null;
        public final android.media.MediaRouter2.TransferCallback mTransferCallback = null;
        TransferCallbackRecord(java.util.concurrent.Executor p0, android.media.MediaRouter2.TransferCallback p1) {}
        public boolean equals(java.lang.Object p0) { return false; }
        public int hashCode() { return 0; }
    }
}
