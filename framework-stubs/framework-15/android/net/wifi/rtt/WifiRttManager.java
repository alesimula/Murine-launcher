package android.net.wifi.rtt;

public class WifiRttManager {
    public static final java.lang.String ACTION_WIFI_RTT_STATE_CHANGED = "android.net.wifi.rtt.action.WIFI_RTT_STATE_CHANGED";
    public static final java.lang.String CHARACTERISTICS_KEY_BOOLEAN_LCI = "key_lci";
    public static final java.lang.String CHARACTERISTICS_KEY_BOOLEAN_LCR = "key_lcr";
    public static final java.lang.String CHARACTERISTICS_KEY_BOOLEAN_NTB_INITIATOR = "key_ntb_initiator";
    public static final java.lang.String CHARACTERISTICS_KEY_BOOLEAN_ONE_SIDED_RTT = "key_one_sided_rtt";
    public static final java.lang.String CHARACTERISTICS_KEY_BOOLEAN_STA_RESPONDER = "key_sta_responder";
    WifiRttManager() {}
    @android.annotation.NonNull
    public android.os.Bundle getRttCharacteristics() { return null; }
    public boolean isAvailable() { return false; }
    public void startRanging(android.net.wifi.rtt.RangingRequest p0, java.util.concurrent.Executor p1, android.net.wifi.rtt.RangingResultCallback p2) {}
    public void cancelRanging(android.os.WorkSource p0) {}
    public void startRanging(android.os.WorkSource p0, android.net.wifi.rtt.RangingRequest p1, java.util.concurrent.Executor p2, android.net.wifi.rtt.RangingResultCallback p3) {}
}
