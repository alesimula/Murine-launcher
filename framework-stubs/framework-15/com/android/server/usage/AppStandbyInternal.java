package com.android.server.usage;

public interface AppStandbyInternal {
    public static com.android.server.usage.AppStandbyInternal newAppStandbyController(java.lang.ClassLoader p0, android.content.Context p1) { return null; }
    public void onBootPhase(int p0);
    public void postCheckIdleStates(int p0);
    public void postOneTimeCheckIdleStates();
    public void setLastJobRunTime(java.lang.String p0, int p1, long p2);
    public long getTimeSinceLastJobRun(java.lang.String p0, int p1);
    public void setEstimatedLaunchTime(java.lang.String p0, int p1, long p2);
    public long getEstimatedLaunchTime(java.lang.String p0, int p1);
    public long getTimeSinceLastUsedByUser(java.lang.String p0, int p1);
    public void onUserRemoved(int p0);
    public void addListener(com.android.server.usage.AppStandbyInternal.AppIdleStateChangeListener p0);
    public void removeListener(com.android.server.usage.AppStandbyInternal.AppIdleStateChangeListener p0);
    public int getAppId(java.lang.String p0);
    public boolean isAppIdleFiltered(java.lang.String p0, int p1, long p2, boolean p3);
    public boolean isAppIdleFiltered(java.lang.String p0, int p1, int p2, long p3);
    public boolean isInParole();
    public int[] getIdleUidsForUser(int p0);
    public void setAppIdleAsync(java.lang.String p0, boolean p1, int p2);
    public int getAppStandbyBucket(java.lang.String p0, int p1, long p2, boolean p3);
    public java.util.List<android.app.usage.AppStandbyInfo> getAppStandbyBuckets(int p0);
    public void setAppStandbyBucket(java.lang.String p0, int p1, int p2, int p3, int p4);
    public void setAppStandbyBuckets(java.util.List<android.app.usage.AppStandbyInfo> p0, int p1, int p2, int p3);
    public int getAppMinStandbyBucket(java.lang.String p0, int p1, int p2, boolean p3);
    public int getAppStandbyBucketReason(java.lang.String p0, int p1, long p2);
    public void restoreAppsToRare(java.util.Set<java.lang.String> p0, int p1);
    public void restrictApp(java.lang.String p0, int p1, int p2);
    public void restrictApp(java.lang.String p0, int p1, int p2, int p3);
    public void maybeUnrestrictApp(java.lang.String p0, int p1, int p2, int p3, int p4, int p5);
    public void addActiveDeviceAdmin(java.lang.String p0, int p1);
    public void setActiveAdminApps(java.util.Set<java.lang.String> p0, int p1);
    public void setAdminProtectedPackages(java.util.Set<java.lang.String> p0, int p1);
    public boolean isActiveDeviceAdmin(java.lang.String p0, int p1);
    public void onAdminDataAvailable();
    public void clearCarrierPrivilegedApps();
    public void flushToDisk();
    public void initializeDefaultsForSystemApps(int p0);
    public void postReportContentProviderUsage(java.lang.String p0, java.lang.String p1, int p2);
    public void postReportSyncScheduled(java.lang.String p0, int p1, boolean p2);
    public void postReportExemptedSyncStart(java.lang.String p0, int p1);
    public void dumpUsers(android.util.IndentingPrintWriter p0, int[] p1, java.util.List<java.lang.String> p2);
    public void dumpState(java.lang.String[] p0, java.io.PrintWriter p1);
    public boolean isAppIdleEnabled();
    public long getBroadcastResponseWindowDurationMs();
    public int getBroadcastResponseFgThresholdState();
    public long getBroadcastSessionsDurationMs();
    public long getBroadcastSessionsWithResponseDurationMs();
    public boolean shouldNoteResponseEventForAllBroadcastSessions();
    @android.annotation.NonNull
    public java.util.List<java.lang.String> getBroadcastResponseExemptedRoles();
    @android.annotation.NonNull
    public java.util.List<java.lang.String> getBroadcastResponseExemptedPermissions();
    @android.annotation.Nullable
    public java.lang.String getAppStandbyConstant(java.lang.String p0);
    public void clearLastUsedTimestampsForTest(java.lang.String p0, int p1);

    public static abstract class AppIdleStateChangeListener {
        public AppIdleStateChangeListener() {}
        public abstract void onAppIdleStateChanged(java.lang.String p0, int p1, boolean p2, int p3, int p4);
        public void onParoleStateChanged(boolean p0) {}
        public void onUserInteractionStarted(java.lang.String p0, int p1) {}
        public void triggerTemporaryQuotaBump(java.lang.String p0, int p1) {}
    }
}
