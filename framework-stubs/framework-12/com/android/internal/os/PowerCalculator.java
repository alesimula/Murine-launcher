package com.android.internal.os;

public abstract class PowerCalculator {
    protected static final double MILLIAMPHOUR_PER_MICROCOULOMB = 2.777777777777778e-07;
    public PowerCalculator() {}
    public void calculate(java.util.List<com.android.internal.os.BatterySipper> p0, android.os.BatteryStats p1, long p2, long p3, int p4, android.util.SparseArray<android.os.UserHandle> p5) {}
    public void calculate(android.os.BatteryUsageStats.Builder p0, android.os.BatteryStats p1, long p2, long p3, android.os.BatteryUsageStatsQuery p4) {}
    protected void calculateApp(com.android.internal.os.BatterySipper p0, android.os.BatteryStats.Uid p1, long p2, long p3, int p4) {}
    protected void calculateApp(android.os.UidBatteryConsumer.Builder p0, android.os.BatteryStats.Uid p1, long p2, long p3, android.os.BatteryUsageStatsQuery p4) {}
    public void reset() {}
    protected static int getPowerModel(long p0, android.os.BatteryUsageStatsQuery p1) { return 0; }
    protected static int getPowerModel(long p0) { return 0; }
    protected static double getMeasuredOrEstimatedPower(int p0, long p1, com.android.internal.os.UsageBasedPowerEstimator p2, long p3) { return 0.0; }
    protected static double getMeasuredOrEstimatedPower(long p0, com.android.internal.os.UsageBasedPowerEstimator p1, long p2) { return 0.0; }
    public static void printPowerMah(java.io.PrintWriter p0, double p1) {}
    public static java.lang.String formatCharge(double p0) { return null; }
    static double uCtoMah(long p0) { return 0.0; }
}
