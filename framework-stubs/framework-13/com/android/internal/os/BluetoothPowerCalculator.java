package com.android.internal.os;

public class BluetoothPowerCalculator extends com.android.internal.os.PowerCalculator {
    public BluetoothPowerCalculator(com.android.internal.os.PowerProfile p0) { super(); }
    public boolean isPowerComponentSupported(int p0) { return false; }
    public void calculate(android.os.BatteryUsageStats.Builder p0, android.os.BatteryStats p1, long p2, long p3, android.os.BatteryUsageStatsQuery p4) {}
    public double calculatePowerMah(long p0, long p1, long p2) { return 0.0; }

    private static class PowerAndDuration {
        public long durationMs;
        public double powerMah;
        public android.os.BatteryConsumer.Key[] keys;
        public double[] powerPerKeyMah;
        public long totalDurationMs;
        public double totalPowerMah;
    }
}
