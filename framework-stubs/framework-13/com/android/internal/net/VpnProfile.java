package com.android.internal.net;

public final class VpnProfile implements java.lang.Cloneable, android.os.Parcelable {
    static final java.lang.String VALUE_DELIMITER = "À";
    static final java.lang.String LIST_DELIMITER = ",";
    public static final int TYPE_PPTP = 0;
    public static final int TYPE_L2TP_IPSEC_PSK = 1;
    public static final int TYPE_L2TP_IPSEC_RSA = 2;
    public static final int TYPE_IPSEC_XAUTH_PSK = 3;
    public static final int TYPE_IPSEC_XAUTH_RSA = 4;
    public static final int TYPE_IPSEC_HYBRID_RSA = 5;
    public static final int TYPE_IKEV2_IPSEC_USER_PASS = 6;
    public static final int TYPE_IKEV2_IPSEC_PSK = 7;
    public static final int TYPE_IKEV2_IPSEC_RSA = 8;
    public static final int TYPE_IKEV2_FROM_IKE_TUN_CONN_PARAMS = 9;
    public static final int TYPE_MAX = 9;
    public static final int PROXY_NONE = 0;
    public static final int PROXY_MANUAL = 1;
    public final java.lang.String key = null;
    public java.lang.String name;
    public int type;
    public java.lang.String server;
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
    public boolean isBypassable;
    public boolean isMetered;
    public int maxMtu;
    public boolean areAuthParamsInline;
    public final boolean isRestrictedToTestNetworks = false;
    public final boolean excludeLocalRoutes = false;
    public final boolean requiresInternetValidation = false;
    public final android.net.ipsec.ike.IkeTunnelConnectionParams ikeTunConnParams = null;
    public transient boolean saveLogin;
    public static final android.os.Parcelable.Creator<com.android.internal.net.VpnProfile> CREATOR = null;
    public VpnProfile(java.lang.String p0) {}
    public VpnProfile(java.lang.String p0, boolean p1) {}
    public VpnProfile(java.lang.String p0, boolean p1, boolean p2, boolean p3, android.net.ipsec.ike.IkeTunnelConnectionParams p4) {}
    public VpnProfile(android.os.Parcel p0) {}
    public java.util.List<java.lang.String> getAllowedAlgorithms() { return null; }
    public void setAllowedAlgorithms(java.util.List<java.lang.String> p0) {}
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public static com.android.internal.net.VpnProfile decode(java.lang.String p0, byte[] p1) { return null; }
    public byte[] encode() { return null; }
    public static boolean isLegacyType(int p0) { return false; }
    public boolean isValidLockdownProfile() { return false; }
    public boolean isTypeValidForLockdown() { return false; }
    public boolean isServerAddressNumeric() { return false; }
    public boolean hasDns() { return false; }
    public boolean areDnsAddressesNumeric() { return false; }
    public int hashCode() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int describeContents() { return 0; }
}
