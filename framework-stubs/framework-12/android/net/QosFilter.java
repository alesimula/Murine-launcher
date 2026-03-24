package android.net;

public abstract class QosFilter {
    QosFilter() {}
    @android.annotation.NonNull
    public abstract android.net.Network getNetwork();
    public abstract boolean matchesLocalAddress(java.net.InetAddress p0, int p1, int p2);
    public abstract boolean matchesRemoteAddress(java.net.InetAddress p0, int p1, int p2);
}
