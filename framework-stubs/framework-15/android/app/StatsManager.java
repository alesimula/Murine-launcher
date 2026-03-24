package android.app;

public final class StatsManager {
    public static final java.lang.String ACTION_STATSD_STARTED = "android.app.action.STATSD_STARTED";
    public static final java.lang.String EXTRA_STATS_ACTIVE_CONFIG_KEYS = "android.app.extra.STATS_ACTIVE_CONFIG_KEYS";
    public static final java.lang.String EXTRA_STATS_BROADCAST_SUBSCRIBER_COOKIES = "android.app.extra.STATS_BROADCAST_SUBSCRIBER_COOKIES";
    public static final java.lang.String EXTRA_STATS_CONFIG_KEY = "android.app.extra.STATS_CONFIG_KEY";
    public static final java.lang.String EXTRA_STATS_CONFIG_UID = "android.app.extra.STATS_CONFIG_UID";
    public static final java.lang.String EXTRA_STATS_DIMENSIONS_VALUE = "android.app.extra.STATS_DIMENSIONS_VALUE";
    public static final java.lang.String EXTRA_STATS_RESTRICTED_METRIC_IDS = "android.app.extra.STATS_RESTRICTED_METRIC_IDS";
    public static final java.lang.String EXTRA_STATS_SUBSCRIPTION_ID = "android.app.extra.STATS_SUBSCRIPTION_ID";
    public static final java.lang.String EXTRA_STATS_SUBSCRIPTION_RULE_ID = "android.app.extra.STATS_SUBSCRIPTION_RULE_ID";
    public static final int PULL_SKIP = 1;
    public static final int PULL_SUCCESS = 0;
    StatsManager() {}
    public void addConfig(long p0, byte[] p1) throws android.app.StatsManager.StatsUnavailableException {}
    @java.lang.Deprecated
    public boolean addConfiguration(long p0, byte[] p1) { return false; }
    public void clearPullAtomCallback(int p0) {}
    @java.lang.Deprecated
    @android.annotation.Nullable
    public byte[] getData(long p0) { return null; }
    @java.lang.Deprecated
    @android.annotation.Nullable
    public byte[] getMetadata() { return null; }
    public long[] getRegisteredExperimentIds() throws android.app.StatsManager.StatsUnavailableException { return null; }
    public byte[] getReports(long p0) throws android.app.StatsManager.StatsUnavailableException { return null; }
    public byte[] getStatsMetadata() throws android.app.StatsManager.StatsUnavailableException { return null; }
    public void query(long p0, java.lang.String p1, android.app.StatsQuery p2, java.util.concurrent.Executor p3, android.os.OutcomeReceiver<android.app.StatsCursor, android.app.StatsManager.StatsQueryException> p4) throws android.app.StatsManager.StatsUnavailableException {}
    public void removeConfig(long p0) throws android.app.StatsManager.StatsUnavailableException {}
    @java.lang.Deprecated
    public boolean removeConfiguration(long p0) { return false; }
    @android.annotation.NonNull
    public long[] setActiveConfigsChangedOperation(android.app.PendingIntent p0) throws android.app.StatsManager.StatsUnavailableException { return null; }
    public void setBroadcastSubscriber(android.app.PendingIntent p0, long p1, long p2) throws android.app.StatsManager.StatsUnavailableException {}
    @java.lang.Deprecated
    public boolean setBroadcastSubscriber(long p0, long p1, android.app.PendingIntent p2) { return false; }
    @java.lang.Deprecated
    public boolean setDataFetchOperation(long p0, android.app.PendingIntent p1) { return false; }
    public void setFetchReportsOperation(android.app.PendingIntent p0, long p1) throws android.app.StatsManager.StatsUnavailableException {}
    public void setPullAtomCallback(int p0, android.app.StatsManager.PullAtomMetadata p1, java.util.concurrent.Executor p2, android.app.StatsManager.StatsPullAtomCallback p3) {}
    @android.annotation.NonNull
    public long[] setRestrictedMetricsChangedOperation(long p0, java.lang.String p1, android.app.PendingIntent p2) throws android.app.StatsManager.StatsUnavailableException { return null; }

    public static class PullAtomMetadata {
        PullAtomMetadata() {}
        @android.annotation.Nullable
        public int[] getAdditiveFields() { return null; }
        public long getCoolDownMillis() { return 0L; }
        public long getTimeoutMillis() { return 0L; }

        public static class Builder {
            public Builder() {}
            @android.annotation.NonNull
            public android.app.StatsManager.PullAtomMetadata build() { return null; }
            @android.annotation.NonNull
            public android.app.StatsManager.PullAtomMetadata.Builder setAdditiveFields(int[] p0) { return null; }
            @android.annotation.NonNull
            public android.app.StatsManager.PullAtomMetadata.Builder setCoolDownMillis(long p0) { return null; }
            @android.annotation.NonNull
            public android.app.StatsManager.PullAtomMetadata.Builder setTimeoutMillis(long p0) { return null; }
        }
    }

    public static interface StatsPullAtomCallback {
        public int onPullAtom(int p0, java.util.List<android.util.StatsEvent> p1);
    }

    public static class StatsQueryException extends android.util.AndroidException {
        public StatsQueryException(java.lang.String p0) { super(); }
        public StatsQueryException(java.lang.String p0, java.lang.Throwable p1) { super(); }
    }

    public static class StatsUnavailableException extends android.util.AndroidException {
        public StatsUnavailableException(java.lang.String p0) { super(); }
        public StatsUnavailableException(java.lang.String p0, java.lang.Throwable p1) { super(); }
    }
}
