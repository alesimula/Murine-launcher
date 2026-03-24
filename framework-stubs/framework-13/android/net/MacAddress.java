package android.net;

public final class MacAddress implements android.os.Parcelable {
    public static final android.net.MacAddress BROADCAST_ADDRESS = null;
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.net.MacAddress> CREATOR = null;
    public static final int TYPE_BROADCAST = 3;
    public static final int TYPE_MULTICAST = 2;
    public static final int TYPE_UNICAST = 1;
    public int getAddressType() { return 0; }
    public boolean isLocallyAssigned() { return false; }
    @android.annotation.NonNull
    public byte[] toByteArray() { return null; }
    @android.annotation.NonNull
    public java.lang.String toString() { return null; }
    @android.annotation.NonNull
    public java.lang.String toOuiString() { return null; }
    public int hashCode() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int describeContents() { return 0; }
    @android.annotation.NonNull
    public static android.net.MacAddress fromString(java.lang.String p0) { return null; }
    @android.annotation.NonNull
    public static android.net.MacAddress fromBytes(byte[] p0) { return null; }
    public boolean matches(android.net.MacAddress p0, android.net.MacAddress p1) { return false; }
    @android.annotation.Nullable
    public java.net.Inet6Address getLinkLocalIpv6FromEui48Mac() { return null; }
}
