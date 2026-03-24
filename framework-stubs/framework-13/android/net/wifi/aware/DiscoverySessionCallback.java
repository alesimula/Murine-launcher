package android.net.wifi.aware;

public class DiscoverySessionCallback {
    public DiscoverySessionCallback() {}
    public void onPublishStarted(android.net.wifi.aware.PublishDiscoverySession p0) {}
    public void onSubscribeStarted(android.net.wifi.aware.SubscribeDiscoverySession p0) {}
    public void onSessionConfigUpdated() {}
    public void onSessionConfigFailed() {}
    public void onSessionTerminated() {}
    public void onServiceDiscovered(android.net.wifi.aware.PeerHandle p0, byte[] p1, java.util.List<byte[]> p2) {}
    public void onServiceDiscovered(android.net.wifi.aware.ServiceDiscoveryInfo p0) {}
    public void onServiceDiscoveredWithinRange(android.net.wifi.aware.PeerHandle p0, byte[] p1, java.util.List<byte[]> p2, int p3) {}
    public void onServiceDiscoveredWithinRange(android.net.wifi.aware.ServiceDiscoveryInfo p0, int p1) {}
    public void onMessageSendSucceeded(int p0) {}
    public void onMessageSendFailed(int p0) {}
    public void onMessageReceived(android.net.wifi.aware.PeerHandle p0, byte[] p1) {}
    public void onServiceLost(android.net.wifi.aware.PeerHandle p0, int p1) {}
}
