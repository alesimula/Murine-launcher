package android.net;

public class NetworkPolicyManager {
    public static final int POLICY_NONE = 0;
    public static final int POLICY_REJECT_METERED_BACKGROUND = 1;
    public static final int POLICY_ALLOW_METERED_BACKGROUND = 4;
    public static final int POLICY_REJECT_CELLULAR = 65536;
    public static final int POLICY_REJECT_VPN = 131072;
    public static final int POLICY_REJECT_WIFI = 32768;
    public static final int POLICY_REJECT_ALL = 262144;
    public static final int RULE_NONE = 0;
    public static final int RULE_ALLOW_METERED = 1;
    public static final int RULE_TEMPORARY_ALLOW_METERED = 2;
    public static final int RULE_REJECT_METERED = 4;
    public static final int RULE_ALLOW_ALL = 32;
    public static final int RULE_REJECT_ALL = 64;
    public static final int RULE_REJECT_ISOLATED = 128;
    public static final int MASK_METERED_NETWORKS = 15;
    public static final int MASK_ALL_NETWORKS = 240;
    public static final int FIREWALL_RULE_DEFAULT = 0;
    public static final java.lang.String FIREWALL_CHAIN_NAME_NONE = "none";
    public static final java.lang.String FIREWALL_CHAIN_NAME_DOZABLE = "dozable";
    public static final java.lang.String FIREWALL_CHAIN_NAME_STANDBY = "standby";
    public static final java.lang.String FIREWALL_CHAIN_NAME_POWERSAVE = "powersave";
    public static final java.lang.String FIREWALL_CHAIN_NAME_ISOLATED = "isolated";
    private static final boolean ALLOW_PLATFORM_APP_POLICY = true;
    public static final int FOREGROUND_THRESHOLD_STATE = 5;
    public static final java.lang.String EXTRA_NETWORK_TEMPLATE = "android.net.NETWORK_TEMPLATE";
    public static final int SUBSCRIPTION_OVERRIDE_UNMETERED = 1;
    public static final int SUBSCRIPTION_OVERRIDE_CONGESTED = 2;
    private final android.content.Context mContext = null;
    private android.net.INetworkPolicyManager mService;
    private final java.util.Map<android.net.NetworkPolicyManager.SubscriptionCallback, android.net.NetworkPolicyManager.SubscriptionCallbackProxy> mCallbackMap = null;
    public NetworkPolicyManager(android.content.Context p0, android.net.INetworkPolicyManager p1) {}
    public static android.net.NetworkPolicyManager from(android.content.Context p0) { return null; }
    public void setUidPolicy(int p0, int p1) {}
    public void addUidPolicy(int p0, int p1) {}
    public void removeUidPolicy(int p0, int p1) {}
    public int getUidPolicy(int p0) { return 0; }
    public int[] getUidsWithPolicy(int p0) { return null; }
    public void registerListener(android.net.INetworkPolicyListener p0) {}
    public void unregisterListener(android.net.INetworkPolicyListener p0) {}
    public void registerSubscriptionCallback(android.net.NetworkPolicyManager.SubscriptionCallback p0) {}
    public void unregisterSubscriptionCallback(android.net.NetworkPolicyManager.SubscriptionCallback p0) {}
    public void setNetworkPolicies(android.net.NetworkPolicy[] p0) {}
    public android.net.NetworkPolicy[] getNetworkPolicies() { return null; }
    public void setRestrictBackground(boolean p0) {}
    public boolean getRestrictBackground() { return false; }
    public void setSubscriptionOverride(int p0, int p1, int p2, long p3, java.lang.String p4) {}
    public void setSubscriptionPlans(int p0, android.telephony.SubscriptionPlan[] p1, java.lang.String p2) {}
    public android.telephony.SubscriptionPlan[] getSubscriptionPlans(int p0, java.lang.String p1) { return null; }
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
        public void onSubscriptionPlansChanged(int p0, android.telephony.SubscriptionPlan[] p1) {}
    }

    public static class SubscriptionCallback {
        public SubscriptionCallback() {}
        public void onSubscriptionOverride(int p0, int p1, int p2) {}
        public void onSubscriptionPlansChanged(int p0, android.telephony.SubscriptionPlan[] p1) {}
    }

    public class SubscriptionCallbackProxy extends android.net.NetworkPolicyManager.Listener {
        private final android.net.NetworkPolicyManager.SubscriptionCallback mCallback = null;
        SubscriptionCallbackProxy(android.net.NetworkPolicyManager p0, android.net.NetworkPolicyManager.SubscriptionCallback p1) { super(); }
        public void onSubscriptionOverride(int p0, int p1, int p2) {}
        public void onSubscriptionPlansChanged(int p0, android.telephony.SubscriptionPlan[] p1) {}
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface SubscriptionOverrideMask {
    }
}
