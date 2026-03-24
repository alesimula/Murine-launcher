package com.android.internal.net;

public class VpnConfig implements android.os.Parcelable {
    public static final java.lang.String SERVICE_INTERFACE = "android.net.VpnService";
    public static final java.lang.String DIALOGS_PACKAGE = "com.android.vpndialogs";
    public static final java.lang.String LEGACY_VPN = "[Legacy VPN]";
    public java.lang.String user;
    public java.lang.String interfaze;
    public java.lang.String session;
    public int mtu;
    public java.util.List<android.net.LinkAddress> addresses;
    public java.util.List<android.net.RouteInfo> routes;
    public java.util.List<java.lang.String> dnsServers;
    public java.util.List<java.lang.String> searchDomains;
    public java.util.List<java.lang.String> allowedApplications;
    public java.util.List<java.lang.String> disallowedApplications;
    public android.app.PendingIntent configureIntent;
    public long startTime;
    public boolean legacy;
    public boolean blocking;
    public boolean allowBypass;
    public boolean allowIPv4;
    public boolean allowIPv6;
    public boolean isMetered;
    public android.net.Network[] underlyingNetworks;
    public android.net.ProxyInfo proxyInfo;
    public static final android.os.Parcelable.Creator<com.android.internal.net.VpnConfig> CREATOR = null;
    public static android.content.Intent getIntentForConfirmation() { return null; }
    public static android.app.PendingIntent getIntentForStatusPanel(android.content.Context p0) { return null; }
    public static java.lang.CharSequence getVpnLabel(android.content.Context p0, java.lang.String p1) throws android.content.pm.PackageManager.NameNotFoundException { return null; }
    public VpnConfig() {}
    public void updateAllowedFamilies(java.net.InetAddress p0) {}
    public void addLegacyRoutes(java.lang.String p0) {}
    public void addLegacyAddresses(java.lang.String p0) {}
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public java.lang.String toString() { return null; }
    static <T extends java.lang.Object> java.lang.String toString(java.util.List<T> p0) { return null; }
}
