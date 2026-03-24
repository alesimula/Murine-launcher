package com.android.internal.os;

public class WakelockPowerCalculator extends com.android.internal.os.PowerCalculator {
    private static final java.lang.String TAG = "WakelockPowerCalculator";
    private static final boolean DEBUG = false;
    private final com.android.internal.os.UsageBasedPowerEstimator mPowerEstimator = null;
    public WakelockPowerCalculator(com.android.internal.os.PowerProfile p0) { super(); }
    public void calculate(android.os.BatteryUsageStats.Builder p0, android.os.BatteryStats p1, long p2, long p3, android.os.BatteryUsageStatsQuery p4) {}
    public void calculate(java.util.List<com.android.internal.os.BatterySipper> p0, android.os.BatteryStats p1, long p2, long p3, int p4, android.util.SparseArray<android.os.UserHandle> p5) {}
    private void calculateApp(com.android.internal.os.WakelockPowerCalculator.PowerAndDuration p0, android.os.BatteryStats.Uid p1, long p2, int p3) {}
    private void calculateRemaining(com.android.internal.os.WakelockPowerCalculator.PowerAndDuration p0, android.os.BatteryStats p1, long p2, long p3, int p4, double p5, long p6, long p7) {}
    private long calculateWakeTimeMillis(android.os.BatteryStats p0, long p1, long p2) { return 0L; }

    private static class PowerAndDuration {
        public long durationMs;
        public double powerMah;
        private PowerAndDuration() {}
    }
}
