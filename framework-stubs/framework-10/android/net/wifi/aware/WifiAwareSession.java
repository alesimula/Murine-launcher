package android.net.wifi.aware;

public class WifiAwareSession implements java.lang.AutoCloseable {
    private static final java.lang.String TAG = "WifiAwareSession";
    private static final boolean DBG = false;
    private static final boolean VDBG = false;
    private final java.lang.ref.WeakReference<android.net.wifi.aware.WifiAwareManager> mMgr = null;
    private final android.os.Binder mBinder = null;
    private final int mClientId = 0;
    private boolean mTerminated;
    public WifiAwareSession(android.net.wifi.aware.WifiAwareManager p0, android.os.Binder p1, int p2) {}
    public void close() {}
    protected void finalize() throws java.lang.Throwable {}
    public int getClientId() { return 0; }
    public void publish(android.net.wifi.aware.PublishConfig p0, android.net.wifi.aware.DiscoverySessionCallback p1, android.os.Handler p2) {}
    public void subscribe(android.net.wifi.aware.SubscribeConfig p0, android.net.wifi.aware.DiscoverySessionCallback p1, android.os.Handler p2) {}
    public android.net.NetworkSpecifier createNetworkSpecifierOpen(int p0, byte[] p1) { return null; }
    public android.net.NetworkSpecifier createNetworkSpecifierPassphrase(int p0, byte[] p1, java.lang.String p2) { return null; }
    @android.annotation.SystemApi
    public android.net.NetworkSpecifier createNetworkSpecifierPmk(int p0, byte[] p1, byte[] p2) { return null; }
}
