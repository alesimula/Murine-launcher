package com.android.internal.telephony;

public class NetworkFactory {
    static final boolean DBG = true;
    static final boolean VDBG = false;
    final com.android.internal.telephony.NetworkFactoryShim mImpl = null;
    public static final int CMD_REQUEST_NETWORK = 1;
    public static final int CMD_CANCEL_REQUEST = 2;
    public NetworkFactory(android.os.Looper p0, android.content.Context p1, java.lang.String p2, android.net.NetworkCapabilities p3) {}
    public android.os.Message obtainMessage(int p0, int p1, int p2, java.lang.Object p3) { return null; }
    public final android.os.Looper getLooper() { return null; }
    public void register() {}
    public void registerIgnoringScore() {}
    public void terminate() {}
    protected final void reevaluateAllRequests() {}
    public boolean acceptRequest(android.net.NetworkRequest p0) { return false; }
    protected void releaseRequestAsUnfulfillableByAnyFactory(android.net.NetworkRequest p0) {}
    protected void startNetwork() {}
    protected void stopNetwork() {}
    protected void needNetworkFor(android.net.NetworkRequest p0) {}
    protected void releaseNetworkFor(android.net.NetworkRequest p0) {}
    @java.lang.Deprecated
    public void setScoreFilter(int p0) {}
    public void setScoreFilter(android.net.NetworkScore p0) {}
    public void setCapabilityFilter(android.net.NetworkCapabilities p0) {}
    protected int getRequestCount() { return 0; }
    public int getSerialNumber() { return 0; }
    public android.net.NetworkProvider getProvider() { return null; }
    protected void log(java.lang.String p0) {}
    public void dump(java.io.FileDescriptor p0, java.io.PrintWriter p1, java.lang.String[] p2) {}
    public java.lang.String toString() { return null; }
}
