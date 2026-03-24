package com.android.internal.os;

class ZygoteServer {
    public static final java.lang.String TAG = "ZygoteServer";
    private static final int USAP_POOL_SIZE_MAX_LIMIT = 100;
    private static final int USAP_POOL_SIZE_MIN_LIMIT = 1;
    private static final java.lang.String USAP_POOL_SIZE_MAX_DEFAULT = "10";
    private static final java.lang.String USAP_POOL_SIZE_MIN_DEFAULT = "1";
    private final boolean mUsapPoolSupported = false;
    private boolean mUsapPoolEnabled;
    private android.net.LocalServerSocket mZygoteSocket;
    private android.net.LocalServerSocket mUsapPoolSocket;
    private java.io.FileDescriptor mUsapPoolEventFD;
    private boolean mCloseSocketFd;
    private boolean mIsForkChild;
    private int mUsapPoolSizeMax;
    private int mUsapPoolSizeMin;
    private int mUsapPoolRefillThreshold;
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
    java.lang.Runnable fillUsapPool(int[] p0) { return null; }
    java.lang.Runnable setUsapPoolStatus(boolean p0, android.net.LocalSocket p1) { return null; }
    java.lang.Runnable runSelectLoop(java.lang.String p0) { return null; }
}
