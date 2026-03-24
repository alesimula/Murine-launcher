package android.os.connectivity;

public final class WifiBatteryStats implements android.os.Parcelable {
    private long mLoggingDurationMs;
    private long mKernelActiveTimeMs;
    private long mNumPacketsTx;
    private long mNumBytesTx;
    private long mNumPacketsRx;
    private long mNumBytesRx;
    private long mSleepTimeMs;
    private long mScanTimeMs;
    private long mIdleTimeMs;
    private long mRxTimeMs;
    private long mTxTimeMs;
    private long mEnergyConsumedMaMs;
    private long mNumAppScanRequest;
    private long[] mTimeInStateMs;
    private long[] mTimeInSupplicantStateMs;
    private long[] mTimeInRxSignalStrengthLevelMs;
    private long mMonitoredRailChargeConsumedMaMs;
    public static final android.os.Parcelable.Creator<android.os.connectivity.WifiBatteryStats> CREATOR = null;
    public WifiBatteryStats() {}
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public void readFromParcel(android.os.Parcel p0) {}
    public long getLoggingDurationMs() { return 0L; }
    public long getKernelActiveTimeMs() { return 0L; }
    public long getNumPacketsTx() { return 0L; }
    public long getNumBytesTx() { return 0L; }
    public long getNumPacketsRx() { return 0L; }
    public long getNumBytesRx() { return 0L; }
    public long getSleepTimeMs() { return 0L; }
    public long getScanTimeMs() { return 0L; }
    public long getIdleTimeMs() { return 0L; }
    public long getRxTimeMs() { return 0L; }
    public long getTxTimeMs() { return 0L; }
    public long getEnergyConsumedMaMs() { return 0L; }
    public long getNumAppScanRequest() { return 0L; }
    public long[] getTimeInStateMs() { return null; }
    public long[] getTimeInRxSignalStrengthLevelMs() { return null; }
    public long[] getTimeInSupplicantStateMs() { return null; }
    public long getMonitoredRailChargeConsumedMaMs() { return 0L; }
    public void setLoggingDurationMs(long p0) {}
    public void setKernelActiveTimeMs(long p0) {}
    public void setNumPacketsTx(long p0) {}
    public void setNumBytesTx(long p0) {}
    public void setNumPacketsRx(long p0) {}
    public void setNumBytesRx(long p0) {}
    public void setSleepTimeMs(long p0) {}
    public void setScanTimeMs(long p0) {}
    public void setIdleTimeMs(long p0) {}
    public void setRxTimeMs(long p0) {}
    public void setTxTimeMs(long p0) {}
    public void setEnergyConsumedMaMs(long p0) {}
    public void setNumAppScanRequest(long p0) {}
    public void setTimeInStateMs(long[] p0) {}
    public void setTimeInRxSignalStrengthLevelMs(long[] p0) {}
    public void setTimeInSupplicantStateMs(long[] p0) {}
    public void setMonitoredRailChargeConsumedMaMs(long p0) {}
    public int describeContents() { return 0; }
    private WifiBatteryStats(android.os.Parcel p0) {}
    private void initialize() {}
}
