package android.net.metrics;

@android.annotation.SystemApi
public class IpConnectivityLog {
    private static final java.lang.String TAG = null;
    private static final boolean DBG = false;
    public static final java.lang.String SERVICE_NAME = "connmetrics";
    private android.net.IIpConnectivityMetrics mService;
    @android.annotation.SystemApi
    public IpConnectivityLog() {}
    public IpConnectivityLog(android.net.IIpConnectivityMetrics p0) {}
    private boolean checkLoggerService() { return false; }
    public boolean log(android.net.ConnectivityMetricsEvent p0) { return false; }
    public boolean log(long p0, android.net.metrics.IpConnectivityLog.Event p1) { return false; }
    public boolean log(java.lang.String p0, android.net.metrics.IpConnectivityLog.Event p1) { return false; }
    public boolean log(android.net.Network p0, int[] p1, android.net.metrics.IpConnectivityLog.Event p2) { return false; }
    public boolean log(int p0, int[] p1, android.net.metrics.IpConnectivityLog.Event p2) { return false; }
    public boolean log(android.net.metrics.IpConnectivityLog.Event p0) { return false; }
    private static android.net.ConnectivityMetricsEvent makeEv(android.net.metrics.IpConnectivityLog.Event p0) { return null; }

    public static interface Event extends android.os.Parcelable {
    }
}
