package android.os;

@android.annotation.SystemApi
public class DeviceIdleManager {
    private final android.content.Context mContext = null;
    private final android.os.IDeviceIdleController mService = null;
    public DeviceIdleManager(android.content.Context p0, android.os.IDeviceIdleController p1) {}
    android.os.IDeviceIdleController getService() { return null; }
    @android.annotation.RequiresPermission("android.permission.DEVICE_POWER")
    public void endIdle(java.lang.String p0) {}
    public java.lang.String[] getSystemPowerWhitelistExceptIdle() { return null; }
    public java.lang.String[] getSystemPowerWhitelist() { return null; }
}
