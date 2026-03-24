package android.net;

public final class IpPrefix implements android.os.Parcelable {
    private final byte[] address = null;
    private final int prefixLength = 0;
    public static final android.os.Parcelable.Creator<android.net.IpPrefix> CREATOR = null;
    private void checkAndMaskAddressAndPrefixLength() {}
    public IpPrefix(byte[] p0, int p1) {}
    @android.annotation.SystemApi
    public IpPrefix(java.net.InetAddress p0, int p1) {}
    @android.annotation.SystemApi
    public IpPrefix(java.lang.String p0) {}
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public java.net.InetAddress getAddress() { return null; }
    public byte[] getRawAddress() { return null; }
    public int getPrefixLength() { return 0; }
    public boolean contains(java.net.InetAddress p0) { return false; }
    public boolean containsPrefix(android.net.IpPrefix p0) { return false; }
    public boolean isIPv6() { return false; }
    public boolean isIPv4() { return false; }
    public java.lang.String toString() { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public static java.util.Comparator<android.net.IpPrefix> lengthComparator() { return null; }
}
