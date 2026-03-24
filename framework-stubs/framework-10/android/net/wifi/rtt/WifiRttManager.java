package android.net.wifi.rtt;

public class WifiRttManager {
    private static final java.lang.String TAG = "WifiRttManager";
    private static final boolean VDBG = false;
    private final android.content.Context mContext = null;
    private final android.net.wifi.rtt.IWifiRttManager mService = null;
    public static final java.lang.String ACTION_WIFI_RTT_STATE_CHANGED = "android.net.wifi.rtt.action.WIFI_RTT_STATE_CHANGED";
    public WifiRttManager(android.content.Context p0, android.net.wifi.rtt.IWifiRttManager p1) {}
    public boolean isAvailable() { return false; }
    public void startRanging(android.net.wifi.rtt.RangingRequest p0, java.util.concurrent.Executor p1, android.net.wifi.rtt.RangingResultCallback p2) {}
    @android.annotation.SystemApi
    public void startRanging(android.os.WorkSource p0, android.net.wifi.rtt.RangingRequest p1, java.util.concurrent.Executor p2, android.net.wifi.rtt.RangingResultCallback p3) {}
    @android.annotation.SystemApi
    public void cancelRanging(android.os.WorkSource p0) {}
}
