package android.net.wifi.aware;

public class DiscoverySession implements java.lang.AutoCloseable {
    private static final java.lang.String TAG = "DiscoverySession";
    private static final boolean DBG = false;
    private static final boolean VDBG = false;
    private static final int MAX_SEND_RETRY_COUNT = 5;
    protected java.lang.ref.WeakReference<android.net.wifi.aware.WifiAwareManager> mMgr;
    protected final int mClientId = 0;
    protected final int mSessionId = 0;
    protected boolean mTerminated;
    public static int getMaxSendRetryCount() { return 0; }
    public DiscoverySession(android.net.wifi.aware.WifiAwareManager p0, int p1, int p2) {}
    public void close() {}
    public void setTerminated() {}
    protected void finalize() throws java.lang.Throwable {}
    public int getClientId() { return 0; }
    public int getSessionId() { return 0; }
    public void sendMessage(android.net.wifi.aware.PeerHandle p0, int p1, byte[] p2, int p3) {}
    public void sendMessage(android.net.wifi.aware.PeerHandle p0, int p1, byte[] p2) {}
    @java.lang.Deprecated
    public android.net.NetworkSpecifier createNetworkSpecifierOpen(android.net.wifi.aware.PeerHandle p0) { return null; }
    @java.lang.Deprecated
    public android.net.NetworkSpecifier createNetworkSpecifierPassphrase(android.net.wifi.aware.PeerHandle p0, java.lang.String p1) { return null; }
    @java.lang.Deprecated
    @android.annotation.SystemApi
    public android.net.NetworkSpecifier createNetworkSpecifierPmk(android.net.wifi.aware.PeerHandle p0, byte[] p1) { return null; }
}
