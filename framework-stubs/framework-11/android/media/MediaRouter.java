package android.media;

public class MediaRouter {
    private static final java.lang.String TAG = "MediaRouter";
    private static final boolean DEBUG = Boolean.valueOf(false);
    static android.media.MediaRouter.Static sStatic;
    public static final int ROUTE_TYPE_LIVE_AUDIO = 1;
    public static final int ROUTE_TYPE_LIVE_VIDEO = 2;
    public static final int ROUTE_TYPE_REMOTE_DISPLAY = 4;
    public static final int ROUTE_TYPE_USER = 8388608;
    static final int ROUTE_TYPE_ANY = 8388615;
    public static final int CALLBACK_FLAG_PERFORM_ACTIVE_SCAN = 1;
    public static final int CALLBACK_FLAG_UNFILTERED_EVENTS = 2;
    public static final int CALLBACK_FLAG_REQUEST_DISCOVERY = 4;
    public static final int CALLBACK_FLAG_PASSIVE_DISCOVERY = 8;
    public static final int AVAILABILITY_FLAG_IGNORE_DEFAULT_ROUTE = 1;
    public static final java.lang.String MIRRORING_GROUP_ID = "android.media.mirroring_group";
    static final java.util.HashMap<android.content.Context, android.media.MediaRouter> sRouters = null;
    static java.lang.String typesToString(int p0) { return null; }
    public MediaRouter(android.content.Context p0) {}
    public android.media.MediaRouter.RouteInfo getDefaultRoute() { return null; }
    public android.media.MediaRouter.RouteInfo getFallbackRoute() { return null; }
    public android.media.MediaRouter.RouteCategory getSystemCategory() { return null; }
    public android.media.MediaRouter.RouteInfo getSelectedRoute() { return null; }
    public android.media.MediaRouter.RouteInfo getSelectedRoute(int p0) { return null; }
    public boolean isRouteAvailable(int p0, int p1) { return false; }
    public void setRouterGroupId(java.lang.String p0) {}
    public void addCallback(int p0, android.media.MediaRouter.Callback p1) {}
    public void addCallback(int p0, android.media.MediaRouter.Callback p1, int p2) {}
    public void removeCallback(android.media.MediaRouter.Callback p0) {}
    private int findCallbackInfo(android.media.MediaRouter.Callback p0) { return 0; }
    public void selectRoute(int p0, android.media.MediaRouter.RouteInfo p1) {}
    public void selectRouteInt(int p0, android.media.MediaRouter.RouteInfo p1, boolean p2) {}
    static void selectRouteStatic(int p0, android.media.MediaRouter.RouteInfo p1, boolean p2) {}
    static void selectDefaultRouteStatic() {}
    static boolean matchesDeviceAddress(android.hardware.display.WifiDisplay p0, android.media.MediaRouter.RouteInfo p1) { return false; }
    public void addUserRoute(android.media.MediaRouter.UserRouteInfo p0) {}
    public void addRouteInt(android.media.MediaRouter.RouteInfo p0) {}
    static void addRouteStatic(android.media.MediaRouter.RouteInfo p0) {}
    public void removeUserRoute(android.media.MediaRouter.UserRouteInfo p0) {}
    public void clearUserRoutes() {}
    public void removeRouteInt(android.media.MediaRouter.RouteInfo p0) {}
    static void removeRouteStatic(android.media.MediaRouter.RouteInfo p0) {}
    public int getCategoryCount() { return 0; }
    public android.media.MediaRouter.RouteCategory getCategoryAt(int p0) { return null; }
    public int getRouteCount() { return 0; }
    public android.media.MediaRouter.RouteInfo getRouteAt(int p0) { return null; }
    static int getRouteCountStatic() { return 0; }
    static android.media.MediaRouter.RouteInfo getRouteAtStatic(int p0) { return null; }
    public android.media.MediaRouter.UserRouteInfo createUserRoute(android.media.MediaRouter.RouteCategory p0) { return null; }
    public android.media.MediaRouter.RouteCategory createRouteCategory(java.lang.CharSequence p0, boolean p1) { return null; }
    public android.media.MediaRouter.RouteCategory createRouteCategory(int p0, boolean p1) { return null; }
    public void rebindAsUser(int p0) {}
    static void updateRoute(android.media.MediaRouter.RouteInfo p0) {}
    static void dispatchRouteSelected(int p0, android.media.MediaRouter.RouteInfo p1) {}
    static void dispatchRouteUnselected(int p0, android.media.MediaRouter.RouteInfo p1) {}
    static void dispatchRouteChanged(android.media.MediaRouter.RouteInfo p0) {}
    static void dispatchRouteChanged(android.media.MediaRouter.RouteInfo p0, int p1) {}
    static void dispatchRouteAdded(android.media.MediaRouter.RouteInfo p0) {}
    static void dispatchRouteRemoved(android.media.MediaRouter.RouteInfo p0) {}
    static void dispatchRouteGrouped(android.media.MediaRouter.RouteInfo p0, android.media.MediaRouter.RouteGroup p1, int p2) {}
    static void dispatchRouteUngrouped(android.media.MediaRouter.RouteInfo p0, android.media.MediaRouter.RouteGroup p1) {}
    static void dispatchRouteVolumeChanged(android.media.MediaRouter.RouteInfo p0) {}
    static void dispatchRoutePresentationDisplayChanged(android.media.MediaRouter.RouteInfo p0) {}
    static void systemVolumeChanged(int p0) {}
    static void updateWifiDisplayStatus(android.hardware.display.WifiDisplayStatus p0) {}
    private static boolean shouldShowWifiDisplay(android.hardware.display.WifiDisplay p0, android.hardware.display.WifiDisplay p1) { return false; }
    static int getWifiDisplayStatusCode(android.hardware.display.WifiDisplay p0, android.hardware.display.WifiDisplayStatus p1) { return 0; }
    static boolean isWifiDisplayEnabled(android.hardware.display.WifiDisplay p0, android.hardware.display.WifiDisplayStatus p1) { return false; }
    static android.media.MediaRouter.RouteInfo makeWifiDisplayRoute(android.hardware.display.WifiDisplay p0, android.hardware.display.WifiDisplayStatus p1) { return null; }
    private static void updateWifiDisplayRoute(android.media.MediaRouter.RouteInfo p0, android.hardware.display.WifiDisplay p1, android.hardware.display.WifiDisplayStatus p2, boolean p3) {}
    private static android.hardware.display.WifiDisplay findWifiDisplay(android.hardware.display.WifiDisplay[] p0, java.lang.String p1) { return null; }
    private static android.media.MediaRouter.RouteInfo findWifiDisplayRoute(android.hardware.display.WifiDisplay p0) { return null; }

