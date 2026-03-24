package android.net;

public class NetworkPolicyManager {
    public static final int POLICY_NONE = 0;
    public static final int POLICY_REJECT_METERED_BACKGROUND = 1;
    public static final int POLICY_ALLOW_METERED_BACKGROUND = 4;
    public static final int RULE_NONE = 0;
    public static final int RULE_ALLOW_METERED = 1;
    public static final int RULE_TEMPORARY_ALLOW_METERED = 2;
    public static final int RULE_REJECT_METERED = 4;
    public static final int RULE_ALLOW_ALL = 32;
    public static final int RULE_REJECT_ALL = 64;
    public static final int MASK_METERED_NETWORKS = 15;
    public static final int MASK_ALL_NETWORKS = 240;
    public static final int FIREWALL_RULE_DEFAULT = 0;
    public static final java.lang.String FIREWALL_CHAIN_NAME_NONE = "none";
    public static final java.lang.String FIREWALL_CHAIN_NAME_DOZABLE = "dozable";
    public static final java.lang.String FIREWALL_CHAIN_NAME_STANDBY = "standby";
    public static final java.lang.String FIREWALL_CHAIN_NAME_POWERSAVE = "powersave";
    private static final boolean ALLOW_PLATFORM_APP_POLICY = true;
    public static final int FOREGROUND_THRESHOLD_STATE = 6;
    public static final java.lang.String EXTRA_NETWORK_TEMPLATE = "android.net.NETWORK_TEMPLATE";
    public static final int OVERRIDE_UNMETERED = 1;
    public static final int OVERRIDE_CONGESTED = 2;
    private final android.content.Context mContext = null;
    @android.annotation.UnsupportedAppUsage
    private android.net.INetworkPolicyManager mService;
    public NetworkPolicyManager(android.content.Context p0, android.net.INetworkPolicyManager p1) {}
    @android.annotation.UnsupportedAppUsage
    public static android.net.NetworkPolicyManager from(android.content.Context p0) { return null; }
    @android.annotation.UnsupportedAppUsage
    public void setUidPolicy(int p0, int p1) {}
    public void addUidPolicy(int p0, int p1) {}
    public void removeUidPolicy(int p0, int p1) {}
    @android.annotation.UnsupportedAppUsage
    public int getUidPolicy(int p0) { return 0; }
    @android.annotation.UnsupportedAppUsage
    public int[] getUidsWithPolicy(int p0) { return null; }
    @android.annotation.UnsupportedAppUsage(maxTargetSdk=28, trackingBug=115609023L)
    public void registerListener(android.net.INetworkPolicyListener p0) {}
    @android.annotation.UnsupportedAppUsage(maxTargetSdk=28, trackingBug=115609023L)
    public void unregisterListener(android.net.INetworkPolicyListener p0) {}
    public void setNetworkPolicies(android.net.NetworkPolicy[] p0) {}
    @android.annotation.UnsupportedAppUsage
    public android.net.NetworkPolicy[] getNetworkPolicies() { return null; }
    @android.annotation.UnsupportedAppUsage
    public void setRestrictBackground(boolean p0) {}
    @android.annotation.UnsupportedAppUsage
    public boolean getRestrictBackground() { return false; }
    public void factoryReset(java.lang.String p0) {}
    @java.lang.Deprecated
    public static java.util.Iterator<android.util.Pair<java.time.ZonedDateTime, java.time.ZonedDateTime>> cycleIterator(android.net.NetworkPolicy p0) { return null; }
    @java.lang.Deprecated
    public static boolean isUidValidForPolicy(android.content.Context p0, int p1) { return false; }
    public static java.lang.String uidRulesToString(int p0) { return null; }
    public static java.lang.String uidPoliciesToString(int p0) { return null; }
    public static boolean isProcStateAllowedWhileIdleOrPowerSaveMode(int p0) { return false; }
    public static boolean isProcStateAllowedWhileOnRestrictBackground(int p0) { return false; }
    public static java.lang.String resolveNetworkId(android.net.wifi.WifiConfiguration p0) { return null; }
    public static java.lang.String resolveNetworkId(java.lang.String p0) { return null; }

    public static class Listener extends android.net.INetworkPolicyListener.Stub {
        public Listener() { super(); }
        public void onUidRulesChanged(int p0, int p1) {}
        public void onMeteredIfacesChanged(java.lang.String[] p0) {}
        public void onRestrictBackgroundChanged(boolean p0) {}
        public void onUidPoliciesChanged(int p0, int p1) {}
        public void onSubscriptionOverride(int p0, int p1, int p2) {}
    }
}
