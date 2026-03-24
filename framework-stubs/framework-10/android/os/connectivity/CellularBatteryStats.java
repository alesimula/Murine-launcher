package android.os.connectivity;

public final class CellularBatteryStats implements android.os.Parcelable {
    private long mLoggingDurationMs;
    private long mKernelActiveTimeMs;
    private long mNumPacketsTx;
    private long mNumBytesTx;
    private long mNumPacketsRx;
    private long mNumBytesRx;
    private long mSleepTimeMs;
    private long mIdleTimeMs;
    private long mRxTimeMs;
    private long mEnergyConsumedMaMs;
    private long[] mTimeInRatMs;
    private long[] mTimeInRxSignalStrengthLevelMs;
    private long[] mTxTimeMs;
    private long mMonitoredRailChargeConsumedMaMs;
    public static final android.os.Parcelable.Creator<android.os.connectivity.CellularBatteryStats> CREATOR = null;
    public CellularBatteryStats() {}
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public void readFromParcel(android.os.Parcel p0) {}
    public long getLoggingDurationMs() { return 0L; }
    public long getKernelActiveTimeMs() { return 0L; }
    public long getNumPacketsTx() { return 0L; }
    public long getNumBytesTx() { return 0L; }
    public long getNumPacketsRx() { return 0L; }
    public long getNumBytesRx() { return 0L; }
    public long getSleepTimeMs() { return 0L; }
    public long getIdleTimeMs() { return 0L; }
    public long getRxTimeMs() { return 0L; }
    public long getEnergyConsumedMaMs() { return 0L; }
    public long[] getTimeInRatMs() { return null; }
    public long[] getTimeInRxSignalStrengthLevelMs() { return null; }
    public long[] getTxTimeMs() { return null; }
    public long getMonitoredRailChargeConsumedMaMs() { return 0L; }
    public void setLoggingDurationMs(long p0) {}
    public void setKernelActiveTimeMs(long p0) {}
    public void setNumPacketsTx(long p0) {}
    public void setNumBytesTx(long p0) {}
    public void setNumPacketsRx(long p0) {}
    public void setNumBytesRx(long p0) {}
    public void setSleepTimeMs(long p0) {}
    public void setIdleTimeMs(long p0) {}
    public void setRxTimeMs(long p0) {}
    public void setEnergyConsumedMaMs(long p0) {}
    public void setTimeInRatMs(long[] p0) {}
    public void setTimeInRxSignalStrengthLevelMs(long[] p0) {}
    public void setTxTimeMs(long[] p0) {}
    public void setMonitoredRailChargeConsumedMaMs(long p0) {}
    public int describeContents() { return 0; }
    private CellularBatteryStats(android.os.Parcel p0) {}
    private void initialize() {}
}
