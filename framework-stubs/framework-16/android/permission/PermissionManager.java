package android.permission;

@android.annotation.SystemApi
public final class PermissionManager {
    public static final int PERMISSION_GRANTED = 0;
    public static final int PERMISSION_SOFT_DENIED = 1;
    public static final int PERMISSION_HARD_DENIED = 2;
    public static final int EXPLICIT_SET_FLAGS = 32823;
    @android.annotation.RequiresPermission("android.permission.START_REVIEW_PERMISSION_DECISIONS")
    public static final java.lang.String ACTION_REVIEW_PERMISSION_DECISIONS = "android.permission.action.REVIEW_PERMISSION_DECISIONS";
    public static final java.lang.String LOG_TAG_TRACE_GRANTS = "PermissionGrantTrace";
    public static final java.lang.String KILL_APP_REASON_PERMISSIONS_REVOKED = "permissions revoked";
    public static final java.lang.String KILL_APP_REASON_GIDS_CHANGED = "permission grant or revoke changed gids";
    public static final long CANNOT_INSTALL_WITH_BAD_PERMISSION_GROUPS = 146211400L;
    public static final boolean DEBUG_TRACE_GRANTS = false;
    public static final boolean DEBUG_TRACE_PERMISSION_UPDATES = false;
    public static final boolean DEBUG_DEVICE_PERMISSIONS = false;
    @android.annotation.SystemApi
    public static final java.lang.String EXTRA_PERMISSION_USAGES = "android.permission.extra.PERMISSION_USAGES";
    public static final java.util.Set<java.lang.String> DEVICE_AWARE_PERMISSIONS = null;
    public static final java.lang.String CACHE_KEY_PACKAGE_INFO_NOTIFY = null;
    public static final java.lang.String CACHE_KEY_PACKAGE_INFO_CACHE = null;
    public PermissionManager(android.content.Context p0) throws android.os.ServiceManager.ServiceNotFoundException {}
    @android.annotation.RequiresPermission(value="android.permission.UPDATE_APP_OPS_STATS", conditional=true)
    public int checkPermissionForDataDelivery(java.lang.String p0, android.content.AttributionSource p1, java.lang.String p2) { return 0; }
    @android.annotation.RequiresPermission(value="android.permission.UPDATE_APP_OPS_STATS", conditional=true)
    public int checkPermissionForStartDataDelivery(java.lang.String p0, android.content.AttributionSource p1, java.lang.String p2) { return 0; }
    public void finishDataDelivery(java.lang.String p0, android.content.AttributionSource p1) {}
    @android.annotation.RequiresPermission(value="android.permission.UPDATE_APP_OPS_STATS", conditional=true)
    public int checkPermissionForDataDeliveryFromDataSource(java.lang.String p0, android.content.AttributionSource p1, java.lang.String p2) { return 0; }
    public int checkPermissionForPreflight(java.lang.String p0, android.content.AttributionSource p1) { return 0; }
    @android.annotation.Nullable
    public android.content.pm.PermissionInfo getPermissionInfo(java.lang.String p0, int p1) { return null; }
    @android.annotation.Nullable
    public java.util.List<android.content.pm.PermissionInfo> queryPermissionsByGroup(java.lang.String p0, int p1) { return null; }
    public boolean addPermission(android.content.pm.PermissionInfo p0, boolean p1) { return false; }
    public void removePermission(java.lang.String p0) {}
    @android.annotation.Nullable
    public android.content.pm.PermissionGroupInfo getPermissionGroupInfo(java.lang.String p0, int p1) { return null; }
    @android.annotation.NonNull
    public java.util.List<android.content.pm.PermissionGroupInfo> getAllPermissionGroups(int p0) { return null; }
    public boolean isPermissionRevokedByPolicy(java.lang.String p0, java.lang.String p1) { return false; }
    public static boolean shouldTraceGrant(java.lang.String p0, java.lang.String p1, int p2) { return false; }
    @android.annotation.RequiresPermission("android.permission.GRANT_RUNTIME_PERMISSIONS")
    public void grantRuntimePermission(java.lang.String p0, java.lang.String p1, android.os.UserHandle p2) {}
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.GRANT_RUNTIME_PERMISSIONS")
    @android.annotation.FlaggedApi("android.permission.flags.device_aware_permission_apis_enabled")
    public void grantRuntimePermission(java.lang.String p0, java.lang.String p1, java.lang.String p2) {}
    @android.annotation.RequiresPermission("android.permission.REVOKE_RUNTIME_PERMISSIONS")
    public void revokeRuntimePermission(java.lang.String p0, java.lang.String p1, android.os.UserHandle p2, java.lang.String p3) {}
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.REVOKE_RUNTIME_PERMISSIONS")
    @android.annotation.FlaggedApi("android.permission.flags.device_aware_permission_apis_enabled")
    public void revokeRuntimePermission(java.lang.String p0, java.lang.String p1, java.lang.String p2, java.lang.String p3) {}
    @android.annotation.RequiresPermission(anyOf={"android.permission.GRANT_RUNTIME_PERMISSIONS", "android.permission.REVOKE_RUNTIME_PERMISSIONS", "android.permission.GET_RUNTIME_PERMISSIONS"})
    public int getPermissionFlags(java.lang.String p0, java.lang.String p1, android.os.UserHandle p2) { return 0; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission(anyOf={"android.permission.GRANT_RUNTIME_PERMISSIONS", "android.permission.REVOKE_RUNTIME_PERMISSIONS", "android.permission.GET_RUNTIME_PERMISSIONS"})
    @android.annotation.FlaggedApi("android.permission.flags.device_aware_permission_apis_enabled")
    public int getPermissionFlags(java.lang.String p0, java.lang.String p1, java.lang.String p2) { return 0; }
    @android.annotation.RequiresPermission(anyOf={"android.permission.GRANT_RUNTIME_PERMISSIONS", "android.permission.REVOKE_RUNTIME_PERMISSIONS"})
    public void updatePermissionFlags(java.lang.String p0, java.lang.String p1, int p2, int p3, android.os.UserHandle p4) {}
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission(anyOf={"android.permission.GRANT_RUNTIME_PERMISSIONS", "android.permission.REVOKE_RUNTIME_PERMISSIONS"})
    @android.annotation.FlaggedApi("android.permission.flags.device_aware_permission_apis_enabled")
    public void updatePermissionFlags(java.lang.String p0, java.lang.String p1, java.lang.String p2, int p3, int p4) {}
    @android.annotation.NonNull
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
    @android.annotation.NonNull
    public java.util.List<android.permission.PermissionManager.SplitPermissionInfo> getSplitPermissions() { return null; }
    public void initializeUsageHelper() {}
    public void tearDownUsageHelper() {}
    @android.annotation.NonNull
    @android.annotation.RequiresPermission("android.permission.GET_APP_OPS_STATS")
    public java.util.List<android.permission.PermissionGroupUsage> getIndicatorAppOpUsageData() { return null; }
    @android.annotation.NonNull
    @android.annotation.RequiresPermission("android.permission.GET_APP_OPS_STATS")
    public java.util.List<android.permission.PermissionGroupUsage> getIndicatorAppOpUsageData(boolean p0) { return null; }
    public static boolean shouldShowPackageForIndicatorCached(android.content.Context p0, java.lang.String p1) { return false; }
    public static java.util.Set<java.lang.String> getIndicatorExemptedPackages(android.content.Context p0) { return null; }
    public static void updateIndicatorExemptedPackages(android.content.Context p0) {}
    @android.annotation.SystemApi
    @android.annotation.NonNull
    @android.annotation.RequiresPermission("android.permission.ADJUST_RUNTIME_PERMISSIONS_POLICY")
    public java.util.Set<java.lang.String> getAutoRevokeExemptionRequestedPackages() { return null; }
    @android.annotation.SystemApi
    @android.annotation.NonNull
    @android.annotation.RequiresPermission("android.permission.ADJUST_RUNTIME_PERMISSIONS_POLICY")
    public java.util.Set<java.lang.String> getAutoRevokeExemptionGrantedPackages() { return null; }
    public static java.util.List<android.content.pm.permission.SplitPermissionInfoParcelable> splitPermissionInfoListToParcelableList(java.util.List<android.permission.PermissionManager.SplitPermissionInfo> p0) { return null; }
    @java.lang.Deprecated
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.MANAGE_ONE_TIME_PERMISSION_SESSIONS")
    public void startOneTimePermissionSession(java.lang.String p0, long p1, int p2, int p3) {}
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.MANAGE_ONE_TIME_PERMISSION_SESSIONS")
    public void startOneTimePermissionSession(java.lang.String p0, long p1, long p2, int p3, int p4) {}
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.MANAGE_ONE_TIME_PERMISSION_SESSIONS")
    public void stopOneTimePermissionSession(java.lang.String p0) {}
    @android.annotation.SystemApi
    public int checkDeviceIdentifierAccess(java.lang.String p0, java.lang.String p1, java.lang.String p2, int p3, int p4) { return 0; }
    @android.annotation.NonNull
    public android.content.AttributionSource registerAttributionSource(android.content.AttributionSource p0) { return null; }
    @android.annotation.FlaggedApi("android.permission.flags.should_register_attribution_source")
    public boolean isRegisteredAttributionSource(android.content.AttributionSource p0) { return false; }
    @android.annotation.RequiresPermission("android.permission.UPDATE_APP_OPS_STATS")
    public int getRegisteredAttributionSourceCountForTest(int p0) { return 0; }
    @android.annotation.RequiresPermission("android.permission.REVOKE_POST_NOTIFICATIONS_WITHOUT_KILL")
    public void revokePostNotificationPermissionWithoutKillForTest(java.lang.String p0, int p1) {}
    public static int checkPermission(java.lang.String p0, int p1, int p2, int p3) { return 0; }
    public int getPermissionRequestState(java.lang.String p0, java.lang.String p1, int p2) { return 0; }
    @android.annotation.SystemApi
    @android.annotation.NonNull
    @android.annotation.RequiresPermission(anyOf={"android.permission.GRANT_RUNTIME_PERMISSIONS", "android.permission.REVOKE_RUNTIME_PERMISSIONS", "android.permission.GET_RUNTIME_PERMISSIONS"})
    @android.annotation.FlaggedApi("android.permission.flags.device_aware_permission_apis_enabled")
    public java.util.Map<java.lang.String, android.permission.PermissionManager.PermissionState> getAllPermissionStates(java.lang.String p0, java.lang.String p1) { return null; }
    public static void disablePermissionCache() {}
    public int checkPackageNamePermission(java.lang.String p0, java.lang.String p1, int p2, int p3) { return 0; }
    public static int resolveDeviceIdForPermissionCheck(android.content.Context p0, int p1, java.lang.String p2) { return 0; }
    @android.annotation.SystemApi
    @android.annotation.FlaggedApi("android.permission.flags.device_aware_permission_apis_enabled")
    public int checkPermission(java.lang.String p0, java.lang.String p1, java.lang.String p2) { return 0; }
    public static void disablePackageNamePermissionCache() {}

    private final class OnPermissionsChangeListenerDelegate extends android.permission.IOnPermissionsChangeListener.Stub implements android.os.Handler.Callback {
        public OnPermissionsChangeListenerDelegate(android.permission.PermissionManager p0, android.content.pm.PackageManager.OnPermissionsChangedListener p1, android.os.Looper p2) { super(); }
        public void onPermissionsChanged(int p0, java.lang.String p1) {}
        public boolean handleMessage(android.os.Message p0) { return false; }
    }

    private static final class PackageNamePermissionQuery {
        final java.lang.String permName = null;
        final java.lang.String pkgName = null;
        final java.lang.String persistentDeviceId = null;
        final int userId = 0;
        PackageNamePermissionQuery(java.lang.String p0, java.lang.String p1, java.lang.String p2, int p3) {}
        public java.lang.String toString() { return null; }
        public int hashCode() { return 0; }
        public boolean equals(java.lang.Object p0) { return false; }
    }

    private static final class PermissionQuery {
        final java.lang.String permission = null;
        final int pid = 0;
        final int uid = 0;
        final int deviceId = 0;
        PermissionQuery(java.lang.String p0, int p1, int p2, int p3) {}
        public java.lang.String toString() { return null; }
        public int hashCode() { return 0; }
        public boolean equals(java.lang.Object p0) { return false; }
    }

    private static final class PermissionRequestStateQuery {
        final java.lang.String mPackageName = null;
        final java.lang.String mPermission = null;
        final int mDeviceId = 0;
        PermissionRequestStateQuery(java.lang.String p0, java.lang.String p1, int p2) {}
        public java.lang.String toString() { return null; }
        public int hashCode() { return 0; }
        public boolean equals(java.lang.Object p0) { return false; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface PermissionResult {
    }

    @android.annotation.SystemApi
    @android.annotation.FlaggedApi("android.permission.flags.device_aware_permission_apis_enabled")
    public static final class PermissionState implements android.os.Parcelable {
        @android.annotation.FlaggedApi("android.permission.flags.device_aware_permission_apis_enabled")
        @android.annotation.NonNull
        public static final android.os.Parcelable.Creator<android.permission.PermissionManager.PermissionState> CREATOR = null;
        @android.annotation.FlaggedApi("android.permission.flags.device_aware_permission_apis_enabled")
        public PermissionState(boolean p0, int p1) {}
        @android.annotation.FlaggedApi("android.permission.flags.device_aware_permission_apis_enabled")
        public boolean isGranted() { return false; }
        @android.annotation.FlaggedApi("android.permission.flags.device_aware_permission_apis_enabled")
        public int getFlags() { return 0; }
        @android.annotation.FlaggedApi("android.permission.flags.device_aware_permission_apis_enabled")
        public int describeContents() { return 0; }
        @android.annotation.FlaggedApi("android.permission.flags.device_aware_permission_apis_enabled")
        public void writeToParcel(android.os.Parcel p0, int p1) {}
        public boolean equals(java.lang.Object p0) { return false; }
        public int hashCode() { return 0; }
        public java.lang.String toString() { return null; }
    }

    public static final class SplitPermissionInfo {
        public boolean equals(java.lang.Object p0) { return false; }
        public int hashCode() { return 0; }
        @android.annotation.NonNull
        public java.lang.String getSplitPermission() { return null; }
        @android.annotation.NonNull
        public java.util.List<java.lang.String> getNewPermissions() { return null; }
        public int getTargetSdk() { return 0; }
        public SplitPermissionInfo(java.lang.String p0, java.util.List<java.lang.String> p1, int p2) {}
    }
}
