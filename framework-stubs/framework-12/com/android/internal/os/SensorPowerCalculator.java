package com.android.internal.os;

public class SensorPowerCalculator extends com.android.internal.os.PowerCalculator {
    private final android.util.SparseArray<android.hardware.Sensor> mSensors = null;
    public SensorPowerCalculator(android.hardware.SensorManager p0) { super(); }
    public void calculate(android.os.BatteryUsageStats.Builder p0, android.os.BatteryStats p1, long p2, long p3, android.os.BatteryUsageStatsQuery p4) {}
    private double calculateApp(android.os.UidBatteryConsumer.Builder p0, android.os.BatteryStats.Uid p1, long p2) { return 0.0; }
    protected void calculateApp(com.android.internal.os.BatterySipper p0, android.os.BatteryStats.Uid p1, long p2, long p3, int p4) {}
    private long calculateDuration(android.os.BatteryStats.Uid p0, long p1, int p2) { return 0L; }
    private double calculatePowerMah(android.os.BatteryStats.Uid p0, long p1, int p2) { return 0.0; }
}
