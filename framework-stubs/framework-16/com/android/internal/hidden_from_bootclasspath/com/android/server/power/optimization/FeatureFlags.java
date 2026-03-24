package com.android.internal.hidden_from_bootclasspath.com.android.server.power.optimization;

public interface FeatureFlags {
    public boolean addBatteryUsageStatsSliceAtom();
    public boolean batteryStatsScreenStateEvent();
    public boolean checkinHistoryStartTime();
    public boolean disableCompositeBatteryUsageStatsAtoms();
    public boolean powerMonitorApi();
    public boolean realCheckinHistoryStartTime();
    public boolean reportOutOfOrderBatteryHistoryEvents();
    public boolean streamlinedConnectivityBatteryStats();
}
