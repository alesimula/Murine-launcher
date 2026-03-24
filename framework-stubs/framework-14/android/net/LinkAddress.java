package android.net;

public class LinkAddress implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.net.LinkAddress> CREATOR = null;
    public static final long LIFETIME_PERMANENT = 9223372036854775807L;
    public static final long LIFETIME_UNKNOWN = -1L;
    public LinkAddress(java.net.InetAddress p0, int p1, int p2, int p3) {}
    public LinkAddress(java.net.InetAddress p0, int p1, int p2, int p3, long p4, long p5) {}
    public LinkAddress(java.net.InetAddress p0, int p1) {}
    public LinkAddress(java.lang.String p0) {}
    public LinkAddress(java.lang.String p0, int p1, int p2) {}
    public boolean isIpv6() { return false; }
    public boolean isIpv4() { return false; }
    public java.lang.String toString() { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public boolean isSameAddressAs(android.net.LinkAddress p0) { return false; }
    public java.net.InetAddress getAddress() { return null; }
    public int getPrefixLength() { return 0; }
    public int getFlags() { return 0; }
    public int getScope() { return 0; }
    public long getDeprecationTime() { return 0L; }
    public long getExpirationTime() { return 0L; }
    public boolean isGlobalPreferred() { return false; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
