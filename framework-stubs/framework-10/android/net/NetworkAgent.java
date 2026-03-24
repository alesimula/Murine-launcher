package android.net;

public abstract class NetworkAgent extends android.os.Handler {
    public final int netId = 0;
    private volatile com.android.internal.util.AsyncChannel mAsyncChannel;
    private final java.lang.String LOG_TAG = null;
    private static final boolean DBG = true;
    private static final boolean VDBG = false;
    private final android.content.Context mContext = null;
    private final java.util.ArrayList<android.os.Message> mPreConnectedQueue = null;
    private volatile long mLastBwRefreshTime;
    private static final long BW_REFRESH_MIN_WIN_MS = 500L;
    private boolean mPollLceScheduled;
    private java.util.concurrent.atomic.AtomicBoolean mPollLcePending;
    public final int mFactorySerialNumber = 0;
    private static final int BASE = 528384;
    public static final int CMD_SUSPECT_BAD = 528384;
    public static final int EVENT_NETWORK_INFO_CHANGED = 528385;
    public static final int EVENT_NETWORK_CAPABILITIES_CHANGED = 528386;
    public static final int EVENT_NETWORK_PROPERTIES_CHANGED = 528387;
    public static final int WIFI_BASE_SCORE = 60;
    public static final int EVENT_NETWORK_SCORE_CHANGED = 528388;
    public static final int CMD_REPORT_NETWORK_STATUS = 528391;
    public static final int VALID_NETWORK = 1;
    public static final int INVALID_NETWORK = 2;
    public static java.lang.String REDIRECT_URL_KEY;
    public static final int EVENT_SET_EXPLICITLY_SELECTED = 528392;
    public static final int CMD_SAVE_ACCEPT_UNVALIDATED = 528393;
    public static final int CMD_REQUEST_BANDWIDTH_UPDATE = 528394;
    public static final int CMD_START_SOCKET_KEEPALIVE = 528395;
    public static final int CMD_STOP_SOCKET_KEEPALIVE = 528396;
    public static final int EVENT_SOCKET_KEEPALIVE = 528397;
    public static final int CMD_ADD_KEEPALIVE_PACKET_FILTER = 528400;
    public static final int CMD_REMOVE_KEEPALIVE_PACKET_FILTER = 528401;
    public static final int CMD_SET_SIGNAL_STRENGTH_THRESHOLDS = 528398;
    public static final int CMD_PREVENT_AUTOMATIC_RECONNECT = 528399;
    public NetworkAgent(android.os.Looper p0, android.content.Context p1, java.lang.String p2, android.net.NetworkInfo p3, android.net.NetworkCapabilities p4, android.net.LinkProperties p5, int p6) { super(); }
    public NetworkAgent(android.os.Looper p0, android.content.Context p1, java.lang.String p2, android.net.NetworkInfo p3, android.net.NetworkCapabilities p4, android.net.LinkProperties p5, int p6, android.net.NetworkMisc p7) { super(); }
    public NetworkAgent(android.os.Looper p0, android.content.Context p1, java.lang.String p2, android.net.NetworkInfo p3, android.net.NetworkCapabilities p4, android.net.LinkProperties p5, int p6, int p7) { super(); }
    public NetworkAgent(android.os.Looper p0, android.content.Context p1, java.lang.String p2, android.net.NetworkInfo p3, android.net.NetworkCapabilities p4, android.net.LinkProperties p5, int p6, android.net.NetworkMisc p7, int p8) { super(); }
    public void handleMessage(android.os.Message p0) {}
    private void queueOrSendMessage(int p0, java.lang.Object p1) {}
    private void queueOrSendMessage(int p0, int p1, int p2) {}
    private void queueOrSendMessage(int p0, int p1, int p2, java.lang.Object p3) {}
    private void queueOrSendMessage(android.os.Message p0) {}
    public void sendLinkProperties(android.net.LinkProperties p0) {}
    @android.annotation.UnsupportedAppUsage(maxTargetSdk=28, trackingBug=115609023L)
    public void sendNetworkInfo(android.net.NetworkInfo p0) {}
    public void sendNetworkCapabilities(android.net.NetworkCapabilities p0) {}
    public void sendNetworkScore(int p0) {}
    public void explicitlySelected(boolean p0) {}
    public void explicitlySelected(boolean p0, boolean p1) {}
    protected abstract void unwanted();
    protected void pollLceData() {}
    protected void networkStatus(int p0, java.lang.String p1) {}
    protected void saveAcceptUnvalidated(boolean p0) {}
    protected void startSocketKeepalive(android.os.Message p0) {}
    protected void stopSocketKeepalive(android.os.Message p0) {}
    public void onSocketKeepaliveEvent(int p0, int p1) {}
    protected void addKeepalivePacketFilter(android.os.Message p0) {}
    protected void removeKeepalivePacketFilter(android.os.Message p0) {}
    protected void setSignalStrengthThresholds(int[] p0) {}
    protected void preventAutomaticReconnect() {}
    protected void log(java.lang.String p0) {}
}
