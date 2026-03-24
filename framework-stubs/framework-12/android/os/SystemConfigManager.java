package android.os;

@android.annotation.SystemApi
public class SystemConfigManager {
    private static final java.lang.String TAG = null;
    private final android.os.ISystemConfig mInterface = null;
    public SystemConfigManager() {}
    @android.annotation.RequiresPermission("android.permission.READ_CARRIER_APP_INFO")
    public java.util.Set<java.lang.String> getDisabledUntilUsedPreinstalledCarrierApps() { return null; }
    @android.annotation.RequiresPermission("android.permission.READ_CARRIER_APP_INFO")
    public java.util.Map<java.lang.String, java.util.List<java.lang.String>> getDisabledUntilUsedPreinstalledCarrierAssociatedApps() { return null; }
    @android.annotation.RequiresPermission("android.permission.READ_CARRIER_APP_INFO")
    public java.util.Map<java.lang.String, java.util.List<android.os.CarrierAssociatedAppEntry>> getDisabledUntilUsedPreinstalledCarrierAssociatedAppEntries() { return null; }
    @android.annotation.RequiresPermission("android.permission.GET_RUNTIME_PERMISSIONS")
    public int[] getSystemPermissionUids(java.lang.String p0) { return null; }
}
