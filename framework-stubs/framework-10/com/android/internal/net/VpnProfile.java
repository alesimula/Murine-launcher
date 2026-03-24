package com.android.internal.net;

public class VpnProfile implements java.lang.Cloneable, android.os.Parcelable {
    private static final java.lang.String TAG = "VpnProfile";
    public static final int TYPE_PPTP = 0;
    public static final int TYPE_L2TP_IPSEC_PSK = 1;
    public static final int TYPE_L2TP_IPSEC_RSA = 2;
    public static final int TYPE_IPSEC_XAUTH_PSK = 3;
    public static final int TYPE_IPSEC_XAUTH_RSA = 4;
    public static final int TYPE_IPSEC_HYBRID_RSA = 5;
    public static final int TYPE_MAX = 5;
    public static final int PROXY_NONE = 0;
    public static final int PROXY_MANUAL = 1;
    @android.annotation.UnsupportedAppUsage
    public final java.lang.String key = null;
    @android.annotation.UnsupportedAppUsage
    public java.lang.String name;
    @android.annotation.UnsupportedAppUsage
    public int type;
    @android.annotation.UnsupportedAppUsage(maxTargetSdk=28, trackingBug=115609023L)
    public java.lang.String server;
    @android.annotation.UnsupportedAppUsage
    public java.lang.String username;
    public java.lang.String password;
    public java.lang.String dnsServers;
    public java.lang.String searchDomains;
    public java.lang.String routes;
    public boolean mppe;
    public java.lang.String l2tpSecret;
    public java.lang.String ipsecIdentifier;
    public java.lang.String ipsecSecret;
    public java.lang.String ipsecUserCert;
    public java.lang.String ipsecCaCert;
    public java.lang.String ipsecServerCert;
    public android.net.ProxyInfo proxy;
    @android.annotation.UnsupportedAppUsage
    public boolean saveLogin;
    public static final android.os.Parcelable.Creator<com.android.internal.net.VpnProfile> CREATOR = null;
    public VpnProfile(java.lang.String p0) {}
    @android.annotation.UnsupportedAppUsage
    public VpnProfile(android.os.Parcel p0) {}
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    @android.annotation.UnsupportedAppUsage
    public static com.android.internal.net.VpnProfile decode(java.lang.String p0, byte[] p1) { return null; }
    public byte[] encode() { return null; }
    public boolean isValidLockdownProfile() { return false; }
    public boolean isTypeValidForLockdown() { return false; }
    public boolean isServerAddressNumeric() { return false; }
    public boolean hasDns() { return false; }
    public boolean areDnsAddressesNumeric() { return false; }
    public int describeContents() { return 0; }
}
