package android.app;

@android.annotation.SystemApi
public final class StatsManager {
    private static final java.lang.String TAG = "StatsManager";
    private static final boolean DEBUG = false;
    private final android.content.Context mContext = null;
    private android.os.IStatsManager mService;
    public static final java.lang.String EXTRA_STATS_CONFIG_UID = "android.app.extra.STATS_CONFIG_UID";
    public static final java.lang.String EXTRA_STATS_CONFIG_KEY = "android.app.extra.STATS_CONFIG_KEY";
    public static final java.lang.String EXTRA_STATS_SUBSCRIPTION_ID = "android.app.extra.STATS_SUBSCRIPTION_ID";
    public static final java.lang.String EXTRA_STATS_SUBSCRIPTION_RULE_ID = "android.app.extra.STATS_SUBSCRIPTION_RULE_ID";
    public static final java.lang.String EXTRA_STATS_BROADCAST_SUBSCRIBER_COOKIES = "android.app.extra.STATS_BROADCAST_SUBSCRIBER_COOKIES";
    public static final java.lang.String EXTRA_STATS_DIMENSIONS_VALUE = "android.app.extra.STATS_DIMENSIONS_VALUE";
    public static final java.lang.String EXTRA_STATS_ACTIVE_CONFIG_KEYS = "android.app.extra.STATS_ACTIVE_CONFIG_KEYS";
    public static final java.lang.String ACTION_STATSD_STARTED = "android.app.action.STATSD_STARTED";
    public StatsManager(android.content.Context p0) {}
    public void addConfig(long p0, byte[] p1) throws android.app.StatsManager.StatsUnavailableException {}
    @java.lang.Deprecated
    public boolean addConfiguration(long p0, byte[] p1) { return false; }
    public void removeConfig(long p0) throws android.app.StatsManager.StatsUnavailableException {}
    @java.lang.Deprecated
    public boolean removeConfiguration(long p0) { return false; }
    public void setBroadcastSubscriber(android.app.PendingIntent p0, long p1, long p2) throws android.app.StatsManager.StatsUnavailableException {}
    @java.lang.Deprecated
    public boolean setBroadcastSubscriber(long p0, long p1, android.app.PendingIntent p2) { return false; }
    public void setFetchReportsOperation(android.app.PendingIntent p0, long p1) throws android.app.StatsManager.StatsUnavailableException {}
    public long[] setActiveConfigsChangedOperation(android.app.PendingIntent p0) throws android.app.StatsManager.StatsUnavailableException { return null; }
    @java.lang.Deprecated
    public boolean setDataFetchOperation(long p0, android.app.PendingIntent p1) { return false; }
    public byte[] getReports(long p0) throws android.app.StatsManager.StatsUnavailableException { return null; }
    @java.lang.Deprecated
    public byte[] getData(long p0) { return null; }
    public byte[] getStatsMetadata() throws android.app.StatsManager.StatsUnavailableException { return null; }
    @java.lang.Deprecated
    public byte[] getMetadata() { return null; }
    public long[] getRegisteredExperimentIds() throws android.app.StatsManager.StatsUnavailableException { return null; }
    public void setPullerCallback(int p0, android.os.IStatsPullerCallback p1) throws android.app.StatsManager.StatsUnavailableException {}
    private android.os.IStatsManager getIStatsManagerLocked() throws android.app.StatsManager.StatsUnavailableException { return null; }

    private class StatsdDeathRecipient implements android.os.IBinder.DeathRecipient {
        private StatsdDeathRecipient(android.app.StatsManager p0) {}
        public void binderDied() {}
    }

    public static class StatsUnavailableException extends android.util.AndroidException {
        public StatsUnavailableException(java.lang.String p0) { super(); }
        public StatsUnavailableException(java.lang.String p0, java.lang.Throwable p1) { super(); }
    }
}
