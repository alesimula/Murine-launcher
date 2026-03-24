package com.android.internal.os;

public class WifiPowerCalculator extends com.android.internal.os.PowerCalculator {
    private static final boolean DEBUG = false;
    private static final java.lang.String TAG = "WifiPowerCalculator";
    private final double mIdleCurrentMa = 0.0;
    private final double mTxCurrentMa = 0.0;
    private final double mRxCurrentMa = 0.0;
    private double mTotalAppPowerDrain;
    private long mTotalAppRunningTime;
    public WifiPowerCalculator(com.android.internal.os.PowerProfile p0) { super(); }
    public void calculateApp(com.android.internal.os.BatterySipper p0, android.os.BatteryStats.Uid p1, long p2, long p3, int p4) {}
    public void calculateRemaining(com.android.internal.os.BatterySipper p0, android.os.BatteryStats p1, long p2, long p3, int p4) {}
    public void reset() {}
}
