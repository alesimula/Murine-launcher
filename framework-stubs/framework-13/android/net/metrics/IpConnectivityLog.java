package android.net.metrics;

@java.lang.Deprecated
@android.annotation.SystemApi
public class IpConnectivityLog {
    public static final java.lang.String SERVICE_NAME = "connmetrics";
    @android.annotation.SystemApi
    public IpConnectivityLog() {}
    public IpConnectivityLog(android.net.IIpConnectivityMetrics p0) {}
    public boolean log(android.net.ConnectivityMetricsEvent p0) { return false; }
    public boolean log(long p0, android.net.metrics.IpConnectivityLog.Event p1) { return false; }
    public boolean log(java.lang.String p0, android.net.metrics.IpConnectivityLog.Event p1) { return false; }
    public boolean log(android.net.Network p0, int[] p1, android.net.metrics.IpConnectivityLog.Event p2) { return false; }
    public boolean log(int p0, int[] p1, android.net.metrics.IpConnectivityLog.Event p2) { return false; }
    public boolean log(android.net.metrics.IpConnectivityLog.Event p0) { return false; }
    public boolean logDefaultNetworkValidity(boolean p0) { return false; }
    public boolean logDefaultNetworkEvent(android.net.Network p0, int p1, boolean p2, android.net.LinkProperties p3, android.net.NetworkCapabilities p4, android.net.Network p5, int p6, android.net.LinkProperties p7, android.net.NetworkCapabilities p8) { return false; }

    public static interface Event extends android.os.Parcelable {
    }
}
