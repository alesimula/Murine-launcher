package com.android.server.wifi.nano;

public interface WifiMetricsProto {

    public static final class WpsMetrics extends com.android.framework.protobuf.nano.MessageNano {
        private static volatile com.android.server.wifi.nano.WifiMetricsProto.WpsMetrics[] _emptyArray;
        public int numWpsAttempts;
        public int numWpsSuccess;
        public int numWpsStartFailure;
        public int numWpsOverlapFailure;
        public int numWpsTimeoutFailure;
        public int numWpsOtherConnectionFailure;
        public int numWpsSupplicantFailure;
        public int numWpsCancellation;
        public static com.android.server.wifi.nano.WifiMetricsProto.WpsMetrics[] emptyArray() { return null; }
        public WpsMetrics() { super(); }
        public com.android.server.wifi.nano.WifiMetricsProto.WpsMetrics clear() { return null; }
        public void writeTo(com.android.framework.protobuf.nano.CodedOutputByteBufferNano p0) throws java.io.IOException {}
        protected int computeSerializedSize() { return 0; }
        public com.android.server.wifi.nano.WifiMetricsProto.WpsMetrics mergeFrom(com.android.framework.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
        public static com.android.server.wifi.nano.WifiMetricsProto.WpsMetrics parseFrom(byte[] p0) throws com.android.framework.protobuf.nano.InvalidProtocolBufferNanoException { return null; }
        public static com.android.server.wifi.nano.WifiMetricsProto.WpsMetrics parseFrom(com.android.framework.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
    }

    public static final class WifiWakeStats extends com.android.framework.protobuf.nano.MessageNano {
        private static volatile com.android.server.wifi.nano.WifiMetricsProto.WifiWakeStats[] _emptyArray;
        public int numSessions;
        public com.android.server.wifi.nano.WifiMetricsProto.WifiWakeStats.Session[] sessions;
        public int numIgnoredStarts;
        public int numWakeups;
        public static com.android.server.wifi.nano.WifiMetricsProto.WifiWakeStats[] emptyArray() { return null; }
        public WifiWakeStats() { super(); }
        public com.android.server.wifi.nano.WifiMetricsProto.WifiWakeStats clear() { return null; }
        public void writeTo(com.android.framework.protobuf.nano.CodedOutputByteBufferNano p0) throws java.io.IOException {}
        protected int computeSerializedSize() { return 0; }
        public com.android.server.wifi.nano.WifiMetricsProto.WifiWakeStats mergeFrom(com.android.framework.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
        public static com.android.server.wifi.nano.WifiMetricsProto.WifiWakeStats parseFrom(byte[] p0) throws com.android.framework.protobuf.nano.InvalidProtocolBufferNanoException { return null; }
        public static com.android.server.wifi.nano.WifiMetricsProto.WifiWakeStats parseFrom(com.android.framework.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }

        public static final class Session extends com.android.framework.protobuf.nano.MessageNano {
            private static volatile com.android.server.wifi.nano.WifiMetricsProto.WifiWakeStats.Session[] _emptyArray;
            public long startTimeMillis;
            public int lockedNetworksAtStart;
            public int lockedNetworksAtInitialize;
            public com.android.server.wifi.nano.WifiMetricsProto.WifiWakeStats.Session.Event initializeEvent;
            public com.android.server.wifi.nano.WifiMetricsProto.WifiWakeStats.Session.Event unlockEvent;
            public com.android.server.wifi.nano.WifiMetricsProto.WifiWakeStats.Session.Event wakeupEvent;
            public com.android.server.wifi.nano.WifiMetricsProto.WifiWakeStats.Session.Event resetEvent;
            public static com.android.server.wifi.nano.WifiMetricsProto.WifiWakeStats.Session[] emptyArray() { return null; }
            public Session() { super(); }
            public com.android.server.wifi.nano.WifiMetricsProto.WifiWakeStats.Session clear() { return null; }
            public void writeTo(com.android.framework.protobuf.nano.CodedOutputByteBufferNano p0) throws java.io.IOException {}
            protected int computeSerializedSize() { return 0; }
            public com.android.server.wifi.nano.WifiMetricsProto.WifiWakeStats.Session mergeFrom(com.android.framework.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
            public static com.android.server.wifi.nano.WifiMetricsProto.WifiWakeStats.Session parseFrom(byte[] p0) throws com.android.framework.protobuf.nano.InvalidProtocolBufferNanoException { return null; }
            public static com.android.server.wifi.nano.WifiMetricsProto.WifiWakeStats.Session parseFrom(com.android.framework.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }

            public static final class Event extends com.android.framework.protobuf.nano.MessageNano {
                private static volatile com.android.server.wifi.nano.WifiMetricsProto.WifiWakeStats.Session.Event[] _emptyArray;
                public long elapsedTimeMillis;
                public int elapsedScans;
                public static com.android.server.wifi.nano.WifiMetricsProto.WifiWakeStats.Session.Event[] emptyArray() { return null; }
                public Event() { super(); }
                public com.android.server.wifi.nano.WifiMetricsProto.WifiWakeStats.Session.Event clear() { return null; }
                public void writeTo(com.android.framework.protobuf.nano.CodedOutputByteBufferNano p0) throws java.io.IOException {}
                protected int computeSerializedSize() { return 0; }
                public com.android.server.wifi.nano.WifiMetricsProto.WifiWakeStats.Session.Event mergeFrom(com.android.framework.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
                public static com.android.server.wifi.nano.WifiMetricsProto.WifiWakeStats.Session.Event parseFrom(byte[] p0) throws com.android.framework.protobuf.nano.InvalidProtocolBufferNanoException { return null; }
                public static com.android.server.wifi.nano.WifiMetricsProto.WifiWakeStats.Session.Event parseFrom(com.android.framework.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
            }
        }
    }

    public static final class WifiUsabilityStatsEntry extends com.android.framework.protobuf.nano.MessageNano {
        public static final int PROBE_STATUS_UNKNOWN = 0;
        public static final int PROBE_STATUS_NO_PROBE = 1;
        public static final int PROBE_STATUS_SUCCESS = 2;
        public static final int PROBE_STATUS_FAILURE = 3;
        public static final int NETWORK_TYPE_UNKNOWN = 0;
        public static final int NETWORK_TYPE_GSM = 1;
        public static final int NETWORK_TYPE_CDMA = 2;
        public static final int NETWORK_TYPE_EVDO_0 = 3;
        public static final int NETWORK_TYPE_UMTS = 4;
        public static final int NETWORK_TYPE_TD_SCDMA = 5;
        public static final int NETWORK_TYPE_LTE = 6;
        public static final int NETWORK_TYPE_NR = 7;
        private static volatile com.android.server.wifi.nano.WifiMetricsProto.WifiUsabilityStatsEntry[] _emptyArray;
        public long timeStampMs;
        public int rssi;
        public int linkSpeedMbps;
        public long totalTxSuccess;
        public long totalTxRetries;
        public long totalTxBad;
        public long totalRxSuccess;
        public long totalRadioOnTimeMs;
        public long totalRadioTxTimeMs;
        public long totalRadioRxTimeMs;
        public long totalScanTimeMs;
        public long totalNanScanTimeMs;
        public long totalBackgroundScanTimeMs;
        public long totalRoamScanTimeMs;
        public long totalPnoScanTimeMs;
        public long totalHotspot2ScanTimeMs;
        public int wifiScore;
        public int wifiUsabilityScore;
        public int seqNumToFramework;
        public long totalCcaBusyFreqTimeMs;
        public long totalRadioOnFreqTimeMs;
        public long totalBeaconRx;
        public int predictionHorizonSec;
        public int probeStatusSinceLastUpdate;
        public int probeElapsedTimeSinceLastUpdateMs;
        public int probeMcsRateSinceLastUpdate;
        public int rxLinkSpeedMbps;
        public int seqNumInsideFramework;
        public boolean isSameBssidAndFreq;
        public int cellularDataNetworkType;
        public int cellularSignalStrengthDbm;
        public int cellularSignalStrengthDb;
        public boolean isSameRegisteredCell;
        public int deviceMobilityState;
        public static com.android.server.wifi.nano.WifiMetricsProto.WifiUsabilityStatsEntry[] emptyArray() { return null; }
        public WifiUsabilityStatsEntry() { super(); }
        public com.android.server.wifi.nano.WifiMetricsProto.WifiUsabilityStatsEntry clear() { return null; }
        public void writeTo(com.android.framework.protobuf.nano.CodedOutputByteBufferNano p0) throws java.io.IOException {}
        protected int computeSerializedSize() { return 0; }
        public com.android.server.wifi.nano.WifiMetricsProto.WifiUsabilityStatsEntry mergeFrom(com.android.framework.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
        public static com.android.server.wifi.nano.WifiMetricsProto.WifiUsabilityStatsEntry parseFrom(byte[] p0) throws com.android.framework.protobuf.nano.InvalidProtocolBufferNanoException { return null; }
        public static com.android.server.wifi.nano.WifiMetricsProto.WifiUsabilityStatsEntry parseFrom(com.android.framework.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
    }

    public static final class WifiUsabilityStats extends com.android.framework.protobuf.nano.MessageNano {
        public static final int LABEL_UNKNOWN = 0;
        public static final int LABEL_GOOD = 1;
        public static final int LABEL_BAD = 2;
        public static final int TYPE_UNKNOWN = 0;
        public static final int TYPE_DATA_STALL_BAD_TX = 1;
        public static final int TYPE_DATA_STALL_TX_WITHOUT_RX = 2;
        public static final int TYPE_DATA_STALL_BOTH = 3;
        public static final int TYPE_FIRMWARE_ALERT = 4;
        public static final int TYPE_IP_REACHABILITY_LOST = 5;
        private static volatile com.android.server.wifi.nano.WifiMetricsProto.WifiUsabilityStats[] _emptyArray;
        public int label;
        public com.android.server.wifi.nano.WifiMetricsProto.WifiUsabilityStatsEntry[] stats;
        public int triggerType;
        public int firmwareAlertCode;
        public long timeStampMs;
        public static com.android.server.wifi.nano.WifiMetricsProto.WifiUsabilityStats[] emptyArray() { return null; }
        public WifiUsabilityStats() { super(); }
        public com.android.server.wifi.nano.WifiMetricsProto.WifiUsabilityStats clear() { return null; }
        public void writeTo(com.android.framework.protobuf.nano.CodedOutputByteBufferNano p0) throws java.io.IOException {}
        protected int computeSerializedSize() { return 0; }
        public com.android.server.wifi.nano.WifiMetricsProto.WifiUsabilityStats mergeFrom(com.android.framework.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
        public static com.android.server.wifi.nano.WifiMetricsProto.WifiUsabilityStats parseFrom(byte[] p0) throws com.android.framework.protobuf.nano.InvalidProtocolBufferNanoException { return null; }
        public static com.android.server.wifi.nano.WifiMetricsProto.WifiUsabilityStats parseFrom(com.android.framework.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
    }

    public static final class WifiUsabilityScoreCount extends com.android.framework.protobuf.nano.MessageNano {
        private static volatile com.android.server.wifi.nano.WifiMetricsProto.WifiUsabilityScoreCount[] _emptyArray;
        public int score;
        public int count;
        public static com.android.server.wifi.nano.WifiMetricsProto.WifiUsabilityScoreCount[] emptyArray() { return null; }
        public WifiUsabilityScoreCount() { super(); }
        public com.android.server.wifi.nano.WifiMetricsProto.WifiUsabilityScoreCount clear() { return null; }
        public void writeTo(com.android.framework.protobuf.nano.CodedOutputByteBufferNano p0) throws java.io.IOException {}
        protected int computeSerializedSize() { return 0; }
        public com.android.server.wifi.nano.WifiMetricsProto.WifiUsabilityScoreCount mergeFrom(com.android.framework.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
        public static com.android.server.wifi.nano.WifiMetricsProto.WifiUsabilityScoreCount parseFrom(byte[] p0) throws com.android.framework.protobuf.nano.InvalidProtocolBufferNanoException { return null; }
        public static com.android.server.wifi.nano.WifiMetricsProto.WifiUsabilityScoreCount parseFrom(com.android.framework.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
    }

    public static final class WifiToggleStats extends com.android.framework.protobuf.nano.MessageNano {
        private static volatile com.android.server.wifi.nano.WifiMetricsProto.WifiToggleStats[] _emptyArray;
        public int numToggleOnPrivileged;
        public int numToggleOffPrivileged;
        public int numToggleOnNormal;
        public int numToggleOffNormal;
        public static com.android.server.wifi.nano.WifiMetricsProto.WifiToggleStats[] emptyArray() { return null; }
        public WifiToggleStats() { super(); }
        public com.android.server.wifi.nano.WifiMetricsProto.WifiToggleStats clear() { return null; }
        public void writeTo(com.android.framework.protobuf.nano.CodedOutputByteBufferNano p0) throws java.io.IOException {}
        protected int computeSerializedSize() { return 0; }
        public com.android.server.wifi.nano.WifiMetricsProto.WifiToggleStats mergeFrom(com.android.framework.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
        public static com.android.server.wifi.nano.WifiMetricsProto.WifiToggleStats parseFrom(byte[] p0) throws com.android.framework.protobuf.nano.InvalidProtocolBufferNanoException { return null; }
        public static com.android.server.wifi.nano.WifiMetricsProto.WifiToggleStats parseFrom(com.android.framework.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
    }

    public static final class WifiScoreCount extends com.android.framework.protobuf.nano.MessageNano {
        private static volatile com.android.server.wifi.nano.WifiMetricsProto.WifiScoreCount[] _emptyArray;
        public int score;
        public int count;
        public static com.android.server.wifi.nano.WifiMetricsProto.WifiScoreCount[] emptyArray() { return null; }
        public WifiScoreCount() { super(); }
        public com.android.server.wifi.nano.WifiMetricsProto.WifiScoreCount clear() { return null; }
        public void writeTo(com.android.framework.protobuf.nano.CodedOutputByteBufferNano p0) throws java.io.IOException {}
        protected int computeSerializedSize() { return 0; }
        public com.android.server.wifi.nano.WifiMetricsProto.WifiScoreCount mergeFrom(com.android.framework.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
        public static com.android.server.wifi.nano.WifiMetricsProto.WifiScoreCount parseFrom(byte[] p0) throws com.android.framework.protobuf.nano.InvalidProtocolBufferNanoException { return null; }
        public static com.android.server.wifi.nano.WifiMetricsProto.WifiScoreCount parseFrom(com.android.framework.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
    }

    public static final class WifiRttLog extends com.android.framework.protobuf.nano.MessageNano {
        public static final int OVERALL_UNKNOWN = 0;
        public static final int OVERALL_SUCCESS = 1;
        public static final int OVERALL_FAIL = 2;
        public static final int OVERALL_RTT_NOT_AVAILABLE = 3;
        public static final int OVERALL_TIMEOUT = 4;
        public static final int OVERALL_THROTTLE = 5;
        public static final int OVERALL_HAL_FAILURE = 6;
        public static final int OVERALL_AWARE_TRANSLATION_FAILURE = 7;
        public static final int OVERALL_LOCATION_PERMISSION_MISSING = 8;
        public static final int UNKNOWN = 0;
        public static final int SUCCESS = 1;
        public static final int FAILURE = 2;
        public static final int FAIL_NO_RSP = 3;
        public static final int FAIL_REJECTED = 4;
        public static final int FAIL_NOT_SCHEDULED_YET = 5;
        public static final int FAIL_TM_TIMEOUT = 6;
        public static final int FAIL_AP_ON_DIFF_CHANNEL = 7;
        public static final int FAIL_NO_CAPABILITY = 8;
        public static final int ABORTED = 9;
        public static final int FAIL_INVALID_TS = 10;
        public static final int FAIL_PROTOCOL = 11;
        public static final int FAIL_SCHEDULE = 12;
        public static final int FAIL_BUSY_TRY_LATER = 13;
        public static final int INVALID_REQ = 14;
        public static final int NO_WIFI = 15;
        public static final int FAIL_FTM_PARAM_OVERRIDE = 16;
        public static final int MISSING_RESULT = 17;
        private static volatile com.android.server.wifi.nano.WifiMetricsProto.WifiRttLog[] _emptyArray;
        public int numRequests;
        public com.android.server.wifi.nano.WifiMetricsProto.WifiRttLog.RttOverallStatusHistogramBucket[] histogramOverallStatus;
        public com.android.server.wifi.nano.WifiMetricsProto.WifiRttLog.RttToPeerLog rttToAp;
        public com.android.server.wifi.nano.WifiMetricsProto.WifiRttLog.RttToPeerLog rttToAware;
        public static com.android.server.wifi.nano.WifiMetricsProto.WifiRttLog[] emptyArray() { return null; }
        public WifiRttLog() { super(); }
        public com.android.server.wifi.nano.WifiMetricsProto.WifiRttLog clear() { return null; }
        public void writeTo(com.android.framework.protobuf.nano.CodedOutputByteBufferNano p0) throws java.io.IOException {}
        protected int computeSerializedSize() { return 0; }
        public com.android.server.wifi.nano.WifiMetricsProto.WifiRttLog mergeFrom(com.android.framework.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
        public static com.android.server.wifi.nano.WifiMetricsProto.WifiRttLog parseFrom(byte[] p0) throws com.android.framework.protobuf.nano.InvalidProtocolBufferNanoException { return null; }
        public static com.android.server.wifi.nano.WifiMetricsProto.WifiRttLog parseFrom(com.android.framework.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }

        public static final class RttToPeerLog extends com.android.framework.protobuf.nano.MessageNano {
            private static volatile com.android.server.wifi.nano.WifiMetricsProto.WifiRttLog.RttToPeerLog[] _emptyArray;
            public int numRequests;
            public int numIndividualRequests;
            public int numApps;
            public com.android.server.wifi.nano.WifiMetricsProto.WifiRttLog.HistogramBucket[] histogramNumRequestsPerApp;
            public com.android.server.wifi.nano.WifiMetricsProto.WifiRttLog.HistogramBucket[] histogramNumPeersPerRequest;
            public com.android.server.wifi.nano.WifiMetricsProto.WifiRttLog.RttIndividualStatusHistogramBucket[] histogramIndividualStatus;
            public com.android.server.wifi.nano.WifiMetricsProto.WifiRttLog.HistogramBucket[] histogramDistance;
            public com.android.server.wifi.nano.WifiMetricsProto.WifiRttLog.HistogramBucket[] histogramRequestIntervalMs;
            public static com.android.server.wifi.nano.WifiMetricsProto.WifiRttLog.RttToPeerLog[] emptyArray() { return null; }
            public RttToPeerLog() { super(); }
            public com.android.server.wifi.nano.WifiMetricsProto.WifiRttLog.RttToPeerLog clear() { return null; }
            public void writeTo(com.android.framework.protobuf.nano.CodedOutputByteBufferNano p0) throws java.io.IOException {}
            protected int computeSerializedSize() { return 0; }
            public com.android.server.wifi.nano.WifiMetricsProto.WifiRttLog.RttToPeerLog mergeFrom(com.android.framework.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
            public static com.android.server.wifi.nano.WifiMetricsProto.WifiRttLog.RttToPeerLog parseFrom(byte[] p0) throws com.android.framework.protobuf.nano.InvalidProtocolBufferNanoException { return null; }
            public static com.android.server.wifi.nano.WifiMetricsProto.WifiRttLog.RttToPeerLog parseFrom(com.android.framework.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
        }

        public static final class RttOverallStatusHistogramBucket extends com.android.framework.protobuf.nano.MessageNano {
            private static volatile com.android.server.wifi.nano.WifiMetricsProto.WifiRttLog.RttOverallStatusHistogramBucket[] _emptyArray;
            public int statusType;
            public int count;
            public static com.android.server.wifi.nano.WifiMetricsProto.WifiRttLog.RttOverallStatusHistogramBucket[] emptyArray() { return null; }
            public RttOverallStatusHistogramBucket() { super(); }
            public com.android.server.wifi.nano.WifiMetricsProto.WifiRttLog.RttOverallStatusHistogramBucket clear() { return null; }
            public void writeTo(com.android.framework.protobuf.nano.CodedOutputByteBufferNano p0) throws java.io.IOException {}
            protected int computeSerializedSize() { return 0; }
            public com.android.server.wifi.nano.WifiMetricsProto.WifiRttLog.RttOverallStatusHistogramBucket mergeFrom(com.android.framework.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
            public static com.android.server.wifi.nano.WifiMetricsProto.WifiRttLog.RttOverallStatusHistogramBucket parseFrom(byte[] p0) throws com.android.framework.protobuf.nano.InvalidProtocolBufferNanoException { return null; }
            public static com.android.server.wifi.nano.WifiMetricsProto.WifiRttLog.RttOverallStatusHistogramBucket parseFrom(com.android.framework.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
        }

        public static final class RttIndividualStatusHistogramBucket extends com.android.framework.protobuf.nano.MessageNano {
            private static volatile com.android.server.wifi.nano.WifiMetricsProto.WifiRttLog.RttIndividualStatusHistogramBucket[] _emptyArray;
            public int statusType;
            public int count;
            public static com.android.server.wifi.nano.WifiMetricsProto.WifiRttLog.RttIndividualStatusHistogramBucket[] emptyArray() { return null; }
            public RttIndividualStatusHistogramBucket() { super(); }
            public com.android.server.wifi.nano.WifiMetricsProto.WifiRttLog.RttIndividualStatusHistogramBucket clear() { return null; }
            public void writeTo(com.android.framework.protobuf.nano.CodedOutputByteBufferNano p0) throws java.io.IOException {}
            protected int computeSerializedSize() { return 0; }
            public com.android.server.wifi.nano.WifiMetricsProto.WifiRttLog.RttIndividualStatusHistogramBucket mergeFrom(com.android.framework.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
            public static com.android.server.wifi.nano.WifiMetricsProto.WifiRttLog.RttIndividualStatusHistogramBucket parseFrom(byte[] p0) throws com.android.framework.protobuf.nano.InvalidProtocolBufferNanoException { return null; }
            public static com.android.server.wifi.nano.WifiMetricsProto.WifiRttLog.RttIndividualStatusHistogramBucket parseFrom(com.android.framework.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
        }

        public static final class HistogramBucket extends com.android.framework.protobuf.nano.MessageNano {
            private static volatile com.android.server.wifi.nano.WifiMetricsProto.WifiRttLog.HistogramBucket[] _emptyArray;
            public long start;
            public long end;
            public int count;
            public static com.android.server.wifi.nano.WifiMetricsProto.WifiRttLog.HistogramBucket[] emptyArray() { return null; }
            public HistogramBucket() { super(); }
            public com.android.server.wifi.nano.WifiMetricsProto.WifiRttLog.HistogramBucket clear() { return null; }
            public void writeTo(com.android.framework.protobuf.nano.CodedOutputByteBufferNano p0) throws java.io.IOException {}
            protected int computeSerializedSize() { return 0; }
            public com.android.server.wifi.nano.WifiMetricsProto.WifiRttLog.HistogramBucket mergeFrom(com.android.framework.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
            public static com.android.server.wifi.nano.WifiMetricsProto.WifiRttLog.HistogramBucket parseFrom(byte[] p0) throws com.android.framework.protobuf.nano.InvalidProtocolBufferNanoException { return null; }
            public static com.android.server.wifi.nano.WifiMetricsProto.WifiRttLog.HistogramBucket parseFrom(com.android.framework.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
        }
    }

    public static final class WifiRadioUsage extends com.android.framework.protobuf.nano.MessageNano {
        private static volatile com.android.server.wifi.nano.WifiMetricsProto.WifiRadioUsage[] _emptyArray;
        public long loggingDurationMs;
        public long scanTimeMs;
        public static com.android.server.wifi.nano.WifiMetricsProto.WifiRadioUsage[] emptyArray() { return null; }
        public WifiRadioUsage() { super(); }
        public com.android.server.wifi.nano.WifiMetricsProto.WifiRadioUsage clear() { return null; }
        public void writeTo(com.android.framework.protobuf.nano.CodedOutputByteBufferNano p0) throws java.io.IOException {}
        protected int computeSerializedSize() { return 0; }
        public com.android.server.wifi.nano.WifiMetricsProto.WifiRadioUsage mergeFrom(com.android.framework.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
        public static com.android.server.wifi.nano.WifiMetricsProto.WifiRadioUsage parseFrom(byte[] p0) throws com.android.framework.protobuf.nano.InvalidProtocolBufferNanoException { return null; }
        public static com.android.server.wifi.nano.WifiMetricsProto.WifiRadioUsage parseFrom(com.android.framework.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
    }

    public static final class WifiPowerStats extends com.android.framework.protobuf.nano.MessageNano {
        private static volatile com.android.server.wifi.nano.WifiMetricsProto.WifiPowerStats[] _emptyArray;
        public long loggingDurationMs;
        public double energyConsumedMah;
        public long idleTimeMs;
        public long rxTimeMs;
        public long txTimeMs;
        public long wifiKernelActiveTimeMs;
        public long numPacketsTx;
        public long numBytesTx;
        public long numPacketsRx;
        public long numBytesRx;
        public long sleepTimeMs;
        public long scanTimeMs;
        public double monitoredRailEnergyConsumedMah;
        public static com.android.server.wifi.nano.WifiMetricsProto.WifiPowerStats[] emptyArray() { return null; }
        public WifiPowerStats() { super(); }
        public com.android.server.wifi.nano.WifiMetricsProto.WifiPowerStats clear() { return null; }
        public void writeTo(com.android.framework.protobuf.nano.CodedOutputByteBufferNano p0) throws java.io.IOException {}
        protected int computeSerializedSize() { return 0; }
        public com.android.server.wifi.nano.WifiMetricsProto.WifiPowerStats mergeFrom(com.android.framework.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
        public static com.android.server.wifi.nano.WifiMetricsProto.WifiPowerStats parseFrom(byte[] p0) throws com.android.framework.protobuf.nano.InvalidProtocolBufferNanoException { return null; }
        public static com.android.server.wifi.nano.WifiMetricsProto.WifiPowerStats parseFrom(com.android.framework.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
    }

    public static final class WifiP2pStats extends com.android.framework.protobuf.nano.MessageNano {
        private static volatile com.android.server.wifi.nano.WifiMetricsProto.WifiP2pStats[] _emptyArray;
        public com.android.server.wifi.nano.WifiMetricsProto.GroupEvent[] groupEvent;
        public com.android.server.wifi.nano.WifiMetricsProto.P2pConnectionEvent[] connectionEvent;
        public int numPersistentGroup;
        public int numTotalPeerScans;
        public int numTotalServiceScans;
        public static com.android.server.wifi.nano.WifiMetricsProto.WifiP2pStats[] emptyArray() { return null; }
        public WifiP2pStats() { super(); }
        public com.android.server.wifi.nano.WifiMetricsProto.WifiP2pStats clear() { return null; }
        public void writeTo(com.android.framework.protobuf.nano.CodedOutputByteBufferNano p0) throws java.io.IOException {}
        protected int computeSerializedSize() { return 0; }
        public com.android.server.wifi.nano.WifiMetricsProto.WifiP2pStats mergeFrom(com.android.framework.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
        public static com.android.server.wifi.nano.WifiMetricsProto.WifiP2pStats parseFrom(byte[] p0) throws com.android.framework.protobuf.nano.InvalidProtocolBufferNanoException { return null; }
        public static com.android.server.wifi.nano.WifiMetricsProto.WifiP2pStats parseFrom(com.android.framework.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
    }

    public static final class WifiNetworkSuggestionApiLog extends com.android.framework.protobuf.nano.MessageNano {
        private static volatile com.android.server.wifi.nano.WifiMetricsProto.WifiNetworkSuggestionApiLog[] _emptyArray;
        public int numModification;
        public int numConnectSuccess;
        public int numConnectFailure;
        public com.android.server.wifi.nano.WifiMetricsProto.HistogramBucketInt32[] networkListSizeHistogram;
        public static com.android.server.wifi.nano.WifiMetricsProto.WifiNetworkSuggestionApiLog[] emptyArray() { return null; }
        public WifiNetworkSuggestionApiLog() { super(); }
        public com.android.server.wifi.nano.WifiMetricsProto.WifiNetworkSuggestionApiLog clear() { return null; }
        public void writeTo(com.android.framework.protobuf.nano.CodedOutputByteBufferNano p0) throws java.io.IOException {}
        protected int computeSerializedSize() { return 0; }
        public com.android.server.wifi.nano.WifiMetricsProto.WifiNetworkSuggestionApiLog mergeFrom(com.android.framework.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
        public static com.android.server.wifi.nano.WifiMetricsProto.WifiNetworkSuggestionApiLog parseFrom(byte[] p0) throws com.android.framework.protobuf.nano.InvalidProtocolBufferNanoException { return null; }
        public static com.android.server.wifi.nano.WifiMetricsProto.WifiNetworkSuggestionApiLog parseFrom(com.android.framework.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
    }

    public static final class WifiNetworkRequestApiLog extends com.android.framework.protobuf.nano.MessageNano {
        private static volatile com.android.server.wifi.nano.WifiMetricsProto.WifiNetworkRequestApiLog[] _emptyArray;
        public int numRequest;
        public com.android.server.wifi.nano.WifiMetricsProto.HistogramBucketInt32[] networkMatchSizeHistogram;
        public int numConnectSuccess;
        public int numUserApprovalBypass;
        public int numUserReject;
        public int numApps;
        public static com.android.server.wifi.nano.WifiMetricsProto.WifiNetworkRequestApiLog[] emptyArray() { return null; }
        public WifiNetworkRequestApiLog() { super(); }
        public com.android.server.wifi.nano.WifiMetricsProto.WifiNetworkRequestApiLog clear() { return null; }
        public void writeTo(com.android.framework.protobuf.nano.CodedOutputByteBufferNano p0) throws java.io.IOException {}
        protected int computeSerializedSize() { return 0; }
        public com.android.server.wifi.nano.WifiMetricsProto.WifiNetworkRequestApiLog mergeFrom(com.android.framework.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
        public static com.android.server.wifi.nano.WifiMetricsProto.WifiNetworkRequestApiLog parseFrom(byte[] p0) throws com.android.framework.protobuf.nano.InvalidProtocolBufferNanoException { return null; }
        public static com.android.server.wifi.nano.WifiMetricsProto.WifiNetworkRequestApiLog parseFrom(com.android.framework.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
    }

    public static final class WifiLog extends com.android.framework.protobuf.nano.MessageNano {
        public static final int SCAN_UNKNOWN = 0;
        public static final int SCAN_SUCCESS = 1;
        public static final int SCAN_FAILURE_INTERRUPTED = 2;
        public static final int SCAN_FAILURE_INVALID_CONFIGURATION = 3;
        public static final int FAILURE_WIFI_DISABLED = 4;
        public static final int WIFI_UNKNOWN = 0;
        public static final int WIFI_DISABLED = 1;
        public static final int WIFI_DISCONNECTED = 2;
        public static final int WIFI_ASSOCIATED = 3;
        private static volatile com.android.server.wifi.nano.WifiMetricsProto.WifiLog[] _emptyArray;
        public com.android.server.wifi.nano.WifiMetricsProto.ConnectionEvent[] connectionEvent;
        public int numSavedNetworks;
        public int numOpenNetworks;
        public int numLegacyPersonalNetworks;
        public int numLegacyEnterpriseNetworks;
        public boolean isLocationEnabled;
        public boolean isScanningAlwaysEnabled;
        public int numWifiToggledViaSettings;
        public int numWifiToggledViaAirplane;
        public int numNetworksAddedByUser;
        public int numNetworksAddedByApps;
        public int numEmptyScanResults;
        public int numNonEmptyScanResults;
        public int numOneshotScans;
        public int numBackgroundScans;
        public com.android.server.wifi.nano.WifiMetricsProto.WifiLog.ScanReturnEntry[] scanReturnEntries;
        public com.android.server.wifi.nano.WifiMetricsProto.WifiLog.WifiSystemStateEntry[] wifiSystemStateEntries;
        public com.android.server.wifi.nano.WifiMetricsProto.WifiLog.ScanReturnEntry[] backgroundScanReturnEntries;
        public com.android.server.wifi.nano.WifiMetricsProto.WifiLog.WifiSystemStateEntry[] backgroundScanRequestState;
        public int numLastResortWatchdogTriggers;
        public int numLastResortWatchdogBadAssociationNetworksTotal;
        public int numLastResortWatchdogBadAuthenticationNetworksTotal;
        public int numLastResortWatchdogBadDhcpNetworksTotal;
        public int numLastResortWatchdogBadOtherNetworksTotal;
        public int numLastResortWatchdogAvailableNetworksTotal;
        public int numLastResortWatchdogTriggersWithBadAssociation;
        public int numLastResortWatchdogTriggersWithBadAuthentication;
        public int numLastResortWatchdogTriggersWithBadDhcp;
        public int numLastResortWatchdogTriggersWithBadOther;
        public int numConnectivityWatchdogPnoGood;
        public int numConnectivityWatchdogPnoBad;
        public int numConnectivityWatchdogBackgroundGood;
        public int numConnectivityWatchdogBackgroundBad;
        public int recordDurationSec;
        public com.android.server.wifi.nano.WifiMetricsProto.RssiPollCount[] rssiPollRssiCount;
        public int numLastResortWatchdogSuccesses;
        public int numHiddenNetworks;
        public int numPasspointNetworks;
        public int numTotalScanResults;
        public int numOpenNetworkScanResults;
        public int numLegacyPersonalNetworkScanResults;
        public int numLegacyEnterpriseNetworkScanResults;
        public int numHiddenNetworkScanResults;
        public int numHotspot2R1NetworkScanResults;
        public int numHotspot2R2NetworkScanResults;
        public int numScans;
        public com.android.server.wifi.nano.WifiMetricsProto.AlertReasonCount[] alertReasonCount;
        public com.android.server.wifi.nano.WifiMetricsProto.WifiScoreCount[] wifiScoreCount;
        public com.android.server.wifi.nano.WifiMetricsProto.SoftApDurationBucket[] softApDuration;
        public com.android.server.wifi.nano.WifiMetricsProto.SoftApReturnCodeCount[] softApReturnCode;
        public com.android.server.wifi.nano.WifiMetricsProto.RssiPollCount[] rssiPollDeltaCount;
        public com.android.server.wifi.nano.WifiMetricsProto.StaEvent[] staEventList;
        public int numHalCrashes;
        public int numWificondCrashes;
        public int numSetupClientInterfaceFailureDueToHal;
        public int numSetupClientInterfaceFailureDueToWificond;
        public com.android.server.wifi.nano.WifiMetricsProto.WifiAwareLog wifiAwareLog;
        public int numPasspointProviders;
        public int numPasspointProviderInstallation;
        public int numPasspointProviderInstallSuccess;
        public int numPasspointProviderUninstallation;
        public int numPasspointProviderUninstallSuccess;
        public int numPasspointProvidersSuccessfullyConnected;
        public com.android.server.wifi.nano.WifiMetricsProto.NumConnectableNetworksBucket[] totalSsidsInScanHistogram;
        public com.android.server.wifi.nano.WifiMetricsProto.NumConnectableNetworksBucket[] totalBssidsInScanHistogram;
        public com.android.server.wifi.nano.WifiMetricsProto.NumConnectableNetworksBucket[] availableOpenSsidsInScanHistogram;
        public com.android.server.wifi.nano.WifiMetricsProto.NumConnectableNetworksBucket[] availableOpenBssidsInScanHistogram;
        public com.android.server.wifi.nano.WifiMetricsProto.NumConnectableNetworksBucket[] availableSavedSsidsInScanHistogram;
        public com.android.server.wifi.nano.WifiMetricsProto.NumConnectableNetworksBucket[] availableSavedBssidsInScanHistogram;
        public com.android.server.wifi.nano.WifiMetricsProto.NumConnectableNetworksBucket[] availableOpenOrSavedSsidsInScanHistogram;
        public com.android.server.wifi.nano.WifiMetricsProto.NumConnectableNetworksBucket[] availableOpenOrSavedBssidsInScanHistogram;
        public com.android.server.wifi.nano.WifiMetricsProto.NumConnectableNetworksBucket[] availableSavedPasspointProviderProfilesInScanHistogram;
        public com.android.server.wifi.nano.WifiMetricsProto.NumConnectableNetworksBucket[] availableSavedPasspointProviderBssidsInScanHistogram;
        public int fullBandAllSingleScanListenerResults;
        public int partialAllSingleScanListenerResults;
        public com.android.server.wifi.nano.WifiMetricsProto.PnoScanMetrics pnoScanMetrics;
        public com.android.server.wifi.nano.WifiMetricsProto.ConnectToNetworkNotificationAndActionCount[] connectToNetworkNotificationCount;
        public com.android.server.wifi.nano.WifiMetricsProto.ConnectToNetworkNotificationAndActionCount[] connectToNetworkNotificationActionCount;
        public int openNetworkRecommenderBlacklistSize;
        public boolean isWifiNetworksAvailableNotificationOn;
        public int numOpenNetworkRecommendationUpdates;
        public int numOpenNetworkConnectMessageFailedToSend;
        public com.android.server.wifi.nano.WifiMetricsProto.NumConnectableNetworksBucket[] observedHotspotR1ApsInScanHistogram;
        public com.android.server.wifi.nano.WifiMetricsProto.NumConnectableNetworksBucket[] observedHotspotR2ApsInScanHistogram;
        public com.android.server.wifi.nano.WifiMetricsProto.NumConnectableNetworksBucket[] observedHotspotR1EssInScanHistogram;
        public com.android.server.wifi.nano.WifiMetricsProto.NumConnectableNetworksBucket[] observedHotspotR2EssInScanHistogram;
        public com.android.server.wifi.nano.WifiMetricsProto.NumConnectableNetworksBucket[] observedHotspotR1ApsPerEssInScanHistogram;
        public com.android.server.wifi.nano.WifiMetricsProto.NumConnectableNetworksBucket[] observedHotspotR2ApsPerEssInScanHistogram;
        public com.android.server.wifi.nano.WifiMetricsProto.SoftApConnectedClientsEvent[] softApConnectedClientsEventsTethered;
        public com.android.server.wifi.nano.WifiMetricsProto.SoftApConnectedClientsEvent[] softApConnectedClientsEventsLocalOnly;
        public com.android.server.wifi.nano.WifiMetricsProto.WpsMetrics wpsMetrics;
        public com.android.server.wifi.nano.WifiMetricsProto.WifiPowerStats wifiPowerStats;
        public int numConnectivityOneshotScans;
        public com.android.server.wifi.nano.WifiMetricsProto.WifiWakeStats wifiWakeStats;
        public com.android.server.wifi.nano.WifiMetricsProto.NumConnectableNetworksBucket[] observed80211McSupportingApsInScanHistogram;
        public int numSupplicantCrashes;
        public int numHostapdCrashes;
        public int numSetupClientInterfaceFailureDueToSupplicant;
        public int numSetupSoftApInterfaceFailureDueToHal;
        public int numSetupSoftApInterfaceFailureDueToWificond;
        public int numSetupSoftApInterfaceFailureDueToHostapd;
        public int numClientInterfaceDown;
        public int numSoftApInterfaceDown;
        public int numExternalAppOneshotScanRequests;
        public int numExternalForegroundAppOneshotScanRequestsThrottled;
        public int numExternalBackgroundAppOneshotScanRequestsThrottled;
        public long watchdogTriggerToConnectionSuccessDurationMs;
        public long watchdogTotalConnectionFailureCountAfterTrigger;
        public int numOneshotHasDfsChannelScans;
        public com.android.server.wifi.nano.WifiMetricsProto.WifiRttLog wifiRttLog;
        public boolean isMacRandomizationOn;
        public int numRadioModeChangeToMcc;
        public int numRadioModeChangeToScc;
        public int numRadioModeChangeToSbs;
        public int numRadioModeChangeToDbs;
        public int numSoftApUserBandPreferenceUnsatisfied;
        public java.lang.String scoreExperimentId;
        public com.android.server.wifi.nano.WifiMetricsProto.WifiRadioUsage wifiRadioUsage;
        public com.android.server.wifi.nano.WifiMetricsProto.ExperimentValues experimentValues;
        public com.android.server.wifi.nano.WifiMetricsProto.WifiIsUnusableEvent[] wifiIsUnusableEventList;
        public com.android.server.wifi.nano.WifiMetricsProto.LinkSpeedCount[] linkSpeedCounts;
        public int numSarSensorRegistrationFailures;
        public java.lang.String hardwareRevision;
        public com.android.server.wifi.nano.WifiMetricsProto.WifiLinkLayerUsageStats wifiLinkLayerUsageStats;
        public com.android.server.wifi.nano.WifiMetricsProto.WifiUsabilityStats[] wifiUsabilityStatsList;
        public com.android.server.wifi.nano.WifiMetricsProto.WifiUsabilityScoreCount[] wifiUsabilityScoreCount;
        public com.android.server.wifi.nano.WifiMetricsProto.DeviceMobilityStatePnoScanStats[] mobilityStatePnoStatsList;
        public com.android.server.wifi.nano.WifiMetricsProto.WifiP2pStats wifiP2PStats;
        public com.android.server.wifi.nano.WifiMetricsProto.WifiDppLog wifiDppLog;
        public int numEnhancedOpenNetworks;
        public int numWpa3PersonalNetworks;
        public int numWpa3EnterpriseNetworks;
        public int numEnhancedOpenNetworkScanResults;
        public int numWpa3PersonalNetworkScanResults;
        public int numWpa3EnterpriseNetworkScanResults;
        public com.android.server.wifi.nano.WifiMetricsProto.WifiConfigStoreIO wifiConfigStoreIo;
        public int numSavedNetworksWithMacRandomization;
        public com.android.server.wifi.nano.WifiMetricsProto.LinkProbeStats linkProbeStats;
        public com.android.server.wifi.nano.WifiMetricsProto.NetworkSelectionExperimentDecisions[] networkSelectionExperimentDecisionsList;
        public com.android.server.wifi.nano.WifiMetricsProto.WifiNetworkRequestApiLog wifiNetworkRequestApiLog;
        public com.android.server.wifi.nano.WifiMetricsProto.WifiNetworkSuggestionApiLog wifiNetworkSuggestionApiLog;
        public com.android.server.wifi.nano.WifiMetricsProto.WifiLockStats wifiLockStats;
        public com.android.server.wifi.nano.WifiMetricsProto.WifiToggleStats wifiToggleStats;
        public int numAddOrUpdateNetworkCalls;
        public int numEnableNetworkCalls;
        public com.android.server.wifi.nano.WifiMetricsProto.PasspointProvisionStats passpointProvisionStats;
        public com.android.server.wifi.nano.WifiMetricsProto.PasspointProfileTypeCount[] installedPasspointProfileTypeForR1;
        public com.android.server.wifi.nano.WifiMetricsProto.PasspointProfileTypeCount[] installedPasspointProfileTypeForR2;
        public com.android.server.wifi.nano.WifiMetricsProto.Int32Count[] txLinkSpeedCount2G;
        public com.android.server.wifi.nano.WifiMetricsProto.Int32Count[] txLinkSpeedCount5GLow;
        public com.android.server.wifi.nano.WifiMetricsProto.Int32Count[] txLinkSpeedCount5GMid;
        public com.android.server.wifi.nano.WifiMetricsProto.Int32Count[] txLinkSpeedCount5GHigh;
        public com.android.server.wifi.nano.WifiMetricsProto.Int32Count[] rxLinkSpeedCount2G;
        public com.android.server.wifi.nano.WifiMetricsProto.Int32Count[] rxLinkSpeedCount5GLow;
        public com.android.server.wifi.nano.WifiMetricsProto.Int32Count[] rxLinkSpeedCount5GMid;
        public com.android.server.wifi.nano.WifiMetricsProto.Int32Count[] rxLinkSpeedCount5GHigh;
        public static com.android.server.wifi.nano.WifiMetricsProto.WifiLog[] emptyArray() { return null; }
        public WifiLog() { super(); }
        public com.android.server.wifi.nano.WifiMetricsProto.WifiLog clear() { return null; }
        public void writeTo(com.android.framework.protobuf.nano.CodedOutputByteBufferNano p0) throws java.io.IOException {}
        protected int computeSerializedSize() { return 0; }
        public com.android.server.wifi.nano.WifiMetricsProto.WifiLog mergeFrom(com.android.framework.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
        public static com.android.server.wifi.nano.WifiMetricsProto.WifiLog parseFrom(byte[] p0) throws com.android.framework.protobuf.nano.InvalidProtocolBufferNanoException { return null; }
        public static com.android.server.wifi.nano.WifiMetricsProto.WifiLog parseFrom(com.android.framework.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }

        public static final class WifiSystemStateEntry extends com.android.framework.protobuf.nano.MessageNano {
            private static volatile com.android.server.wifi.nano.WifiMetricsProto.WifiLog.WifiSystemStateEntry[] _emptyArray;
            public int wifiState;
            public int wifiStateCount;
            public boolean isScreenOn;
            public static com.android.server.wifi.nano.WifiMetricsProto.WifiLog.WifiSystemStateEntry[] emptyArray() { return null; }
            public WifiSystemStateEntry() { super(); }
            public com.android.server.wifi.nano.WifiMetricsProto.WifiLog.WifiSystemStateEntry clear() { return null; }
            public void writeTo(com.android.framework.protobuf.nano.CodedOutputByteBufferNano p0) throws java.io.IOException {}
            protected int computeSerializedSize() { return 0; }
            public com.android.server.wifi.nano.WifiMetricsProto.WifiLog.WifiSystemStateEntry mergeFrom(com.android.framework.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
            public static com.android.server.wifi.nano.WifiMetricsProto.WifiLog.WifiSystemStateEntry parseFrom(byte[] p0) throws com.android.framework.protobuf.nano.InvalidProtocolBufferNanoException { return null; }
            public static com.android.server.wifi.nano.WifiMetricsProto.WifiLog.WifiSystemStateEntry parseFrom(com.android.framework.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
        }

        public static final class ScanReturnEntry extends com.android.framework.protobuf.nano.MessageNano {
            private static volatile com.android.server.wifi.nano.WifiMetricsProto.WifiLog.ScanReturnEntry[] _emptyArray;
            public int scanReturnCode;
            public int scanResultsCount;
            public static com.android.server.wifi.nano.WifiMetricsProto.WifiLog.ScanReturnEntry[] emptyArray() { return null; }
            public ScanReturnEntry() { super(); }
            public com.android.server.wifi.nano.WifiMetricsProto.WifiLog.ScanReturnEntry clear() { return null; }
            public void writeTo(com.android.framework.protobuf.nano.CodedOutputByteBufferNano p0) throws java.io.IOException {}
            protected int computeSerializedSize() { return 0; }
            public com.android.server.wifi.nano.WifiMetricsProto.WifiLog.ScanReturnEntry mergeFrom(com.android.framework.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
            public static com.android.server.wifi.nano.WifiMetricsProto.WifiLog.ScanReturnEntry parseFrom(byte[] p0) throws com.android.framework.protobuf.nano.InvalidProtocolBufferNanoException { return null; }
            public static com.android.server.wifi.nano.WifiMetricsProto.WifiLog.ScanReturnEntry parseFrom(com.android.framework.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
        }
    }

    public static final class WifiLockStats extends com.android.framework.protobuf.nano.MessageNano {
        private static volatile com.android.server.wifi.nano.WifiMetricsProto.WifiLockStats[] _emptyArray;
        public long highPerfActiveTimeMs;
        public long lowLatencyActiveTimeMs;
        public com.android.server.wifi.nano.WifiMetricsProto.HistogramBucketInt32[] highPerfLockAcqDurationSecHistogram;
        public com.android.server.wifi.nano.WifiMetricsProto.HistogramBucketInt32[] lowLatencyLockAcqDurationSecHistogram;
        public com.android.server.wifi.nano.WifiMetricsProto.HistogramBucketInt32[] highPerfActiveSessionDurationSecHistogram;
        public com.android.server.wifi.nano.WifiMetricsProto.HistogramBucketInt32[] lowLatencyActiveSessionDurationSecHistogram;
        public static com.android.server.wifi.nano.WifiMetricsProto.WifiLockStats[] emptyArray() { return null; }
        public WifiLockStats() { super(); }
        public com.android.server.wifi.nano.WifiMetricsProto.WifiLockStats clear() { return null; }
        public void writeTo(com.android.framework.protobuf.nano.CodedOutputByteBufferNano p0) throws java.io.IOException {}
        protected int computeSerializedSize() { return 0; }
        public com.android.server.wifi.nano.WifiMetricsProto.WifiLockStats mergeFrom(com.android.framework.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
        public static com.android.server.wifi.nano.WifiMetricsProto.WifiLockStats parseFrom(byte[] p0) throws com.android.framework.protobuf.nano.InvalidProtocolBufferNanoException { return null; }
        public static com.android.server.wifi.nano.WifiMetricsProto.WifiLockStats parseFrom(com.android.framework.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
    }

    public static final class WifiLinkLayerUsageStats extends com.android.framework.protobuf.nano.MessageNano {
        private static volatile com.android.server.wifi.nano.WifiMetricsProto.WifiLinkLayerUsageStats[] _emptyArray;
        public long loggingDurationMs;
        public long radioOnTimeMs;
        public long radioTxTimeMs;
        public long radioRxTimeMs;
        public long radioScanTimeMs;
        public long radioNanScanTimeMs;
        public long radioBackgroundScanTimeMs;
        public long radioRoamScanTimeMs;
        public long radioPnoScanTimeMs;
        public long radioHs20ScanTimeMs;
        public static com.android.server.wifi.nano.WifiMetricsProto.WifiLinkLayerUsageStats[] emptyArray() { return null; }
        public WifiLinkLayerUsageStats() { super(); }
        public com.android.server.wifi.nano.WifiMetricsProto.WifiLinkLayerUsageStats clear() { return null; }
        public void writeTo(com.android.framework.protobuf.nano.CodedOutputByteBufferNano p0) throws java.io.IOException {}
        protected int computeSerializedSize() { return 0; }
        public com.android.server.wifi.nano.WifiMetricsProto.WifiLinkLayerUsageStats mergeFrom(com.android.framework.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
        public static com.android.server.wifi.nano.WifiMetricsProto.WifiLinkLayerUsageStats parseFrom(byte[] p0) throws com.android.framework.protobuf.nano.InvalidProtocolBufferNanoException { return null; }
        public static com.android.server.wifi.nano.WifiMetricsProto.WifiLinkLayerUsageStats parseFrom(com.android.framework.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
    }

    public static final class WifiIsUnusableEvent extends com.android.framework.protobuf.nano.MessageNano {
        public static final int TYPE_UNKNOWN = 0;
        public static final int TYPE_DATA_STALL_BAD_TX = 1;
        public static final int TYPE_DATA_STALL_TX_WITHOUT_RX = 2;
        public static final int TYPE_DATA_STALL_BOTH = 3;
        public static final int TYPE_FIRMWARE_ALERT = 4;
        public static final int TYPE_IP_REACHABILITY_LOST = 5;
        private static volatile com.android.server.wifi.nano.WifiMetricsProto.WifiIsUnusableEvent[] _emptyArray;
        public int type;
        public long startTimeMillis;
        public int lastScore;
        public long txSuccessDelta;
        public long txRetriesDelta;
        public long txBadDelta;
        public long rxSuccessDelta;
        public long packetUpdateTimeDelta;
        public long lastLinkLayerStatsUpdateTime;
        public int firmwareAlertCode;
        public int lastWifiUsabilityScore;
        public int lastPredictionHorizonSec;
        public boolean screenOn;
        public static com.android.server.wifi.nano.WifiMetricsProto.WifiIsUnusableEvent[] emptyArray() { return null; }
        public WifiIsUnusableEvent() { super(); }
        public com.android.server.wifi.nano.WifiMetricsProto.WifiIsUnusableEvent clear() { return null; }
        public void writeTo(com.android.framework.protobuf.nano.CodedOutputByteBufferNano p0) throws java.io.IOException {}
        protected int computeSerializedSize() { return 0; }
        public com.android.server.wifi.nano.WifiMetricsProto.WifiIsUnusableEvent mergeFrom(com.android.framework.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
        public static com.android.server.wifi.nano.WifiMetricsProto.WifiIsUnusableEvent parseFrom(byte[] p0) throws com.android.framework.protobuf.nano.InvalidProtocolBufferNanoException { return null; }
        public static com.android.server.wifi.nano.WifiMetricsProto.WifiIsUnusableEvent parseFrom(com.android.framework.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
    }

    public static final class WifiDppLog extends com.android.framework.protobuf.nano.MessageNano {
        public static final int EASY_CONNECT_EVENT_SUCCESS_UNKNOWN = 0;
        public static final int EASY_CONNECT_EVENT_SUCCESS_CONFIGURATION_SENT = 1;
        public static final int EASY_CONNECT_EVENT_FAILURE_UNKNOWN = 0;
        public static final int EASY_CONNECT_EVENT_FAILURE_INVALID_URI = 1;
        public static final int EASY_CONNECT_EVENT_FAILURE_AUTHENTICATION = 2;
        public static final int EASY_CONNECT_EVENT_FAILURE_NOT_COMPATIBLE = 3;
        public static final int EASY_CONNECT_EVENT_FAILURE_CONFIGURATION = 4;
        public static final int EASY_CONNECT_EVENT_FAILURE_BUSY = 5;
        public static final int EASY_CONNECT_EVENT_FAILURE_TIMEOUT = 6;
        public static final int EASY_CONNECT_EVENT_FAILURE_GENERIC = 7;
        public static final int EASY_CONNECT_EVENT_FAILURE_NOT_SUPPORTED = 8;
        public static final int EASY_CONNECT_EVENT_FAILURE_INVALID_NETWORK = 9;
        private static volatile com.android.server.wifi.nano.WifiMetricsProto.WifiDppLog[] _emptyArray;
        public int numDppConfiguratorInitiatorRequests;
        public int numDppEnrolleeInitiatorRequests;
        public int numDppEnrolleeSuccess;
        public com.android.server.wifi.nano.WifiMetricsProto.WifiDppLog.DppConfiguratorSuccessStatusHistogramBucket[] dppConfiguratorSuccessCode;
        public com.android.server.wifi.nano.WifiMetricsProto.WifiDppLog.DppFailureStatusHistogramBucket[] dppFailureCode;
        public com.android.server.wifi.nano.WifiMetricsProto.HistogramBucketInt32[] dppOperationTime;
        public static com.android.server.wifi.nano.WifiMetricsProto.WifiDppLog[] emptyArray() { return null; }
        public WifiDppLog() { super(); }
        public com.android.server.wifi.nano.WifiMetricsProto.WifiDppLog clear() { return null; }
        public void writeTo(com.android.framework.protobuf.nano.CodedOutputByteBufferNano p0) throws java.io.IOException {}
        protected int computeSerializedSize() { return 0; }
        public com.android.server.wifi.nano.WifiMetricsProto.WifiDppLog mergeFrom(com.android.framework.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
        public static com.android.server.wifi.nano.WifiMetricsProto.WifiDppLog parseFrom(byte[] p0) throws com.android.framework.protobuf.nano.InvalidProtocolBufferNanoException { return null; }
        public static com.android.server.wifi.nano.WifiMetricsProto.WifiDppLog parseFrom(com.android.framework.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }

        public static final class DppFailureStatusHistogramBucket extends com.android.framework.protobuf.nano.MessageNano {
            private static volatile com.android.server.wifi.nano.WifiMetricsProto.WifiDppLog.DppFailureStatusHistogramBucket[] _emptyArray;
            public int dppStatusType;
            public int count;
            public static com.android.server.wifi.nano.WifiMetricsProto.WifiDppLog.DppFailureStatusHistogramBucket[] emptyArray() { return null; }
            public DppFailureStatusHistogramBucket() { super(); }
            public com.android.server.wifi.nano.WifiMetricsProto.WifiDppLog.DppFailureStatusHistogramBucket clear() { return null; }
            public void writeTo(com.android.framework.protobuf.nano.CodedOutputByteBufferNano p0) throws java.io.IOException {}
            protected int computeSerializedSize() { return 0; }
            public com.android.server.wifi.nano.WifiMetricsProto.WifiDppLog.DppFailureStatusHistogramBucket mergeFrom(com.android.framework.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
            public static com.android.server.wifi.nano.WifiMetricsProto.WifiDppLog.DppFailureStatusHistogramBucket parseFrom(byte[] p0) throws com.android.framework.protobuf.nano.InvalidProtocolBufferNanoException { return null; }
            public static com.android.server.wifi.nano.WifiMetricsProto.WifiDppLog.DppFailureStatusHistogramBucket parseFrom(com.android.framework.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
        }

        public static final class DppConfiguratorSuccessStatusHistogramBucket extends com.android.framework.protobuf.nano.MessageNano {
            private static volatile com.android.server.wifi.nano.WifiMetricsProto.WifiDppLog.DppConfiguratorSuccessStatusHistogramBucket[] _emptyArray;
            public int dppStatusType;
            public int count;
            public static com.android.server.wifi.nano.WifiMetricsProto.WifiDppLog.DppConfiguratorSuccessStatusHistogramBucket[] emptyArray() { return null; }
            public DppConfiguratorSuccessStatusHistogramBucket() { super(); }
            public com.android.server.wifi.nano.WifiMetricsProto.WifiDppLog.DppConfiguratorSuccessStatusHistogramBucket clear() { return null; }
            public void writeTo(com.android.framework.protobuf.nano.CodedOutputByteBufferNano p0) throws java.io.IOException {}
            protected int computeSerializedSize() { return 0; }
            public com.android.server.wifi.nano.WifiMetricsProto.WifiDppLog.DppConfiguratorSuccessStatusHistogramBucket mergeFrom(com.android.framework.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
            public static com.android.server.wifi.nano.WifiMetricsProto.WifiDppLog.DppConfiguratorSuccessStatusHistogramBucket parseFrom(byte[] p0) throws com.android.framework.protobuf.nano.InvalidProtocolBufferNanoException { return null; }
            public static com.android.server.wifi.nano.WifiMetricsProto.WifiDppLog.DppConfiguratorSuccessStatusHistogramBucket parseFrom(com.android.framework.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
        }
    }

    public static final class WifiConfigStoreIO extends com.android.framework.protobuf.nano.MessageNano {
        private static volatile com.android.server.wifi.nano.WifiMetricsProto.WifiConfigStoreIO[] _emptyArray;
        public com.android.server.wifi.nano.WifiMetricsProto.WifiConfigStoreIO.DurationBucket[] readDurations;
        public com.android.server.wifi.nano.WifiMetricsProto.WifiConfigStoreIO.DurationBucket[] writeDurations;
        public static com.android.server.wifi.nano.WifiMetricsProto.WifiConfigStoreIO[] emptyArray() { return null; }
        public WifiConfigStoreIO() { super(); }
        public com.android.server.wifi.nano.WifiMetricsProto.WifiConfigStoreIO clear() { return null; }
        public void writeTo(com.android.framework.protobuf.nano.CodedOutputByteBufferNano p0) throws java.io.IOException {}
        protected int computeSerializedSize() { return 0; }
        public com.android.server.wifi.nano.WifiMetricsProto.WifiConfigStoreIO mergeFrom(com.android.framework.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
        public static com.android.server.wifi.nano.WifiMetricsProto.WifiConfigStoreIO parseFrom(byte[] p0) throws com.android.framework.protobuf.nano.InvalidProtocolBufferNanoException { return null; }
        public static com.android.server.wifi.nano.WifiMetricsProto.WifiConfigStoreIO parseFrom(com.android.framework.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }

        public static final class DurationBucket extends com.android.framework.protobuf.nano.MessageNano {
            private static volatile com.android.server.wifi.nano.WifiMetricsProto.WifiConfigStoreIO.DurationBucket[] _emptyArray;
            public int rangeStartMs;
            public int rangeEndMs;
            public int count;
            public static com.android.server.wifi.nano.WifiMetricsProto.WifiConfigStoreIO.DurationBucket[] emptyArray() { return null; }
            public DurationBucket() { super(); }
            public com.android.server.wifi.nano.WifiMetricsProto.WifiConfigStoreIO.DurationBucket clear() { return null; }
            public void writeTo(com.android.framework.protobuf.nano.CodedOutputByteBufferNano p0) throws java.io.IOException {}
            protected int computeSerializedSize() { return 0; }
            public com.android.server.wifi.nano.WifiMetricsProto.WifiConfigStoreIO.DurationBucket mergeFrom(com.android.framework.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
            public static com.android.server.wifi.nano.WifiMetricsProto.WifiConfigStoreIO.DurationBucket parseFrom(byte[] p0) throws com.android.framework.protobuf.nano.InvalidProtocolBufferNanoException { return null; }
            public static com.android.server.wifi.nano.WifiMetricsProto.WifiConfigStoreIO.DurationBucket parseFrom(com.android.framework.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
        }
    }

    public static final class WifiAwareLog extends com.android.framework.protobuf.nano.MessageNano {
        public static final int UNKNOWN = 0;
        public static final int SUCCESS = 1;
        public static final int INTERNAL_FAILURE = 2;
        public static final int PROTOCOL_FAILURE = 3;
        public static final int INVALID_SESSION_ID = 4;
        public static final int NO_RESOURCES_AVAILABLE = 5;
        public static final int INVALID_ARGS = 6;
        public static final int INVALID_PEER_ID = 7;
        public static final int INVALID_NDP_ID = 8;
        public static final int NAN_NOT_ALLOWED = 9;
        public static final int NO_OTA_ACK = 10;
        public static final int ALREADY_ENABLED = 11;
        public static final int FOLLOWUP_TX_QUEUE_FULL = 12;
        public static final int UNSUPPORTED_CONCURRENCY_NAN_DISABLED = 13;
        public static final int UNKNOWN_HAL_STATUS = 14;
        private static volatile com.android.server.wifi.nano.WifiMetricsProto.WifiAwareLog[] _emptyArray;
        public int numApps;
        public int numAppsUsingIdentityCallback;
        public int maxConcurrentAttachSessionsInApp;
        public com.android.server.wifi.nano.WifiMetricsProto.WifiAwareLog.NanStatusHistogramBucket[] histogramAttachSessionStatus;
        public int maxConcurrentPublishInApp;
        public int maxConcurrentSubscribeInApp;
        public int maxConcurrentDiscoverySessionsInApp;
        public int maxConcurrentPublishInSystem;
        public int maxConcurrentSubscribeInSystem;
        public int maxConcurrentDiscoverySessionsInSystem;
        public com.android.server.wifi.nano.WifiMetricsProto.WifiAwareLog.NanStatusHistogramBucket[] histogramPublishStatus;
        public com.android.server.wifi.nano.WifiMetricsProto.WifiAwareLog.NanStatusHistogramBucket[] histogramSubscribeStatus;
        public int numAppsWithDiscoverySessionFailureOutOfResources;
        public com.android.server.wifi.nano.WifiMetricsProto.WifiAwareLog.NanStatusHistogramBucket[] histogramRequestNdpStatus;
        public com.android.server.wifi.nano.WifiMetricsProto.WifiAwareLog.NanStatusHistogramBucket[] histogramRequestNdpOobStatus;
        public int maxConcurrentNdiInApp;
        public int maxConcurrentNdiInSystem;
        public int maxConcurrentNdpInApp;
        public int maxConcurrentNdpInSystem;
        public int maxConcurrentSecureNdpInApp;
        public int maxConcurrentSecureNdpInSystem;
        public int maxConcurrentNdpPerNdi;
        public com.android.server.wifi.nano.WifiMetricsProto.WifiAwareLog.HistogramBucket[] histogramAwareAvailableDurationMs;
        public com.android.server.wifi.nano.WifiMetricsProto.WifiAwareLog.HistogramBucket[] histogramAwareEnabledDurationMs;
        public com.android.server.wifi.nano.WifiMetricsProto.WifiAwareLog.HistogramBucket[] histogramAttachDurationMs;
        public com.android.server.wifi.nano.WifiMetricsProto.WifiAwareLog.HistogramBucket[] histogramPublishSessionDurationMs;
        public com.android.server.wifi.nano.WifiMetricsProto.WifiAwareLog.HistogramBucket[] histogramSubscribeSessionDurationMs;
        public com.android.server.wifi.nano.WifiMetricsProto.WifiAwareLog.HistogramBucket[] histogramNdpSessionDurationMs;
        public com.android.server.wifi.nano.WifiMetricsProto.WifiAwareLog.HistogramBucket[] histogramNdpSessionDataUsageMb;
        public com.android.server.wifi.nano.WifiMetricsProto.WifiAwareLog.HistogramBucket[] histogramNdpCreationTimeMs;
        public long ndpCreationTimeMsMin;
        public long ndpCreationTimeMsMax;
        public long ndpCreationTimeMsSum;
        public long ndpCreationTimeMsSumOfSq;
        public long ndpCreationTimeMsNumSamples;
        public long availableTimeMs;
        public long enabledTimeMs;
        public int maxConcurrentPublishWithRangingInApp;
        public int maxConcurrentSubscribeWithRangingInApp;
        public int maxConcurrentPublishWithRangingInSystem;
        public int maxConcurrentSubscribeWithRangingInSystem;
        public com.android.server.wifi.nano.WifiMetricsProto.WifiAwareLog.HistogramBucket[] histogramSubscribeGeofenceMin;
        public com.android.server.wifi.nano.WifiMetricsProto.WifiAwareLog.HistogramBucket[] histogramSubscribeGeofenceMax;
        public int numSubscribesWithRanging;
        public int numMatchesWithRanging;
        public int numMatchesWithoutRangingForRangingEnabledSubscribes;
        public static com.android.server.wifi.nano.WifiMetricsProto.WifiAwareLog[] emptyArray() { return null; }
        public WifiAwareLog() { super(); }
        public com.android.server.wifi.nano.WifiMetricsProto.WifiAwareLog clear() { return null; }
        public void writeTo(com.android.framework.protobuf.nano.CodedOutputByteBufferNano p0) throws java.io.IOException {}
        protected int computeSerializedSize() { return 0; }
        public com.android.server.wifi.nano.WifiMetricsProto.WifiAwareLog mergeFrom(com.android.framework.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
        public static com.android.server.wifi.nano.WifiMetricsProto.WifiAwareLog parseFrom(byte[] p0) throws com.android.framework.protobuf.nano.InvalidProtocolBufferNanoException { return null; }
        public static com.android.server.wifi.nano.WifiMetricsProto.WifiAwareLog parseFrom(com.android.framework.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }

        public static final class NanStatusHistogramBucket extends com.android.framework.protobuf.nano.MessageNano {
            private static volatile com.android.server.wifi.nano.WifiMetricsProto.WifiAwareLog.NanStatusHistogramBucket[] _emptyArray;
            public int nanStatusType;
            public int count;
            public static com.android.server.wifi.nano.WifiMetricsProto.WifiAwareLog.NanStatusHistogramBucket[] emptyArray() { return null; }
            public NanStatusHistogramBucket() { super(); }
            public com.android.server.wifi.nano.WifiMetricsProto.WifiAwareLog.NanStatusHistogramBucket clear() { return null; }
            public void writeTo(com.android.framework.protobuf.nano.CodedOutputByteBufferNano p0) throws java.io.IOException {}
            protected int computeSerializedSize() { return 0; }
            public com.android.server.wifi.nano.WifiMetricsProto.WifiAwareLog.NanStatusHistogramBucket mergeFrom(com.android.framework.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
            public static com.android.server.wifi.nano.WifiMetricsProto.WifiAwareLog.NanStatusHistogramBucket parseFrom(byte[] p0) throws com.android.framework.protobuf.nano.InvalidProtocolBufferNanoException { return null; }
            public static com.android.server.wifi.nano.WifiMetricsProto.WifiAwareLog.NanStatusHistogramBucket parseFrom(com.android.framework.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
        }

        public static final class HistogramBucket extends com.android.framework.protobuf.nano.MessageNano {
            private static volatile com.android.server.wifi.nano.WifiMetricsProto.WifiAwareLog.HistogramBucket[] _emptyArray;
            public long start;
            public long end;
            public int count;
            public static com.android.server.wifi.nano.WifiMetricsProto.WifiAwareLog.HistogramBucket[] emptyArray() { return null; }
            public HistogramBucket() { super(); }
            public com.android.server.wifi.nano.WifiMetricsProto.WifiAwareLog.HistogramBucket clear() { return null; }
            public void writeTo(com.android.framework.protobuf.nano.CodedOutputByteBufferNano p0) throws java.io.IOException {}
            protected int computeSerializedSize() { return 0; }
            public com.android.server.wifi.nano.WifiMetricsProto.WifiAwareLog.HistogramBucket mergeFrom(com.android.framework.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
            public static com.android.server.wifi.nano.WifiMetricsProto.WifiAwareLog.HistogramBucket parseFrom(byte[] p0) throws com.android.framework.protobuf.nano.InvalidProtocolBufferNanoException { return null; }
            public static com.android.server.wifi.nano.WifiMetricsProto.WifiAwareLog.HistogramBucket parseFrom(com.android.framework.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
        }
    }

    public static final class StaEvent extends com.android.framework.protobuf.nano.MessageNano {
        public static final int TYPE_UNKNOWN = 0;
        public static final int TYPE_ASSOCIATION_REJECTION_EVENT = 1;
        public static final int TYPE_AUTHENTICATION_FAILURE_EVENT = 2;
        public static final int TYPE_NETWORK_CONNECTION_EVENT = 3;
        public static final int TYPE_NETWORK_DISCONNECTION_EVENT = 4;
        public static final int TYPE_SUPPLICANT_STATE_CHANGE_EVENT = 5;
        public static final int TYPE_CMD_ASSOCIATED_BSSID = 6;
        public static final int TYPE_CMD_IP_CONFIGURATION_SUCCESSFUL = 7;
        public static final int TYPE_CMD_IP_CONFIGURATION_LOST = 8;
        public static final int TYPE_CMD_IP_REACHABILITY_LOST = 9;
        public static final int TYPE_CMD_TARGET_BSSID = 10;
        public static final int TYPE_CMD_START_CONNECT = 11;
        public static final int TYPE_CMD_START_ROAM = 12;
        public static final int TYPE_CONNECT_NETWORK = 13;
        public static final int TYPE_NETWORK_AGENT_VALID_NETWORK = 14;
        public static final int TYPE_FRAMEWORK_DISCONNECT = 15;
        public static final int TYPE_SCORE_BREACH = 16;
        public static final int TYPE_MAC_CHANGE = 17;
        public static final int TYPE_WIFI_ENABLED = 18;
        public static final int TYPE_WIFI_DISABLED = 19;
        public static final int TYPE_WIFI_USABILITY_SCORE_BREACH = 20;
        public static final int TYPE_LINK_PROBE = 21;
        public static final int DISCONNECT_UNKNOWN = 0;
        public static final int DISCONNECT_API = 1;
        public static final int DISCONNECT_GENERIC = 2;
        public static final int DISCONNECT_UNWANTED = 3;
        public static final int DISCONNECT_ROAM_WATCHDOG_TIMER = 4;
        public static final int DISCONNECT_P2P_DISCONNECT_WIFI_REQUEST = 5;
        public static final int DISCONNECT_RESET_SIM_NETWORKS = 6;
        public static final int AUTH_FAILURE_UNKNOWN = 0;
        public static final int AUTH_FAILURE_NONE = 1;
        public static final int AUTH_FAILURE_TIMEOUT = 2;
        public static final int AUTH_FAILURE_WRONG_PSWD = 3;
        public static final int AUTH_FAILURE_EAP_FAILURE = 4;
        public static final int STATE_DISCONNECTED = 0;
        public static final int STATE_INTERFACE_DISABLED = 1;
        public static final int STATE_INACTIVE = 2;
        public static final int STATE_SCANNING = 3;
        public static final int STATE_AUTHENTICATING = 4;
        public static final int STATE_ASSOCIATING = 5;
        public static final int STATE_ASSOCIATED = 6;
        public static final int STATE_FOUR_WAY_HANDSHAKE = 7;
        public static final int STATE_GROUP_HANDSHAKE = 8;
        public static final int STATE_COMPLETED = 9;
        public static final int STATE_DORMANT = 10;
        public static final int STATE_UNINITIALIZED = 11;
        public static final int STATE_INVALID = 12;
        private static volatile com.android.server.wifi.nano.WifiMetricsProto.StaEvent[] _emptyArray;
        public int type;
        public int reason;
        public int status;
        public boolean localGen;
        public com.android.server.wifi.nano.WifiMetricsProto.StaEvent.ConfigInfo configInfo;
        public int lastRssi;
        public int lastLinkSpeed;
        public int lastFreq;
        public int supplicantStateChangesBitmask;
        public long startTimeMillis;
        public int frameworkDisconnectReason;
        public boolean associationTimedOut;
        public int authFailureReason;
        public int lastScore;
        public int lastWifiUsabilityScore;
        public int lastPredictionHorizonSec;
        public boolean linkProbeWasSuccess;
        public int linkProbeSuccessElapsedTimeMs;
        public int linkProbeFailureReason;
        public static com.android.server.wifi.nano.WifiMetricsProto.StaEvent[] emptyArray() { return null; }
        public StaEvent() { super(); }
        public com.android.server.wifi.nano.WifiMetricsProto.StaEvent clear() { return null; }
        public void writeTo(com.android.framework.protobuf.nano.CodedOutputByteBufferNano p0) throws java.io.IOException {}
        protected int computeSerializedSize() { return 0; }
        public com.android.server.wifi.nano.WifiMetricsProto.StaEvent mergeFrom(com.android.framework.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
        public static com.android.server.wifi.nano.WifiMetricsProto.StaEvent parseFrom(byte[] p0) throws com.android.framework.protobuf.nano.InvalidProtocolBufferNanoException { return null; }
        public static com.android.server.wifi.nano.WifiMetricsProto.StaEvent parseFrom(com.android.framework.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }

        public static final class ConfigInfo extends com.android.framework.protobuf.nano.MessageNano {
            private static volatile com.android.server.wifi.nano.WifiMetricsProto.StaEvent.ConfigInfo[] _emptyArray;
            public int allowedKeyManagement;
            public int allowedProtocols;
            public int allowedAuthAlgorithms;
            public int allowedPairwiseCiphers;
            public int allowedGroupCiphers;
            public boolean hiddenSsid;
            public boolean isPasspoint;
            public boolean isEphemeral;
            public boolean hasEverConnected;
            public int scanRssi;
            public int scanFreq;
            public static com.android.server.wifi.nano.WifiMetricsProto.StaEvent.ConfigInfo[] emptyArray() { return null; }
            public ConfigInfo() { super(); }
            public com.android.server.wifi.nano.WifiMetricsProto.StaEvent.ConfigInfo clear() { return null; }
            public void writeTo(com.android.framework.protobuf.nano.CodedOutputByteBufferNano p0) throws java.io.IOException {}
            protected int computeSerializedSize() { return 0; }
            public com.android.server.wifi.nano.WifiMetricsProto.StaEvent.ConfigInfo mergeFrom(com.android.framework.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
            public static com.android.server.wifi.nano.WifiMetricsProto.StaEvent.ConfigInfo parseFrom(byte[] p0) throws com.android.framework.protobuf.nano.InvalidProtocolBufferNanoException { return null; }
            public static com.android.server.wifi.nano.WifiMetricsProto.StaEvent.ConfigInfo parseFrom(com.android.framework.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
        }
    }

    public static final class SoftApReturnCodeCount extends com.android.framework.protobuf.nano.MessageNano {
        public static final int SOFT_AP_RETURN_CODE_UNKNOWN = 0;
        public static final int SOFT_AP_STARTED_SUCCESSFULLY = 1;
        public static final int SOFT_AP_FAILED_GENERAL_ERROR = 2;
        public static final int SOFT_AP_FAILED_NO_CHANNEL = 3;
        private static volatile com.android.server.wifi.nano.WifiMetricsProto.SoftApReturnCodeCount[] _emptyArray;
        public int returnCode;
        public int count;
        public int startResult;
        public static com.android.server.wifi.nano.WifiMetricsProto.SoftApReturnCodeCount[] emptyArray() { return null; }
        public SoftApReturnCodeCount() { super(); }
        public com.android.server.wifi.nano.WifiMetricsProto.SoftApReturnCodeCount clear() { return null; }
        public void writeTo(com.android.framework.protobuf.nano.CodedOutputByteBufferNano p0) throws java.io.IOException {}
        protected int computeSerializedSize() { return 0; }
        public com.android.server.wifi.nano.WifiMetricsProto.SoftApReturnCodeCount mergeFrom(com.android.framework.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
        public static com.android.server.wifi.nano.WifiMetricsProto.SoftApReturnCodeCount parseFrom(byte[] p0) throws com.android.framework.protobuf.nano.InvalidProtocolBufferNanoException { return null; }
        public static com.android.server.wifi.nano.WifiMetricsProto.SoftApReturnCodeCount parseFrom(com.android.framework.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
    }

    public static final class SoftApDurationBucket extends com.android.framework.protobuf.nano.MessageNano {
        private static volatile com.android.server.wifi.nano.WifiMetricsProto.SoftApDurationBucket[] _emptyArray;
        public int durationSec;
        public int bucketSizeSec;
        public int count;
        public static com.android.server.wifi.nano.WifiMetricsProto.SoftApDurationBucket[] emptyArray() { return null; }
        public SoftApDurationBucket() { super(); }
        public com.android.server.wifi.nano.WifiMetricsProto.SoftApDurationBucket clear() { return null; }
        public void writeTo(com.android.framework.protobuf.nano.CodedOutputByteBufferNano p0) throws java.io.IOException {}
        protected int computeSerializedSize() { return 0; }
        public com.android.server.wifi.nano.WifiMetricsProto.SoftApDurationBucket mergeFrom(com.android.framework.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
        public static com.android.server.wifi.nano.WifiMetricsProto.SoftApDurationBucket parseFrom(byte[] p0) throws com.android.framework.protobuf.nano.InvalidProtocolBufferNanoException { return null; }
        public static com.android.server.wifi.nano.WifiMetricsProto.SoftApDurationBucket parseFrom(com.android.framework.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
    }

    public static final class SoftApConnectedClientsEvent extends com.android.framework.protobuf.nano.MessageNano {
        public static final int SOFT_AP_UP = 0;
        public static final int SOFT_AP_DOWN = 1;
        public static final int NUM_CLIENTS_CHANGED = 2;
        public static final int BANDWIDTH_INVALID = 0;
        public static final int BANDWIDTH_20_NOHT = 1;
        public static final int BANDWIDTH_20 = 2;
        public static final int BANDWIDTH_40 = 3;
        public static final int BANDWIDTH_80 = 4;
        public static final int BANDWIDTH_80P80 = 5;
        public static final int BANDWIDTH_160 = 6;
        private static volatile com.android.server.wifi.nano.WifiMetricsProto.SoftApConnectedClientsEvent[] _emptyArray;
        public int eventType;
        public long timeStampMillis;
        public int numConnectedClients;
        public int channelFrequency;
        public int channelBandwidth;
        public static com.android.server.wifi.nano.WifiMetricsProto.SoftApConnectedClientsEvent[] emptyArray() { return null; }
        public SoftApConnectedClientsEvent() { super(); }
        public com.android.server.wifi.nano.WifiMetricsProto.SoftApConnectedClientsEvent clear() { return null; }
        public void writeTo(com.android.framework.protobuf.nano.CodedOutputByteBufferNano p0) throws java.io.IOException {}
        protected int computeSerializedSize() { return 0; }
        public com.android.server.wifi.nano.WifiMetricsProto.SoftApConnectedClientsEvent mergeFrom(com.android.framework.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
        public static com.android.server.wifi.nano.WifiMetricsProto.SoftApConnectedClientsEvent parseFrom(byte[] p0) throws com.android.framework.protobuf.nano.InvalidProtocolBufferNanoException { return null; }
        public static com.android.server.wifi.nano.WifiMetricsProto.SoftApConnectedClientsEvent parseFrom(com.android.framework.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
    }

    public static final class RssiPollCount extends com.android.framework.protobuf.nano.MessageNano {
        private static volatile com.android.server.wifi.nano.WifiMetricsProto.RssiPollCount[] _emptyArray;
        public int rssi;
        public int count;
        public int frequency;
        public static com.android.server.wifi.nano.WifiMetricsProto.RssiPollCount[] emptyArray() { return null; }
        public RssiPollCount() { super(); }
        public com.android.server.wifi.nano.WifiMetricsProto.RssiPollCount clear() { return null; }
        public void writeTo(com.android.framework.protobuf.nano.CodedOutputByteBufferNano p0) throws java.io.IOException {}
        protected int computeSerializedSize() { return 0; }
        public com.android.server.wifi.nano.WifiMetricsProto.RssiPollCount mergeFrom(com.android.framework.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
        public static com.android.server.wifi.nano.WifiMetricsProto.RssiPollCount parseFrom(byte[] p0) throws com.android.framework.protobuf.nano.InvalidProtocolBufferNanoException { return null; }
        public static com.android.server.wifi.nano.WifiMetricsProto.RssiPollCount parseFrom(com.android.framework.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
    }

    public static final class RouterFingerPrint extends com.android.framework.protobuf.nano.MessageNano {
        public static final int ROAM_TYPE_UNKNOWN = 0;
        public static final int ROAM_TYPE_NONE = 1;
        public static final int ROAM_TYPE_ENTERPRISE = 2;
        public static final int ROAM_TYPE_DBDC = 3;
        public static final int AUTH_UNKNOWN = 0;
        public static final int AUTH_OPEN = 1;
        public static final int AUTH_PERSONAL = 2;
        public static final int AUTH_ENTERPRISE = 3;
        public static final int ROUTER_TECH_UNKNOWN = 0;
        public static final int ROUTER_TECH_A = 1;
        public static final int ROUTER_TECH_B = 2;
        public static final int ROUTER_TECH_G = 3;
        public static final int ROUTER_TECH_N = 4;
        public static final int ROUTER_TECH_AC = 5;
        public static final int ROUTER_TECH_OTHER = 6;
        private static volatile com.android.server.wifi.nano.WifiMetricsProto.RouterFingerPrint[] _emptyArray;
        public int roamType;
        public int channelInfo;
        public int dtim;
        public int authentication;
        public boolean hidden;
        public int routerTechnology;
        public boolean supportsIpv6;
        public boolean passpoint;
        public static com.android.server.wifi.nano.WifiMetricsProto.RouterFingerPrint[] emptyArray() { return null; }
        public RouterFingerPrint() { super(); }
        public com.android.server.wifi.nano.WifiMetricsProto.RouterFingerPrint clear() { return null; }
        public void writeTo(com.android.framework.protobuf.nano.CodedOutputByteBufferNano p0) throws java.io.IOException {}
        protected int computeSerializedSize() { return 0; }
        public com.android.server.wifi.nano.WifiMetricsProto.RouterFingerPrint mergeFrom(com.android.framework.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
        public static com.android.server.wifi.nano.WifiMetricsProto.RouterFingerPrint parseFrom(byte[] p0) throws com.android.framework.protobuf.nano.InvalidProtocolBufferNanoException { return null; }
        public static com.android.server.wifi.nano.WifiMetricsProto.RouterFingerPrint parseFrom(com.android.framework.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
    }

    public static final class PnoScanMetrics extends com.android.framework.protobuf.nano.MessageNano {
        private static volatile com.android.server.wifi.nano.WifiMetricsProto.PnoScanMetrics[] _emptyArray;
        public int numPnoScanAttempts;
        public int numPnoScanFailed;
        public int numPnoScanStartedOverOffload;
        public int numPnoScanFailedOverOffload;
        public int numPnoFoundNetworkEvents;
        public static com.android.server.wifi.nano.WifiMetricsProto.PnoScanMetrics[] emptyArray() { return null; }
        public PnoScanMetrics() { super(); }
        public com.android.server.wifi.nano.WifiMetricsProto.PnoScanMetrics clear() { return null; }
        public void writeTo(com.android.framework.protobuf.nano.CodedOutputByteBufferNano p0) throws java.io.IOException {}
        protected int computeSerializedSize() { return 0; }
        public com.android.server.wifi.nano.WifiMetricsProto.PnoScanMetrics mergeFrom(com.android.framework.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
        public static com.android.server.wifi.nano.WifiMetricsProto.PnoScanMetrics parseFrom(byte[] p0) throws com.android.framework.protobuf.nano.InvalidProtocolBufferNanoException { return null; }
        public static com.android.server.wifi.nano.WifiMetricsProto.PnoScanMetrics parseFrom(com.android.framework.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
    }

    public static final class PasspointProvisionStats extends com.android.framework.protobuf.nano.MessageNano {
        public static final int OSU_FAILURE_UNKNOWN = 0;
        public static final int OSU_FAILURE_AP_CONNECTION = 1;
        public static final int OSU_FAILURE_SERVER_URL_INVALID = 2;
        public static final int OSU_FAILURE_SERVER_CONNECTION = 3;
        public static final int OSU_FAILURE_SERVER_VALIDATION = 4;
        public static final int OSU_FAILURE_SERVICE_PROVIDER_VERIFICATION = 5;
        public static final int OSU_FAILURE_PROVISIONING_ABORTED = 6;
        public static final int OSU_FAILURE_PROVISIONING_NOT_AVAILABLE = 7;
        public static final int OSU_FAILURE_INVALID_URL_FORMAT_FOR_OSU = 8;
        public static final int OSU_FAILURE_UNEXPECTED_COMMAND_TYPE = 9;
        public static final int OSU_FAILURE_UNEXPECTED_SOAP_MESSAGE_TYPE = 10;
        public static final int OSU_FAILURE_SOAP_MESSAGE_EXCHANGE = 11;
        public static final int OSU_FAILURE_START_REDIRECT_LISTENER = 12;
        public static final int OSU_FAILURE_TIMED_OUT_REDIRECT_LISTENER = 13;
        public static final int OSU_FAILURE_NO_OSU_ACTIVITY_FOUND = 14;
        public static final int OSU_FAILURE_UNEXPECTED_SOAP_MESSAGE_STATUS = 15;
        public static final int OSU_FAILURE_NO_PPS_MO = 16;
        public static final int OSU_FAILURE_NO_AAA_SERVER_TRUST_ROOT_NODE = 17;
        public static final int OSU_FAILURE_NO_REMEDIATION_SERVER_TRUST_ROOT_NODE = 18;
        public static final int OSU_FAILURE_NO_POLICY_SERVER_TRUST_ROOT_NODE = 19;
        public static final int OSU_FAILURE_RETRIEVE_TRUST_ROOT_CERTIFICATES = 20;
        public static final int OSU_FAILURE_NO_AAA_TRUST_ROOT_CERTIFICATE = 21;
        public static final int OSU_FAILURE_ADD_PASSPOINT_CONFIGURATION = 22;
        public static final int OSU_FAILURE_OSU_PROVIDER_NOT_FOUND = 23;
        private static volatile com.android.server.wifi.nano.WifiMetricsProto.PasspointProvisionStats[] _emptyArray;
        public int numProvisionSuccess;
        public com.android.server.wifi.nano.WifiMetricsProto.PasspointProvisionStats.ProvisionFailureCount[] provisionFailureCount;
        public static com.android.server.wifi.nano.WifiMetricsProto.PasspointProvisionStats[] emptyArray() { return null; }
        public PasspointProvisionStats() { super(); }
        public com.android.server.wifi.nano.WifiMetricsProto.PasspointProvisionStats clear() { return null; }
        public void writeTo(com.android.framework.protobuf.nano.CodedOutputByteBufferNano p0) throws java.io.IOException {}
        protected int computeSerializedSize() { return 0; }
        public com.android.server.wifi.nano.WifiMetricsProto.PasspointProvisionStats mergeFrom(com.android.framework.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
        public static com.android.server.wifi.nano.WifiMetricsProto.PasspointProvisionStats parseFrom(byte[] p0) throws com.android.framework.protobuf.nano.InvalidProtocolBufferNanoException { return null; }
        public static com.android.server.wifi.nano.WifiMetricsProto.PasspointProvisionStats parseFrom(com.android.framework.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }

        public static final class ProvisionFailureCount extends com.android.framework.protobuf.nano.MessageNano {
            private static volatile com.android.server.wifi.nano.WifiMetricsProto.PasspointProvisionStats.ProvisionFailureCount[] _emptyArray;
            public int failureCode;
            public int count;
            public static com.android.server.wifi.nano.WifiMetricsProto.PasspointProvisionStats.ProvisionFailureCount[] emptyArray() { return null; }
            public ProvisionFailureCount() { super(); }
            public com.android.server.wifi.nano.WifiMetricsProto.PasspointProvisionStats.ProvisionFailureCount clear() { return null; }
            public void writeTo(com.android.framework.protobuf.nano.CodedOutputByteBufferNano p0) throws java.io.IOException {}
            protected int computeSerializedSize() { return 0; }
            public com.android.server.wifi.nano.WifiMetricsProto.PasspointProvisionStats.ProvisionFailureCount mergeFrom(com.android.framework.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
            public static com.android.server.wifi.nano.WifiMetricsProto.PasspointProvisionStats.ProvisionFailureCount parseFrom(byte[] p0) throws com.android.framework.protobuf.nano.InvalidProtocolBufferNanoException { return null; }
            public static com.android.server.wifi.nano.WifiMetricsProto.PasspointProvisionStats.ProvisionFailureCount parseFrom(com.android.framework.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
        }
    }

    public static final class PasspointProfileTypeCount extends com.android.framework.protobuf.nano.MessageNano {
        public static final int TYPE_UNKNOWN = 0;
        public static final int TYPE_EAP_TLS = 1;
        public static final int TYPE_EAP_TTLS = 2;
        public static final int TYPE_EAP_SIM = 3;
        public static final int TYPE_EAP_AKA = 4;
        public static final int TYPE_EAP_AKA_PRIME = 5;
        private static volatile com.android.server.wifi.nano.WifiMetricsProto.PasspointProfileTypeCount[] _emptyArray;
        public int eapMethodType;
        public int count;
        public static com.android.server.wifi.nano.WifiMetricsProto.PasspointProfileTypeCount[] emptyArray() { return null; }
        public PasspointProfileTypeCount() { super(); }
        public com.android.server.wifi.nano.WifiMetricsProto.PasspointProfileTypeCount clear() { return null; }
        public void writeTo(com.android.framework.protobuf.nano.CodedOutputByteBufferNano p0) throws java.io.IOException {}
        protected int computeSerializedSize() { return 0; }
        public com.android.server.wifi.nano.WifiMetricsProto.PasspointProfileTypeCount mergeFrom(com.android.framework.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
        public static com.android.server.wifi.nano.WifiMetricsProto.PasspointProfileTypeCount parseFrom(byte[] p0) throws com.android.framework.protobuf.nano.InvalidProtocolBufferNanoException { return null; }
        public static com.android.server.wifi.nano.WifiMetricsProto.PasspointProfileTypeCount parseFrom(com.android.framework.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
    }

    public static final class P2pConnectionEvent extends com.android.framework.protobuf.nano.MessageNano {
        public static final int CONNECTION_FRESH = 0;
        public static final int CONNECTION_REINVOKE = 1;
        public static final int CONNECTION_LOCAL = 2;
        public static final int CONNECTION_FAST = 3;
        public static final int CLF_UNKNOWN = 0;
        public static final int CLF_NONE = 1;
        public static final int CLF_TIMEOUT = 2;
        public static final int CLF_CANCEL = 3;
        public static final int CLF_PROV_DISC_FAIL = 4;
        public static final int CLF_INVITATION_FAIL = 5;
        public static final int CLF_USER_REJECT = 6;
        public static final int CLF_NEW_CONNECTION_ATTEMPT = 7;
        public static final int WPS_NA = -1;
        public static final int WPS_PBC = 0;
        public static final int WPS_DISPLAY = 1;
        public static final int WPS_KEYPAD = 2;
        public static final int WPS_LABEL = 3;
        private static volatile com.android.server.wifi.nano.WifiMetricsProto.P2pConnectionEvent[] _emptyArray;
        public long startTimeMillis;
        public int connectionType;
        public int wpsMethod;
        public int durationTakenToConnectMillis;
        public int connectivityLevelFailureCode;
        public static com.android.server.wifi.nano.WifiMetricsProto.P2pConnectionEvent[] emptyArray() { return null; }
        public P2pConnectionEvent() { super(); }
        public com.android.server.wifi.nano.WifiMetricsProto.P2pConnectionEvent clear() { return null; }
        public void writeTo(com.android.framework.protobuf.nano.CodedOutputByteBufferNano p0) throws java.io.IOException {}
        protected int computeSerializedSize() { return 0; }
        public com.android.server.wifi.nano.WifiMetricsProto.P2pConnectionEvent mergeFrom(com.android.framework.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
        public static com.android.server.wifi.nano.WifiMetricsProto.P2pConnectionEvent parseFrom(byte[] p0) throws com.android.framework.protobuf.nano.InvalidProtocolBufferNanoException { return null; }
        public static com.android.server.wifi.nano.WifiMetricsProto.P2pConnectionEvent parseFrom(com.android.framework.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
    }

    public static final class NumConnectableNetworksBucket extends com.android.framework.protobuf.nano.MessageNano {
        private static volatile com.android.server.wifi.nano.WifiMetricsProto.NumConnectableNetworksBucket[] _emptyArray;
        public int numConnectableNetworks;
        public int count;
        public static com.android.server.wifi.nano.WifiMetricsProto.NumConnectableNetworksBucket[] emptyArray() { return null; }
        public NumConnectableNetworksBucket() { super(); }
        public com.android.server.wifi.nano.WifiMetricsProto.NumConnectableNetworksBucket clear() { return null; }
        public void writeTo(com.android.framework.protobuf.nano.CodedOutputByteBufferNano p0) throws java.io.IOException {}
        protected int computeSerializedSize() { return 0; }
        public com.android.server.wifi.nano.WifiMetricsProto.NumConnectableNetworksBucket mergeFrom(com.android.framework.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
        public static com.android.server.wifi.nano.WifiMetricsProto.NumConnectableNetworksBucket parseFrom(byte[] p0) throws com.android.framework.protobuf.nano.InvalidProtocolBufferNanoException { return null; }
        public static com.android.server.wifi.nano.WifiMetricsProto.NumConnectableNetworksBucket parseFrom(com.android.framework.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
    }

    public static final class NetworkSelectionExperimentDecisions extends com.android.framework.protobuf.nano.MessageNano {
        private static volatile com.android.server.wifi.nano.WifiMetricsProto.NetworkSelectionExperimentDecisions[] _emptyArray;
        public int experiment1Id;
        public int experiment2Id;
        public com.android.server.wifi.nano.WifiMetricsProto.Int32Count[] sameSelectionNumChoicesCounter;
        public com.android.server.wifi.nano.WifiMetricsProto.Int32Count[] differentSelectionNumChoicesCounter;
        public static com.android.server.wifi.nano.WifiMetricsProto.NetworkSelectionExperimentDecisions[] emptyArray() { return null; }
        public NetworkSelectionExperimentDecisions() { super(); }
        public com.android.server.wifi.nano.WifiMetricsProto.NetworkSelectionExperimentDecisions clear() { return null; }
        public void writeTo(com.android.framework.protobuf.nano.CodedOutputByteBufferNano p0) throws java.io.IOException {}
        protected int computeSerializedSize() { return 0; }
        public com.android.server.wifi.nano.WifiMetricsProto.NetworkSelectionExperimentDecisions mergeFrom(com.android.framework.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
        public static com.android.server.wifi.nano.WifiMetricsProto.NetworkSelectionExperimentDecisions parseFrom(byte[] p0) throws com.android.framework.protobuf.nano.InvalidProtocolBufferNanoException { return null; }
        public static com.android.server.wifi.nano.WifiMetricsProto.NetworkSelectionExperimentDecisions parseFrom(com.android.framework.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
    }

    public static final class LinkSpeedCount extends com.android.framework.protobuf.nano.MessageNano {
        private static volatile com.android.server.wifi.nano.WifiMetricsProto.LinkSpeedCount[] _emptyArray;
        public int linkSpeedMbps;
        public int count;
        public int rssiSumDbm;
        public long rssiSumOfSquaresDbmSq;
        public static com.android.server.wifi.nano.WifiMetricsProto.LinkSpeedCount[] emptyArray() { return null; }
        public LinkSpeedCount() { super(); }
        public com.android.server.wifi.nano.WifiMetricsProto.LinkSpeedCount clear() { return null; }
        public void writeTo(com.android.framework.protobuf.nano.CodedOutputByteBufferNano p0) throws java.io.IOException {}
        protected int computeSerializedSize() { return 0; }
        public com.android.server.wifi.nano.WifiMetricsProto.LinkSpeedCount mergeFrom(com.android.framework.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
        public static com.android.server.wifi.nano.WifiMetricsProto.LinkSpeedCount parseFrom(byte[] p0) throws com.android.framework.protobuf.nano.InvalidProtocolBufferNanoException { return null; }
        public static com.android.server.wifi.nano.WifiMetricsProto.LinkSpeedCount parseFrom(com.android.framework.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
    }

    public static final class LinkProbeStats extends com.android.framework.protobuf.nano.MessageNano {
        public static final int LINK_PROBE_FAILURE_REASON_UNKNOWN = 0;
        public static final int LINK_PROBE_FAILURE_REASON_MCS_UNSUPPORTED = 1;
        public static final int LINK_PROBE_FAILURE_REASON_NO_ACK = 2;
        public static final int LINK_PROBE_FAILURE_REASON_TIMEOUT = 3;
        public static final int LINK_PROBE_FAILURE_REASON_ALREADY_STARTED = 4;
        private static volatile com.android.server.wifi.nano.WifiMetricsProto.LinkProbeStats[] _emptyArray;
        public com.android.server.wifi.nano.WifiMetricsProto.Int32Count[] successRssiCounts;
        public com.android.server.wifi.nano.WifiMetricsProto.Int32Count[] failureRssiCounts;
        public com.android.server.wifi.nano.WifiMetricsProto.Int32Count[] successLinkSpeedCounts;
        public com.android.server.wifi.nano.WifiMetricsProto.Int32Count[] failureLinkSpeedCounts;
        public com.android.server.wifi.nano.WifiMetricsProto.HistogramBucketInt32[] successSecondsSinceLastTxSuccessHistogram;
        public com.android.server.wifi.nano.WifiMetricsProto.HistogramBucketInt32[] failureSecondsSinceLastTxSuccessHistogram;
        public com.android.server.wifi.nano.WifiMetricsProto.HistogramBucketInt32[] successElapsedTimeMsHistogram;
        public com.android.server.wifi.nano.WifiMetricsProto.LinkProbeStats.LinkProbeFailureReasonCount[] failureReasonCounts;
        public com.android.server.wifi.nano.WifiMetricsProto.LinkProbeStats.ExperimentProbeCounts[] experimentProbeCounts;
        public static com.android.server.wifi.nano.WifiMetricsProto.LinkProbeStats[] emptyArray() { return null; }
        public LinkProbeStats() { super(); }
        public com.android.server.wifi.nano.WifiMetricsProto.LinkProbeStats clear() { return null; }
        public void writeTo(com.android.framework.protobuf.nano.CodedOutputByteBufferNano p0) throws java.io.IOException {}
        protected int computeSerializedSize() { return 0; }
        public com.android.server.wifi.nano.WifiMetricsProto.LinkProbeStats mergeFrom(com.android.framework.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
        public static com.android.server.wifi.nano.WifiMetricsProto.LinkProbeStats parseFrom(byte[] p0) throws com.android.framework.protobuf.nano.InvalidProtocolBufferNanoException { return null; }
        public static com.android.server.wifi.nano.WifiMetricsProto.LinkProbeStats parseFrom(com.android.framework.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }

        public static final class LinkProbeFailureReasonCount extends com.android.framework.protobuf.nano.MessageNano {
            private static volatile com.android.server.wifi.nano.WifiMetricsProto.LinkProbeStats.LinkProbeFailureReasonCount[] _emptyArray;
            public int failureReason;
            public int count;
            public static com.android.server.wifi.nano.WifiMetricsProto.LinkProbeStats.LinkProbeFailureReasonCount[] emptyArray() { return null; }
            public LinkProbeFailureReasonCount() { super(); }
            public com.android.server.wifi.nano.WifiMetricsProto.LinkProbeStats.LinkProbeFailureReasonCount clear() { return null; }
            public void writeTo(com.android.framework.protobuf.nano.CodedOutputByteBufferNano p0) throws java.io.IOException {}
            protected int computeSerializedSize() { return 0; }
            public com.android.server.wifi.nano.WifiMetricsProto.LinkProbeStats.LinkProbeFailureReasonCount mergeFrom(com.android.framework.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
            public static com.android.server.wifi.nano.WifiMetricsProto.LinkProbeStats.LinkProbeFailureReasonCount parseFrom(byte[] p0) throws com.android.framework.protobuf.nano.InvalidProtocolBufferNanoException { return null; }
            public static com.android.server.wifi.nano.WifiMetricsProto.LinkProbeStats.LinkProbeFailureReasonCount parseFrom(com.android.framework.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
        }

        public static final class ExperimentProbeCounts extends com.android.framework.protobuf.nano.MessageNano {
            private static volatile com.android.server.wifi.nano.WifiMetricsProto.LinkProbeStats.ExperimentProbeCounts[] _emptyArray;
            public java.lang.String experimentId;
            public int probeCount;
            public static com.android.server.wifi.nano.WifiMetricsProto.LinkProbeStats.ExperimentProbeCounts[] emptyArray() { return null; }
            public ExperimentProbeCounts() { super(); }
            public com.android.server.wifi.nano.WifiMetricsProto.LinkProbeStats.ExperimentProbeCounts clear() { return null; }
            public void writeTo(com.android.framework.protobuf.nano.CodedOutputByteBufferNano p0) throws java.io.IOException {}
            protected int computeSerializedSize() { return 0; }
            public com.android.server.wifi.nano.WifiMetricsProto.LinkProbeStats.ExperimentProbeCounts mergeFrom(com.android.framework.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
            public static com.android.server.wifi.nano.WifiMetricsProto.LinkProbeStats.ExperimentProbeCounts parseFrom(byte[] p0) throws com.android.framework.protobuf.nano.InvalidProtocolBufferNanoException { return null; }
            public static com.android.server.wifi.nano.WifiMetricsProto.LinkProbeStats.ExperimentProbeCounts parseFrom(com.android.framework.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
        }
    }

    public static final class Int32Count extends com.android.framework.protobuf.nano.MessageNano {
        private static volatile com.android.server.wifi.nano.WifiMetricsProto.Int32Count[] _emptyArray;
        public int key;
        public int count;
        public static com.android.server.wifi.nano.WifiMetricsProto.Int32Count[] emptyArray() { return null; }
        public Int32Count() { super(); }
        public com.android.server.wifi.nano.WifiMetricsProto.Int32Count clear() { return null; }
        public void writeTo(com.android.framework.protobuf.nano.CodedOutputByteBufferNano p0) throws java.io.IOException {}
        protected int computeSerializedSize() { return 0; }
        public com.android.server.wifi.nano.WifiMetricsProto.Int32Count mergeFrom(com.android.framework.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
        public static com.android.server.wifi.nano.WifiMetricsProto.Int32Count parseFrom(byte[] p0) throws com.android.framework.protobuf.nano.InvalidProtocolBufferNanoException { return null; }
        public static com.android.server.wifi.nano.WifiMetricsProto.Int32Count parseFrom(com.android.framework.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
    }

    public static final class HistogramBucketInt32 extends com.android.framework.protobuf.nano.MessageNano {
        private static volatile com.android.server.wifi.nano.WifiMetricsProto.HistogramBucketInt32[] _emptyArray;
        public int start;
        public int end;
        public int count;
        public static com.android.server.wifi.nano.WifiMetricsProto.HistogramBucketInt32[] emptyArray() { return null; }
        public HistogramBucketInt32() { super(); }
        public com.android.server.wifi.nano.WifiMetricsProto.HistogramBucketInt32 clear() { return null; }
        public void writeTo(com.android.framework.protobuf.nano.CodedOutputByteBufferNano p0) throws java.io.IOException {}
        protected int computeSerializedSize() { return 0; }
        public com.android.server.wifi.nano.WifiMetricsProto.HistogramBucketInt32 mergeFrom(com.android.framework.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
        public static com.android.server.wifi.nano.WifiMetricsProto.HistogramBucketInt32 parseFrom(byte[] p0) throws com.android.framework.protobuf.nano.InvalidProtocolBufferNanoException { return null; }
        public static com.android.server.wifi.nano.WifiMetricsProto.HistogramBucketInt32 parseFrom(com.android.framework.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
    }

    public static final class GroupEvent extends com.android.framework.protobuf.nano.MessageNano {
        public static final int GROUP_OWNER = 0;
        public static final int GROUP_CLIENT = 1;
        private static volatile com.android.server.wifi.nano.WifiMetricsProto.GroupEvent[] _emptyArray;
        public int netId;
        public long startTimeMillis;
        public int channelFrequency;
        public int groupRole;
        public int numConnectedClients;
        public int numCumulativeClients;
        public int sessionDurationMillis;
        public int idleDurationMillis;
        public static com.android.server.wifi.nano.WifiMetricsProto.GroupEvent[] emptyArray() { return null; }
        public GroupEvent() { super(); }
        public com.android.server.wifi.nano.WifiMetricsProto.GroupEvent clear() { return null; }
        public void writeTo(com.android.framework.protobuf.nano.CodedOutputByteBufferNano p0) throws java.io.IOException {}
        protected int computeSerializedSize() { return 0; }
        public com.android.server.wifi.nano.WifiMetricsProto.GroupEvent mergeFrom(com.android.framework.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
        public static com.android.server.wifi.nano.WifiMetricsProto.GroupEvent parseFrom(byte[] p0) throws com.android.framework.protobuf.nano.InvalidProtocolBufferNanoException { return null; }
        public static com.android.server.wifi.nano.WifiMetricsProto.GroupEvent parseFrom(com.android.framework.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
    }

    public static final class ExperimentValues extends com.android.framework.protobuf.nano.MessageNano {
        private static volatile com.android.server.wifi.nano.WifiMetricsProto.ExperimentValues[] _emptyArray;
        public boolean wifiIsUnusableLoggingEnabled;
        public int wifiDataStallMinTxBad;
        public int wifiDataStallMinTxSuccessWithoutRx;
        public boolean linkSpeedCountsLoggingEnabled;
        public static com.android.server.wifi.nano.WifiMetricsProto.ExperimentValues[] emptyArray() { return null; }
        public ExperimentValues() { super(); }
        public com.android.server.wifi.nano.WifiMetricsProto.ExperimentValues clear() { return null; }
        public void writeTo(com.android.framework.protobuf.nano.CodedOutputByteBufferNano p0) throws java.io.IOException {}
        protected int computeSerializedSize() { return 0; }
        public com.android.server.wifi.nano.WifiMetricsProto.ExperimentValues mergeFrom(com.android.framework.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
        public static com.android.server.wifi.nano.WifiMetricsProto.ExperimentValues parseFrom(byte[] p0) throws com.android.framework.protobuf.nano.InvalidProtocolBufferNanoException { return null; }
        public static com.android.server.wifi.nano.WifiMetricsProto.ExperimentValues parseFrom(com.android.framework.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
    }

    public static final class DeviceMobilityStatePnoScanStats extends com.android.framework.protobuf.nano.MessageNano {
        public static final int UNKNOWN = 0;
        public static final int HIGH_MVMT = 1;
        public static final int LOW_MVMT = 2;
        public static final int STATIONARY = 3;
        private static volatile com.android.server.wifi.nano.WifiMetricsProto.DeviceMobilityStatePnoScanStats[] _emptyArray;
        public int deviceMobilityState;
        public int numTimesEnteredState;
        public long totalDurationMs;
        public long pnoDurationMs;
        public static com.android.server.wifi.nano.WifiMetricsProto.DeviceMobilityStatePnoScanStats[] emptyArray() { return null; }
        public DeviceMobilityStatePnoScanStats() { super(); }
        public com.android.server.wifi.nano.WifiMetricsProto.DeviceMobilityStatePnoScanStats clear() { return null; }
        public void writeTo(com.android.framework.protobuf.nano.CodedOutputByteBufferNano p0) throws java.io.IOException {}
        protected int computeSerializedSize() { return 0; }
        public com.android.server.wifi.nano.WifiMetricsProto.DeviceMobilityStatePnoScanStats mergeFrom(com.android.framework.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
        public static com.android.server.wifi.nano.WifiMetricsProto.DeviceMobilityStatePnoScanStats parseFrom(byte[] p0) throws com.android.framework.protobuf.nano.InvalidProtocolBufferNanoException { return null; }
        public static com.android.server.wifi.nano.WifiMetricsProto.DeviceMobilityStatePnoScanStats parseFrom(com.android.framework.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
    }

    public static final class ConnectionEvent extends com.android.framework.protobuf.nano.MessageNano {
        public static final int ROAM_UNKNOWN = 0;
        public static final int ROAM_NONE = 1;
        public static final int ROAM_DBDC = 2;
        public static final int ROAM_ENTERPRISE = 3;
        public static final int ROAM_USER_SELECTED = 4;
        public static final int ROAM_UNRELATED = 5;
        public static final int HLF_UNKNOWN = 0;
        public static final int HLF_NONE = 1;
        public static final int HLF_DHCP = 2;
        public static final int HLF_NO_INTERNET = 3;
        public static final int HLF_UNWANTED = 4;
        public static final int FAILURE_REASON_UNKNOWN = 0;
        public static final int AUTH_FAILURE_NONE = 1;
        public static final int AUTH_FAILURE_TIMEOUT = 2;
        public static final int AUTH_FAILURE_WRONG_PSWD = 3;
        public static final int AUTH_FAILURE_EAP_FAILURE = 4;
        public static final int NOMINATOR_UNKNOWN = 0;
        public static final int NOMINATOR_MANUAL = 1;
        public static final int NOMINATOR_SAVED = 2;
        public static final int NOMINATOR_SUGGESTION = 3;
        public static final int NOMINATOR_PASSPOINT = 4;
        public static final int NOMINATOR_CARRIER = 5;
        public static final int NOMINATOR_EXTERNAL_SCORED = 6;
        public static final int NOMINATOR_SPECIFIER = 7;
        public static final int NOMINATOR_SAVED_USER_CONNECT_CHOICE = 8;
        public static final int NOMINATOR_OPEN_NETWORK_AVAILABLE = 9;
        private static volatile com.android.server.wifi.nano.WifiMetricsProto.ConnectionEvent[] _emptyArray;
        public long startTimeMillis;
        public int durationTakenToConnectMillis;
        public com.android.server.wifi.nano.WifiMetricsProto.RouterFingerPrint routerFingerprint;
        public int signalStrength;
        public int roamType;
        public int connectionResult;
        public int level2FailureCode;
        public int connectivityLevelFailureCode;
        public boolean automaticBugReportTaken;
        public boolean useRandomizedMac;
        public int connectionNominator;
        public int networkSelectorExperimentId;
        public int level2FailureReason;
        public static com.android.server.wifi.nano.WifiMetricsProto.ConnectionEvent[] emptyArray() { return null; }
        public ConnectionEvent() { super(); }
        public com.android.server.wifi.nano.WifiMetricsProto.ConnectionEvent clear() { return null; }
        public void writeTo(com.android.framework.protobuf.nano.CodedOutputByteBufferNano p0) throws java.io.IOException {}
        protected int computeSerializedSize() { return 0; }
        public com.android.server.wifi.nano.WifiMetricsProto.ConnectionEvent mergeFrom(com.android.framework.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
        public static com.android.server.wifi.nano.WifiMetricsProto.ConnectionEvent parseFrom(byte[] p0) throws com.android.framework.protobuf.nano.InvalidProtocolBufferNanoException { return null; }
        public static com.android.server.wifi.nano.WifiMetricsProto.ConnectionEvent parseFrom(com.android.framework.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
    }

    public static final class ConnectToNetworkNotificationAndActionCount extends com.android.framework.protobuf.nano.MessageNano {
        public static final int NOTIFICATION_UNKNOWN = 0;
        public static final int NOTIFICATION_RECOMMEND_NETWORK = 1;
        public static final int NOTIFICATION_CONNECTING_TO_NETWORK = 2;
        public static final int NOTIFICATION_CONNECTED_TO_NETWORK = 3;
        public static final int NOTIFICATION_FAILED_TO_CONNECT = 4;
        public static final int ACTION_UNKNOWN = 0;
        public static final int ACTION_USER_DISMISSED_NOTIFICATION = 1;
        public static final int ACTION_CONNECT_TO_NETWORK = 2;
        public static final int ACTION_PICK_WIFI_NETWORK = 3;
        public static final int ACTION_PICK_WIFI_NETWORK_AFTER_CONNECT_FAILURE = 4;
        public static final int RECOMMENDER_UNKNOWN = 0;
        public static final int RECOMMENDER_OPEN = 1;
        private static volatile com.android.server.wifi.nano.WifiMetricsProto.ConnectToNetworkNotificationAndActionCount[] _emptyArray;
        public int notification;
        public int action;
        public int recommender;
        public int count;
        public static com.android.server.wifi.nano.WifiMetricsProto.ConnectToNetworkNotificationAndActionCount[] emptyArray() { return null; }
        public ConnectToNetworkNotificationAndActionCount() { super(); }
        public com.android.server.wifi.nano.WifiMetricsProto.ConnectToNetworkNotificationAndActionCount clear() { return null; }
        public void writeTo(com.android.framework.protobuf.nano.CodedOutputByteBufferNano p0) throws java.io.IOException {}
        protected int computeSerializedSize() { return 0; }
        public com.android.server.wifi.nano.WifiMetricsProto.ConnectToNetworkNotificationAndActionCount mergeFrom(com.android.framework.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
        public static com.android.server.wifi.nano.WifiMetricsProto.ConnectToNetworkNotificationAndActionCount parseFrom(byte[] p0) throws com.android.framework.protobuf.nano.InvalidProtocolBufferNanoException { return null; }
        public static com.android.server.wifi.nano.WifiMetricsProto.ConnectToNetworkNotificationAndActionCount parseFrom(com.android.framework.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
    }

    public static final class AlertReasonCount extends com.android.framework.protobuf.nano.MessageNano {
        private static volatile com.android.server.wifi.nano.WifiMetricsProto.AlertReasonCount[] _emptyArray;
        public int reason;
        public int count;
        public static com.android.server.wifi.nano.WifiMetricsProto.AlertReasonCount[] emptyArray() { return null; }
        public AlertReasonCount() { super(); }
        public com.android.server.wifi.nano.WifiMetricsProto.AlertReasonCount clear() { return null; }
        public void writeTo(com.android.framework.protobuf.nano.CodedOutputByteBufferNano p0) throws java.io.IOException {}
        protected int computeSerializedSize() { return 0; }
        public com.android.server.wifi.nano.WifiMetricsProto.AlertReasonCount mergeFrom(com.android.framework.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
        public static com.android.server.wifi.nano.WifiMetricsProto.AlertReasonCount parseFrom(byte[] p0) throws com.android.framework.protobuf.nano.InvalidProtocolBufferNanoException { return null; }
        public static com.android.server.wifi.nano.WifiMetricsProto.AlertReasonCount parseFrom(com.android.framework.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
    }
}
