package android.net.wifi;

@java.lang.Deprecated
public class RttManager {
    @java.lang.Deprecated
    public static final int BASE = 160256;
    @java.lang.Deprecated
    public static final int CMD_OP_ABORTED = 160260;
    @java.lang.Deprecated
    public static final int CMD_OP_DISABLE_RESPONDER = 160262;
    @java.lang.Deprecated
    public static final int CMD_OP_ENABLE_RESPONDER = 160261;
    @java.lang.Deprecated
    public static final int CMD_OP_ENALBE_RESPONDER_FAILED = 160264;
    @java.lang.Deprecated
    public static final int CMD_OP_ENALBE_RESPONDER_SUCCEEDED = 160263;
    @java.lang.Deprecated
    public static final int CMD_OP_FAILED = 160258;
    @java.lang.Deprecated
    public static final int CMD_OP_START_RANGING = 160256;
    @java.lang.Deprecated
    public static final int CMD_OP_STOP_RANGING = 160257;
    @java.lang.Deprecated
    public static final int CMD_OP_SUCCEEDED = 160259;
    @java.lang.Deprecated
    public static final java.lang.String DESCRIPTION_KEY = "android.net.wifi.RttManager.Description";
    @java.lang.Deprecated
    public static final int PREAMBLE_HT = 2;
    @java.lang.Deprecated
    public static final int PREAMBLE_LEGACY = 1;
    @java.lang.Deprecated
    public static final int PREAMBLE_VHT = 4;
    @java.lang.Deprecated
    public static final int REASON_INITIATOR_NOT_ALLOWED_WHEN_RESPONDER_ON = -6;
    @java.lang.Deprecated
    public static final int REASON_INVALID_LISTENER = -3;
    @java.lang.Deprecated
    public static final int REASON_INVALID_REQUEST = -4;
    @java.lang.Deprecated
    public static final int REASON_NOT_AVAILABLE = -2;
    @java.lang.Deprecated
    public static final int REASON_PERMISSION_DENIED = -5;
    @java.lang.Deprecated
    public static final int REASON_UNSPECIFIED = -1;
    @java.lang.Deprecated
    public static final int RTT_BW_10_SUPPORT = 2;
    @java.lang.Deprecated
    public static final int RTT_BW_160_SUPPORT = 32;
    @java.lang.Deprecated
    public static final int RTT_BW_20_SUPPORT = 4;
    @java.lang.Deprecated
    public static final int RTT_BW_40_SUPPORT = 8;
    @java.lang.Deprecated
    public static final int RTT_BW_5_SUPPORT = 1;
    @java.lang.Deprecated
    public static final int RTT_BW_80_SUPPORT = 16;
    @java.lang.Deprecated
    public static final int RTT_CHANNEL_WIDTH_10 = 6;
    @java.lang.Deprecated
    public static final int RTT_CHANNEL_WIDTH_160 = 3;
    @java.lang.Deprecated
    public static final int RTT_CHANNEL_WIDTH_20 = 0;
    @java.lang.Deprecated
    public static final int RTT_CHANNEL_WIDTH_40 = 1;
    @java.lang.Deprecated
    public static final int RTT_CHANNEL_WIDTH_5 = 5;
    @java.lang.Deprecated
    public static final int RTT_CHANNEL_WIDTH_80 = 2;
    @java.lang.Deprecated
    public static final int RTT_CHANNEL_WIDTH_80P80 = 4;
    @java.lang.Deprecated
    public static final int RTT_CHANNEL_WIDTH_UNSPECIFIED = -1;
    @java.lang.Deprecated
    public static final int RTT_PEER_NAN = 5;
    @java.lang.Deprecated
    public static final int RTT_PEER_P2P_CLIENT = 4;
    @java.lang.Deprecated
    public static final int RTT_PEER_P2P_GO = 3;
    @java.lang.Deprecated
    public static final int RTT_PEER_TYPE_AP = 1;
    @java.lang.Deprecated
    public static final int RTT_PEER_TYPE_STA = 2;
    @java.lang.Deprecated
    public static final int RTT_PEER_TYPE_UNSPECIFIED = 0;
    @java.lang.Deprecated
    public static final int RTT_STATUS_ABORTED = 8;
    @java.lang.Deprecated
    public static final int RTT_STATUS_FAILURE = 1;
    @java.lang.Deprecated
    public static final int RTT_STATUS_FAIL_AP_ON_DIFF_CHANNEL = 6;
    @java.lang.Deprecated
    public static final int RTT_STATUS_FAIL_BUSY_TRY_LATER = 12;
    @java.lang.Deprecated
    public static final int RTT_STATUS_FAIL_FTM_PARAM_OVERRIDE = 15;
    @java.lang.Deprecated
    public static final int RTT_STATUS_FAIL_INVALID_TS = 9;
    @java.lang.Deprecated
    public static final int RTT_STATUS_FAIL_NOT_SCHEDULED_YET = 4;
    @java.lang.Deprecated
    public static final int RTT_STATUS_FAIL_NO_CAPABILITY = 7;
    @java.lang.Deprecated
    public static final int RTT_STATUS_FAIL_NO_RSP = 2;
    @java.lang.Deprecated
    public static final int RTT_STATUS_FAIL_PROTOCOL = 10;
    @java.lang.Deprecated
    public static final int RTT_STATUS_FAIL_REJECTED = 3;
    @java.lang.Deprecated
    public static final int RTT_STATUS_FAIL_SCHEDULE = 11;
    @java.lang.Deprecated
    public static final int RTT_STATUS_FAIL_TM_TIMEOUT = 5;
    @java.lang.Deprecated
    public static final int RTT_STATUS_INVALID_REQ = 13;
    @java.lang.Deprecated
    public static final int RTT_STATUS_NO_WIFI = 14;
    @java.lang.Deprecated
    public static final int RTT_STATUS_SUCCESS = 0;
    @java.lang.Deprecated
    public static final int RTT_TYPE_11_MC = 4;
    @java.lang.Deprecated
    public static final int RTT_TYPE_11_V = 2;
    @java.lang.Deprecated
    public static final int RTT_TYPE_ONE_SIDED = 1;
    @java.lang.Deprecated
    public static final int RTT_TYPE_TWO_SIDED = 2;
    @java.lang.Deprecated
    public static final int RTT_TYPE_UNSPECIFIED = 0;
    RttManager() {}
    @java.lang.Deprecated
    public android.net.wifi.RttManager.Capabilities getCapabilities() { return null; }
    @java.lang.Deprecated
    public android.net.wifi.RttManager.RttCapabilities getRttCapabilities() { return null; }
    @java.lang.Deprecated
    public void startRanging(android.net.wifi.RttManager.RttParams[] p0, android.net.wifi.RttManager.RttListener p1) {}
    @java.lang.Deprecated
    public void stopRanging(android.net.wifi.RttManager.RttListener p0) {}
    @java.lang.Deprecated
    public void enableResponder(android.net.wifi.RttManager.ResponderCallback p0) {}
    @java.lang.Deprecated
    public void disableResponder(android.net.wifi.RttManager.ResponderCallback p0) {}

