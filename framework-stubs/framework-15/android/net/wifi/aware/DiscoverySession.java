package android.net.wifi.aware;

public class DiscoverySession implements java.lang.AutoCloseable {
    DiscoverySession() {}
    public void acceptPairingRequest(int p0, android.net.wifi.aware.PeerHandle p1, java.lang.String p2, int p3, java.lang.String p4) {}
    public void close() {}
    @java.lang.Deprecated
    public android.net.NetworkSpecifier createNetworkSpecifierOpen(android.net.wifi.aware.PeerHandle p0) { return null; }
    @java.lang.Deprecated
    public android.net.NetworkSpecifier createNetworkSpecifierPassphrase(android.net.wifi.aware.PeerHandle p0, java.lang.String p1) { return null; }
    public void initiateBootstrappingRequest(android.net.wifi.aware.PeerHandle p0, int p1) {}
    public void initiatePairingRequest(android.net.wifi.aware.PeerHandle p0, java.lang.String p1, int p2, java.lang.String p3) {}
    public void rejectPairingRequest(int p0, android.net.wifi.aware.PeerHandle p1) {}
    public void sendMessage(android.net.wifi.aware.PeerHandle p0, int p1, byte[] p2) {}
    @java.lang.Deprecated
    public android.net.NetworkSpecifier createNetworkSpecifierPmk(android.net.wifi.aware.PeerHandle p0, byte[] p1) { return null; }
    public void resume() {}
    public void suspend() {}
}
