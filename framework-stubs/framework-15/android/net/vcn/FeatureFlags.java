package android.net.vcn;

public interface FeatureFlags {
    public boolean allowDisableIpsecLossDetector();
    public boolean enforceMainUser();
    public boolean evaluateIpsecLossOnLpNcChange();
    public boolean handleSeqNumLeap();
    public boolean networkMetricMonitor();
    public boolean safeModeConfig();
    public boolean safeModeTimeoutConfig();
    public boolean validateNetworkOnIpsecLoss();
}
