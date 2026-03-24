package com.android.internal.os;

public class SystemServicePowerCalculator extends com.android.internal.os.PowerCalculator {
    private static final boolean DEBUG = false;
    private static final java.lang.String TAG = "SystemServicePowerCalc";
    private final com.android.internal.os.UsageBasedPowerEstimator[] mPowerEstimators = null;
    private final com.android.internal.os.CpuPowerCalculator mCpuPowerCalculator = null;
    public SystemServicePowerCalculator(com.android.internal.os.PowerProfile p0) { super(); }
    public void calculate(android.os.BatteryUsageStats.Builder p0, android.os.BatteryStats p1, long p2, long p3, android.os.BatteryUsageStatsQuery p4) {}
    public void calculate(java.util.List<com.android.internal.os.BatterySipper> p0, android.os.BatteryStats p1, long p2, long p3, int p4, android.util.SparseArray<android.os.UserHandle> p5) {}
    private double calculatePowerUsingMeasuredConsumption(android.os.BatteryStats p0, android.os.BatteryStats.Uid p1, long p2) { return 0.0; }
    private double calculatePowerUsingPowerProfile(android.os.BatteryStats p0) { return 0.0; }
}
