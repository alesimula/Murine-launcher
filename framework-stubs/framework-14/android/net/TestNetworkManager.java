package android.net;

public class TestNetworkManager {
    public static final java.lang.String TEST_TAP_PREFIX = "testtap";
    TestNetworkManager() {}
    public void teardownTestNetwork(android.net.Network p0) {}
    public void setupTestNetwork(java.lang.String p0, android.os.IBinder p1) {}
    @android.annotation.NonNull
    public android.net.TestNetworkInterface createTunInterface(java.util.Collection<android.net.LinkAddress> p0) { return null; }
    @android.annotation.NonNull
    public android.net.TestNetworkInterface createTapInterface() { return null; }
}
