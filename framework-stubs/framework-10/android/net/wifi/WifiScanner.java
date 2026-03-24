package android.net.wifi;

@android.annotation.SystemApi
public class WifiScanner {
    public static final int WIFI_BAND_UNSPECIFIED = 0;
    public static final int WIFI_BAND_24_GHZ = 1;
    public static final int WIFI_BAND_5_GHZ = 2;
    public static final int WIFI_BAND_5_GHZ_DFS_ONLY = 4;
    public static final int WIFI_BAND_5_GHZ_WITH_DFS = 6;
    public static final int WIFI_BAND_BOTH = 3;
    public static final int WIFI_BAND_BOTH_WITH_DFS = 7;
    public static final int MIN_SCAN_PERIOD_MS = 1000;
    public static final int MAX_SCAN_PERIOD_MS = 1024000;
    public static final int REASON_SUCCEEDED = 0;
    public static final int REASON_UNSPECIFIED = -1;
    public static final int REASON_INVALID_LISTENER = -2;
    public static final int REASON_INVALID_REQUEST = -3;
    public static final int REASON_NOT_AUTHORIZED = -4;
    public static final int REASON_DUPLICATE_REQEUST = -5;
    public static final java.lang.String GET_AVAILABLE_CHANNELS_EXTRA = "Channels";
    @java.lang.Deprecated
    public static final int REPORT_EVENT_AFTER_BUFFER_FULL = 0;
    public static final int REPORT_EVENT_AFTER_EACH_SCAN = 1;
    public static final int REPORT_EVENT_FULL_SCAN_RESULT = 2;
    public static final int REPORT_EVENT_NO_BATCH = 4;
    public static final int TYPE_LOW_LATENCY = 0;
    public static final int TYPE_LOW_POWER = 1;
    public static final int TYPE_HIGH_ACCURACY = 2;
    public static final java.lang.String SCAN_PARAMS_SCAN_SETTINGS_KEY = "ScanSettings";
    public static final java.lang.String SCAN_PARAMS_WORK_SOURCE_KEY = "WorkSource";
    public static final java.lang.String REQUEST_PACKAGE_NAME_KEY = "PackageName";
    public static final java.lang.String PNO_PARAMS_PNO_SETTINGS_KEY = "PnoSettings";
    public static final java.lang.String PNO_PARAMS_SCAN_SETTINGS_KEY = "ScanSettings";
    private static final java.lang.String TAG = "WifiScanner";
    private static final boolean DBG = false;
    private static final int BASE = 159744;
    public static final int CMD_START_BACKGROUND_SCAN = 159746;
    public static final int CMD_STOP_BACKGROUND_SCAN = 159747;
    public static final int CMD_GET_SCAN_RESULTS = 159748;
    public static final int CMD_SCAN_RESULT = 159749;
    public static final int CMD_OP_SUCCEEDED = 159761;
    public static final int CMD_OP_FAILED = 159762;
    public static final int CMD_FULL_SCAN_RESULT = 159764;
    public static final int CMD_START_SINGLE_SCAN = 159765;
    public static final int CMD_STOP_SINGLE_SCAN = 159766;
    public static final int CMD_SINGLE_SCAN_COMPLETED = 159767;
    public static final int CMD_START_PNO_SCAN = 159768;
    public static final int CMD_STOP_PNO_SCAN = 159769;
    public static final int CMD_PNO_NETWORK_FOUND = 159770;
    public static final int CMD_REGISTER_SCAN_LISTENER = 159771;
    public static final int CMD_DEREGISTER_SCAN_LISTENER = 159772;
    public static final int CMD_GET_SINGLE_SCAN_RESULTS = 159773;
    public static final int CMD_ENABLE = 159774;
    public static final int CMD_DISABLE = 159775;
    private android.content.Context mContext;
    private android.net.wifi.IWifiScanner mService;
    private static final int INVALID_KEY = 0;
    private int mListenerKey;
    private final android.util.SparseArray mListenerMap = null;
    private final java.lang.Object mListenerMapLock = null;
    private com.android.internal.util.AsyncChannel mAsyncChannel;
    private final android.os.Handler mInternalHandler = null;
    public java.util.List<java.lang.Integer> getAvailableChannels(int p0) { return null; }
    public void setScanningEnabled(boolean p0) {}
    public void registerScanListener(android.net.wifi.WifiScanner.ScanListener p0) {}
    public void deregisterScanListener(android.net.wifi.WifiScanner.ScanListener p0) {}
    public void startBackgroundScan(android.net.wifi.WifiScanner.ScanSettings p0, android.net.wifi.WifiScanner.ScanListener p1) {}
    public void startBackgroundScan(android.net.wifi.WifiScanner.ScanSettings p0, android.net.wifi.WifiScanner.ScanListener p1, android.os.WorkSource p2) {}
    public void stopBackgroundScan(android.net.wifi.WifiScanner.ScanListener p0) {}
    public boolean getScanResults() { return false; }
    public void startScan(android.net.wifi.WifiScanner.ScanSettings p0, android.net.wifi.WifiScanner.ScanListener p1) {}
    public void startScan(android.net.wifi.WifiScanner.ScanSettings p0, android.net.wifi.WifiScanner.ScanListener p1, android.os.WorkSource p2) {}
    public void stopScan(android.net.wifi.WifiScanner.ScanListener p0) {}
    public java.util.List<android.net.wifi.ScanResult> getSingleScanResults() { return null; }
    private void startPnoScan(android.net.wifi.WifiScanner.ScanSettings p0, android.net.wifi.WifiScanner.PnoSettings p1, int p2) {}
    public void startConnectedPnoScan(android.net.wifi.WifiScanner.ScanSettings p0, android.net.wifi.WifiScanner.PnoSettings p1, android.net.wifi.WifiScanner.PnoScanListener p2) {}
    public void startDisconnectedPnoScan(android.net.wifi.WifiScanner.ScanSettings p0, android.net.wifi.WifiScanner.PnoSettings p1, android.net.wifi.WifiScanner.PnoScanListener p2) {}
    public void stopPnoScan(android.net.wifi.WifiScanner.ScanListener p0) {}
    @java.lang.Deprecated
    @android.annotation.SuppressLint("Doclava125")
    public void configureWifiChange(int p0, int p1, int p2, int p3, int p4, android.net.wifi.WifiScanner.BssidInfo[] p5) {}
    @java.lang.Deprecated
    @android.annotation.SuppressLint("Doclava125")
    public void startTrackingWifiChange(android.net.wifi.WifiScanner.WifiChangeListener p0) {}
    @java.lang.Deprecated
    @android.annotation.SuppressLint("Doclava125")
    public void stopTrackingWifiChange(android.net.wifi.WifiScanner.WifiChangeListener p0) {}
    @android.annotation.SystemApi
    @java.lang.Deprecated
    @android.annotation.SuppressLint("Doclava125")
    public void configureWifiChange(android.net.wifi.WifiScanner.WifiChangeSettings p0) {}
    @java.lang.Deprecated
    @android.annotation.SuppressLint("Doclava125")
    public void startTrackingBssids(android.net.wifi.WifiScanner.BssidInfo[] p0, int p1, android.net.wifi.WifiScanner.BssidListener p2) {}
    @java.lang.Deprecated
    @android.annotation.SuppressLint("Doclava125")
    public void stopTrackingBssids(android.net.wifi.WifiScanner.BssidListener p0) {}
    public WifiScanner(android.content.Context p0, android.net.wifi.IWifiScanner p1, android.os.Looper p2) {}
    private void validateChannel() {}
    private int addListener(android.net.wifi.WifiScanner.ActionListener p0) { return 0; }
    private int putListener(java.lang.Object p0) { return 0; }
    private java.lang.Object getListener(int p0) { return null; }
    private int getListenerKey(java.lang.Object p0) { return 0; }
    private java.lang.Object removeListener(int p0) { return null; }
    private int removeListener(java.lang.Object p0) { return 0; }

