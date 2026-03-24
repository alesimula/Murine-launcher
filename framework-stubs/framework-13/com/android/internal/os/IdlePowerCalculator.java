package com.android.internal.os;

public class IdlePowerCalculator extends com.android.internal.os.PowerCalculator {
    public long mDurationMs;
    public double mPowerMah;
    public IdlePowerCalculator(com.android.internal.os.PowerProfile p0) { super(); }
    public boolean isPowerComponentSupported(int p0) { return false; }
    public void calculate(android.os.BatteryUsageStats.Builder p0, android.os.BatteryStats p1, long p2, long p3, android.os.BatteryUsageStatsQuery p4) {}
}
