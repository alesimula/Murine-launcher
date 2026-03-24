package android.net.wifi.rtt;

public class WifiRttManager {
    public static final java.lang.String ACTION_WIFI_RTT_STATE_CHANGED = "android.net.wifi.rtt.action.WIFI_RTT_STATE_CHANGED";
    public static final java.lang.String CHARACTERISTICS_KEY_BOOLEAN_LCI = "key_lci";
    public static final java.lang.String CHARACTERISTICS_KEY_BOOLEAN_LCR = "key_lcr";
    @android.annotation.FlaggedApi("com.android.wifi.flags.android_v_wifi_api")
    public static final java.lang.String CHARACTERISTICS_KEY_BOOLEAN_NTB_INITIATOR = "key_ntb_initiator";
    public static final java.lang.String CHARACTERISTICS_KEY_BOOLEAN_ONE_SIDED_RTT = "key_one_sided_rtt";
    @android.annotation.FlaggedApi("com.android.wifi.flags.secure_ranging")
    public static final java.lang.String CHARACTERISTICS_KEY_BOOLEAN_RANGING_FRAME_PROTECTION_SUPPORTED = "key_rnm_mfp_supported";
    @android.annotation.FlaggedApi("com.android.wifi.flags.secure_ranging")
    public static final java.lang.String CHARACTERISTICS_KEY_BOOLEAN_SECURE_HE_LTF_SUPPORTED = "key_secure_he_ltf_supported";
    public static final java.lang.String CHARACTERISTICS_KEY_BOOLEAN_STA_RESPONDER = "key_sta_responder";
    @android.annotation.FlaggedApi("com.android.wifi.flags.secure_ranging")
    public static final java.lang.String CHARACTERISTICS_KEY_INT_MAX_SUPPORTED_SECURE_HE_LTF_PROTO_VERSION = "key_max_supported_secure_he_ltf_proto_ver";
    WifiRttManager() {}
    public void cancelRanging(android.os.WorkSource p0) {}
    @android.annotation.NonNull
    public android.os.Bundle getRttCharacteristics() { return null; }
    public boolean isAvailable() { return false; }
    public void startRanging(android.net.wifi.rtt.RangingRequest p0, java.util.concurrent.Executor p1, android.net.wifi.rtt.RangingResultCallback p2) {}
    public void startRanging(android.os.WorkSource p0, android.net.wifi.rtt.RangingRequest p1, java.util.concurrent.Executor p2, android.net.wifi.rtt.RangingResultCallback p3) {}
}
