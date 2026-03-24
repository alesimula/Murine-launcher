package com.android.internal.hidden_from_bootclasspath.android.net.platform.flags;

public interface FeatureFlags {
    public boolean avoidBadWifiFromCarrierConfig();
    public boolean collectVpnMetrics();
    public boolean connectivityServiceDestroySocket();
    public boolean deprecateNetworkPolicyCallback();
    public boolean mdnsImprovementFor25q2();
    public boolean poweredOffFindingPlatform();
    public boolean registerNsdOffloadEngine();
    public boolean vpnTypeOemServiceAndLegacy();
}
