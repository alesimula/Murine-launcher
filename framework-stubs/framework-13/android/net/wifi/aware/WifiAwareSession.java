package android.net.wifi.aware;

public class WifiAwareSession implements java.lang.AutoCloseable {
    WifiAwareSession() {}
    public void close() {}
    protected void finalize() throws java.lang.Throwable {}
    public void publish(android.net.wifi.aware.PublishConfig p0, android.net.wifi.aware.DiscoverySessionCallback p1, android.os.Handler p2) {}
    public void subscribe(android.net.wifi.aware.SubscribeConfig p0, android.net.wifi.aware.DiscoverySessionCallback p1, android.os.Handler p2) {}
    @java.lang.Deprecated
    public android.net.NetworkSpecifier createNetworkSpecifierOpen(int p0, byte[] p1) { return null; }
    @java.lang.Deprecated
    public android.net.NetworkSpecifier createNetworkSpecifierPassphrase(int p0, byte[] p1, java.lang.String p2) { return null; }
    @java.lang.Deprecated
    public android.net.NetworkSpecifier createNetworkSpecifierPmk(int p0, byte[] p1, byte[] p2) { return null; }
}
