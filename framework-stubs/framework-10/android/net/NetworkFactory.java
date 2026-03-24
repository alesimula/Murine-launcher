package android.net;

public class NetworkFactory extends android.os.Handler {
    private static final boolean DBG = true;
    private static final boolean VDBG = false;
    private static final int BASE = 536576;
    public static final int CMD_REQUEST_NETWORK = 536576;
    public static final int CMD_CANCEL_REQUEST = 536577;
    private static final int CMD_SET_SCORE = 536578;
    private static final int CMD_SET_FILTER = 536579;
    public static final int EVENT_UNFULFILLABLE_REQUEST = 536580;
    private final android.content.Context mContext = null;
    private final java.util.ArrayList<android.os.Message> mPreConnectedQueue = null;
    private com.android.internal.util.AsyncChannel mAsyncChannel;
    private final java.lang.String LOG_TAG = null;
    private final android.util.SparseArray<android.net.NetworkFactory.NetworkRequestInfo> mNetworkRequests = null;
    private int mScore;
    private android.net.NetworkCapabilities mCapabilityFilter;
    private int mRefCount;
    private android.os.Messenger mMessenger;
    private int mSerialNumber;
    @android.annotation.UnsupportedAppUsage
    public NetworkFactory(android.os.Looper p0, android.content.Context p1, java.lang.String p2, android.net.NetworkCapabilities p3) { super(); }
    public void register() {}
    public void unregister() {}
    public void handleMessage(android.os.Message p0) {}
    protected void handleAddRequest(android.net.NetworkRequest p0, int p1) {}
    protected void handleAddRequest(android.net.NetworkRequest p0, int p1, int p2) {}
    protected void handleRemoveRequest(android.net.NetworkRequest p0) {}
    private void handleSetScore(int p0) {}
    private void handleSetFilter(android.net.NetworkCapabilities p0) {}
    public boolean acceptRequest(android.net.NetworkRequest p0, int p1) { return false; }
    private void evalRequest(android.net.NetworkFactory.NetworkRequestInfo p0) {}
    private boolean shouldNeedNetworkFor(android.net.NetworkFactory.NetworkRequestInfo p0) { return false; }
    private boolean shouldReleaseNetworkFor(android.net.NetworkFactory.NetworkRequestInfo p0) { return false; }
    private void evalRequests() {}
    protected void reevaluateAllRequests() {}
    protected void releaseRequestAsUnfulfillableByAnyFactory(android.net.NetworkRequest p0) {}
    protected void startNetwork() {}
    protected void stopNetwork() {}
    protected void needNetworkFor(android.net.NetworkRequest p0, int p1) {}
    protected void releaseNetworkFor(android.net.NetworkRequest p0) {}
    @android.annotation.UnsupportedAppUsage(maxTargetSdk=28, trackingBug=115609023L)
    public void setScoreFilter(int p0) {}
    public void setCapabilityFilter(android.net.NetworkCapabilities p0) {}
    protected int getRequestCount() { return 0; }
    public int getSerialNumber() { return 0; }
    protected void log(java.lang.String p0) {}
    @android.annotation.UnsupportedAppUsage(maxTargetSdk=28, trackingBug=115609023L)
    public void dump(java.io.FileDescriptor p0, java.io.PrintWriter p1, java.lang.String[] p2) {}
    public java.lang.String toString() { return null; }

    public static class SerialNumber {
        public static final int NONE = -1;
        public static final int VPN = -2;
        private static final java.util.concurrent.atomic.AtomicInteger sNetworkFactorySerialNumber = null;
        public SerialNumber() {}
        public static final int nextSerialNumber() { return 0; }
    }

    private class NetworkRequestInfo {
        public final android.net.NetworkRequest request = null;
        public int score;
        public boolean requested;
        public int factorySerialNumber;
        NetworkRequestInfo(android.net.NetworkFactory p0, android.net.NetworkRequest p1, int p2, int p3) {}
        public java.lang.String toString() { return null; }
    }
}
