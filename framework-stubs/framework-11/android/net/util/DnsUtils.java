package android.net.util;

public class DnsUtils {
    private static final java.lang.String TAG = "DnsUtils";
    private static final int CHAR_BIT = 8;
    public static final int IPV6_ADDR_SCOPE_NODELOCAL = 1;
    public static final int IPV6_ADDR_SCOPE_LINKLOCAL = 2;
    public static final int IPV6_ADDR_SCOPE_SITELOCAL = 5;
    public static final int IPV6_ADDR_SCOPE_GLOBAL = 14;
    private static final java.util.Comparator<android.net.util.DnsUtils.SortableAddress> sRfc6724Comparator = null;
    public DnsUtils() {}
    public static java.util.List<java.net.InetAddress> rfc6724Sort(android.net.Network p0, java.util.List<java.net.InetAddress> p1) { return null; }
    private static java.net.InetAddress findSrcAddress(android.net.Network p0, java.net.InetAddress p1) { return null; }
    private static int findLabel(java.net.InetAddress p0) { return 0; }
    private static boolean isIpv6Address(java.net.InetAddress p0) { return false; }
    private static boolean isIpv4Address(java.net.InetAddress p0) { return false; }
    private static boolean isIpv6Address6To4(java.net.InetAddress p0) { return false; }
    private static boolean isIpv6AddressTeredo(java.net.InetAddress p0) { return false; }
    private static boolean isIpv6AddressULA(java.net.InetAddress p0) { return false; }
    private static boolean isIpv6Address6Bone(java.net.InetAddress p0) { return false; }
    private static int getIpv6MulticastScope(java.net.InetAddress p0) { return 0; }
    private static int findScope(java.net.InetAddress p0) { return 0; }
    private static int findPrecedence(java.net.InetAddress p0) { return 0; }
    private static int compareIpv6PrefixMatchLen(java.net.InetAddress p0, java.net.InetAddress p1) { return 0; }
    public static boolean haveIpv4(android.net.Network p0) { return false; }
    public static boolean haveIpv6(android.net.Network p0) { return false; }
    private static boolean checkConnectivity(android.net.Network p0, int p1, java.net.SocketAddress p2) { return false; }

    public static class Rfc6724Comparator implements java.util.Comparator<android.net.util.DnsUtils.SortableAddress> {
        public Rfc6724Comparator() {}
        public int compare(android.net.util.DnsUtils.SortableAddress p0, android.net.util.DnsUtils.SortableAddress p1) { return 0; }
    }

    public static class SortableAddress {
        public final int label = 0;
        public final int labelMatch = 0;
        public final int scope = 0;
        public final int scopeMatch = 0;
        public final int precedence = 0;
        public final int prefixMatchLen = 0;
        public final int hasSrcAddr = 0;
        public final java.net.InetAddress address = null;
        public SortableAddress(java.net.InetAddress p0, java.net.InetAddress p1) {}
    }
}
