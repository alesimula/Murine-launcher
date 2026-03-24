package android.os;

public abstract class BatteryStatsInternal {
    public BatteryStatsInternal() {}
    public abstract java.lang.String[] getWifiIfaces();
    public abstract java.lang.String[] getMobileIfaces();
    public abstract void noteJobsDeferred(int p0, int p1, long p2);
}
