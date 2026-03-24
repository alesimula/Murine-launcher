package android.net.platform.flags;

public final class FeatureFlagsImpl implements android.net.platform.flags.FeatureFlags {
    public FeatureFlagsImpl() {}
    public boolean avoidBadWifiFromCarrierConfig() { return false; }
    public boolean collectVpnMetrics() { return false; }
    public boolean connectivityServiceDestroySocket() { return false; }
    public boolean deprecateNetworkPolicyCallback() { return false; }
    public boolean mdnsImprovementFor25q2() { return false; }
    public boolean poweredOffFindingPlatform() { return false; }
    public boolean registerNsdOffloadEngine() { return false; }
    public boolean vpnTypeOemServiceAndLegacy() { return false; }
}
