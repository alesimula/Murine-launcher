package android.net;

public class LinkAddress implements android.os.Parcelable {
    @android.annotation.SystemApi
    public static final long LIFETIME_UNKNOWN = -1L;
    @android.annotation.SystemApi
    public static final long LIFETIME_PERMANENT = 9223372036854775807L;
    private java.net.InetAddress address;
    private int prefixLength;
    private int flags;
    private int scope;
    private long deprecationTime;
    private long expirationTime;
    public static final android.os.Parcelable.Creator<android.net.LinkAddress> CREATOR = null;
    private static int scopeForUnicastAddress(java.net.InetAddress p0) { return 0; }
    private boolean isIpv6ULA() { return false; }
    @android.annotation.SystemApi
    public boolean isIpv6() { return false; }
    public boolean isIPv6() { return false; }
    @android.annotation.SystemApi
    public boolean isIpv4() { return false; }
    private void init(java.net.InetAddress p0, int p1, int p2, int p3, long p4, long p5) {}
    @android.annotation.SystemApi
    public LinkAddress(java.net.InetAddress p0, int p1, int p2, int p3) {}
    @android.annotation.SystemApi
    public LinkAddress(java.net.InetAddress p0, int p1, int p2, int p3, long p4, long p5) {}
    @android.annotation.SystemApi
    public LinkAddress(java.net.InetAddress p0, int p1) {}
    public LinkAddress(java.net.InterfaceAddress p0) {}
    @android.annotation.SystemApi
    public LinkAddress(java.lang.String p0) {}
    @android.annotation.SystemApi
    public LinkAddress(java.lang.String p0, int p1, int p2) {}
    public java.lang.String toString() { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    @android.annotation.SystemApi
    public boolean isSameAddressAs(android.net.LinkAddress p0) { return false; }
    public java.net.InetAddress getAddress() { return null; }
    public int getPrefixLength() { return 0; }
    public int getNetworkPrefixLength() { return 0; }
    public int getFlags() { return 0; }
    public int getScope() { return 0; }
    @android.annotation.SystemApi
    public long getDeprecationTime() { return 0L; }
    @android.annotation.SystemApi
    public long getExpirationTime() { return 0L; }
    @android.annotation.SystemApi
    public boolean isGlobalPreferred() { return false; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
