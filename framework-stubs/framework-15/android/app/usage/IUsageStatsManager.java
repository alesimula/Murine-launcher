package android.app.usage;

public interface IUsageStatsManager extends android.os.IInterface {
    public android.content.pm.ParceledListSlice queryUsageStats(int p0, long p1, long p2, java.lang.String p3, int p4) throws android.os.RemoteException;
    public android.content.pm.ParceledListSlice queryConfigurationStats(int p0, long p1, long p2, java.lang.String p3) throws android.os.RemoteException;
    public android.content.pm.ParceledListSlice queryEventStats(int p0, long p1, long p2, java.lang.String p3) throws android.os.RemoteException;
    public android.app.usage.UsageEvents queryEvents(long p0, long p1, java.lang.String p2) throws android.os.RemoteException;
    public android.app.usage.UsageEvents queryEventsForPackage(long p0, long p1, java.lang.String p2) throws android.os.RemoteException;
    public android.app.usage.UsageEvents queryEventsForUser(long p0, long p1, int p2, java.lang.String p3) throws android.os.RemoteException;
    public android.app.usage.UsageEvents queryEventsForPackageForUser(long p0, long p1, int p2, java.lang.String p3, java.lang.String p4) throws android.os.RemoteException;
    @android.annotation.RequiresPermission("android.permission.PACKAGE_USAGE_STATS")
    public android.app.usage.UsageEvents queryEventsWithFilter(android.app.usage.UsageEventsQuery p0, java.lang.String p1) throws android.os.RemoteException;
    public void setAppInactive(java.lang.String p0, boolean p1, int p2) throws android.os.RemoteException;
    public boolean isAppStandbyEnabled() throws android.os.RemoteException;
    public boolean isAppInactive(java.lang.String p0, int p1, java.lang.String p2) throws android.os.RemoteException;
    public void onCarrierPrivilegedAppsChanged() throws android.os.RemoteException;
    public void reportChooserSelection(java.lang.String p0, int p1, java.lang.String p2, java.lang.String[] p3, java.lang.String p4) throws android.os.RemoteException;
    public int getAppStandbyBucket(java.lang.String p0, java.lang.String p1, int p2) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.CHANGE_APP_IDLE_STATE")
    public void setAppStandbyBucket(java.lang.String p0, int p1, int p2) throws android.os.RemoteException;
    public android.content.pm.ParceledListSlice getAppStandbyBuckets(java.lang.String p0, int p1) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.CHANGE_APP_IDLE_STATE")
    public void setAppStandbyBuckets(android.content.pm.ParceledListSlice p0, int p1) throws android.os.RemoteException;
    public int getAppMinStandbyBucket(java.lang.String p0, java.lang.String p1, int p2) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.CHANGE_APP_LAUNCH_TIME_ESTIMATE")
    public void setEstimatedLaunchTime(java.lang.String p0, long p1, int p2) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.CHANGE_APP_LAUNCH_TIME_ESTIMATE")
    public void setEstimatedLaunchTimes(android.content.pm.ParceledListSlice p0, int p1) throws android.os.RemoteException;
    public void registerAppUsageObserver(int p0, java.lang.String[] p1, long p2, android.app.PendingIntent p3, java.lang.String p4) throws android.os.RemoteException;
    public void unregisterAppUsageObserver(int p0, java.lang.String p1) throws android.os.RemoteException;
    public void registerUsageSessionObserver(int p0, java.lang.String[] p1, long p2, long p3, android.app.PendingIntent p4, android.app.PendingIntent p5, java.lang.String p6) throws android.os.RemoteException;
    public void unregisterUsageSessionObserver(int p0, java.lang.String p1) throws android.os.RemoteException;
    public void registerAppUsageLimitObserver(int p0, java.lang.String[] p1, long p2, long p3, android.app.PendingIntent p4, java.lang.String p5) throws android.os.RemoteException;
    public void unregisterAppUsageLimitObserver(int p0, java.lang.String p1) throws android.os.RemoteException;
    public void reportUsageStart(android.os.IBinder p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException;
    public void reportPastUsageStart(android.os.IBinder p0, java.lang.String p1, long p2, java.lang.String p3) throws android.os.RemoteException;
    public void reportUsageStop(android.os.IBinder p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException;
    public void reportUserInteraction(java.lang.String p0, int p1) throws android.os.RemoteException;
    @android.annotation.RequiresPermission("android.permission.REPORT_USAGE_STATS")
    public void reportUserInteractionWithBundle(java.lang.String p0, int p1, android.os.PersistableBundle p2) throws android.os.RemoteException;
    public int getUsageSource() throws android.os.RemoteException;
    public void forceUsageSourceSettingRead() throws android.os.RemoteException;
    public long getLastTimeAnyComponentUsed(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException;
    @android.annotation.RequiresPermission("android.permission.ACCESS_BROADCAST_RESPONSE_STATS")
    public android.app.usage.BroadcastResponseStatsList queryBroadcastResponseStats(java.lang.String p0, long p1, java.lang.String p2, int p3) throws android.os.RemoteException;
    @android.annotation.RequiresPermission("android.permission.ACCESS_BROADCAST_RESPONSE_STATS")
    public void clearBroadcastResponseStats(java.lang.String p0, long p1, java.lang.String p2, int p3) throws android.os.RemoteException;
    @android.annotation.RequiresPermission("android.permission.ACCESS_BROADCAST_RESPONSE_STATS")
    public void clearBroadcastEvents(java.lang.String p0, int p1) throws android.os.RemoteException;
    @android.annotation.RequiresPermission("android.permission.DUMP")
    public boolean isPackageExemptedFromBroadcastResponseStats(java.lang.String p0, int p1) throws android.os.RemoteException;
    @android.annotation.RequiresPermission("android.permission.READ_DEVICE_CONFIG")
    public java.lang.String getAppStandbyConstant(java.lang.String p0) throws android.os.RemoteException;

    public static class Default implements android.app.usage.IUsageStatsManager {
        public Default() {}
        public android.content.pm.ParceledListSlice queryUsageStats(int p0, long p1, long p2, java.lang.String p3, int p4) throws android.os.RemoteException { return null; }
        public android.content.pm.ParceledListSlice queryConfigurationStats(int p0, long p1, long p2, java.lang.String p3) throws android.os.RemoteException { return null; }
        public android.content.pm.ParceledListSlice queryEventStats(int p0, long p1, long p2, java.lang.String p3) throws android.os.RemoteException { return null; }
        public android.app.usage.UsageEvents queryEvents(long p0, long p1, java.lang.String p2) throws android.os.RemoteException { return null; }
        public android.app.usage.UsageEvents queryEventsForPackage(long p0, long p1, java.lang.String p2) throws android.os.RemoteException { return null; }
        public android.app.usage.UsageEvents queryEventsForUser(long p0, long p1, int p2, java.lang.String p3) throws android.os.RemoteException { return null; }
        public android.app.usage.UsageEvents queryEventsForPackageForUser(long p0, long p1, int p2, java.lang.String p3, java.lang.String p4) throws android.os.RemoteException { return null; }
        public android.app.usage.UsageEvents queryEventsWithFilter(android.app.usage.UsageEventsQuery p0, java.lang.String p1) throws android.os.RemoteException { return null; }
        public void setAppInactive(java.lang.String p0, boolean p1, int p2) throws android.os.RemoteException {}
        public boolean isAppStandbyEnabled() throws android.os.RemoteException { return false; }
        public boolean isAppInactive(java.lang.String p0, int p1, java.lang.String p2) throws android.os.RemoteException { return false; }
        public void onCarrierPrivilegedAppsChanged() throws android.os.RemoteException {}
        public void reportChooserSelection(java.lang.String p0, int p1, java.lang.String p2, java.lang.String[] p3, java.lang.String p4) throws android.os.RemoteException {}
        public int getAppStandbyBucket(java.lang.String p0, java.lang.String p1, int p2) throws android.os.RemoteException { return 0; }
        public void setAppStandbyBucket(java.lang.String p0, int p1, int p2) throws android.os.RemoteException {}
        public android.content.pm.ParceledListSlice getAppStandbyBuckets(java.lang.String p0, int p1) throws android.os.RemoteException { return null; }
        public void setAppStandbyBuckets(android.content.pm.ParceledListSlice p0, int p1) throws android.os.RemoteException {}
        public int getAppMinStandbyBucket(java.lang.String p0, java.lang.String p1, int p2) throws android.os.RemoteException { return 0; }
        public void setEstimatedLaunchTime(java.lang.String p0, long p1, int p2) throws android.os.RemoteException {}
        public void setEstimatedLaunchTimes(android.content.pm.ParceledListSlice p0, int p1) throws android.os.RemoteException {}
        public void registerAppUsageObserver(int p0, java.lang.String[] p1, long p2, android.app.PendingIntent p3, java.lang.String p4) throws android.os.RemoteException {}
        public void unregisterAppUsageObserver(int p0, java.lang.String p1) throws android.os.RemoteException {}
        public void registerUsageSessionObserver(int p0, java.lang.String[] p1, long p2, long p3, android.app.PendingIntent p4, android.app.PendingIntent p5, java.lang.String p6) throws android.os.RemoteException {}
        public void unregisterUsageSessionObserver(int p0, java.lang.String p1) throws android.os.RemoteException {}
        public void registerAppUsageLimitObserver(int p0, java.lang.String[] p1, long p2, long p3, android.app.PendingIntent p4, java.lang.String p5) throws android.os.RemoteException {}
        public void unregisterAppUsageLimitObserver(int p0, java.lang.String p1) throws android.os.RemoteException {}
        public void reportUsageStart(android.os.IBinder p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException {}
        public void reportPastUsageStart(android.os.IBinder p0, java.lang.String p1, long p2, java.lang.String p3) throws android.os.RemoteException {}
        public void reportUsageStop(android.os.IBinder p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException {}
        public void reportUserInteraction(java.lang.String p0, int p1) throws android.os.RemoteException {}
        public void reportUserInteractionWithBundle(java.lang.String p0, int p1, android.os.PersistableBundle p2) throws android.os.RemoteException {}
        public int getUsageSource() throws android.os.RemoteException { return 0; }
        public void forceUsageSourceSettingRead() throws android.os.RemoteException {}
        public long getLastTimeAnyComponentUsed(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException { return 0L; }
        public android.app.usage.BroadcastResponseStatsList queryBroadcastResponseStats(java.lang.String p0, long p1, java.lang.String p2, int p3) throws android.os.RemoteException { return null; }
        public void clearBroadcastResponseStats(java.lang.String p0, long p1, java.lang.String p2, int p3) throws android.os.RemoteException {}
        public void clearBroadcastEvents(java.lang.String p0, int p1) throws android.os.RemoteException {}
        public boolean isPackageExemptedFromBroadcastResponseStats(java.lang.String p0, int p1) throws android.os.RemoteException { return false; }
        public java.lang.String getAppStandbyConstant(java.lang.String p0) throws android.os.RemoteException { return null; }
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.app.usage.IUsageStatsManager {
        public static final java.lang.String DESCRIPTOR = "android.app.usage.IUsageStatsManager";
        static final int TRANSACTION_queryUsageStats = 1;
        static final int TRANSACTION_queryConfigurationStats = 2;
        static final int TRANSACTION_queryEventStats = 3;
        static final int TRANSACTION_queryEvents = 4;
        static final int TRANSACTION_queryEventsForPackage = 5;
        static final int TRANSACTION_queryEventsForUser = 6;
        static final int TRANSACTION_queryEventsForPackageForUser = 7;
        static final int TRANSACTION_queryEventsWithFilter = 8;
        static final int TRANSACTION_setAppInactive = 9;
        static final int TRANSACTION_isAppStandbyEnabled = 10;
        static final int TRANSACTION_isAppInactive = 11;
        static final int TRANSACTION_onCarrierPrivilegedAppsChanged = 12;
        static final int TRANSACTION_reportChooserSelection = 13;
        static final int TRANSACTION_getAppStandbyBucket = 14;
        static final int TRANSACTION_setAppStandbyBucket = 15;
        static final int TRANSACTION_getAppStandbyBuckets = 16;
        static final int TRANSACTION_setAppStandbyBuckets = 17;
        static final int TRANSACTION_getAppMinStandbyBucket = 18;
        static final int TRANSACTION_setEstimatedLaunchTime = 19;
        static final int TRANSACTION_setEstimatedLaunchTimes = 20;
        static final int TRANSACTION_registerAppUsageObserver = 21;
        static final int TRANSACTION_unregisterAppUsageObserver = 22;
        static final int TRANSACTION_registerUsageSessionObserver = 23;
        static final int TRANSACTION_unregisterUsageSessionObserver = 24;
        static final int TRANSACTION_registerAppUsageLimitObserver = 25;
        static final int TRANSACTION_unregisterAppUsageLimitObserver = 26;
        static final int TRANSACTION_reportUsageStart = 27;
        static final int TRANSACTION_reportPastUsageStart = 28;
        static final int TRANSACTION_reportUsageStop = 29;
        static final int TRANSACTION_reportUserInteraction = 30;
        static final int TRANSACTION_reportUserInteractionWithBundle = 31;
        static final int TRANSACTION_getUsageSource = 32;
        static final int TRANSACTION_forceUsageSourceSettingRead = 33;
        static final int TRANSACTION_getLastTimeAnyComponentUsed = 34;
        static final int TRANSACTION_queryBroadcastResponseStats = 35;
        static final int TRANSACTION_clearBroadcastResponseStats = 36;
        static final int TRANSACTION_clearBroadcastEvents = 37;
        static final int TRANSACTION_isPackageExemptedFromBroadcastResponseStats = 38;
        static final int TRANSACTION_getAppStandbyConstant = 39;
        public Stub(android.os.PermissionEnforcer p0) { super(); }
        @java.lang.Deprecated
        public Stub() { super(); }
        public static android.app.usage.IUsageStatsManager asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        protected void setAppStandbyBucket_enforcePermission() throws java.lang.SecurityException {}
        protected void setAppStandbyBuckets_enforcePermission() throws java.lang.SecurityException {}
        protected void setEstimatedLaunchTime_enforcePermission() throws java.lang.SecurityException {}
        protected void setEstimatedLaunchTimes_enforcePermission() throws java.lang.SecurityException {}
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.app.usage.IUsageStatsManager {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public android.content.pm.ParceledListSlice queryUsageStats(int p0, long p1, long p2, java.lang.String p3, int p4) throws android.os.RemoteException { return null; }
            public android.content.pm.ParceledListSlice queryConfigurationStats(int p0, long p1, long p2, java.lang.String p3) throws android.os.RemoteException { return null; }
            public android.content.pm.ParceledListSlice queryEventStats(int p0, long p1, long p2, java.lang.String p3) throws android.os.RemoteException { return null; }
            public android.app.usage.UsageEvents queryEvents(long p0, long p1, java.lang.String p2) throws android.os.RemoteException { return null; }
            public android.app.usage.UsageEvents queryEventsForPackage(long p0, long p1, java.lang.String p2) throws android.os.RemoteException { return null; }
            public android.app.usage.UsageEvents queryEventsForUser(long p0, long p1, int p2, java.lang.String p3) throws android.os.RemoteException { return null; }
            public android.app.usage.UsageEvents queryEventsForPackageForUser(long p0, long p1, int p2, java.lang.String p3, java.lang.String p4) throws android.os.RemoteException { return null; }
            public android.app.usage.UsageEvents queryEventsWithFilter(android.app.usage.UsageEventsQuery p0, java.lang.String p1) throws android.os.RemoteException { return null; }
            public void setAppInactive(java.lang.String p0, boolean p1, int p2) throws android.os.RemoteException {}
            public boolean isAppStandbyEnabled() throws android.os.RemoteException { return false; }
            public boolean isAppInactive(java.lang.String p0, int p1, java.lang.String p2) throws android.os.RemoteException { return false; }
            public void onCarrierPrivilegedAppsChanged() throws android.os.RemoteException {}
            public void reportChooserSelection(java.lang.String p0, int p1, java.lang.String p2, java.lang.String[] p3, java.lang.String p4) throws android.os.RemoteException {}
            public int getAppStandbyBucket(java.lang.String p0, java.lang.String p1, int p2) throws android.os.RemoteException { return 0; }
            public void setAppStandbyBucket(java.lang.String p0, int p1, int p2) throws android.os.RemoteException {}
            public android.content.pm.ParceledListSlice getAppStandbyBuckets(java.lang.String p0, int p1) throws android.os.RemoteException { return null; }
            public void setAppStandbyBuckets(android.content.pm.ParceledListSlice p0, int p1) throws android.os.RemoteException {}
            public int getAppMinStandbyBucket(java.lang.String p0, java.lang.String p1, int p2) throws android.os.RemoteException { return 0; }
            public void setEstimatedLaunchTime(java.lang.String p0, long p1, int p2) throws android.os.RemoteException {}
            public void setEstimatedLaunchTimes(android.content.pm.ParceledListSlice p0, int p1) throws android.os.RemoteException {}
            public void registerAppUsageObserver(int p0, java.lang.String[] p1, long p2, android.app.PendingIntent p3, java.lang.String p4) throws android.os.RemoteException {}
            public void unregisterAppUsageObserver(int p0, java.lang.String p1) throws android.os.RemoteException {}
            public void registerUsageSessionObserver(int p0, java.lang.String[] p1, long p2, long p3, android.app.PendingIntent p4, android.app.PendingIntent p5, java.lang.String p6) throws android.os.RemoteException {}
            public void unregisterUsageSessionObserver(int p0, java.lang.String p1) throws android.os.RemoteException {}
            public void registerAppUsageLimitObserver(int p0, java.lang.String[] p1, long p2, long p3, android.app.PendingIntent p4, java.lang.String p5) throws android.os.RemoteException {}
            public void unregisterAppUsageLimitObserver(int p0, java.lang.String p1) throws android.os.RemoteException {}
            public void reportUsageStart(android.os.IBinder p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException {}
            public void reportPastUsageStart(android.os.IBinder p0, java.lang.String p1, long p2, java.lang.String p3) throws android.os.RemoteException {}
            public void reportUsageStop(android.os.IBinder p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException {}
            public void reportUserInteraction(java.lang.String p0, int p1) throws android.os.RemoteException {}
            public void reportUserInteractionWithBundle(java.lang.String p0, int p1, android.os.PersistableBundle p2) throws android.os.RemoteException {}
            public int getUsageSource() throws android.os.RemoteException { return 0; }
            public void forceUsageSourceSettingRead() throws android.os.RemoteException {}
            public long getLastTimeAnyComponentUsed(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException { return 0L; }
            public android.app.usage.BroadcastResponseStatsList queryBroadcastResponseStats(java.lang.String p0, long p1, java.lang.String p2, int p3) throws android.os.RemoteException { return null; }
            public void clearBroadcastResponseStats(java.lang.String p0, long p1, java.lang.String p2, int p3) throws android.os.RemoteException {}
            public void clearBroadcastEvents(java.lang.String p0, int p1) throws android.os.RemoteException {}
            public boolean isPackageExemptedFromBroadcastResponseStats(java.lang.String p0, int p1) throws android.os.RemoteException { return false; }
            public java.lang.String getAppStandbyConstant(java.lang.String p0) throws android.os.RemoteException { return null; }
        }
    }
}
