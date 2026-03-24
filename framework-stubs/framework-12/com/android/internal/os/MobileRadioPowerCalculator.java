package com.android.internal.os;

public class MobileRadioPowerCalculator extends com.android.internal.os.PowerCalculator {
    private static final java.lang.String TAG = "MobRadioPowerCalculator";
    private static final boolean DEBUG = false;
    private static final int NUM_SIGNAL_STRENGTH_LEVELS = Integer.valueOf(0);
    private final com.android.internal.os.UsageBasedPowerEstimator mActivePowerEstimator = null;
    private final com.android.internal.os.UsageBasedPowerEstimator[] mIdlePowerEstimators = null;
    private final com.android.internal.os.UsageBasedPowerEstimator mScanPowerEstimator = null;
    public MobileRadioPowerCalculator(com.android.internal.os.PowerProfile p0) { super(); }
    public void calculate(android.os.BatteryUsageStats.Builder p0, android.os.BatteryStats p1, long p2, long p3, android.os.BatteryUsageStatsQuery p4) {}
    private void calculateApp(android.os.UidBatteryConsumer.Builder p0, android.os.BatteryStats.Uid p1, double p2, com.android.internal.os.MobileRadioPowerCalculator.PowerAndDuration p3, android.os.BatteryUsageStatsQuery p4) {}
    public void calculate(java.util.List<com.android.internal.os.BatterySipper> p0, android.os.BatteryStats p1, long p2, long p3, int p4, android.util.SparseArray<android.os.UserHandle> p5) {}
    private void calculateApp(com.android.internal.os.BatterySipper p0, android.os.BatteryStats.Uid p1, int p2, double p3, com.android.internal.os.MobileRadioPowerCalculator.PowerAndDuration p4) {}
    private long calculateDuration(android.os.BatteryStats.Uid p0, int p1) { return 0L; }
    private double calculatePower(android.os.BatteryStats.Uid p0, int p1, double p2, long p3, long p4) { return 0.0; }
    private void calculateRemaining(com.android.internal.os.MobileRadioPowerCalculator.PowerAndDuration p0, int p1, android.os.BatteryStats p2, long p3, long p4) {}
    public double calcPowerFromRadioActiveDurationMah(long p0) { return 0.0; }
    public double calcIdlePowerAtSignalStrengthMah(long p0, int p1) { return 0.0; }
    public double calcScanTimePowerMah(long p0) { return 0.0; }
    private double getMobilePowerPerPacket(android.os.BatteryStats p0, long p1, int p2) { return 0.0; }

    private static class PowerAndDuration {
        public long durationMs;
        public double remainingPowerMah;
        public long totalAppDurationMs;
        public double totalAppPowerMah;
        public long signalDurationMs;
        public long noCoverageDurationMs;
        private PowerAndDuration() {}
    }
}
