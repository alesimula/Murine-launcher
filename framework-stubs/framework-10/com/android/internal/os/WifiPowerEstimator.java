package com.android.internal.os;

public class WifiPowerEstimator extends com.android.internal.os.PowerCalculator {
    private static final boolean DEBUG = false;
    private static final java.lang.String TAG = "WifiPowerEstimator";
    private final double mWifiPowerPerPacket = 0.0;
    private final double mWifiPowerOn = 0.0;
    private final double mWifiPowerScan = 0.0;
    private final double mWifiPowerBatchScan = 0.0;
    private long mTotalAppWifiRunningTimeMs;
    public WifiPowerEstimator(com.android.internal.os.PowerProfile p0) { super(); }
    private static double getWifiPowerPerPacket(com.android.internal.os.PowerProfile p0) { return 0.0; }
    public void calculateApp(com.android.internal.os.BatterySipper p0, android.os.BatteryStats.Uid p1, long p2, long p3, int p4) {}
    public void calculateRemaining(com.android.internal.os.BatterySipper p0, android.os.BatteryStats p1, long p2, long p3, int p4) {}
    public void reset() {}
}
