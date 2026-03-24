package com.android.internal.os;

public class WakelockPowerCalculator extends com.android.internal.os.PowerCalculator {
    private static final java.lang.String TAG = "WakelockPowerCalculator";
    private static final boolean DEBUG = false;
    private final double mPowerWakelock = 0.0;
    private long mTotalAppWakelockTimeMs;
    public WakelockPowerCalculator(com.android.internal.os.PowerProfile p0) { super(); }
    public void calculateApp(com.android.internal.os.BatterySipper p0, android.os.BatteryStats.Uid p1, long p2, long p3, int p4) {}
    public void calculateRemaining(com.android.internal.os.BatterySipper p0, android.os.BatteryStats p1, long p2, long p3, int p4) {}
    public void reset() {}
}
