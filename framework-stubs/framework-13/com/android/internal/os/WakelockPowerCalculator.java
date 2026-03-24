package com.android.internal.os;

public class WakelockPowerCalculator extends com.android.internal.os.PowerCalculator {
    public WakelockPowerCalculator(com.android.internal.os.PowerProfile p0) { super(); }
    public boolean isPowerComponentSupported(int p0) { return false; }
    public void calculate(android.os.BatteryUsageStats.Builder p0, android.os.BatteryStats p1, long p2, long p3, android.os.BatteryUsageStatsQuery p4) {}

    private static class PowerAndDuration {
        public long durationMs;
        public double powerMah;
    }
}
