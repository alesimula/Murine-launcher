package android.net.ipsec.ike;

public interface ChildSessionCallback {
    public void onClosed();
    default public void onClosedWithException(android.net.ipsec.ike.exceptions.IkeException p0) {}
    public void onIpSecTransformCreated(android.net.IpSecTransform p0, int p1);
    public void onIpSecTransformDeleted(android.net.IpSecTransform p0, int p1);
    public void onOpened(android.net.ipsec.ike.ChildSessionConfiguration p0);
    @java.lang.Deprecated
    default public void onClosedExceptionally(android.net.ipsec.ike.exceptions.IkeException p0) {}
    default public void onIpSecTransformsMigrated(android.net.IpSecTransform p0, android.net.IpSecTransform p1) {}
}
