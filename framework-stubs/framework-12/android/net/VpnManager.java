package android.net;

public class VpnManager {
    @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.MODULE_LIBRARIES)
    public static final int TYPE_VPN_NONE = -1;
    @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.MODULE_LIBRARIES)
    public static final int TYPE_VPN_SERVICE = 1;
    @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.MODULE_LIBRARIES)
    public static final int TYPE_VPN_PLATFORM = 2;
    @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.MODULE_LIBRARIES)
    public static final int TYPE_VPN_LEGACY = 3;
    @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.MODULE_LIBRARIES)
    public static final int TYPE_VPN_OEM = 4;
    public static final java.lang.String NOTIFICATION_CHANNEL_VPN = "VPN";
    private final android.content.Context mContext = null;
    private final android.net.IVpnManager mService = null;
    private static android.content.Intent getIntentForConfirmation() { return null; }
    public VpnManager(android.content.Context p0, android.net.IVpnManager p1) {}
    public android.content.Intent provisionVpnProfile(android.net.PlatformVpnProfile p0) { return null; }
    public void deleteProvisionedVpnProfile() {}
    public void startProvisionedVpnProfile() {}
    public void stopProvisionedVpnProfile() {}
    public com.android.internal.net.VpnConfig getVpnConfig(int p0) { return null; }
    @android.annotation.RequiresPermission("android.permission.NETWORK_SETTINGS")
    public void factoryReset() {}
    public boolean prepareVpn(java.lang.String p0, java.lang.String p1, int p2) { return false; }
    public void setVpnPackageAuthorization(java.lang.String p0, int p1, int p2) {}
    public boolean isAlwaysOnVpnPackageSupportedForUser(int p0, java.lang.String p1) { return false; }
    @android.annotation.RequiresPermission("android.permission.CONTROL_ALWAYS_ON_VPN")
    public boolean setAlwaysOnVpnPackageForUser(int p0, java.lang.String p1, boolean p2, java.util.List<java.lang.String> p3) { return false; }
    @android.annotation.RequiresPermission("android.permission.CONTROL_ALWAYS_ON_VPN")
    public java.lang.String getAlwaysOnVpnPackageForUser(int p0) { return null; }
    @android.annotation.RequiresPermission("android.permission.CONTROL_ALWAYS_ON_VPN")
    public boolean isVpnLockdownEnabled(int p0) { return false; }
    @android.annotation.RequiresPermission("android.permission.CONTROL_ALWAYS_ON_VPN")
    public java.util.List<java.lang.String> getVpnLockdownAllowlist(int p0) { return null; }
    public com.android.internal.net.LegacyVpnInfo getLegacyVpnInfo(int p0) { return null; }
    public void startLegacyVpn(com.android.internal.net.VpnProfile p0) {}
    public boolean updateLockdownVpn() { return false; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface VpnType {
    }
}
