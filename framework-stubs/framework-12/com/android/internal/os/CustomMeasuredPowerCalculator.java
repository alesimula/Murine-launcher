package com.android.internal.os;

public class CustomMeasuredPowerCalculator extends com.android.internal.os.PowerCalculator {
    public CustomMeasuredPowerCalculator(com.android.internal.os.PowerProfile p0) { super(); }
    public void calculate(android.os.BatteryUsageStats.Builder p0, android.os.BatteryStats p1, long p2, long p3, android.os.BatteryUsageStatsQuery p4) {}
    private double[] calculateApp(android.os.UidBatteryConsumer.Builder p0, android.os.BatteryStats.Uid p1, double[] p2) { return null; }
    protected void calculateApp(com.android.internal.os.BatterySipper p0, android.os.BatteryStats.Uid p1, long p2, long p3, int p4) {}
    private void updateCustomMeasuredPowerMah(com.android.internal.os.BatterySipper p0, long[] p1) {}
    private double[] calculateMeasuredEnergiesMah(long[] p0) { return null; }
}
