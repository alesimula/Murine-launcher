package com.android.internal.telephony.nano;

public interface PersistAtomsProto {

    public static final class CarrierIdMismatch extends com.android.internal.telephony.protobuf.nano.ExtendableMessageNano<com.android.internal.telephony.nano.PersistAtomsProto.CarrierIdMismatch> {
        public java.lang.String mccMnc;
        public java.lang.String gid1;
        public java.lang.String spn;
        public java.lang.String pnn;
        public static com.android.internal.telephony.nano.PersistAtomsProto.CarrierIdMismatch[] emptyArray() { return null; }
        public CarrierIdMismatch() { super(); }
        public com.android.internal.telephony.nano.PersistAtomsProto.CarrierIdMismatch clear() { return null; }
        public void writeTo(com.android.internal.telephony.protobuf.nano.CodedOutputByteBufferNano p0) throws java.io.IOException {}
        protected int computeSerializedSize() { return 0; }
        public com.android.internal.telephony.nano.PersistAtomsProto.CarrierIdMismatch mergeFrom(com.android.internal.telephony.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
        public static com.android.internal.telephony.nano.PersistAtomsProto.CarrierIdMismatch parseFrom(byte[] p0) throws com.android.internal.telephony.protobuf.nano.InvalidProtocolBufferNanoException { return null; }
        public static com.android.internal.telephony.nano.PersistAtomsProto.CarrierIdMismatch parseFrom(com.android.internal.telephony.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
    }

    public static final class CellularDataServiceSwitch extends com.android.internal.telephony.protobuf.nano.ExtendableMessageNano<com.android.internal.telephony.nano.PersistAtomsProto.CellularDataServiceSwitch> {
        public int ratFrom;
        public int ratTo;
        public int simSlotIndex;
        public boolean isMultiSim;
        public int carrierId;
        public int switchCount;
        public long lastUsedMillis;
        public static com.android.internal.telephony.nano.PersistAtomsProto.CellularDataServiceSwitch[] emptyArray() { return null; }
        public CellularDataServiceSwitch() { super(); }
        public com.android.internal.telephony.nano.PersistAtomsProto.CellularDataServiceSwitch clear() { return null; }
        public void writeTo(com.android.internal.telephony.protobuf.nano.CodedOutputByteBufferNano p0) throws java.io.IOException {}
        protected int computeSerializedSize() { return 0; }
        public com.android.internal.telephony.nano.PersistAtomsProto.CellularDataServiceSwitch mergeFrom(com.android.internal.telephony.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
        public static com.android.internal.telephony.nano.PersistAtomsProto.CellularDataServiceSwitch parseFrom(byte[] p0) throws com.android.internal.telephony.protobuf.nano.InvalidProtocolBufferNanoException { return null; }
        public static com.android.internal.telephony.nano.PersistAtomsProto.CellularDataServiceSwitch parseFrom(com.android.internal.telephony.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
    }

    public static final class CellularServiceState extends com.android.internal.telephony.protobuf.nano.ExtendableMessageNano<com.android.internal.telephony.nano.PersistAtomsProto.CellularServiceState> {
        public int voiceRat;
        public int dataRat;
        public int voiceRoamingType;
        public int dataRoamingType;
        public boolean isEndc;
        public int simSlotIndex;
        public boolean isMultiSim;
        public int carrierId;
        public long totalTimeMillis;
        public boolean isEmergencyOnly;
        public boolean isInternetPdnUp;
        public int foldState;
        public long lastUsedMillis;
        public static com.android.internal.telephony.nano.PersistAtomsProto.CellularServiceState[] emptyArray() { return null; }
        public CellularServiceState() { super(); }
        public com.android.internal.telephony.nano.PersistAtomsProto.CellularServiceState clear() { return null; }
        public void writeTo(com.android.internal.telephony.protobuf.nano.CodedOutputByteBufferNano p0) throws java.io.IOException {}
        protected int computeSerializedSize() { return 0; }
        public com.android.internal.telephony.nano.PersistAtomsProto.CellularServiceState mergeFrom(com.android.internal.telephony.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
        public static com.android.internal.telephony.nano.PersistAtomsProto.CellularServiceState parseFrom(byte[] p0) throws com.android.internal.telephony.protobuf.nano.InvalidProtocolBufferNanoException { return null; }
        public static com.android.internal.telephony.nano.PersistAtomsProto.CellularServiceState parseFrom(com.android.internal.telephony.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
    }

    public static final class DataCallSession extends com.android.internal.telephony.protobuf.nano.ExtendableMessageNano<com.android.internal.telephony.nano.PersistAtomsProto.DataCallSession> {
        public int dimension;
        public boolean isMultiSim;
        public boolean isEsim;
        public int apnTypeBitmask;
        public int carrierId;
        public boolean isRoaming;
        public int ratAtEnd;
        public boolean oosAtEnd;
        public long ratSwitchCount;
        public boolean isOpportunistic;
        public int ipType;
        public boolean setupFailed;
        public int failureCause;
        public int suggestedRetryMillis;
        public int deactivateReason;
        public long durationMinutes;
        public boolean ongoing;
        public int bandAtEnd;
        public int[] handoverFailureCauses;
        public int[] handoverFailureRat;
        public boolean isNonDds;
        public static com.android.internal.telephony.nano.PersistAtomsProto.DataCallSession[] emptyArray() { return null; }
        public DataCallSession() { super(); }
        public com.android.internal.telephony.nano.PersistAtomsProto.DataCallSession clear() { return null; }
        public void writeTo(com.android.internal.telephony.protobuf.nano.CodedOutputByteBufferNano p0) throws java.io.IOException {}
        protected int computeSerializedSize() { return 0; }
        public com.android.internal.telephony.nano.PersistAtomsProto.DataCallSession mergeFrom(com.android.internal.telephony.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
        public static com.android.internal.telephony.nano.PersistAtomsProto.DataCallSession parseFrom(byte[] p0) throws com.android.internal.telephony.protobuf.nano.InvalidProtocolBufferNanoException { return null; }
        public static com.android.internal.telephony.nano.PersistAtomsProto.DataCallSession parseFrom(com.android.internal.telephony.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
    }

    public static final class EmergencyNumbersInfo extends com.android.internal.telephony.protobuf.nano.ExtendableMessageNano<com.android.internal.telephony.nano.PersistAtomsProto.EmergencyNumbersInfo> {
        public boolean isDbVersionIgnored;
        public int assetVersion;
        public int otaVersion;
        public java.lang.String number;
        public java.lang.String countryIso;
        public java.lang.String mnc;
        public int route;
        public java.lang.String[] urns;
        public int[] serviceCategories;
        public int[] sources;
        public static com.android.internal.telephony.nano.PersistAtomsProto.EmergencyNumbersInfo[] emptyArray() { return null; }
        public EmergencyNumbersInfo() { super(); }
        public com.android.internal.telephony.nano.PersistAtomsProto.EmergencyNumbersInfo clear() { return null; }
        public void writeTo(com.android.internal.telephony.protobuf.nano.CodedOutputByteBufferNano p0) throws java.io.IOException {}
        protected int computeSerializedSize() { return 0; }
        public com.android.internal.telephony.nano.PersistAtomsProto.EmergencyNumbersInfo mergeFrom(com.android.internal.telephony.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
        public static com.android.internal.telephony.nano.PersistAtomsProto.EmergencyNumbersInfo parseFrom(byte[] p0) throws com.android.internal.telephony.protobuf.nano.InvalidProtocolBufferNanoException { return null; }
        public static com.android.internal.telephony.nano.PersistAtomsProto.EmergencyNumbersInfo parseFrom(com.android.internal.telephony.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }

        public static interface CallRoute {
            public static final int EMERGENCY_CALL_ROUTE_UNKNOWN = 0;
            public static final int EMERGENCY_CALL_ROUTE_EMERGENCY = 1;
            public static final int EMERGENCY_CALL_ROUTE_NORMAL = 2;
        }

        public static interface ServiceCategory {
            public static final int EMERGENCY_SERVICE_CATEGORY_UNSPECIFIED = 0;
            public static final int EMERGENCY_SERVICE_CATEGORY_POLICE = 1;
            public static final int EMERGENCY_SERVICE_CATEGORY_AMBULANCE = 2;
            public static final int EMERGENCY_SERVICE_CATEGORY_FIRE_BRIGADE = 3;
            public static final int EMERGENCY_SERVICE_CATEGORY_MARINE_GUARD = 4;
            public static final int EMERGENCY_SERVICE_CATEGORY_MOUNTAIN_RESCUE = 5;
            public static final int EMERGENCY_SERVICE_CATEGORY_MIEC = 6;
            public static final int EMERGENCY_SERVICE_CATEGORY_AIEC = 7;
        }

        public static interface Source {
            public static final int EMERGENCY_NUMBER_SOURCE_NETWORK_SIGNALING = 0;
            public static final int EMERGENCY_NUMBER_SOURCE_SIM = 1;
            public static final int EMERGENCY_NUMBER_SOURCE_DATABASE = 2;
            public static final int EMERGENCY_NUMBER_SOURCE_MODEM_CONFIG = 3;
            public static final int EMERGENCY_NUMBER_SOURCE_DEFAULT = 4;
        }
    }

    public static final class GbaEvent extends com.android.internal.telephony.protobuf.nano.ExtendableMessageNano<com.android.internal.telephony.nano.PersistAtomsProto.GbaEvent> {
        public int carrierId;
        public int slotId;
        public boolean successful;
        public int failedReason;
        public int count;
        public static com.android.internal.telephony.nano.PersistAtomsProto.GbaEvent[] emptyArray() { return null; }
        public GbaEvent() { super(); }
        public com.android.internal.telephony.nano.PersistAtomsProto.GbaEvent clear() { return null; }
        public void writeTo(com.android.internal.telephony.protobuf.nano.CodedOutputByteBufferNano p0) throws java.io.IOException {}
        protected int computeSerializedSize() { return 0; }
        public com.android.internal.telephony.nano.PersistAtomsProto.GbaEvent mergeFrom(com.android.internal.telephony.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
        public static com.android.internal.telephony.nano.PersistAtomsProto.GbaEvent parseFrom(byte[] p0) throws com.android.internal.telephony.protobuf.nano.InvalidProtocolBufferNanoException { return null; }
        public static com.android.internal.telephony.nano.PersistAtomsProto.GbaEvent parseFrom(com.android.internal.telephony.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
    }

    public static final class ImsDedicatedBearerEvent extends com.android.internal.telephony.protobuf.nano.ExtendableMessageNano<com.android.internal.telephony.nano.PersistAtomsProto.ImsDedicatedBearerEvent> {
        public int carrierId;
        public int slotId;
        public int ratAtEnd;
        public int qci;
        public int bearerState;
        public boolean localConnectionInfoReceived;
        public boolean remoteConnectionInfoReceived;
        public boolean hasListeners;
        public int count;
        public static com.android.internal.telephony.nano.PersistAtomsProto.ImsDedicatedBearerEvent[] emptyArray() { return null; }
        public ImsDedicatedBearerEvent() { super(); }
        public com.android.internal.telephony.nano.PersistAtomsProto.ImsDedicatedBearerEvent clear() { return null; }
        public void writeTo(com.android.internal.telephony.protobuf.nano.CodedOutputByteBufferNano p0) throws java.io.IOException {}
        protected int computeSerializedSize() { return 0; }
        public com.android.internal.telephony.nano.PersistAtomsProto.ImsDedicatedBearerEvent mergeFrom(com.android.internal.telephony.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
        public static com.android.internal.telephony.nano.PersistAtomsProto.ImsDedicatedBearerEvent parseFrom(byte[] p0) throws com.android.internal.telephony.protobuf.nano.InvalidProtocolBufferNanoException { return null; }
        public static com.android.internal.telephony.nano.PersistAtomsProto.ImsDedicatedBearerEvent parseFrom(com.android.internal.telephony.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
    }

    public static final class ImsDedicatedBearerListenerEvent extends com.android.internal.telephony.protobuf.nano.ExtendableMessageNano<com.android.internal.telephony.nano.PersistAtomsProto.ImsDedicatedBearerListenerEvent> {
        public int carrierId;
        public int slotId;
        public int ratAtEnd;
        public int qci;
        public boolean dedicatedBearerEstablished;
        public int eventCount;
        public static com.android.internal.telephony.nano.PersistAtomsProto.ImsDedicatedBearerListenerEvent[] emptyArray() { return null; }
        public ImsDedicatedBearerListenerEvent() { super(); }
        public com.android.internal.telephony.nano.PersistAtomsProto.ImsDedicatedBearerListenerEvent clear() { return null; }
        public void writeTo(com.android.internal.telephony.protobuf.nano.CodedOutputByteBufferNano p0) throws java.io.IOException {}
        protected int computeSerializedSize() { return 0; }
        public com.android.internal.telephony.nano.PersistAtomsProto.ImsDedicatedBearerListenerEvent mergeFrom(com.android.internal.telephony.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
        public static com.android.internal.telephony.nano.PersistAtomsProto.ImsDedicatedBearerListenerEvent parseFrom(byte[] p0) throws com.android.internal.telephony.protobuf.nano.InvalidProtocolBufferNanoException { return null; }
        public static com.android.internal.telephony.nano.PersistAtomsProto.ImsDedicatedBearerListenerEvent parseFrom(com.android.internal.telephony.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
    }

    public static final class ImsRegistrationFeatureTagStats extends com.android.internal.telephony.protobuf.nano.ExtendableMessageNano<com.android.internal.telephony.nano.PersistAtomsProto.ImsRegistrationFeatureTagStats> {
        public int carrierId;
        public int slotId;
        public int featureTagName;
        public int registrationTech;
        public long registeredMillis;
        public static com.android.internal.telephony.nano.PersistAtomsProto.ImsRegistrationFeatureTagStats[] emptyArray() { return null; }
        public ImsRegistrationFeatureTagStats() { super(); }
        public com.android.internal.telephony.nano.PersistAtomsProto.ImsRegistrationFeatureTagStats clear() { return null; }
        public void writeTo(com.android.internal.telephony.protobuf.nano.CodedOutputByteBufferNano p0) throws java.io.IOException {}
        protected int computeSerializedSize() { return 0; }
        public com.android.internal.telephony.nano.PersistAtomsProto.ImsRegistrationFeatureTagStats mergeFrom(com.android.internal.telephony.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
        public static com.android.internal.telephony.nano.PersistAtomsProto.ImsRegistrationFeatureTagStats parseFrom(byte[] p0) throws com.android.internal.telephony.protobuf.nano.InvalidProtocolBufferNanoException { return null; }
        public static com.android.internal.telephony.nano.PersistAtomsProto.ImsRegistrationFeatureTagStats parseFrom(com.android.internal.telephony.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
    }

    public static final class ImsRegistrationServiceDescStats extends com.android.internal.telephony.protobuf.nano.ExtendableMessageNano<com.android.internal.telephony.nano.PersistAtomsProto.ImsRegistrationServiceDescStats> {
        public int carrierId;
        public int slotId;
        public int serviceIdName;
        public float serviceIdVersion;
        public int registrationTech;
        public long publishedMillis;
        public static com.android.internal.telephony.nano.PersistAtomsProto.ImsRegistrationServiceDescStats[] emptyArray() { return null; }
        public ImsRegistrationServiceDescStats() { super(); }
        public com.android.internal.telephony.nano.PersistAtomsProto.ImsRegistrationServiceDescStats clear() { return null; }
        public void writeTo(com.android.internal.telephony.protobuf.nano.CodedOutputByteBufferNano p0) throws java.io.IOException {}
        protected int computeSerializedSize() { return 0; }
        public com.android.internal.telephony.nano.PersistAtomsProto.ImsRegistrationServiceDescStats mergeFrom(com.android.internal.telephony.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
        public static com.android.internal.telephony.nano.PersistAtomsProto.ImsRegistrationServiceDescStats parseFrom(byte[] p0) throws com.android.internal.telephony.protobuf.nano.InvalidProtocolBufferNanoException { return null; }
        public static com.android.internal.telephony.nano.PersistAtomsProto.ImsRegistrationServiceDescStats parseFrom(com.android.internal.telephony.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
    }

    public static final class ImsRegistrationStats extends com.android.internal.telephony.protobuf.nano.ExtendableMessageNano<com.android.internal.telephony.nano.PersistAtomsProto.ImsRegistrationStats> {
        public int carrierId;
        public int simSlotIndex;
        public int rat;
        public long registeredMillis;
        public long voiceCapableMillis;
        public long voiceAvailableMillis;
        public long smsCapableMillis;
        public long smsAvailableMillis;
        public long videoCapableMillis;
        public long videoAvailableMillis;
        public long utCapableMillis;
        public long utAvailableMillis;
        public long lastUsedMillis;
        public static com.android.internal.telephony.nano.PersistAtomsProto.ImsRegistrationStats[] emptyArray() { return null; }
        public ImsRegistrationStats() { super(); }
        public com.android.internal.telephony.nano.PersistAtomsProto.ImsRegistrationStats clear() { return null; }
        public void writeTo(com.android.internal.telephony.protobuf.nano.CodedOutputByteBufferNano p0) throws java.io.IOException {}
        protected int computeSerializedSize() { return 0; }
        public com.android.internal.telephony.nano.PersistAtomsProto.ImsRegistrationStats mergeFrom(com.android.internal.telephony.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
        public static com.android.internal.telephony.nano.PersistAtomsProto.ImsRegistrationStats parseFrom(byte[] p0) throws com.android.internal.telephony.protobuf.nano.InvalidProtocolBufferNanoException { return null; }
        public static com.android.internal.telephony.nano.PersistAtomsProto.ImsRegistrationStats parseFrom(com.android.internal.telephony.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
    }

    public static final class ImsRegistrationTermination extends com.android.internal.telephony.protobuf.nano.ExtendableMessageNano<com.android.internal.telephony.nano.PersistAtomsProto.ImsRegistrationTermination> {
        public int carrierId;
        public boolean isMultiSim;
        public int ratAtEnd;
        public boolean setupFailed;
        public int reasonCode;
        public int extraCode;
        public java.lang.String extraMessage;
        public int count;
        public long lastUsedMillis;
        public static com.android.internal.telephony.nano.PersistAtomsProto.ImsRegistrationTermination[] emptyArray() { return null; }
        public ImsRegistrationTermination() { super(); }
        public com.android.internal.telephony.nano.PersistAtomsProto.ImsRegistrationTermination clear() { return null; }
        public void writeTo(com.android.internal.telephony.protobuf.nano.CodedOutputByteBufferNano p0) throws java.io.IOException {}
        protected int computeSerializedSize() { return 0; }
        public com.android.internal.telephony.nano.PersistAtomsProto.ImsRegistrationTermination mergeFrom(com.android.internal.telephony.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
        public static com.android.internal.telephony.nano.PersistAtomsProto.ImsRegistrationTermination parseFrom(byte[] p0) throws com.android.internal.telephony.protobuf.nano.InvalidProtocolBufferNanoException { return null; }
        public static com.android.internal.telephony.nano.PersistAtomsProto.ImsRegistrationTermination parseFrom(com.android.internal.telephony.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
    }

    public static final class IncomingSms extends com.android.internal.telephony.protobuf.nano.ExtendableMessageNano<com.android.internal.telephony.nano.PersistAtomsProto.IncomingSms> {
        public int smsFormat;
        public int smsTech;
        public int rat;
        public int smsType;
        public int totalParts;
        public int receivedParts;
        public boolean blocked;
        public int error;
        public boolean isRoaming;
        public int simSlotIndex;
        public boolean isMultiSim;
        public boolean isEsim;
        public int carrierId;
        public long messageId;
        public int count;
        public boolean isManagedProfile;
        public int hashCode;
        public static com.android.internal.telephony.nano.PersistAtomsProto.IncomingSms[] emptyArray() { return null; }
        public IncomingSms() { super(); }
        public com.android.internal.telephony.nano.PersistAtomsProto.IncomingSms clear() { return null; }
        public void writeTo(com.android.internal.telephony.protobuf.nano.CodedOutputByteBufferNano p0) throws java.io.IOException {}
        protected int computeSerializedSize() { return 0; }
        public com.android.internal.telephony.nano.PersistAtomsProto.IncomingSms mergeFrom(com.android.internal.telephony.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
        public static com.android.internal.telephony.nano.PersistAtomsProto.IncomingSms parseFrom(byte[] p0) throws com.android.internal.telephony.protobuf.nano.InvalidProtocolBufferNanoException { return null; }
        public static com.android.internal.telephony.nano.PersistAtomsProto.IncomingSms parseFrom(com.android.internal.telephony.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
    }

    public static final class NetworkRequests extends com.android.internal.telephony.protobuf.nano.ExtendableMessageNano<com.android.internal.telephony.nano.PersistAtomsProto.NetworkRequests> {
        public int carrierId;
        public int enterpriseRequestCount;
        public int enterpriseReleaseCount;
        public static com.android.internal.telephony.nano.PersistAtomsProto.NetworkRequests[] emptyArray() { return null; }
        public NetworkRequests() { super(); }
        public com.android.internal.telephony.nano.PersistAtomsProto.NetworkRequests clear() { return null; }
        public void writeTo(com.android.internal.telephony.protobuf.nano.CodedOutputByteBufferNano p0) throws java.io.IOException {}
        protected int computeSerializedSize() { return 0; }
        public com.android.internal.telephony.nano.PersistAtomsProto.NetworkRequests mergeFrom(com.android.internal.telephony.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
        public static com.android.internal.telephony.nano.PersistAtomsProto.NetworkRequests parseFrom(byte[] p0) throws com.android.internal.telephony.protobuf.nano.InvalidProtocolBufferNanoException { return null; }
        public static com.android.internal.telephony.nano.PersistAtomsProto.NetworkRequests parseFrom(com.android.internal.telephony.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
    }

    public static final class NetworkRequestsV2 extends com.android.internal.telephony.protobuf.nano.ExtendableMessageNano<com.android.internal.telephony.nano.PersistAtomsProto.NetworkRequestsV2> {
        public int carrierId;
        public int capability;
        public int requestCount;
        public static com.android.internal.telephony.nano.PersistAtomsProto.NetworkRequestsV2[] emptyArray() { return null; }
        public NetworkRequestsV2() { super(); }
        public com.android.internal.telephony.nano.PersistAtomsProto.NetworkRequestsV2 clear() { return null; }
        public void writeTo(com.android.internal.telephony.protobuf.nano.CodedOutputByteBufferNano p0) throws java.io.IOException {}
        protected int computeSerializedSize() { return 0; }
        public com.android.internal.telephony.nano.PersistAtomsProto.NetworkRequestsV2 mergeFrom(com.android.internal.telephony.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
        public static com.android.internal.telephony.nano.PersistAtomsProto.NetworkRequestsV2 parseFrom(byte[] p0) throws com.android.internal.telephony.protobuf.nano.InvalidProtocolBufferNanoException { return null; }
        public static com.android.internal.telephony.nano.PersistAtomsProto.NetworkRequestsV2 parseFrom(com.android.internal.telephony.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }

        public static interface NetworkCapability {
            public static final int UNKNOWN = 0;
            public static final int PRIORITIZE_LATENCY = 1;
            public static final int PRIORITIZE_BANDWIDTH = 2;
            public static final int CBS = 3;
            public static final int ENTERPRISE = 4;
        }
    }

    public static final class OutgoingShortCodeSms extends com.android.internal.telephony.protobuf.nano.ExtendableMessageNano<com.android.internal.telephony.nano.PersistAtomsProto.OutgoingShortCodeSms> {
        public int category;
        public int xmlVersion;
        public int shortCodeSmsCount;
        public static com.android.internal.telephony.nano.PersistAtomsProto.OutgoingShortCodeSms[] emptyArray() { return null; }
        public OutgoingShortCodeSms() { super(); }
        public com.android.internal.telephony.nano.PersistAtomsProto.OutgoingShortCodeSms clear() { return null; }
        public void writeTo(com.android.internal.telephony.protobuf.nano.CodedOutputByteBufferNano p0) throws java.io.IOException {}
        protected int computeSerializedSize() { return 0; }
        public com.android.internal.telephony.nano.PersistAtomsProto.OutgoingShortCodeSms mergeFrom(com.android.internal.telephony.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
        public static com.android.internal.telephony.nano.PersistAtomsProto.OutgoingShortCodeSms parseFrom(byte[] p0) throws com.android.internal.telephony.protobuf.nano.InvalidProtocolBufferNanoException { return null; }
        public static com.android.internal.telephony.nano.PersistAtomsProto.OutgoingShortCodeSms parseFrom(com.android.internal.telephony.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
    }

    public static final class OutgoingSms extends com.android.internal.telephony.protobuf.nano.ExtendableMessageNano<com.android.internal.telephony.nano.PersistAtomsProto.OutgoingSms> {
        public int smsFormat;
        public int smsTech;
        public int rat;
        public int sendResult;
        public int errorCode;
        public boolean isRoaming;
        public boolean isFromDefaultApp;
        public int simSlotIndex;
        public boolean isMultiSim;
        public boolean isEsim;
        public int carrierId;
        public long messageId;
        public int retryId;
        public long intervalMillis;
        public int count;
        public int sendErrorCode;
        public int networkErrorCode;
        public boolean isManagedProfile;
        public int hashCode;
        public static com.android.internal.telephony.nano.PersistAtomsProto.OutgoingSms[] emptyArray() { return null; }
        public OutgoingSms() { super(); }
        public com.android.internal.telephony.nano.PersistAtomsProto.OutgoingSms clear() { return null; }
        public void writeTo(com.android.internal.telephony.protobuf.nano.CodedOutputByteBufferNano p0) throws java.io.IOException {}
        protected int computeSerializedSize() { return 0; }
        public com.android.internal.telephony.nano.PersistAtomsProto.OutgoingSms mergeFrom(com.android.internal.telephony.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
        public static com.android.internal.telephony.nano.PersistAtomsProto.OutgoingSms parseFrom(byte[] p0) throws com.android.internal.telephony.protobuf.nano.InvalidProtocolBufferNanoException { return null; }
        public static com.android.internal.telephony.nano.PersistAtomsProto.OutgoingSms parseFrom(com.android.internal.telephony.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
    }

    public static final class PersistAtoms extends com.android.internal.telephony.protobuf.nano.ExtendableMessageNano<com.android.internal.telephony.nano.PersistAtomsProto.PersistAtoms> {
        public com.android.internal.telephony.nano.PersistAtomsProto.VoiceCallRatUsage[] voiceCallRatUsage;
        public long voiceCallRatUsagePullTimestampMillis;
        public com.android.internal.telephony.nano.PersistAtomsProto.VoiceCallSession[] voiceCallSession;
        public long voiceCallSessionPullTimestampMillis;
        public com.android.internal.telephony.nano.PersistAtomsProto.IncomingSms[] incomingSms;
        public long incomingSmsPullTimestampMillis;
        public com.android.internal.telephony.nano.PersistAtomsProto.OutgoingSms[] outgoingSms;
        public long outgoingSmsPullTimestampMillis;
        public com.android.internal.telephony.nano.PersistAtomsProto.CarrierIdMismatch[] carrierIdMismatch;
        public int carrierIdTableVersion;
        public com.android.internal.telephony.nano.PersistAtomsProto.DataCallSession[] dataCallSession;
        public long dataCallSessionPullTimestampMillis;
        public com.android.internal.telephony.nano.PersistAtomsProto.CellularServiceState[] cellularServiceState;
        public long cellularServiceStatePullTimestampMillis;
        public com.android.internal.telephony.nano.PersistAtomsProto.CellularDataServiceSwitch[] cellularDataServiceSwitch;
        public long cellularDataServiceSwitchPullTimestampMillis;
        public com.android.internal.telephony.nano.PersistAtomsProto.ImsRegistrationTermination[] imsRegistrationTermination;
        public long imsRegistrationTerminationPullTimestampMillis;
        public com.android.internal.telephony.nano.PersistAtomsProto.ImsRegistrationStats[] imsRegistrationStats;
        public long imsRegistrationStatsPullTimestampMillis;
        public java.lang.String buildFingerprint;
        public com.android.internal.telephony.nano.PersistAtomsProto.NetworkRequests[] networkRequests;
        public long networkRequestsPullTimestampMillis;
        public com.android.internal.telephony.nano.PersistAtomsProto.ImsRegistrationFeatureTagStats[] imsRegistrationFeatureTagStats;
        public long imsRegistrationFeatureTagStatsPullTimestampMillis;
        public com.android.internal.telephony.nano.PersistAtomsProto.RcsClientProvisioningStats[] rcsClientProvisioningStats;
        public long rcsClientProvisioningStatsPullTimestampMillis;
        public com.android.internal.telephony.nano.PersistAtomsProto.RcsAcsProvisioningStats[] rcsAcsProvisioningStats;
        public long rcsAcsProvisioningStatsPullTimestampMillis;
        public com.android.internal.telephony.nano.PersistAtomsProto.SipDelegateStats[] sipDelegateStats;
        public long sipDelegateStatsPullTimestampMillis;
        public com.android.internal.telephony.nano.PersistAtomsProto.SipTransportFeatureTagStats[] sipTransportFeatureTagStats;
        public long sipTransportFeatureTagStatsPullTimestampMillis;
        public com.android.internal.telephony.nano.PersistAtomsProto.SipMessageResponse[] sipMessageResponse;
        public long sipMessageResponsePullTimestampMillis;
        public com.android.internal.telephony.nano.PersistAtomsProto.SipTransportSession[] sipTransportSession;
        public long sipTransportSessionPullTimestampMillis;
        public com.android.internal.telephony.nano.PersistAtomsProto.ImsDedicatedBearerListenerEvent[] imsDedicatedBearerListenerEvent;
        public long imsDedicatedBearerListenerEventPullTimestampMillis;
        public com.android.internal.telephony.nano.PersistAtomsProto.ImsDedicatedBearerEvent[] imsDedicatedBearerEvent;
        public long imsDedicatedBearerEventPullTimestampMillis;
        public com.android.internal.telephony.nano.PersistAtomsProto.ImsRegistrationServiceDescStats[] imsRegistrationServiceDescStats;
        public long imsRegistrationServiceDescStatsPullTimestampMillis;
        public com.android.internal.telephony.nano.PersistAtomsProto.UceEventStats[] uceEventStats;
        public long uceEventStatsPullTimestampMillis;
        public com.android.internal.telephony.nano.PersistAtomsProto.PresenceNotifyEvent[] presenceNotifyEvent;
        public long presenceNotifyEventPullTimestampMillis;
        public com.android.internal.telephony.nano.PersistAtomsProto.GbaEvent[] gbaEvent;
        public long gbaEventPullTimestampMillis;
        public com.android.internal.telephony.nano.PersistAtomsProto.NetworkRequestsV2[] networkRequestsV2;
        public long networkRequestsV2PullTimestampMillis;
        public com.android.internal.telephony.nano.PersistAtomsProto.UnmeteredNetworks[] unmeteredNetworks;
        public com.android.internal.telephony.nano.PersistAtomsProto.OutgoingShortCodeSms[] outgoingShortCodeSms;
        public long outgoingShortCodeSmsPullTimestampMillis;
        public int autoDataSwitchToggleCount;
        public com.android.internal.telephony.nano.PersistAtomsProto.SatelliteController[] satelliteController;
        public long satelliteControllerPullTimestampMillis;
        public com.android.internal.telephony.nano.PersistAtomsProto.SatelliteSession[] satelliteSession;
        public long satelliteSessionPullTimestampMillis;
        public com.android.internal.telephony.nano.PersistAtomsProto.SatelliteIncomingDatagram[] satelliteIncomingDatagram;
        public long satelliteIncomingDatagramPullTimestampMillis;
        public com.android.internal.telephony.nano.PersistAtomsProto.SatelliteOutgoingDatagram[] satelliteOutgoingDatagram;
        public long satelliteOutgoingDatagramPullTimestampMillis;
        public com.android.internal.telephony.nano.PersistAtomsProto.SatelliteProvision[] satelliteProvision;
        public long satelliteProvisionPullTimestampMillis;
        public com.android.internal.telephony.nano.PersistAtomsProto.SatelliteSosMessageRecommender[] satelliteSosMessageRecommender;
        public long satelliteSosMessageRecommenderPullTimestampMillis;
        public com.android.internal.telephony.nano.PersistAtomsProto.EmergencyNumbersInfo[] emergencyNumbersInfo;
        public long emergencyNumberPullTimestampMillis;
        public static com.android.internal.telephony.nano.PersistAtomsProto.PersistAtoms[] emptyArray() { return null; }
        public PersistAtoms() { super(); }
        public com.android.internal.telephony.nano.PersistAtomsProto.PersistAtoms clear() { return null; }
        public void writeTo(com.android.internal.telephony.protobuf.nano.CodedOutputByteBufferNano p0) throws java.io.IOException {}
        protected int computeSerializedSize() { return 0; }
        public com.android.internal.telephony.nano.PersistAtomsProto.PersistAtoms mergeFrom(com.android.internal.telephony.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
        public static com.android.internal.telephony.nano.PersistAtomsProto.PersistAtoms parseFrom(byte[] p0) throws com.android.internal.telephony.protobuf.nano.InvalidProtocolBufferNanoException { return null; }
        public static com.android.internal.telephony.nano.PersistAtomsProto.PersistAtoms parseFrom(com.android.internal.telephony.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
    }

    public static final class PresenceNotifyEvent extends com.android.internal.telephony.protobuf.nano.ExtendableMessageNano<com.android.internal.telephony.nano.PersistAtomsProto.PresenceNotifyEvent> {
        public int carrierId;
        public int slotId;
        public int reason;
        public boolean contentBodyReceived;
        public int rcsCapsCount;
        public int mmtelCapsCount;
        public int noCapsCount;
        public int count;
        public static com.android.internal.telephony.nano.PersistAtomsProto.PresenceNotifyEvent[] emptyArray() { return null; }
        public PresenceNotifyEvent() { super(); }
        public com.android.internal.telephony.nano.PersistAtomsProto.PresenceNotifyEvent clear() { return null; }
        public void writeTo(com.android.internal.telephony.protobuf.nano.CodedOutputByteBufferNano p0) throws java.io.IOException {}
        protected int computeSerializedSize() { return 0; }
        public com.android.internal.telephony.nano.PersistAtomsProto.PresenceNotifyEvent mergeFrom(com.android.internal.telephony.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
        public static com.android.internal.telephony.nano.PersistAtomsProto.PresenceNotifyEvent parseFrom(byte[] p0) throws com.android.internal.telephony.protobuf.nano.InvalidProtocolBufferNanoException { return null; }
        public static com.android.internal.telephony.nano.PersistAtomsProto.PresenceNotifyEvent parseFrom(com.android.internal.telephony.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
    }

    public static final class RcsAcsProvisioningStats extends com.android.internal.telephony.protobuf.nano.ExtendableMessageNano<com.android.internal.telephony.nano.PersistAtomsProto.RcsAcsProvisioningStats> {
        public int carrierId;
        public int slotId;
        public int responseCode;
        public int responseType;
        public boolean isSingleRegistrationEnabled;
        public int count;
        public long stateTimerMillis;
        public static com.android.internal.telephony.nano.PersistAtomsProto.RcsAcsProvisioningStats[] emptyArray() { return null; }
        public RcsAcsProvisioningStats() { super(); }
        public com.android.internal.telephony.nano.PersistAtomsProto.RcsAcsProvisioningStats clear() { return null; }
        public void writeTo(com.android.internal.telephony.protobuf.nano.CodedOutputByteBufferNano p0) throws java.io.IOException {}
        protected int computeSerializedSize() { return 0; }
        public com.android.internal.telephony.nano.PersistAtomsProto.RcsAcsProvisioningStats mergeFrom(com.android.internal.telephony.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
        public static com.android.internal.telephony.nano.PersistAtomsProto.RcsAcsProvisioningStats parseFrom(byte[] p0) throws com.android.internal.telephony.protobuf.nano.InvalidProtocolBufferNanoException { return null; }
        public static com.android.internal.telephony.nano.PersistAtomsProto.RcsAcsProvisioningStats parseFrom(com.android.internal.telephony.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
    }

    public static final class RcsClientProvisioningStats extends com.android.internal.telephony.protobuf.nano.ExtendableMessageNano<com.android.internal.telephony.nano.PersistAtomsProto.RcsClientProvisioningStats> {
        public int carrierId;
        public int slotId;
        public int event;
        public int count;
        public static com.android.internal.telephony.nano.PersistAtomsProto.RcsClientProvisioningStats[] emptyArray() { return null; }
        public RcsClientProvisioningStats() { super(); }
        public com.android.internal.telephony.nano.PersistAtomsProto.RcsClientProvisioningStats clear() { return null; }
        public void writeTo(com.android.internal.telephony.protobuf.nano.CodedOutputByteBufferNano p0) throws java.io.IOException {}
        protected int computeSerializedSize() { return 0; }
        public com.android.internal.telephony.nano.PersistAtomsProto.RcsClientProvisioningStats mergeFrom(com.android.internal.telephony.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
        public static com.android.internal.telephony.nano.PersistAtomsProto.RcsClientProvisioningStats parseFrom(byte[] p0) throws com.android.internal.telephony.protobuf.nano.InvalidProtocolBufferNanoException { return null; }
        public static com.android.internal.telephony.nano.PersistAtomsProto.RcsClientProvisioningStats parseFrom(com.android.internal.telephony.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
    }

    public static final class SatelliteController extends com.android.internal.telephony.protobuf.nano.ExtendableMessageNano<com.android.internal.telephony.nano.PersistAtomsProto.SatelliteController> {
        public int countOfSatelliteServiceEnablementsSuccess;
        public int countOfSatelliteServiceEnablementsFail;
        public int countOfOutgoingDatagramSuccess;
        public int countOfOutgoingDatagramFail;
        public int countOfIncomingDatagramSuccess;
        public int countOfIncomingDatagramFail;
        public int countOfDatagramTypeSosSmsSuccess;
        public int countOfDatagramTypeSosSmsFail;
        public int countOfDatagramTypeLocationSharingSuccess;
        public int countOfDatagramTypeLocationSharingFail;
        public int countOfProvisionSuccess;
        public int countOfProvisionFail;
        public int countOfDeprovisionSuccess;
        public int countOfDeprovisionFail;
        public int totalServiceUptimeSec;
        public int totalBatteryConsumptionPercent;
        public int totalBatteryChargedTimeSec;
        public static com.android.internal.telephony.nano.PersistAtomsProto.SatelliteController[] emptyArray() { return null; }
        public SatelliteController() { super(); }
        public com.android.internal.telephony.nano.PersistAtomsProto.SatelliteController clear() { return null; }
        public void writeTo(com.android.internal.telephony.protobuf.nano.CodedOutputByteBufferNano p0) throws java.io.IOException {}
        protected int computeSerializedSize() { return 0; }
        public com.android.internal.telephony.nano.PersistAtomsProto.SatelliteController mergeFrom(com.android.internal.telephony.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
        public static com.android.internal.telephony.nano.PersistAtomsProto.SatelliteController parseFrom(byte[] p0) throws com.android.internal.telephony.protobuf.nano.InvalidProtocolBufferNanoException { return null; }
        public static com.android.internal.telephony.nano.PersistAtomsProto.SatelliteController parseFrom(com.android.internal.telephony.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
    }

    public static final class SatelliteIncomingDatagram extends com.android.internal.telephony.protobuf.nano.ExtendableMessageNano<com.android.internal.telephony.nano.PersistAtomsProto.SatelliteIncomingDatagram> {
        public int resultCode;
        public int datagramSizeBytes;
        public long datagramTransferTimeMillis;
        public static com.android.internal.telephony.nano.PersistAtomsProto.SatelliteIncomingDatagram[] emptyArray() { return null; }
        public SatelliteIncomingDatagram() { super(); }
        public com.android.internal.telephony.nano.PersistAtomsProto.SatelliteIncomingDatagram clear() { return null; }
        public void writeTo(com.android.internal.telephony.protobuf.nano.CodedOutputByteBufferNano p0) throws java.io.IOException {}
        protected int computeSerializedSize() { return 0; }
        public com.android.internal.telephony.nano.PersistAtomsProto.SatelliteIncomingDatagram mergeFrom(com.android.internal.telephony.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
        public static com.android.internal.telephony.nano.PersistAtomsProto.SatelliteIncomingDatagram parseFrom(byte[] p0) throws com.android.internal.telephony.protobuf.nano.InvalidProtocolBufferNanoException { return null; }
        public static com.android.internal.telephony.nano.PersistAtomsProto.SatelliteIncomingDatagram parseFrom(com.android.internal.telephony.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
    }

    public static final class SatelliteOutgoingDatagram extends com.android.internal.telephony.protobuf.nano.ExtendableMessageNano<com.android.internal.telephony.nano.PersistAtomsProto.SatelliteOutgoingDatagram> {
        public int datagramType;
        public int resultCode;
        public int datagramSizeBytes;
        public long datagramTransferTimeMillis;
        public static com.android.internal.telephony.nano.PersistAtomsProto.SatelliteOutgoingDatagram[] emptyArray() { return null; }
        public SatelliteOutgoingDatagram() { super(); }
        public com.android.internal.telephony.nano.PersistAtomsProto.SatelliteOutgoingDatagram clear() { return null; }
        public void writeTo(com.android.internal.telephony.protobuf.nano.CodedOutputByteBufferNano p0) throws java.io.IOException {}
        protected int computeSerializedSize() { return 0; }
        public com.android.internal.telephony.nano.PersistAtomsProto.SatelliteOutgoingDatagram mergeFrom(com.android.internal.telephony.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
        public static com.android.internal.telephony.nano.PersistAtomsProto.SatelliteOutgoingDatagram parseFrom(byte[] p0) throws com.android.internal.telephony.protobuf.nano.InvalidProtocolBufferNanoException { return null; }
        public static com.android.internal.telephony.nano.PersistAtomsProto.SatelliteOutgoingDatagram parseFrom(com.android.internal.telephony.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
    }

    public static final class SatelliteProvision extends com.android.internal.telephony.protobuf.nano.ExtendableMessageNano<com.android.internal.telephony.nano.PersistAtomsProto.SatelliteProvision> {
        public int resultCode;
        public int provisioningTimeSec;
        public boolean isProvisionRequest;
        public boolean isCanceled;
        public static com.android.internal.telephony.nano.PersistAtomsProto.SatelliteProvision[] emptyArray() { return null; }
        public SatelliteProvision() { super(); }
        public com.android.internal.telephony.nano.PersistAtomsProto.SatelliteProvision clear() { return null; }
        public void writeTo(com.android.internal.telephony.protobuf.nano.CodedOutputByteBufferNano p0) throws java.io.IOException {}
        protected int computeSerializedSize() { return 0; }
        public com.android.internal.telephony.nano.PersistAtomsProto.SatelliteProvision mergeFrom(com.android.internal.telephony.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
        public static com.android.internal.telephony.nano.PersistAtomsProto.SatelliteProvision parseFrom(byte[] p0) throws com.android.internal.telephony.protobuf.nano.InvalidProtocolBufferNanoException { return null; }
        public static com.android.internal.telephony.nano.PersistAtomsProto.SatelliteProvision parseFrom(com.android.internal.telephony.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
    }

    public static final class SatelliteSession extends com.android.internal.telephony.protobuf.nano.ExtendableMessageNano<com.android.internal.telephony.nano.PersistAtomsProto.SatelliteSession> {
        public int satelliteServiceInitializationResult;
        public int satelliteTechnology;
        public int count;
        public static com.android.internal.telephony.nano.PersistAtomsProto.SatelliteSession[] emptyArray() { return null; }
        public SatelliteSession() { super(); }
        public com.android.internal.telephony.nano.PersistAtomsProto.SatelliteSession clear() { return null; }
        public void writeTo(com.android.internal.telephony.protobuf.nano.CodedOutputByteBufferNano p0) throws java.io.IOException {}
        protected int computeSerializedSize() { return 0; }
        public com.android.internal.telephony.nano.PersistAtomsProto.SatelliteSession mergeFrom(com.android.internal.telephony.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
        public static com.android.internal.telephony.nano.PersistAtomsProto.SatelliteSession parseFrom(byte[] p0) throws com.android.internal.telephony.protobuf.nano.InvalidProtocolBufferNanoException { return null; }
        public static com.android.internal.telephony.nano.PersistAtomsProto.SatelliteSession parseFrom(com.android.internal.telephony.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
    }

    public static final class SatelliteSosMessageRecommender extends com.android.internal.telephony.protobuf.nano.ExtendableMessageNano<com.android.internal.telephony.nano.PersistAtomsProto.SatelliteSosMessageRecommender> {
        public boolean isDisplaySosMessageSent;
        public int countOfTimerStarted;
        public boolean isImsRegistered;
        public int cellularServiceState;
        public int count;
        public static com.android.internal.telephony.nano.PersistAtomsProto.SatelliteSosMessageRecommender[] emptyArray() { return null; }
        public SatelliteSosMessageRecommender() { super(); }
        public com.android.internal.telephony.nano.PersistAtomsProto.SatelliteSosMessageRecommender clear() { return null; }
        public void writeTo(com.android.internal.telephony.protobuf.nano.CodedOutputByteBufferNano p0) throws java.io.IOException {}
        protected int computeSerializedSize() { return 0; }
        public com.android.internal.telephony.nano.PersistAtomsProto.SatelliteSosMessageRecommender mergeFrom(com.android.internal.telephony.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
        public static com.android.internal.telephony.nano.PersistAtomsProto.SatelliteSosMessageRecommender parseFrom(byte[] p0) throws com.android.internal.telephony.protobuf.nano.InvalidProtocolBufferNanoException { return null; }
        public static com.android.internal.telephony.nano.PersistAtomsProto.SatelliteSosMessageRecommender parseFrom(com.android.internal.telephony.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
    }

    public static final class SipDelegateStats extends com.android.internal.telephony.protobuf.nano.ExtendableMessageNano<com.android.internal.telephony.nano.PersistAtomsProto.SipDelegateStats> {
        public int dimension;
        public int carrierId;
        public int slotId;
        public int destroyReason;
        public long uptimeMillis;
        public static com.android.internal.telephony.nano.PersistAtomsProto.SipDelegateStats[] emptyArray() { return null; }
        public SipDelegateStats() { super(); }
        public com.android.internal.telephony.nano.PersistAtomsProto.SipDelegateStats clear() { return null; }
        public void writeTo(com.android.internal.telephony.protobuf.nano.CodedOutputByteBufferNano p0) throws java.io.IOException {}
        protected int computeSerializedSize() { return 0; }
        public com.android.internal.telephony.nano.PersistAtomsProto.SipDelegateStats mergeFrom(com.android.internal.telephony.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
        public static com.android.internal.telephony.nano.PersistAtomsProto.SipDelegateStats parseFrom(byte[] p0) throws com.android.internal.telephony.protobuf.nano.InvalidProtocolBufferNanoException { return null; }
        public static com.android.internal.telephony.nano.PersistAtomsProto.SipDelegateStats parseFrom(com.android.internal.telephony.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
    }

    public static final class SipMessageResponse extends com.android.internal.telephony.protobuf.nano.ExtendableMessageNano<com.android.internal.telephony.nano.PersistAtomsProto.SipMessageResponse> {
        public int carrierId;
        public int slotId;
        public int sipMessageMethod;
        public int sipMessageResponse;
        public int sipMessageDirection;
        public int messageError;
        public int count;
        public static com.android.internal.telephony.nano.PersistAtomsProto.SipMessageResponse[] emptyArray() { return null; }
        public SipMessageResponse() { super(); }
        public com.android.internal.telephony.nano.PersistAtomsProto.SipMessageResponse clear() { return null; }
        public void writeTo(com.android.internal.telephony.protobuf.nano.CodedOutputByteBufferNano p0) throws java.io.IOException {}
        protected int computeSerializedSize() { return 0; }
        public com.android.internal.telephony.nano.PersistAtomsProto.SipMessageResponse mergeFrom(com.android.internal.telephony.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
        public static com.android.internal.telephony.nano.PersistAtomsProto.SipMessageResponse parseFrom(byte[] p0) throws com.android.internal.telephony.protobuf.nano.InvalidProtocolBufferNanoException { return null; }
        public static com.android.internal.telephony.nano.PersistAtomsProto.SipMessageResponse parseFrom(com.android.internal.telephony.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
    }

    public static final class SipTransportFeatureTagStats extends com.android.internal.telephony.protobuf.nano.ExtendableMessageNano<com.android.internal.telephony.nano.PersistAtomsProto.SipTransportFeatureTagStats> {
        public int carrierId;
        public int slotId;
        public int featureTagName;
        public int sipTransportDeniedReason;
        public int sipTransportDeregisteredReason;
        public long associatedMillis;
        public static com.android.internal.telephony.nano.PersistAtomsProto.SipTransportFeatureTagStats[] emptyArray() { return null; }
        public SipTransportFeatureTagStats() { super(); }
        public com.android.internal.telephony.nano.PersistAtomsProto.SipTransportFeatureTagStats clear() { return null; }
        public void writeTo(com.android.internal.telephony.protobuf.nano.CodedOutputByteBufferNano p0) throws java.io.IOException {}
        protected int computeSerializedSize() { return 0; }
        public com.android.internal.telephony.nano.PersistAtomsProto.SipTransportFeatureTagStats mergeFrom(com.android.internal.telephony.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
        public static com.android.internal.telephony.nano.PersistAtomsProto.SipTransportFeatureTagStats parseFrom(byte[] p0) throws com.android.internal.telephony.protobuf.nano.InvalidProtocolBufferNanoException { return null; }
        public static com.android.internal.telephony.nano.PersistAtomsProto.SipTransportFeatureTagStats parseFrom(com.android.internal.telephony.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
    }

    public static final class SipTransportSession extends com.android.internal.telephony.protobuf.nano.ExtendableMessageNano<com.android.internal.telephony.nano.PersistAtomsProto.SipTransportSession> {
        public int carrierId;
        public int slotId;
        public int sessionMethod;
        public int sipMessageDirection;
        public int sipResponse;
        public int sessionCount;
        public int endedGracefullyCount;
        public boolean isEndedGracefully;
        public static com.android.internal.telephony.nano.PersistAtomsProto.SipTransportSession[] emptyArray() { return null; }
        public SipTransportSession() { super(); }
        public com.android.internal.telephony.nano.PersistAtomsProto.SipTransportSession clear() { return null; }
        public void writeTo(com.android.internal.telephony.protobuf.nano.CodedOutputByteBufferNano p0) throws java.io.IOException {}
        protected int computeSerializedSize() { return 0; }
        public com.android.internal.telephony.nano.PersistAtomsProto.SipTransportSession mergeFrom(com.android.internal.telephony.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
        public static com.android.internal.telephony.nano.PersistAtomsProto.SipTransportSession parseFrom(byte[] p0) throws com.android.internal.telephony.protobuf.nano.InvalidProtocolBufferNanoException { return null; }
        public static com.android.internal.telephony.nano.PersistAtomsProto.SipTransportSession parseFrom(com.android.internal.telephony.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
    }

    public static final class UceEventStats extends com.android.internal.telephony.protobuf.nano.ExtendableMessageNano<com.android.internal.telephony.nano.PersistAtomsProto.UceEventStats> {
        public int carrierId;
        public int slotId;
        public int type;
        public boolean successful;
        public int commandCode;
        public int networkResponse;
        public int count;
        public static com.android.internal.telephony.nano.PersistAtomsProto.UceEventStats[] emptyArray() { return null; }
        public UceEventStats() { super(); }
        public com.android.internal.telephony.nano.PersistAtomsProto.UceEventStats clear() { return null; }
        public void writeTo(com.android.internal.telephony.protobuf.nano.CodedOutputByteBufferNano p0) throws java.io.IOException {}
        protected int computeSerializedSize() { return 0; }
        public com.android.internal.telephony.nano.PersistAtomsProto.UceEventStats mergeFrom(com.android.internal.telephony.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
        public static com.android.internal.telephony.nano.PersistAtomsProto.UceEventStats parseFrom(byte[] p0) throws com.android.internal.telephony.protobuf.nano.InvalidProtocolBufferNanoException { return null; }
        public static com.android.internal.telephony.nano.PersistAtomsProto.UceEventStats parseFrom(com.android.internal.telephony.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
    }

    public static final class UnmeteredNetworks extends com.android.internal.telephony.protobuf.nano.ExtendableMessageNano<com.android.internal.telephony.nano.PersistAtomsProto.UnmeteredNetworks> {
        public int phoneId;
        public int carrierId;
        public long unmeteredNetworksBitmask;
        public static com.android.internal.telephony.nano.PersistAtomsProto.UnmeteredNetworks[] emptyArray() { return null; }
        public UnmeteredNetworks() { super(); }
        public com.android.internal.telephony.nano.PersistAtomsProto.UnmeteredNetworks clear() { return null; }
        public void writeTo(com.android.internal.telephony.protobuf.nano.CodedOutputByteBufferNano p0) throws java.io.IOException {}
        protected int computeSerializedSize() { return 0; }
        public com.android.internal.telephony.nano.PersistAtomsProto.UnmeteredNetworks mergeFrom(com.android.internal.telephony.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
        public static com.android.internal.telephony.nano.PersistAtomsProto.UnmeteredNetworks parseFrom(byte[] p0) throws com.android.internal.telephony.protobuf.nano.InvalidProtocolBufferNanoException { return null; }
        public static com.android.internal.telephony.nano.PersistAtomsProto.UnmeteredNetworks parseFrom(com.android.internal.telephony.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
    }

    public static final class VoiceCallRatUsage extends com.android.internal.telephony.protobuf.nano.ExtendableMessageNano<com.android.internal.telephony.nano.PersistAtomsProto.VoiceCallRatUsage> {
        public int carrierId;
        public int rat;
        public long totalDurationMillis;
        public long callCount;
        public static com.android.internal.telephony.nano.PersistAtomsProto.VoiceCallRatUsage[] emptyArray() { return null; }
        public VoiceCallRatUsage() { super(); }
        public com.android.internal.telephony.nano.PersistAtomsProto.VoiceCallRatUsage clear() { return null; }
        public void writeTo(com.android.internal.telephony.protobuf.nano.CodedOutputByteBufferNano p0) throws java.io.IOException {}
        protected int computeSerializedSize() { return 0; }
        public com.android.internal.telephony.nano.PersistAtomsProto.VoiceCallRatUsage mergeFrom(com.android.internal.telephony.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
        public static com.android.internal.telephony.nano.PersistAtomsProto.VoiceCallRatUsage parseFrom(byte[] p0) throws com.android.internal.telephony.protobuf.nano.InvalidProtocolBufferNanoException { return null; }
        public static com.android.internal.telephony.nano.PersistAtomsProto.VoiceCallRatUsage parseFrom(com.android.internal.telephony.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
    }

    public static final class VoiceCallSession extends com.android.internal.telephony.protobuf.nano.ExtendableMessageNano<com.android.internal.telephony.nano.PersistAtomsProto.VoiceCallSession> {
        public int bearerAtStart;
        public int bearerAtEnd;
        public int direction;
        public boolean setupFailed;
        public int disconnectReasonCode;
        public int disconnectExtraCode;
        public java.lang.String disconnectExtraMessage;
        public int ratAtStart;
        public int ratAtEnd;
        public long ratSwitchCount;
        public long codecBitmask;
        public int concurrentCallCountAtStart;
        public int concurrentCallCountAtEnd;
        public int simSlotIndex;
        public boolean isMultiSim;
        public boolean isEsim;
        public int carrierId;
        public boolean srvccCompleted;
        public long srvccFailureCount;
        public long srvccCancellationCount;
        public boolean rttEnabled;
        public boolean isEmergency;
        public boolean isRoaming;
        public int signalStrengthAtEnd;
        public int bandAtEnd;
        public int setupDurationMillis;
        public int mainCodecQuality;
        public boolean videoEnabled;
        public int ratAtConnected;
        public boolean isMultiparty;
        public int callDuration;
        public int lastKnownRat;
        public int foldState;
        public long setupBeginMillis;
        public static com.android.internal.telephony.nano.PersistAtomsProto.VoiceCallSession[] emptyArray() { return null; }
        public VoiceCallSession() { super(); }
        public com.android.internal.telephony.nano.PersistAtomsProto.VoiceCallSession clear() { return null; }
        public void writeTo(com.android.internal.telephony.protobuf.nano.CodedOutputByteBufferNano p0) throws java.io.IOException {}
        protected int computeSerializedSize() { return 0; }
        public com.android.internal.telephony.nano.PersistAtomsProto.VoiceCallSession mergeFrom(com.android.internal.telephony.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
        public static com.android.internal.telephony.nano.PersistAtomsProto.VoiceCallSession parseFrom(byte[] p0) throws com.android.internal.telephony.protobuf.nano.InvalidProtocolBufferNanoException { return null; }
        public static com.android.internal.telephony.nano.PersistAtomsProto.VoiceCallSession parseFrom(com.android.internal.telephony.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
    }
}
