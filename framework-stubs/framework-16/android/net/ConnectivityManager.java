package android.net;

public class ConnectivityManager {
    @java.lang.Deprecated
    public static final java.lang.String ACTION_BACKGROUND_DATA_SETTING_CHANGED = "android.net.conn.BACKGROUND_DATA_SETTING_CHANGED";
    public static final java.lang.String ACTION_CAPTIVE_PORTAL_SIGN_IN = "android.net.conn.CAPTIVE_PORTAL";
    public static final java.lang.String ACTION_CLEAR_DNS_CACHE = "android.net.action.CLEAR_DNS_CACHE";
    public static final java.lang.String ACTION_PROMPT_LOST_VALIDATION = "android.net.action.PROMPT_LOST_VALIDATION";
    public static final java.lang.String ACTION_PROMPT_PARTIAL_CONNECTIVITY = "android.net.action.PROMPT_PARTIAL_CONNECTIVITY";
    public static final java.lang.String ACTION_PROMPT_UNVALIDATED = "android.net.action.PROMPT_UNVALIDATED";
    public static final java.lang.String ACTION_RESTRICT_BACKGROUND_CHANGED = "android.net.conn.RESTRICT_BACKGROUND_CHANGED";
    public static final int BLOCKED_METERED_REASON_ADMIN_DISABLED = 262144;
    public static final int BLOCKED_METERED_REASON_DATA_SAVER = 65536;
    public static final int BLOCKED_METERED_REASON_MASK = -65536;
    public static final int BLOCKED_METERED_REASON_USER_RESTRICTED = 131072;
    @android.annotation.FlaggedApi("com.android.net.flags.basic_background_restrictions_enabled")
    public static final int BLOCKED_REASON_APP_BACKGROUND = 64;
    public static final int BLOCKED_REASON_APP_STANDBY = 4;
    public static final int BLOCKED_REASON_BATTERY_SAVER = 1;
    public static final int BLOCKED_REASON_DOZE = 2;
    public static final int BLOCKED_REASON_LOCKDOWN_VPN = 16;
    public static final int BLOCKED_REASON_LOW_POWER_STANDBY = 32;
    @android.annotation.FlaggedApi("com.android.net.flags.blocked_reason_network_restricted")
    public static final int BLOCKED_REASON_NETWORK_RESTRICTED = 256;
    public static final int BLOCKED_REASON_NONE = 0;
    @android.annotation.FlaggedApi("com.android.net.flags.blocked_reason_oem_deny_chains")
    public static final int BLOCKED_REASON_OEM_DENY = 128;
    public static final int BLOCKED_REASON_RESTRICTED_MODE = 8;
    @java.lang.Deprecated
    public static final java.lang.String CONNECTIVITY_ACTION = "android.net.conn.CONNECTIVITY_CHANGE";
    @java.lang.Deprecated
    public static final int DEFAULT_NETWORK_PREFERENCE = 1;
    public static final java.lang.String EXTRA_CAPTIVE_PORTAL = "android.net.extra.CAPTIVE_PORTAL";
    public static final java.lang.String EXTRA_CAPTIVE_PORTAL_PROBE_SPEC = "android.net.extra.CAPTIVE_PORTAL_PROBE_SPEC";
    public static final java.lang.String EXTRA_CAPTIVE_PORTAL_URL = "android.net.extra.CAPTIVE_PORTAL_URL";
    public static final java.lang.String EXTRA_CAPTIVE_PORTAL_USER_AGENT = "android.net.extra.CAPTIVE_PORTAL_USER_AGENT";
    @java.lang.Deprecated
    public static final java.lang.String EXTRA_EXTRA_INFO = "extraInfo";
    @java.lang.Deprecated
    public static final java.lang.String EXTRA_IS_FAILOVER = "isFailover";
    public static final java.lang.String EXTRA_NETWORK = "android.net.extra.NETWORK";
    @java.lang.Deprecated
    public static final java.lang.String EXTRA_NETWORK_INFO = "networkInfo";
    public static final java.lang.String EXTRA_NETWORK_REQUEST = "android.net.extra.NETWORK_REQUEST";
    @java.lang.Deprecated
    public static final java.lang.String EXTRA_NETWORK_TYPE = "networkType";
    public static final java.lang.String EXTRA_NO_CONNECTIVITY = "noConnectivity";
    @java.lang.Deprecated
    public static final java.lang.String EXTRA_OTHER_NETWORK_INFO = "otherNetwork";
    public static final java.lang.String EXTRA_REASON = "reason";
    @android.annotation.FlaggedApi("com.android.net.flags.basic_background_restrictions_enabled")
    public static final int FIREWALL_CHAIN_BACKGROUND = 6;
    public static final int FIREWALL_CHAIN_DOZABLE = 1;
    public static final int FIREWALL_CHAIN_LOW_POWER_STANDBY = 5;
    @android.annotation.FlaggedApi("com.android.net.flags.metered_network_firewall_chains")
    public static final int FIREWALL_CHAIN_METERED_ALLOW = 10;
    @android.annotation.FlaggedApi("com.android.net.flags.metered_network_firewall_chains")
    public static final int FIREWALL_CHAIN_METERED_DENY_ADMIN = 12;
    @android.annotation.FlaggedApi("com.android.net.flags.metered_network_firewall_chains")
    public static final int FIREWALL_CHAIN_METERED_DENY_USER = 11;
    public static final int FIREWALL_CHAIN_OEM_DENY_1 = 7;
    public static final int FIREWALL_CHAIN_OEM_DENY_2 = 8;
    public static final int FIREWALL_CHAIN_OEM_DENY_3 = 9;
    public static final int FIREWALL_CHAIN_POWERSAVE = 3;
    public static final int FIREWALL_CHAIN_RESTRICTED = 4;
    public static final int FIREWALL_CHAIN_STANDBY = 2;
    public static final int FIREWALL_RULE_ALLOW = 1;
    public static final int FIREWALL_RULE_DEFAULT = 0;
    public static final int FIREWALL_RULE_DENY = 2;
    public static final int MULTIPATH_PREFERENCE_HANDOVER = 1;
    public static final int MULTIPATH_PREFERENCE_PERFORMANCE = 4;
    public static final int MULTIPATH_PREFERENCE_RELIABILITY = 2;
    public static final int PROFILE_NETWORK_PREFERENCE_DEFAULT = 0;
    public static final int PROFILE_NETWORK_PREFERENCE_ENTERPRISE = 1;
    public static final int PROFILE_NETWORK_PREFERENCE_ENTERPRISE_BLOCKING = 3;
    public static final int PROFILE_NETWORK_PREFERENCE_ENTERPRISE_NO_FALLBACK = 2;
    public static final int RESTRICT_BACKGROUND_STATUS_DISABLED = 1;
    public static final int RESTRICT_BACKGROUND_STATUS_ENABLED = 3;
    public static final int RESTRICT_BACKGROUND_STATUS_WHITELISTED = 2;
    public static final int TETHERING_BLUETOOTH = 2;
    public static final int TETHERING_USB = 1;
    public static final int TETHERING_WIFI = 0;
    @java.lang.Deprecated
    public static final int TETHER_ERROR_ENTITLEMENT_UNKONWN = 13;
    @java.lang.Deprecated
    public static final int TETHER_ERROR_NO_ERROR = 0;
    @java.lang.Deprecated
    public static final int TETHER_ERROR_PROVISION_FAILED = 11;
    @java.lang.Deprecated
    public static final int TYPE_BLUETOOTH = 7;
    @java.lang.Deprecated
    public static final int TYPE_DUMMY = 8;
    @java.lang.Deprecated
    public static final int TYPE_ETHERNET = 9;
    @java.lang.Deprecated
    public static final int TYPE_MOBILE = 0;
    @java.lang.Deprecated
    public static final int TYPE_MOBILE_DUN = 4;
    @java.lang.Deprecated
    public static final int TYPE_MOBILE_HIPRI = 5;
    @java.lang.Deprecated
    public static final int TYPE_MOBILE_MMS = 2;
    @java.lang.Deprecated
    public static final int TYPE_MOBILE_SUPL = 3;
    public static final int TYPE_NONE = -1;
    @java.lang.Deprecated
    public static final int TYPE_PROXY = 16;
    @java.lang.Deprecated
    public static final int TYPE_VPN = 17;
    @java.lang.Deprecated
    public static final int TYPE_WIFI = 1;
    @java.lang.Deprecated
    public static final int TYPE_WIFI_P2P = 13;
    @java.lang.Deprecated
    public static final int TYPE_WIMAX = 6;
    ConnectivityManager() {}
    public void addDefaultNetworkActiveListener(android.net.ConnectivityManager.OnNetworkActiveListener p0) {}
    public void addUidToMeteredNetworkAllowList(int p0) {}
    public void addUidToMeteredNetworkDenyList(int p0) {}
    public boolean bindProcessToNetwork(android.net.Network p0) { return false; }
    @android.annotation.NonNull
    public android.net.SocketKeepalive createNattKeepalive(android.net.Network p0, android.os.ParcelFileDescriptor p1, java.net.InetAddress p2, java.net.InetAddress p3, java.util.concurrent.Executor p4, android.net.SocketKeepalive.Callback p5) { return null; }
    @android.annotation.NonNull
    public android.net.SocketKeepalive createSocketKeepalive(android.net.Network p0, android.net.IpSecManager.UdpEncapsulationSocket p1, java.net.InetAddress p2, java.net.InetAddress p3, java.util.concurrent.Executor p4, android.net.SocketKeepalive.Callback p5) { return null; }
    @android.annotation.NonNull
    public android.net.SocketKeepalive createSocketKeepalive(android.net.Network p0, java.net.Socket p1, java.util.concurrent.Executor p2, android.net.SocketKeepalive.Callback p3) { return null; }
    public void factoryReset() {}
    @android.annotation.Nullable
    public android.net.Network getActiveNetwork() { return null; }
    @java.lang.Deprecated
    @android.annotation.Nullable
    public android.net.NetworkInfo getActiveNetworkInfo() { return null; }
    @java.lang.Deprecated
    @android.annotation.NonNull
    public android.net.NetworkInfo[] getAllNetworkInfo() { return null; }
    @android.annotation.NonNull
    public java.util.List<android.net.NetworkStateSnapshot> getAllNetworkStateSnapshots() { return null; }
    @java.lang.Deprecated
    @android.annotation.NonNull
    public android.net.Network[] getAllNetworks() { return null; }
    @java.lang.Deprecated
    public boolean getBackgroundDataSetting() { return false; }
    @android.annotation.Nullable
    public android.net.Network getBoundNetworkForProcess() { return null; }
    @java.lang.Deprecated
    public java.lang.String getCaptivePortalServerUrl() { return null; }
    public int getConnectionOwnerUid(int p0, java.net.InetSocketAddress p1, java.net.InetSocketAddress p2) { return 0; }
    @android.annotation.Nullable
    public android.net.ProxyInfo getDefaultProxy() { return null; }
    @android.annotation.Nullable
    public android.net.ProxyInfo getGlobalProxy() { return null; }
    @android.annotation.NonNull
    public static android.util.Range<java.lang.Integer> getIpSecNetIdRange() { return null; }
    @java.lang.Deprecated
    public void getLatestTetheringEntitlementResult(int p0, boolean p1, java.util.concurrent.Executor p2, android.net.ConnectivityManager.OnTetheringEntitlementResultListener p3) {}
    @android.annotation.Nullable
    public android.net.LinkProperties getLinkProperties(android.net.Network p0) { return null; }
    public int getMultipathPreference(android.net.Network p0) { return 0; }
    @android.annotation.Nullable
    public android.net.NetworkCapabilities getNetworkCapabilities(android.net.Network p0) { return null; }
    @java.lang.Deprecated
    @android.annotation.Nullable
    public android.net.NetworkInfo getNetworkInfo(android.net.Network p0) { return null; }
    @java.lang.Deprecated
    @android.annotation.Nullable
    public android.net.NetworkInfo getNetworkInfo(int p0) { return null; }
    @java.lang.Deprecated
    public int getNetworkPreference() { return 0; }
    @android.annotation.Nullable
    public byte[] getNetworkWatchlistConfigHash() { return null; }
    @java.lang.Deprecated
    @android.annotation.Nullable
    public static android.net.Network getProcessDefaultNetwork() { return null; }
    @android.annotation.Nullable
    public android.net.LinkProperties getRedactedLinkPropertiesForPackage(android.net.LinkProperties p0, int p1, java.lang.String p2) { return null; }
    @android.annotation.Nullable
    public android.net.NetworkCapabilities getRedactedNetworkCapabilitiesForPackage(android.net.NetworkCapabilities p0, int p1, java.lang.String p2) { return null; }
    public int getRestrictBackgroundStatus() { return 0; }
    public boolean isActiveNetworkMetered() { return false; }
    public boolean isDefaultNetworkActive() { return false; }
    @java.lang.Deprecated
    public static boolean isNetworkTypeValid(int p0) { return false; }
    @java.lang.Deprecated
    public boolean isTetheringSupported() { return false; }
    @android.annotation.FlaggedApi("com.android.net.flags.support_is_uid_networking_blocked")
    public boolean isUidNetworkingBlocked(int p0, boolean p1) { return false; }
    public void registerBestMatchingNetworkCallback(android.net.NetworkRequest p0, android.net.ConnectivityManager.NetworkCallback p1, android.os.Handler p2) {}
    public void registerDefaultNetworkCallback(android.net.ConnectivityManager.NetworkCallback p0) {}
    public void registerDefaultNetworkCallback(android.net.ConnectivityManager.NetworkCallback p0, android.os.Handler p1) {}
    public void registerDefaultNetworkCallbackForUid(int p0, android.net.ConnectivityManager.NetworkCallback p1, android.os.Handler p2) {}
    public void registerNetworkCallback(android.net.NetworkRequest p0, android.app.PendingIntent p1) {}
    public void registerNetworkCallback(android.net.NetworkRequest p0, android.net.ConnectivityManager.NetworkCallback p1) {}
    public void registerNetworkCallback(android.net.NetworkRequest p0, android.net.ConnectivityManager.NetworkCallback p1, android.os.Handler p2) {}
    public int registerNetworkProvider(android.net.NetworkProvider p0) { return 0; }
    public void registerQosCallback(android.net.QosSocketInfo p0, java.util.concurrent.Executor p1, android.net.QosCallback p2) {}
    public void registerSystemDefaultNetworkCallback(android.net.ConnectivityManager.NetworkCallback p0, android.os.Handler p1) {}
    @java.lang.Deprecated
    public void registerTetheringEventCallback(java.util.concurrent.Executor p0, android.net.ConnectivityManager.OnTetheringEventCallback p1) {}
    public void releaseNetworkRequest(android.app.PendingIntent p0) {}
    public void removeDefaultNetworkActiveListener(android.net.ConnectivityManager.OnNetworkActiveListener p0) {}
    public void removeUidFromMeteredNetworkAllowList(int p0) {}
    public void removeUidFromMeteredNetworkDenyList(int p0) {}
    public void replaceFirewallChain(int p0, int[] p1) {}
    @java.lang.Deprecated
    public void reportBadNetwork(android.net.Network p0) {}
    public void reportNetworkConnectivity(android.net.Network p0, boolean p1) {}
    public void requestBackgroundNetwork(android.net.NetworkRequest p0, android.net.ConnectivityManager.NetworkCallback p1, android.os.Handler p2) {}
    public boolean requestBandwidthUpdate(android.net.Network p0) { return false; }
    public void requestNetwork(android.net.NetworkRequest p0, android.app.PendingIntent p1) {}
    public void requestNetwork(android.net.NetworkRequest p0, android.net.ConnectivityManager.NetworkCallback p1) {}
    public void requestNetwork(android.net.NetworkRequest p0, android.net.ConnectivityManager.NetworkCallback p1, android.os.Handler p2) {}
    public void requestNetwork(android.net.NetworkRequest p0, android.net.ConnectivityManager.NetworkCallback p1, android.os.Handler p2, int p3) {}
    public void requestNetwork(android.net.NetworkRequest p0, android.net.ConnectivityManager.NetworkCallback p1, int p2) {}
    public void requestNetwork(android.net.NetworkRequest p0, int p1, int p2, android.os.Handler p3, android.net.ConnectivityManager.NetworkCallback p4) {}
    @java.lang.Deprecated
    public boolean requestRouteToHostAddress(int p0, java.net.InetAddress p1) { return false; }
    @android.annotation.FlaggedApi("com.android.net.flags.ipv6_over_ble")
    public void reserveNetwork(android.net.NetworkRequest p0, android.os.Handler p1, android.net.ConnectivityManager.NetworkCallback p2) {}
    public void setAcceptPartialConnectivity(android.net.Network p0, boolean p1, boolean p2) {}
    public void setAcceptUnvalidated(android.net.Network p0, boolean p1, boolean p2) {}
    public void setAirplaneMode(boolean p0) {}
    public void setAvoidUnvalidated(android.net.Network p0) {}
    @android.annotation.FlaggedApi("com.android.net.flags.set_data_saver_via_cm")
    public void setDataSaverEnabled(boolean p0) {}
    public void setFirewallChainEnabled(int p0, boolean p1) {}
    public void setGlobalProxy(android.net.ProxyInfo p0) {}
    public void setLegacyLockdownVpnEnabled(boolean p0) {}
    @java.lang.Deprecated
    public void setNetworkPreference(int p0) {}
    public void setOemNetworkPreference(android.net.OemNetworkPreferences p0, java.util.concurrent.Executor p1, java.lang.Runnable p2) {}
    @java.lang.Deprecated
    public static boolean setProcessDefaultNetwork(android.net.Network p0) { return false; }
    @java.lang.Deprecated
    public void setProfileNetworkPreference(android.os.UserHandle p0, int p1, java.util.concurrent.Executor p2, java.lang.Runnable p3) {}
    public void setProfileNetworkPreferences(android.os.UserHandle p0, java.util.List<android.net.ProfileNetworkPreference> p1, java.util.concurrent.Executor p2, java.lang.Runnable p3) {}
    public void setRequireVpnForUids(boolean p0, java.util.Collection<android.util.Range<java.lang.Integer>> p1) {}
    public void setUidFirewallRule(int p0, int p1, int p2) {}
    public void setVpnDefaultForUids(java.lang.String p0, java.util.Collection<android.util.Range<java.lang.Integer>> p1) {}
    public boolean shouldAvoidBadWifi() { return false; }
    public void simulateDataStall(int p0, long p1, android.net.Network p2, android.os.PersistableBundle p3) {}
    public void startCaptivePortalApp(android.net.Network p0) {}
    public void startCaptivePortalApp(android.net.Network p0, android.os.Bundle p1) {}
    @java.lang.Deprecated
    public void startTethering(int p0, boolean p1, android.net.ConnectivityManager.OnStartTetheringCallback p2) {}
    @java.lang.Deprecated
    public void startTethering(int p0, boolean p1, android.net.ConnectivityManager.OnStartTetheringCallback p2, android.os.Handler p3) {}
    @java.lang.Deprecated
    public void stopTethering(int p0) {}
    public void systemReady() {}
    public void unregisterNetworkCallback(android.app.PendingIntent p0) {}
    public void unregisterNetworkCallback(android.net.ConnectivityManager.NetworkCallback p0) {}
    public void unregisterNetworkProvider(android.net.NetworkProvider p0) {}
    public void unregisterQosCallback(android.net.QosCallback p0) {}
    @java.lang.Deprecated
    public void unregisterTetheringEventCallback(android.net.ConnectivityManager.OnTetheringEventCallback p0) {}

