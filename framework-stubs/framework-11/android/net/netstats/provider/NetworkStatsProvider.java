package android.net.netstats.provider;

@android.annotation.SystemApi
public abstract class NetworkStatsProvider {
    public static final int QUOTA_UNLIMITED = -1;
    private final android.net.netstats.provider.INetworkStatsProvider mProviderBinder = null;
    private android.net.netstats.provider.INetworkStatsProviderCallback mProviderCbBinder;
    public NetworkStatsProvider() {}
    public android.net.netstats.provider.INetworkStatsProvider getProviderBinder() { return null; }
    public void setProviderCallbackBinder(android.net.netstats.provider.INetworkStatsProviderCallback p0) {}
    public android.net.netstats.provider.INetworkStatsProviderCallback getProviderCallbackBinder() { return null; }
    public android.net.netstats.provider.INetworkStatsProviderCallback getProviderCallbackBinderOrThrow() { return null; }
    public void notifyStatsUpdated(int p0, android.net.NetworkStats p1, android.net.NetworkStats p2) {}
    public void notifyAlertReached() {}
    public void notifyLimitReached() {}
    public abstract void onRequestStatsUpdate(int p0);
    public abstract void onSetLimit(java.lang.String p0, long p1);
    public abstract void onSetAlert(long p0);
}
