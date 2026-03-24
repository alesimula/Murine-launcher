package android.net;

public abstract class QosFilter {
    QosFilter() {}
    @android.annotation.NonNull
    public abstract android.net.Network getNetwork();
    public abstract boolean matchesLocalAddress(java.net.InetAddress p0, int p1, int p2);
    @android.annotation.FlaggedApi("com.android.net.flags.qos_filter_ip_range_matching")
    public abstract boolean matchesLocalPrefix(android.net.IpPrefix p0, int p1, int p2);
    public boolean matchesProtocol(int p0) { return false; }
    public abstract boolean matchesRemoteAddress(java.net.InetAddress p0, int p1, int p2);
    @android.annotation.FlaggedApi("com.android.net.flags.qos_filter_ip_range_matching")
    public abstract boolean matchesRemotePrefix(android.net.IpPrefix p0, int p1, int p2);
}
