package com.android.internal.os;

public class BatteryUsageStatsStore {
    public BatteryUsageStatsStore(android.content.Context p0, com.android.internal.os.BatteryStatsImpl p1, java.io.File p2, android.os.Handler p3) {}
    public BatteryUsageStatsStore(android.content.Context p0, com.android.internal.os.BatteryStatsImpl p1, java.io.File p2, android.os.Handler p3, long p4) {}
    public void onSystemReady() {}
    public long[] listBatteryUsageStatsTimestamps() { return null; }
    public android.os.BatteryUsageStats loadBatteryUsageStats(long p0) { return null; }
    public void setLastBatteryUsageStatsBeforeResetAtomPullTimestamp(long p0) {}
    public long getLastBatteryUsageStatsBeforeResetAtomPullTimestamp() { return 0L; }
    public void removeAllSnapshots() {}
}
