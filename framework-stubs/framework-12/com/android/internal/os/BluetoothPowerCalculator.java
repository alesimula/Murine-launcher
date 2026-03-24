package com.android.internal.os;

public class BluetoothPowerCalculator extends com.android.internal.os.PowerCalculator {
    private static final java.lang.String TAG = "BluetoothPowerCalc";
    private static final boolean DEBUG = false;
    private final double mIdleMa = 0.0;
    private final double mRxMa = 0.0;
    private final double mTxMa = 0.0;
    private final boolean mHasBluetoothPowerController = false;
    public BluetoothPowerCalculator(com.android.internal.os.PowerProfile p0) { super(); }
    public void calculate(android.os.BatteryUsageStats.Builder p0, android.os.BatteryStats p1, long p2, long p3, android.os.BatteryUsageStatsQuery p4) {}
    private void calculateApp(android.os.UidBatteryConsumer.Builder p0, com.android.internal.os.BluetoothPowerCalculator.PowerAndDuration p1, android.os.BatteryUsageStatsQuery p2) {}
    public void calculate(java.util.List<com.android.internal.os.BatterySipper> p0, android.os.BatteryStats p1, long p2, long p3, int p4, android.util.SparseArray<android.os.UserHandle> p5) {}
    private void calculateApp(com.android.internal.os.BatterySipper p0, android.os.BatteryStats.Uid p1, int p2, com.android.internal.os.BluetoothPowerCalculator.PowerAndDuration p3) {}
    private long calculateDuration(android.os.BatteryStats.ControllerActivityCounter p0) { return 0L; }
    private double calculatePowerMah(int p0, long p1, android.os.BatteryStats.ControllerActivityCounter p2, boolean p3) { return 0.0; }
    public double calculatePowerMah(long p0, long p1, long p2) { return 0.0; }

    private static class PowerAndDuration {
        public long durationMs;
        public double powerMah;
        private PowerAndDuration() {}
    }
}
