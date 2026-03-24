package com.android.server.power.optimization;

public final class FeatureFlagsImpl implements com.android.server.power.optimization.FeatureFlags {
    public FeatureFlagsImpl() {}
    public boolean addBatteryUsageStatsSliceAtom() { return false; }
    public boolean batteryStatsScreenStateEvent() { return false; }
    public boolean checkinHistoryStartTime() { return false; }
    public boolean disableCompositeBatteryUsageStatsAtoms() { return false; }
    public boolean powerMonitorApi() { return false; }
    public boolean realCheckinHistoryStartTime() { return false; }
    public boolean reportOutOfOrderBatteryHistoryEvents() { return false; }
    public boolean streamlinedConnectivityBatteryStats() { return false; }
}
