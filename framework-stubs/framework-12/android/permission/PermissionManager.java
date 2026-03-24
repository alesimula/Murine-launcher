package android.permission;

@android.annotation.SystemApi
public final class PermissionManager {
    private static final java.lang.String LOG_TAG = null;
    public static final java.lang.String LOG_TAG_TRACE_GRANTS = "PermissionGrantTrace";
    public static final java.lang.String KILL_APP_REASON_PERMISSIONS_REVOKED = "permissions revoked";
    public static final java.lang.String KILL_APP_REASON_GIDS_CHANGED = "permission grant or revoke changed gids";
    private static final java.lang.String SYSTEM_PKG = "android";
    public static final long CANNOT_INSTALL_WITH_BAD_PERMISSION_GROUPS = 146211400L;
    private static final long EXEMPTED_INDICATOR_ROLE_UPDATE_FREQUENCY_MS = 15000L;
    private static long sLastIndicatorUpdateTime;
    private static final int[] EXEMPTED_ROLES = null;
    private static final java.lang.String[] INDICATOR_EXEMPTED_PACKAGES = null;
    public static final boolean DEBUG_TRACE_GRANTS = false;
    public static final boolean DEBUG_TRACE_PERMISSION_UPDATES = false;
    private final android.content.Context mContext = null;
    private final android.content.pm.IPackageManager mPackageManager = null;
    private final android.permission.IPermissionManager mPermissionManager = null;
    private final android.permission.LegacyPermissionManager mLegacyPermissionManager = null;
    private final android.util.ArrayMap<android.content.pm.PackageManager.OnPermissionsChangedListener, android.permission.IOnPermissionsChangeListener> mPermissionListeners = null;
    private android.permission.PermissionUsageHelper mUsageHelper;
    private java.util.List<android.permission.PermissionManager.SplitPermissionInfo> mSplitPermissionInfos;
    public static final java.lang.String CACHE_KEY_PACKAGE_INFO = "cache_key.package_info";
    private static final android.app.PropertyInvalidatedCache<android.permission.PermissionManager.PermissionQuery, java.lang.Integer> sPermissionCache = null;
    private static android.app.PropertyInvalidatedCache<android.permission.PermissionManager.PackageNamePermissionQuery, java.lang.Integer> sPackageNamePermissionCache;
    public PermissionManager(android.content.Context p0) throws android.os.ServiceManager.ServiceNotFoundException {}
    public android.content.pm.PermissionInfo getPermissionInfo(java.lang.String p0, int p1) { return null; }
    public java.util.List<android.content.pm.PermissionInfo> queryPermissionsByGroup(java.lang.String p0, int p1) { return null; }
    public boolean addPermission(android.content.pm.PermissionInfo p0, boolean p1) { return false; }
    public void removePermission(java.lang.String p0) {}
    public android.content.pm.PermissionGroupInfo getPermissionGroupInfo(java.lang.String p0, int p1) { return null; }
    public java.util.List<android.content.pm.PermissionGroupInfo> getAllPermissionGroups(int p0) { return null; }
    public boolean isPermissionRevokedByPolicy(java.lang.String p0, java.lang.String p1) { return false; }
    public static boolean shouldTraceGrant(java.lang.String p0, java.lang.String p1, int p2) { return false; }
    @android.annotation.RequiresPermission("android.permission.GRANT_RUNTIME_PERMISSIONS")
    public void grantRuntimePermission(java.lang.String p0, java.lang.String p1, android.os.UserHandle p2) {}
    @android.annotation.RequiresPermission("android.permission.REVOKE_RUNTIME_PERMISSIONS")
    public void revokeRuntimePermission(java.lang.String p0, java.lang.String p1, android.os.UserHandle p2, java.lang.String p3) {}
    @android.annotation.RequiresPermission(anyOf={"android.permission.GRANT_RUNTIME_PERMISSIONS", "android.permission.REVOKE_RUNTIME_PERMISSIONS", "android.permission.GET_RUNTIME_PERMISSIONS"})
    public int getPermissionFlags(java.lang.String p0, java.lang.String p1, android.os.UserHandle p2) { return 0; }
    @android.annotation.RequiresPermission(anyOf={"android.permission.GRANT_RUNTIME_PERMISSIONS", "android.permission.REVOKE_RUNTIME_PERMISSIONS"})
    public void updatePermissionFlags(java.lang.String p0, java.lang.String p1, int p2, int p3, android.os.UserHandle p4) {}
    @android.annotation.RequiresPermission(value="android.permission.WHITELIST_RESTRICTED_PERMISSIONS", conditional=true)
    public java.util.Set<java.lang.String> getAllowlistedRestrictedPermissions(java.lang.String p0, int p1) { return null; }
    @android.annotation.RequiresPermission(value="android.permission.WHITELIST_RESTRICTED_PERMISSIONS", conditional=true)
    public boolean addAllowlistedRestrictedPermission(java.lang.String p0, java.lang.String p1, int p2) { return false; }
    @android.annotation.RequiresPermission(value="android.permission.WHITELIST_RESTRICTED_PERMISSIONS", conditional=true)
    public boolean removeAllowlistedRestrictedPermission(java.lang.String p0, java.lang.String p1, int p2) { return false; }
    @android.annotation.RequiresPermission(value="android.permission.WHITELIST_AUTO_REVOKE_PERMISSIONS", conditional=true)
    public boolean isAutoRevokeExempted(java.lang.String p0) { return false; }
    @android.annotation.RequiresPermission(value="android.permission.WHITELIST_AUTO_REVOKE_PERMISSIONS", conditional=true)
    public boolean setAutoRevokeExempted(java.lang.String p0, boolean p1) { return false; }
    public boolean shouldShowRequestPermissionRationale(java.lang.String p0) { return false; }
    @android.annotation.RequiresPermission("android.permission.OBSERVE_GRANT_REVOKE_PERMISSIONS")
    public void addOnPermissionsChangeListener(android.content.pm.PackageManager.OnPermissionsChangedListener p0) {}
    @android.annotation.RequiresPermission("android.permission.OBSERVE_GRANT_REVOKE_PERMISSIONS")
    public void removeOnPermissionsChangeListener(android.content.pm.PackageManager.OnPermissionsChangedListener p0) {}
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission(anyOf={"android.permission.ADJUST_RUNTIME_PERMISSIONS_POLICY", "android.permission.UPGRADE_RUNTIME_PERMISSIONS"})
    public int getRuntimePermissionsVersion() { return 0; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission(anyOf={"android.permission.ADJUST_RUNTIME_PERMISSIONS_POLICY", "android.permission.UPGRADE_RUNTIME_PERMISSIONS"})
    public void setRuntimePermissionsVersion(int p0) {}
    public java.util.List<android.permission.PermissionManager.SplitPermissionInfo> getSplitPermissions() { return null; }
    @android.annotation.RequiresPermission("android.permission.GET_APP_OPS_STATS")
    public java.util.List<android.permission.PermGroupUsage> getIndicatorAppOpUsageData() { return null; }
    @android.annotation.RequiresPermission("android.permission.GET_APP_OPS_STATS")
    public java.util.List<android.permission.PermGroupUsage> getIndicatorAppOpUsageData(boolean p0) { return null; }
    public static boolean shouldShowPackageForIndicatorCached(android.content.Context p0, java.lang.String p1) { return false; }
    public static java.util.Set<java.lang.String> getIndicatorExemptedPackages(android.content.Context p0) { return null; }
    public static void updateIndicatorExemptedPackages(android.content.Context p0) {}
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.ADJUST_RUNTIME_PERMISSIONS_POLICY")
    public java.util.Set<java.lang.String> getAutoRevokeExemptionRequestedPackages() { return null; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.ADJUST_RUNTIME_PERMISSIONS_POLICY")
    public java.util.Set<java.lang.String> getAutoRevokeExemptionGrantedPackages() { return null; }
    private java.util.List<android.permission.PermissionManager.SplitPermissionInfo> splitPermissionInfoListToNonParcelableList(java.util.List<android.content.pm.permission.SplitPermissionInfoParcelable> p0) { return null; }
    public static java.util.List<android.content.pm.permission.SplitPermissionInfoParcelable> splitPermissionInfoListToParcelableList(java.util.List<android.permission.PermissionManager.SplitPermissionInfo> p0) { return null; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.MANAGE_ONE_TIME_PERMISSION_SESSIONS")
    public void startOneTimePermissionSession(java.lang.String p0, long p1, int p2, int p3) {}
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.MANAGE_ONE_TIME_PERMISSION_SESSIONS")
    public void stopOneTimePermissionSession(java.lang.String p0) {}
    @android.annotation.SystemApi
    public int checkDeviceIdentifierAccess(java.lang.String p0, java.lang.String p1, java.lang.String p2, int p3, int p4) { return 0; }
    public android.content.AttributionSource registerAttributionSource(android.content.AttributionSource p0) { return null; }
    public boolean isRegisteredAttributionSource(android.content.AttributionSource p0) { return false; }
    private static int checkPermissionUncached(java.lang.String p0, int p1, int p2) { return 0; }
    public static int checkPermission(java.lang.String p0, int p1, int p2) { return 0; }
    public static void disablePermissionCache() {}
    private static int checkPackageNamePermissionUncached(java.lang.String p0, java.lang.String p1, int p2) { return 0; }
    public static int checkPackageNamePermission(java.lang.String p0, java.lang.String p1, int p2) { return 0; }
    public static void disablePackageNamePermissionCache() {}

    private final class OnPermissionsChangeListenerDelegate extends android.permission.IOnPermissionsChangeListener.Stub implements android.os.Handler.Callback {
        private static final int MSG_PERMISSIONS_CHANGED = 1;
        private final android.content.pm.PackageManager.OnPermissionsChangedListener mListener = null;
        private final android.os.Handler mHandler = null;
        public OnPermissionsChangeListenerDelegate(android.permission.PermissionManager p0, android.content.pm.PackageManager.OnPermissionsChangedListener p1, android.os.Looper p2) { super(); }
        public void onPermissionsChanged(int p0) {}
        public boolean handleMessage(android.os.Message p0) { return false; }
    }

    private static final class PackageNamePermissionQuery {
        final java.lang.String permName = null;
        final java.lang.String pkgName = null;
        final int userId = 0;
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
