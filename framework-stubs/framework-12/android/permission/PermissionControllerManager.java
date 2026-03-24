package android.permission;

@android.annotation.SystemApi
public final class PermissionControllerManager {
    private static final java.lang.String TAG = null;
    private static final long REQUEST_TIMEOUT_MILLIS = 60000L;
    private static final long UNBIND_TIMEOUT_MILLIS = 10000L;
    private static final int CHUNK_SIZE = 4096;
    private static final java.lang.Object sLock = null;
    private static android.util.ArrayMap<android.util.Pair<java.lang.Integer, java.lang.Thread>, com.android.internal.infra.ServiceConnector<android.permission.IPermissionController>> sRemoteServices;
    public static final int REASON_MALWARE = 1;
    public static final int REASON_INSTALLER_POLICY_VIOLATION = 2;
    public static final int COUNT_ONLY_WHEN_GRANTED = 1;
    public static final int COUNT_WHEN_SYSTEM = 2;
    private final android.content.Context mContext = null;
    private final com.android.internal.infra.ServiceConnector<android.permission.IPermissionController> mRemoteService = null;
    private final android.os.Handler mHandler = null;
    public PermissionControllerManager(android.content.Context p0, android.os.Handler p1) {}
    private void enforceSomePermissionsGrantedToSelf(java.lang.String... p0) {}
    @android.annotation.RequiresPermission("android.permission.REVOKE_RUNTIME_PERMISSIONS")
    public void revokeRuntimePermissions(java.util.Map<java.lang.String, java.util.List<java.lang.String>> p0, boolean p1, int p2, java.util.concurrent.Executor p3, android.permission.PermissionControllerManager.OnRevokeRuntimePermissionsCallback p4) {}
    @android.annotation.RequiresPermission(allOf={"android.permission.GRANT_RUNTIME_PERMISSIONS", "android.permission.REVOKE_RUNTIME_PERMISSIONS", "android.permission.ADJUST_RUNTIME_PERMISSIONS_POLICY"}, conditional=true)
    public void setRuntimePermissionGrantStateByDeviceAdmin(java.lang.String p0, android.permission.AdminPermissionControlParams p1, java.util.concurrent.Executor p2, java.util.function.Consumer<java.lang.Boolean> p3) {}
    @android.annotation.RequiresPermission("android.permission.GET_RUNTIME_PERMISSIONS")
    public void getRuntimePermissionBackup(android.os.UserHandle p0, java.util.concurrent.Executor p1, java.util.function.Consumer<byte[]> p2) {}
    @android.annotation.RequiresPermission(anyOf={"android.permission.GRANT_RUNTIME_PERMISSIONS", "android.permission.RESTORE_RUNTIME_PERMISSIONS"})
    public void stageAndApplyRuntimePermissionsBackup(byte[] p0, android.os.UserHandle p1) {}
    @android.annotation.RequiresPermission(anyOf={"android.permission.GRANT_RUNTIME_PERMISSIONS", "android.permission.RESTORE_RUNTIME_PERMISSIONS"})
    public void applyStagedRuntimePermissionBackup(java.lang.String p0, android.os.UserHandle p1, java.util.concurrent.Executor p2, java.util.function.Consumer<java.lang.Boolean> p3) {}
    public void dump(java.io.FileDescriptor p0, java.lang.String[] p1) {}
    @android.annotation.RequiresPermission("android.permission.GET_RUNTIME_PERMISSIONS")
    public void getAppPermissions(java.lang.String p0, android.permission.PermissionControllerManager.OnGetAppPermissionResultCallback p1, android.os.Handler p2) {}
    @android.annotation.RequiresPermission("android.permission.REVOKE_RUNTIME_PERMISSIONS")
    public void revokeRuntimePermission(java.lang.String p0, java.lang.String p1) {}
    @android.annotation.RequiresPermission("android.permission.GET_RUNTIME_PERMISSIONS")
    public void countPermissionApps(java.util.List<java.lang.String> p0, int p1, android.permission.PermissionControllerManager.OnCountPermissionAppsResultCallback p2, android.os.Handler p3) {}
    @android.annotation.RequiresPermission("android.permission.GET_RUNTIME_PERMISSIONS")
    public void getPermissionUsages(boolean p0, long p1, java.util.concurrent.Executor p2, android.permission.PermissionControllerManager.OnPermissionUsageResultCallback p3) {}
    @android.annotation.RequiresPermission("android.permission.ADJUST_RUNTIME_PERMISSIONS_POLICY")
    public void grantOrUpgradeDefaultRuntimePermissions(java.util.concurrent.Executor p0, java.util.function.Consumer<java.lang.Boolean> p1) {}
    @android.annotation.RequiresPermission("android.permission.MANAGE_COMPANION_DEVICES")
    public void getPrivilegesDescriptionStringForProfile(java.lang.String p0, java.util.concurrent.Executor p1, java.util.function.Consumer<java.lang.CharSequence> p2) {}
    public void updateUserSensitive() {}
    public void updateUserSensitiveForApp(int p0) {}
    @android.annotation.RequiresPermission("android.permission.REVOKE_RUNTIME_PERMISSIONS")
    public void notifyOneTimePermissionSessionTimeout(java.lang.String p0) {}
    public void getPlatformPermissionsForGroup(java.lang.String p0, java.util.concurrent.Executor p1, java.util.function.Consumer<java.util.List<java.lang.String>> p2) {}
    public void getGroupOfPlatformPermission(java.lang.String p0, java.util.concurrent.Executor p1, java.util.function.Consumer<java.lang.String> p2) {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface CountPermissionAppsFlag {
    }

    public static interface OnCountPermissionAppsResultCallback {
        public void onCountPermissionApps(int p0);
    }

    public static interface OnGetAppPermissionResultCallback {
        public void onGetAppPermissions(java.util.List<android.permission.RuntimePermissionPresentationInfo> p0);
    }

    public static interface OnPermissionUsageResultCallback {
        public void onPermissionUsageResult(java.util.List<android.permission.RuntimePermissionUsageInfo> p0);
    }

    public static abstract class OnRevokeRuntimePermissionsCallback {
        public OnRevokeRuntimePermissionsCallback() {}
        public abstract void onRevokeRuntimePermissions(java.util.Map<java.lang.String, java.util.List<java.lang.String>> p0);
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Reason {
    }
}
