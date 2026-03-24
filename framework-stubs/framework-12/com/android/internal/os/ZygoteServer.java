package com.android.internal.os;

class ZygoteServer {
    public static final java.lang.String TAG = "ZygoteServer";
    private static final int USAP_POOL_SIZE_MAX_LIMIT = 100;
    private static final int USAP_POOL_SIZE_MIN_LIMIT = 1;
    private static final java.lang.String USAP_POOL_SIZE_MAX_DEFAULT = "10";
    private static final java.lang.String USAP_POOL_SIZE_MIN_DEFAULT = "1";
    private static final java.lang.String USAP_POOL_REFILL_DELAY_MS_DEFAULT = "3000";
    private static final int INVALID_TIMESTAMP = -1;
    private final boolean mUsapPoolSupported = false;
    private boolean mUsapPoolEnabled;
    private android.net.LocalServerSocket mZygoteSocket;
    private final android.net.LocalServerSocket mUsapPoolSocket = null;
    private final java.io.FileDescriptor mUsapPoolEventFD = null;
    private boolean mCloseSocketFd;
    private boolean mIsForkChild;
    private int mUsapPoolSizeMax;
    private int mUsapPoolSizeMin;
    private int mUsapPoolRefillThreshold;
    private int mUsapPoolRefillDelayMs;
    private com.android.internal.os.ZygoteServer.UsapPoolRefillAction mUsapPoolRefillAction;
    private long mUsapPoolRefillTriggerTimestamp;
    private boolean mIsFirstPropertyCheck;
    private long mLastPropCheckTimestamp;
    ZygoteServer() {}
    ZygoteServer(boolean p0) {}
    void setForkChild() {}
    public boolean isUsapPoolEnabled() { return false; }
    void registerServerSocketAtAbstractName(java.lang.String p0) {}
    private com.android.internal.os.ZygoteConnection acceptCommandPeer(java.lang.String p0) { return null; }
    protected com.android.internal.os.ZygoteConnection createNewConnection(android.net.LocalSocket p0, java.lang.String p1) throws java.io.IOException { return null; }
    void closeServerSocket() {}
    java.io.FileDescriptor getZygoteSocketFileDescriptor() { return null; }
    private void fetchUsapPoolPolicyProps() {}
    private void fetchUsapPoolPolicyPropsWithMinInterval() {}
    private void fetchUsapPoolPolicyPropsIfUnfetched() {}
    java.lang.Runnable fillUsapPool(int[] p0, boolean p1) { return null; }
    java.lang.Runnable setUsapPoolStatus(boolean p0, android.net.LocalSocket p1) { return null; }
    private void resetUsapRefillState() {}
    java.lang.Runnable runSelectLoop(java.lang.String p0) { return null; }

    private static enum UsapPoolRefillAction {
        DELAYED,
        IMMEDIATE,
        NONE;
        private UsapPoolRefillAction() {}
    }
}
