package android.net;

@android.annotation.SystemApi(client=android.annotation.SystemApi.Client.MODULE_LIBRARIES)
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
    public static final int RULE_REJECT_RESTRICTED_MODE = 1024;
    public static final int MASK_METERED_NETWORKS = 15;
    public static final int MASK_ALL_NETWORKS = 240;
    public static final int MASK_RESTRICTED_MODE_NETWORKS = 3840;
    public static final int FIREWALL_RULE_DEFAULT = 0;
    public static final java.lang.String FIREWALL_CHAIN_NAME_NONE = "none";
    public static final java.lang.String FIREWALL_CHAIN_NAME_DOZABLE = "dozable";
    public static final java.lang.String FIREWALL_CHAIN_NAME_STANDBY = "standby";
    public static final java.lang.String FIREWALL_CHAIN_NAME_POWERSAVE = "powersave";
    public static final java.lang.String FIREWALL_CHAIN_NAME_RESTRICTED = "restricted";
    public static final java.lang.String FIREWALL_CHAIN_NAME_LOW_POWER_STANDBY = "low_power_standby";
    public static final java.lang.String FIREWALL_CHAIN_NAME_BACKGROUND = "background";
    public static final java.lang.String FIREWALL_CHAIN_NAME_METERED_ALLOW = "metered_allow";
    public static final java.lang.String FIREWALL_CHAIN_NAME_METERED_DENY_USER = "metered_deny_user";
    public static final java.lang.String FIREWALL_CHAIN_NAME_METERED_DENY_ADMIN = "metered_deny_admin";
    public static final int FOREGROUND_THRESHOLD_STATE = 5;
    public static final int TOP_THRESHOLD_STATE = 3;
    public static final int BACKGROUND_THRESHOLD_STATE = 12;
    public static final java.lang.String EXTRA_NETWORK_TEMPLATE = "android.net.NETWORK_TEMPLATE";
    public static final int SUBSCRIPTION_OVERRIDE_UNMETERED = 1;
    public static final int SUBSCRIPTION_OVERRIDE_CONGESTED = 2;
    public static final int ALLOWED_REASON_NONE = 0;
    public static final int ALLOWED_REASON_SYSTEM = 1;
    public static final int ALLOWED_REASON_FOREGROUND = 2;
    public static final int ALLOWED_REASON_POWER_SAVE_ALLOWLIST = 4;
    public static final int ALLOWED_REASON_POWER_SAVE_EXCEPT_IDLE_ALLOWLIST = 8;
    public static final int ALLOWED_REASON_RESTRICTED_MODE_PERMISSIONS = 16;
    public static final int ALLOWED_REASON_TOP = 32;
    public static final int ALLOWED_REASON_LOW_POWER_STANDBY_ALLOWLIST = 64;
    public static final int ALLOWED_REASON_NOT_IN_BACKGROUND = 128;
    public static final int ALLOWED_METERED_REASON_USER_EXEMPTED = 65536;
    public static final int ALLOWED_METERED_REASON_SYSTEM = 131072;
    public static final int ALLOWED_METERED_REASON_FOREGROUND = 262144;
    public static final int ALLOWED_METERED_REASON_MASK = -65536;
    public NetworkPolicyManager(android.content.Context p0, android.net.INetworkPolicyManager p1) {}
    public static android.net.NetworkPolicyManager from(android.content.Context p0) { return null; }
    public void setUidPolicy(int p0, int p1) {}
    public void addUidPolicy(int p0, int p1) {}
    public void removeUidPolicy(int p0, int p1) {}
    public int getUidPolicy(int p0) { return 0; }
    public int[] getUidsWithPolicy(int p0) { return null; }
    public void registerListener(android.net.INetworkPolicyListener p0) {}
    public void unregisterListener(android.net.INetworkPolicyListener p0) {}
    @android.annotation.RequiresPermission("android.permission.OBSERVE_NETWORK_POLICY")
    public void registerSubscriptionCallback(android.net.NetworkPolicyManager.SubscriptionCallback p0) {}
    @android.annotation.RequiresPermission("android.permission.OBSERVE_NETWORK_POLICY")
    public void unregisterSubscriptionCallback(android.net.NetworkPolicyManager.SubscriptionCallback p0) {}
    public void setNetworkPolicies(android.net.NetworkPolicy[] p0) {}
    public android.net.NetworkPolicy[] getNetworkPolicies() { return null; }
    public void setRestrictBackground(boolean p0) {}
    public boolean getRestrictBackground() { return false; }
    @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.MODULE_LIBRARIES)
    @android.annotation.RequiresPermission("android.permission.MAINLINE_NETWORK_STACK")
    public int getRestrictBackgroundStatus(int p0) { return 0; }
    public void setSubscriptionOverride(int p0, int p1, int p2, int[] p3, long p4, java.lang.String p5) {}
    public void setSubscriptionPlans(int p0, android.telephony.SubscriptionPlan[] p1, long p2, java.lang.String p3) {}
    @android.annotation.Nullable
    public android.telephony.SubscriptionPlan[] getSubscriptionPlans(int p0, java.lang.String p1) { return null; }
    @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.MODULE_LIBRARIES)
    @android.annotation.Nullable
    @android.annotation.RequiresPermission(anyOf={"android.permission.MAINLINE_NETWORK_STACK", "android.permission.NETWORK_STACK"})
    public android.telephony.SubscriptionPlan getSubscriptionPlan(android.net.NetworkTemplate p0) { return null; }
    @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.MODULE_LIBRARIES)
    @android.annotation.RequiresPermission(anyOf={"android.permission.MAINLINE_NETWORK_STACK", "android.permission.NETWORK_STACK"})
    public void notifyStatsProviderWarningReached() {}
    @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.MODULE_LIBRARIES)
    @android.annotation.RequiresPermission(anyOf={"android.permission.MAINLINE_NETWORK_STACK", "android.permission.NETWORK_STACK"})
    public void notifyStatsProviderLimitReached() {}
    public void factoryReset(java.lang.String p0) {}
    @android.annotation.RequiresPermission("android.permission.OBSERVE_NETWORK_POLICY")
    public boolean isUidNetworkingBlocked(int p0, boolean p1) { return false; }
    @android.annotation.RequiresPermission("android.permission.OBSERVE_NETWORK_POLICY")
    public boolean isUidRestrictedOnMeteredNetworks(int p0) { return false; }
    @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.MODULE_LIBRARIES)
    @android.annotation.RequiresPermission("android.permission.MAINLINE_NETWORK_STACK")
    public int getMultipathPreference(android.net.Network p0) { return 0; }
    @java.lang.Deprecated
    public static java.util.Iterator<android.util.Pair<java.time.ZonedDateTime, java.time.ZonedDateTime>> cycleIterator(android.net.NetworkPolicy p0) { return null; }
    @java.lang.Deprecated
    public static boolean isUidValidForPolicy(android.content.Context p0, int p1) { return false; }
    public static java.lang.String uidRulesToString(int p0) { return null; }
    public static java.lang.String uidPoliciesToString(int p0) { return null; }
    public static int getDefaultProcessNetworkCapabilities(int p0) { return 0; }
    public static boolean isProcStateAllowedWhileIdleOrPowerSaveMode(android.net.NetworkPolicyManager.UidState p0) { return false; }
    public static boolean isProcStateAllowedWhileIdleOrPowerSaveMode(int p0, int p1) { return false; }
    public static boolean isProcStateAllowedWhileInLowPowerStandby(android.net.NetworkPolicyManager.UidState p0) { return false; }
    public static boolean isProcStateAllowedNetworkWhileBackground(android.net.NetworkPolicyManager.UidState p0) { return false; }
    public static boolean isProcStateAllowedWhileOnRestrictBackground(android.net.NetworkPolicyManager.UidState p0) { return false; }
    public static boolean isProcStateAllowedWhileOnRestrictBackground(int p0, int p1) { return false; }
    @android.annotation.NonNull
    public static java.lang.String resolveNetworkId(android.net.wifi.WifiConfiguration p0) { return null; }
    public static java.lang.String resolveNetworkId(java.lang.String p0) { return null; }
    @android.annotation.NonNull
    public static java.lang.String blockedReasonsToString(int p0) { return null; }
    @android.annotation.NonNull
    public static java.lang.String allowedReasonsToString(int p0) { return null; }
    @java.lang.Deprecated
    @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.MODULE_LIBRARIES)
    @android.annotation.FlaggedApi("android.net.platform.flags.deprecate_network_policy_callback")
    @android.annotation.RequiresPermission("android.permission.OBSERVE_NETWORK_POLICY")
    public void registerNetworkPolicyCallback(java.util.concurrent.Executor p0, android.net.NetworkPolicyManager.NetworkPolicyCallback p1) {}
    @java.lang.Deprecated
    @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.MODULE_LIBRARIES)
    @android.annotation.FlaggedApi("android.net.platform.flags.deprecate_network_policy_callback")
    @android.annotation.RequiresPermission("android.permission.OBSERVE_NETWORK_POLICY")
    public void unregisterNetworkPolicyCallback(android.net.NetworkPolicyManager.NetworkPolicyCallback p0) {}

    public static class Listener extends android.net.INetworkPolicyListener.Stub {
        public Listener() { super(); }
        public void onUidRulesChanged(int p0, int p1) {}
        public void onMeteredIfacesChanged(java.lang.String[] p0) {}
        public void onRestrictBackgroundChanged(boolean p0) {}
        public void onUidPoliciesChanged(int p0, int p1) {}
        public void onSubscriptionOverride(int p0, int p1, int p2, int[] p3) {}
        public void onSubscriptionPlansChanged(int p0, android.telephony.SubscriptionPlan[] p1) {}
        public void onBlockedReasonChanged(int p0, int p1, int p2) {}
    }

    @java.lang.Deprecated
    @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.MODULE_LIBRARIES)
    @android.annotation.FlaggedApi("android.net.platform.flags.deprecate_network_policy_callback")
    public static interface NetworkPolicyCallback {
        @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.MODULE_LIBRARIES)
        default public void onUidBlockedReasonChanged(int p0, int p1) {}
    }

    public static class NetworkPolicyCallbackProxy extends android.net.NetworkPolicyManager.Listener {
        NetworkPolicyCallbackProxy(java.util.concurrent.Executor p0, android.net.NetworkPolicyManager.NetworkPolicyCallback p1) { super(); }
        public void onBlockedReasonChanged(int p0, int p1, int p2) {}
    }

    public static class SubscriptionCallback {
        public SubscriptionCallback() {}
        public void onSubscriptionOverride(int p0, int p1, int p2, int[] p3) {}
        public void onSubscriptionPlansChanged(int p0, android.telephony.SubscriptionPlan[] p1) {}
    }

    public class SubscriptionCallbackProxy extends android.net.NetworkPolicyManager.Listener {
        SubscriptionCallbackProxy(android.net.NetworkPolicyManager p0, android.net.NetworkPolicyManager.SubscriptionCallback p1) { super(); }
        public void onSubscriptionOverride(int p0, int p1, int p2, int[] p3) {}
        public void onSubscriptionPlansChanged(int p0, android.telephony.SubscriptionPlan[] p1) {}
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface SubscriptionOverrideMask {
    }

    public static final class UidState {
        public int uid;
        public int procState;
        public long procStateSeq;
        public int capability;
        public UidState(int p0, int p1, long p2, int p3) {}
        public java.lang.String toString() { return null; }
    }
}
