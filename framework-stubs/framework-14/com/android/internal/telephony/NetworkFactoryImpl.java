package com.android.internal.telephony;

class NetworkFactoryImpl extends com.android.internal.telephony.NetworkFactoryLegacyImpl {
    NetworkFactoryImpl(com.android.internal.telephony.NetworkFactory p0, android.os.Looper p1, android.content.Context p2, android.net.NetworkCapabilities p3) { super(null, null, null, null); }
    public void register(java.lang.String p0) {}
    public void registerIgnoringScore(java.lang.String p0) {}
    public void handleMessage(android.os.Message p0) {}
    public final void reevaluateAllRequests() {}
    @java.lang.Deprecated
    public void setScoreFilter(int p0) {}
    public void setScoreFilter(android.net.NetworkScore p0) {}
    public void setCapabilityFilter(android.net.NetworkCapabilities p0) {}
    public int getRequestCount() { return 0; }
    public void dump(java.io.FileDescriptor p0, java.io.PrintWriter p1, java.lang.String[] p2) {}
    public java.lang.String toString() { return null; }

    private static class NetworkRequestInfo {
        public final android.net.NetworkRequest request = null;
        public boolean requested;
        NetworkRequestInfo(android.net.NetworkRequest p0) {}
        public java.lang.String toString() { return null; }
    }
}
