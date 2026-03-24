package android.os;

@android.annotation.SystemApi
public class SystemConfigManager {
    public SystemConfigManager() {}
    @android.annotation.RequiresPermission("android.permission.READ_CARRIER_APP_INFO")
    public java.util.Set<java.lang.String> getDisabledUntilUsedPreinstalledCarrierApps() { return null; }
    @android.annotation.RequiresPermission("android.permission.READ_CARRIER_APP_INFO")
    public java.util.Map<java.lang.String, java.util.List<java.lang.String>> getDisabledUntilUsedPreinstalledCarrierAssociatedApps() { return null; }
    @android.annotation.RequiresPermission("android.permission.READ_CARRIER_APP_INFO")
    public java.util.Map<java.lang.String, java.util.List<android.os.CarrierAssociatedAppEntry>> getDisabledUntilUsedPreinstalledCarrierAssociatedAppEntries() { return null; }
    @android.annotation.RequiresPermission("android.permission.GET_RUNTIME_PERMISSIONS")
    public int[] getSystemPermissionUids(java.lang.String p0) { return null; }
    @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.MODULE_LIBRARIES)
    public java.util.List<android.content.ComponentName> getEnabledComponentOverrides(java.lang.String p0) { return null; }
    @android.annotation.RequiresPermission("android.permission.QUERY_ALL_PACKAGES")
    public java.util.List<android.content.ComponentName> getDefaultVrComponents() { return null; }
}
