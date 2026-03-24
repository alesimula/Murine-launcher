package android.app.usage;

public abstract class UsageStatsManagerInternal {
    public UsageStatsManagerInternal() {}
    public abstract void reportEvent(android.content.ComponentName p0, int p1, int p2, int p3, android.content.ComponentName p4);
    public abstract void reportEvent(java.lang.String p0, int p1, int p2);
    public abstract void reportConfigurationChange(android.content.res.Configuration p0, int p1);
    public abstract void reportInterruptiveNotification(java.lang.String p0, java.lang.String p1, int p2);
    public abstract void reportShortcutUsage(java.lang.String p0, java.lang.String p1, int p2);
    public abstract void reportContentProviderUsage(java.lang.String p0, java.lang.String p1, int p2);
    public abstract void prepareShutdown();
    public abstract void prepareForPossibleShutdown();
    public abstract boolean isAppIdle(java.lang.String p0, int p1, int p2);
    public abstract int getAppStandbyBucket(java.lang.String p0, int p1, long p2);
    public abstract int[] getIdleUidsForUser(int p0);
    public abstract boolean isAppIdleParoleOn();
    public abstract void addAppIdleStateChangeListener(android.app.usage.UsageStatsManagerInternal.AppIdleStateChangeListener p0);
    public abstract void removeAppIdleStateChangeListener(android.app.usage.UsageStatsManagerInternal.AppIdleStateChangeListener p0);
    public abstract byte[] getBackupPayload(int p0, java.lang.String p1);
    public abstract void applyRestoredPayload(int p0, java.lang.String p1, byte[] p2);
    public abstract void onActiveAdminAdded(java.lang.String p0, int p1);
    public abstract void setActiveAdminApps(java.util.Set<java.lang.String> p0, int p1);
    public abstract void onAdminDataAvailable();
    public abstract java.util.List<android.app.usage.UsageStats> queryUsageStatsForUser(int p0, int p1, long p2, long p3, boolean p4);
    public abstract void setLastJobRunTime(java.lang.String p0, int p1, long p2);
    public abstract long getTimeSinceLastJobRun(java.lang.String p0, int p1);
    public abstract void reportAppJobState(java.lang.String p0, int p1, int p2, long p3);
    public abstract void reportSyncScheduled(java.lang.String p0, int p1, boolean p2);
    public abstract void reportExemptedSyncStart(java.lang.String p0, int p1);
    public abstract android.app.usage.UsageStatsManagerInternal.AppUsageLimitData getAppUsageLimit(java.lang.String p0, android.os.UserHandle p1);

    public static class AppUsageLimitData {
        private final long mTotalUsageLimit = 0L;
        private final long mUsageRemaining = 0L;
        public AppUsageLimitData(long p0, long p1) {}
        public long getTotalUsageLimit() { return 0L; }
        public long getUsageRemaining() { return 0L; }
    }

    public static abstract class AppIdleStateChangeListener {
        public AppIdleStateChangeListener() {}
        public abstract void onAppIdleStateChanged(java.lang.String p0, int p1, boolean p2, int p3, int p4);
        public abstract void onParoleStateChanged(boolean p0);
        public void onUserInteractionStarted(java.lang.String p0, int p1) {}
    }
}
