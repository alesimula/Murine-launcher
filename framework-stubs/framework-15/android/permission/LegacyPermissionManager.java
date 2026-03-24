package android.permission;

public final class LegacyPermissionManager {
    public LegacyPermissionManager() throws android.os.ServiceManager.ServiceNotFoundException {}
    public LegacyPermissionManager(android.permission.ILegacyPermissionManager p0) {}
    public int checkDeviceIdentifierAccess(java.lang.String p0, java.lang.String p1, java.lang.String p2, int p3, int p4) { return 0; }
    public int checkPhoneNumberAccess(java.lang.String p0, java.lang.String p1, java.lang.String p2, int p3, int p4) { return 0; }
    @android.annotation.RequiresPermission("android.permission.GRANT_RUNTIME_PERMISSIONS_TO_TELEPHONY_DEFAULTS")
    public void grantDefaultPermissionsToLuiApp(java.lang.String p0, android.os.UserHandle p1, java.util.concurrent.Executor p2, java.util.function.Consumer<java.lang.Boolean> p3) {}
    @android.annotation.RequiresPermission("android.permission.GRANT_RUNTIME_PERMISSIONS_TO_TELEPHONY_DEFAULTS")
    public void revokeDefaultPermissionsFromLuiApps(java.lang.String[] p0, android.os.UserHandle p1, java.util.concurrent.Executor p2, java.util.function.Consumer<java.lang.Boolean> p3) {}
    @android.annotation.RequiresPermission("android.permission.GRANT_RUNTIME_PERMISSIONS_TO_TELEPHONY_DEFAULTS")
    public void grantDefaultPermissionsToEnabledImsServices(java.lang.String[] p0, android.os.UserHandle p1, java.util.concurrent.Executor p2, java.util.function.Consumer<java.lang.Boolean> p3) {}
    @android.annotation.RequiresPermission("android.permission.GRANT_RUNTIME_PERMISSIONS_TO_TELEPHONY_DEFAULTS")
    public void grantDefaultPermissionsToEnabledTelephonyDataServices(java.lang.String[] p0, android.os.UserHandle p1, java.util.concurrent.Executor p2, java.util.function.Consumer<java.lang.Boolean> p3) {}
    @android.annotation.RequiresPermission("android.permission.GRANT_RUNTIME_PERMISSIONS_TO_TELEPHONY_DEFAULTS")
    public void revokeDefaultPermissionsFromDisabledTelephonyDataServices(java.lang.String[] p0, android.os.UserHandle p1, java.util.concurrent.Executor p2, java.util.function.Consumer<java.lang.Boolean> p3) {}
    @android.annotation.RequiresPermission("android.permission.GRANT_RUNTIME_PERMISSIONS_TO_TELEPHONY_DEFAULTS")
    public void grantDefaultPermissionsToEnabledCarrierApps(java.lang.String[] p0, android.os.UserHandle p1, java.util.concurrent.Executor p2, java.util.function.Consumer<java.lang.Boolean> p3) {}
    public void grantDefaultPermissionsToCarrierServiceApp(java.lang.String p0, int p1) {}
}