    public static abstract class Callback {
        public Callback() {}
        public abstract void onRouteSelected(android.media.MediaRouter p0, int p1, android.media.MediaRouter.RouteInfo p2);
        public abstract void onRouteUnselected(android.media.MediaRouter p0, int p1, android.media.MediaRouter.RouteInfo p2);
        public abstract void onRouteAdded(android.media.MediaRouter p0, android.media.MediaRouter.RouteInfo p1);
        public abstract void onRouteRemoved(android.media.MediaRouter p0, android.media.MediaRouter.RouteInfo p1);
        public abstract void onRouteChanged(android.media.MediaRouter p0, android.media.MediaRouter.RouteInfo p1);
        public abstract void onRouteGrouped(android.media.MediaRouter p0, android.media.MediaRouter.RouteInfo p1, android.media.MediaRouter.RouteGroup p2, int p3);
        public abstract void onRouteUngrouped(android.media.MediaRouter p0, android.media.MediaRouter.RouteInfo p1, android.media.MediaRouter.RouteGroup p2);
        public abstract void onRouteVolumeChanged(android.media.MediaRouter p0, android.media.MediaRouter.RouteInfo p1);
        public void onRoutePresentationDisplayChanged(android.media.MediaRouter p0, android.media.MediaRouter.RouteInfo p1) {}
    }

    static class CallbackInfo {
        public int type;
        public int flags;
        public final android.media.MediaRouter.Callback cb = null;
        public final android.media.MediaRouter router = null;
        public CallbackInfo(android.media.MediaRouter.Callback p0, int p1, int p2, android.media.MediaRouter p3) {}
        public boolean filterRouteEvent(android.media.MediaRouter.RouteInfo p0) { return false; }
        public boolean filterRouteEvent(int p0) { return false; }
    }

