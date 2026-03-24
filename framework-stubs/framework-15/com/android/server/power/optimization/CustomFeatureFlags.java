package com.android.server.power.optimization;

public class CustomFeatureFlags implements com.android.server.power.optimization.FeatureFlags {
    public CustomFeatureFlags(java.util.function.BiPredicate<java.lang.String, java.util.function.Predicate<com.android.server.power.optimization.FeatureFlags>> p0) {}
    public boolean disableSystemServicePowerAttr() { return false; }
    public boolean onewayBatteryStatsService() { return false; }
    public boolean powerMonitorApi() { return false; }
    public boolean streamlinedBatteryStats() { return false; }
    public boolean streamlinedConnectivityBatteryStats() { return false; }
    public boolean streamlinedMiscBatteryStats() { return false; }
    public boolean isFlagReadOnlyOptimized(java.lang.String p0) { return false; }
    protected boolean getValue(java.lang.String p0, java.util.function.Predicate<com.android.server.power.optimization.FeatureFlags> p1) { return false; }
    public java.util.List<java.lang.String> getFlagNames() { return null; }
}
