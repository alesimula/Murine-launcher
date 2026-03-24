package android.net.wifi;

public final class WifiUsabilityStatsEntry implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.net.wifi.WifiUsabilityStatsEntry> CREATOR = null;
    public static final int NUM_WME_ACCESS_CATEGORIES = 4;
    public static final int PROBE_STATUS_FAILURE = 3;
    public static final int PROBE_STATUS_NO_PROBE = 1;
    public static final int PROBE_STATUS_SUCCESS = 2;
    public static final int PROBE_STATUS_UNKNOWN = 0;
    public static final int WIFI_BANDWIDTH_10_MHZ = 6;
    public static final int WIFI_BANDWIDTH_160_MHZ = 3;
    public static final int WIFI_BANDWIDTH_20_MHZ = 0;
    public static final int WIFI_BANDWIDTH_40_MHZ = 1;
    public static final int WIFI_BANDWIDTH_5_MHZ = 5;
    public static final int WIFI_BANDWIDTH_80P80_MHZ = 4;
    public static final int WIFI_BANDWIDTH_80_MHZ = 2;
    public static final int WIFI_BANDWIDTH_INVALID = -1;
    public static final int WIFI_PREAMBLE_CCK = 1;
    public static final int WIFI_PREAMBLE_HE = 5;
    public static final int WIFI_PREAMBLE_HT = 2;
    public static final int WIFI_PREAMBLE_INVALID = -1;
    public static final int WIFI_PREAMBLE_OFDM = 0;
    public static final int WIFI_PREAMBLE_VHT = 3;
    public static final int WIFI_SPATIAL_STREAMS_FOUR = 4;
    public static final int WIFI_SPATIAL_STREAMS_INVALID = -1;
    public static final int WIFI_SPATIAL_STREAMS_ONE = 1;
    public static final int WIFI_SPATIAL_STREAMS_THREE = 3;
    public static final int WIFI_SPATIAL_STREAMS_TWO = 2;
    public static final int WME_ACCESS_CATEGORY_BE = 0;
    public static final int WME_ACCESS_CATEGORY_BK = 1;
    public static final int WME_ACCESS_CATEGORY_VI = 2;
    public static final int WME_ACCESS_CATEGORY_VO = 3;
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
    public int getTimeSliceDutyCycleInPercent() { return 0; }
    @android.annotation.NonNull
    public android.net.wifi.WifiUsabilityStatsEntry.ContentionTimeStats getContentionTimeStats(int p0) { return null; }
    @android.annotation.NonNull
    public java.util.List<android.net.wifi.WifiUsabilityStatsEntry.RateStats> getRateStats() { return null; }
    @android.annotation.NonNull
    public java.util.List<android.net.wifi.WifiUsabilityStatsEntry.RadioStats> getWifiLinkLayerRadioStats() { return null; }
    public int getChannelUtilizationRatio() { return 0; }
    public boolean isThroughputSufficient() { return false; }
    public boolean isWifiScoringEnabled() { return false; }
    public boolean isCellularDataAvailable() { return false; }
    public int getCellularDataNetworkType() { return 0; }
    public int getCellularSignalStrengthDbm() { return 0; }
    public int getCellularSignalStrengthDb() { return 0; }
    public boolean isSameRegisteredCell() { return false; }

    public static final class ContentionTimeStats implements android.os.Parcelable {
        @android.annotation.NonNull
        public static final android.os.Parcelable.Creator<android.net.wifi.WifiUsabilityStatsEntry.ContentionTimeStats> CREATOR = null;
        public ContentionTimeStats(long p0, long p1, long p2, long p3) {}
        public int describeContents() { return 0; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
        public long getContentionTimeMinMicros() { return 0L; }
        public long getContentionTimeMaxMicros() { return 0L; }
        public long getContentionTimeAvgMicros() { return 0L; }
        public long getContentionNumSamples() { return 0L; }
    }

    public static final class RadioStats implements android.os.Parcelable {
        @android.annotation.NonNull
        public static final android.os.Parcelable.Creator<android.net.wifi.WifiUsabilityStatsEntry.RadioStats> CREATOR = null;
        public RadioStats(int p0, long p1, long p2, long p3, long p4, long p5, long p6, long p7, long p8, long p9) {}
        public int describeContents() { return 0; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
        public long getRadioId() { return 0L; }
        public long getTotalRadioOnTimeMillis() { return 0L; }
        public long getTotalRadioTxTimeMillis() { return 0L; }
        public long getTotalRadioRxTimeMillis() { return 0L; }
        public long getTotalScanTimeMillis() { return 0L; }
        public long getTotalNanScanTimeMillis() { return 0L; }
        public long getTotalBackgroundScanTimeMillis() { return 0L; }
        public long getTotalRoamScanTimeMillis() { return 0L; }
        public long getTotalPnoScanTimeMillis() { return 0L; }
        public long getTotalHotspot2ScanTimeMillis() { return 0L; }
    }

    public static final class RateStats implements android.os.Parcelable {
        @android.annotation.NonNull
        public static final android.os.Parcelable.Creator<android.net.wifi.WifiUsabilityStatsEntry.RateStats> CREATOR = null;
        public RateStats(int p0, int p1, int p2, int p3, int p4, int p5, int p6, int p7, int p8) {}
        public int describeContents() { return 0; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
        public int getPreamble() { return 0; }
        public int getNumberOfSpatialStreams() { return 0; }
        public int getBandwidthInMhz() { return 0; }
        public int getRateMcsIdx() { return 0; }
        public int getBitRateInKbps() { return 0; }
        public int getTxMpdu() { return 0; }
        public int getRxMpdu() { return 0; }
        public int getMpduLost() { return 0; }
        public int getRetries() { return 0; }
    }
}
