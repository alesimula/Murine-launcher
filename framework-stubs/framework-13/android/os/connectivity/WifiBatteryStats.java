package android.os.connectivity;

@android.annotation.SystemApi
public final class WifiBatteryStats implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.os.connectivity.WifiBatteryStats> CREATOR = null;
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public WifiBatteryStats(long p0, long p1, long p2, long p3, long p4, long p5, long p6, long p7, long p8, long p9, long p10, long p11, long p12, long[] p13, long[] p14, long[] p15, long p16) {}
    public long getLoggingDurationMillis() { return 0L; }
    public long getKernelActiveTimeMillis() { return 0L; }
    public long getNumPacketsTx() { return 0L; }
    public long getNumBytesTx() { return 0L; }
    public long getNumPacketsRx() { return 0L; }
    public long getNumBytesRx() { return 0L; }
    public long getSleepTimeMillis() { return 0L; }
    public long getScanTimeMillis() { return 0L; }
    public long getIdleTimeMillis() { return 0L; }
    public long getRxTimeMillis() { return 0L; }
    public long getTxTimeMillis() { return 0L; }
    public long getEnergyConsumedMaMillis() { return 0L; }
    public long getAppScanRequestCount() { return 0L; }
    public long getMonitoredRailChargeConsumedMaMillis() { return 0L; }
}
