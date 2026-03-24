package com.android.internal.os;

public class FlashlightPowerCalculator extends com.android.internal.os.PowerCalculator {
    public FlashlightPowerCalculator(com.android.internal.os.PowerProfile p0) { super(); }
    public boolean isPowerComponentSupported(int p0) { return false; }
    public void calculate(android.os.BatteryUsageStats.Builder p0, android.os.BatteryStats p1, long p2, long p3, android.os.BatteryUsageStatsQuery p4) {}
    protected void calculateApp(android.os.UidBatteryConsumer.Builder p0, android.os.BatteryStats.Uid p1, long p2, long p3, android.os.BatteryUsageStatsQuery p4) {}
}
