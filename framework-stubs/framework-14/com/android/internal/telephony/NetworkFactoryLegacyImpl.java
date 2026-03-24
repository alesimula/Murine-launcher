package com.android.internal.telephony;

class NetworkFactoryLegacyImpl extends android.os.Handler implements com.android.internal.telephony.NetworkFactoryShim {
    public static final int CMD_REQUEST_NETWORK = 1;
    public static final int CMD_CANCEL_REQUEST = 2;
    final android.content.Context mContext = null;
    final com.android.internal.telephony.NetworkFactory mParent = null;
    android.net.NetworkCapabilities mCapabilityFilter;
    android.net.NetworkProvider mProvider;
    NetworkFactoryLegacyImpl(com.android.internal.telephony.NetworkFactory p0, android.os.Looper p1, android.content.Context p2, android.net.NetworkCapabilities p3) { super(); }
    public void register(java.lang.String p0) {}
    public void terminate() {}
    public void handleMessage(android.os.Message p0) {}
    protected void handleAddRequest(android.net.NetworkRequest p0, int p1, int p2) {}
    public boolean acceptRequest(android.net.NetworkRequest p0) { return false; }
    public void reevaluateAllRequests() {}
    public void releaseRequestAsUnfulfillableByAnyFactory(android.net.NetworkRequest p0) {}
    public void setScoreFilter(int p0) {}
    public void setScoreFilter(android.net.NetworkScore p0) {}
    public void setCapabilityFilter(android.net.NetworkCapabilities p0) {}
    public int getRequestCount() { return 0; }
    public int getSerialNumber() { return 0; }
    public android.net.NetworkProvider getProvider() { return null; }
    public void dump(java.io.FileDescriptor p0, java.io.PrintWriter p1, java.lang.String[] p2) {}
    public java.lang.String toString() { return null; }

    private static class NetworkRequestInfo {
        public final android.net.NetworkRequest request = null;
        public int score;
        public boolean requested;
        public int providerId;
        NetworkRequestInfo(android.net.NetworkRequest p0, int p1, int p2) {}
        public java.lang.String toString() { return null; }
    }
}
