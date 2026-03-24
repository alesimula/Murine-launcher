package com.android.server.power.optimization;

public interface FeatureFlags {
    public boolean disableSystemServicePowerAttr();
    public boolean onewayBatteryStatsService();
    public boolean powerMonitorApi();
    public boolean streamlinedBatteryStats();
    public boolean streamlinedConnectivityBatteryStats();
    public boolean streamlinedMiscBatteryStats();
}
