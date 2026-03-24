package android.net.util;

public final class IpRange {
    private static final int SIGNUM_POSITIVE = 1;
    private final byte[] mStartAddr = null;
    private final byte[] mEndAddr = null;
    public IpRange(java.net.InetAddress p0, java.net.InetAddress p1) {}
    public IpRange(android.net.IpPrefix p0) {}
    private static java.net.InetAddress getAsInetAddress(byte[] p0) { return null; }
    public java.net.InetAddress getStartAddr() { return null; }
    public java.net.InetAddress getEndAddr() { return null; }
    public java.util.List<android.net.IpPrefix> asIpPrefixes() { return null; }
    private static java.util.List<android.net.IpPrefix> getSubsetPrefixes(android.net.IpPrefix p0) { return null; }
    public boolean containsRange(android.net.util.IpRange p0) { return false; }
    public boolean overlapsRange(android.net.util.IpRange p0) { return false; }
    public int hashCode() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    private static java.math.BigInteger addrToBigInteger(byte[] p0) { return null; }
}