    @android.annotation.SystemApi
    @java.lang.Deprecated
    public static class WifiChangeSettings implements android.os.Parcelable {
        public int rssiSampleSize;
        public int lostApSampleSize;
        public int unchangedSampleSize;
        public int minApsBreachingThreshold;
        public int periodInMs;
        public android.net.wifi.WifiScanner.BssidInfo[] bssidInfos;
        public static final android.os.Parcelable.Creator<android.net.wifi.WifiScanner.WifiChangeSettings> CREATOR = null;
        public WifiChangeSettings() {}
        public int describeContents() { return 0; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
    }

    @java.lang.Deprecated
    public static interface WifiChangeListener extends android.net.wifi.WifiScanner.ActionListener {
        public void onChanging(android.net.wifi.ScanResult[] p0);
        public void onQuiescence(android.net.wifi.ScanResult[] p0);
    }

    private class ServiceHandler extends android.os.Handler {
        ServiceHandler(android.net.wifi.WifiScanner p0, android.os.Looper p1) { super(); }
        public void handleMessage(android.os.Message p0) {}
    }

    public static class ScanSettings implements android.os.Parcelable {
        public int band;
        public android.net.wifi.WifiScanner.ChannelSpec[] channels;
        public android.net.wifi.WifiScanner.ScanSettings.HiddenNetwork[] hiddenNetworks;
        public int periodInMs;
        public int reportEvents;
        public int numBssidsPerScan;
        public int maxScansToCache;
        public int maxPeriodInMs;
        public int stepCount;
        public boolean isPnoScan;
        public int type;
        @android.annotation.SystemApi
        public boolean ignoreLocationSettings;
        @android.annotation.SystemApi
        public boolean hideFromAppOps;
        public static final android.os.Parcelable.Creator<android.net.wifi.WifiScanner.ScanSettings> CREATOR = null;
        public ScanSettings() {}
        public int describeContents() { return 0; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}

        public static class HiddenNetwork {
            public java.lang.String ssid;
            public HiddenNetwork(java.lang.String p0) {}
        }
    }

