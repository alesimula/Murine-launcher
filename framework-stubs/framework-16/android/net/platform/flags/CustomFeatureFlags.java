package android.net.platform.flags;

public class CustomFeatureFlags implements android.net.platform.flags.FeatureFlags {
    public CustomFeatureFlags(java.util.function.BiPredicate<java.lang.String, java.util.function.Predicate<android.net.platform.flags.FeatureFlags>> p0) {}
    public boolean avoidBadWifiFromCarrierConfig() { return false; }
    public boolean collectVpnMetrics() { return false; }
    public boolean connectivityServiceDestroySocket() { return false; }
    public boolean deprecateNetworkPolicyCallback() { return false; }
    public boolean mdnsImprovementFor25q2() { return false; }
    public boolean poweredOffFindingPlatform() { return false; }
    public boolean registerNsdOffloadEngine() { return false; }
    public boolean vpnTypeOemServiceAndLegacy() { return false; }
    public boolean isFlagReadOnlyOptimized(java.lang.String p0) { return false; }
    protected boolean getValue(java.lang.String p0, java.util.function.Predicate<android.net.platform.flags.FeatureFlags> p1) { return false; }
    public java.util.List<java.lang.String> getFlagNames() { return null; }
}
