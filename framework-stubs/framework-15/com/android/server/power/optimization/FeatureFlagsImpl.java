package com.android.server.power.optimization;

public final class FeatureFlagsImpl implements com.android.server.power.optimization.FeatureFlags {
    public FeatureFlagsImpl() {}
    public boolean disableSystemServicePowerAttr() { return false; }
    public boolean onewayBatteryStatsService() { return false; }
    public boolean powerMonitorApi() { return false; }
    public boolean streamlinedBatteryStats() { return false; }
    public boolean streamlinedConnectivityBatteryStats() { return false; }
    public boolean streamlinedMiscBatteryStats() { return false; }
}
