package android.os;

@android.annotation.SystemApi
public final class BatteryStatsManager {
    public static final int WIFI_STATE_OFF = 0;
    public static final int WIFI_STATE_OFF_SCANNING = 1;
    public static final int WIFI_STATE_ON_NO_NETWORKS = 2;
    public static final int WIFI_STATE_ON_DISCONNECTED = 3;
    public static final int WIFI_STATE_ON_CONNECTED_STA = 4;
    public static final int WIFI_STATE_ON_CONNECTED_P2P = 5;
    public static final int WIFI_STATE_ON_CONNECTED_STA_P2P = 6;
    public static final int WIFI_STATE_SOFT_AP = 7;
    public static final int NUM_WIFI_STATES = 8;
    public static final int WIFI_SUPPL_STATE_INVALID = 0;
    public static final int WIFI_SUPPL_STATE_DISCONNECTED = 1;
    public static final int WIFI_SUPPL_STATE_INTERFACE_DISABLED = 2;
    public static final int WIFI_SUPPL_STATE_INACTIVE = 3;
    public static final int WIFI_SUPPL_STATE_SCANNING = 4;
    public static final int WIFI_SUPPL_STATE_AUTHENTICATING = 5;
    public static final int WIFI_SUPPL_STATE_ASSOCIATING = 6;
    public static final int WIFI_SUPPL_STATE_ASSOCIATED = 7;
    public static final int WIFI_SUPPL_STATE_FOUR_WAY_HANDSHAKE = 8;
    public static final int WIFI_SUPPL_STATE_GROUP_HANDSHAKE = 9;
    public static final int WIFI_SUPPL_STATE_COMPLETED = 10;
    public static final int WIFI_SUPPL_STATE_DORMANT = 11;
    public static final int WIFI_SUPPL_STATE_UNINITIALIZED = 12;
    public static final int NUM_WIFI_SUPPL_STATES = 13;
    private final com.android.internal.app.IBatteryStats mBatteryStats = null;
    public BatteryStatsManager(com.android.internal.app.IBatteryStats p0) {}
    @android.annotation.RequiresPermission("android.permission.BATTERY_STATS")
    public android.os.BatteryUsageStats getBatteryUsageStats() { return null; }
    @android.annotation.RequiresPermission("android.permission.BATTERY_STATS")
    public android.os.BatteryUsageStats getBatteryUsageStats(android.os.BatteryUsageStatsQuery p0) { return null; }
    @android.annotation.RequiresPermission("android.permission.BATTERY_STATS")
    public java.util.List<android.os.BatteryUsageStats> getBatteryUsageStats(java.util.List<android.os.BatteryUsageStatsQuery> p0) { return null; }
    @android.annotation.RequiresPermission("android.permission.UPDATE_DEVICE_STATS")
    public void reportWifiRssiChanged(int p0) {}
    @android.annotation.RequiresPermission("android.permission.UPDATE_DEVICE_STATS")
    public void reportWifiOn() {}
    @android.annotation.RequiresPermission("android.permission.UPDATE_DEVICE_STATS")
    public void reportWifiOff() {}
    @android.annotation.RequiresPermission("android.permission.UPDATE_DEVICE_STATS")
    public void reportWifiState(int p0, java.lang.String p1) {}
    @android.annotation.RequiresPermission("android.permission.UPDATE_DEVICE_STATS")
    public void reportWifiScanStartedFromSource(android.os.WorkSource p0) {}
    @android.annotation.RequiresPermission("android.permission.UPDATE_DEVICE_STATS")
    public void reportWifiScanStoppedFromSource(android.os.WorkSource p0) {}
    @android.annotation.RequiresPermission("android.permission.UPDATE_DEVICE_STATS")
    public void reportWifiBatchedScanStartedFromSource(android.os.WorkSource p0, int p1) {}
    @android.annotation.RequiresPermission("android.permission.UPDATE_DEVICE_STATS")
    public void reportWifiBatchedScanStoppedFromSource(android.os.WorkSource p0) {}
    @android.annotation.RequiresPermission("android.permission.UPDATE_DEVICE_STATS")
    public android.os.connectivity.CellularBatteryStats getCellularBatteryStats() { return null; }
    @android.annotation.RequiresPermission("android.permission.UPDATE_DEVICE_STATS")
    public android.os.connectivity.WifiBatteryStats getWifiBatteryStats() { return null; }
    @android.annotation.RequiresPermission("android.permission.UPDATE_DEVICE_STATS")
    public void reportFullWifiLockAcquiredFromSource(android.os.WorkSource p0) {}
    @android.annotation.RequiresPermission("android.permission.UPDATE_DEVICE_STATS")
    public void reportFullWifiLockReleasedFromSource(android.os.WorkSource p0) {}
    @android.annotation.RequiresPermission("android.permission.UPDATE_DEVICE_STATS")
    public void reportWifiSupplicantStateChanged(int p0, boolean p1) {}
    @android.annotation.RequiresPermission("android.permission.UPDATE_DEVICE_STATS")
    public void reportWifiMulticastEnabled(android.os.WorkSource p0) {}
    @android.annotation.RequiresPermission("android.permission.UPDATE_DEVICE_STATS")
    public void reportWifiMulticastDisabled(android.os.WorkSource p0) {}
    @android.annotation.RequiresPermission("android.permission.UPDATE_DEVICE_STATS")
    public void reportMobileRadioPowerState(boolean p0, int p1) {}
    @android.annotation.RequiresPermission("android.permission.UPDATE_DEVICE_STATS")
    public void reportWifiRadioPowerState(boolean p0, int p1) {}
    @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.MODULE_LIBRARIES)
    @android.annotation.RequiresPermission(anyOf={"android.permission.MAINLINE_NETWORK_STACK", "android.permission.NETWORK_STACK"})
    public void reportNetworkInterfaceForTransports(java.lang.String p0, int[] p1) throws java.lang.RuntimeException {}
    private static int getDataConnectionPowerState(boolean p0) { return 0; }
    @android.annotation.RequiresPermission("android.permission.DEVICE_POWER")
    public void setChargerAcOnline(boolean p0, boolean p1) {}
    @android.annotation.RequiresPermission("android.permission.DEVICE_POWER")
    public void setBatteryLevel(int p0, boolean p1) {}
    @android.annotation.RequiresPermission("android.permission.DEVICE_POWER")
    public void unplugBattery(boolean p0) {}
    @android.annotation.RequiresPermission("android.permission.DEVICE_POWER")
    public void resetBattery(boolean p0) {}
    @android.annotation.RequiresPermission("android.permission.DEVICE_POWER")
    public void suspendBatteryInput() {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface WifiState {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface WifiSupplState {
    }
}
