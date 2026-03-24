package android.net.wifi;

public class WifiScanner {
    public static final int MAX_SCAN_PERIOD_MS = 1024000;
    public static final int MIN_SCAN_PERIOD_MS = 1000;
    public static final int REASON_ABORT = -7;
    public static final int REASON_BUSY = -6;
    public static final int REASON_DUPLICATE_REQEUST = -5;
    public static final int REASON_INVALID_ARGS = -9;
    public static final int REASON_INVALID_LISTENER = -2;
    public static final int REASON_INVALID_REQUEST = -3;
    public static final int REASON_NOT_AUTHORIZED = -4;
    public static final int REASON_NO_DEVICE = -8;
    public static final int REASON_SUCCEEDED = 0;
    public static final int REASON_TIMEOUT = -10;
    public static final int REASON_UNSPECIFIED = -1;
    @java.lang.Deprecated
    public static final int REPORT_EVENT_AFTER_BUFFER_FULL = 0;
    public static final int REPORT_EVENT_AFTER_EACH_SCAN = 1;
    public static final int REPORT_EVENT_FULL_SCAN_RESULT = 2;
    public static final int REPORT_EVENT_NO_BATCH = 4;
    public static final int SCAN_TYPE_HIGH_ACCURACY = 2;
    public static final int SCAN_TYPE_LOW_LATENCY = 0;
    public static final int SCAN_TYPE_LOW_POWER = 1;
    public static final int WIFI_BAND_24_5_6_GHZ = 11;
    public static final int WIFI_BAND_24_5_WITH_DFS_6_GHZ = 15;
    public static final int WIFI_BAND_24_GHZ = 1;
    public static final int WIFI_BAND_5_GHZ = 2;
    public static final int WIFI_BAND_5_GHZ_DFS_ONLY = 4;
    public static final int WIFI_BAND_5_GHZ_WITH_DFS = 6;
    public static final int WIFI_BAND_60_GHZ = 16;
    public static final int WIFI_BAND_6_GHZ = 8;
    public static final int WIFI_BAND_BOTH = 3;
    public static final int WIFI_BAND_BOTH_WITH_DFS = 7;
    public static final int WIFI_BAND_UNSPECIFIED = 0;
    public static final int WIFI_RNR_ENABLED = 1;
    public static final int WIFI_RNR_ENABLED_IF_WIFI_BAND_6_GHZ_SCANNED = 0;
    public static final int WIFI_RNR_NOT_NEEDED = 2;
    WifiScanner() {}
    @java.lang.Deprecated
    public void configureWifiChange(int p0, int p1, int p2, int p3, int p4, android.net.wifi.WifiScanner.BssidInfo[] p5) {}
    @java.lang.Deprecated
    public void configureWifiChange(android.net.wifi.WifiScanner.WifiChangeSettings p0) {}
    @android.annotation.NonNull
    public java.util.List<java.lang.Integer> getAvailableChannels(int p0) { return null; }
    public void getCachedScanData(java.util.concurrent.Executor p0, java.util.function.Consumer<android.net.wifi.WifiScanner.ScanData> p1) {}
    @java.lang.Deprecated
    public boolean getScanResults() { return false; }
    @android.annotation.NonNull
    public java.util.List<android.net.wifi.ScanResult> getSingleScanResults() { return null; }
    public boolean isScanning() { return false; }
    public void registerScanListener(java.util.concurrent.Executor p0, android.net.wifi.WifiScanner.ScanListener p1) {}
    public void setScanningEnabled(boolean p0) {}
    public void startBackgroundScan(android.net.wifi.WifiScanner.ScanSettings p0, android.net.wifi.WifiScanner.ScanListener p1) {}
    @java.lang.Deprecated
    public void startBackgroundScan(android.net.wifi.WifiScanner.ScanSettings p0, android.net.wifi.WifiScanner.ScanListener p1, android.os.WorkSource p2) {}
    public void startScan(android.net.wifi.WifiScanner.ScanSettings p0, android.net.wifi.WifiScanner.ScanListener p1) {}
    public void startScan(android.net.wifi.WifiScanner.ScanSettings p0, android.net.wifi.WifiScanner.ScanListener p1, android.os.WorkSource p2) {}
    @java.lang.Deprecated
    public void startTrackingBssids(android.net.wifi.WifiScanner.BssidInfo[] p0, int p1, android.net.wifi.WifiScanner.BssidListener p2) {}
    @java.lang.Deprecated
    public void startTrackingWifiChange(android.net.wifi.WifiScanner.WifiChangeListener p0) {}
    @java.lang.Deprecated
    public void stopBackgroundScan(android.net.wifi.WifiScanner.ScanListener p0) {}
    public void stopScan(android.net.wifi.WifiScanner.ScanListener p0) {}
    @java.lang.Deprecated
    public void stopTrackingBssids(android.net.wifi.WifiScanner.BssidListener p0) {}
    @java.lang.Deprecated
    public void stopTrackingWifiChange(android.net.wifi.WifiScanner.WifiChangeListener p0) {}
    public void unregisterScanListener(android.net.wifi.WifiScanner.ScanListener p0) {}

    public static interface ActionListener {
        public void onFailure(int p0, java.lang.String p1);
        public void onSuccess();
    }

