package android.net.vcn;

public final class Flags {
    public static final java.lang.String FLAG_ALLOW_DISABLE_IPSEC_LOSS_DETECTOR = "android.net.vcn.allow_disable_ipsec_loss_detector";
    public static final java.lang.String FLAG_ENFORCE_MAIN_USER = "android.net.vcn.enforce_main_user";
    public static final java.lang.String FLAG_EVALUATE_IPSEC_LOSS_ON_LP_NC_CHANGE = "android.net.vcn.evaluate_ipsec_loss_on_lp_nc_change";
    public static final java.lang.String FLAG_HANDLE_SEQ_NUM_LEAP = "android.net.vcn.handle_seq_num_leap";
    public static final java.lang.String FLAG_NETWORK_METRIC_MONITOR = "android.net.vcn.network_metric_monitor";
    public static final java.lang.String FLAG_SAFE_MODE_CONFIG = "android.net.vcn.safe_mode_config";
    public static final java.lang.String FLAG_SAFE_MODE_TIMEOUT_CONFIG = "android.net.vcn.safe_mode_timeout_config";
    public static final java.lang.String FLAG_VALIDATE_NETWORK_ON_IPSEC_LOSS = "android.net.vcn.validate_network_on_ipsec_loss";
    public Flags() {}
    public static boolean allowDisableIpsecLossDetector() { return false; }
    public static boolean enforceMainUser() { return false; }
    public static boolean evaluateIpsecLossOnLpNcChange() { return false; }
    public static boolean handleSeqNumLeap() { return false; }
    public static boolean networkMetricMonitor() { return false; }
    public static boolean safeModeConfig() { return false; }
    public static boolean safeModeTimeoutConfig() { return false; }
    public static boolean validateNetworkOnIpsecLoss() { return false; }
}
