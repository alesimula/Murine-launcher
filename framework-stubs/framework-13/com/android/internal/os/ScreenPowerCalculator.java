package com.android.internal.os;

public class ScreenPowerCalculator extends com.android.internal.os.PowerCalculator {
    public static final long MIN_ACTIVE_TIME_FOR_SMEARING = 600000L;
    public ScreenPowerCalculator(com.android.internal.os.PowerProfile p0) { super(); }
    public boolean isPowerComponentSupported(int p0) { return false; }
    public void calculate(android.os.BatteryUsageStats.Builder p0, android.os.BatteryStats p1, long p2, long p3, android.os.BatteryUsageStatsQuery p4) {}
    public long getProcessForegroundTimeMs(android.os.BatteryStats.Uid p0, long p1) { return 0L; }
    public long getForegroundActivityTotalTimeUs(android.os.BatteryStats.Uid p0, long p1) { return 0L; }

    private static class PowerAndDuration {
        public long durationMs;
        public double powerMah;
    }
}
