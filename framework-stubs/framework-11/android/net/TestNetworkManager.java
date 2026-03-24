package android.net;

public class TestNetworkManager {
    public static final java.lang.String TEST_TUN_PREFIX = "testtun";
    public static final java.lang.String TEST_TAP_PREFIX = "testtap";
    private static final java.lang.String TAG = null;
    private final android.net.ITestNetworkManager mService = null;
    public TestNetworkManager(android.net.ITestNetworkManager p0) {}
    public void teardownTestNetwork(android.net.Network p0) {}
    private void setupTestNetwork(java.lang.String p0, android.net.LinkProperties p1, boolean p2, int[] p3, android.os.IBinder p4) {}
    public void setupTestNetwork(android.net.LinkProperties p0, boolean p1, android.os.IBinder p2) {}
    public void setupTestNetwork(java.lang.String p0, android.os.IBinder p1) {}
    public void setupTestNetwork(java.lang.String p0, int[] p1, android.os.IBinder p2) {}
    public android.net.TestNetworkInterface createTunInterface(android.net.LinkAddress[] p0) { return null; }
    public android.net.TestNetworkInterface createTapInterface() { return null; }
}
