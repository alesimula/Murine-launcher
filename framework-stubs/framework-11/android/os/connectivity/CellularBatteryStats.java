package android.os.connectivity;

@android.annotation.SystemApi
public final class CellularBatteryStats implements android.os.Parcelable {
    private final long mLoggingDurationMs = 0L;
    private final long mKernelActiveTimeMs = 0L;
    private final long mNumPacketsTx = 0L;
    private final long mNumBytesTx = 0L;
    private final long mNumPacketsRx = 0L;
    private final long mNumBytesRx = 0L;
    private final long mSleepTimeMs = 0L;
    private final long mIdleTimeMs = 0L;
    private final long mRxTimeMs = 0L;
    private final long mEnergyConsumedMaMs = 0L;
    private final long[] mTimeInRatMs = null;
    private final long[] mTimeInRxSignalStrengthLevelMs = null;
    private final long[] mTxTimeMs = null;
    private final long mMonitoredRailChargeConsumedMaMs = 0L;
    public static final android.os.Parcelable.Creator<android.os.connectivity.CellularBatteryStats> CREATOR = null;
    public CellularBatteryStats(long p0, long p1, long p2, long p3, long p4, long p5, long p6, long p7, long p8, java.lang.Long p9, long[] p10, long[] p11, long[] p12, long p13) {}
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public long getLoggingDurationMillis() { return 0L; }
    public long getKernelActiveTimeMillis() { return 0L; }
    public long getNumPacketsTx() { return 0L; }
    public long getNumBytesTx() { return 0L; }
    public long getNumPacketsRx() { return 0L; }
    public long getNumBytesRx() { return 0L; }
    public long getSleepTimeMillis() { return 0L; }
    public long getIdleTimeMillis() { return 0L; }
    public long getRxTimeMillis() { return 0L; }
    public long getEnergyConsumedMaMillis() { return 0L; }
    @android.annotation.SuppressLint("MethodNameUnits")
    public long getTimeInRatMicros(int p0) { return 0L; }
    @android.annotation.SuppressLint("MethodNameUnits")
    public long getTimeInRxSignalStrengthLevelMicros(int p0) { return 0L; }
    public long getTxTimeMillis(int p0) { return 0L; }
    public long getMonitoredRailChargeConsumedMaMillis() { return 0L; }
    public int describeContents() { return 0; }
}
