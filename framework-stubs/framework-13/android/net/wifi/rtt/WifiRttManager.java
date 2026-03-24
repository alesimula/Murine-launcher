package android.net.wifi.rtt;

public class WifiRttManager {
    public static final java.lang.String ACTION_WIFI_RTT_STATE_CHANGED = "android.net.wifi.rtt.action.WIFI_RTT_STATE_CHANGED";
    WifiRttManager() {}
    public boolean isAvailable() { return false; }
    public void startRanging(android.net.wifi.rtt.RangingRequest p0, java.util.concurrent.Executor p1, android.net.wifi.rtt.RangingResultCallback p2) {}
    public void startRanging(android.os.WorkSource p0, android.net.wifi.rtt.RangingRequest p1, java.util.concurrent.Executor p2, android.net.wifi.rtt.RangingResultCallback p3) {}
    public void cancelRanging(android.os.WorkSource p0) {}
}
