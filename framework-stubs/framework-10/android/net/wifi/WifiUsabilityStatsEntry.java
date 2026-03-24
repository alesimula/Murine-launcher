package android.net.wifi;

@android.annotation.SystemApi
public final class WifiUsabilityStatsEntry implements android.os.Parcelable {
    public static final int PROBE_STATUS_UNKNOWN = 0;
    public static final int PROBE_STATUS_NO_PROBE = 1;
    public static final int PROBE_STATUS_SUCCESS = 2;
    public static final int PROBE_STATUS_FAILURE = 3;
    private final long mTimeStampMillis = 0L;
    private final int mRssi = 0;
    private final int mLinkSpeedMbps = 0;
    private final long mTotalTxSuccess = 0L;
    private final long mTotalTxRetries = 0L;
    private final long mTotalTxBad = 0L;
    private final long mTotalRxSuccess = 0L;
    private final long mTotalRadioOnTimeMillis = 0L;
    private final long mTotalRadioTxTimeMillis = 0L;
    private final long mTotalRadioRxTimeMillis = 0L;
    private final long mTotalScanTimeMillis = 0L;
    private final long mTotalNanScanTimeMillis = 0L;
    private final long mTotalBackgroundScanTimeMillis = 0L;
    private final long mTotalRoamScanTimeMillis = 0L;
    private final long mTotalPnoScanTimeMillis = 0L;
    private final long mTotalHotspot2ScanTimeMillis = 0L;
    private final long mTotalCcaBusyFreqTimeMillis = 0L;
    private final long mTotalRadioOnFreqTimeMillis = 0L;
    private final long mTotalBeaconRx = 0L;
    private final int mProbeStatusSinceLastUpdate = 0;
    private final int mProbeElapsedTimeSinceLastUpdateMillis = 0;
    private final int mProbeMcsRateSinceLastUpdate = 0;
    private final int mRxLinkSpeedMbps = 0;
    private final int mCellularDataNetworkType = 0;
    private final int mCellularSignalStrengthDbm = 0;
    private final int mCellularSignalStrengthDb = 0;
    private final boolean mIsSameRegisteredCell = false;
    public static final android.os.Parcelable.Creator<android.net.wifi.WifiUsabilityStatsEntry> CREATOR = null;
    public WifiUsabilityStatsEntry(long p0, int p1, int p2, long p3, long p4, long p5, long p6, long p7, long p8, long p9, long p10, long p11, long p12, long p13, long p14, long p15, long p16, long p17, long p18, int p19, int p20, int p21, int p22, int p23, int p24, int p25, boolean p26) {}
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public long getTimeStampMillis() { return 0L; }
    public int getRssi() { return 0; }
    public int getLinkSpeedMbps() { return 0; }
    public long getTotalTxSuccess() { return 0L; }
    public long getTotalTxRetries() { return 0L; }
    public long getTotalTxBad() { return 0L; }
    public long getTotalRxSuccess() { return 0L; }
    public long getTotalRadioOnTimeMillis() { return 0L; }
    public long getTotalRadioTxTimeMillis() { return 0L; }
    public long getTotalRadioRxTimeMillis() { return 0L; }
    public long getTotalScanTimeMillis() { return 0L; }
    public long getTotalNanScanTimeMillis() { return 0L; }
    public long getTotalBackgroundScanTimeMillis() { return 0L; }
    public long getTotalRoamScanTimeMillis() { return 0L; }
    public long getTotalPnoScanTimeMillis() { return 0L; }
    public long getTotalHotspot2ScanTimeMillis() { return 0L; }
    public long getTotalCcaBusyFreqTimeMillis() { return 0L; }
    public long getTotalRadioOnFreqTimeMillis() { return 0L; }
    public long getTotalBeaconRx() { return 0L; }
    public int getProbeStatusSinceLastUpdate() { return 0; }
    public int getProbeElapsedTimeSinceLastUpdateMillis() { return 0; }
    public int getProbeMcsRateSinceLastUpdate() { return 0; }
    public int getRxLinkSpeedMbps() { return 0; }
    public int getCellularDataNetworkType() { return 0; }
    public int getCellularSignalStrengthDbm() { return 0; }
    public int getCellularSignalStrengthDb() { return 0; }
    public boolean isSameRegisteredCell() { return false; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ProbeStatus {
    }
}
