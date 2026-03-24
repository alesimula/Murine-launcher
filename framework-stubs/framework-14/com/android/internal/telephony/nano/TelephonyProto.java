package com.android.internal.telephony.nano;

public interface TelephonyProto {

    public static final class ActiveSubscriptionInfo extends com.android.internal.telephony.protobuf.nano.ExtendableMessageNano<com.android.internal.telephony.nano.TelephonyProto.ActiveSubscriptionInfo> {
        public int slotIndex;
        public int carrierId;
        public int isOpportunistic;
        public java.lang.String simMccmnc;
        public static com.android.internal.telephony.nano.TelephonyProto.ActiveSubscriptionInfo[] emptyArray() { return null; }
        public ActiveSubscriptionInfo() { super(); }
        public com.android.internal.telephony.nano.TelephonyProto.ActiveSubscriptionInfo clear() { return null; }
        public void writeTo(com.android.internal.telephony.protobuf.nano.CodedOutputByteBufferNano p0) throws java.io.IOException {}
        protected int computeSerializedSize() { return 0; }
        public com.android.internal.telephony.nano.TelephonyProto.ActiveSubscriptionInfo mergeFrom(com.android.internal.telephony.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
        public static com.android.internal.telephony.nano.TelephonyProto.ActiveSubscriptionInfo parseFrom(byte[] p0) throws com.android.internal.telephony.protobuf.nano.InvalidProtocolBufferNanoException { return null; }
        public static com.android.internal.telephony.nano.TelephonyProto.ActiveSubscriptionInfo parseFrom(com.android.internal.telephony.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
    }

    public static final class BandwidthEstimatorStats extends com.android.internal.telephony.protobuf.nano.ExtendableMessageNano<com.android.internal.telephony.nano.TelephonyProto.BandwidthEstimatorStats> {
        public com.android.internal.telephony.nano.TelephonyProto.BandwidthEstimatorStats.PerRat[] perRatTx;
        public com.android.internal.telephony.nano.TelephonyProto.BandwidthEstimatorStats.PerRat[] perRatRx;
        public static com.android.internal.telephony.nano.TelephonyProto.BandwidthEstimatorStats[] emptyArray() { return null; }
        public BandwidthEstimatorStats() { super(); }
        public com.android.internal.telephony.nano.TelephonyProto.BandwidthEstimatorStats clear() { return null; }
        public void writeTo(com.android.internal.telephony.protobuf.nano.CodedOutputByteBufferNano p0) throws java.io.IOException {}
        protected int computeSerializedSize() { return 0; }
        public com.android.internal.telephony.nano.TelephonyProto.BandwidthEstimatorStats mergeFrom(com.android.internal.telephony.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
        public static com.android.internal.telephony.nano.TelephonyProto.BandwidthEstimatorStats parseFrom(byte[] p0) throws com.android.internal.telephony.protobuf.nano.InvalidProtocolBufferNanoException { return null; }
        public static com.android.internal.telephony.nano.TelephonyProto.BandwidthEstimatorStats parseFrom(com.android.internal.telephony.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }

        public static final class PerLevel extends com.android.internal.telephony.protobuf.nano.ExtendableMessageNano<com.android.internal.telephony.nano.TelephonyProto.BandwidthEstimatorStats.PerLevel> {
            public int signalLevel;
            public int count;
            public int avgBwKbps;
            public int staticBwErrorPercent;
            public int bwEstErrorPercent;
            public static com.android.internal.telephony.nano.TelephonyProto.BandwidthEstimatorStats.PerLevel[] emptyArray() { return null; }
            public PerLevel() { super(); }
            public com.android.internal.telephony.nano.TelephonyProto.BandwidthEstimatorStats.PerLevel clear() { return null; }
            public void writeTo(com.android.internal.telephony.protobuf.nano.CodedOutputByteBufferNano p0) throws java.io.IOException {}
            protected int computeSerializedSize() { return 0; }
            public com.android.internal.telephony.nano.TelephonyProto.BandwidthEstimatorStats.PerLevel mergeFrom(com.android.internal.telephony.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
            public static com.android.internal.telephony.nano.TelephonyProto.BandwidthEstimatorStats.PerLevel parseFrom(byte[] p0) throws com.android.internal.telephony.protobuf.nano.InvalidProtocolBufferNanoException { return null; }
            public static com.android.internal.telephony.nano.TelephonyProto.BandwidthEstimatorStats.PerLevel parseFrom(com.android.internal.telephony.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
        }

        public static final class PerRat extends com.android.internal.telephony.protobuf.nano.ExtendableMessageNano<com.android.internal.telephony.nano.TelephonyProto.BandwidthEstimatorStats.PerRat> {
            public int rat;
            public int nrMode;
            public com.android.internal.telephony.nano.TelephonyProto.BandwidthEstimatorStats.PerLevel[] perLevel;
            public static com.android.internal.telephony.nano.TelephonyProto.BandwidthEstimatorStats.PerRat[] emptyArray() { return null; }
            public PerRat() { super(); }
            public com.android.internal.telephony.nano.TelephonyProto.BandwidthEstimatorStats.PerRat clear() { return null; }
            public void writeTo(com.android.internal.telephony.protobuf.nano.CodedOutputByteBufferNano p0) throws java.io.IOException {}
            protected int computeSerializedSize() { return 0; }
            public com.android.internal.telephony.nano.TelephonyProto.BandwidthEstimatorStats.PerRat mergeFrom(com.android.internal.telephony.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
            public static com.android.internal.telephony.nano.TelephonyProto.BandwidthEstimatorStats.PerRat parseFrom(byte[] p0) throws com.android.internal.telephony.protobuf.nano.InvalidProtocolBufferNanoException { return null; }
            public static com.android.internal.telephony.nano.TelephonyProto.BandwidthEstimatorStats.PerRat parseFrom(com.android.internal.telephony.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
        }
    }

    public static final class EmergencyNumberInfo extends com.android.internal.telephony.protobuf.nano.ExtendableMessageNano<com.android.internal.telephony.nano.TelephonyProto.EmergencyNumberInfo> {
        public java.lang.String address;
        public java.lang.String countryIso;
        public java.lang.String mnc;
        public int serviceCategoriesBitmask;
        public java.lang.String[] urns;
        public int numberSourcesBitmask;
        public int routing;
        public static com.android.internal.telephony.nano.TelephonyProto.EmergencyNumberInfo[] emptyArray() { return null; }
        public EmergencyNumberInfo() { super(); }
        public com.android.internal.telephony.nano.TelephonyProto.EmergencyNumberInfo clear() { return null; }
        public void writeTo(com.android.internal.telephony.protobuf.nano.CodedOutputByteBufferNano p0) throws java.io.IOException {}
        protected int computeSerializedSize() { return 0; }
        public com.android.internal.telephony.nano.TelephonyProto.EmergencyNumberInfo mergeFrom(com.android.internal.telephony.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
        public static com.android.internal.telephony.nano.TelephonyProto.EmergencyNumberInfo parseFrom(byte[] p0) throws com.android.internal.telephony.protobuf.nano.InvalidProtocolBufferNanoException { return null; }
        public static com.android.internal.telephony.nano.TelephonyProto.EmergencyNumberInfo parseFrom(com.android.internal.telephony.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
    }

    public static final class ImsCapabilities extends com.android.internal.telephony.protobuf.nano.ExtendableMessageNano<com.android.internal.telephony.nano.TelephonyProto.ImsCapabilities> {
        public boolean voiceOverLte;
        public boolean voiceOverWifi;
        public boolean videoOverLte;
        public boolean videoOverWifi;
        public boolean utOverLte;
        public boolean utOverWifi;
        public static com.android.internal.telephony.nano.TelephonyProto.ImsCapabilities[] emptyArray() { return null; }
        public ImsCapabilities() { super(); }
        public com.android.internal.telephony.nano.TelephonyProto.ImsCapabilities clear() { return null; }
        public void writeTo(com.android.internal.telephony.protobuf.nano.CodedOutputByteBufferNano p0) throws java.io.IOException {}
        protected int computeSerializedSize() { return 0; }
        public com.android.internal.telephony.nano.TelephonyProto.ImsCapabilities mergeFrom(com.android.internal.telephony.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
        public static com.android.internal.telephony.nano.TelephonyProto.ImsCapabilities parseFrom(byte[] p0) throws com.android.internal.telephony.protobuf.nano.InvalidProtocolBufferNanoException { return null; }
        public static com.android.internal.telephony.nano.TelephonyProto.ImsCapabilities parseFrom(com.android.internal.telephony.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
    }

    public static final class ImsConnectionState extends com.android.internal.telephony.protobuf.nano.ExtendableMessageNano<com.android.internal.telephony.nano.TelephonyProto.ImsConnectionState> {
        public int state;
        public com.android.internal.telephony.nano.TelephonyProto.ImsReasonInfo reasonInfo;
        public static com.android.internal.telephony.nano.TelephonyProto.ImsConnectionState[] emptyArray() { return null; }
        public ImsConnectionState() { super(); }
        public com.android.internal.telephony.nano.TelephonyProto.ImsConnectionState clear() { return null; }
        public void writeTo(com.android.internal.telephony.protobuf.nano.CodedOutputByteBufferNano p0) throws java.io.IOException {}
        protected int computeSerializedSize() { return 0; }
        public com.android.internal.telephony.nano.TelephonyProto.ImsConnectionState mergeFrom(com.android.internal.telephony.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
        public static com.android.internal.telephony.nano.TelephonyProto.ImsConnectionState parseFrom(byte[] p0) throws com.android.internal.telephony.protobuf.nano.InvalidProtocolBufferNanoException { return null; }
        public static com.android.internal.telephony.nano.TelephonyProto.ImsConnectionState parseFrom(com.android.internal.telephony.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }

        public static interface State {
            public static final int STATE_UNKNOWN = 0;
            public static final int CONNECTED = 1;
            public static final int PROGRESSING = 2;
            public static final int DISCONNECTED = 3;
            public static final int RESUMED = 4;
            public static final int SUSPENDED = 5;
        }
    }

    public static final class ImsReasonInfo extends com.android.internal.telephony.protobuf.nano.ExtendableMessageNano<com.android.internal.telephony.nano.TelephonyProto.ImsReasonInfo> {
        public int reasonCode;
        public int extraCode;
        public java.lang.String extraMessage;
        public static com.android.internal.telephony.nano.TelephonyProto.ImsReasonInfo[] emptyArray() { return null; }
        public ImsReasonInfo() { super(); }
        public com.android.internal.telephony.nano.TelephonyProto.ImsReasonInfo clear() { return null; }
        public void writeTo(com.android.internal.telephony.protobuf.nano.CodedOutputByteBufferNano p0) throws java.io.IOException {}
        protected int computeSerializedSize() { return 0; }
        public com.android.internal.telephony.nano.TelephonyProto.ImsReasonInfo mergeFrom(com.android.internal.telephony.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
        public static com.android.internal.telephony.nano.TelephonyProto.ImsReasonInfo parseFrom(byte[] p0) throws com.android.internal.telephony.protobuf.nano.InvalidProtocolBufferNanoException { return null; }
        public static com.android.internal.telephony.nano.TelephonyProto.ImsReasonInfo parseFrom(com.android.internal.telephony.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
    }

    public static interface ImsServiceErrno {
        public static final int IMS_E_UNKNOWN = 0;
        public static final int IMS_E_SUCCESS = 1;
        public static final int IMS_E_SMS_SEND_STATUS_ERROR = 2;
        public static final int IMS_E_SMS_SEND_STATUS_ERROR_RETRY = 3;
        public static final int IMS_E_SMS_SEND_STATUS_ERROR_FALLBACK = 4;
    }

    public static final class ModemPowerStats extends com.android.internal.telephony.protobuf.nano.ExtendableMessageNano<com.android.internal.telephony.nano.TelephonyProto.ModemPowerStats> {
        public long loggingDurationMs;
        public double energyConsumedMah;
        public long numPacketsTx;
        public long cellularKernelActiveTimeMs;
        public long timeInVeryPoorRxSignalLevelMs;
        public long sleepTimeMs;
        public long idleTimeMs;
        public long rxTimeMs;
        public long[] txTimeMs;
        public long numBytesTx;
        public long numPacketsRx;
        public long numBytesRx;
        public long[] timeInRatMs;
        public long[] timeInRxSignalStrengthLevelMs;
        public double monitoredRailEnergyConsumedMah;
        public static com.android.internal.telephony.nano.TelephonyProto.ModemPowerStats[] emptyArray() { return null; }
        public ModemPowerStats() { super(); }
        public com.android.internal.telephony.nano.TelephonyProto.ModemPowerStats clear() { return null; }
        public void writeTo(com.android.internal.telephony.protobuf.nano.CodedOutputByteBufferNano p0) throws java.io.IOException {}
        protected int computeSerializedSize() { return 0; }
        public com.android.internal.telephony.nano.TelephonyProto.ModemPowerStats mergeFrom(com.android.internal.telephony.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
        public static com.android.internal.telephony.nano.TelephonyProto.ModemPowerStats parseFrom(byte[] p0) throws com.android.internal.telephony.protobuf.nano.InvalidProtocolBufferNanoException { return null; }
        public static com.android.internal.telephony.nano.TelephonyProto.ModemPowerStats parseFrom(com.android.internal.telephony.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
    }

    public static interface NrMode {
        public static final int NR_NONE = 1;
        public static final int NR_NSA = 2;
        public static final int NR_NSA_MMWAVE = 3;
        public static final int NR_SA = 4;
        public static final int NR_SA_MMWAVE = 5;
    }

    public static interface PdpType {
        public static final int PDP_UNKNOWN = 0;
        public static final int PDP_TYPE_IP = 1;
        public static final int PDP_TYPE_IPV6 = 2;
        public static final int PDP_TYPE_IPV4V6 = 3;
        public static final int PDP_TYPE_PPP = 4;
        public static final int PDP_TYPE_NON_IP = 5;
        public static final int PDP_TYPE_UNSTRUCTURED = 6;
    }

    public static interface RadioAccessTechnology {
        public static final int UNKNOWN = -1;
        public static final int RAT_UNKNOWN = 0;
        public static final int RAT_GPRS = 1;
        public static final int RAT_EDGE = 2;
        public static final int RAT_UMTS = 3;
        public static final int RAT_IS95A = 4;
        public static final int RAT_IS95B = 5;
        public static final int RAT_1XRTT = 6;
        public static final int RAT_EVDO_0 = 7;
        public static final int RAT_EVDO_A = 8;
        public static final int RAT_HSDPA = 9;
        public static final int RAT_HSUPA = 10;
        public static final int RAT_HSPA = 11;
        public static final int RAT_EVDO_B = 12;
        public static final int RAT_EHRPD = 13;
        public static final int RAT_LTE = 14;
        public static final int RAT_HSPAP = 15;
        public static final int RAT_GSM = 16;
        public static final int RAT_TD_SCDMA = 17;
        public static final int RAT_IWLAN = 18;
        public static final int RAT_LTE_CA = 19;
        public static final int RAT_NR = 20;
    }

    public static final class RilDataCall extends com.android.internal.telephony.protobuf.nano.ExtendableMessageNano<com.android.internal.telephony.nano.TelephonyProto.RilDataCall> {
        public int cid;
        public int type;
        public java.lang.String ifname;
        public int state;
        public int apnTypeBitmask;
        public static com.android.internal.telephony.nano.TelephonyProto.RilDataCall[] emptyArray() { return null; }
        public RilDataCall() { super(); }
        public com.android.internal.telephony.nano.TelephonyProto.RilDataCall clear() { return null; }
        public void writeTo(com.android.internal.telephony.protobuf.nano.CodedOutputByteBufferNano p0) throws java.io.IOException {}
        protected int computeSerializedSize() { return 0; }
        public com.android.internal.telephony.nano.TelephonyProto.RilDataCall mergeFrom(com.android.internal.telephony.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
        public static com.android.internal.telephony.nano.TelephonyProto.RilDataCall parseFrom(byte[] p0) throws com.android.internal.telephony.protobuf.nano.InvalidProtocolBufferNanoException { return null; }
        public static com.android.internal.telephony.nano.TelephonyProto.RilDataCall parseFrom(com.android.internal.telephony.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }

        public static interface State {
            public static final int UNKNOWN = 0;
            public static final int CONNECTED = 1;
            public static final int DISCONNECTED = 2;
        }
    }

    public static interface RilErrno {
        public static final int RIL_E_UNKNOWN = 0;
        public static final int RIL_E_SUCCESS = 1;
        public static final int RIL_E_RADIO_NOT_AVAILABLE = 2;
        public static final int RIL_E_GENERIC_FAILURE = 3;
        public static final int RIL_E_PASSWORD_INCORRECT = 4;
        public static final int RIL_E_SIM_PIN2 = 5;
        public static final int RIL_E_SIM_PUK2 = 6;
        public static final int RIL_E_REQUEST_NOT_SUPPORTED = 7;
        public static final int RIL_E_CANCELLED = 8;
        public static final int RIL_E_OP_NOT_ALLOWED_DURING_VOICE_CALL = 9;
        public static final int RIL_E_OP_NOT_ALLOWED_BEFORE_REG_TO_NW = 10;
        public static final int RIL_E_SMS_SEND_FAIL_RETRY = 11;
        public static final int RIL_E_SIM_ABSENT = 12;
        public static final int RIL_E_SUBSCRIPTION_NOT_AVAILABLE = 13;
        public static final int RIL_E_MODE_NOT_SUPPORTED = 14;
        public static final int RIL_E_FDN_CHECK_FAILURE = 15;
        public static final int RIL_E_ILLEGAL_SIM_OR_ME = 16;
        public static final int RIL_E_MISSING_RESOURCE = 17;
        public static final int RIL_E_NO_SUCH_ELEMENT = 18;
        public static final int RIL_E_DIAL_MODIFIED_TO_USSD = 19;
        public static final int RIL_E_DIAL_MODIFIED_TO_SS = 20;
        public static final int RIL_E_DIAL_MODIFIED_TO_DIAL = 21;
        public static final int RIL_E_USSD_MODIFIED_TO_DIAL = 22;
        public static final int RIL_E_USSD_MODIFIED_TO_SS = 23;
        public static final int RIL_E_USSD_MODIFIED_TO_USSD = 24;
        public static final int RIL_E_SS_MODIFIED_TO_DIAL = 25;
        public static final int RIL_E_SS_MODIFIED_TO_USSD = 26;
        public static final int RIL_E_SUBSCRIPTION_NOT_SUPPORTED = 27;
        public static final int RIL_E_SS_MODIFIED_TO_SS = 28;
        public static final int RIL_E_LCE_NOT_SUPPORTED = 36;
        public static final int RIL_E_LCE_NOT_SUPPORTED_NEW = 37;
        public static final int RIL_E_NO_MEMORY = 38;
        public static final int RIL_E_INTERNAL_ERR = 39;
        public static final int RIL_E_SYSTEM_ERR = 40;
        public static final int RIL_E_MODEM_ERR = 41;
        public static final int RIL_E_INVALID_STATE = 42;
        public static final int RIL_E_NO_RESOURCES = 43;
        public static final int RIL_E_SIM_ERR = 44;
        public static final int RIL_E_INVALID_ARGUMENTS = 45;
        public static final int RIL_E_INVALID_SIM_STATE = 46;
        public static final int RIL_E_INVALID_MODEM_STATE = 47;
        public static final int RIL_E_INVALID_CALL_ID = 48;
        public static final int RIL_E_NO_SMS_TO_ACK = 49;
        public static final int RIL_E_NETWORK_ERR = 50;
        public static final int RIL_E_REQUEST_RATE_LIMITED = 51;
        public static final int RIL_E_SIM_BUSY = 52;
        public static final int RIL_E_SIM_FULL = 53;
        public static final int RIL_E_NETWORK_REJECT = 54;
        public static final int RIL_E_OPERATION_NOT_ALLOWED = 55;
        public static final int RIL_E_EMPTY_RECORD = 56;
        public static final int RIL_E_INVALID_SMS_FORMAT = 57;
        public static final int RIL_E_ENCODING_ERR = 58;
        public static final int RIL_E_INVALID_SMSC_ADDRESS = 59;
        public static final int RIL_E_NO_SUCH_ENTRY = 60;
        public static final int RIL_E_NETWORK_NOT_READY = 61;
        public static final int RIL_E_NOT_PROVISIONED = 62;
        public static final int RIL_E_NO_SUBSCRIPTION = 63;
        public static final int RIL_E_NO_NETWORK_FOUND = 64;
        public static final int RIL_E_DEVICE_IN_USE = 65;
        public static final int RIL_E_ABORTED = 66;
        public static final int RIL_E_INVALID_RESPONSE = 67;
    }

    public static interface SimState {
        public static final int SIM_STATE_UNKNOWN = 0;
        public static final int SIM_STATE_ABSENT = 1;
        public static final int SIM_STATE_LOADED = 2;
    }

    public static final class SmsSession extends com.android.internal.telephony.protobuf.nano.ExtendableMessageNano<com.android.internal.telephony.nano.TelephonyProto.SmsSession> {
        public int startTimeMinutes;
        public int phoneId;
        public com.android.internal.telephony.nano.TelephonyProto.SmsSession.Event[] events;
        public boolean eventsDropped;
        public static com.android.internal.telephony.nano.TelephonyProto.SmsSession[] emptyArray() { return null; }
        public SmsSession() { super(); }
        public com.android.internal.telephony.nano.TelephonyProto.SmsSession clear() { return null; }
        public void writeTo(com.android.internal.telephony.protobuf.nano.CodedOutputByteBufferNano p0) throws java.io.IOException {}
        protected int computeSerializedSize() { return 0; }
        public com.android.internal.telephony.nano.TelephonyProto.SmsSession mergeFrom(com.android.internal.telephony.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
        public static com.android.internal.telephony.nano.TelephonyProto.SmsSession parseFrom(byte[] p0) throws com.android.internal.telephony.protobuf.nano.InvalidProtocolBufferNanoException { return null; }
        public static com.android.internal.telephony.nano.TelephonyProto.SmsSession parseFrom(com.android.internal.telephony.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }

        public static final class Event extends com.android.internal.telephony.protobuf.nano.ExtendableMessageNano<com.android.internal.telephony.nano.TelephonyProto.SmsSession.Event> {
            public int type;
            public int delay;
            public com.android.internal.telephony.nano.TelephonyProto.TelephonySettings settings;
            public com.android.internal.telephony.nano.TelephonyProto.TelephonyServiceState serviceState;
            public com.android.internal.telephony.nano.TelephonyProto.ImsConnectionState imsConnectionState;
            public com.android.internal.telephony.nano.TelephonyProto.ImsCapabilities imsCapabilities;
            public com.android.internal.telephony.nano.TelephonyProto.RilDataCall[] dataCalls;
            public int format;
            public int tech;
            public int errorCode;
            public int error;
            public int rilRequestId;
            public com.android.internal.telephony.nano.TelephonyProto.SmsSession.Event.CBMessage cellBroadcastMessage;
            public int imsError;
            public com.android.internal.telephony.nano.TelephonyProto.SmsSession.Event.IncompleteSms incompleteSms;
            public int smsType;
            public boolean blocked;
            public long messageId;
            public static com.android.internal.telephony.nano.TelephonyProto.SmsSession.Event[] emptyArray() { return null; }
            public Event() { super(); }
            public com.android.internal.telephony.nano.TelephonyProto.SmsSession.Event clear() { return null; }
            public void writeTo(com.android.internal.telephony.protobuf.nano.CodedOutputByteBufferNano p0) throws java.io.IOException {}
            protected int computeSerializedSize() { return 0; }
            public com.android.internal.telephony.nano.TelephonyProto.SmsSession.Event mergeFrom(com.android.internal.telephony.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
            public static com.android.internal.telephony.nano.TelephonyProto.SmsSession.Event parseFrom(byte[] p0) throws com.android.internal.telephony.protobuf.nano.InvalidProtocolBufferNanoException { return null; }
            public static com.android.internal.telephony.nano.TelephonyProto.SmsSession.Event parseFrom(com.android.internal.telephony.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }

            public static final class CBMessage extends com.android.internal.telephony.protobuf.nano.ExtendableMessageNano<com.android.internal.telephony.nano.TelephonyProto.SmsSession.Event.CBMessage> {
                public int msgFormat;
                public int msgPriority;
                public int msgType;
                public int serviceCategory;
                public int serialNumber;
                public long deliveredTimestampMillis;
                public static com.android.internal.telephony.nano.TelephonyProto.SmsSession.Event.CBMessage[] emptyArray() { return null; }
                public CBMessage() { super(); }
                public com.android.internal.telephony.nano.TelephonyProto.SmsSession.Event.CBMessage clear() { return null; }
                public void writeTo(com.android.internal.telephony.protobuf.nano.CodedOutputByteBufferNano p0) throws java.io.IOException {}
                protected int computeSerializedSize() { return 0; }
                public com.android.internal.telephony.nano.TelephonyProto.SmsSession.Event.CBMessage mergeFrom(com.android.internal.telephony.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
                public static com.android.internal.telephony.nano.TelephonyProto.SmsSession.Event.CBMessage parseFrom(byte[] p0) throws com.android.internal.telephony.protobuf.nano.InvalidProtocolBufferNanoException { return null; }
                public static com.android.internal.telephony.nano.TelephonyProto.SmsSession.Event.CBMessage parseFrom(com.android.internal.telephony.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
            }

            public static interface CBMessageType {
                public static final int TYPE_UNKNOWN = 0;
                public static final int ETWS = 1;
                public static final int CMAS = 2;
                public static final int OTHER = 3;
            }

            public static interface CBPriority {
                public static final int PRIORITY_UNKNOWN = 0;
                public static final int NORMAL = 1;
                public static final int INTERACTIVE = 2;
                public static final int URGENT = 3;
                public static final int EMERGENCY = 4;
            }

            public static interface Format {
                public static final int SMS_FORMAT_UNKNOWN = 0;
                public static final int SMS_FORMAT_3GPP = 1;
                public static final int SMS_FORMAT_3GPP2 = 2;
            }

            public static final class IncompleteSms extends com.android.internal.telephony.protobuf.nano.ExtendableMessageNano<com.android.internal.telephony.nano.TelephonyProto.SmsSession.Event.IncompleteSms> {
                public int receivedParts;
                public int totalParts;
                public static com.android.internal.telephony.nano.TelephonyProto.SmsSession.Event.IncompleteSms[] emptyArray() { return null; }
                public IncompleteSms() { super(); }
                public com.android.internal.telephony.nano.TelephonyProto.SmsSession.Event.IncompleteSms clear() { return null; }
                public void writeTo(com.android.internal.telephony.protobuf.nano.CodedOutputByteBufferNano p0) throws java.io.IOException {}
                protected int computeSerializedSize() { return 0; }
                public com.android.internal.telephony.nano.TelephonyProto.SmsSession.Event.IncompleteSms mergeFrom(com.android.internal.telephony.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
                public static com.android.internal.telephony.nano.TelephonyProto.SmsSession.Event.IncompleteSms parseFrom(byte[] p0) throws com.android.internal.telephony.protobuf.nano.InvalidProtocolBufferNanoException { return null; }
                public static com.android.internal.telephony.nano.TelephonyProto.SmsSession.Event.IncompleteSms parseFrom(com.android.internal.telephony.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
            }

            public static interface SmsType {
                public static final int SMS_TYPE_NORMAL = 0;
                public static final int SMS_TYPE_SMS_PP = 1;
                public static final int SMS_TYPE_VOICEMAIL_INDICATION = 2;
                public static final int SMS_TYPE_ZERO = 3;
                public static final int SMS_TYPE_WAP_PUSH = 4;
            }

            public static interface Tech {
                public static final int SMS_UNKNOWN = 0;
                public static final int SMS_GSM = 1;
                public static final int SMS_CDMA = 2;
                public static final int SMS_IMS = 3;
            }

            public static interface Type {
                public static final int EVENT_UNKNOWN = 0;
                public static final int SETTINGS_CHANGED = 1;
                public static final int RIL_SERVICE_STATE_CHANGED = 2;
                public static final int IMS_CONNECTION_STATE_CHANGED = 3;
                public static final int IMS_CAPABILITIES_CHANGED = 4;
                public static final int DATA_CALL_LIST_CHANGED = 5;
                public static final int SMS_SEND = 6;
                public static final int SMS_SEND_RESULT = 7;
                public static final int SMS_RECEIVED = 8;
                public static final int CB_SMS_RECEIVED = 9;
                public static final int INCOMPLETE_SMS_RECEIVED = 10;
            }
        }
    }

    public static final class TelephonyCallSession extends com.android.internal.telephony.protobuf.nano.ExtendableMessageNano<com.android.internal.telephony.nano.TelephonyProto.TelephonyCallSession> {
        public int startTimeMinutes;
        public int phoneId;
        public com.android.internal.telephony.nano.TelephonyProto.TelephonyCallSession.Event[] events;
        public boolean eventsDropped;
        public static com.android.internal.telephony.nano.TelephonyProto.TelephonyCallSession[] emptyArray() { return null; }
        public TelephonyCallSession() { super(); }
        public com.android.internal.telephony.nano.TelephonyProto.TelephonyCallSession clear() { return null; }
        public void writeTo(com.android.internal.telephony.protobuf.nano.CodedOutputByteBufferNano p0) throws java.io.IOException {}
        protected int computeSerializedSize() { return 0; }
        public com.android.internal.telephony.nano.TelephonyProto.TelephonyCallSession mergeFrom(com.android.internal.telephony.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
        public static com.android.internal.telephony.nano.TelephonyProto.TelephonyCallSession parseFrom(byte[] p0) throws com.android.internal.telephony.protobuf.nano.InvalidProtocolBufferNanoException { return null; }
        public static com.android.internal.telephony.nano.TelephonyProto.TelephonyCallSession parseFrom(com.android.internal.telephony.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }

        public static final class Event extends com.android.internal.telephony.protobuf.nano.ExtendableMessageNano<com.android.internal.telephony.nano.TelephonyProto.TelephonyCallSession.Event> {
            public int type;
            public int delay;
            public com.android.internal.telephony.nano.TelephonyProto.TelephonySettings settings;
            public com.android.internal.telephony.nano.TelephonyProto.TelephonyServiceState serviceState;
            public com.android.internal.telephony.nano.TelephonyProto.ImsConnectionState imsConnectionState;
            public com.android.internal.telephony.nano.TelephonyProto.ImsCapabilities imsCapabilities;
            public com.android.internal.telephony.nano.TelephonyProto.RilDataCall[] dataCalls;
            public int phoneState;
            public int callState;
            public int callIndex;
            public int mergedCallIndex;
            public com.android.internal.telephony.nano.TelephonyProto.TelephonyCallSession.Event.RilCall[] calls;
            public int error;
            public int rilRequest;
            public int rilRequestId;
            public int srvccState;
            public int imsCommand;
            public com.android.internal.telephony.nano.TelephonyProto.ImsReasonInfo reasonInfo;
            public int srcAccessTech;
            public int targetAccessTech;
            public long nitzTimestampMillis;
            public int audioCodec;
            public com.android.internal.telephony.nano.TelephonyProto.TelephonyCallSession.Event.CallQuality callQuality;
            public com.android.internal.telephony.nano.TelephonyProto.TelephonyCallSession.Event.CallQualitySummary callQualitySummaryDl;
            public com.android.internal.telephony.nano.TelephonyProto.TelephonyCallSession.Event.CallQualitySummary callQualitySummaryUl;
            public boolean isImsEmergencyCall;
            public com.android.internal.telephony.nano.TelephonyProto.EmergencyNumberInfo imsEmergencyNumberInfo;
            public int emergencyNumberDatabaseVersion;
            public static com.android.internal.telephony.nano.TelephonyProto.TelephonyCallSession.Event[] emptyArray() { return null; }
            public Event() { super(); }
            public com.android.internal.telephony.nano.TelephonyProto.TelephonyCallSession.Event clear() { return null; }
            public void writeTo(com.android.internal.telephony.protobuf.nano.CodedOutputByteBufferNano p0) throws java.io.IOException {}
            protected int computeSerializedSize() { return 0; }
            public com.android.internal.telephony.nano.TelephonyProto.TelephonyCallSession.Event mergeFrom(com.android.internal.telephony.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
            public static com.android.internal.telephony.nano.TelephonyProto.TelephonyCallSession.Event parseFrom(byte[] p0) throws com.android.internal.telephony.protobuf.nano.InvalidProtocolBufferNanoException { return null; }
            public static com.android.internal.telephony.nano.TelephonyProto.TelephonyCallSession.Event parseFrom(com.android.internal.telephony.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }

            public static interface AudioCodec {
                public static final int AUDIO_CODEC_UNKNOWN = 0;
                public static final int AUDIO_CODEC_AMR = 1;
                public static final int AUDIO_CODEC_AMR_WB = 2;
                public static final int AUDIO_CODEC_QCELP13K = 3;
                public static final int AUDIO_CODEC_EVRC = 4;
                public static final int AUDIO_CODEC_EVRC_B = 5;
                public static final int AUDIO_CODEC_EVRC_WB = 6;
                public static final int AUDIO_CODEC_EVRC_NW = 7;
                public static final int AUDIO_CODEC_GSM_EFR = 8;
                public static final int AUDIO_CODEC_GSM_FR = 9;
                public static final int AUDIO_CODEC_GSM_HR = 10;
                public static final int AUDIO_CODEC_G711U = 11;
                public static final int AUDIO_CODEC_G723 = 12;
                public static final int AUDIO_CODEC_G711A = 13;
                public static final int AUDIO_CODEC_G722 = 14;
                public static final int AUDIO_CODEC_G711AB = 15;
                public static final int AUDIO_CODEC_G729 = 16;
                public static final int AUDIO_CODEC_EVS_NB = 17;
                public static final int AUDIO_CODEC_EVS_WB = 18;
                public static final int AUDIO_CODEC_EVS_SWB = 19;
                public static final int AUDIO_CODEC_EVS_FB = 20;
            }

            public static final class CallQuality extends com.android.internal.telephony.protobuf.nano.ExtendableMessageNano<com.android.internal.telephony.nano.TelephonyProto.TelephonyCallSession.Event.CallQuality> {
                public int downlinkLevel;
                public int uplinkLevel;
                public int durationInSeconds;
                public int rtpPacketsTransmitted;
                public int rtpPacketsReceived;
                public int rtpPacketsTransmittedLost;
                public int rtpPacketsNotReceived;
                public int averageRelativeJitterMillis;
                public int maxRelativeJitterMillis;
                public int averageRoundTripTime;
                public int codecType;
                public boolean rtpInactivityDetected;
                public boolean rxSilenceDetected;
                public boolean txSilenceDetected;
                public int voiceFrames;
                public int noDataFrames;
                public int rtpDroppedPackets;
                public long minPlayoutDelayMillis;
                public long maxPlayoutDelayMillis;
                public int rxRtpSidPackets;
                public int rtpDuplicatePackets;
                public static com.android.internal.telephony.nano.TelephonyProto.TelephonyCallSession.Event.CallQuality[] emptyArray() { return null; }
                public CallQuality() { super(); }
                public com.android.internal.telephony.nano.TelephonyProto.TelephonyCallSession.Event.CallQuality clear() { return null; }
                public void writeTo(com.android.internal.telephony.protobuf.nano.CodedOutputByteBufferNano p0) throws java.io.IOException {}
                protected int computeSerializedSize() { return 0; }
                public com.android.internal.telephony.nano.TelephonyProto.TelephonyCallSession.Event.CallQuality mergeFrom(com.android.internal.telephony.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
                public static com.android.internal.telephony.nano.TelephonyProto.TelephonyCallSession.Event.CallQuality parseFrom(byte[] p0) throws com.android.internal.telephony.protobuf.nano.InvalidProtocolBufferNanoException { return null; }
                public static com.android.internal.telephony.nano.TelephonyProto.TelephonyCallSession.Event.CallQuality parseFrom(com.android.internal.telephony.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }

                public static interface CallQualityLevel {
                    public static final int UNDEFINED = 0;
                    public static final int EXCELLENT = 1;
                    public static final int GOOD = 2;
                    public static final int FAIR = 3;
                    public static final int POOR = 4;
                    public static final int BAD = 5;
                    public static final int NOT_AVAILABLE = 6;
                }
            }

            public static final class CallQualitySummary extends com.android.internal.telephony.protobuf.nano.ExtendableMessageNano<com.android.internal.telephony.nano.TelephonyProto.TelephonyCallSession.Event.CallQualitySummary> {
                public int totalGoodQualityDurationInSeconds;
                public int totalBadQualityDurationInSeconds;
                public int totalDurationWithQualityInformationInSeconds;
                public com.android.internal.telephony.nano.TelephonyProto.TelephonyCallSession.Event.CallQuality snapshotOfWorstSsWithGoodQuality;
                public com.android.internal.telephony.nano.TelephonyProto.TelephonyCallSession.Event.CallQuality snapshotOfBestSsWithGoodQuality;
                public com.android.internal.telephony.nano.TelephonyProto.TelephonyCallSession.Event.CallQuality snapshotOfWorstSsWithBadQuality;
                public com.android.internal.telephony.nano.TelephonyProto.TelephonyCallSession.Event.CallQuality snapshotOfBestSsWithBadQuality;
                public com.android.internal.telephony.nano.TelephonyProto.TelephonyCallSession.Event.SignalStrength worstSsWithGoodQuality;
                public com.android.internal.telephony.nano.TelephonyProto.TelephonyCallSession.Event.SignalStrength bestSsWithGoodQuality;
                public com.android.internal.telephony.nano.TelephonyProto.TelephonyCallSession.Event.SignalStrength worstSsWithBadQuality;
                public com.android.internal.telephony.nano.TelephonyProto.TelephonyCallSession.Event.SignalStrength bestSsWithBadQuality;
                public com.android.internal.telephony.nano.TelephonyProto.TelephonyCallSession.Event.CallQuality snapshotOfEnd;
                public static com.android.internal.telephony.nano.TelephonyProto.TelephonyCallSession.Event.CallQualitySummary[] emptyArray() { return null; }
                public CallQualitySummary() { super(); }
                public com.android.internal.telephony.nano.TelephonyProto.TelephonyCallSession.Event.CallQualitySummary clear() { return null; }
                public void writeTo(com.android.internal.telephony.protobuf.nano.CodedOutputByteBufferNano p0) throws java.io.IOException {}
                protected int computeSerializedSize() { return 0; }
                public com.android.internal.telephony.nano.TelephonyProto.TelephonyCallSession.Event.CallQualitySummary mergeFrom(com.android.internal.telephony.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
                public static com.android.internal.telephony.nano.TelephonyProto.TelephonyCallSession.Event.CallQualitySummary parseFrom(byte[] p0) throws com.android.internal.telephony.protobuf.nano.InvalidProtocolBufferNanoException { return null; }
                public static com.android.internal.telephony.nano.TelephonyProto.TelephonyCallSession.Event.CallQualitySummary parseFrom(com.android.internal.telephony.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
            }

            public static interface CallState {
                public static final int CALL_UNKNOWN = 0;
                public static final int CALL_IDLE = 1;
                public static final int CALL_ACTIVE = 2;
                public static final int CALL_HOLDING = 3;
                public static final int CALL_DIALING = 4;
                public static final int CALL_ALERTING = 5;
                public static final int CALL_INCOMING = 6;
                public static final int CALL_WAITING = 7;
                public static final int CALL_DISCONNECTED = 8;
                public static final int CALL_DISCONNECTING = 9;
            }

            public static interface ImsCommand {
                public static final int IMS_CMD_UNKNOWN = 0;
                public static final int IMS_CMD_START = 1;
                public static final int IMS_CMD_ACCEPT = 2;
                public static final int IMS_CMD_REJECT = 3;
                public static final int IMS_CMD_TERMINATE = 4;
                public static final int IMS_CMD_HOLD = 5;
                public static final int IMS_CMD_RESUME = 6;
                public static final int IMS_CMD_MERGE = 7;
                public static final int IMS_CMD_UPDATE = 8;
                public static final int IMS_CMD_CONFERENCE_EXTEND = 9;
                public static final int IMS_CMD_INVITE_PARTICIPANT = 10;
                public static final int IMS_CMD_REMOVE_PARTICIPANT = 11;
            }

            public static interface PhoneState {
                public static final int STATE_UNKNOWN = 0;
                public static final int STATE_IDLE = 1;
                public static final int STATE_RINGING = 2;
                public static final int STATE_OFFHOOK = 3;
            }

            public static final class RilCall extends com.android.internal.telephony.protobuf.nano.ExtendableMessageNano<com.android.internal.telephony.nano.TelephonyProto.TelephonyCallSession.Event.RilCall> {
                public int index;
                public int state;
                public int type;
                public int callEndReason;
                public boolean isMultiparty;
                public int preciseDisconnectCause;
                public boolean isEmergencyCall;
                public com.android.internal.telephony.nano.TelephonyProto.EmergencyNumberInfo emergencyNumberInfo;
                public int emergencyNumberDatabaseVersion;
                public static com.android.internal.telephony.nano.TelephonyProto.TelephonyCallSession.Event.RilCall[] emptyArray() { return null; }
                public RilCall() { super(); }
                public com.android.internal.telephony.nano.TelephonyProto.TelephonyCallSession.Event.RilCall clear() { return null; }
                public void writeTo(com.android.internal.telephony.protobuf.nano.CodedOutputByteBufferNano p0) throws java.io.IOException {}
                protected int computeSerializedSize() { return 0; }
                public com.android.internal.telephony.nano.TelephonyProto.TelephonyCallSession.Event.RilCall mergeFrom(com.android.internal.telephony.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
                public static com.android.internal.telephony.nano.TelephonyProto.TelephonyCallSession.Event.RilCall parseFrom(byte[] p0) throws com.android.internal.telephony.protobuf.nano.InvalidProtocolBufferNanoException { return null; }
                public static com.android.internal.telephony.nano.TelephonyProto.TelephonyCallSession.Event.RilCall parseFrom(com.android.internal.telephony.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }

                public static interface Type {
                    public static final int UNKNOWN = 0;
                    public static final int MO = 1;
                    public static final int MT = 2;
                }
            }

            public static interface RilRequest {
                public static final int RIL_REQUEST_UNKNOWN = 0;
                public static final int RIL_REQUEST_DIAL = 1;
                public static final int RIL_REQUEST_ANSWER = 2;
                public static final int RIL_REQUEST_HANGUP = 3;
                public static final int RIL_REQUEST_SET_CALL_WAITING = 4;
                public static final int RIL_REQUEST_SWITCH_HOLDING_AND_ACTIVE = 5;
                public static final int RIL_REQUEST_CDMA_FLASH = 6;
                public static final int RIL_REQUEST_CONFERENCE = 7;
            }

            public static interface RilSrvccState {
                public static final int HANDOVER_UNKNOWN = 0;
                public static final int HANDOVER_STARTED = 1;
                public static final int HANDOVER_COMPLETED = 2;
                public static final int HANDOVER_FAILED = 3;
                public static final int HANDOVER_CANCELED = 4;
            }

            public static final class SignalStrength extends com.android.internal.telephony.protobuf.nano.ExtendableMessageNano<com.android.internal.telephony.nano.TelephonyProto.TelephonyCallSession.Event.SignalStrength> {
                public int lteSnr;
                public static com.android.internal.telephony.nano.TelephonyProto.TelephonyCallSession.Event.SignalStrength[] emptyArray() { return null; }
                public SignalStrength() { super(); }
                public com.android.internal.telephony.nano.TelephonyProto.TelephonyCallSession.Event.SignalStrength clear() { return null; }
                public void writeTo(com.android.internal.telephony.protobuf.nano.CodedOutputByteBufferNano p0) throws java.io.IOException {}
                protected int computeSerializedSize() { return 0; }
                public com.android.internal.telephony.nano.TelephonyProto.TelephonyCallSession.Event.SignalStrength mergeFrom(com.android.internal.telephony.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
                public static com.android.internal.telephony.nano.TelephonyProto.TelephonyCallSession.Event.SignalStrength parseFrom(byte[] p0) throws com.android.internal.telephony.protobuf.nano.InvalidProtocolBufferNanoException { return null; }
                public static com.android.internal.telephony.nano.TelephonyProto.TelephonyCallSession.Event.SignalStrength parseFrom(com.android.internal.telephony.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
            }

            public static interface Type {
                public static final int EVENT_UNKNOWN = 0;
                public static final int SETTINGS_CHANGED = 1;
                public static final int RIL_SERVICE_STATE_CHANGED = 2;
                public static final int IMS_CONNECTION_STATE_CHANGED = 3;
                public static final int IMS_CAPABILITIES_CHANGED = 4;
                public static final int DATA_CALL_LIST_CHANGED = 5;
                public static final int RIL_REQUEST = 6;
                public static final int RIL_RESPONSE = 7;
                public static final int RIL_CALL_RING = 8;
                public static final int RIL_CALL_SRVCC = 9;
                public static final int RIL_CALL_LIST_CHANGED = 10;
                public static final int IMS_COMMAND = 11;
                public static final int IMS_COMMAND_RECEIVED = 12;
                public static final int IMS_COMMAND_FAILED = 13;
                public static final int IMS_COMMAND_COMPLETE = 14;
                public static final int IMS_CALL_RECEIVE = 15;
                public static final int IMS_CALL_STATE_CHANGED = 16;
                public static final int IMS_CALL_TERMINATED = 17;
                public static final int IMS_CALL_HANDOVER = 18;
                public static final int IMS_CALL_HANDOVER_FAILED = 19;
                public static final int PHONE_STATE_CHANGED = 20;
                public static final int NITZ_TIME = 21;
                public static final int AUDIO_CODEC = 22;
                public static final int CALL_QUALITY_CHANGED = 23;
            }
        }
    }

    public static final class TelephonyEvent extends com.android.internal.telephony.protobuf.nano.ExtendableMessageNano<com.android.internal.telephony.nano.TelephonyProto.TelephonyEvent> {
        public long timestampMillis;
        public int phoneId;
        public int type;
        public com.android.internal.telephony.nano.TelephonyProto.TelephonySettings settings;
        public com.android.internal.telephony.nano.TelephonyProto.TelephonyServiceState serviceState;
        public com.android.internal.telephony.nano.TelephonyProto.ImsConnectionState imsConnectionState;
        public com.android.internal.telephony.nano.TelephonyProto.ImsCapabilities imsCapabilities;
        public com.android.internal.telephony.nano.TelephonyProto.RilDataCall[] dataCalls;
        public int error;
        public com.android.internal.telephony.nano.TelephonyProto.TelephonyEvent.RilSetupDataCall setupDataCall;
        public com.android.internal.telephony.nano.TelephonyProto.TelephonyEvent.RilSetupDataCallResponse setupDataCallResponse;
        public com.android.internal.telephony.nano.TelephonyProto.TelephonyEvent.RilDeactivateDataCall deactivateDataCall;
        public int dataStallAction;
        public com.android.internal.telephony.nano.TelephonyProto.TelephonyEvent.ModemRestart modemRestart;
        public long nitzTimestampMillis;
        public com.android.internal.telephony.nano.TelephonyProto.TelephonyEvent.CarrierIdMatching carrierIdMatching;
        public com.android.internal.telephony.nano.TelephonyProto.TelephonyEvent.CarrierKeyChange carrierKeyChange;
        public com.android.internal.telephony.nano.TelephonyProto.TelephonyEvent.DataSwitch dataSwitch;
        public int networkValidationState;
        public com.android.internal.telephony.nano.TelephonyProto.TelephonyEvent.OnDemandDataSwitch onDemandDataSwitch;
        public int[] simState;
        public com.android.internal.telephony.nano.TelephonyProto.ActiveSubscriptionInfo activeSubscriptionInfo;
        public int enabledModemBitmap;
        public com.android.internal.telephony.nano.TelephonyProto.EmergencyNumberInfo updatedEmergencyNumber;
        public com.android.internal.telephony.nano.TelephonyProto.TelephonyEvent.NetworkCapabilitiesInfo networkCapabilities;
        public int signalStrength;
        public int emergencyNumberDatabaseVersion;
        public int radioState;
        public static com.android.internal.telephony.nano.TelephonyProto.TelephonyEvent[] emptyArray() { return null; }
        public TelephonyEvent() { super(); }
        public com.android.internal.telephony.nano.TelephonyProto.TelephonyEvent clear() { return null; }
        public void writeTo(com.android.internal.telephony.protobuf.nano.CodedOutputByteBufferNano p0) throws java.io.IOException {}
        protected int computeSerializedSize() { return 0; }
        public com.android.internal.telephony.nano.TelephonyProto.TelephonyEvent mergeFrom(com.android.internal.telephony.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
        public static com.android.internal.telephony.nano.TelephonyProto.TelephonyEvent parseFrom(byte[] p0) throws com.android.internal.telephony.protobuf.nano.InvalidProtocolBufferNanoException { return null; }
        public static com.android.internal.telephony.nano.TelephonyProto.TelephonyEvent parseFrom(com.android.internal.telephony.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }

        public static interface ApnType {
            public static final int APN_TYPE_UNKNOWN = 0;
            public static final int APN_TYPE_DEFAULT = 1;
            public static final int APN_TYPE_MMS = 2;
            public static final int APN_TYPE_SUPL = 3;
            public static final int APN_TYPE_DUN = 4;
            public static final int APN_TYPE_HIPRI = 5;
            public static final int APN_TYPE_FOTA = 6;
            public static final int APN_TYPE_IMS = 7;
            public static final int APN_TYPE_CBS = 8;
            public static final int APN_TYPE_IA = 9;
            public static final int APN_TYPE_EMERGENCY = 10;
        }

        public static final class CarrierIdMatching extends com.android.internal.telephony.protobuf.nano.ExtendableMessageNano<com.android.internal.telephony.nano.TelephonyProto.TelephonyEvent.CarrierIdMatching> {
            public int cidTableVersion;
            public com.android.internal.telephony.nano.TelephonyProto.TelephonyEvent.CarrierIdMatchingResult result;
            public static com.android.internal.telephony.nano.TelephonyProto.TelephonyEvent.CarrierIdMatching[] emptyArray() { return null; }
            public CarrierIdMatching() { super(); }
            public com.android.internal.telephony.nano.TelephonyProto.TelephonyEvent.CarrierIdMatching clear() { return null; }
            public void writeTo(com.android.internal.telephony.protobuf.nano.CodedOutputByteBufferNano p0) throws java.io.IOException {}
            protected int computeSerializedSize() { return 0; }
            public com.android.internal.telephony.nano.TelephonyProto.TelephonyEvent.CarrierIdMatching mergeFrom(com.android.internal.telephony.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
            public static com.android.internal.telephony.nano.TelephonyProto.TelephonyEvent.CarrierIdMatching parseFrom(byte[] p0) throws com.android.internal.telephony.protobuf.nano.InvalidProtocolBufferNanoException { return null; }
            public static com.android.internal.telephony.nano.TelephonyProto.TelephonyEvent.CarrierIdMatching parseFrom(com.android.internal.telephony.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
        }

        public static final class CarrierIdMatchingResult extends com.android.internal.telephony.protobuf.nano.ExtendableMessageNano<com.android.internal.telephony.nano.TelephonyProto.TelephonyEvent.CarrierIdMatchingResult> {
            public int carrierId;
            public java.lang.String unknownGid1;
            public java.lang.String unknownMccmnc;
            public java.lang.String mccmnc;
            public java.lang.String gid1;
            public java.lang.String gid2;
            public java.lang.String spn;
            public java.lang.String pnn;
            public java.lang.String iccidPrefix;
            public java.lang.String imsiPrefix;
            public java.lang.String[] privilegeAccessRule;
            public java.lang.String preferApn;
            public static com.android.internal.telephony.nano.TelephonyProto.TelephonyEvent.CarrierIdMatchingResult[] emptyArray() { return null; }
            public CarrierIdMatchingResult() { super(); }
            public com.android.internal.telephony.nano.TelephonyProto.TelephonyEvent.CarrierIdMatchingResult clear() { return null; }
            public void writeTo(com.android.internal.telephony.protobuf.nano.CodedOutputByteBufferNano p0) throws java.io.IOException {}
            protected int computeSerializedSize() { return 0; }
            public com.android.internal.telephony.nano.TelephonyProto.TelephonyEvent.CarrierIdMatchingResult mergeFrom(com.android.internal.telephony.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
            public static com.android.internal.telephony.nano.TelephonyProto.TelephonyEvent.CarrierIdMatchingResult parseFrom(byte[] p0) throws com.android.internal.telephony.protobuf.nano.InvalidProtocolBufferNanoException { return null; }
            public static com.android.internal.telephony.nano.TelephonyProto.TelephonyEvent.CarrierIdMatchingResult parseFrom(com.android.internal.telephony.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
        }

        public static final class CarrierKeyChange extends com.android.internal.telephony.protobuf.nano.ExtendableMessageNano<com.android.internal.telephony.nano.TelephonyProto.TelephonyEvent.CarrierKeyChange> {
            public int keyType;
            public boolean isDownloadSuccessful;
            public static com.android.internal.telephony.nano.TelephonyProto.TelephonyEvent.CarrierKeyChange[] emptyArray() { return null; }
            public CarrierKeyChange() { super(); }
            public com.android.internal.telephony.nano.TelephonyProto.TelephonyEvent.CarrierKeyChange clear() { return null; }
            public void writeTo(com.android.internal.telephony.protobuf.nano.CodedOutputByteBufferNano p0) throws java.io.IOException {}
            protected int computeSerializedSize() { return 0; }
            public com.android.internal.telephony.nano.TelephonyProto.TelephonyEvent.CarrierKeyChange mergeFrom(com.android.internal.telephony.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
            public static com.android.internal.telephony.nano.TelephonyProto.TelephonyEvent.CarrierKeyChange parseFrom(byte[] p0) throws com.android.internal.telephony.protobuf.nano.InvalidProtocolBufferNanoException { return null; }
            public static com.android.internal.telephony.nano.TelephonyProto.TelephonyEvent.CarrierKeyChange parseFrom(com.android.internal.telephony.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }

            public static interface KeyType {
                public static final int UNKNOWN = 0;
                public static final int WLAN = 1;
                public static final int EPDG = 2;
            }
        }

        public static final class DataSwitch extends com.android.internal.telephony.protobuf.nano.ExtendableMessageNano<com.android.internal.telephony.nano.TelephonyProto.TelephonyEvent.DataSwitch> {
            public int reason;
            public int state;
            public static com.android.internal.telephony.nano.TelephonyProto.TelephonyEvent.DataSwitch[] emptyArray() { return null; }
            public DataSwitch() { super(); }
            public com.android.internal.telephony.nano.TelephonyProto.TelephonyEvent.DataSwitch clear() { return null; }
            public void writeTo(com.android.internal.telephony.protobuf.nano.CodedOutputByteBufferNano p0) throws java.io.IOException {}
            protected int computeSerializedSize() { return 0; }
            public com.android.internal.telephony.nano.TelephonyProto.TelephonyEvent.DataSwitch mergeFrom(com.android.internal.telephony.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
            public static com.android.internal.telephony.nano.TelephonyProto.TelephonyEvent.DataSwitch parseFrom(byte[] p0) throws com.android.internal.telephony.protobuf.nano.InvalidProtocolBufferNanoException { return null; }
            public static com.android.internal.telephony.nano.TelephonyProto.TelephonyEvent.DataSwitch parseFrom(com.android.internal.telephony.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }

            public static interface Reason {
                public static final int DATA_SWITCH_REASON_UNKNOWN = 0;
                public static final int DATA_SWITCH_REASON_MANUAL = 1;
                public static final int DATA_SWITCH_REASON_IN_CALL = 2;
                public static final int DATA_SWITCH_REASON_CBRS = 3;
                public static final int DATA_SWITCH_REASON_AUTO = 4;
            }
        }

        public static interface EventState {
            public static final int EVENT_STATE_UNKNOWN = 0;
            public static final int EVENT_STATE_START = 1;
            public static final int EVENT_STATE_END = 2;
        }

        public static final class ModemRestart extends com.android.internal.telephony.protobuf.nano.ExtendableMessageNano<com.android.internal.telephony.nano.TelephonyProto.TelephonyEvent.ModemRestart> {
            public java.lang.String basebandVersion;
            public java.lang.String reason;
            public static com.android.internal.telephony.nano.TelephonyProto.TelephonyEvent.ModemRestart[] emptyArray() { return null; }
            public ModemRestart() { super(); }
            public com.android.internal.telephony.nano.TelephonyProto.TelephonyEvent.ModemRestart clear() { return null; }
            public void writeTo(com.android.internal.telephony.protobuf.nano.CodedOutputByteBufferNano p0) throws java.io.IOException {}
            protected int computeSerializedSize() { return 0; }
            public com.android.internal.telephony.nano.TelephonyProto.TelephonyEvent.ModemRestart mergeFrom(com.android.internal.telephony.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
            public static com.android.internal.telephony.nano.TelephonyProto.TelephonyEvent.ModemRestart parseFrom(byte[] p0) throws com.android.internal.telephony.protobuf.nano.InvalidProtocolBufferNanoException { return null; }
            public static com.android.internal.telephony.nano.TelephonyProto.TelephonyEvent.ModemRestart parseFrom(com.android.internal.telephony.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
        }

        public static final class NetworkCapabilitiesInfo extends com.android.internal.telephony.protobuf.nano.ExtendableMessageNano<com.android.internal.telephony.nano.TelephonyProto.TelephonyEvent.NetworkCapabilitiesInfo> {
            public boolean isNetworkUnmetered;
            public static com.android.internal.telephony.nano.TelephonyProto.TelephonyEvent.NetworkCapabilitiesInfo[] emptyArray() { return null; }
            public NetworkCapabilitiesInfo() { super(); }
            public com.android.internal.telephony.nano.TelephonyProto.TelephonyEvent.NetworkCapabilitiesInfo clear() { return null; }
            public void writeTo(com.android.internal.telephony.protobuf.nano.CodedOutputByteBufferNano p0) throws java.io.IOException {}
            protected int computeSerializedSize() { return 0; }
            public com.android.internal.telephony.nano.TelephonyProto.TelephonyEvent.NetworkCapabilitiesInfo mergeFrom(com.android.internal.telephony.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
            public static com.android.internal.telephony.nano.TelephonyProto.TelephonyEvent.NetworkCapabilitiesInfo parseFrom(byte[] p0) throws com.android.internal.telephony.protobuf.nano.InvalidProtocolBufferNanoException { return null; }
            public static com.android.internal.telephony.nano.TelephonyProto.TelephonyEvent.NetworkCapabilitiesInfo parseFrom(com.android.internal.telephony.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
        }

        public static interface NetworkValidationState {
            public static final int NETWORK_VALIDATION_STATE_UNKNOWN = 0;
            public static final int NETWORK_VALIDATION_STATE_AVAILABLE = 1;
            public static final int NETWORK_VALIDATION_STATE_FAILED = 2;
            public static final int NETWORK_VALIDATION_STATE_PASSED = 3;
        }

        public static final class OnDemandDataSwitch extends com.android.internal.telephony.protobuf.nano.ExtendableMessageNano<com.android.internal.telephony.nano.TelephonyProto.TelephonyEvent.OnDemandDataSwitch> {
            public int apn;
            public int state;
            public static com.android.internal.telephony.nano.TelephonyProto.TelephonyEvent.OnDemandDataSwitch[] emptyArray() { return null; }
            public OnDemandDataSwitch() { super(); }
            public com.android.internal.telephony.nano.TelephonyProto.TelephonyEvent.OnDemandDataSwitch clear() { return null; }
            public void writeTo(com.android.internal.telephony.protobuf.nano.CodedOutputByteBufferNano p0) throws java.io.IOException {}
            protected int computeSerializedSize() { return 0; }
            public com.android.internal.telephony.nano.TelephonyProto.TelephonyEvent.OnDemandDataSwitch mergeFrom(com.android.internal.telephony.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
            public static com.android.internal.telephony.nano.TelephonyProto.TelephonyEvent.OnDemandDataSwitch parseFrom(byte[] p0) throws com.android.internal.telephony.protobuf.nano.InvalidProtocolBufferNanoException { return null; }
            public static com.android.internal.telephony.nano.TelephonyProto.TelephonyEvent.OnDemandDataSwitch parseFrom(com.android.internal.telephony.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
        }

        public static interface RadioState {
            public static final int RADIO_STATE_UNKNOWN = 0;
            public static final int RADIO_STATE_OFF = 1;
            public static final int RADIO_STATE_ON = 2;
            public static final int RADIO_STATE_UNAVAILABLE = 3;
        }

        public static final class RilDeactivateDataCall extends com.android.internal.telephony.protobuf.nano.ExtendableMessageNano<com.android.internal.telephony.nano.TelephonyProto.TelephonyEvent.RilDeactivateDataCall> {
            public int cid;
            public int reason;
            public static com.android.internal.telephony.nano.TelephonyProto.TelephonyEvent.RilDeactivateDataCall[] emptyArray() { return null; }
            public RilDeactivateDataCall() { super(); }
            public com.android.internal.telephony.nano.TelephonyProto.TelephonyEvent.RilDeactivateDataCall clear() { return null; }
            public void writeTo(com.android.internal.telephony.protobuf.nano.CodedOutputByteBufferNano p0) throws java.io.IOException {}
            protected int computeSerializedSize() { return 0; }
            public com.android.internal.telephony.nano.TelephonyProto.TelephonyEvent.RilDeactivateDataCall mergeFrom(com.android.internal.telephony.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
            public static com.android.internal.telephony.nano.TelephonyProto.TelephonyEvent.RilDeactivateDataCall parseFrom(byte[] p0) throws com.android.internal.telephony.protobuf.nano.InvalidProtocolBufferNanoException { return null; }
            public static com.android.internal.telephony.nano.TelephonyProto.TelephonyEvent.RilDeactivateDataCall parseFrom(com.android.internal.telephony.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }

            public static interface DeactivateReason {
                public static final int DEACTIVATE_REASON_UNKNOWN = 0;
                public static final int DEACTIVATE_REASON_NONE = 1;
                public static final int DEACTIVATE_REASON_RADIO_OFF = 2;
                public static final int DEACTIVATE_REASON_PDP_RESET = 3;
                public static final int DEACTIVATE_REASON_HANDOVER = 4;
            }
        }

        public static final class RilSetupDataCall extends com.android.internal.telephony.protobuf.nano.ExtendableMessageNano<com.android.internal.telephony.nano.TelephonyProto.TelephonyEvent.RilSetupDataCall> {
            public int rat;
            public int dataProfile;
            public java.lang.String apn;
            public int type;
            public static com.android.internal.telephony.nano.TelephonyProto.TelephonyEvent.RilSetupDataCall[] emptyArray() { return null; }
            public RilSetupDataCall() { super(); }
            public com.android.internal.telephony.nano.TelephonyProto.TelephonyEvent.RilSetupDataCall clear() { return null; }
            public void writeTo(com.android.internal.telephony.protobuf.nano.CodedOutputByteBufferNano p0) throws java.io.IOException {}
            protected int computeSerializedSize() { return 0; }
            public com.android.internal.telephony.nano.TelephonyProto.TelephonyEvent.RilSetupDataCall mergeFrom(com.android.internal.telephony.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
            public static com.android.internal.telephony.nano.TelephonyProto.TelephonyEvent.RilSetupDataCall parseFrom(byte[] p0) throws com.android.internal.telephony.protobuf.nano.InvalidProtocolBufferNanoException { return null; }
            public static com.android.internal.telephony.nano.TelephonyProto.TelephonyEvent.RilSetupDataCall parseFrom(com.android.internal.telephony.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }

            public static interface RilDataProfile {
                public static final int RIL_DATA_UNKNOWN = 0;
                public static final int RIL_DATA_PROFILE_DEFAULT = 1;
                public static final int RIL_DATA_PROFILE_TETHERED = 2;
                public static final int RIL_DATA_PROFILE_IMS = 3;
                public static final int RIL_DATA_PROFILE_FOTA = 4;
                public static final int RIL_DATA_PROFILE_CBS = 5;
                public static final int RIL_DATA_PROFILE_OEM_BASE = 6;
                public static final int RIL_DATA_PROFILE_INVALID = 7;
            }
        }

        public static final class RilSetupDataCallResponse extends com.android.internal.telephony.protobuf.nano.ExtendableMessageNano<com.android.internal.telephony.nano.TelephonyProto.TelephonyEvent.RilSetupDataCallResponse> {
            public int status;
            public int suggestedRetryTimeMillis;
            public com.android.internal.telephony.nano.TelephonyProto.RilDataCall call;
            public static com.android.internal.telephony.nano.TelephonyProto.TelephonyEvent.RilSetupDataCallResponse[] emptyArray() { return null; }
            public RilSetupDataCallResponse() { super(); }
            public com.android.internal.telephony.nano.TelephonyProto.TelephonyEvent.RilSetupDataCallResponse clear() { return null; }
            public void writeTo(com.android.internal.telephony.protobuf.nano.CodedOutputByteBufferNano p0) throws java.io.IOException {}
            protected int computeSerializedSize() { return 0; }
            public com.android.internal.telephony.nano.TelephonyProto.TelephonyEvent.RilSetupDataCallResponse mergeFrom(com.android.internal.telephony.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
            public static com.android.internal.telephony.nano.TelephonyProto.TelephonyEvent.RilSetupDataCallResponse parseFrom(byte[] p0) throws com.android.internal.telephony.protobuf.nano.InvalidProtocolBufferNanoException { return null; }
            public static com.android.internal.telephony.nano.TelephonyProto.TelephonyEvent.RilSetupDataCallResponse parseFrom(com.android.internal.telephony.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }

            public static interface RilDataCallFailCause {
                public static final int PDP_FAIL_UNKNOWN = 0;
                public static final int PDP_FAIL_NONE = 1;
                public static final int PDP_FAIL_OPERATOR_BARRED = 8;
                public static final int PDP_FAIL_NAS_SIGNALLING = 14;
                public static final int PDP_FAIL_LLC_SNDCP = 25;
                public static final int PDP_FAIL_INSUFFICIENT_RESOURCES = 26;
                public static final int PDP_FAIL_MISSING_UKNOWN_APN = 27;
                public static final int PDP_FAIL_UNKNOWN_PDP_ADDRESS_TYPE = 28;
                public static final int PDP_FAIL_USER_AUTHENTICATION = 29;
                public static final int PDP_FAIL_ACTIVATION_REJECT_GGSN = 30;
                public static final int PDP_FAIL_ACTIVATION_REJECT_UNSPECIFIED = 31;
                public static final int PDP_FAIL_SERVICE_OPTION_NOT_SUPPORTED = 32;
                public static final int PDP_FAIL_SERVICE_OPTION_NOT_SUBSCRIBED = 33;
                public static final int PDP_FAIL_SERVICE_OPTION_OUT_OF_ORDER = 34;
                public static final int PDP_FAIL_NSAPI_IN_USE = 35;
                public static final int PDP_FAIL_REGULAR_DEACTIVATION = 36;
                public static final int PDP_FAIL_QOS_NOT_ACCEPTED = 37;
                public static final int PDP_FAIL_NETWORK_FAILURE = 38;
                public static final int PDP_FAIL_UMTS_REACTIVATION_REQ = 39;
                public static final int PDP_FAIL_FEATURE_NOT_SUPP = 40;
                public static final int PDP_FAIL_TFT_SEMANTIC_ERROR = 41;
                public static final int PDP_FAIL_TFT_SYTAX_ERROR = 42;
                public static final int PDP_FAIL_UNKNOWN_PDP_CONTEXT = 43;
                public static final int PDP_FAIL_FILTER_SEMANTIC_ERROR = 44;
                public static final int PDP_FAIL_FILTER_SYTAX_ERROR = 45;
                public static final int PDP_FAIL_PDP_WITHOUT_ACTIVE_TFT = 46;
                public static final int PDP_FAIL_ACTIVATION_REJECTED_BCM_VIOLATION = 48;
                public static final int PDP_FAIL_ONLY_IPV4_ALLOWED = 50;
                public static final int PDP_FAIL_ONLY_IPV6_ALLOWED = 51;
                public static final int PDP_FAIL_ONLY_SINGLE_BEARER_ALLOWED = 52;
                public static final int PDP_FAIL_ESM_INFO_NOT_RECEIVED = 53;
                public static final int PDP_FAIL_PDN_CONN_DOES_NOT_EXIST = 54;
                public static final int PDP_FAIL_MULTI_CONN_TO_SAME_PDN_NOT_ALLOWED = 55;
                public static final int PDP_FAIL_COLLISION_WITH_NETWORK_INITIATED_REQUEST = 56;
                public static final int PDP_FAIL_ONLY_IPV4V6_ALLOWED = 57;
                public static final int PDP_FAIL_ONLY_NON_IP_ALLOWED = 58;
                public static final int PDP_FAIL_UNSUPPORTED_QCI_VALUE = 59;
                public static final int PDP_FAIL_BEARER_HANDLING_NOT_SUPPORTED = 60;
                public static final int PDP_FAIL_MAX_ACTIVE_PDP_CONTEXT_REACHED = 65;
                public static final int PDP_FAIL_UNSUPPORTED_APN_IN_CURRENT_PLMN = 66;
                public static final int PDP_FAIL_INVALID_TRANSACTION_ID = 81;
                public static final int PDP_FAIL_MESSAGE_INCORRECT_SEMANTIC = 95;
                public static final int PDP_FAIL_INVALID_MANDATORY_INFO = 96;
                public static final int PDP_FAIL_MESSAGE_TYPE_UNSUPPORTED = 97;
                public static final int PDP_FAIL_MSG_TYPE_NONCOMPATIBLE_STATE = 98;
                public static final int PDP_FAIL_UNKNOWN_INFO_ELEMENT = 99;
                public static final int PDP_FAIL_CONDITIONAL_IE_ERROR = 100;
                public static final int PDP_FAIL_MSG_AND_PROTOCOL_STATE_UNCOMPATIBLE = 101;
                public static final int PDP_FAIL_PROTOCOL_ERRORS = 111;
                public static final int PDP_FAIL_APN_TYPE_CONFLICT = 112;
                public static final int PDP_FAIL_INVALID_PCSCF_ADDR = 113;
                public static final int PDP_FAIL_INTERNAL_CALL_PREEMPT_BY_HIGH_PRIO_APN = 114;
                public static final int PDP_FAIL_EMM_ACCESS_BARRED = 115;
                public static final int PDP_FAIL_EMERGENCY_IFACE_ONLY = 116;
                public static final int PDP_FAIL_IFACE_MISMATCH = 117;
                public static final int PDP_FAIL_COMPANION_IFACE_IN_USE = 118;
                public static final int PDP_FAIL_IP_ADDRESS_MISMATCH = 119;
                public static final int PDP_FAIL_IFACE_AND_POL_FAMILY_MISMATCH = 120;
                public static final int PDP_FAIL_EMM_ACCESS_BARRED_INFINITE_RETRY = 121;
                public static final int PDP_FAIL_AUTH_FAILURE_ON_EMERGENCY_CALL = 122;
                public static final int PDP_FAIL_INVALID_DNS_ADDR = 123;
                public static final int PDP_FAIL_INVALID_PCSCF_OR_DNS_ADDRESS = 124;
                public static final int PDP_FAIL_CALL_PREEMPT_BY_EMERGENCY_APN = 127;
                public static final int PDP_FAIL_UE_INITIATED_DETACH_OR_DISCONNECT = 128;
                public static final int PDP_FAIL_MIP_FA_REASON_UNSPECIFIED = 2000;
                public static final int PDP_FAIL_MIP_FA_ADMIN_PROHIBITED = 2001;
                public static final int PDP_FAIL_MIP_FA_INSUFFICIENT_RESOURCES = 2002;
                public static final int PDP_FAIL_MIP_FA_MOBILE_NODE_AUTHENTICATION_FAILURE = 2003;
                public static final int PDP_FAIL_MIP_FA_HOME_AGENT_AUTHENTICATION_FAILURE = 2004;
                public static final int PDP_FAIL_MIP_FA_REQUESTED_LIFETIME_TOO_LONG = 2005;
                public static final int PDP_FAIL_MIP_FA_MALFORMED_REQUEST = 2006;
                public static final int PDP_FAIL_MIP_FA_MALFORMED_REPLY = 2007;
                public static final int PDP_FAIL_MIP_FA_ENCAPSULATION_UNAVAILABLE = 2008;
                public static final int PDP_FAIL_MIP_FA_VJ_HEADER_COMPRESSION_UNAVAILABLE = 2009;
                public static final int PDP_FAIL_MIP_FA_REVERSE_TUNNEL_UNAVAILABLE = 2010;
                public static final int PDP_FAIL_MIP_FA_REVERSE_TUNNEL_IS_MANDATORY = 2011;
                public static final int PDP_FAIL_MIP_FA_DELIVERY_STYLE_NOT_SUPPORTED = 2012;
                public static final int PDP_FAIL_MIP_FA_MISSING_NAI = 2013;
                public static final int PDP_FAIL_MIP_FA_MISSING_HOME_AGENT = 2014;
                public static final int PDP_FAIL_MIP_FA_MISSING_HOME_ADDRESS = 2015;
                public static final int PDP_FAIL_MIP_FA_UNKNOWN_CHALLENGE = 2016;
                public static final int PDP_FAIL_MIP_FA_MISSING_CHALLENGE = 2017;
                public static final int PDP_FAIL_MIP_FA_STALE_CHALLENGE = 2018;
                public static final int PDP_FAIL_MIP_HA_REASON_UNSPECIFIED = 2019;
                public static final int PDP_FAIL_MIP_HA_ADMIN_PROHIBITED = 2020;
                public static final int PDP_FAIL_MIP_HA_INSUFFICIENT_RESOURCES = 2021;
                public static final int PDP_FAIL_MIP_HA_MOBILE_NODE_AUTHENTICATION_FAILURE = 2022;
                public static final int PDP_FAIL_MIP_HA_FOREIGN_AGENT_AUTHENTICATION_FAILURE = 2023;
                public static final int PDP_FAIL_MIP_HA_REGISTRATION_ID_MISMATCH = 2024;
                public static final int PDP_FAIL_MIP_HA_MALFORMED_REQUEST = 2025;
                public static final int PDP_FAIL_MIP_HA_UNKNOWN_HOME_AGENT_ADDRESS = 2026;
                public static final int PDP_FAIL_MIP_HA_REVERSE_TUNNEL_UNAVAILABLE = 2027;
                public static final int PDP_FAIL_MIP_HA_REVERSE_TUNNEL_IS_MANDATORY = 2028;
                public static final int PDP_FAIL_MIP_HA_ENCAPSULATION_UNAVAILABLE = 2029;
                public static final int PDP_FAIL_CLOSE_IN_PROGRESS = 2030;
                public static final int PDP_FAIL_NETWORK_INITIATED_TERMINATION = 2031;
                public static final int PDP_FAIL_MODEM_APP_PREEMPTED = 2032;
                public static final int PDP_FAIL_PDN_IPV4_CALL_DISALLOWED = 2033;
                public static final int PDP_FAIL_PDN_IPV4_CALL_THROTTLED = 2034;
                public static final int PDP_FAIL_PDN_IPV6_CALL_DISALLOWED = 2035;
                public static final int PDP_FAIL_PDN_IPV6_CALL_THROTTLED = 2036;
                public static final int PDP_FAIL_MODEM_RESTART = 2037;
                public static final int PDP_FAIL_PDP_PPP_NOT_SUPPORTED = 2038;
                public static final int PDP_FAIL_UNPREFERRED_RAT = 2039;
                public static final int PDP_FAIL_PHYSICAL_LINK_CLOSE_IN_PROGRESS = 2040;
                public static final int PDP_FAIL_APN_PENDING_HANDOVER = 2041;
                public static final int PDP_FAIL_PROFILE_BEARER_INCOMPATIBLE = 2042;
                public static final int PDP_FAIL_SIM_CARD_CHANGED = 2043;
                public static final int PDP_FAIL_LOW_POWER_MODE_OR_POWERING_DOWN = 2044;
                public static final int PDP_FAIL_APN_DISABLED = 2045;
                public static final int PDP_FAIL_MAX_PPP_INACTIVITY_TIMER_EXPIRED = 2046;
                public static final int PDP_FAIL_IPV6_ADDRESS_TRANSFER_FAILED = 2047;
                public static final int PDP_FAIL_TRAT_SWAP_FAILED = 2048;
                public static final int PDP_FAIL_EHRPD_TO_HRPD_FALLBACK = 2049;
                public static final int PDP_FAIL_MIP_CONFIG_FAILURE = 2050;
                public static final int PDP_FAIL_PDN_INACTIVITY_TIMER_EXPIRED = 2051;
                public static final int PDP_FAIL_MAX_IPV4_CONNECTIONS = 2052;
                public static final int PDP_FAIL_MAX_IPV6_CONNECTIONS = 2053;
                public static final int PDP_FAIL_APN_MISMATCH = 2054;
                public static final int PDP_FAIL_IP_VERSION_MISMATCH = 2055;
                public static final int PDP_FAIL_DUN_CALL_DISALLOWED = 2056;
                public static final int PDP_FAIL_INTERNAL_EPC_NONEPC_TRANSITION = 2057;
                public static final int PDP_FAIL_INTERFACE_IN_USE = 2058;
                public static final int PDP_FAIL_APN_DISALLOWED_ON_ROAMING = 2059;
                public static final int PDP_FAIL_APN_PARAMETERS_CHANGED = 2060;
                public static final int PDP_FAIL_NULL_APN_DISALLOWED = 2061;
                public static final int PDP_FAIL_THERMAL_MITIGATION = 2062;
                public static final int PDP_FAIL_DATA_SETTINGS_DISABLED = 2063;
                public static final int PDP_FAIL_DATA_ROAMING_SETTINGS_DISABLED = 2064;
                public static final int PDP_FAIL_DDS_SWITCHED = 2065;
                public static final int PDP_FAIL_FORBIDDEN_APN_NAME = 2066;
                public static final int PDP_FAIL_DDS_SWITCH_IN_PROGRESS = 2067;
                public static final int PDP_FAIL_CALL_DISALLOWED_IN_ROAMING = 2068;
                public static final int PDP_FAIL_NON_IP_NOT_SUPPORTED = 2069;
                public static final int PDP_FAIL_PDN_NON_IP_CALL_THROTTLED = 2070;
                public static final int PDP_FAIL_PDN_NON_IP_CALL_DISALLOWED = 2071;
                public static final int PDP_FAIL_CDMA_LOCK = 2072;
                public static final int PDP_FAIL_CDMA_INTERCEPT = 2073;
                public static final int PDP_FAIL_CDMA_REORDER = 2074;
                public static final int PDP_FAIL_CDMA_RELEASE_DUE_TO_SO_REJECTION = 2075;
                public static final int PDP_FAIL_CDMA_INCOMING_CALL = 2076;
                public static final int PDP_FAIL_CDMA_ALERT_STOP = 2077;
                public static final int PDP_FAIL_CHANNEL_ACQUISITION_FAILURE = 2078;
                public static final int PDP_FAIL_MAX_ACCESS_PROBE = 2079;
                public static final int PDP_FAIL_CONCURRENT_SERVICE_NOT_SUPPORTED_BY_BASE_STATION = 2080;
                public static final int PDP_FAIL_NO_RESPONSE_FROM_BASE_STATION = 2081;
                public static final int PDP_FAIL_REJECTED_BY_BASE_STATION = 2082;
                public static final int PDP_FAIL_CONCURRENT_SERVICES_INCOMPATIBLE = 2083;
                public static final int PDP_FAIL_NO_CDMA_SERVICE = 2084;
                public static final int PDP_FAIL_RUIM_NOT_PRESENT = 2085;
                public static final int PDP_FAIL_CDMA_RETRY_ORDER = 2086;
                public static final int PDP_FAIL_ACCESS_BLOCK = 2087;
                public static final int PDP_FAIL_ACCESS_BLOCK_ALL = 2088;
                public static final int PDP_FAIL_IS707B_MAX_ACCESS_PROBES = 2089;
                public static final int PDP_FAIL_THERMAL_EMERGENCY = 2090;
                public static final int PDP_FAIL_CONCURRENT_SERVICES_NOT_ALLOWED = 2091;
                public static final int PDP_FAIL_INCOMING_CALL_REJECTED = 2092;
                public static final int PDP_FAIL_NO_SERVICE_ON_GATEWAY = 2093;
                public static final int PDP_FAIL_NO_GPRS_CONTEXT = 2094;
                public static final int PDP_FAIL_ILLEGAL_MS = 2095;
                public static final int PDP_FAIL_ILLEGAL_ME = 2096;
                public static final int PDP_FAIL_GPRS_SERVICES_AND_NON_GPRS_SERVICES_NOT_ALLOWED = 2097;
                public static final int PDP_FAIL_GPRS_SERVICES_NOT_ALLOWED = 2098;
                public static final int PDP_FAIL_MS_IDENTITY_CANNOT_BE_DERIVED_BY_THE_NETWORK = 2099;
                public static final int PDP_FAIL_IMPLICITLY_DETACHED = 2100;
                public static final int PDP_FAIL_PLMN_NOT_ALLOWED = 2101;
                public static final int PDP_FAIL_LOCATION_AREA_NOT_ALLOWED = 2102;
                public static final int PDP_FAIL_GPRS_SERVICES_NOT_ALLOWED_IN_THIS_PLMN = 2103;
                public static final int PDP_FAIL_PDP_DUPLICATE = 2104;
                public static final int PDP_FAIL_UE_RAT_CHANGE = 2105;
                public static final int PDP_FAIL_CONGESTION = 2106;
                public static final int PDP_FAIL_NO_PDP_CONTEXT_ACTIVATED = 2107;
                public static final int PDP_FAIL_ACCESS_CLASS_DSAC_REJECTION = 2108;
                public static final int PDP_FAIL_PDP_ACTIVATE_MAX_RETRY_FAILED = 2109;
                public static final int PDP_FAIL_RADIO_ACCESS_BEARER_FAILURE = 2110;
                public static final int PDP_FAIL_ESM_UNKNOWN_EPS_BEARER_CONTEXT = 2111;
                public static final int PDP_FAIL_DRB_RELEASED_BY_RRC = 2112;
                public static final int PDP_FAIL_CONNECTION_RELEASED = 2113;
                public static final int PDP_FAIL_EMM_DETACHED = 2114;
                public static final int PDP_FAIL_EMM_ATTACH_FAILED = 2115;
                public static final int PDP_FAIL_EMM_ATTACH_STARTED = 2116;
                public static final int PDP_FAIL_LTE_NAS_SERVICE_REQUEST_FAILED = 2117;
                public static final int PDP_FAIL_DUPLICATE_BEARER_ID = 2118;
                public static final int PDP_FAIL_ESM_COLLISION_SCENARIOS = 2119;
                public static final int PDP_FAIL_ESM_BEARER_DEACTIVATED_TO_SYNC_WITH_NETWORK = 2120;
                public static final int PDP_FAIL_ESM_NW_ACTIVATED_DED_BEARER_WITH_ID_OF_DEF_BEARER = 2121;
                public static final int PDP_FAIL_ESM_BAD_OTA_MESSAGE = 2122;
                public static final int PDP_FAIL_ESM_DOWNLOAD_SERVER_REJECTED_THE_CALL = 2123;
                public static final int PDP_FAIL_ESM_CONTEXT_TRANSFERRED_DUE_TO_IRAT = 2124;
                public static final int PDP_FAIL_DS_EXPLICIT_DEACTIVATION = 2125;
                public static final int PDP_FAIL_ESM_LOCAL_CAUSE_NONE = 2126;
                public static final int PDP_FAIL_LTE_THROTTLING_NOT_REQUIRED = 2127;
                public static final int PDP_FAIL_ACCESS_CONTROL_LIST_CHECK_FAILURE = 2128;
                public static final int PDP_FAIL_SERVICE_NOT_ALLOWED_ON_PLMN = 2129;
                public static final int PDP_FAIL_EMM_T3417_EXPIRED = 2130;
                public static final int PDP_FAIL_EMM_T3417_EXT_EXPIRED = 2131;
                public static final int PDP_FAIL_RRC_UPLINK_DATA_TRANSMISSION_FAILURE = 2132;
                public static final int PDP_FAIL_RRC_UPLINK_DELIVERY_FAILED_DUE_TO_HANDOVER = 2133;
                public static final int PDP_FAIL_RRC_UPLINK_CONNECTION_RELEASE = 2134;
                public static final int PDP_FAIL_RRC_UPLINK_RADIO_LINK_FAILURE = 2135;
                public static final int PDP_FAIL_RRC_UPLINK_ERROR_REQUEST_FROM_NAS = 2136;
                public static final int PDP_FAIL_RRC_CONNECTION_ACCESS_STRATUM_FAILURE = 2137;
                public static final int PDP_FAIL_RRC_CONNECTION_ANOTHER_PROCEDURE_IN_PROGRESS = 2138;
                public static final int PDP_FAIL_RRC_CONNECTION_ACCESS_BARRED = 2139;
                public static final int PDP_FAIL_RRC_CONNECTION_CELL_RESELECTION = 2140;
                public static final int PDP_FAIL_RRC_CONNECTION_CONFIG_FAILURE = 2141;
                public static final int PDP_FAIL_RRC_CONNECTION_TIMER_EXPIRED = 2142;
                public static final int PDP_FAIL_RRC_CONNECTION_LINK_FAILURE = 2143;
                public static final int PDP_FAIL_RRC_CONNECTION_CELL_NOT_CAMPED = 2144;
                public static final int PDP_FAIL_RRC_CONNECTION_SYSTEM_INTERVAL_FAILURE = 2145;
                public static final int PDP_FAIL_RRC_CONNECTION_REJECT_BY_NETWORK = 2146;
                public static final int PDP_FAIL_RRC_CONNECTION_NORMAL_RELEASE = 2147;
                public static final int PDP_FAIL_RRC_CONNECTION_RADIO_LINK_FAILURE = 2148;
                public static final int PDP_FAIL_RRC_CONNECTION_REESTABLISHMENT_FAILURE = 2149;
                public static final int PDP_FAIL_RRC_CONNECTION_OUT_OF_SERVICE_DURING_CELL_REGISTER = 2150;
                public static final int PDP_FAIL_RRC_CONNECTION_ABORT_REQUEST = 2151;
                public static final int PDP_FAIL_RRC_CONNECTION_SYSTEM_INFORMATION_BLOCK_READ_ERROR = 2152;
                public static final int PDP_FAIL_NETWORK_INITIATED_DETACH_WITH_AUTO_REATTACH = 2153;
                public static final int PDP_FAIL_NETWORK_INITIATED_DETACH_NO_AUTO_REATTACH = 2154;
                public static final int PDP_FAIL_ESM_PROCEDURE_TIME_OUT = 2155;
                public static final int PDP_FAIL_INVALID_CONNECTION_ID = 2156;
                public static final int PDP_FAIL_MAXIMIUM_NSAPIS_EXCEEDED = 2157;
                public static final int PDP_FAIL_INVALID_PRIMARY_NSAPI = 2158;
                public static final int PDP_FAIL_CANNOT_ENCODE_OTA_MESSAGE = 2159;
                public static final int PDP_FAIL_RADIO_ACCESS_BEARER_SETUP_FAILURE = 2160;
                public static final int PDP_FAIL_PDP_ESTABLISH_TIMEOUT_EXPIRED = 2161;
                public static final int PDP_FAIL_PDP_MODIFY_TIMEOUT_EXPIRED = 2162;
                public static final int PDP_FAIL_PDP_INACTIVE_TIMEOUT_EXPIRED = 2163;
                public static final int PDP_FAIL_PDP_LOWERLAYER_ERROR = 2164;
                public static final int PDP_FAIL_PDP_MODIFY_COLLISION = 2165;
                public static final int PDP_FAIL_MAXINUM_SIZE_OF_L2_MESSAGE_EXCEEDED = 2166;
                public static final int PDP_FAIL_NAS_REQUEST_REJECTED_BY_NETWORK = 2167;
                public static final int PDP_FAIL_RRC_CONNECTION_INVALID_REQUEST = 2168;
                public static final int PDP_FAIL_RRC_CONNECTION_TRACKING_AREA_ID_CHANGED = 2169;
                public static final int PDP_FAIL_RRC_CONNECTION_RF_UNAVAILABLE = 2170;
                public static final int PDP_FAIL_RRC_CONNECTION_ABORTED_DUE_TO_IRAT_CHANGE = 2171;
                public static final int PDP_FAIL_RRC_CONNECTION_RELEASED_SECURITY_NOT_ACTIVE = 2172;
                public static final int PDP_FAIL_RRC_CONNECTION_ABORTED_AFTER_HANDOVER = 2173;
                public static final int PDP_FAIL_RRC_CONNECTION_ABORTED_AFTER_IRAT_CELL_CHANGE = 2174;
                public static final int PDP_FAIL_RRC_CONNECTION_ABORTED_DURING_IRAT_CELL_CHANGE = 2175;
                public static final int PDP_FAIL_IMSI_UNKNOWN_IN_HOME_SUBSCRIBER_SERVER = 2176;
                public static final int PDP_FAIL_IMEI_NOT_ACCEPTED = 2177;
                public static final int PDP_FAIL_EPS_SERVICES_AND_NON_EPS_SERVICES_NOT_ALLOWED = 2178;
                public static final int PDP_FAIL_EPS_SERVICES_NOT_ALLOWED_IN_PLMN = 2179;
                public static final int PDP_FAIL_MSC_TEMPORARILY_NOT_REACHABLE = 2180;
                public static final int PDP_FAIL_CS_DOMAIN_NOT_AVAILABLE = 2181;
                public static final int PDP_FAIL_ESM_FAILURE = 2182;
                public static final int PDP_FAIL_MAC_FAILURE = 2183;
                public static final int PDP_FAIL_SYNCHRONIZATION_FAILURE = 2184;
                public static final int PDP_FAIL_UE_SECURITY_CAPABILITIES_MISMATCH = 2185;
                public static final int PDP_FAIL_SECURITY_MODE_REJECTED = 2186;
                public static final int PDP_FAIL_UNACCEPTABLE_NON_EPS_AUTHENTICATION = 2187;
                public static final int PDP_FAIL_CS_FALLBACK_CALL_ESTABLISHMENT_NOT_ALLOWED = 2188;
                public static final int PDP_FAIL_NO_EPS_BEARER_CONTEXT_ACTIVATED = 2189;
                public static final int PDP_FAIL_INVALID_EMM_STATE = 2190;
                public static final int PDP_FAIL_NAS_LAYER_FAILURE = 2191;
                public static final int PDP_FAIL_MULTIPLE_PDP_CALL_NOT_ALLOWED = 2192;
                public static final int PDP_FAIL_EMBMS_NOT_ENABLED = 2193;
                public static final int PDP_FAIL_IRAT_HANDOVER_FAILED = 2194;
                public static final int PDP_FAIL_EMBMS_REGULAR_DEACTIVATION = 2195;
                public static final int PDP_FAIL_TEST_LOOPBACK_REGULAR_DEACTIVATION = 2196;
                public static final int PDP_FAIL_LOWER_LAYER_REGISTRATION_FAILURE = 2197;
                public static final int PDP_FAIL_DATA_PLAN_EXPIRED = 2198;
                public static final int PDP_FAIL_UMTS_HANDOVER_TO_IWLAN = 2199;
                public static final int PDP_FAIL_EVDO_CONNECTION_DENY_BY_GENERAL_OR_NETWORK_BUSY = 2200;
                public static final int PDP_FAIL_EVDO_CONNECTION_DENY_BY_BILLING_OR_AUTHENTICATION_FAILURE = 2201;
                public static final int PDP_FAIL_EVDO_HDR_CHANGED = 2202;
                public static final int PDP_FAIL_EVDO_HDR_EXITED = 2203;
                public static final int PDP_FAIL_EVDO_HDR_NO_SESSION = 2204;
                public static final int PDP_FAIL_EVDO_USING_GPS_FIX_INSTEAD_OF_HDR_CALL = 2205;
                public static final int PDP_FAIL_EVDO_HDR_CONNECTION_SETUP_TIMEOUT = 2206;
                public static final int PDP_FAIL_FAILED_TO_ACQUIRE_COLOCATED_HDR = 2207;
                public static final int PDP_FAIL_OTASP_COMMIT_IN_PROGRESS = 2208;
                public static final int PDP_FAIL_NO_HYBRID_HDR_SERVICE = 2209;
                public static final int PDP_FAIL_HDR_NO_LOCK_GRANTED = 2210;
                public static final int PDP_FAIL_DBM_OR_SMS_IN_PROGRESS = 2211;
                public static final int PDP_FAIL_HDR_FADE = 2212;
                public static final int PDP_FAIL_HDR_ACCESS_FAILURE = 2213;
                public static final int PDP_FAIL_UNSUPPORTED_1X_PREV = 2214;
                public static final int PDP_FAIL_LOCAL_END = 2215;
                public static final int PDP_FAIL_NO_SERVICE = 2216;
                public static final int PDP_FAIL_FADE = 2217;
                public static final int PDP_FAIL_NORMAL_RELEASE = 2218;
                public static final int PDP_FAIL_ACCESS_ATTEMPT_ALREADY_IN_PROGRESS = 2219;
                public static final int PDP_FAIL_REDIRECTION_OR_HANDOFF_IN_PROGRESS = 2220;
                public static final int PDP_FAIL_EMERGENCY_MODE = 2221;
                public static final int PDP_FAIL_PHONE_IN_USE = 2222;
                public static final int PDP_FAIL_INVALID_MODE = 2223;
                public static final int PDP_FAIL_INVALID_SIM_STATE = 2224;
                public static final int PDP_FAIL_NO_COLLOCATED_HDR = 2225;
                public static final int PDP_FAIL_UE_IS_ENTERING_POWERSAVE_MODE = 2226;
                public static final int PDP_FAIL_DUAL_SWITCH = 2227;
                public static final int PDP_FAIL_PPP_TIMEOUT = 2228;
                public static final int PDP_FAIL_PPP_AUTH_FAILURE = 2229;
                public static final int PDP_FAIL_PPP_OPTION_MISMATCH = 2230;
                public static final int PDP_FAIL_PPP_PAP_FAILURE = 2231;
                public static final int PDP_FAIL_PPP_CHAP_FAILURE = 2232;
                public static final int PDP_FAIL_PPP_CLOSE_IN_PROGRESS = 2233;
                public static final int PDP_FAIL_LIMITED_TO_IPV4 = 2234;
                public static final int PDP_FAIL_LIMITED_TO_IPV6 = 2235;
                public static final int PDP_FAIL_VSNCP_TIMEOUT = 2236;
                public static final int PDP_FAIL_VSNCP_GEN_ERROR = 2237;
                public static final int PDP_FAIL_VSNCP_APN_UNATHORIZED = 2238;
                public static final int PDP_FAIL_VSNCP_PDN_LIMIT_EXCEEDED = 2239;
                public static final int PDP_FAIL_VSNCP_NO_PDN_GATEWAY_ADDRESS = 2240;
                public static final int PDP_FAIL_VSNCP_PDN_GATEWAY_UNREACHABLE = 2241;
                public static final int PDP_FAIL_VSNCP_PDN_GATEWAY_REJECT = 2242;
                public static final int PDP_FAIL_VSNCP_INSUFFICIENT_PARAMETERS = 2243;
                public static final int PDP_FAIL_VSNCP_RESOURCE_UNAVAILABLE = 2244;
                public static final int PDP_FAIL_VSNCP_ADMINISTRATIVELY_PROHIBITED = 2245;
                public static final int PDP_FAIL_VSNCP_PDN_ID_IN_USE = 2246;
                public static final int PDP_FAIL_VSNCP_SUBSCRIBER_LIMITATION = 2247;
                public static final int PDP_FAIL_VSNCP_PDN_EXISTS_FOR_THIS_APN = 2248;
                public static final int PDP_FAIL_VSNCP_RECONNECT_NOT_ALLOWED = 2249;
                public static final int PDP_FAIL_IPV6_PREFIX_UNAVAILABLE = 2250;
                public static final int PDP_FAIL_HANDOFF_PREFERENCE_CHANGED = 2251;
                public static final int PDP_FAIL_VOICE_REGISTRATION_FAIL = -1;
                public static final int PDP_FAIL_DATA_REGISTRATION_FAIL = -2;
                public static final int PDP_FAIL_SIGNAL_LOST = -3;
                public static final int PDP_FAIL_PREF_RADIO_TECH_CHANGED = -4;
                public static final int PDP_FAIL_RADIO_POWER_OFF = -5;
                public static final int PDP_FAIL_TETHERED_CALL_ACTIVE = -6;
                public static final int PDP_FAIL_ERROR_UNSPECIFIED = 65535;
            }
        }

        public static interface Type {
            public static final int UNKNOWN = 0;
            public static final int SETTINGS_CHANGED = 1;
            public static final int RIL_SERVICE_STATE_CHANGED = 2;
            public static final int IMS_CONNECTION_STATE_CHANGED = 3;
            public static final int IMS_CAPABILITIES_CHANGED = 4;
            public static final int DATA_CALL_SETUP = 5;
            public static final int DATA_CALL_SETUP_RESPONSE = 6;
            public static final int DATA_CALL_LIST_CHANGED = 7;
            public static final int DATA_CALL_DEACTIVATE = 8;
            public static final int DATA_CALL_DEACTIVATE_RESPONSE = 9;
            public static final int DATA_STALL_ACTION = 10;
            public static final int MODEM_RESTART = 11;
            public static final int NITZ_TIME = 12;
            public static final int CARRIER_ID_MATCHING = 13;
            public static final int CARRIER_KEY_CHANGED = 14;
            public static final int DATA_SWITCH = 15;
            public static final int NETWORK_VALIDATE = 16;
            public static final int ON_DEMAND_DATA_SWITCH = 17;
            public static final int SIM_STATE_CHANGED = 18;
            public static final int ACTIVE_SUBSCRIPTION_INFO_CHANGED = 19;
            public static final int ENABLED_MODEM_CHANGED = 20;
            public static final int EMERGENCY_NUMBER_REPORT = 21;
            public static final int NETWORK_CAPABILITIES_CHANGED = 22;
            public static final int SIGNAL_STRENGTH = 23;
            public static final int RADIO_STATE_CHANGED = 24;
        }
    }

    public static final class TelephonyHistogram extends com.android.internal.telephony.protobuf.nano.ExtendableMessageNano<com.android.internal.telephony.nano.TelephonyProto.TelephonyHistogram> {
        public int category;
        public int id;
        public int minTimeMillis;
        public int maxTimeMillis;
        public int avgTimeMillis;
        public int count;
        public int bucketCount;
        public int[] bucketEndPoints;
        public int[] bucketCounters;
        public static com.android.internal.telephony.nano.TelephonyProto.TelephonyHistogram[] emptyArray() { return null; }
        public TelephonyHistogram() { super(); }
        public com.android.internal.telephony.nano.TelephonyProto.TelephonyHistogram clear() { return null; }
        public void writeTo(com.android.internal.telephony.protobuf.nano.CodedOutputByteBufferNano p0) throws java.io.IOException {}
        protected int computeSerializedSize() { return 0; }
        public com.android.internal.telephony.nano.TelephonyProto.TelephonyHistogram mergeFrom(com.android.internal.telephony.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
        public static com.android.internal.telephony.nano.TelephonyProto.TelephonyHistogram parseFrom(byte[] p0) throws com.android.internal.telephony.protobuf.nano.InvalidProtocolBufferNanoException { return null; }
        public static com.android.internal.telephony.nano.TelephonyProto.TelephonyHistogram parseFrom(com.android.internal.telephony.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
    }

    public static final class TelephonyLog extends com.android.internal.telephony.protobuf.nano.ExtendableMessageNano<com.android.internal.telephony.nano.TelephonyProto.TelephonyLog> {
        public com.android.internal.telephony.nano.TelephonyProto.TelephonyEvent[] events;
        public com.android.internal.telephony.nano.TelephonyProto.TelephonyCallSession[] callSessions;
        public com.android.internal.telephony.nano.TelephonyProto.SmsSession[] smsSessions;
        public com.android.internal.telephony.nano.TelephonyProto.TelephonyHistogram[] histograms;
        public boolean eventsDropped;
        public com.android.internal.telephony.nano.TelephonyProto.Time startTime;
        public com.android.internal.telephony.nano.TelephonyProto.Time endTime;
        public com.android.internal.telephony.nano.TelephonyProto.ModemPowerStats modemPowerStats;
        public java.lang.String hardwareRevision;
        public com.android.internal.telephony.nano.TelephonyProto.ActiveSubscriptionInfo[] lastActiveSubscriptionInfo;
        public com.android.internal.telephony.nano.TelephonyProto.BandwidthEstimatorStats bandwidthEstimatorStats;
        public static com.android.internal.telephony.nano.TelephonyProto.TelephonyLog[] emptyArray() { return null; }
        public TelephonyLog() { super(); }
        public com.android.internal.telephony.nano.TelephonyProto.TelephonyLog clear() { return null; }
        public void writeTo(com.android.internal.telephony.protobuf.nano.CodedOutputByteBufferNano p0) throws java.io.IOException {}
        protected int computeSerializedSize() { return 0; }
        public com.android.internal.telephony.nano.TelephonyProto.TelephonyLog mergeFrom(com.android.internal.telephony.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
        public static com.android.internal.telephony.nano.TelephonyProto.TelephonyLog parseFrom(byte[] p0) throws com.android.internal.telephony.protobuf.nano.InvalidProtocolBufferNanoException { return null; }
        public static com.android.internal.telephony.nano.TelephonyProto.TelephonyLog parseFrom(com.android.internal.telephony.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
    }

    public static final class TelephonyServiceState extends com.android.internal.telephony.protobuf.nano.ExtendableMessageNano<com.android.internal.telephony.nano.TelephonyProto.TelephonyServiceState> {
        public com.android.internal.telephony.nano.TelephonyProto.TelephonyServiceState.TelephonyOperator voiceOperator;
        public com.android.internal.telephony.nano.TelephonyProto.TelephonyServiceState.TelephonyOperator dataOperator;
        public int voiceRoamingType;
        public int dataRoamingType;
        public int voiceRat;
        public int dataRat;
        public int channelNumber;
        public int nrFrequencyRange;
        public int nrState;
        public com.android.internal.telephony.nano.TelephonyProto.TelephonyServiceState.NetworkRegistrationInfo[] networkRegistrationInfo;
        public static com.android.internal.telephony.nano.TelephonyProto.TelephonyServiceState[] emptyArray() { return null; }
        public TelephonyServiceState() { super(); }
        public com.android.internal.telephony.nano.TelephonyProto.TelephonyServiceState clear() { return null; }
        public void writeTo(com.android.internal.telephony.protobuf.nano.CodedOutputByteBufferNano p0) throws java.io.IOException {}
        protected int computeSerializedSize() { return 0; }
        public com.android.internal.telephony.nano.TelephonyProto.TelephonyServiceState mergeFrom(com.android.internal.telephony.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
        public static com.android.internal.telephony.nano.TelephonyProto.TelephonyServiceState parseFrom(byte[] p0) throws com.android.internal.telephony.protobuf.nano.InvalidProtocolBufferNanoException { return null; }
        public static com.android.internal.telephony.nano.TelephonyProto.TelephonyServiceState parseFrom(com.android.internal.telephony.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }

        public static interface Domain {
            public static final int DOMAIN_UNKNOWN = 0;
            public static final int DOMAIN_CS = 1;
            public static final int DOMAIN_PS = 2;
        }

        public static interface FrequencyRange {
            public static final int FREQUENCY_RANGE_UNKNOWN = 0;
            public static final int FREQUENCY_RANGE_LOW = 1;
            public static final int FREQUENCY_RANGE_MID = 2;
            public static final int FREQUENCY_RANGE_HIGH = 3;
            public static final int FREQUENCY_RANGE_MMWAVE = 4;
        }

        public static final class NetworkRegistrationInfo extends com.android.internal.telephony.protobuf.nano.ExtendableMessageNano<com.android.internal.telephony.nano.TelephonyProto.TelephonyServiceState.NetworkRegistrationInfo> {
            public int domain;
            public int transport;
            public int rat;
            public static com.android.internal.telephony.nano.TelephonyProto.TelephonyServiceState.NetworkRegistrationInfo[] emptyArray() { return null; }
            public NetworkRegistrationInfo() { super(); }
            public com.android.internal.telephony.nano.TelephonyProto.TelephonyServiceState.NetworkRegistrationInfo clear() { return null; }
            public void writeTo(com.android.internal.telephony.protobuf.nano.CodedOutputByteBufferNano p0) throws java.io.IOException {}
            protected int computeSerializedSize() { return 0; }
            public com.android.internal.telephony.nano.TelephonyProto.TelephonyServiceState.NetworkRegistrationInfo mergeFrom(com.android.internal.telephony.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
            public static com.android.internal.telephony.nano.TelephonyProto.TelephonyServiceState.NetworkRegistrationInfo parseFrom(byte[] p0) throws com.android.internal.telephony.protobuf.nano.InvalidProtocolBufferNanoException { return null; }
            public static com.android.internal.telephony.nano.TelephonyProto.TelephonyServiceState.NetworkRegistrationInfo parseFrom(com.android.internal.telephony.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
        }

        public static interface NrState {
            public static final int NR_STATE_NONE = 0;
            public static final int NR_STATE_RESTRICTED = 1;
            public static final int NR_STATE_NOT_RESTRICTED = 2;
            public static final int NR_STATE_CONNECTED = 3;
        }

        public static interface RoamingType {
            public static final int UNKNOWN = -1;
            public static final int ROAMING_TYPE_NOT_ROAMING = 0;
            public static final int ROAMING_TYPE_UNKNOWN = 1;
            public static final int ROAMING_TYPE_DOMESTIC = 2;
            public static final int ROAMING_TYPE_INTERNATIONAL = 3;
        }

        public static final class TelephonyOperator extends com.android.internal.telephony.protobuf.nano.ExtendableMessageNano<com.android.internal.telephony.nano.TelephonyProto.TelephonyServiceState.TelephonyOperator> {
            public java.lang.String alphaLong;
            public java.lang.String alphaShort;
            public java.lang.String numeric;
            public static com.android.internal.telephony.nano.TelephonyProto.TelephonyServiceState.TelephonyOperator[] emptyArray() { return null; }
            public TelephonyOperator() { super(); }
            public com.android.internal.telephony.nano.TelephonyProto.TelephonyServiceState.TelephonyOperator clear() { return null; }
            public void writeTo(com.android.internal.telephony.protobuf.nano.CodedOutputByteBufferNano p0) throws java.io.IOException {}
            protected int computeSerializedSize() { return 0; }
            public com.android.internal.telephony.nano.TelephonyProto.TelephonyServiceState.TelephonyOperator mergeFrom(com.android.internal.telephony.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
            public static com.android.internal.telephony.nano.TelephonyProto.TelephonyServiceState.TelephonyOperator parseFrom(byte[] p0) throws com.android.internal.telephony.protobuf.nano.InvalidProtocolBufferNanoException { return null; }
            public static com.android.internal.telephony.nano.TelephonyProto.TelephonyServiceState.TelephonyOperator parseFrom(com.android.internal.telephony.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
        }

        public static interface Transport {
            public static final int TRANSPORT_UNKNOWN = 0;
            public static final int TRANSPORT_WWAN = 1;
            public static final int TRANSPORT_WLAN = 2;
        }
    }

    public static final class TelephonySettings extends com.android.internal.telephony.protobuf.nano.ExtendableMessageNano<com.android.internal.telephony.nano.TelephonyProto.TelephonySettings> {
        public boolean isAirplaneMode;
        public boolean isCellularDataEnabled;
        public boolean isDataRoamingEnabled;
        public int preferredNetworkMode;
        public boolean isEnhanced4GLteModeEnabled;
        public boolean isWifiEnabled;
        public boolean isWifiCallingEnabled;
        public int wifiCallingMode;
        public boolean isVtOverLteEnabled;
        public boolean isVtOverWifiEnabled;
        public static com.android.internal.telephony.nano.TelephonyProto.TelephonySettings[] emptyArray() { return null; }
        public TelephonySettings() { super(); }
        public com.android.internal.telephony.nano.TelephonyProto.TelephonySettings clear() { return null; }
        public void writeTo(com.android.internal.telephony.protobuf.nano.CodedOutputByteBufferNano p0) throws java.io.IOException {}
        protected int computeSerializedSize() { return 0; }
        public com.android.internal.telephony.nano.TelephonyProto.TelephonySettings mergeFrom(com.android.internal.telephony.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
        public static com.android.internal.telephony.nano.TelephonyProto.TelephonySettings parseFrom(byte[] p0) throws com.android.internal.telephony.protobuf.nano.InvalidProtocolBufferNanoException { return null; }
        public static com.android.internal.telephony.nano.TelephonyProto.TelephonySettings parseFrom(com.android.internal.telephony.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }

        public static interface RilNetworkMode {
            public static final int NETWORK_MODE_UNKNOWN = 0;
            public static final int NETWORK_MODE_WCDMA_PREF = 1;
            public static final int NETWORK_MODE_GSM_ONLY = 2;
            public static final int NETWORK_MODE_WCDMA_ONLY = 3;
            public static final int NETWORK_MODE_GSM_UMTS = 4;
            public static final int NETWORK_MODE_CDMA = 5;
            public static final int NETWORK_MODE_CDMA_NO_EVDO = 6;
            public static final int NETWORK_MODE_EVDO_NO_CDMA = 7;
            public static final int NETWORK_MODE_GLOBAL = 8;
            public static final int NETWORK_MODE_LTE_CDMA_EVDO = 9;
            public static final int NETWORK_MODE_LTE_GSM_WCDMA = 10;
            public static final int NETWORK_MODE_LTE_CDMA_EVDO_GSM_WCDMA = 11;
            public static final int NETWORK_MODE_LTE_ONLY = 12;
            public static final int NETWORK_MODE_LTE_WCDMA = 13;
            public static final int NETWORK_MODE_TDSCDMA_ONLY = 14;
            public static final int NETWORK_MODE_TDSCDMA_WCDMA = 15;
            public static final int NETWORK_MODE_LTE_TDSCDMA = 16;
            public static final int NETWORK_MODE_TDSCDMA_GSM = 17;
            public static final int NETWORK_MODE_LTE_TDSCDMA_GSM = 18;
            public static final int NETWORK_MODE_TDSCDMA_GSM_WCDMA = 19;
            public static final int NETWORK_MODE_LTE_TDSCDMA_WCDMA = 20;
            public static final int NETWORK_MODE_LTE_TDSCDMA_GSM_WCDMA = 21;
            public static final int NETWORK_MODE_TDSCDMA_CDMA_EVDO_GSM_WCDMA = 22;
            public static final int NETWORK_MODE_LTE_TDSCDMA_CDMA_EVDO_GSM_WCDMA = 23;
        }

        public static interface WiFiCallingMode {
            public static final int WFC_MODE_UNKNOWN = 0;
            public static final int WFC_MODE_WIFI_ONLY = 1;
            public static final int WFC_MODE_CELLULAR_PREFERRED = 2;
            public static final int WFC_MODE_WIFI_PREFERRED = 3;
        }
    }

    public static final class Time extends com.android.internal.telephony.protobuf.nano.ExtendableMessageNano<com.android.internal.telephony.nano.TelephonyProto.Time> {
        public long systemTimestampMillis;
        public long elapsedTimestampMillis;
        public static com.android.internal.telephony.nano.TelephonyProto.Time[] emptyArray() { return null; }
        public Time() { super(); }
        public com.android.internal.telephony.nano.TelephonyProto.Time clear() { return null; }
        public void writeTo(com.android.internal.telephony.protobuf.nano.CodedOutputByteBufferNano p0) throws java.io.IOException {}
        protected int computeSerializedSize() { return 0; }
        public com.android.internal.telephony.nano.TelephonyProto.Time mergeFrom(com.android.internal.telephony.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
        public static com.android.internal.telephony.nano.TelephonyProto.Time parseFrom(byte[] p0) throws com.android.internal.telephony.protobuf.nano.InvalidProtocolBufferNanoException { return null; }
        public static com.android.internal.telephony.nano.TelephonyProto.Time parseFrom(com.android.internal.telephony.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
    }

    public static interface TimeInterval {
        public static final int TI_UNKNOWN = 0;
        public static final int TI_10_MILLIS = 1;
        public static final int TI_20_MILLIS = 2;
        public static final int TI_50_MILLIS = 3;
        public static final int TI_100_MILLIS = 4;
        public static final int TI_200_MILLIS = 5;
        public static final int TI_500_MILLIS = 6;
        public static final int TI_1_SEC = 7;
        public static final int TI_2_SEC = 8;
        public static final int TI_5_SEC = 9;
        public static final int TI_10_SEC = 10;
        public static final int TI_30_SEC = 11;
        public static final int TI_1_MINUTE = 12;
        public static final int TI_3_MINUTES = 13;
        public static final int TI_10_MINUTES = 14;
        public static final int TI_30_MINUTES = 15;
        public static final int TI_1_HOUR = 16;
        public static final int TI_2_HOURS = 17;
        public static final int TI_4_HOURS = 18;
        public static final int TI_MANY_HOURS = 19;
    }
}
