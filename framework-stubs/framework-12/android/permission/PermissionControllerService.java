package android.permission;

@android.annotation.SystemApi
public abstract class PermissionControllerService extends android.app.Service {
    private static final java.lang.String LOG_TAG = null;
    public static final java.lang.String SERVICE_INTERFACE = "android.permission.PermissionControllerService";
    private static final long CAMERA_MIC_INDICATORS_NOT_PRESENT = 162547999L;
    public PermissionControllerService() { super(); }
    public abstract void onRevokeRuntimePermissions(java.util.Map<java.lang.String, java.util.List<java.lang.String>> p0, boolean p1, int p2, java.lang.String p3, java.util.function.Consumer<java.util.Map<java.lang.String, java.util.List<java.lang.String>>> p4);
    public abstract void onGetRuntimePermissionsBackup(android.os.UserHandle p0, java.io.OutputStream p1, java.lang.Runnable p2);
    @java.lang.Deprecated
    public void onRestoreRuntimePermissionsBackup(android.os.UserHandle p0, java.io.InputStream p1, java.lang.Runnable p2) {}
    public void onStageAndApplyRuntimePermissionsBackup(android.os.UserHandle p0, java.io.InputStream p1, java.lang.Runnable p2) {}
    @java.lang.Deprecated
    public void onRestoreDelayedRuntimePermissionsBackup(java.lang.String p0, android.os.UserHandle p1, java.util.function.Consumer<java.lang.Boolean> p2) {}
    public void onApplyStagedRuntimePermissionBackup(java.lang.String p0, android.os.UserHandle p1, java.util.function.Consumer<java.lang.Boolean> p2) {}
    public abstract void onGetAppPermissions(java.lang.String p0, java.util.function.Consumer<java.util.List<android.permission.RuntimePermissionPresentationInfo>> p1);
    public abstract void onRevokeRuntimePermission(java.lang.String p0, java.lang.String p1, java.lang.Runnable p2);
    public abstract void onCountPermissionApps(java.util.List<java.lang.String> p0, int p1, java.util.function.IntConsumer p2);
    public abstract void onGetPermissionUsages(boolean p0, long p1, java.util.function.Consumer<java.util.List<android.permission.RuntimePermissionUsageInfo>> p2);
    public abstract void onGrantOrUpgradeDefaultRuntimePermissions(java.lang.Runnable p0);
    public void onUpdateUserSensitivePermissionFlags(int p0, java.util.concurrent.Executor p1, java.lang.Runnable p2) {}
    public void onUpdateUserSensitivePermissionFlags(int p0, java.lang.Runnable p1) {}
    @java.lang.Deprecated
    public abstract void onSetRuntimePermissionGrantStateByDeviceAdmin(java.lang.String p0, java.lang.String p1, java.lang.String p2, int p3, java.util.function.Consumer<java.lang.Boolean> p4);
    public void onSetRuntimePermissionGrantStateByDeviceAdmin(java.lang.String p0, android.permission.AdminPermissionControlParams p1, java.util.function.Consumer<java.lang.Boolean> p2) {}
    public void onOneTimePermissionSessionTimeout(java.lang.String p0) {}
    public void onGetPlatformPermissionsForGroup(java.lang.String p0, java.util.function.Consumer<java.util.List<java.lang.String>> p1) {}
    public void onGetGroupOfPlatformPermission(java.lang.String p0, java.util.function.Consumer<java.lang.String> p1) {}
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.MANAGE_COMPANION_DEVICES")
    public java.lang.String getPrivilegesDescriptionStringForProfile(java.lang.String p0) { return null; }
    public final android.os.IBinder onBind(android.content.Intent p0) { return null; }
}
