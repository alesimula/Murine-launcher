package com.android.internal.os;

public class VideoPowerCalculator extends com.android.internal.os.PowerCalculator {
    private final com.android.internal.os.UsageBasedPowerEstimator mPowerEstimator = null;
    public VideoPowerCalculator(com.android.internal.os.PowerProfile p0) { super(); }
    public void calculate(android.os.BatteryUsageStats.Builder p0, android.os.BatteryStats p1, long p2, long p3, android.os.BatteryUsageStatsQuery p4) {}
    private void calculateApp(android.os.UidBatteryConsumer.Builder p0, com.android.internal.os.VideoPowerCalculator.PowerAndDuration p1, android.os.BatteryStats.Uid p2, long p3) {}

    private static class PowerAndDuration {
        public long durationMs;
        public double powerMah;
        private PowerAndDuration() {}
    }
}
