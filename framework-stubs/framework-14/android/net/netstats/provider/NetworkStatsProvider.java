package android.net.netstats.provider;

public abstract class NetworkStatsProvider {
    public static final int QUOTA_UNLIMITED = -1;
    public NetworkStatsProvider() {}
    public void notifyStatsUpdated(int p0, android.net.NetworkStats p1, android.net.NetworkStats p2) {}
    public void notifyAlertReached() {}
    public void notifyWarningReached() {}
    public void notifyLimitReached() {}
    public abstract void onRequestStatsUpdate(int p0);
    public abstract void onSetLimit(java.lang.String p0, long p1);
    public void onSetWarningAndLimit(java.lang.String p0, long p1, long p2) {}
    public abstract void onSetAlert(long p0);
}