    @java.lang.Deprecated
    public class Capabilities {
        @java.lang.Deprecated
        public int supportedPeerType;
        @java.lang.Deprecated
        public int supportedType;
        @java.lang.Deprecated
        public Capabilities(android.net.wifi.RttManager p0) {}
    }

    @java.lang.Deprecated
    public static class ParcelableRttParams implements android.os.Parcelable {
        @java.lang.Deprecated
        @android.annotation.NonNull
        public android.net.wifi.RttManager.RttParams[] mParams;
        ParcelableRttParams() {}
        public int describeContents() { return 0; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
    }

    @java.lang.Deprecated
    public static class ParcelableRttResults implements android.os.Parcelable {
        @java.lang.Deprecated
        public android.net.wifi.RttManager.RttResult[] mResults;
        @java.lang.Deprecated
        public ParcelableRttResults(android.net.wifi.RttManager.RttResult[] p0) {}
        public java.lang.String toString() { return null; }
        public int describeContents() { return 0; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
    }

    @java.lang.Deprecated
    public static abstract class ResponderCallback {
        @java.lang.Deprecated
        public ResponderCallback() {}
        @java.lang.Deprecated
        public abstract void onResponderEnabled(android.net.wifi.RttManager.ResponderConfig p0);
        @java.lang.Deprecated
        public abstract void onResponderEnableFailure(int p0);
    }

    @java.lang.Deprecated
    public static class ResponderConfig implements android.os.Parcelable {
        @java.lang.Deprecated
        @android.annotation.NonNull
        public static final android.os.Parcelable.Creator<android.net.wifi.RttManager.ResponderConfig> CREATOR = null;
        @java.lang.Deprecated
        public int centerFreq0;
        @java.lang.Deprecated
        public int centerFreq1;
        @java.lang.Deprecated
        public int channelWidth;
        @java.lang.Deprecated
        public int frequency;
        @java.lang.Deprecated
        public java.lang.String macAddress;
        @java.lang.Deprecated
        public int preamble;
        @java.lang.Deprecated
        public ResponderConfig() {}
        @java.lang.Deprecated
        @android.annotation.NonNull
        public java.lang.String toString() { return null; }
        @java.lang.Deprecated
        public int describeContents() { return 0; }
        @java.lang.Deprecated
        public void writeToParcel(android.os.Parcel p0, int p1) {}
    }

