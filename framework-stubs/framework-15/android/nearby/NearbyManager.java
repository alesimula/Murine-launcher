package android.nearby;

public class NearbyManager {
    public static final int POWERED_OFF_FINDING_MODE_DISABLED = 1;
    public static final int POWERED_OFF_FINDING_MODE_ENABLED = 2;
    public static final int POWERED_OFF_FINDING_MODE_UNSUPPORTED = 0;
    NearbyManager() {}
    public int getPoweredOffFindingMode() { return 0; }
    public void queryOffloadCapability(java.util.concurrent.Executor p0, java.util.function.Consumer<android.nearby.OffloadCapability> p1) {}
    public void setPoweredOffFindingEphemeralIds(java.util.List<byte[]> p0) {}
    public void setPoweredOffFindingMode(int p0) {}
    public void startBroadcast(android.nearby.BroadcastRequest p0, java.util.concurrent.Executor p1, android.nearby.BroadcastCallback p2) {}
    public int startScan(android.nearby.ScanRequest p0, java.util.concurrent.Executor p1, android.nearby.ScanCallback p2) { return 0; }
    public void stopBroadcast(android.nearby.BroadcastCallback p0) {}
    public void stopScan(android.nearby.ScanCallback p0) {}
}
