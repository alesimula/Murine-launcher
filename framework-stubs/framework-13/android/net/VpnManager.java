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
    public static final java.lang.String ACTION_VPN_MANAGER_EVENT = "android.net.action.VPN_MANAGER_EVENT";
    public static final java.lang.String CATEGORY_EVENT_IKE_ERROR = "android.net.category.EVENT_IKE_ERROR";
    public static final java.lang.String CATEGORY_EVENT_NETWORK_ERROR = "android.net.category.EVENT_NETWORK_ERROR";
    public static final java.lang.String CATEGORY_EVENT_DEACTIVATED_BY_USER = "android.net.category.EVENT_DEACTIVATED_BY_USER";
    public static final java.lang.String CATEGORY_EVENT_ALWAYS_ON_STATE_CHANGED = "android.net.category.EVENT_ALWAYS_ON_STATE_CHANGED";
    public static final java.lang.String EXTRA_VPN_PROFILE_STATE = "android.net.extra.VPN_PROFILE_STATE";
    public static final java.lang.String EXTRA_SESSION_KEY = "android.net.extra.SESSION_KEY";
    public static final java.lang.String EXTRA_UNDERLYING_NETWORK = "android.net.extra.UNDERLYING_NETWORK";
    public static final java.lang.String EXTRA_UNDERLYING_NETWORK_CAPABILITIES = "android.net.extra.UNDERLYING_NETWORK_CAPABILITIES";
    public static final java.lang.String EXTRA_UNDERLYING_LINK_PROPERTIES = "android.net.extra.UNDERLYING_LINK_PROPERTIES";
    public static final java.lang.String EXTRA_TIMESTAMP_MILLIS = "android.net.extra.TIMESTAMP_MILLIS";
    public static final java.lang.String EXTRA_ERROR_CLASS = "android.net.extra.ERROR_CLASS";
    public static final java.lang.String EXTRA_ERROR_CODE = "android.net.extra.ERROR_CODE";
    public static final int ERROR_CLASS_NOT_RECOVERABLE = 1;
    public static final int ERROR_CLASS_RECOVERABLE = 2;
    public static final int ERROR_CODE_NETWORK_UNKNOWN_HOST = 0;
    public static final int ERROR_CODE_NETWORK_PROTOCOL_TIMEOUT = 1;
    public static final int ERROR_CODE_NETWORK_LOST = 2;
    public static final int ERROR_CODE_NETWORK_IO = 3;
    public VpnManager(android.content.Context p0, android.net.IVpnManager p1) {}
    public android.content.Intent provisionVpnProfile(android.net.PlatformVpnProfile p0) { return null; }
    public void deleteProvisionedVpnProfile() {}
    public java.lang.String startProvisionedVpnProfileSession() { return null; }
    @java.lang.Deprecated
    public void startProvisionedVpnProfile() {}
    public void stopProvisionedVpnProfile() {}
    public com.android.internal.net.VpnConfig getVpnConfig(int p0) { return null; }
    public android.net.VpnProfileState getProvisionedVpnProfileState() { return null; }
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
    @android.annotation.RequiresPermission(anyOf={"android.permission.NETWORK_SETTINGS", "android.permission.MAINLINE_NETWORK_STACK", "android.permission.NETWORK_STACK"})
    public boolean setAppExclusionList(int p0, java.lang.String p1, java.util.List<java.lang.String> p2) { return false; }
    @android.annotation.RequiresPermission(anyOf={"android.permission.NETWORK_SETTINGS", "android.permission.MAINLINE_NETWORK_STACK", "android.permission.NETWORK_STACK"})
    public java.util.List<java.lang.String> getAppExclusionList(int p0, java.lang.String p1) { return null; }
    @android.annotation.RequiresPermission("android.permission.CONTROL_ALWAYS_ON_VPN")
    public java.util.List<java.lang.String> getVpnLockdownAllowlist(int p0) { return null; }
    public com.android.internal.net.LegacyVpnInfo getLegacyVpnInfo(int p0) { return null; }
    public void startLegacyVpn(com.android.internal.net.VpnProfile p0) {}
    public boolean updateLockdownVpn() { return false; }
    public com.android.internal.net.VpnProfile[] getAllLegacyVpns() { return null; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface VpnType {
    }
}
