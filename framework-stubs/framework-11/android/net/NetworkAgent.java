package android.net;

@android.annotation.SystemApi
public abstract class NetworkAgent {
    private volatile android.net.Network mNetwork;
    private final boolean mIsLegacy = false;
    private final android.os.Handler mHandler = null;
    private volatile com.android.internal.util.AsyncChannel mAsyncChannel;
    private final java.lang.String LOG_TAG = null;
    private static final boolean DBG = true;
    private static final boolean VDBG = false;
    private final java.util.ArrayList<android.os.Message> mPreConnectedQueue = null;
    private volatile long mLastBwRefreshTime;
    private static final long BW_REFRESH_MIN_WIN_MS = 500L;
    private boolean mBandwidthUpdateScheduled;
    private java.util.concurrent.atomic.AtomicBoolean mBandwidthUpdatePending;
    private android.net.NetworkInfo mNetworkInfo;
    private final java.lang.Object mRegisterLock = null;
    public final int providerId = 0;
    private static final int BASE = 528384;
    public static final int CMD_SUSPECT_BAD = 528384;
    public static final int EVENT_NETWORK_INFO_CHANGED = 528385;
    public static final int EVENT_NETWORK_CAPABILITIES_CHANGED = 528386;
    public static final int EVENT_NETWORK_PROPERTIES_CHANGED = 528387;
    public static final int WIFI_BASE_SCORE = 60;
    public static final int EVENT_NETWORK_SCORE_CHANGED = 528388;
    public static final int CMD_REPORT_NETWORK_STATUS = 528391;
    public static final int VALIDATION_STATUS_VALID = 1;
    public static final int VALIDATION_STATUS_NOT_VALID = 2;
    public static final int VALID_NETWORK = 1;
    public static final int INVALID_NETWORK = 2;
    public static java.lang.String REDIRECT_URL_KEY;
    public static final int EVENT_SET_EXPLICITLY_SELECTED = 528392;
    public static final int CMD_SAVE_ACCEPT_UNVALIDATED = 528393;
    public static final int CMD_REQUEST_BANDWIDTH_UPDATE = 528394;
    public static final int CMD_START_SOCKET_KEEPALIVE = 528395;
    public static final int CMD_STOP_SOCKET_KEEPALIVE = 528396;
    public static final int EVENT_SOCKET_KEEPALIVE = 528397;
    public static final int CMD_SET_SIGNAL_STRENGTH_THRESHOLDS = 528398;
    public static final int CMD_PREVENT_AUTOMATIC_RECONNECT = 528399;
    public static final int CMD_ADD_KEEPALIVE_PACKET_FILTER = 528400;
    public static final int CMD_REMOVE_KEEPALIVE_PACKET_FILTER = 528401;
    private volatile android.net.NetworkAgent.InitialConfiguration mInitialConfiguration;
    public NetworkAgent(android.os.Looper p0, android.content.Context p1, java.lang.String p2, android.net.NetworkInfo p3, android.net.NetworkCapabilities p4, android.net.LinkProperties p5, int p6) {}
    public NetworkAgent(android.os.Looper p0, android.content.Context p1, java.lang.String p2, android.net.NetworkInfo p3, android.net.NetworkCapabilities p4, android.net.LinkProperties p5, int p6, android.net.NetworkAgentConfig p7) {}
    public NetworkAgent(android.os.Looper p0, android.content.Context p1, java.lang.String p2, android.net.NetworkInfo p3, android.net.NetworkCapabilities p4, android.net.LinkProperties p5, int p6, int p7) {}
    public NetworkAgent(android.os.Looper p0, android.content.Context p1, java.lang.String p2, android.net.NetworkInfo p3, android.net.NetworkCapabilities p4, android.net.LinkProperties p5, int p6, android.net.NetworkAgentConfig p7, int p8) {}
    private static android.net.NetworkInfo getLegacyNetworkInfo(android.net.NetworkAgentConfig p0) { return null; }
    public NetworkAgent(android.content.Context p0, android.os.Looper p1, java.lang.String p2, android.net.NetworkCapabilities p3, android.net.LinkProperties p4, int p5, android.net.NetworkAgentConfig p6, android.net.NetworkProvider p7) {}
    private NetworkAgent(android.os.Looper p0, android.content.Context p1, java.lang.String p2, android.net.NetworkCapabilities p3, android.net.LinkProperties p4, int p5, android.net.NetworkAgentConfig p6, int p7, android.net.NetworkInfo p8, boolean p9) {}
    public android.net.Network register() { return null; }
    public android.os.Messenger registerForTest(android.net.Network p0) { return null; }
    public boolean waitForIdle(long p0) { return false; }
    public android.net.Network getNetwork() { return null; }
    private void queueOrSendMessage(int p0, java.lang.Object p1) {}
    private void queueOrSendMessage(int p0, int p1, int p2) {}
    private void queueOrSendMessage(int p0, int p1, int p2, java.lang.Object p3) {}
    private void queueOrSendMessage(android.os.Message p0) {}
    public final void sendLinkProperties(android.net.LinkProperties p0) {}
    public void markConnected() {}
    public void unregister() {}
    @java.lang.Deprecated
    public void setLegacySubtype(int p0, java.lang.String p1) {}
    @java.lang.Deprecated
    public void setLegacyExtraInfo(java.lang.String p0) {}
    public final void sendNetworkInfo(android.net.NetworkInfo p0) {}
    public final void sendNetworkCapabilities(android.net.NetworkCapabilities p0) {}
    public final void sendNetworkScore(int p0) {}
    public void explicitlySelected(boolean p0) {}
    public void explicitlySelected(boolean p0, boolean p1) {}
    public void onNetworkUnwanted() {}
    protected void unwanted() {}
    public void onBandwidthUpdateRequested() {}
    protected void pollLceData() {}
    public void onValidationStatus(int p0, android.net.Uri p1) {}
    protected void networkStatus(int p0, java.lang.String p1) {}
    public void onSaveAcceptUnvalidated(boolean p0) {}
    protected void saveAcceptUnvalidated(boolean p0) {}
    public void onStartSocketKeepalive(int p0, java.time.Duration p1, android.net.KeepalivePacketData p2) {}
    protected void startSocketKeepalive(android.os.Message p0) {}
    public void onStopSocketKeepalive(int p0) {}
    protected void stopSocketKeepalive(android.os.Message p0) {}
    public final void sendSocketKeepaliveEvent(int p0, int p1) {}
    public void onSocketKeepaliveEvent(int p0, int p1) {}
    public void onAddKeepalivePacketFilter(int p0, android.net.KeepalivePacketData p1) {}
    protected void addKeepalivePacketFilter(android.os.Message p0) {}
    public void onRemoveKeepalivePacketFilter(int p0) {}
    protected void removeKeepalivePacketFilter(android.os.Message p0) {}
    public void onSignalStrengthThresholdsUpdated(int[] p0) {}
    protected void setSignalStrengthThresholds(int[] p0) {}
    public void onAutomaticReconnectDisabled() {}
    protected void preventAutomaticReconnect() {}
    protected void log(java.lang.String p0) {}

    private static class InitialConfiguration {
        public final android.content.Context context = null;
        public final android.net.NetworkCapabilities capabilities = null;
        public final android.net.LinkProperties properties = null;
        public final int score = 0;
        public final android.net.NetworkAgentConfig config = null;
        public final android.net.NetworkInfo info = null;
        InitialConfiguration(android.content.Context p0, android.net.NetworkCapabilities p1, android.net.LinkProperties p2, int p3, android.net.NetworkAgentConfig p4, android.net.NetworkInfo p5) {}
    }

    private class NetworkAgentHandler extends android.os.Handler {
        NetworkAgentHandler(android.net.NetworkAgent p0, android.os.Looper p1) { super(); }
        public void handleMessage(android.os.Message p0) {}
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ValidationStatus {
    }
}
