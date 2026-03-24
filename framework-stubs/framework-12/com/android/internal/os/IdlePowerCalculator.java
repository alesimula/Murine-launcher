package com.android.internal.os;

public class IdlePowerCalculator extends com.android.internal.os.PowerCalculator {
    private static final java.lang.String TAG = "IdlePowerCalculator";
    private static final boolean DEBUG = false;
    private final double mAveragePowerCpuSuspendMahPerUs = 0.0;
    private final double mAveragePowerCpuIdleMahPerUs = 0.0;
    public long mDurationMs;
    public double mPowerMah;
    public IdlePowerCalculator(com.android.internal.os.PowerProfile p0) { super(); }
    public void calculate(android.os.BatteryUsageStats.Builder p0, android.os.BatteryStats p1, long p2, long p3, android.os.BatteryUsageStatsQuery p4) {}
    public void calculate(java.util.List<com.android.internal.os.BatterySipper> p0, android.os.BatteryStats p1, long p2, long p3, int p4, android.util.SparseArray<android.os.UserHandle> p5) {}
    private void calculatePowerAndDuration(android.os.BatteryStats p0, long p1, long p2, int p3) {}
}