    public static class RouteCategory {
        java.lang.CharSequence mName;
        int mNameResId;
        int mTypes;
        final boolean mGroupable = false;
        boolean mIsSystem;
        RouteCategory(java.lang.CharSequence p0, int p1, boolean p2) {}
        RouteCategory(int p0, int p1, boolean p2) {}
        public java.lang.CharSequence getName() { return null; }
        public java.lang.CharSequence getName(android.content.Context p0) { return null; }
        java.lang.CharSequence getName(android.content.res.Resources p0) { return null; }
        public java.util.List<android.media.MediaRouter.RouteInfo> getRoutes(java.util.List<android.media.MediaRouter.RouteInfo> p0) { return null; }
        public int getSupportedTypes() { return 0; }
        public boolean isGroupable() { return false; }
        public boolean isSystem() { return false; }
        public java.lang.String toString() { return null; }
    }

    public static class RouteGroup extends android.media.MediaRouter.RouteInfo {
        final java.util.ArrayList<android.media.MediaRouter.RouteInfo> mRoutes = null;
        private boolean mUpdateName;
        RouteGroup(android.media.MediaRouter.RouteCategory p0) { super(null); }
        java.lang.CharSequence getName(android.content.res.Resources p0) { return null; }
        public void addRoute(android.media.MediaRouter.RouteInfo p0) {}
        public void addRoute(android.media.MediaRouter.RouteInfo p0, int p1) {}
        public void removeRoute(android.media.MediaRouter.RouteInfo p0) {}
        public void removeRoute(int p0) {}
        public int getRouteCount() { return 0; }
        public android.media.MediaRouter.RouteInfo getRouteAt(int p0) { return null; }
        public void setIconDrawable(android.graphics.drawable.Drawable p0) {}
        public void setIconResource(int p0) {}
        public void requestSetVolume(int p0) {}
        public void requestUpdateVolume(int p0) {}
        void memberNameChanged(android.media.MediaRouter.RouteInfo p0, java.lang.CharSequence p1) {}
        void memberStatusChanged(android.media.MediaRouter.RouteInfo p0, java.lang.CharSequence p1) {}
        void memberVolumeChanged(android.media.MediaRouter.RouteInfo p0) {}
        void updateVolume() {}
        void routeUpdated() {}
        void updateName() {}
        public java.lang.String toString() { return null; }
    }

    public static class RouteInfo {
        java.lang.CharSequence mName;
        int mNameResId;
        java.lang.CharSequence mDescription;
        private java.lang.CharSequence mStatus;
        int mSupportedTypes;
        int mDeviceType;
        android.media.MediaRouter.RouteGroup mGroup;
        final android.media.MediaRouter.RouteCategory mCategory = null;
        android.graphics.drawable.Drawable mIcon;
        int mPlaybackType;
        int mVolumeMax;
        int mVolume;
        int mVolumeHandling;
        int mPlaybackStream;
        android.media.MediaRouter.VolumeCallbackInfo mVcb;
        android.view.Display mPresentationDisplay;
        int mPresentationDisplayId;
        java.lang.String mDeviceAddress;
        boolean mEnabled;
        java.lang.String mGlobalRouteId;
        private int mRealStatusCode;
        private int mResolvedStatusCode;
        public static final int STATUS_NONE = 0;
        public static final int STATUS_SCANNING = 1;
        public static final int STATUS_CONNECTING = 2;
        public static final int STATUS_AVAILABLE = 3;
        public static final int STATUS_NOT_AVAILABLE = 4;
        public static final int STATUS_IN_USE = 5;
        public static final int STATUS_CONNECTED = 6;
        public static final int DEVICE_TYPE_UNKNOWN = 0;
        public static final int DEVICE_TYPE_TV = 1;
        public static final int DEVICE_TYPE_SPEAKER = 2;
        public static final int DEVICE_TYPE_BLUETOOTH = 3;
        private java.lang.Object mTag;
        public static final int PLAYBACK_TYPE_LOCAL = 0;
        public static final int PLAYBACK_TYPE_REMOTE = 1;
        public static final int PLAYBACK_VOLUME_FIXED = 0;
        public static final int PLAYBACK_VOLUME_VARIABLE = 1;
        final android.media.IRemoteVolumeObserver.Stub mRemoteVolObserver = null;
        RouteInfo(android.media.MediaRouter.RouteCategory p0) {}
        public java.lang.CharSequence getName() { return null; }
        public java.lang.CharSequence getName(android.content.Context p0) { return null; }
        java.lang.CharSequence getName(android.content.res.Resources p0) { return null; }
        public java.lang.CharSequence getDescription() { return null; }
        public java.lang.CharSequence getStatus() { return null; }
        boolean setRealStatusCode(int p0) { return false; }
        boolean resolveStatusCode() { return false; }
        public int getStatusCode() { return 0; }
        public int getSupportedTypes() { return 0; }
        public int getDeviceType() { return 0; }
        public boolean matchesTypes(int p0) { return false; }
        public android.media.MediaRouter.RouteGroup getGroup() { return null; }
        public android.media.MediaRouter.RouteCategory getCategory() { return null; }
        public android.graphics.drawable.Drawable getIconDrawable() { return null; }
        public void setTag(java.lang.Object p0) {}
        public java.lang.Object getTag() { return null; }
        public int getPlaybackType() { return 0; }
        public int getPlaybackStream() { return 0; }
        public int getVolume() { return 0; }
        public void requestSetVolume(int p0) {}
        public void requestUpdateVolume(int p0) {}
        public int getVolumeMax() { return 0; }
        public int getVolumeHandling() { return 0; }
        public android.view.Display getPresentationDisplay() { return null; }
        boolean updatePresentationDisplay() { return false; }
        private android.view.Display choosePresentationDisplay() { return null; }
        public java.lang.String getDeviceAddress() { return null; }
        public boolean isEnabled() { return false; }
        public boolean isConnecting() { return false; }
        public boolean isSelected() { return false; }
        public boolean isDefault() { return false; }
        public boolean isBluetooth() { return false; }
        public void select() {}
        void setStatusInt(java.lang.CharSequence p0) {}
        void routeUpdated() {}
        public java.lang.String toString() { return null; }

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public static @interface DeviceType {
        }

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public static @interface PlaybackType {
        }

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        private static @interface PlaybackVolume {
        }
    }

