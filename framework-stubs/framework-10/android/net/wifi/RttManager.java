package android.net.wifi;

@android.annotation.SystemApi
@java.lang.Deprecated
public class RttManager {
    private static final boolean DBG = false;
    private static final java.lang.String TAG = "RttManager";
    @java.lang.Deprecated
    public static final int RTT_TYPE_UNSPECIFIED = 0;
    public static final int RTT_TYPE_ONE_SIDED = 1;
    public static final int RTT_TYPE_TWO_SIDED = 2;
    @java.lang.Deprecated
    public static final int RTT_TYPE_11_V = 2;
    @java.lang.Deprecated
    public static final int RTT_TYPE_11_MC = 4;
    @java.lang.Deprecated
    public static final int RTT_PEER_TYPE_UNSPECIFIED = 0;
    public static final int RTT_PEER_TYPE_AP = 1;
    public static final int RTT_PEER_TYPE_STA = 2;
    public static final int RTT_PEER_P2P_GO = 3;
    public static final int RTT_PEER_P2P_CLIENT = 4;
    public static final int RTT_PEER_NAN = 5;
    @java.lang.Deprecated
    public static final int RTT_CHANNEL_WIDTH_20 = 0;
    @java.lang.Deprecated
    public static final int RTT_CHANNEL_WIDTH_40 = 1;
    @java.lang.Deprecated
    public static final int RTT_CHANNEL_WIDTH_80 = 2;
    @java.lang.Deprecated
    public static final int RTT_CHANNEL_WIDTH_160 = 3;
    @java.lang.Deprecated
    public static final int RTT_CHANNEL_WIDTH_80P80 = 4;
    @java.lang.Deprecated
    public static final int RTT_CHANNEL_WIDTH_5 = 5;
    @java.lang.Deprecated
    public static final int RTT_CHANNEL_WIDTH_10 = 6;
    @java.lang.Deprecated
    public static final int RTT_CHANNEL_WIDTH_UNSPECIFIED = -1;
    public static final int RTT_STATUS_SUCCESS = 0;
    public static final int RTT_STATUS_FAILURE = 1;
    public static final int RTT_STATUS_FAIL_NO_RSP = 2;
    public static final int RTT_STATUS_FAIL_REJECTED = 3;
    public static final int RTT_STATUS_FAIL_NOT_SCHEDULED_YET = 4;
    public static final int RTT_STATUS_FAIL_TM_TIMEOUT = 5;
    public static final int RTT_STATUS_FAIL_AP_ON_DIFF_CHANNEL = 6;
    public static final int RTT_STATUS_FAIL_NO_CAPABILITY = 7;
    public static final int RTT_STATUS_ABORTED = 8;
    public static final int RTT_STATUS_FAIL_INVALID_TS = 9;
    public static final int RTT_STATUS_FAIL_PROTOCOL = 10;
    public static final int RTT_STATUS_FAIL_SCHEDULE = 11;
    public static final int RTT_STATUS_FAIL_BUSY_TRY_LATER = 12;
    public static final int RTT_STATUS_INVALID_REQ = 13;
    public static final int RTT_STATUS_NO_WIFI = 14;
    public static final int RTT_STATUS_FAIL_FTM_PARAM_OVERRIDE = 15;
    public static final int REASON_UNSPECIFIED = -1;
    public static final int REASON_NOT_AVAILABLE = -2;
    public static final int REASON_INVALID_LISTENER = -3;
    public static final int REASON_INVALID_REQUEST = -4;
    public static final int REASON_PERMISSION_DENIED = -5;
    public static final int REASON_INITIATOR_NOT_ALLOWED_WHEN_RESPONDER_ON = -6;
    public static final java.lang.String DESCRIPTION_KEY = "android.net.wifi.RttManager.Description";
    public static final int RTT_BW_5_SUPPORT = 1;
    public static final int RTT_BW_10_SUPPORT = 2;
    public static final int RTT_BW_20_SUPPORT = 4;
    public static final int RTT_BW_40_SUPPORT = 8;
    public static final int RTT_BW_80_SUPPORT = 16;
    public static final int RTT_BW_160_SUPPORT = 32;
    public static final int PREAMBLE_LEGACY = 1;
    public static final int PREAMBLE_HT = 2;
    public static final int PREAMBLE_VHT = 4;
    public static final int BASE = 160256;
    public static final int CMD_OP_START_RANGING = 160256;
    public static final int CMD_OP_STOP_RANGING = 160257;
    public static final int CMD_OP_FAILED = 160258;
    public static final int CMD_OP_SUCCEEDED = 160259;
    public static final int CMD_OP_ABORTED = 160260;
    public static final int CMD_OP_ENABLE_RESPONDER = 160261;
    public static final int CMD_OP_DISABLE_RESPONDER = 160262;
    public static final int CMD_OP_ENALBE_RESPONDER_SUCCEEDED = 160263;
    public static final int CMD_OP_ENALBE_RESPONDER_FAILED = 160264;
    public static final int CMD_OP_REG_BINDER = 160265;
    private final android.net.wifi.rtt.WifiRttManager mNewService = null;
    private final android.content.Context mContext = null;
    private android.net.wifi.RttManager.RttCapabilities mRttCapabilities;
    @java.lang.Deprecated
    @android.annotation.SuppressLint("Doclava125")
    public android.net.wifi.RttManager.Capabilities getCapabilities() { return null; }
    public android.net.wifi.RttManager.RttCapabilities getRttCapabilities() { return null; }
    public void startRanging(android.net.wifi.RttManager.RttParams[] p0, android.net.wifi.RttManager.RttListener p1) {}
    public void stopRanging(android.net.wifi.RttManager.RttListener p0) {}
    public void enableResponder(android.net.wifi.RttManager.ResponderCallback p0) {}
    public void disableResponder(android.net.wifi.RttManager.ResponderCallback p0) {}
    public RttManager(android.content.Context p0, android.net.wifi.rtt.WifiRttManager p1) {}

