package com.android.internal.os;

public abstract class PowerCalculator {
    public PowerCalculator() {}
    public abstract void calculateApp(com.android.internal.os.BatterySipper p0, android.os.BatteryStats.Uid p1, long p2, long p3, int p4);
    public void calculateRemaining(com.android.internal.os.BatterySipper p0, android.os.BatteryStats p1, long p2, long p3, int p4) {}
    public void reset() {}
}
