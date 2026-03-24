package com.android.internal.os;

public abstract class PowerCalculator {
    protected static final boolean DEBUG = false;
    protected static final double MILLIAMPHOUR_PER_MICROCOULOMB = 2.777777777777778e-07;
    public PowerCalculator() {}
    public abstract boolean isPowerComponentSupported(int p0);
    public void calculate(android.os.BatteryUsageStats.Builder p0, android.os.BatteryStats p1, long p2, long p3, android.os.BatteryUsageStatsQuery p4) {}
    protected void calculateApp(android.os.UidBatteryConsumer.Builder p0, android.os.BatteryStats.Uid p1, long p2, long p3, android.os.BatteryUsageStatsQuery p4) {}
    public void reset() {}
    protected static int getPowerModel(long p0, android.os.BatteryUsageStatsQuery p1) { return 0; }
    protected static int getPowerModel(long p0) { return 0; }
    public static void printPowerMah(java.io.PrintWriter p0, double p1) {}
    static double uCtoMah(long p0) { return 0.0; }
}
