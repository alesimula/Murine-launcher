package android.net.ipsec.ike;

public interface IkeSessionCallback {
    public void onOpened(android.net.ipsec.ike.IkeSessionConfiguration p0);
    public void onClosed();
    @java.lang.Deprecated
    default public void onClosedExceptionally(android.net.ipsec.ike.exceptions.IkeException p0) {}
    default public void onClosedWithException(android.net.ipsec.ike.exceptions.IkeException p0) {}
    @java.lang.Deprecated
    default public void onError(android.net.ipsec.ike.exceptions.IkeProtocolException p0) {}
    default public void onError(android.net.ipsec.ike.exceptions.IkeException p0) {}
    default public void onIkeSessionConnectionInfoChanged(android.net.ipsec.ike.IkeSessionConnectionInfo p0) {}
}
