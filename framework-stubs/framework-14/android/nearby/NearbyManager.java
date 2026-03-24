package android.nearby;

public class NearbyManager {
    NearbyManager() {}
    public int startScan(android.nearby.ScanRequest p0, java.util.concurrent.Executor p1, android.nearby.ScanCallback p2) { return 0; }
    public void stopScan(android.nearby.ScanCallback p0) {}
    public void startBroadcast(android.nearby.BroadcastRequest p0, java.util.concurrent.Executor p1, android.nearby.BroadcastCallback p2) {}
    public void stopBroadcast(android.nearby.BroadcastCallback p0) {}
    public void queryOffloadCapability(java.util.concurrent.Executor p0, java.util.function.Consumer<android.nearby.OffloadCapability> p1) {}
}
