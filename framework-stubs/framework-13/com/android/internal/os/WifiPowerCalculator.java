package com.android.internal.os;

public class WifiPowerCalculator extends com.android.internal.os.PowerCalculator {
    public WifiPowerCalculator(com.android.internal.os.PowerProfile p0) { super(); }
    public boolean isPowerComponentSupported(int p0) { return false; }
    public void calculate(android.os.BatteryUsageStats.Builder p0, android.os.BatteryStats p1, long p2, long p3, android.os.BatteryUsageStatsQuery p4) {}
    public double calcPowerFromControllerDataMah(long p0, long p1, long p2) { return 0.0; }
    public double calcPowerWithoutControllerDataMah(long p0, long p1, long p2, long p3, long p4) { return 0.0; }
    public double calcGlobalPowerWithoutControllerDataMah(long p0) { return 0.0; }

    private static class PowerDurationAndTraffic {
        public double powerMah;
        public long durationMs;
        public long wifiRxPackets;
        public long wifiTxPackets;
        public long wifiRxBytes;
        public long wifiTxBytes;
        public android.os.BatteryConsumer.Key[] keys;
        public double[] powerPerKeyMah;
    }
}
