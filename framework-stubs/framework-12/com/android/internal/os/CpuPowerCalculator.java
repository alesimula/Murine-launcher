package com.android.internal.os;

public class CpuPowerCalculator extends com.android.internal.os.PowerCalculator {
    private static final java.lang.String TAG = "CpuPowerCalculator";
    private static final boolean DEBUG = false;
    private final int mNumCpuClusters = 0;
    private final com.android.internal.os.UsageBasedPowerEstimator mCpuActivePowerEstimator = null;
    private final com.android.internal.os.UsageBasedPowerEstimator[] mPerClusterPowerEstimators = null;
    private final com.android.internal.os.UsageBasedPowerEstimator[][] mPerCpuFreqPowerEstimators = null;
    public CpuPowerCalculator(com.android.internal.os.PowerProfile p0) { super(); }
    public void calculate(android.os.BatteryUsageStats.Builder p0, android.os.BatteryStats p1, long p2, long p3, android.os.BatteryUsageStatsQuery p4) {}
    private void calculateApp(android.os.UidBatteryConsumer.Builder p0, android.os.BatteryStats.Uid p1, android.os.BatteryUsageStatsQuery p2, com.android.internal.os.CpuPowerCalculator.Result p3) {}
    public void calculate(java.util.List<com.android.internal.os.BatterySipper> p0, android.os.BatteryStats p1, long p2, long p3, int p4, android.util.SparseArray<android.os.UserHandle> p5) {}
    private void calculateApp(com.android.internal.os.BatterySipper p0, android.os.BatteryStats.Uid p1, int p2, com.android.internal.os.CpuPowerCalculator.Result p3) {}
    private void calculatePowerAndDuration(android.os.BatteryStats.Uid p0, int p1, long p2, int p3, com.android.internal.os.CpuPowerCalculator.Result p4) {}
    public double calculateUidModeledPowerMah(android.os.BatteryStats.Uid p0, int p1) { return 0.0; }
    public double calculateActiveCpuPowerMah(long p0) { return 0.0; }
    public double calculatePerCpuClusterPowerMah(int p0, long p1) { return 0.0; }
    public double calculatePerCpuFreqPowerMah(int p0, int p1, long p2) { return 0.0; }

    private static class Result {
        public long durationMs;
        public double powerMah;
        public long durationFgMs;
        public java.lang.String packageWithHighestDrain;
        private Result() {}
    }
}