    public static class SimpleCallback extends android.media.MediaRouter.Callback {
        public SimpleCallback() { super(); }
        public void onRouteSelected(android.media.MediaRouter p0, int p1, android.media.MediaRouter.RouteInfo p2) {}
        public void onRouteUnselected(android.media.MediaRouter p0, int p1, android.media.MediaRouter.RouteInfo p2) {}
        public void onRouteAdded(android.media.MediaRouter p0, android.media.MediaRouter.RouteInfo p1) {}
        public void onRouteRemoved(android.media.MediaRouter p0, android.media.MediaRouter.RouteInfo p1) {}
        public void onRouteChanged(android.media.MediaRouter p0, android.media.MediaRouter.RouteInfo p1) {}
        public void onRouteGrouped(android.media.MediaRouter p0, android.media.MediaRouter.RouteInfo p1, android.media.MediaRouter.RouteGroup p2, int p3) {}
        public void onRouteUngrouped(android.media.MediaRouter p0, android.media.MediaRouter.RouteInfo p1, android.media.MediaRouter.RouteGroup p2) {}
        public void onRouteVolumeChanged(android.media.MediaRouter p0, android.media.MediaRouter.RouteInfo p1) {}
    }

    static class Static implements android.hardware.display.DisplayManager.DisplayListener {
        final java.lang.String mPackageName = null;
        final android.content.res.Resources mResources = null;
        final android.media.IAudioService mAudioService = null;
        final android.hardware.display.DisplayManager mDisplayService = null;
        final android.media.IMediaRouterService mMediaRouterService = null;
        final android.os.Handler mHandler = null;
        final java.util.concurrent.CopyOnWriteArrayList<android.media.MediaRouter.CallbackInfo> mCallbacks = null;
        final java.util.ArrayList<android.media.MediaRouter.RouteInfo> mRoutes = null;
        final java.util.ArrayList<android.media.MediaRouter.RouteCategory> mCategories = null;
        final android.media.MediaRouter.RouteCategory mSystemCategory = null;
        final android.media.AudioRoutesInfo mCurAudioRoutesInfo = null;
        android.media.MediaRouter.RouteInfo mDefaultAudioVideo;
        android.media.MediaRouter.RouteInfo mBluetoothA2dpRoute;
        android.media.MediaRouter.RouteInfo mSelectedRoute;
        final boolean mCanConfigureWifiDisplays = false;
        boolean mActivelyScanningWifiDisplays;
        java.lang.String mPreviousActiveWifiDisplayAddress;
        int mDiscoveryRequestRouteTypes;
        boolean mDiscoverRequestActiveScan;
        int mCurrentUserId;
        android.media.IMediaRouterClient mClient;
        android.media.MediaRouterClientState mClientState;
        final android.media.IAudioRoutesObserver.Stub mAudioRoutesObserver = null;
        Static(android.content.Context p0) {}
        void startMonitoringRoutes(android.content.Context p0) {}
        void updateAudioRoutes(android.media.AudioRoutesInfo p0) {}
        boolean isBluetoothA2dpOn() { return false; }
        void updateDiscoveryRequest() {}
        public void onDisplayAdded(int p0) {}
        public void onDisplayChanged(int p0) {}
        public void onDisplayRemoved(int p0) {}
        public void setRouterGroupId(java.lang.String p0) {}
        public android.view.Display[] getAllPresentationDisplays() { return null; }
        private void updatePresentationDisplays(int p0) {}
        void updateSelectedRouteForId(java.lang.String p0) {}
        void setSelectedRoute(android.media.MediaRouter.RouteInfo p0, boolean p1) {}
        void rebindAsUser(int p0) {}
        void publishClientDiscoveryRequest() {}
        void publishClientSelectedRoute(boolean p0) {}
        void updateClientState() {}
        void requestSetVolume(android.media.MediaRouter.RouteInfo p0, int p1) {}
        void requestUpdateVolume(android.media.MediaRouter.RouteInfo p0, int p1) {}
        android.media.MediaRouter.RouteInfo makeGlobalRoute(android.media.MediaRouterClientState.RouteInfo p0) { return null; }
        void updateGlobalRoute(android.media.MediaRouter.RouteInfo p0, android.media.MediaRouterClientState.RouteInfo p1) {}
        android.media.MediaRouter.RouteInfo findGlobalRoute(java.lang.String p0) { return null; }
        boolean isPlaybackActive() { return false; }

