package com.android.server.usage;

public interface AppStandbyInternal {
    public static com.android.server.usage.AppStandbyInternal newAppStandbyController(java.lang.ClassLoader p0, android.content.Context p1, android.os.Looper p2) { return null; }
    public void onBootPhase(int p0);
    public void postCheckIdleStates(int p0);
    public void postOneTimeCheckIdleStates();
    public void reportEvent(android.app.usage.UsageEvents.Event p0, int p1);
    public void setLastJobRunTime(java.lang.String p0, int p1, long p2);
    public long getTimeSinceLastJobRun(java.lang.String p0, int p1);
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
    public void restrictApp(java.lang.String p0, int p1, int p2);
    public void addActiveDeviceAdmin(java.lang.String p0, int p1);
    public void setActiveAdminApps(java.util.Set<java.lang.String> p0, int p1);
    public void onAdminDataAvailable();
    public void clearCarrierPrivilegedApps();
    public void flushToDisk();
    public void initializeDefaultsForSystemApps(int p0);
    public void postReportContentProviderUsage(java.lang.String p0, java.lang.String p1, int p2);
    public void postReportSyncScheduled(java.lang.String p0, int p1, boolean p2);
    public void postReportExemptedSyncStart(java.lang.String p0, int p1);
    public void dumpUsers(com.android.internal.util.IndentingPrintWriter p0, int[] p1, java.util.List<java.lang.String> p2);
    public void dumpState(java.lang.String[] p0, java.io.PrintWriter p1);
    public boolean isAppIdleEnabled();

    public static abstract class AppIdleStateChangeListener {
        public AppIdleStateChangeListener() {}
        public abstract void onAppIdleStateChanged(java.lang.String p0, int p1, boolean p2, int p3, int p4);
        public void onParoleStateChanged(boolean p0) {}
        public void onUserInteractionStarted(java.lang.String p0, int p1) {}
    }
}
