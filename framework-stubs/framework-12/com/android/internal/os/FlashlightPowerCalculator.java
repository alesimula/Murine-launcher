package com.android.internal.os;

public class FlashlightPowerCalculator extends com.android.internal.os.PowerCalculator {
    private final com.android.internal.os.UsageBasedPowerEstimator mPowerEstimator = null;
    public FlashlightPowerCalculator(com.android.internal.os.PowerProfile p0) { super(); }
    public void calculate(android.os.BatteryUsageStats.Builder p0, android.os.BatteryStats p1, long p2, long p3, android.os.BatteryUsageStatsQuery p4) {}
    protected void calculateApp(android.os.UidBatteryConsumer.Builder p0, android.os.BatteryStats.Uid p1, long p2, long p3, android.os.BatteryUsageStatsQuery p4) {}
    protected void calculateApp(com.android.internal.os.BatterySipper p0, android.os.BatteryStats.Uid p1, long p2, long p3, int p4) {}
}
