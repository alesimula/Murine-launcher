package com.android.internal.os;

public class MobileRadioPowerCalculator extends com.android.internal.os.PowerCalculator {
    private static final java.lang.String TAG = "MobileRadioPowerController";
    private static final boolean DEBUG = false;
    private final double mPowerRadioOn = 0.0;
    private final double[] mPowerBins = null;
    private final double mPowerScan = 0.0;
    private android.os.BatteryStats mStats;
    private long mTotalAppMobileActiveMs;
    private double getMobilePowerPerPacket(long p0, int p1) { return 0.0; }
    public MobileRadioPowerCalculator(com.android.internal.os.PowerProfile p0, android.os.BatteryStats p1) { super(); }
    public void calculateApp(com.android.internal.os.BatterySipper p0, android.os.BatteryStats.Uid p1, long p2, long p3, int p4) {}
    public void calculateRemaining(com.android.internal.os.BatterySipper p0, android.os.BatteryStats p1, long p2, long p3, int p4) {}
    public void reset() {}
    public void reset(android.os.BatteryStats p0) {}
}