    public static class NetworkCallback {
        public static final int FLAG_INCLUDE_LOCATION_INFO = 1;
        public NetworkCallback() {}
        public NetworkCallback(int p0) {}
        public void onAvailable(android.net.Network p0) {}
        public void onBlockedStatusChanged(android.net.Network p0, boolean p1) {}
        public void onBlockedStatusChanged(android.net.Network p0, int p1) {}
        public void onCapabilitiesChanged(android.net.Network p0, android.net.NetworkCapabilities p1) {}
        public void onLinkPropertiesChanged(android.net.Network p0, android.net.LinkProperties p1) {}
        public void onLosing(android.net.Network p0, int p1) {}
        public void onLost(android.net.Network p0) {}
        @android.annotation.FlaggedApi("com.android.net.flags.ipv6_over_ble")
        public void onReserved(android.net.NetworkCapabilities p0) {}
        public void onUnavailable() {}
    }

    public static interface OnNetworkActiveListener {
        public void onNetworkActive();
    }

    @java.lang.Deprecated
    public static abstract class OnStartTetheringCallback {
        @java.lang.Deprecated
        public OnStartTetheringCallback() {}
        @java.lang.Deprecated
        public void onTetheringFailed() {}
        @java.lang.Deprecated
        public void onTetheringStarted() {}
    }

    @java.lang.Deprecated
    public static interface OnTetheringEntitlementResultListener {
        @java.lang.Deprecated
        public void onTetheringEntitlementResult(int p0);
    }

    @java.lang.Deprecated
    public static abstract class OnTetheringEventCallback {
        @java.lang.Deprecated
        public OnTetheringEventCallback() {}
        @java.lang.Deprecated
        public void onUpstreamChanged(android.net.Network p0) {}
    }
}
