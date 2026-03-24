package android.net.vcn;

public class CustomFeatureFlags implements android.net.vcn.FeatureFlags {
    public CustomFeatureFlags(java.util.function.BiPredicate<java.lang.String, java.util.function.Predicate<android.net.vcn.FeatureFlags>> p0) {}
    public boolean allowDisableIpsecLossDetector() { return false; }
    public boolean enforceMainUser() { return false; }
    public boolean evaluateIpsecLossOnLpNcChange() { return false; }
    public boolean handleSeqNumLeap() { return false; }
    public boolean networkMetricMonitor() { return false; }
    public boolean safeModeConfig() { return false; }
    public boolean safeModeTimeoutConfig() { return false; }
    public boolean validateNetworkOnIpsecLoss() { return false; }
    public boolean isFlagReadOnlyOptimized(java.lang.String p0) { return false; }
    protected boolean getValue(java.lang.String p0, java.util.function.Predicate<android.net.vcn.FeatureFlags> p1) { return false; }
    public java.util.List<java.lang.String> getFlagNames() { return null; }
}
