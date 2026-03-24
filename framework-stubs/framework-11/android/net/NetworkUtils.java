package android.net;

public class NetworkUtils {
    private static final java.lang.String TAG = "NetworkUtils";
    private static final int[] ADDRESS_FAMILIES = null;
    public NetworkUtils() {}
    public static native void attachDropAllBPFFilter(java.io.FileDescriptor p0) throws java.net.SocketException;
    public static native void detachBPFFilter(java.io.FileDescriptor p0) throws java.net.SocketException;
    public static native boolean bindProcessToNetwork(int p0);
    public static native int getBoundNetworkForProcess();
    @java.lang.Deprecated
    public static native boolean bindProcessToNetworkForHostResolution(int p0);
    public static native int bindSocketToNetwork(int p0, int p1);
    public static boolean protectFromVpn(java.io.FileDescriptor p0) { return false; }
    public static native boolean protectFromVpn(int p0);
    public static native boolean queryUserAccess(int p0, int p1);
    public static native java.io.FileDescriptor resNetworkSend(int p0, byte[] p1, int p2, int p3) throws android.system.ErrnoException;
    public static native java.io.FileDescriptor resNetworkQuery(int p0, java.lang.String p1, int p2, int p3, int p4) throws android.system.ErrnoException;
    public static native android.net.DnsResolver.DnsResponse resNetworkResult(java.io.FileDescriptor p0) throws android.system.ErrnoException;
    public static native void resNetworkCancel(java.io.FileDescriptor p0);
    public static native android.net.Network getDnsNetwork() throws android.system.ErrnoException;
    public static native void setAllowNetworkingForProcess(boolean p0);
    public static native android.net.TcpRepairWindow getTcpRepairWindow(java.io.FileDescriptor p0) throws android.system.ErrnoException;
    @java.lang.Deprecated
    public static java.net.InetAddress intToInetAddress(int p0) { return null; }
    @java.lang.Deprecated
    public static int inetAddressToInt(java.net.Inet4Address p0) throws java.lang.IllegalArgumentException { return 0; }
    @java.lang.Deprecated
    public static int prefixLengthToNetmaskInt(int p0) throws java.lang.IllegalArgumentException { return 0; }
    public static int netmaskIntToPrefixLength(int p0) { return 0; }
    @java.lang.Deprecated
    public static int netmaskToPrefixLength(java.net.Inet4Address p0) { return 0; }
    @java.lang.Deprecated
    public static java.net.InetAddress numericToInetAddress(java.lang.String p0) throws java.lang.IllegalArgumentException { return null; }
    public static void maskRawAddress(byte[] p0, int p1) {}
    public static java.net.InetAddress getNetworkPart(java.net.InetAddress p0, int p1) { return null; }
    public static int getImplicitNetmask(java.net.Inet4Address p0) { return 0; }
    public static android.util.Pair<java.net.InetAddress, java.lang.Integer> parseIpAndMask(java.lang.String p0) { return null; }
    public static java.net.InetAddress hexToInet6Address(java.lang.String p0) throws java.lang.IllegalArgumentException { return null; }
    public static java.lang.String[] makeStrings(java.util.Collection<java.net.InetAddress> p0) { return null; }
    public static java.lang.String trimV4AddrZeros(java.lang.String p0) { return null; }
    private static java.util.TreeSet<android.net.IpPrefix> deduplicatePrefixSet(java.util.TreeSet<android.net.IpPrefix> p0) { return null; }
    public static long routedIPv4AddressCount(java.util.TreeSet<android.net.IpPrefix> p0) { return 0L; }
    public static java.math.BigInteger routedIPv6AddressCount(java.util.TreeSet<android.net.IpPrefix> p0) { return null; }
    public static boolean isWeaklyValidatedHostname(java.lang.String p0) { return false; }
}
