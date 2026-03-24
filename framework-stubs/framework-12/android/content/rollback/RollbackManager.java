package android.content.rollback;

@android.annotation.SystemApi
public final class RollbackManager {
    private final java.lang.String mCallerPackageName = null;
    private final android.content.rollback.IRollbackManager mBinder = null;
    public static final java.lang.String PROPERTY_ROLLBACK_LIFETIME_MILLIS = "rollback_lifetime_in_millis";
    public static final java.lang.String EXTRA_STATUS = "android.content.rollback.extra.STATUS";
    public static final java.lang.String EXTRA_STATUS_MESSAGE = "android.content.rollback.extra.STATUS_MESSAGE";
    public static final int STATUS_SUCCESS = 0;
    public static final int STATUS_FAILURE = 1;
    public static final int STATUS_FAILURE_ROLLBACK_UNAVAILABLE = 2;
    public static final int STATUS_FAILURE_INSTALL = 3;
    public RollbackManager(android.content.Context p0, android.content.rollback.IRollbackManager p1) {}
    @android.annotation.RequiresPermission(anyOf={"android.permission.MANAGE_ROLLBACKS", "android.permission.TEST_MANAGE_ROLLBACKS"})
    public java.util.List<android.content.rollback.RollbackInfo> getAvailableRollbacks() { return null; }
    @android.annotation.RequiresPermission(anyOf={"android.permission.MANAGE_ROLLBACKS", "android.permission.TEST_MANAGE_ROLLBACKS"})
    public java.util.List<android.content.rollback.RollbackInfo> getRecentlyCommittedRollbacks() { return null; }
    @android.annotation.RequiresPermission(anyOf={"android.permission.MANAGE_ROLLBACKS", "android.permission.TEST_MANAGE_ROLLBACKS"})
    public void commitRollback(int p0, java.util.List<android.content.pm.VersionedPackage> p1, android.content.IntentSender p2) {}
    @android.annotation.RequiresPermission("android.permission.TEST_MANAGE_ROLLBACKS")
    public void reloadPersistedData() {}
    @android.annotation.RequiresPermission("android.permission.TEST_MANAGE_ROLLBACKS")
    public void expireRollbackForPackage(java.lang.String p0) {}
    @android.annotation.RequiresPermission("android.permission.TEST_MANAGE_ROLLBACKS")
    public void blockRollbackManager(long p0) {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Status {
    }
}
