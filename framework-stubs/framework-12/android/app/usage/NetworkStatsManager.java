package android.app.usage;

public class NetworkStatsManager {
    private static final java.lang.String TAG = "NetworkStatsManager";
    private static final boolean DBG = false;
    public static final int CALLBACK_LIMIT_REACHED = 0;
    public static final int CALLBACK_RELEASED = 1;
    public static final long MIN_THRESHOLD_BYTES = Long.valueOf(0L);
    private final android.content.Context mContext = null;
    private final android.net.INetworkStatsService mService = null;
    public static final int FLAG_POLL_ON_OPEN = 1;
    public static final int FLAG_POLL_FORCE = 2;
    public static final int FLAG_AUGMENT_WITH_SUBSCRIPTION_PLAN = 4;
    private int mFlags;
    public NetworkStatsManager(android.content.Context p0) throws android.os.ServiceManager.ServiceNotFoundException {}
    public NetworkStatsManager(android.content.Context p0, android.net.INetworkStatsService p1) {}
    public void setPollOnOpen(boolean p0) {}
    public void setPollForce(boolean p0) {}
    public void setAugmentWithSubscriptionPlan(boolean p0) {}
    public android.app.usage.NetworkStats.Bucket querySummaryForDevice(android.net.NetworkTemplate p0, long p1, long p2) throws java.lang.SecurityException, android.os.RemoteException { return null; }
    public android.app.usage.NetworkStats.Bucket querySummaryForDevice(int p0, java.lang.String p1, long p2, long p3) throws java.lang.SecurityException, android.os.RemoteException { return null; }
    public android.app.usage.NetworkStats.Bucket querySummaryForUser(int p0, java.lang.String p1, long p2, long p3) throws java.lang.SecurityException, android.os.RemoteException { return null; }
    public android.app.usage.NetworkStats querySummary(int p0, java.lang.String p1, long p2, long p3) throws java.lang.SecurityException, android.os.RemoteException { return null; }
    public android.app.usage.NetworkStats querySummary(android.net.NetworkTemplate p0, long p1, long p2) throws java.lang.SecurityException, android.os.RemoteException { return null; }
    public android.app.usage.NetworkStats queryDetailsForUid(int p0, java.lang.String p1, long p2, long p3, int p4) throws java.lang.SecurityException { return null; }
    public android.app.usage.NetworkStats queryDetailsForUid(android.net.NetworkTemplate p0, long p1, long p2, int p3) throws java.lang.SecurityException { return null; }
    public android.app.usage.NetworkStats queryDetailsForUidTag(int p0, java.lang.String p1, long p2, long p3, int p4, int p5) throws java.lang.SecurityException { return null; }
    public android.app.usage.NetworkStats queryDetailsForUidTagState(int p0, java.lang.String p1, long p2, long p3, int p4, int p5, int p6) throws java.lang.SecurityException { return null; }
    public android.app.usage.NetworkStats queryDetailsForUidTagState(android.net.NetworkTemplate p0, long p1, long p2, int p3, int p4, int p5) throws java.lang.SecurityException { return null; }
    public android.app.usage.NetworkStats queryDetails(int p0, java.lang.String p1, long p2, long p3) throws java.lang.SecurityException, android.os.RemoteException { return null; }
    public void registerUsageCallback(android.net.NetworkTemplate p0, int p1, long p2, android.app.usage.NetworkStatsManager.UsageCallback p3, android.os.Handler p4) {}
    public void registerUsageCallback(int p0, java.lang.String p1, long p2, android.app.usage.NetworkStatsManager.UsageCallback p3) {}
    public void registerUsageCallback(int p0, java.lang.String p1, long p2, android.app.usage.NetworkStatsManager.UsageCallback p3, android.os.Handler p4) {}
    public void unregisterUsageCallback(android.app.usage.NetworkStatsManager.UsageCallback p0) {}
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission(anyOf={"android.permission.NETWORK_STATS_PROVIDER", "android.permission.MAINLINE_NETWORK_STACK"})
    public void registerNetworkStatsProvider(java.lang.String p0, android.net.netstats.provider.NetworkStatsProvider p1) {}
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission(anyOf={"android.permission.NETWORK_STATS_PROVIDER", "android.permission.MAINLINE_NETWORK_STACK"})
    public void unregisterNetworkStatsProvider(android.net.netstats.provider.NetworkStatsProvider p0) {}
    private static android.net.NetworkTemplate createTemplate(int p0, java.lang.String p1) { return null; }
    @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.MODULE_LIBRARIES)
    @android.annotation.RequiresPermission(anyOf={"android.permission.MAINLINE_NETWORK_STACK", "android.permission.NETWORK_STACK"})
    public void notifyNetworkStatus(java.util.List<android.net.Network> p0, java.util.List<android.net.NetworkStateSnapshot> p1, java.lang.String p2, java.util.List<android.net.UnderlyingNetworkInfo> p3) {}

    private static class CallbackHandler extends android.os.Handler {
        private final int mNetworkType = 0;
        private final java.lang.String mSubscriberId = null;
        private android.app.usage.NetworkStatsManager.UsageCallback mCallback;
        CallbackHandler(android.os.Looper p0, int p1, java.lang.String p2, android.app.usage.NetworkStatsManager.UsageCallback p3) { super(); }
        public void handleMessage(android.os.Message p0) {}
        private static java.lang.Object getObject(android.os.Message p0, java.lang.String p1) { return null; }
    }

    public static abstract class UsageCallback {
        private android.net.DataUsageRequest request;
        public UsageCallback() {}
        public abstract void onThresholdReached(int p0, java.lang.String p1);
    }
}
