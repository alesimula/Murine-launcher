package android.net.ipsec.ike;

public final class IkeSession implements java.lang.AutoCloseable {
    public IkeSession(android.content.Context p0, android.net.ipsec.ike.IkeSessionParams p1, android.net.ipsec.ike.ChildSessionParams p2, java.util.concurrent.Executor p3, android.net.ipsec.ike.IkeSessionCallback p4, android.net.ipsec.ike.ChildSessionCallback p5) {}
    public void finalize() {}
    public void openChildSession(android.net.ipsec.ike.ChildSessionParams p0, android.net.ipsec.ike.ChildSessionCallback p1) {}
    public void closeChildSession(android.net.ipsec.ike.ChildSessionCallback p0) {}
    public void close() {}
    public void kill() {}
    public void setNetwork(android.net.Network p0) {}
    public void setNetwork(android.net.Network p0, int p1, int p2, int p3) {}
    public void setUnderpinnedNetwork(android.net.Network p0) {}
}
