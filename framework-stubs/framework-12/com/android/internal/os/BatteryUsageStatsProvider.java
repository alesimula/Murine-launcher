package com.android.internal.os;

public class BatteryUsageStatsProvider {
    private static final java.lang.String TAG = "BatteryUsageStatsProv";
    private final android.content.Context mContext = null;
    private final android.os.BatteryStats mStats = null;
    private final com.android.internal.os.BatteryUsageStatsStore mBatteryUsageStatsStore = null;
    private final com.android.internal.os.PowerProfile mPowerProfile = null;
    private final java.lang.Object mLock = null;
    private java.util.List<com.android.internal.os.PowerCalculator> mPowerCalculators;
    public BatteryUsageStatsProvider(android.content.Context p0, android.os.BatteryStats p1) {}
    public BatteryUsageStatsProvider(android.content.Context p0, android.os.BatteryStats p1, com.android.internal.os.BatteryUsageStatsStore p2) {}
    private java.util.List<com.android.internal.os.PowerCalculator> getPowerCalculators() { return null; }
    public boolean shouldUpdateStats(java.util.List<android.os.BatteryUsageStatsQuery> p0, long p1) { return false; }
    public java.util.List<android.os.BatteryUsageStats> getBatteryUsageStats(java.util.List<android.os.BatteryUsageStatsQuery> p0) { return null; }
    public android.os.BatteryUsageStats getBatteryUsageStats(android.os.BatteryUsageStatsQuery p0) { return null; }
    private android.os.BatteryUsageStats getBatteryUsageStats(android.os.BatteryUsageStatsQuery p0, long p1) { return null; }
    private android.os.BatteryUsageStats getCurrentBatteryUsageStats(android.os.BatteryUsageStatsQuery p0, long p1) { return null; }
    private long getProcessForegroundTimeMs(android.os.BatteryStats.Uid p0, long p1) { return 0L; }
    private long getProcessBackgroundTimeMs(android.os.BatteryStats.Uid p0, long p1) { return 0L; }
    private android.os.BatteryUsageStats getAggregatedBatteryUsageStats(android.os.BatteryUsageStatsQuery p0) { return null; }
    private long elapsedRealtime() { return 0L; }
    private long uptimeMillis() { return 0L; }
    private long currentTimeMillis() { return 0L; }
}
