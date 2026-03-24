package android.net.wifi.aware;

public class WifiAwareManager {
    private static final java.lang.String TAG = "WifiAwareManager";
    private static final boolean DBG = false;
    private static final boolean VDBG = false;
    public static final java.lang.String ACTION_WIFI_AWARE_STATE_CHANGED = "android.net.wifi.aware.action.WIFI_AWARE_STATE_CHANGED";
    public static final int WIFI_AWARE_DATA_PATH_ROLE_INITIATOR = 0;
    public static final int WIFI_AWARE_DATA_PATH_ROLE_RESPONDER = 1;
    private final android.content.Context mContext = null;
    private final android.net.wifi.aware.IWifiAwareManager mService = null;
    private final java.lang.Object mLock = null;
    public WifiAwareManager(android.content.Context p0, android.net.wifi.aware.IWifiAwareManager p1) {}
    public boolean isAvailable() { return false; }
    public android.net.wifi.aware.Characteristics getCharacteristics() { return null; }
    public void attach(android.net.wifi.aware.AttachCallback p0, android.os.Handler p1) {}
    public void attach(android.net.wifi.aware.AttachCallback p0, android.net.wifi.aware.IdentityChangedListener p1, android.os.Handler p2) {}
    public void attach(android.os.Handler p0, android.net.wifi.aware.ConfigRequest p1, android.net.wifi.aware.AttachCallback p2, android.net.wifi.aware.IdentityChangedListener p3) {}
    public void disconnect(int p0, android.os.Binder p1) {}
    public void publish(int p0, android.os.Looper p1, android.net.wifi.aware.PublishConfig p2, android.net.wifi.aware.DiscoverySessionCallback p3) {}
    public void updatePublish(int p0, int p1, android.net.wifi.aware.PublishConfig p2) {}
    public void subscribe(int p0, android.os.Looper p1, android.net.wifi.aware.SubscribeConfig p2, android.net.wifi.aware.DiscoverySessionCallback p3) {}
    public void updateSubscribe(int p0, int p1, android.net.wifi.aware.SubscribeConfig p2) {}
    public void terminateSession(int p0, int p1) {}
    public void sendMessage(int p0, int p1, android.net.wifi.aware.PeerHandle p2, byte[] p3, int p4, int p5) {}
    public android.net.NetworkSpecifier createNetworkSpecifier(int p0, int p1, int p2, android.net.wifi.aware.PeerHandle p3, byte[] p4, java.lang.String p5) { return null; }
    public android.net.NetworkSpecifier createNetworkSpecifier(int p0, int p1, byte[] p2, byte[] p3, java.lang.String p4) { return null; }

    private static class WifiAwareEventCallbackProxy extends android.net.wifi.aware.IWifiAwareEventCallback.Stub {
        private static final int CALLBACK_CONNECT_SUCCESS = 0;
        private static final int CALLBACK_CONNECT_FAIL = 1;
        private static final int CALLBACK_IDENTITY_CHANGED = 2;
        private final android.os.Handler mHandler = null;
        private final java.lang.ref.WeakReference<android.net.wifi.aware.WifiAwareManager> mAwareManager = null;
        private final android.os.Binder mBinder = null;
        private final android.os.Looper mLooper = null;
        WifiAwareEventCallbackProxy(android.net.wifi.aware.WifiAwareManager p0, android.os.Looper p1, android.os.Binder p2, android.net.wifi.aware.AttachCallback p3, android.net.wifi.aware.IdentityChangedListener p4) { super(); }
        public void onConnectSuccess(int p0) {}
        public void onConnectFail(int p0) {}
        public void onIdentityChanged(byte[] p0) {}
    }

    private static class WifiAwareDiscoverySessionCallbackProxy extends android.net.wifi.aware.IWifiAwareDiscoverySessionCallback.Stub {
        private static final int CALLBACK_SESSION_STARTED = 0;
        private static final int CALLBACK_SESSION_CONFIG_SUCCESS = 1;
        private static final int CALLBACK_SESSION_CONFIG_FAIL = 2;
        private static final int CALLBACK_SESSION_TERMINATED = 3;
        private static final int CALLBACK_MATCH = 4;
        private static final int CALLBACK_MESSAGE_SEND_SUCCESS = 5;
        private static final int CALLBACK_MESSAGE_SEND_FAIL = 6;
        private static final int CALLBACK_MESSAGE_RECEIVED = 7;
        private static final int CALLBACK_MATCH_WITH_DISTANCE = 8;
        private static final java.lang.String MESSAGE_BUNDLE_KEY_MESSAGE = "message";
        private static final java.lang.String MESSAGE_BUNDLE_KEY_MESSAGE2 = "message2";
        private final java.lang.ref.WeakReference<android.net.wifi.aware.WifiAwareManager> mAwareManager = null;
        private final boolean mIsPublish = false;
        private final android.net.wifi.aware.DiscoverySessionCallback mOriginalCallback = null;
        private final int mClientId = 0;
        private final android.os.Handler mHandler = null;
        private android.net.wifi.aware.DiscoverySession mSession;
        WifiAwareDiscoverySessionCallbackProxy(android.net.wifi.aware.WifiAwareManager p0, android.os.Looper p1, boolean p2, android.net.wifi.aware.DiscoverySessionCallback p3, int p4) { super(); }
        public void onSessionStarted(int p0) {}
        public void onSessionConfigSuccess() {}
        public void onSessionConfigFail(int p0) {}
        public void onSessionTerminated(int p0) {}
        private void onMatchCommon(int p0, int p1, byte[] p2, byte[] p3, int p4) {}
        public void onMatch(int p0, byte[] p1, byte[] p2) {}
        public void onMatchWithDistance(int p0, byte[] p1, byte[] p2, int p3) {}
        public void onMessageSendSuccess(int p0) {}
        public void onMessageSendFail(int p0, int p1) {}
        public void onMessageReceived(int p0, byte[] p1) {}
        public void onProxySessionStarted(int p0) {}
        public void onProxySessionTerminated(int p0) {}
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface DataPathRole {
    }
}
