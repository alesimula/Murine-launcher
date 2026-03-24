package com.android.internal.os;

public class BluetoothPowerCalculator extends com.android.internal.os.PowerCalculator {
    private static final boolean DEBUG = false;
    private static final java.lang.String TAG = "BluetoothPowerCalculator";
    private final double mIdleMa = 0.0;
    private final double mRxMa = 0.0;
    private final double mTxMa = 0.0;
    private double mAppTotalPowerMah;
    private long mAppTotalTimeMs;
    public BluetoothPowerCalculator(com.android.internal.os.PowerProfile p0) { super(); }
    public void calculateApp(com.android.internal.os.BatterySipper p0, android.os.BatteryStats.Uid p1, long p2, long p3, int p4) {}
    public void calculateRemaining(com.android.internal.os.BatterySipper p0, android.os.BatteryStats p1, long p2, long p3, int p4) {}
    public void reset() {}
}
