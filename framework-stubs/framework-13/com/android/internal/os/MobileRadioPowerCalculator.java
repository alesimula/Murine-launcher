package com.android.internal.os;

public class MobileRadioPowerCalculator extends com.android.internal.os.PowerCalculator {
    public MobileRadioPowerCalculator(com.android.internal.os.PowerProfile p0) { super(); }
    public boolean isPowerComponentSupported(int p0) { return false; }
    public void calculate(android.os.BatteryUsageStats.Builder p0, android.os.BatteryStats p1, long p2, long p3, android.os.BatteryUsageStatsQuery p4) {}
    public double calcPowerFromRadioActiveDurationMah(long p0) { return 0.0; }
    public double calcIdlePowerAtSignalStrengthMah(long p0, int p1) { return 0.0; }
    public double calcScanTimePowerMah(long p0) { return 0.0; }

    private static class PowerAndDuration {
        public long durationMs;
        public double remainingPowerMah;
        public long totalAppDurationMs;
        public double totalAppPowerMah;
        public long signalDurationMs;
        public long noCoverageDurationMs;
    }
}