    @java.lang.Deprecated
    public static class BssidInfo {
        @java.lang.Deprecated
        public java.lang.String bssid;
        @java.lang.Deprecated
        public int frequencyHint;
        @java.lang.Deprecated
        public int high;
        @java.lang.Deprecated
        public int low;
        @java.lang.Deprecated
        public BssidInfo() {}
    }

    @java.lang.Deprecated
    public static interface BssidListener extends android.net.wifi.WifiScanner.ActionListener {
        @java.lang.Deprecated
        public void onFound(android.net.wifi.ScanResult[] p0);
        @java.lang.Deprecated
        public void onLost(android.net.wifi.ScanResult[] p0);
    }

    public static class ChannelSpec {
        public int frequency;
        public ChannelSpec(int p0) {}
    }

    @java.lang.Deprecated
    public static class HotlistSettings implements android.os.Parcelable {
        @java.lang.Deprecated
        public int apLostThreshold;
        @java.lang.Deprecated
        public android.net.wifi.WifiScanner.BssidInfo[] bssidInfos;
        @java.lang.Deprecated
        public HotlistSettings() {}
        @java.lang.Deprecated
        public int describeContents() { return 0; }
        @java.lang.Deprecated
        public void writeToParcel(android.os.Parcel p0, int p1) {}
    }

    public static class ParcelableScanData implements android.os.Parcelable {
        public android.net.wifi.WifiScanner.ScanData[] mResults;
        public ParcelableScanData(android.net.wifi.WifiScanner.ScanData[] p0) {}
        public int describeContents() { return 0; }
        public android.net.wifi.WifiScanner.ScanData[] getResults() { return null; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
    }

    public static class ParcelableScanResults implements android.os.Parcelable {
        public android.net.wifi.ScanResult[] mResults;
        public ParcelableScanResults(android.net.wifi.ScanResult[] p0) {}
        public int describeContents() { return 0; }
        public android.net.wifi.ScanResult[] getResults() { return null; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
    }

    public static class ScanData implements android.os.Parcelable {
        public ScanData(int p0, int p1, android.net.wifi.ScanResult[] p2) {}
        public ScanData(android.net.wifi.WifiScanner.ScanData p0) {}
        public int describeContents() { return 0; }
        public int getFlags() { return 0; }
        public int getId() { return 0; }
        public android.net.wifi.ScanResult[] getResults() { return null; }
        public int getScannedBands() { return 0; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
    }

    public static interface ScanListener extends android.net.wifi.WifiScanner.ActionListener {
        public void onFullResult(android.net.wifi.ScanResult p0);
        @java.lang.Deprecated
        public void onPeriodChanged(int p0);
        public void onResults(android.net.wifi.WifiScanner.ScanData[] p0);
    }

    public static class ScanSettings implements android.os.Parcelable {
        @android.annotation.NonNull
        public static final android.os.Parcelable.Creator<android.net.wifi.WifiScanner.ScanSettings> CREATOR = null;
        public int band;
        public android.net.wifi.WifiScanner.ChannelSpec[] channels;
        @android.annotation.NonNull
        public final java.util.List<android.net.wifi.WifiScanner.ScanSettings.HiddenNetwork> hiddenNetworks = null;
        public boolean hideFromAppOps;
        public boolean ignoreLocationSettings;
        @java.lang.Deprecated
        public int maxPeriodInMs;
        @java.lang.Deprecated
        public int maxScansToCache;
        @java.lang.Deprecated
        public int numBssidsPerScan;
        @java.lang.Deprecated
        public int periodInMs;
        @java.lang.Deprecated
        public int reportEvents;
        @java.lang.Deprecated
        public int stepCount;
        public int type;
        public ScanSettings() {}
        public int describeContents() { return 0; }
        public int getRnrSetting() { return 0; }
        @android.annotation.NonNull
        public java.util.List<android.net.wifi.ScanResult.InformationElement> getVendorIes() { return null; }
        public boolean is6GhzPscOnlyEnabled() { return false; }
        public void set6GhzPscOnlyEnabled(boolean p0) {}
        public void setRnrSetting(int p0) {}
        public void setVendorIes(java.util.List<android.net.wifi.ScanResult.InformationElement> p0) {}
        public void writeToParcel(android.os.Parcel p0, int p1) {}

        public static class HiddenNetwork {
            @android.annotation.NonNull
            public final java.lang.String ssid = null;
            public HiddenNetwork(java.lang.String p0) {}
        }
    }

    @java.lang.Deprecated
    public static interface WifiChangeListener extends android.net.wifi.WifiScanner.ActionListener {
        @java.lang.Deprecated
        public void onChanging(android.net.wifi.ScanResult[] p0);
        @java.lang.Deprecated
        public void onQuiescence(android.net.wifi.ScanResult[] p0);
    }

    @java.lang.Deprecated
    public static class WifiChangeSettings implements android.os.Parcelable {
        @java.lang.Deprecated
        public android.net.wifi.WifiScanner.BssidInfo[] bssidInfos;
        @java.lang.Deprecated
        public int lostApSampleSize;
        @java.lang.Deprecated
        public int minApsBreachingThreshold;
        @java.lang.Deprecated
        public int periodInMs;
        @java.lang.Deprecated
        public int rssiSampleSize;
        @java.lang.Deprecated
        public int unchangedSampleSize;
        @java.lang.Deprecated
        public WifiChangeSettings() {}
        @java.lang.Deprecated
        public int describeContents() { return 0; }
        @java.lang.Deprecated
        public void writeToParcel(android.os.Parcel p0, int p1) {}
    }
}
