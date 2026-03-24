package com.android.internal.os;

public class WifiPowerCalculator extends com.android.internal.os.PowerCalculator {
    private static final boolean DEBUG = false;
    private static final java.lang.String TAG = "WifiPowerCalculator";
    private final com.android.internal.os.UsageBasedPowerEstimator mIdlePowerEstimator = null;
    private final com.android.internal.os.UsageBasedPowerEstimator mTxPowerEstimator = null;
    private final com.android.internal.os.UsageBasedPowerEstimator mRxPowerEstimator = null;
    private final com.android.internal.os.UsageBasedPowerEstimator mPowerOnPowerEstimator = null;
    private final com.android.internal.os.UsageBasedPowerEstimator mScanPowerEstimator = null;
    private final com.android.internal.os.UsageBasedPowerEstimator mBatchScanPowerEstimator = null;
    private final boolean mHasWifiPowerController = false;
    private final double mWifiPowerPerPacket = 0.0;
    public WifiPowerCalculator(com.android.internal.os.PowerProfile p0) { super(); }
    public void calculate(android.os.BatteryUsageStats.Builder p0, android.os.BatteryStats p1, long p2, long p3, android.os.BatteryUsageStatsQuery p4) {}
    public void calculate(java.util.List<com.android.internal.os.BatterySipper> p0, android.os.BatteryStats p1, long p2, long p3, int p4, android.util.SparseArray<android.os.UserHandle> p5) {}
    private void calculateApp(com.android.internal.os.WifiPowerCalculator.PowerDurationAndTraffic p0, android.os.BatteryStats.Uid p1, int p2, long p3, int p4, boolean p5, long p6) {}
    private void calculateRemaining(com.android.internal.os.WifiPowerCalculator.PowerDurationAndTraffic p0, int p1, android.os.BatteryStats p2, long p3, int p4, boolean p5, long p6, double p7, long p8) {}
    public double calcPowerFromControllerDataMah(long p0, long p1, long p2) { return 0.0; }
    public double calcPowerWithoutControllerDataMah(long p0, long p1, long p2, long p3, long p4) { return 0.0; }
    public double calcGlobalPowerWithoutControllerDataMah(long p0) { return 0.0; }
    private static double getWifiPowerPerPacket(com.android.internal.os.PowerProfile p0) { return 0.0; }

    private static class PowerDurationAndTraffic {
        public double powerMah;
        public long durationMs;
        public long wifiRxPackets;
        public long wifiTxPackets;
        public long wifiRxBytes;
        public long wifiTxBytes;
        private PowerDurationAndTraffic() {}
    }
}
