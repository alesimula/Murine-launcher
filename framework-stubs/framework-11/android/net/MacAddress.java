package android.net;

public final class MacAddress implements android.os.Parcelable {
    private static final int ETHER_ADDR_LEN = 6;
    private static final byte[] ETHER_ADDR_BROADCAST = null;
    public static final android.net.MacAddress BROADCAST_ADDRESS = null;
    public static final android.net.MacAddress ALL_ZEROS_ADDRESS = null;
    public static final int TYPE_UNKNOWN = 0;
    public static final int TYPE_UNICAST = 1;
    public static final int TYPE_MULTICAST = 2;
    public static final int TYPE_BROADCAST = 3;
    private static final long VALID_LONG_MASK = 281474976710655L;
    private static final long LOCALLY_ASSIGNED_MASK = Long.valueOf(0L);
    private static final long MULTICAST_MASK = Long.valueOf(0L);
    private static final long OUI_MASK = Long.valueOf(0L);
    private static final long NIC_MASK = Long.valueOf(0L);
    private static final android.net.MacAddress BASE_GOOGLE_MAC = null;
    private static final android.net.MacAddress DEFAULT_MAC_ADDRESS = null;
    private final long mAddr = 0L;
    public static final android.os.Parcelable.Creator<android.net.MacAddress> CREATOR = null;
    private MacAddress(long p0) {}
    public int getAddressType() { return 0; }
    public boolean isLocallyAssigned() { return false; }
    public byte[] toByteArray() { return null; }
    public java.lang.String toString() { return null; }
    public java.lang.String toOuiString() { return null; }
    public int hashCode() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int describeContents() { return 0; }
    public static boolean isMacAddress(byte[] p0) { return false; }
    public static int macAddressType(byte[] p0) { return 0; }
    public static byte[] byteAddrFromStringAddr(java.lang.String p0) { return null; }
    public static java.lang.String stringAddrFromByteAddr(byte[] p0) { return null; }
    private static byte[] byteAddrFromLongAddr(long p0) { return null; }
    private static long longAddrFromByteAddr(byte[] p0) { return 0L; }
    private static long longAddrFromStringAddr(java.lang.String p0) { return 0L; }
    private static java.lang.String stringAddrFromLongAddr(long p0) { return null; }
    public static android.net.MacAddress fromString(java.lang.String p0) { return null; }
    public static android.net.MacAddress fromBytes(byte[] p0) { return null; }
    public static android.net.MacAddress createRandomUnicastAddressWithGoogleBase() { return null; }
    private static byte[] addr(int... p0) { return null; }
    public boolean matches(android.net.MacAddress p0, android.net.MacAddress p1) { return false; }
    public java.net.Inet6Address getLinkLocalIpv6FromEui48Mac() { return null; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface MacAddressType {
    }
}
