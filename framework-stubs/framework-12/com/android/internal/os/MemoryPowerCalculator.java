package com.android.internal.os;

public class MemoryPowerCalculator extends com.android.internal.os.PowerCalculator {
    public static final java.lang.String TAG = "MemoryPowerCalculator";
    private final com.android.internal.os.UsageBasedPowerEstimator[] mPowerEstimators = null;
    public MemoryPowerCalculator(com.android.internal.os.PowerProfile p0) { super(); }
    public void calculate(android.os.BatteryUsageStats.Builder p0, android.os.BatteryStats p1, long p2, long p3, android.os.BatteryUsageStatsQuery p4) {}
    public void calculate(java.util.List<com.android.internal.os.BatterySipper> p0, android.os.BatteryStats p1, long p2, long p3, int p4, android.util.SparseArray<android.os.UserHandle> p5) {}
    private long calculateDuration(android.os.BatteryStats p0, long p1, int p2) { return 0L; }
    private double calculatePower(android.os.BatteryStats p0, long p1, int p2) { return 0.0; }
}
