package android.net.wifi;

public final class WifiUsabilityStatsEntry implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.net.wifi.WifiUsabilityStatsEntry> CREATOR = null;
    public static final int PROBE_STATUS_FAILURE = 3;
    public static final int PROBE_STATUS_NO_PROBE = 1;
    public static final int PROBE_STATUS_SUCCESS = 2;
    public static final int PROBE_STATUS_UNKNOWN = 0;
    WifiUsabilityStatsEntry() {}
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
}