    @java.lang.Deprecated
    public static class RttCapabilities implements android.os.Parcelable {
        @java.lang.Deprecated
        public int bwSupported;
        @java.lang.Deprecated
        public boolean lciSupported;
        @java.lang.Deprecated
        public boolean lcrSupported;
        @java.lang.Deprecated
        public int mcVersion;
        @java.lang.Deprecated
        public boolean oneSidedRttSupported;
        @java.lang.Deprecated
        public int preambleSupported;
        @java.lang.Deprecated
        public boolean responderSupported;
        @java.lang.Deprecated
        public boolean secureRttSupported;
        @java.lang.Deprecated
        public boolean supportedPeerType;
        @java.lang.Deprecated
        public boolean supportedType;
        @java.lang.Deprecated
        public boolean twoSided11McRttSupported;
        @java.lang.Deprecated
        public RttCapabilities() {}
        @java.lang.Deprecated
        @android.annotation.NonNull
        public java.lang.String toString() { return null; }
        public int describeContents() { return 0; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
    }

    @java.lang.Deprecated
    public static interface RttListener {
        @java.lang.Deprecated
        public void onSuccess(android.net.wifi.RttManager.RttResult[] p0);
        @java.lang.Deprecated
        public void onFailure(int p0, java.lang.String p1);
        @java.lang.Deprecated
        public void onAborted();
    }

    @java.lang.Deprecated
    public static class RttParams {
        @java.lang.Deprecated
        public boolean LCIRequest;
        @java.lang.Deprecated
        public boolean LCRRequest;
        @java.lang.Deprecated
        public int bandwidth;
        @java.lang.Deprecated
        public java.lang.String bssid;
        @java.lang.Deprecated
        public int burstTimeout;
        @java.lang.Deprecated
        public int centerFreq0;
        @java.lang.Deprecated
        public int centerFreq1;
        @java.lang.Deprecated
        public int channelWidth;
        @java.lang.Deprecated
        public int deviceType;
        @java.lang.Deprecated
        public int frequency;
        @java.lang.Deprecated
        public int interval;
        @java.lang.Deprecated
        public int numRetriesPerFTMR;
        @java.lang.Deprecated
        public int numRetriesPerMeasurementFrame;
        @java.lang.Deprecated
        public int numSamplesPerBurst;
        @java.lang.Deprecated
        public int num_retries;
        @java.lang.Deprecated
        public int num_samples;
        @java.lang.Deprecated
        public int numberBurst;
        @java.lang.Deprecated
        public int preamble;
        @java.lang.Deprecated
        public int requestType;
        @java.lang.Deprecated
        public boolean secure;
        @java.lang.Deprecated
        public RttParams() {}
        public java.lang.String toString() { return null; }
    }

    @java.lang.Deprecated
    public static class RttResult {
        @java.lang.Deprecated
        public android.net.wifi.RttManager.WifiInformationElement LCI;
        @java.lang.Deprecated
        public android.net.wifi.RttManager.WifiInformationElement LCR;
        @java.lang.Deprecated
        public java.lang.String bssid;
        @java.lang.Deprecated
        public int burstDuration;
        @java.lang.Deprecated
        public int burstNumber;
        @java.lang.Deprecated
        public int distance;
        @java.lang.Deprecated
        public int distanceSpread;
        @java.lang.Deprecated
        public int distanceStandardDeviation;
        @java.lang.Deprecated
        public int distance_cm;
        @java.lang.Deprecated
        public int distance_sd_cm;
        @java.lang.Deprecated
        public int distance_spread_cm;
        @java.lang.Deprecated
        public int frameNumberPerBurstPeer;
        @java.lang.Deprecated
        public int measurementFrameNumber;
        @java.lang.Deprecated
        public int measurementType;
        @java.lang.Deprecated
        public int negotiatedBurstNum;
        @java.lang.Deprecated
        public int requestType;
        @java.lang.Deprecated
        public int retryAfterDuration;
        @java.lang.Deprecated
        public int rssi;
        @java.lang.Deprecated
        public int rssiSpread;
        @java.lang.Deprecated
        public int rssi_spread;
        @java.lang.Deprecated
        public long rtt;
        @java.lang.Deprecated
        public long rttSpread;
        @java.lang.Deprecated
        public long rttStandardDeviation;
        @java.lang.Deprecated
        public long rtt_ns;
        @java.lang.Deprecated
        public long rtt_sd_ns;
        @java.lang.Deprecated
        public long rtt_spread_ns;
        @java.lang.Deprecated
        public int rxRate;
        @java.lang.Deprecated
        public boolean secure;
        @java.lang.Deprecated
        public int status;
        @java.lang.Deprecated
        public int successMeasurementFrameNumber;
        @java.lang.Deprecated
        public long ts;
        @java.lang.Deprecated
        public int txRate;
        @java.lang.Deprecated
        public int tx_rate;
        @java.lang.Deprecated
        public RttResult() {}
    }

    @java.lang.Deprecated
    public static class WifiInformationElement {
        @java.lang.Deprecated
        public byte[] data;
        @java.lang.Deprecated
        public byte id;
        @java.lang.Deprecated
        public WifiInformationElement() {}
    }
}
