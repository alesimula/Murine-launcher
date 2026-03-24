package android.net.wifi.aware;

public class DiscoverySessionCallback {
    public DiscoverySessionCallback() {}
    public void onBootstrappingFailed(android.net.wifi.aware.PeerHandle p0) {}
    public void onBootstrappingSucceeded(android.net.wifi.aware.PeerHandle p0, int p1) {}
    public void onMessageReceived(android.net.wifi.aware.PeerHandle p0, byte[] p1) {}
    public void onMessageSendFailed(int p0) {}
    public void onMessageSendSucceeded(int p0) {}
    public void onPairingSetupFailed(android.net.wifi.aware.PeerHandle p0) {}
    public void onPairingSetupRequestReceived(android.net.wifi.aware.PeerHandle p0, int p1) {}
    public void onPairingSetupSucceeded(android.net.wifi.aware.PeerHandle p0, java.lang.String p1) {}
    public void onPairingVerificationFailed(android.net.wifi.aware.PeerHandle p0) {}
    public void onPairingVerificationSucceed(android.net.wifi.aware.PeerHandle p0, java.lang.String p1) {}
    public void onPublishStarted(android.net.wifi.aware.PublishDiscoverySession p0) {}
    @android.annotation.FlaggedApi("com.android.ranging.flags.ranging_rtt_enabled")
    public void onRangingResultsReceived(java.util.List<android.net.wifi.rtt.RangingResult> p0) {}
    public void onServiceDiscovered(android.net.wifi.aware.PeerHandle p0, byte[] p1, java.util.List<byte[]> p2) {}
    public void onServiceDiscovered(android.net.wifi.aware.ServiceDiscoveryInfo p0) {}
    public void onServiceDiscoveredWithinRange(android.net.wifi.aware.PeerHandle p0, byte[] p1, java.util.List<byte[]> p2, int p3) {}
    public void onServiceDiscoveredWithinRange(android.net.wifi.aware.ServiceDiscoveryInfo p0, int p1) {}
    public void onServiceLost(android.net.wifi.aware.PeerHandle p0, int p1) {}
    public void onSessionConfigFailed() {}
    public void onSessionConfigUpdated() {}
    public void onSessionResumeFailed(int p0) {}
    public void onSessionResumeSucceeded() {}
    public void onSessionSuspendFailed(int p0) {}
    public void onSessionSuspendSucceeded() {}
    public void onSessionTerminated() {}
    public void onSubscribeStarted(android.net.wifi.aware.SubscribeDiscoverySession p0) {}
}
