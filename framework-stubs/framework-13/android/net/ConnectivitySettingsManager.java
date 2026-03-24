package android.net;

public class ConnectivitySettingsManager {
    public static final int CAPTIVE_PORTAL_MODE_AVOID = 2;
    public static final int CAPTIVE_PORTAL_MODE_IGNORE = 0;
    public static final int CAPTIVE_PORTAL_MODE_PROMPT = 1;
    public static final int NETWORK_AVOID_BAD_WIFI_AVOID = 2;
    public static final int NETWORK_AVOID_BAD_WIFI_IGNORE = 0;
    public static final int NETWORK_AVOID_BAD_WIFI_PROMPT = 1;
    public static final int PRIVATE_DNS_MODE_OFF = 1;
    public static final int PRIVATE_DNS_MODE_OPPORTUNISTIC = 2;
    public static final int PRIVATE_DNS_MODE_PROVIDER_HOSTNAME = 3;
    @android.annotation.NonNull
    public static java.time.Duration getMobileDataActivityTimeout(android.content.Context p0, java.time.Duration p1) { return null; }
    public static void setMobileDataActivityTimeout(android.content.Context p0, java.time.Duration p1) {}
    @android.annotation.NonNull
    public static java.time.Duration getWifiDataActivityTimeout(android.content.Context p0, java.time.Duration p1) { return null; }
    public static void setWifiDataActivityTimeout(android.content.Context p0, java.time.Duration p1) {}
    @android.annotation.NonNull
    public static java.time.Duration getDnsResolverSampleValidityDuration(android.content.Context p0, java.time.Duration p1) { return null; }
    public static void setDnsResolverSampleValidityDuration(android.content.Context p0, java.time.Duration p1) {}
    public static int getDnsResolverSuccessThresholdPercent(android.content.Context p0, int p1) { return 0; }
    public static void setDnsResolverSuccessThresholdPercent(android.content.Context p0, int p1) {}
    @android.annotation.NonNull
    public static android.util.Range<java.lang.Integer> getDnsResolverSampleRanges(android.content.Context p0) { return null; }
    public static void setDnsResolverSampleRanges(android.content.Context p0, android.util.Range<java.lang.Integer> p1) {}
    public static int getNetworkSwitchNotificationMaximumDailyCount(android.content.Context p0, int p1) { return 0; }
    public static void setNetworkSwitchNotificationMaximumDailyCount(android.content.Context p0, int p1) {}
    @android.annotation.NonNull
    public static java.time.Duration getNetworkSwitchNotificationRateDuration(android.content.Context p0, java.time.Duration p1) { return null; }
    public static void setNetworkSwitchNotificationRateDuration(android.content.Context p0, java.time.Duration p1) {}
    @android.annotation.Nullable
    public static java.lang.String getCaptivePortalHttpUrl(android.content.Context p0) { return null; }
    public static void setCaptivePortalHttpUrl(android.content.Context p0, java.lang.String p1) {}
    public static int getCaptivePortalMode(android.content.Context p0, int p1) { return 0; }
    public static void setCaptivePortalMode(android.content.Context p0, int p1) {}
    @android.annotation.Nullable
    public static android.net.ProxyInfo getGlobalProxy(android.content.Context p0) { return null; }
    public static void setGlobalProxy(android.content.Context p0, android.net.ProxyInfo p1) {}
    public static void clearGlobalProxy(android.content.Context p0) {}
    public static int getPrivateDnsMode(android.content.Context p0) { return 0; }
    public static void setPrivateDnsMode(android.content.Context p0, int p1) {}
    @android.annotation.Nullable
    public static java.lang.String getPrivateDnsHostname(android.content.Context p0) { return null; }
    public static void setPrivateDnsHostname(android.content.Context p0, java.lang.String p1) {}
    @android.annotation.NonNull
    public static java.lang.String getPrivateDnsDefaultMode(android.content.Context p0) { return null; }
    public static void setPrivateDnsDefaultMode(android.content.Context p0, int p1) {}
    @android.annotation.NonNull
    public static java.time.Duration getConnectivityKeepPendingIntentDuration(android.content.Context p0, java.time.Duration p1) { return null; }
    public static void setConnectivityKeepPendingIntentDuration(android.content.Context p0, java.time.Duration p1) {}
    public static boolean getMobileDataAlwaysOn(android.content.Context p0, boolean p1) { return false; }
    public static void setMobileDataAlwaysOn(android.content.Context p0, boolean p1) {}
    public static boolean getWifiAlwaysRequested(android.content.Context p0, boolean p1) { return false; }
    public static void setWifiAlwaysRequested(android.content.Context p0, boolean p1) {}
    public static int getNetworkAvoidBadWifi(android.content.Context p0) { return 0; }
    public static void setNetworkAvoidBadWifi(android.content.Context p0, int p1) {}
    @android.annotation.Nullable
    public static java.lang.String getNetworkMeteredMultipathPreference(android.content.Context p0) { return null; }
    public static void setNetworkMeteredMultipathPreference(android.content.Context p0, java.lang.String p1) {}
    @android.annotation.NonNull
    public static java.util.Set<java.lang.Integer> getMobileDataPreferredUids(android.content.Context p0) { return null; }
    public static void setMobileDataPreferredUids(android.content.Context p0, java.util.Set<java.lang.Integer> p1) {}
    @android.annotation.NonNull
    public static java.util.Set<java.lang.Integer> getUidsAllowedOnRestrictedNetworks(android.content.Context p0) { return null; }
    public static void setUidsAllowedOnRestrictedNetworks(android.content.Context p0, java.util.Set<java.lang.Integer> p1) {}
    public static long getIngressRateLimitInBytesPerSecond(android.content.Context p0) { return 0L; }
    public static void setIngressRateLimitInBytesPerSecond(android.content.Context p0, long p1) {}
}
