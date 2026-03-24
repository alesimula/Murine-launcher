package com.android.internal.os;

public class UsageBasedPowerEstimator {
    private static final double MILLIS_IN_HOUR = 3600000.0;
    private final double mAveragePowerMahPerMs = 0.0;
    public UsageBasedPowerEstimator(double p0) {}
    public boolean isSupported() { return false; }
    public long calculateDuration(android.os.BatteryStats.Timer p0, long p1, int p2) { return 0L; }
    public double calculatePower(long p0) { return 0.0; }
}
