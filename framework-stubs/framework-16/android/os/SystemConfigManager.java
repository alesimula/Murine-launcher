package android.os;

@android.annotation.SystemApi
public class SystemConfigManager {
    public SystemConfigManager() {}
    @android.annotation.RequiresPermission("android.permission.READ_CARRIER_APP_INFO")
    @android.annotation.NonNull
    public java.util.Set<java.lang.String> getDisabledUntilUsedPreinstalledCarrierApps() { return null; }
    @android.annotation.RequiresPermission("android.permission.READ_CARRIER_APP_INFO")
    @android.annotation.NonNull
    public java.util.Map<java.lang.String, java.util.List<java.lang.String>> getDisabledUntilUsedPreinstalledCarrierAssociatedApps() { return null; }
    @android.annotation.RequiresPermission("android.permission.READ_CARRIER_APP_INFO")
    @android.annotation.NonNull
    public java.util.Map<java.lang.String, java.util.List<android.os.CarrierAssociatedAppEntry>> getDisabledUntilUsedPreinstalledCarrierAssociatedAppEntries() { return null; }
    @android.annotation.RequiresPermission("android.permission.GET_RUNTIME_PERMISSIONS")
    @android.annotation.NonNull
    public int[] getSystemPermissionUids(java.lang.String p0) { return null; }
    @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.MODULE_LIBRARIES)
    @android.annotation.NonNull
    public java.util.List<android.content.ComponentName> getEnabledComponentOverrides(java.lang.String p0) { return null; }
    @android.annotation.RequiresPermission("android.permission.QUERY_ALL_PACKAGES")
    public java.util.List<android.content.ComponentName> getDefaultVrComponents() { return null; }
    @android.annotation.NonNull
    public java.util.List<java.lang.String> getPreventUserDisablePackages() { return null; }
    @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.MODULE_LIBRARIES)
    @android.annotation.FlaggedApi("android.permission.flags.enhanced_confirmation_mode_apis_enabled")
    @android.annotation.RequiresPermission("android.permission.MANAGE_ENHANCED_CONFIRMATION_STATES")
    @android.annotation.NonNull
    public java.util.Set<android.content.pm.SignedPackage> getEnhancedConfirmationTrustedPackages() { return null; }
    @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.MODULE_LIBRARIES)
    @android.annotation.FlaggedApi("android.permission.flags.enhanced_confirmation_mode_apis_enabled")
    @android.annotation.RequiresPermission("android.permission.MANAGE_ENHANCED_CONFIRMATION_STATES")
    @android.annotation.NonNull
    public java.util.Set<android.content.pm.SignedPackage> getEnhancedConfirmationTrustedInstallers() { return null; }
}
