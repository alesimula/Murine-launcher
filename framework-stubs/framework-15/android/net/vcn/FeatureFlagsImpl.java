package android.net.vcn;

public final class FeatureFlagsImpl implements android.net.vcn.FeatureFlags {
    public FeatureFlagsImpl() {}
    public boolean allowDisableIpsecLossDetector() { return false; }
    public boolean enforceMainUser() { return false; }
    public boolean evaluateIpsecLossOnLpNcChange() { return false; }
    public boolean handleSeqNumLeap() { return false; }
    public boolean networkMetricMonitor() { return false; }
    public boolean safeModeConfig() { return false; }
    public boolean safeModeTimeoutConfig() { return false; }
    public boolean validateNetworkOnIpsecLoss() { return false; }
}
