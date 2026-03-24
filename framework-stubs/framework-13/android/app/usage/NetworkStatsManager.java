package android.app.usage;

public class NetworkStatsManager {
    public static final int NETWORK_TYPE_5G_NSA = -2;
    NetworkStatsManager() {}
    public void setPollOnOpen(boolean p0) {}
    public void setPollForce(boolean p0) {}
    @android.annotation.NonNull
    public android.app.usage.NetworkStats.Bucket querySummaryForDevice(android.net.NetworkTemplate p0, long p1, long p2) { return null; }
    public android.app.usage.NetworkStats.Bucket querySummaryForDevice(int p0, java.lang.String p1, long p2, long p3) throws android.os.RemoteException, java.lang.SecurityException { return null; }
    public android.app.usage.NetworkStats.Bucket querySummaryForUser(int p0, java.lang.String p1, long p2, long p3) throws android.os.RemoteException, java.lang.SecurityException { return null; }
    public android.app.usage.NetworkStats querySummary(int p0, java.lang.String p1, long p2, long p3) throws android.os.RemoteException, java.lang.SecurityException { return null; }
    @android.annotation.NonNull
    public android.app.usage.NetworkStats querySummary(android.net.NetworkTemplate p0, long p1, long p2) throws java.lang.SecurityException { return null; }
    @android.annotation.NonNull
    public android.app.usage.NetworkStats queryTaggedSummary(android.net.NetworkTemplate p0, long p1, long p2) throws java.lang.SecurityException { return null; }
    @android.annotation.NonNull
    public android.app.usage.NetworkStats queryDetailsForDevice(android.net.NetworkTemplate p0, long p1, long p2) { return null; }
    @android.annotation.NonNull
    public android.app.usage.NetworkStats queryDetailsForUid(int p0, java.lang.String p1, long p2, long p3, int p4) throws java.lang.SecurityException { return null; }
    @android.annotation.NonNull
    public android.app.usage.NetworkStats queryDetailsForUidTag(int p0, java.lang.String p1, long p2, long p3, int p4, int p5) throws java.lang.SecurityException { return null; }
    @android.annotation.NonNull
    public android.app.usage.NetworkStats queryDetailsForUidTagState(int p0, java.lang.String p1, long p2, long p3, int p4, int p5, int p6) throws java.lang.SecurityException { return null; }
    @android.annotation.NonNull
    public android.app.usage.NetworkStats queryDetailsForUidTagState(android.net.NetworkTemplate p0, long p1, long p2, int p3, int p4, int p5) throws java.lang.SecurityException { return null; }
    public android.app.usage.NetworkStats queryDetails(int p0, java.lang.String p1, long p2, long p3) throws android.os.RemoteException, java.lang.SecurityException { return null; }
    @android.annotation.NonNull
    public android.net.NetworkStats getMobileUidStats() { return null; }
    @android.annotation.NonNull
    public android.net.NetworkStats getWifiUidStats() { return null; }
    public void registerUsageCallback(android.net.NetworkTemplate p0, long p1, java.util.concurrent.Executor p2, android.app.usage.NetworkStatsManager.UsageCallback p3) {}
    public void registerUsageCallback(int p0, java.lang.String p1, long p2, android.app.usage.NetworkStatsManager.UsageCallback p3) {}
    public void registerUsageCallback(int p0, java.lang.String p1, long p2, android.app.usage.NetworkStatsManager.UsageCallback p3, android.os.Handler p4) {}
    public void unregisterUsageCallback(android.app.usage.NetworkStatsManager.UsageCallback p0) {}
    public void registerNetworkStatsProvider(java.lang.String p0, android.net.netstats.provider.NetworkStatsProvider p1) {}
    public void unregisterNetworkStatsProvider(android.net.netstats.provider.NetworkStatsProvider p0) {}
    public void notifyNetworkStatus(java.util.List<android.net.Network> p0, java.util.List<android.net.NetworkStateSnapshot> p1, java.lang.String p2, java.util.List<android.net.UnderlyingNetworkInfo> p3) {}
    public void noteUidForeground(int p0, boolean p1) {}
    public void setDefaultGlobalAlert(long p0) {}
    public void forceUpdate() {}
    public void setStatsProviderWarningAndLimitAsync(java.lang.String p0, long p1, long p2) {}
    public static int getCollapsedRatType(int p0) { return 0; }

    public static abstract class UsageCallback {
        public UsageCallback() {}
        public void onThresholdReached(android.net.NetworkTemplate p0) {}
        public abstract void onThresholdReached(int p0, java.lang.String p1);
    }
}
