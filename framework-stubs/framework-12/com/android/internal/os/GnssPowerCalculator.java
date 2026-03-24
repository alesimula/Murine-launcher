package com.android.internal.os;

public class GnssPowerCalculator extends com.android.internal.os.PowerCalculator {
    private final double mAveragePowerGnssOn = 0.0;
    private final double[] mAveragePowerPerSignalQuality = null;
    public GnssPowerCalculator(com.android.internal.os.PowerProfile p0) { super(); }
    public void calculate(android.os.BatteryUsageStats.Builder p0, android.os.BatteryStats p1, long p2, long p3, android.os.BatteryUsageStatsQuery p4) {}
    private double calculateApp(android.os.UidBatteryConsumer.Builder p0, android.os.BatteryStats.Uid p1, int p2, long p3, double p4, long p5) { return 0.0; }
    public void calculate(java.util.List<com.android.internal.os.BatterySipper> p0, android.os.BatteryStats p1, long p2, long p3, int p4, android.util.SparseArray<android.os.UserHandle> p5) {}
    private void calculateApp(com.android.internal.os.BatterySipper p0, android.os.BatteryStats.Uid p1, int p2, long p3, double p4, long p5) {}
    private long computeDuration(android.os.BatteryStats.Uid p0, long p1, int p2) { return 0L; }
    private double computePower(long p0, double p1) { return 0.0; }
    private double getAverageGnssPower(android.os.BatteryStats p0, long p1, int p2) { return 0.0; }
}
