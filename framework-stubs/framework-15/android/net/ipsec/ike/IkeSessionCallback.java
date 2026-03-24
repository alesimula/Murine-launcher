package android.net.ipsec.ike;

public interface IkeSessionCallback {
    public static final int LIVENESS_STATUS_BACKGROUND_ONGOING = 3;
    public static final int LIVENESS_STATUS_BACKGROUND_STARTED = 2;
    public static final int LIVENESS_STATUS_FAILURE = 5;
    public static final int LIVENESS_STATUS_ON_DEMAND_ONGOING = 1;
    public static final int LIVENESS_STATUS_ON_DEMAND_STARTED = 0;
    public static final int LIVENESS_STATUS_SUCCESS = 4;
    public void onClosed();
    default public void onClosedWithException(android.net.ipsec.ike.exceptions.IkeException p0) {}
    default public void onError(android.net.ipsec.ike.exceptions.IkeException p0) {}
    public void onOpened(android.net.ipsec.ike.IkeSessionConfiguration p0);
    @java.lang.Deprecated
    default public void onClosedExceptionally(android.net.ipsec.ike.exceptions.IkeException p0) {}
    @java.lang.Deprecated
    default public void onError(android.net.ipsec.ike.exceptions.IkeProtocolException p0) {}
    default public void onIkeSessionConnectionInfoChanged(android.net.ipsec.ike.IkeSessionConnectionInfo p0) {}
    default public void onLivenessStatusChanged(int p0) {}
}