        final class Client extends android.media.IMediaRouterClient.Stub {
            Client(android.media.MediaRouter.Static p0) { super(); }
            public void onStateChanged() {}
            public void onRestoreRoute() {}
            public void onSelectedRouteChanged(java.lang.String p0) {}
            public void onGlobalA2dpChanged(boolean p0) {}
        }
    }

    public static class UserRouteInfo extends android.media.MediaRouter.RouteInfo {
        android.media.RemoteControlClient mRcc;
        android.media.MediaRouter.UserRouteInfo.SessionVolumeProvider mSvp;
        UserRouteInfo(android.media.MediaRouter.RouteCategory p0) { super(null); }
        public void setName(java.lang.CharSequence p0) {}
        public void setName(int p0) {}
        public void setDescription(java.lang.CharSequence p0) {}
        public void setStatus(java.lang.CharSequence p0) {}
        public void setRemoteControlClient(android.media.RemoteControlClient p0) {}
        public android.media.RemoteControlClient getRemoteControlClient() { return null; }
        public void setIconDrawable(android.graphics.drawable.Drawable p0) {}
        public void setIconResource(int p0) {}
        public void setVolumeCallback(android.media.MediaRouter.VolumeCallback p0) {}
        public void setPlaybackType(int p0) {}
        public void setVolumeHandling(int p0) {}
        public void setVolume(int p0) {}
        public void requestSetVolume(int p0) {}
        public void requestUpdateVolume(int p0) {}
        public void setVolumeMax(int p0) {}
        public void setPlaybackStream(int p0) {}
        private void updatePlaybackInfoOnRcc() {}
        private void configureSessionVolume() {}

        class SessionVolumeProvider extends android.media.VolumeProvider {
            SessionVolumeProvider(android.media.MediaRouter.UserRouteInfo p0, int p1, int p2, int p3) { super(0, 0, 0); }
            public void onSetVolumeTo(int p0) {}
            public void onAdjustVolume(int p0) {}
        }
    }

    public static abstract class VolumeCallback {
        public VolumeCallback() {}
        public abstract void onVolumeUpdateRequest(android.media.MediaRouter.RouteInfo p0, int p1);
        public abstract void onVolumeSetRequest(android.media.MediaRouter.RouteInfo p0, int p1);
    }

    static class VolumeCallbackInfo {
        public final android.media.MediaRouter.VolumeCallback vcb = null;
        public final android.media.MediaRouter.RouteInfo route = null;
        public VolumeCallbackInfo(android.media.MediaRouter.VolumeCallback p0, android.media.MediaRouter.RouteInfo p1) {}
    }

    static class VolumeChangeReceiver extends android.content.BroadcastReceiver {
        VolumeChangeReceiver() { super(); }
        public void onReceive(android.content.Context p0, android.content.Intent p1) {}
    }

    static class WifiDisplayStatusChangedReceiver extends android.content.BroadcastReceiver {
        WifiDisplayStatusChangedReceiver() { super(); }
        public void onReceive(android.content.Context p0, android.content.Intent p1) {}
    }
}
