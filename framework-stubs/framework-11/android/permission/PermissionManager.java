package android.permission;

@android.annotation.SystemApi
public final class PermissionManager {
    private static final java.lang.String TAG = null;
    public static final java.lang.String KILL_APP_REASON_PERMISSIONS_REVOKED = "permissions revoked";
    public static final java.lang.String KILL_APP_REASON_GIDS_CHANGED = "permission grant or revoke changed gids";
    private final android.content.Context mContext = null;
    private final android.content.pm.IPackageManager mPackageManager = null;
    private final android.permission.IPermissionManager mPermissionManager = null;
    private java.util.List<android.permission.PermissionManager.SplitPermissionInfo> mSplitPermissionInfos;
    public static final java.lang.String CACHE_KEY_PACKAGE_INFO = "cache_key.package_info";
    private static final android.app.PropertyInvalidatedCache<android.permission.PermissionManager.PermissionQuery, java.lang.Integer> sPermissionCache = null;
    private static android.app.PropertyInvalidatedCache<android.permission.PermissionManager.PackageNamePermissionQuery, java.lang.Integer> sPackageNamePermissionCache;
    public PermissionManager(android.content.Context p0, android.content.pm.IPackageManager p1) throws android.os.ServiceManager.ServiceNotFoundException {}
    public PermissionManager(android.content.Context p0, android.content.pm.IPackageManager p1, android.permission.IPermissionManager p2) {}
    @android.annotation.SystemApi
    public int getRuntimePermissionsVersion() { return 0; }
    @android.annotation.SystemApi
    public void setRuntimePermissionsVersion(int p0) {}
    public java.util.List<android.permission.PermissionManager.SplitPermissionInfo> getSplitPermissions() { return null; }
    public void grantDefaultPermissionsToLuiApp(java.lang.String p0, android.os.UserHandle p1, java.util.concurrent.Executor p2, java.util.function.Consumer<java.lang.Boolean> p3) {}
    public void revokeDefaultPermissionsFromLuiApps(java.lang.String[] p0, android.os.UserHandle p1, java.util.concurrent.Executor p2, java.util.function.Consumer<java.lang.Boolean> p3) {}
    public void grantDefaultPermissionsToEnabledImsServices(java.lang.String[] p0, android.os.UserHandle p1, java.util.concurrent.Executor p2, java.util.function.Consumer<java.lang.Boolean> p3) {}
    public void grantDefaultPermissionsToEnabledTelephonyDataServices(java.lang.String[] p0, android.os.UserHandle p1, java.util.concurrent.Executor p2, java.util.function.Consumer<java.lang.Boolean> p3) {}
    public void revokeDefaultPermissionsFromDisabledTelephonyDataServices(java.lang.String[] p0, android.os.UserHandle p1, java.util.concurrent.Executor p2, java.util.function.Consumer<java.lang.Boolean> p3) {}
    public void grantDefaultPermissionsToEnabledCarrierApps(java.lang.String[] p0, android.os.UserHandle p1, java.util.concurrent.Executor p2, java.util.function.Consumer<java.lang.Boolean> p3) {}
    @android.annotation.SystemApi
    public java.util.Set<java.lang.String> getAutoRevokeExemptionRequestedPackages() { return null; }
    @android.annotation.SystemApi
    public java.util.Set<java.lang.String> getAutoRevokeExemptionGrantedPackages() { return null; }
    private java.util.List<android.permission.PermissionManager.SplitPermissionInfo> splitPermissionInfoListToNonParcelableList(java.util.List<android.content.pm.permission.SplitPermissionInfoParcelable> p0) { return null; }
    public static java.util.List<android.content.pm.permission.SplitPermissionInfoParcelable> splitPermissionInfoListToParcelableList(java.util.List<android.permission.PermissionManager.SplitPermissionInfo> p0) { return null; }
    @android.annotation.SystemApi
    public void startOneTimePermissionSession(java.lang.String p0, long p1, int p2, int p3) {}
    @android.annotation.SystemApi
    public void stopOneTimePermissionSession(java.lang.String p0) {}
    @android.annotation.SystemApi
    public int checkDeviceIdentifierAccess(java.lang.String p0, java.lang.String p1, java.lang.String p2, int p3, int p4) { return 0; }
    private static int checkPermissionUncached(java.lang.String p0, int p1, int p2) { return 0; }
    public static int checkPermission(java.lang.String p0, int p1, int p2) { return 0; }
    public static void disablePermissionCache() {}
    private static int checkPackageNamePermissionUncached(java.lang.String p0, java.lang.String p1, int p2) { return 0; }
    public static int checkPackageNamePermission(java.lang.String p0, java.lang.String p1, int p2) { return 0; }
    public static void disablePackageNamePermissionCache() {}

    private static final class PackageNamePermissionQuery {
        final java.lang.String permName = null;
        final java.lang.String pkgName = null;
        final int uid = 0;
        PackageNamePermissionQuery(java.lang.String p0, java.lang.String p1, int p2) {}
        public java.lang.String toString() { return null; }
        public int hashCode() { return 0; }
        public boolean equals(java.lang.Object p0) { return false; }
    }

    private static final class PermissionQuery {
        final java.lang.String permission = null;
        final int pid = 0;
        final int uid = 0;
        PermissionQuery(java.lang.String p0, int p1, int p2) {}
        public java.lang.String toString() { return null; }
        public int hashCode() { return 0; }
        public boolean equals(java.lang.Object p0) { return false; }
    }

    public static final class SplitPermissionInfo {
        private final android.content.pm.permission.SplitPermissionInfoParcelable mSplitPermissionInfoParcelable = null;
        public boolean equals(java.lang.Object p0) { return false; }
        public int hashCode() { return 0; }
        public java.lang.String getSplitPermission() { return null; }
        public java.util.List<java.lang.String> getNewPermissions() { return null; }
        public int getTargetSdk() { return 0; }
        public SplitPermissionInfo(java.lang.String p0, java.util.List<java.lang.String> p1, int p2) {}
        private SplitPermissionInfo(android.content.pm.permission.SplitPermissionInfoParcelable p0) {}
    }
}