    public static interface ScanListener extends android.net.wifi.WifiScanner.ActionListener {
        public void onPeriodChanged(int p0);
        public void onResults(android.net.wifi.WifiScanner.ScanData[] p0);
        public void onFullResult(android.net.wifi.ScanResult p0);
    }

    public static class ScanData implements android.os.Parcelable {
        private int mId;
        private int mFlags;
        private int mBucketsScanned;
        private int mBandScanned;
        private android.net.wifi.ScanResult[] mResults;
        public static final android.os.Parcelable.Creator<android.net.wifi.WifiScanner.ScanData> CREATOR = null;
        ScanData() {}
        public ScanData(int p0, int p1, android.net.wifi.ScanResult[] p2) {}
        public ScanData(int p0, int p1, int p2, int p3, android.net.wifi.ScanResult[] p4) {}
        public ScanData(android.net.wifi.WifiScanner.ScanData p0) {}
        public int getId() { return 0; }
        public int getFlags() { return 0; }
        public int getBucketsScanned() { return 0; }
        public int getBandScanned() { return 0; }
        public android.net.wifi.ScanResult[] getResults() { return null; }
        public int describeContents() { return 0; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
    }

    public static class PnoSettings implements android.os.Parcelable {
        public boolean isConnected;
        public int min5GHzRssi;
        public int min24GHzRssi;
        public int initialScoreMax;
        public int currentConnectionBonus;
        public int sameNetworkBonus;
        public int secureBonus;
        public int band5GHzBonus;
        public android.net.wifi.WifiScanner.PnoSettings.PnoNetwork[] networkList;
        public static final android.os.Parcelable.Creator<android.net.wifi.WifiScanner.PnoSettings> CREATOR = null;
        public PnoSettings() {}
        public int describeContents() { return 0; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}

        public static class PnoNetwork {
            public static final byte FLAG_DIRECTED_SCAN = 1;
            public static final byte FLAG_A_BAND = 2;
            public static final byte FLAG_G_BAND = 4;
            public static final byte FLAG_STRICT_MATCH = 8;
            public static final byte FLAG_SAME_NETWORK = 16;
            public static final byte AUTH_CODE_OPEN = 1;
            public static final byte AUTH_CODE_PSK = 2;
            public static final byte AUTH_CODE_EAPOL = 4;
            public java.lang.String ssid;
            public byte flags;
            public byte authBitField;
            public int[] frequencies;
            public PnoNetwork(java.lang.String p0) {}
        }
    }

    public static interface PnoScanListener extends android.net.wifi.WifiScanner.ScanListener {
        public void onPnoNetworkFound(android.net.wifi.ScanResult[] p0);
    }

    public static class ParcelableScanResults implements android.os.Parcelable {
        public android.net.wifi.ScanResult[] mResults;
        public static final android.os.Parcelable.Creator<android.net.wifi.WifiScanner.ParcelableScanResults> CREATOR = null;
        public ParcelableScanResults(android.net.wifi.ScanResult[] p0) {}
        public android.net.wifi.ScanResult[] getResults() { return null; }
        public int describeContents() { return 0; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
    }

    public static class ParcelableScanData implements android.os.Parcelable {
        public android.net.wifi.WifiScanner.ScanData[] mResults;
        public static final android.os.Parcelable.Creator<android.net.wifi.WifiScanner.ParcelableScanData> CREATOR = null;
        public ParcelableScanData(android.net.wifi.WifiScanner.ScanData[] p0) {}
        public android.net.wifi.WifiScanner.ScanData[] getResults() { return null; }
        public int describeContents() { return 0; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
    }

    public static class OperationResult implements android.os.Parcelable {
        public int reason;
        public java.lang.String description;
        public static final android.os.Parcelable.Creator<android.net.wifi.WifiScanner.OperationResult> CREATOR = null;
        public OperationResult(int p0, java.lang.String p1) {}
        public int describeContents() { return 0; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
    }

    @android.annotation.SystemApi
    @java.lang.Deprecated
    public static class HotlistSettings implements android.os.Parcelable {
        public android.net.wifi.WifiScanner.BssidInfo[] bssidInfos;
        public int apLostThreshold;
        public static final android.os.Parcelable.Creator<android.net.wifi.WifiScanner.HotlistSettings> CREATOR = null;
        public HotlistSettings() {}
        public int describeContents() { return 0; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
    }

    public static class ChannelSpec {
        public int frequency;
        public boolean passive;
        public int dwellTimeMS;
        public ChannelSpec(int p0) {}
    }

    @java.lang.Deprecated
    public static interface BssidListener extends android.net.wifi.WifiScanner.ActionListener {
        public void onFound(android.net.wifi.ScanResult[] p0);
        public void onLost(android.net.wifi.ScanResult[] p0);
    }

    @java.lang.Deprecated
    public static class BssidInfo {
        public java.lang.String bssid;
        public int low;
        public int high;
        public int frequencyHint;
        public BssidInfo() {}
    }

    @android.annotation.SystemApi
    public static interface ActionListener {
        public void onSuccess();
        public void onFailure(int p0, java.lang.String p1);
    }
}
