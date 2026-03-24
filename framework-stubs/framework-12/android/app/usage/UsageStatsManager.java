package android.app.usage;

public final class UsageStatsManager {
    public static final int INTERVAL_DAILY = 0;
    public static final int INTERVAL_WEEKLY = 1;
    public static final int INTERVAL_MONTHLY = 2;
    public static final int INTERVAL_YEARLY = 3;
    public static final int INTERVAL_BEST = 4;
    public static final int INTERVAL_COUNT = 4;
    @android.annotation.SystemApi
    public static final int STANDBY_BUCKET_EXEMPTED = 5;
    public static final int STANDBY_BUCKET_ACTIVE = 10;
    public static final int STANDBY_BUCKET_WORKING_SET = 20;
    public static final int STANDBY_BUCKET_FREQUENT = 30;
    public static final int STANDBY_BUCKET_RARE = 40;
    public static final int STANDBY_BUCKET_RESTRICTED = 45;
    @android.annotation.SystemApi
    public static final int STANDBY_BUCKET_NEVER = 50;
    public static final int REASON_MAIN_MASK = 65280;
    public static final int REASON_MAIN_DEFAULT = 256;
    public static final int REASON_MAIN_TIMEOUT = 512;
    public static final int REASON_MAIN_USAGE = 768;
    public static final int REASON_MAIN_FORCED_BY_USER = 1024;
    public static final int REASON_MAIN_PREDICTED = 1280;
    public static final int REASON_MAIN_FORCED_BY_SYSTEM = 1536;
    public static final int REASON_SUB_MASK = 255;
    public static final int REASON_SUB_DEFAULT_UNDEFINED = 0;
    public static final int REASON_SUB_DEFAULT_APP_UPDATE = 1;
    public static final int REASON_SUB_USAGE_SYSTEM_INTERACTION = 1;
    public static final int REASON_SUB_USAGE_NOTIFICATION_SEEN = 2;
    public static final int REASON_SUB_USAGE_USER_INTERACTION = 3;
    public static final int REASON_SUB_USAGE_MOVE_TO_FOREGROUND = 4;
    public static final int REASON_SUB_USAGE_MOVE_TO_BACKGROUND = 5;
    public static final int REASON_SUB_USAGE_SYSTEM_UPDATE = 6;
    public static final int REASON_SUB_USAGE_ACTIVE_TIMEOUT = 7;
    public static final int REASON_SUB_USAGE_SYNC_ADAPTER = 8;
    public static final int REASON_SUB_USAGE_SLICE_PINNED = 9;
    public static final int REASON_SUB_USAGE_SLICE_PINNED_PRIV = 10;
    public static final int REASON_SUB_USAGE_EXEMPTED_SYNC_SCHEDULED_NON_DOZE = 11;
    public static final int REASON_SUB_USAGE_EXEMPTED_SYNC_SCHEDULED_DOZE = 12;
    public static final int REASON_SUB_USAGE_EXEMPTED_SYNC_START = 13;
    public static final int REASON_SUB_USAGE_UNEXEMPTED_SYNC_SCHEDULED = 14;
    public static final int REASON_SUB_USAGE_FOREGROUND_SERVICE_START = 15;
    public static final int REASON_SUB_PREDICTED_RESTORED = 1;
    public static final int REASON_SUB_FORCED_SYSTEM_FLAG_UNDEFINED = 0;
    public static final int REASON_SUB_FORCED_SYSTEM_FLAG_BACKGROUND_RESOURCE_USAGE = 1;
    public static final int REASON_SUB_FORCED_SYSTEM_FLAG_ABUSE = 2;
    public static final int REASON_SUB_FORCED_SYSTEM_FLAG_BUGGY = 4;
    @android.annotation.SystemApi
    public static final java.lang.String EXTRA_OBSERVER_ID = "android.app.usage.extra.OBSERVER_ID";
    @android.annotation.SystemApi
    public static final java.lang.String EXTRA_TIME_LIMIT = "android.app.usage.extra.TIME_LIMIT";
    @android.annotation.SystemApi
    public static final java.lang.String EXTRA_TIME_USED = "android.app.usage.extra.TIME_USED";
    @android.annotation.SystemApi
    public static final int USAGE_SOURCE_TASK_ROOT_ACTIVITY = 1;
    @android.annotation.SystemApi
    public static final int USAGE_SOURCE_CURRENT_ACTIVITY = 2;
    private static final android.app.usage.UsageEvents sEmptyResults = null;
    private final android.content.Context mContext = null;
    private final android.app.usage.IUsageStatsManager mService = null;
    public UsageStatsManager(android.content.Context p0, android.app.usage.IUsageStatsManager p1) {}
    public java.util.List<android.app.usage.UsageStats> queryUsageStats(int p0, long p1, long p2) { return null; }
    public java.util.List<android.app.usage.ConfigurationStats> queryConfigurations(int p0, long p1, long p2) { return null; }
    public java.util.List<android.app.usage.EventStats> queryEventStats(int p0, long p1, long p2) { return null; }
    public android.app.usage.UsageEvents queryEvents(long p0, long p1) { return null; }
    public android.app.usage.UsageEvents queryEventsForSelf(long p0, long p1) { return null; }
    public java.util.Map<java.lang.String, android.app.usage.UsageStats> queryAndAggregateUsageStats(long p0, long p1) { return null; }
    public boolean isAppInactive(java.lang.String p0) { return false; }
    public void setAppInactive(java.lang.String p0, boolean p1) {}
    public int getAppStandbyBucket() { return 0; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.PACKAGE_USAGE_STATS")
    public int getAppStandbyBucket(java.lang.String p0) { return 0; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.CHANGE_APP_IDLE_STATE")
    public void setAppStandbyBucket(java.lang.String p0, int p1) {}
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.PACKAGE_USAGE_STATS")
    public java.util.Map<java.lang.String, java.lang.Integer> getAppStandbyBuckets() { return null; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.CHANGE_APP_IDLE_STATE")
    public void setAppStandbyBuckets(java.util.Map<java.lang.String, java.lang.Integer> p0) {}
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.OBSERVE_APP_USAGE")
    public void registerAppUsageObserver(int p0, java.lang.String[] p1, long p2, java.util.concurrent.TimeUnit p3, android.app.PendingIntent p4) {}
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.OBSERVE_APP_USAGE")
    public void unregisterAppUsageObserver(int p0) {}
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.OBSERVE_APP_USAGE")
    public void registerUsageSessionObserver(int p0, java.lang.String[] p1, java.time.Duration p2, java.time.Duration p3, android.app.PendingIntent p4, android.app.PendingIntent p5) {}
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.OBSERVE_APP_USAGE")
    public void unregisterUsageSessionObserver(int p0) {}
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission(allOf={"android.permission.SUSPEND_APPS", "android.permission.OBSERVE_APP_USAGE"})
    public void registerAppUsageLimitObserver(int p0, java.lang.String[] p1, java.time.Duration p2, java.time.Duration p3, android.app.PendingIntent p4) {}
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission(allOf={"android.permission.SUSPEND_APPS", "android.permission.OBSERVE_APP_USAGE"})
    public void unregisterAppUsageLimitObserver(int p0) {}
    public void reportUserInteraction(java.lang.String p0, int p1) {}
    @android.annotation.SystemApi
    public void reportUsageStart(android.app.Activity p0, java.lang.String p1) {}
    @android.annotation.SystemApi
    public void reportUsageStart(android.app.Activity p0, java.lang.String p1, long p2) {}
    @android.annotation.SystemApi
    public void reportUsageStop(android.app.Activity p0, java.lang.String p1) {}
    @android.annotation.SystemApi
    public int getUsageSource() { return 0; }
    public void forceUsageSourceSettingRead() {}
    public static java.lang.String reasonToString(int p0) { return null; }
    public static java.lang.String usageSourceToString(int p0) { return null; }
    @android.annotation.SystemApi
    @java.lang.Deprecated
    @android.annotation.RequiresPermission("android.permission.CHANGE_DEVICE_IDLE_TEMP_WHITELIST")
    public void whitelistAppTemporarily(java.lang.String p0, long p1, android.os.UserHandle p2) {}
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.BIND_CARRIER_SERVICES")
    public void onCarrierPrivilegedAppsChanged() {}
    public void reportChooserSelection(java.lang.String p0, int p1, java.lang.String p2, java.lang.String[] p3, java.lang.String p4) {}
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission(allOf={"android.permission.INTERACT_ACROSS_USERS", "android.permission.PACKAGE_USAGE_STATS"})
    public long getLastTimeAnyComponentUsed(java.lang.String p0) { return 0L; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface StandbyBuckets {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface SystemForcedReasons {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface UsageSource {
    }
}
