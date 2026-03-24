package com.android.server.power.optimization;

public class CustomFeatureFlags implements com.android.server.power.optimization.FeatureFlags {
    public CustomFeatureFlags(java.util.function.BiPredicate<java.lang.String, java.util.function.Predicate<com.android.server.power.optimization.FeatureFlags>> p0) {}
    public boolean addBatteryUsageStatsSliceAtom() { return false; }
    public boolean batteryStatsScreenStateEvent() { return false; }
    public boolean checkinHistoryStartTime() { return false; }
    public boolean disableCompositeBatteryUsageStatsAtoms() { return false; }
    public boolean powerMonitorApi() { return false; }
    public boolean realCheckinHistoryStartTime() { return false; }
    public boolean reportOutOfOrderBatteryHistoryEvents() { return false; }
    public boolean streamlinedConnectivityBatteryStats() { return false; }
    public boolean isFlagReadOnlyOptimized(java.lang.String p0) { return false; }
    protected boolean getValue(java.lang.String p0, java.util.function.Predicate<com.android.server.power.optimization.FeatureFlags> p1) { return false; }
    public java.util.List<java.lang.String> getFlagNames() { return null; }
}
