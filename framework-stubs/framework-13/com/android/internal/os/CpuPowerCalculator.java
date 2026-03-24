package com.android.internal.os;

public class CpuPowerCalculator extends com.android.internal.os.PowerCalculator {
    public CpuPowerCalculator(com.android.internal.os.PowerProfile p0) { super(); }
    public boolean isPowerComponentSupported(int p0) { return false; }
    public void calculate(android.os.BatteryUsageStats.Builder p0, android.os.BatteryStats p1, long p2, long p3, android.os.BatteryUsageStatsQuery p4) {}
    public double calculateUidModeledPowerMah(android.os.BatteryStats.Uid p0, int p1) { return 0.0; }
    public double calculateActiveCpuPowerMah(long p0) { return 0.0; }
    public double calculatePerCpuClusterPowerMah(int p0, long p1) { return 0.0; }
    public double calculatePerCpuFreqPowerMah(int p0, int p1, long p2) { return 0.0; }

    private static class Result {
        public long durationMs;
        public double powerMah;
        public long durationFgMs;
        public java.lang.String packageWithHighestDrain;
        public double[] perProcStatePowerMah;
        public long[] cpuFreqTimes;
    }
}
