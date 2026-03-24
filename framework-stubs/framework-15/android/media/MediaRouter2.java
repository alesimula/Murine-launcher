package android.media;

public final class MediaRouter2 {
    public static final int SCANNING_STATE_NOT_SCANNING = 0;
    public static final int SCANNING_STATE_WHILE_INTERACTIVE = 1;
    public static final int SCANNING_STATE_SCANNING_FULL = 2;
    @android.annotation.NonNull
    public static android.media.MediaRouter2 getInstance(android.content.Context p0) { return null; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission(anyOf={"android.permission.MEDIA_CONTENT_CONTROL", "android.permission.MEDIA_ROUTING_CONTROL"})
    @android.annotation.Nullable
    public static android.media.MediaRouter2 getInstance(android.content.Context p0, java.lang.String p1) { return null; }
    @android.annotation.FlaggedApi("com.android.media.flags.enable_privileged_routing_for_media_routing_control")
    @android.annotation.RequiresPermission(anyOf={"android.permission.MEDIA_CONTENT_CONTROL", "android.permission.MEDIA_ROUTING_CONTROL"})
    @android.annotation.NonNull
    public static android.media.MediaRouter2 getInstance(android.content.Context p0, java.lang.String p1, java.util.concurrent.Executor p2, java.lang.Runnable p3) { return null; }
    @android.annotation.RequiresPermission(anyOf={"android.permission.MEDIA_CONTENT_CONTROL", "android.permission.MEDIA_ROUTING_CONTROL"})
    @android.annotation.NonNull
    public static android.media.MediaRouter2 getInstance(android.content.Context p0, java.lang.String p1, android.os.UserHandle p2) { return null; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.MEDIA_CONTENT_CONTROL")
    public void startScan() {}
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.MEDIA_CONTENT_CONTROL")
    public void stopScan() {}
    @android.annotation.FlaggedApi("com.android.media.flags.enable_screen_off_scanning")
    @android.annotation.NonNull
    public android.media.MediaRouter2.ScanToken requestScan(android.media.MediaRouter2.ScanRequest p0) { return null; }
    @android.annotation.FlaggedApi("com.android.media.flags.enable_screen_off_scanning")
    public void cancelScanRequest(android.media.MediaRouter2.ScanToken p0) {}
    @android.annotation.SystemApi
    @android.annotation.Nullable
    public java.lang.String getClientPackageName() { return null; }
    public void registerRouteCallback(java.util.concurrent.Executor p0, android.media.MediaRouter2.RouteCallback p1, android.media.RouteDiscoveryPreference p2) {}
    public void unregisterRouteCallback(android.media.MediaRouter2.RouteCallback p0) {}
    @android.annotation.FlaggedApi("com.android.media.flags.enable_rlp_callbacks_in_media_router2")
    public void registerRouteListingPreferenceUpdatedCallback(java.util.concurrent.Executor p0, java.util.function.Consumer<android.media.RouteListingPreference> p1) {}
    @android.annotation.FlaggedApi("com.android.media.flags.enable_rlp_callbacks_in_media_router2")
    public void unregisterRouteListingPreferenceUpdatedCallback(java.util.function.Consumer<android.media.RouteListingPreference> p0) {}
    public boolean showSystemOutputSwitcher() { return false; }
    public void setRouteListingPreference(android.media.RouteListingPreference p0) {}
    @android.annotation.FlaggedApi("com.android.media.flags.enable_rlp_callbacks_in_media_router2")
    @android.annotation.Nullable
    public android.media.RouteListingPreference getRouteListingPreference() { return null; }
    @android.annotation.SystemApi
    @android.annotation.NonNull
    public java.util.List<android.media.MediaRoute2Info> getAllRoutes() { return null; }
    @android.annotation.NonNull
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
    @android.annotation.NonNull
    public android.media.MediaRouter2.RoutingController getSystemController() { return null; }
    @android.annotation.Nullable
    public android.media.MediaRouter2.RoutingController getController(java.lang.String p0) { return null; }
    @android.annotation.NonNull
    public java.util.List<android.media.MediaRouter2.RoutingController> getControllers() { return null; }
    @android.annotation.FlaggedApi("com.android.media.flags.enable_privileged_routing_for_media_routing_control")
    @android.annotation.RequiresPermission(anyOf={"android.permission.MEDIA_CONTENT_CONTROL", "android.permission.MEDIA_ROUTING_CONTROL"})
    public void setRouteVolume(android.media.MediaRoute2Info p0, int p1) {}
    void syncRoutesOnHandler(java.util.List<android.media.MediaRoute2Info> p0, android.media.RoutingSessionInfo p1) {}
    void dispatchFilteredRoutesUpdatedOnHandler(java.util.List<android.media.MediaRoute2Info> p0) {}
    void dispatchControllerUpdatedIfNeededOnHandler(java.util.Map<java.lang.String, android.media.MediaRoute2Info> p0) {}
    void updateRoutesOnHandler(java.util.List<android.media.MediaRoute2Info> p0) {}
    void updateFilteredRoutesLocked() {}
    void createControllerOnHandler(int p0, android.media.RoutingSessionInfo p1) {}
    void updateControllerOnHandler(android.media.RoutingSessionInfo p0) {}
    void releaseControllerOnHandler(android.media.RoutingSessionInfo p0) {}
    void onRequestCreateControllerByManagerOnHandler(android.media.RoutingSessionInfo p0, android.media.MediaRoute2Info p1, long p2) {}

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

    private static final record InstanceInvalidatedCallbackRecord(java.util.concurrent.Executor executor, java.lang.Runnable runnable) {
        public final java.lang.String toString() { return null; }
        public final int hashCode() { return 0; }
        public final boolean equals(java.lang.Object p0) { return false; }
        public java.util.concurrent.Executor executor() { return null; }
        public java.lang.Runnable runnable() { return null; }
    }

    private class LocalMediaRouter2Impl implements android.media.MediaRouter2.MediaRouter2Impl {
        LocalMediaRouter2Impl(android.media.MediaRouter2 p0, java.lang.String p1) {}
        public void startScan() {}
        public void stopScan() {}
        public void updateScanningState(int p0) throws android.os.RemoteException {}
        public java.lang.String getClientPackageName() { return null; }
        public java.lang.String getPackageName() { return null; }
        public android.media.RoutingSessionInfo getSystemSessionInfo() { return null; }
        public android.media.MediaRouter2.RouteCallbackRecord createRouteCallbackRecord(java.util.concurrent.Executor p0, android.media.MediaRouter2.RouteCallback p1, android.media.RouteDiscoveryPreference p2) { return null; }
        public void registerRouteCallback() {}
        public void unregisterRouteCallback() {}
        public void setRouteListingPreference(android.media.RouteListingPreference p0) {}
        public boolean showSystemOutputSwitcher() { return false; }
        public java.util.List<android.media.MediaRoute2Info> getAllRoutes() { return null; }
        public void setOnGetControllerHintsListener(android.media.MediaRouter2.OnGetControllerHintsListener p0) {}
        public void transferTo(android.media.MediaRoute2Info p0) {}
        public void stop() {}
        public void transfer(android.media.RoutingSessionInfo p0, android.media.MediaRoute2Info p1) {}
        public java.util.List<android.media.MediaRouter2.RoutingController> getControllers() { return null; }
        public void setRouteVolume(android.media.MediaRoute2Info p0, int p1) {}
        public void setSessionVolume(int p0, android.media.RoutingSessionInfo p1) {}
        public java.util.List<android.media.MediaRoute2Info> filterRoutesWithIndividualPreference(java.util.List<android.media.MediaRoute2Info> p0, android.media.RouteDiscoveryPreference p1) { return null; }
        public void selectRoute(android.media.MediaRoute2Info p0, android.media.RoutingSessionInfo p1) {}
        public void deselectRoute(android.media.MediaRoute2Info p0, android.media.RoutingSessionInfo p1) {}
        public void releaseSession(boolean p0, boolean p1, android.media.MediaRouter2.RoutingController p2) {}
        public boolean wasTransferredBySelf(android.media.RoutingSessionInfo p0) { return false; }
    }

    private static interface MediaRouter2Impl {
        public void updateScanningState(int p0) throws android.os.RemoteException;
        public void startScan();
        public void stopScan();
        public java.lang.String getClientPackageName();
        public java.lang.String getPackageName();
        public android.media.RoutingSessionInfo getSystemSessionInfo();
        public android.media.MediaRouter2.RouteCallbackRecord createRouteCallbackRecord(java.util.concurrent.Executor p0, android.media.MediaRouter2.RouteCallback p1, android.media.RouteDiscoveryPreference p2);
        public void registerRouteCallback();
        public void unregisterRouteCallback();
        public void setRouteListingPreference(android.media.RouteListingPreference p0);
        public boolean showSystemOutputSwitcher();
        public java.util.List<android.media.MediaRoute2Info> getAllRoutes();
        public void setOnGetControllerHintsListener(android.media.MediaRouter2.OnGetControllerHintsListener p0);
        public void transferTo(android.media.MediaRoute2Info p0);
        public void stop();
        public void transfer(android.media.RoutingSessionInfo p0, android.media.MediaRoute2Info p1);
        public java.util.List<android.media.MediaRouter2.RoutingController> getControllers();
        public void setRouteVolume(android.media.MediaRoute2Info p0, int p1);
        public java.util.List<android.media.MediaRoute2Info> filterRoutesWithIndividualPreference(java.util.List<android.media.MediaRoute2Info> p0, android.media.RouteDiscoveryPreference p1);
        public void setSessionVolume(int p0, android.media.RoutingSessionInfo p1);
        public void selectRoute(android.media.MediaRoute2Info p0, android.media.RoutingSessionInfo p1);
        public void deselectRoute(android.media.MediaRoute2Info p0, android.media.RoutingSessionInfo p1);
        public void releaseSession(boolean p0, boolean p1, android.media.MediaRouter2.RoutingController p2);
        public boolean wasTransferredBySelf(android.media.RoutingSessionInfo p0);
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

    public static interface OnGetControllerHintsListener {
        @android.annotation.Nullable
        public android.os.Bundle onGetControllerHints(android.media.MediaRoute2Info p0);
    }

    private static final record PackageNameUserHandlePair(java.lang.String packageName, android.os.UserHandle user) {
        public final java.lang.String toString() { return null; }
        public final int hashCode() { return 0; }
        public final boolean equals(java.lang.Object p0) { return false; }
        public java.lang.String packageName() { return null; }
        public android.os.UserHandle user() { return null; }
    }

    private class ProxyMediaRouter2Impl implements android.media.MediaRouter2.MediaRouter2Impl {
        ProxyMediaRouter2Impl(android.media.MediaRouter2 p0, android.content.Context p1, java.lang.String p2, android.os.UserHandle p3) {}
        public void registerProxyRouter() {}
        public void registerInstanceInvalidatedCallback(java.util.concurrent.Executor p0, java.lang.Runnable p1) {}
        public void updateScanningState(int p0) throws android.os.RemoteException {}
        public void startScan() {}
        public void stopScan() {}
        public java.lang.String getClientPackageName() { return null; }
        public java.lang.String getPackageName() { return null; }
        public android.media.RoutingSessionInfo getSystemSessionInfo() { return null; }
        public android.media.MediaRouter2.RouteCallbackRecord createRouteCallbackRecord(java.util.concurrent.Executor p0, android.media.MediaRouter2.RouteCallback p1, android.media.RouteDiscoveryPreference p2) { return null; }
        public void registerRouteCallback() {}
        public void unregisterRouteCallback() {}
        public void setRouteListingPreference(android.media.RouteListingPreference p0) {}
        public boolean showSystemOutputSwitcher() { return false; }
        public java.util.List<android.media.MediaRoute2Info> getAllRoutes() { return null; }
        public void setOnGetControllerHintsListener(android.media.MediaRouter2.OnGetControllerHintsListener p0) {}
        public void transferTo(android.media.MediaRoute2Info p0) {}
        public void stop() {}
        public void transfer(android.media.RoutingSessionInfo p0, android.media.MediaRoute2Info p1) {}
        public java.util.List<android.media.MediaRouter2.RoutingController> getControllers() { return null; }
        public void setRouteVolume(android.media.MediaRoute2Info p0, int p1) {}
        public void setSessionVolume(int p0, android.media.RoutingSessionInfo p1) {}
        public java.util.List<android.media.MediaRoute2Info> filterRoutesWithIndividualPreference(java.util.List<android.media.MediaRoute2Info> p0, android.media.RouteDiscoveryPreference p1) { return null; }
        public void selectRoute(android.media.MediaRoute2Info p0, android.media.RoutingSessionInfo p1) {}
        public void deselectRoute(android.media.MediaRoute2Info p0, android.media.RoutingSessionInfo p1) {}
        public void releaseSession(boolean p0, boolean p1, android.media.MediaRouter2.RoutingController p2) {}
        public boolean wasTransferredBySelf(android.media.RoutingSessionInfo p0) { return false; }
        static android.media.RoutingSessionInfo getSystemSessionInfoImpl(android.media.IMediaRouterService p0, java.lang.String p1, java.lang.String p2) { return null; }

        private class Client extends android.media.IMediaRouter2Manager.Stub {
            public void notifySessionCreated(int p0, android.media.RoutingSessionInfo p1) {}
            public void notifySessionUpdated(android.media.RoutingSessionInfo p0) {}
            public void notifySessionReleased(android.media.RoutingSessionInfo p0) {}
            public void notifyDiscoveryPreferenceChanged(java.lang.String p0, android.media.RouteDiscoveryPreference p1) {}
            public void notifyRouteListingPreferenceChange(java.lang.String p0, android.media.RouteListingPreference p1) {}
            public void notifyRoutesUpdated(java.util.List<android.media.MediaRoute2Info> p0) {}
            public void notifyRequestFailed(int p0, int p1) {}
            public void invalidateInstance() {}
        }
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

    static final class RouteCallbackRecord {
        public final java.util.concurrent.Executor mExecutor = null;
        public final android.media.MediaRouter2.RouteCallback mRouteCallback = null;
        public final android.media.RouteDiscoveryPreference mPreference = null;
        RouteCallbackRecord(java.util.concurrent.Executor p0, android.media.MediaRouter2.RouteCallback p1, android.media.RouteDiscoveryPreference p2) {}
        public boolean equals(java.lang.Object p0) { return false; }
        public int hashCode() { return 0; }
    }

    private static final class RouteListingPreferenceCallbackRecord {
        public final java.util.concurrent.Executor mExecutor = null;
        public final java.util.function.Consumer<android.media.RouteListingPreference> mRouteListingPreferenceCallback = null;
        RouteListingPreferenceCallbackRecord(java.util.concurrent.Executor p0, java.util.function.Consumer<android.media.RouteListingPreference> p1) {}
        public boolean equals(java.lang.Object p0) { return false; }
        public int hashCode() { return 0; }
    }

    public class RoutingController {
        RoutingController(android.media.MediaRouter2 p0, android.media.RoutingSessionInfo p1) {}
        RoutingController(android.media.MediaRouter2 p0, android.media.RoutingSessionInfo p1, int p2) {}
        @android.annotation.NonNull
        public java.lang.String getId() { return null; }
        @android.annotation.NonNull
        public java.lang.String getOriginalId() { return null; }
        @android.annotation.Nullable
        public android.os.Bundle getControlHints() { return null; }
        @android.annotation.NonNull
        public java.util.List<android.media.MediaRoute2Info> getSelectedRoutes() { return null; }
        @android.annotation.NonNull
        public java.util.List<android.media.MediaRoute2Info> getSelectableRoutes() { return null; }
        @android.annotation.NonNull
        public java.util.List<android.media.MediaRoute2Info> getDeselectableRoutes() { return null; }
        @android.annotation.FlaggedApi("com.android.media.flags.enable_get_transferable_routes")
        @android.annotation.NonNull
        public java.util.List<android.media.MediaRoute2Info> getTransferableRoutes() { return null; }
        @android.annotation.FlaggedApi("com.android.media.flags.enable_built_in_speaker_route_suitability_statuses")
        public boolean wasTransferInitiatedBySelf() { return false; }
        @android.annotation.NonNull
        public android.media.RoutingSessionInfo getRoutingSessionInfo() { return null; }
        public int getVolumeHandling() { return 0; }
        public int getVolumeMax() { return 0; }
        public int getVolume() { return 0; }
        public boolean isReleased() { return false; }
        public void selectRoute(android.media.MediaRoute2Info p0) {}
        public void deselectRoute(android.media.MediaRoute2Info p0) {}
        boolean tryTransferWithinProvider(android.media.MediaRoute2Info p0) { return false; }
        public void setVolume(int p0) {}
        public void release() {}
        boolean scheduleRelease() { return false; }
        void releaseInternal(boolean p0) {}
        public java.lang.String toString() { return null; }
        void setRoutingSessionInfo(android.media.RoutingSessionInfo p0) {}
    }

    @android.annotation.FlaggedApi("com.android.media.flags.enable_screen_off_scanning")
    public static final class ScanRequest {
        public boolean isScreenOffScan() { return false; }

        public static final class Builder {
            boolean mIsScreenOffScan;
            public Builder() {}
            @android.annotation.NonNull
            public android.media.MediaRouter2.ScanRequest.Builder setScreenOffScan(boolean p0) { return null; }
            @android.annotation.NonNull
            public android.media.MediaRouter2.ScanRequest build() { return null; }
        }
    }

    @android.annotation.FlaggedApi("com.android.media.flags.enable_screen_off_scanning")
    public static final class ScanToken {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ScanningState {
    }

    class SystemRoutingController extends android.media.MediaRouter2.RoutingController {
        SystemRoutingController(android.media.MediaRouter2 p0, android.media.RoutingSessionInfo p1) { super((android.media.MediaRouter2)null, (android.media.RoutingSessionInfo)null); }
        public boolean isReleased() { return false; }
        boolean scheduleRelease() { return false; }
        void releaseInternal(boolean p0) {}
    }

    public static abstract class TransferCallback {
        public TransferCallback() {}
        public void onTransfer(android.media.MediaRouter2.RoutingController p0, android.media.MediaRouter2.RoutingController p1) {}
        public void onTransferFailure(android.media.MediaRoute2Info p0) {}
        public void onStop(android.media.MediaRouter2.RoutingController p0) {}
        public void onRequestFailed(int p0) {}
    }

    static final class TransferCallbackRecord {
        public final java.util.concurrent.Executor mExecutor = null;
        public final android.media.MediaRouter2.TransferCallback mTransferCallback = null;
        TransferCallbackRecord(java.util.concurrent.Executor p0, android.media.MediaRouter2.TransferCallback p1) {}
        public boolean equals(java.lang.Object p0) { return false; }
        public int hashCode() { return 0; }
    }
}
