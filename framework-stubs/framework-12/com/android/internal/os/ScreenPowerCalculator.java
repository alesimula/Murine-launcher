package com.android.internal.os;

public class ScreenPowerCalculator extends com.android.internal.os.PowerCalculator {
    private static final java.lang.String TAG = "ScreenPowerCalculator";
    private static final boolean DEBUG = false;
    public static final long MIN_ACTIVE_TIME_FOR_SMEARING = 600000L;
    private final com.android.internal.os.UsageBasedPowerEstimator mScreenOnPowerEstimator = null;
    private final com.android.internal.os.UsageBasedPowerEstimator mScreenFullPowerEstimator = null;
    public ScreenPowerCalculator(com.android.internal.os.PowerProfile p0) { super(); }
    public void calculate(android.os.BatteryUsageStats.Builder p0, android.os.BatteryStats p1, long p2, long p3, android.os.BatteryUsageStatsQuery p4) {}
    public void calculate(java.util.List<com.android.internal.os.BatterySipper> p0, android.os.BatteryStats p1, long p2, long p3, int p4, android.util.SparseArray<android.os.UserHandle> p5) {}
    private void calculateTotalDurationAndPower(com.android.internal.os.ScreenPowerCalculator.PowerAndDuration p0, int p1, android.os.BatteryStats p2, long p3, int p4, long p5) {}
    private void calculateAppUsingMeasuredEnergy(com.android.internal.os.ScreenPowerCalculator.PowerAndDuration p0, android.os.BatteryStats.Uid p1, long p2) {}
    private long calculateDuration(android.os.BatteryStats p0, long p1, int p2) { return 0L; }
    private double calculateTotalPowerFromBrightness(android.os.BatteryStats p0, long p1, int p2, long p3) { return 0.0; }
    public void smearScreenBatterySipper(java.util.List<com.android.internal.os.BatterySipper> p0, com.android.internal.os.BatterySipper p1, long p2) {}
    private void smearScreenBatteryDrain(android.util.SparseArray<android.os.UidBatteryConsumer.Builder> p0, com.android.internal.os.ScreenPowerCalculator.PowerAndDuration p1, long p2) {}
    public long getProcessForegroundTimeMs(android.os.BatteryStats.Uid p0, long p1) { return 0L; }
    public long getForegroundActivityTotalTimeUs(android.os.BatteryStats.Uid p0, long p1) { return 0L; }

    private static class PowerAndDuration {
        public long durationMs;
        public double powerMah;
        private PowerAndDuration() {}
    }
}