    @java.lang.Deprecated
    public static class WifiInformationElement {
        public byte id;
        public byte[] data;
        public WifiInformationElement() {}
    }

    @java.lang.Deprecated
    public static class RttResult {
        public java.lang.String bssid;
        public int burstNumber;
        public int measurementFrameNumber;
        public int successMeasurementFrameNumber;
        public int frameNumberPerBurstPeer;
        public int status;
        @java.lang.Deprecated
        public int requestType;
        public int measurementType;
        public int retryAfterDuration;
        public long ts;
        public int rssi;
        @java.lang.Deprecated
        public int rssi_spread;
        public int rssiSpread;
        @java.lang.Deprecated
        public int tx_rate;
        public int txRate;
        public int rxRate;
        @java.lang.Deprecated
        public long rtt_ns;
        public long rtt;
        @java.lang.Deprecated
        public long rtt_sd_ns;
        public long rttStandardDeviation;
        @java.lang.Deprecated
        public long rtt_spread_ns;
        public long rttSpread;
        @java.lang.Deprecated
        public int distance_cm;
        public int distance;
        @java.lang.Deprecated
        public int distance_sd_cm;
        public int distanceStandardDeviation;
        @java.lang.Deprecated
        public int distance_spread_cm;
        public int distanceSpread;
        public int burstDuration;
        public int negotiatedBurstNum;
        public android.net.wifi.RttManager.WifiInformationElement LCI;
        public android.net.wifi.RttManager.WifiInformationElement LCR;
        public boolean secure;
        public RttResult() {}
    }

    @java.lang.Deprecated
    public static class RttParams {
        public int deviceType;
        public int requestType;
        public boolean secure;
        public java.lang.String bssid;
        public int frequency;
        public int channelWidth;
        public int centerFreq0;
        public int centerFreq1;
        @java.lang.Deprecated
        public int num_samples;
        @java.lang.Deprecated
        public int num_retries;
        public int numberBurst;
        public int interval;
        public int numSamplesPerBurst;
        public int numRetriesPerMeasurementFrame;
        public int numRetriesPerFTMR;
        public boolean LCIRequest;
        public boolean LCRRequest;
        public int burstTimeout;
        public int preamble;
        public int bandwidth;
        public RttParams() {}
        public java.lang.String toString() { return null; }
    }

    @java.lang.Deprecated
    public static interface RttListener {
        public void onSuccess(android.net.wifi.RttManager.RttResult[] p0);
        public void onFailure(int p0, java.lang.String p1);
        public void onAborted();
    }

    @java.lang.Deprecated
    public static class RttCapabilities implements android.os.Parcelable {
        @java.lang.Deprecated
        public boolean supportedType;
        @java.lang.Deprecated
        public boolean supportedPeerType;
        public boolean oneSidedRttSupported;
        public boolean twoSided11McRttSupported;
        public boolean lciSupported;
        public boolean lcrSupported;
        public int preambleSupported;
        public int bwSupported;
        public boolean responderSupported;
        public boolean secureRttSupported;
        public int mcVersion;
        public static final android.os.Parcelable.Creator<android.net.wifi.RttManager.RttCapabilities> CREATOR = null;
        public RttCapabilities() {}
        public java.lang.String toString() { return null; }
        public int describeContents() { return 0; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
    }

    @java.lang.Deprecated
    public static class ResponderConfig implements android.os.Parcelable {
        public java.lang.String macAddress;
        public int frequency;
        public int centerFreq0;
        public int centerFreq1;
        public int channelWidth;
        public int preamble;
        public static final android.os.Parcelable.Creator<android.net.wifi.RttManager.ResponderConfig> CREATOR = null;
        public ResponderConfig() {}
        public java.lang.String toString() { return null; }
        public int describeContents() { return 0; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
    }

    @java.lang.Deprecated
    public static abstract class ResponderCallback {
        public ResponderCallback() {}
        public abstract void onResponderEnabled(android.net.wifi.RttManager.ResponderConfig p0);
        public abstract void onResponderEnableFailure(int p0);
    }

    @java.lang.Deprecated
    public static class ParcelableRttResults implements android.os.Parcelable {
        public android.net.wifi.RttManager.RttResult[] mResults;
        public static final android.os.Parcelable.Creator<android.net.wifi.RttManager.ParcelableRttResults> CREATOR = null;
        public ParcelableRttResults(android.net.wifi.RttManager.RttResult[] p0) {}
        public java.lang.String toString() { return null; }
        public int describeContents() { return 0; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
    }

    @java.lang.Deprecated
    public static class ParcelableRttParams implements android.os.Parcelable {
        public android.net.wifi.RttManager.RttParams[] mParams;
        public static final android.os.Parcelable.Creator<android.net.wifi.RttManager.ParcelableRttParams> CREATOR = null;
        public ParcelableRttParams(android.net.wifi.RttManager.RttParams[] p0) {}
        public int describeContents() { return 0; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
    }

    @java.lang.Deprecated
    public class Capabilities {
        public int supportedType;
        public int supportedPeerType;
        public Capabilities(android.net.wifi.RttManager p0) {}
    }
}
