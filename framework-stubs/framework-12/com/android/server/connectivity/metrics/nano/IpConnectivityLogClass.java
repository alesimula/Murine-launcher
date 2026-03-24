package com.android.server.connectivity.metrics.nano;

public interface IpConnectivityLogClass {
    public static final int UNKNOWN = 0;
    public static final int BLUETOOTH = 1;
    public static final int CELLULAR = 2;
    public static final int ETHERNET = 3;
    public static final int WIFI = 4;
    public static final int WIFI_P2P = 7;
    public static final int WIFI_NAN = 8;
    public static final int LOWPAN = 9;
    public static final int NONE = 5;
    public static final int MULTIPLE = 6;

    public static final class ApfProgramEvent extends com.android.framework.protobuf.nano.MessageNano {
        private static volatile com.android.server.connectivity.metrics.nano.IpConnectivityLogClass.ApfProgramEvent[] _emptyArray;
        public long lifetime;
        public long effectiveLifetime;
        public int filteredRas;
        public int currentRas;
        public int programLength;
        public boolean dropMulticast;
        public boolean hasIpv4Addr;
        public static com.android.server.connectivity.metrics.nano.IpConnectivityLogClass.ApfProgramEvent[] emptyArray() { return null; }
        public ApfProgramEvent() { super(); }
        public com.android.server.connectivity.metrics.nano.IpConnectivityLogClass.ApfProgramEvent clear() { return null; }
        public void writeTo(com.android.framework.protobuf.nano.CodedOutputByteBufferNano p0) throws java.io.IOException {}
        protected int computeSerializedSize() { return 0; }
        public com.android.server.connectivity.metrics.nano.IpConnectivityLogClass.ApfProgramEvent mergeFrom(com.android.framework.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
        public static com.android.server.connectivity.metrics.nano.IpConnectivityLogClass.ApfProgramEvent parseFrom(byte[] p0) throws com.android.framework.protobuf.nano.InvalidProtocolBufferNanoException { return null; }
        public static com.android.server.connectivity.metrics.nano.IpConnectivityLogClass.ApfProgramEvent parseFrom(com.android.framework.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
    }

    public static final class ApfStatistics extends com.android.framework.protobuf.nano.MessageNano {
        private static volatile com.android.server.connectivity.metrics.nano.IpConnectivityLogClass.ApfStatistics[] _emptyArray;
        public long durationMs;
        public int receivedRas;
        public int matchingRas;
        public int droppedRas;
        public int zeroLifetimeRas;
        public int parseErrors;
        public int programUpdates;
        public int maxProgramSize;
        public int programUpdatesAll;
        public int programUpdatesAllowingMulticast;
        public int totalPacketProcessed;
        public int totalPacketDropped;
        public com.android.server.connectivity.metrics.nano.IpConnectivityLogClass.Pair[] hardwareCounters;
        public static com.android.server.connectivity.metrics.nano.IpConnectivityLogClass.ApfStatistics[] emptyArray() { return null; }
        public ApfStatistics() { super(); }
        public com.android.server.connectivity.metrics.nano.IpConnectivityLogClass.ApfStatistics clear() { return null; }
        public void writeTo(com.android.framework.protobuf.nano.CodedOutputByteBufferNano p0) throws java.io.IOException {}
        protected int computeSerializedSize() { return 0; }
        public com.android.server.connectivity.metrics.nano.IpConnectivityLogClass.ApfStatistics mergeFrom(com.android.framework.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
        public static com.android.server.connectivity.metrics.nano.IpConnectivityLogClass.ApfStatistics parseFrom(byte[] p0) throws com.android.framework.protobuf.nano.InvalidProtocolBufferNanoException { return null; }
        public static com.android.server.connectivity.metrics.nano.IpConnectivityLogClass.ApfStatistics parseFrom(com.android.framework.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
    }

    public static final class ConnectStatistics extends com.android.framework.protobuf.nano.MessageNano {
        private static volatile com.android.server.connectivity.metrics.nano.IpConnectivityLogClass.ConnectStatistics[] _emptyArray;
        public int connectCount;
        public int connectBlockingCount;
        public int ipv6AddrCount;
        public int[] latenciesMs;
        public int[] nonBlockingLatenciesMs;
        public com.android.server.connectivity.metrics.nano.IpConnectivityLogClass.Pair[] errnosCounters;
        public static com.android.server.connectivity.metrics.nano.IpConnectivityLogClass.ConnectStatistics[] emptyArray() { return null; }
        public ConnectStatistics() { super(); }
        public com.android.server.connectivity.metrics.nano.IpConnectivityLogClass.ConnectStatistics clear() { return null; }
        public void writeTo(com.android.framework.protobuf.nano.CodedOutputByteBufferNano p0) throws java.io.IOException {}
        protected int computeSerializedSize() { return 0; }
        public com.android.server.connectivity.metrics.nano.IpConnectivityLogClass.ConnectStatistics mergeFrom(com.android.framework.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
        public static com.android.server.connectivity.metrics.nano.IpConnectivityLogClass.ConnectStatistics parseFrom(byte[] p0) throws com.android.framework.protobuf.nano.InvalidProtocolBufferNanoException { return null; }
        public static com.android.server.connectivity.metrics.nano.IpConnectivityLogClass.ConnectStatistics parseFrom(com.android.framework.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
    }

    public static final class DHCPEvent extends com.android.framework.protobuf.nano.MessageNano {
        public static final int STATE_TRANSITION_FIELD_NUMBER = 2;
        public static final int ERROR_CODE_FIELD_NUMBER = 3;
        private int valueCase_;
        private java.lang.Object value_;
        private static volatile com.android.server.connectivity.metrics.nano.IpConnectivityLogClass.DHCPEvent[] _emptyArray;
        public java.lang.String ifName;
        public int durationMs;
        public int getValueCase() { return 0; }
        public com.android.server.connectivity.metrics.nano.IpConnectivityLogClass.DHCPEvent clearValue() { return null; }
        public static com.android.server.connectivity.metrics.nano.IpConnectivityLogClass.DHCPEvent[] emptyArray() { return null; }
        public boolean hasStateTransition() { return false; }
        public java.lang.String getStateTransition() { return null; }
        public com.android.server.connectivity.metrics.nano.IpConnectivityLogClass.DHCPEvent setStateTransition(java.lang.String p0) { return null; }
        public boolean hasErrorCode() { return false; }
        public int getErrorCode() { return 0; }
        public com.android.server.connectivity.metrics.nano.IpConnectivityLogClass.DHCPEvent setErrorCode(int p0) { return null; }
        public DHCPEvent() { super(); }
        public com.android.server.connectivity.metrics.nano.IpConnectivityLogClass.DHCPEvent clear() { return null; }
        public void writeTo(com.android.framework.protobuf.nano.CodedOutputByteBufferNano p0) throws java.io.IOException {}
        protected int computeSerializedSize() { return 0; }
        public com.android.server.connectivity.metrics.nano.IpConnectivityLogClass.DHCPEvent mergeFrom(com.android.framework.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
        public static com.android.server.connectivity.metrics.nano.IpConnectivityLogClass.DHCPEvent parseFrom(byte[] p0) throws com.android.framework.protobuf.nano.InvalidProtocolBufferNanoException { return null; }
        public static com.android.server.connectivity.metrics.nano.IpConnectivityLogClass.DHCPEvent parseFrom(com.android.framework.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
    }

    public static final class DNSLatencies extends com.android.framework.protobuf.nano.MessageNano {
        private static volatile com.android.server.connectivity.metrics.nano.IpConnectivityLogClass.DNSLatencies[] _emptyArray;
        public int type;
        public int returnCode;
        public int queryCount;
        public int aCount;
        public int aaaaCount;
        public int[] latenciesMs;
        public static com.android.server.connectivity.metrics.nano.IpConnectivityLogClass.DNSLatencies[] emptyArray() { return null; }
        public DNSLatencies() { super(); }
        public com.android.server.connectivity.metrics.nano.IpConnectivityLogClass.DNSLatencies clear() { return null; }
        public void writeTo(com.android.framework.protobuf.nano.CodedOutputByteBufferNano p0) throws java.io.IOException {}
        protected int computeSerializedSize() { return 0; }
        public com.android.server.connectivity.metrics.nano.IpConnectivityLogClass.DNSLatencies mergeFrom(com.android.framework.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
        public static com.android.server.connectivity.metrics.nano.IpConnectivityLogClass.DNSLatencies parseFrom(byte[] p0) throws com.android.framework.protobuf.nano.InvalidProtocolBufferNanoException { return null; }
        public static com.android.server.connectivity.metrics.nano.IpConnectivityLogClass.DNSLatencies parseFrom(com.android.framework.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
    }

    public static final class DNSLookupBatch extends com.android.framework.protobuf.nano.MessageNano {
        private static volatile com.android.server.connectivity.metrics.nano.IpConnectivityLogClass.DNSLookupBatch[] _emptyArray;
        public int[] latenciesMs;
        public long getaddrinfoQueryCount;
        public long gethostbynameQueryCount;
        public long getaddrinfoErrorCount;
        public long gethostbynameErrorCount;
        public com.android.server.connectivity.metrics.nano.IpConnectivityLogClass.Pair[] getaddrinfoErrors;
        public com.android.server.connectivity.metrics.nano.IpConnectivityLogClass.Pair[] gethostbynameErrors;
        public com.android.server.connectivity.metrics.nano.IpConnectivityLogClass.NetworkId networkId;
        public int[] eventTypes;
        public int[] returnCodes;
        public static com.android.server.connectivity.metrics.nano.IpConnectivityLogClass.DNSLookupBatch[] emptyArray() { return null; }
        public DNSLookupBatch() { super(); }
        public com.android.server.connectivity.metrics.nano.IpConnectivityLogClass.DNSLookupBatch clear() { return null; }
        public void writeTo(com.android.framework.protobuf.nano.CodedOutputByteBufferNano p0) throws java.io.IOException {}
        protected int computeSerializedSize() { return 0; }
        public com.android.server.connectivity.metrics.nano.IpConnectivityLogClass.DNSLookupBatch mergeFrom(com.android.framework.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
        public static com.android.server.connectivity.metrics.nano.IpConnectivityLogClass.DNSLookupBatch parseFrom(byte[] p0) throws com.android.framework.protobuf.nano.InvalidProtocolBufferNanoException { return null; }
        public static com.android.server.connectivity.metrics.nano.IpConnectivityLogClass.DNSLookupBatch parseFrom(com.android.framework.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
    }

    public static final class DefaultNetworkEvent extends com.android.framework.protobuf.nano.MessageNano {
        public static final int UNKNOWN = 0;
        public static final int OUTSCORED = 1;
        public static final int INVALIDATION = 2;
        public static final int DISCONNECT = 3;
        public static final int NONE = 0;
        public static final int IPV4 = 1;
        public static final int IPV6 = 2;
        public static final int DUAL = 3;
        private static volatile com.android.server.connectivity.metrics.nano.IpConnectivityLogClass.DefaultNetworkEvent[] _emptyArray;
        public long defaultNetworkDurationMs;
        public long validationDurationMs;
        public long initialScore;
        public long finalScore;
        public int ipSupport;
        public int previousDefaultNetworkLinkLayer;
        public com.android.server.connectivity.metrics.nano.IpConnectivityLogClass.NetworkId networkId;
        public com.android.server.connectivity.metrics.nano.IpConnectivityLogClass.NetworkId previousNetworkId;
        public int previousNetworkIpSupport;
        public int[] transportTypes;
        public long noDefaultNetworkDurationMs;
        public static com.android.server.connectivity.metrics.nano.IpConnectivityLogClass.DefaultNetworkEvent[] emptyArray() { return null; }
        public DefaultNetworkEvent() { super(); }
        public com.android.server.connectivity.metrics.nano.IpConnectivityLogClass.DefaultNetworkEvent clear() { return null; }
        public void writeTo(com.android.framework.protobuf.nano.CodedOutputByteBufferNano p0) throws java.io.IOException {}
        protected int computeSerializedSize() { return 0; }
        public com.android.server.connectivity.metrics.nano.IpConnectivityLogClass.DefaultNetworkEvent mergeFrom(com.android.framework.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
        public static com.android.server.connectivity.metrics.nano.IpConnectivityLogClass.DefaultNetworkEvent parseFrom(byte[] p0) throws com.android.framework.protobuf.nano.InvalidProtocolBufferNanoException { return null; }
        public static com.android.server.connectivity.metrics.nano.IpConnectivityLogClass.DefaultNetworkEvent parseFrom(com.android.framework.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
    }

    public static final class IpConnectivityEvent extends com.android.framework.protobuf.nano.MessageNano {
        public static final int DEFAULT_NETWORK_EVENT_FIELD_NUMBER = 2;
        public static final int IP_REACHABILITY_EVENT_FIELD_NUMBER = 3;
        public static final int NETWORK_EVENT_FIELD_NUMBER = 4;
        public static final int DNS_LOOKUP_BATCH_FIELD_NUMBER = 5;
        public static final int DNS_LATENCIES_FIELD_NUMBER = 13;
        public static final int CONNECT_STATISTICS_FIELD_NUMBER = 14;
        public static final int DHCP_EVENT_FIELD_NUMBER = 6;
        public static final int IP_PROVISIONING_EVENT_FIELD_NUMBER = 7;
        public static final int VALIDATION_PROBE_EVENT_FIELD_NUMBER = 8;
        public static final int APF_PROGRAM_EVENT_FIELD_NUMBER = 9;
        public static final int APF_STATISTICS_FIELD_NUMBER = 10;
        public static final int RA_EVENT_FIELD_NUMBER = 11;
        public static final int NETWORK_STATS_FIELD_NUMBER = 19;
        public static final int WAKEUP_STATS_FIELD_NUMBER = 20;
        private int eventCase_;
        private java.lang.Object event_;
        private static volatile com.android.server.connectivity.metrics.nano.IpConnectivityLogClass.IpConnectivityEvent[] _emptyArray;
        public long timeMs;
        public int linkLayer;
        public int networkId;
        public java.lang.String ifName;
        public long transports;
        public int getEventCase() { return 0; }
        public com.android.server.connectivity.metrics.nano.IpConnectivityLogClass.IpConnectivityEvent clearEvent() { return null; }
        public static com.android.server.connectivity.metrics.nano.IpConnectivityLogClass.IpConnectivityEvent[] emptyArray() { return null; }
        public boolean hasDefaultNetworkEvent() { return false; }
        public com.android.server.connectivity.metrics.nano.IpConnectivityLogClass.DefaultNetworkEvent getDefaultNetworkEvent() { return null; }
        public com.android.server.connectivity.metrics.nano.IpConnectivityLogClass.IpConnectivityEvent setDefaultNetworkEvent(com.android.server.connectivity.metrics.nano.IpConnectivityLogClass.DefaultNetworkEvent p0) { return null; }
        public boolean hasIpReachabilityEvent() { return false; }
        public com.android.server.connectivity.metrics.nano.IpConnectivityLogClass.IpReachabilityEvent getIpReachabilityEvent() { return null; }
        public com.android.server.connectivity.metrics.nano.IpConnectivityLogClass.IpConnectivityEvent setIpReachabilityEvent(com.android.server.connectivity.metrics.nano.IpConnectivityLogClass.IpReachabilityEvent p0) { return null; }
        public boolean hasNetworkEvent() { return false; }
        public com.android.server.connectivity.metrics.nano.IpConnectivityLogClass.NetworkEvent getNetworkEvent() { return null; }
        public com.android.server.connectivity.metrics.nano.IpConnectivityLogClass.IpConnectivityEvent setNetworkEvent(com.android.server.connectivity.metrics.nano.IpConnectivityLogClass.NetworkEvent p0) { return null; }
        public boolean hasDnsLookupBatch() { return false; }
        public com.android.server.connectivity.metrics.nano.IpConnectivityLogClass.DNSLookupBatch getDnsLookupBatch() { return null; }
        public com.android.server.connectivity.metrics.nano.IpConnectivityLogClass.IpConnectivityEvent setDnsLookupBatch(com.android.server.connectivity.metrics.nano.IpConnectivityLogClass.DNSLookupBatch p0) { return null; }
        public boolean hasDnsLatencies() { return false; }
        public com.android.server.connectivity.metrics.nano.IpConnectivityLogClass.DNSLatencies getDnsLatencies() { return null; }
        public com.android.server.connectivity.metrics.nano.IpConnectivityLogClass.IpConnectivityEvent setDnsLatencies(com.android.server.connectivity.metrics.nano.IpConnectivityLogClass.DNSLatencies p0) { return null; }
        public boolean hasConnectStatistics() { return false; }
        public com.android.server.connectivity.metrics.nano.IpConnectivityLogClass.ConnectStatistics getConnectStatistics() { return null; }
        public com.android.server.connectivity.metrics.nano.IpConnectivityLogClass.IpConnectivityEvent setConnectStatistics(com.android.server.connectivity.metrics.nano.IpConnectivityLogClass.ConnectStatistics p0) { return null; }
        public boolean hasDhcpEvent() { return false; }
        public com.android.server.connectivity.metrics.nano.IpConnectivityLogClass.DHCPEvent getDhcpEvent() { return null; }
        public com.android.server.connectivity.metrics.nano.IpConnectivityLogClass.IpConnectivityEvent setDhcpEvent(com.android.server.connectivity.metrics.nano.IpConnectivityLogClass.DHCPEvent p0) { return null; }
        public boolean hasIpProvisioningEvent() { return false; }
        public com.android.server.connectivity.metrics.nano.IpConnectivityLogClass.IpProvisioningEvent getIpProvisioningEvent() { return null; }
        public com.android.server.connectivity.metrics.nano.IpConnectivityLogClass.IpConnectivityEvent setIpProvisioningEvent(com.android.server.connectivity.metrics.nano.IpConnectivityLogClass.IpProvisioningEvent p0) { return null; }
        public boolean hasValidationProbeEvent() { return false; }
        public com.android.server.connectivity.metrics.nano.IpConnectivityLogClass.ValidationProbeEvent getValidationProbeEvent() { return null; }
        public com.android.server.connectivity.metrics.nano.IpConnectivityLogClass.IpConnectivityEvent setValidationProbeEvent(com.android.server.connectivity.metrics.nano.IpConnectivityLogClass.ValidationProbeEvent p0) { return null; }
        public boolean hasApfProgramEvent() { return false; }
        public com.android.server.connectivity.metrics.nano.IpConnectivityLogClass.ApfProgramEvent getApfProgramEvent() { return null; }
        public com.android.server.connectivity.metrics.nano.IpConnectivityLogClass.IpConnectivityEvent setApfProgramEvent(com.android.server.connectivity.metrics.nano.IpConnectivityLogClass.ApfProgramEvent p0) { return null; }
        public boolean hasApfStatistics() { return false; }
        public com.android.server.connectivity.metrics.nano.IpConnectivityLogClass.ApfStatistics getApfStatistics() { return null; }
        public com.android.server.connectivity.metrics.nano.IpConnectivityLogClass.IpConnectivityEvent setApfStatistics(com.android.server.connectivity.metrics.nano.IpConnectivityLogClass.ApfStatistics p0) { return null; }
        public boolean hasRaEvent() { return false; }
        public com.android.server.connectivity.metrics.nano.IpConnectivityLogClass.RaEvent getRaEvent() { return null; }
        public com.android.server.connectivity.metrics.nano.IpConnectivityLogClass.IpConnectivityEvent setRaEvent(com.android.server.connectivity.metrics.nano.IpConnectivityLogClass.RaEvent p0) { return null; }
        public boolean hasNetworkStats() { return false; }
        public com.android.server.connectivity.metrics.nano.IpConnectivityLogClass.NetworkStats getNetworkStats() { return null; }
        public com.android.server.connectivity.metrics.nano.IpConnectivityLogClass.IpConnectivityEvent setNetworkStats(com.android.server.connectivity.metrics.nano.IpConnectivityLogClass.NetworkStats p0) { return null; }
        public boolean hasWakeupStats() { return false; }
        public com.android.server.connectivity.metrics.nano.IpConnectivityLogClass.WakeupStats getWakeupStats() { return null; }
        public com.android.server.connectivity.metrics.nano.IpConnectivityLogClass.IpConnectivityEvent setWakeupStats(com.android.server.connectivity.metrics.nano.IpConnectivityLogClass.WakeupStats p0) { return null; }
        public IpConnectivityEvent() { super(); }
        public com.android.server.connectivity.metrics.nano.IpConnectivityLogClass.IpConnectivityEvent clear() { return null; }
        public void writeTo(com.android.framework.protobuf.nano.CodedOutputByteBufferNano p0) throws java.io.IOException {}
        protected int computeSerializedSize() { return 0; }
        public com.android.server.connectivity.metrics.nano.IpConnectivityLogClass.IpConnectivityEvent mergeFrom(com.android.framework.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
        public static com.android.server.connectivity.metrics.nano.IpConnectivityLogClass.IpConnectivityEvent parseFrom(byte[] p0) throws com.android.framework.protobuf.nano.InvalidProtocolBufferNanoException { return null; }
        public static com.android.server.connectivity.metrics.nano.IpConnectivityLogClass.IpConnectivityEvent parseFrom(com.android.framework.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
    }

    public static final class IpConnectivityLog extends com.android.framework.protobuf.nano.MessageNano {
        private static volatile com.android.server.connectivity.metrics.nano.IpConnectivityLogClass.IpConnectivityLog[] _emptyArray;
        public com.android.server.connectivity.metrics.nano.IpConnectivityLogClass.IpConnectivityEvent[] events;
        public int droppedEvents;
        public int version;
        public static com.android.server.connectivity.metrics.nano.IpConnectivityLogClass.IpConnectivityLog[] emptyArray() { return null; }
        public IpConnectivityLog() { super(); }
        public com.android.server.connectivity.metrics.nano.IpConnectivityLogClass.IpConnectivityLog clear() { return null; }
        public void writeTo(com.android.framework.protobuf.nano.CodedOutputByteBufferNano p0) throws java.io.IOException {}
        protected int computeSerializedSize() { return 0; }
        public com.android.server.connectivity.metrics.nano.IpConnectivityLogClass.IpConnectivityLog mergeFrom(com.android.framework.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
        public static com.android.server.connectivity.metrics.nano.IpConnectivityLogClass.IpConnectivityLog parseFrom(byte[] p0) throws com.android.framework.protobuf.nano.InvalidProtocolBufferNanoException { return null; }
        public static com.android.server.connectivity.metrics.nano.IpConnectivityLogClass.IpConnectivityLog parseFrom(com.android.framework.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
    }

    public static final class IpProvisioningEvent extends com.android.framework.protobuf.nano.MessageNano {
        private static volatile com.android.server.connectivity.metrics.nano.IpConnectivityLogClass.IpProvisioningEvent[] _emptyArray;
        public java.lang.String ifName;
        public int eventType;
        public int latencyMs;
        public static com.android.server.connectivity.metrics.nano.IpConnectivityLogClass.IpProvisioningEvent[] emptyArray() { return null; }
        public IpProvisioningEvent() { super(); }
        public com.android.server.connectivity.metrics.nano.IpConnectivityLogClass.IpProvisioningEvent clear() { return null; }
        public void writeTo(com.android.framework.protobuf.nano.CodedOutputByteBufferNano p0) throws java.io.IOException {}
        protected int computeSerializedSize() { return 0; }
        public com.android.server.connectivity.metrics.nano.IpConnectivityLogClass.IpProvisioningEvent mergeFrom(com.android.framework.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
        public static com.android.server.connectivity.metrics.nano.IpConnectivityLogClass.IpProvisioningEvent parseFrom(byte[] p0) throws com.android.framework.protobuf.nano.InvalidProtocolBufferNanoException { return null; }
        public static com.android.server.connectivity.metrics.nano.IpConnectivityLogClass.IpProvisioningEvent parseFrom(com.android.framework.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
    }

    public static final class IpReachabilityEvent extends com.android.framework.protobuf.nano.MessageNano {
        private static volatile com.android.server.connectivity.metrics.nano.IpConnectivityLogClass.IpReachabilityEvent[] _emptyArray;
        public java.lang.String ifName;
        public int eventType;
        public static com.android.server.connectivity.metrics.nano.IpConnectivityLogClass.IpReachabilityEvent[] emptyArray() { return null; }
        public IpReachabilityEvent() { super(); }
        public com.android.server.connectivity.metrics.nano.IpConnectivityLogClass.IpReachabilityEvent clear() { return null; }
        public void writeTo(com.android.framework.protobuf.nano.CodedOutputByteBufferNano p0) throws java.io.IOException {}
        protected int computeSerializedSize() { return 0; }
        public com.android.server.connectivity.metrics.nano.IpConnectivityLogClass.IpReachabilityEvent mergeFrom(com.android.framework.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
        public static com.android.server.connectivity.metrics.nano.IpConnectivityLogClass.IpReachabilityEvent parseFrom(byte[] p0) throws com.android.framework.protobuf.nano.InvalidProtocolBufferNanoException { return null; }
        public static com.android.server.connectivity.metrics.nano.IpConnectivityLogClass.IpReachabilityEvent parseFrom(com.android.framework.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
    }

    public static final class NetworkEvent extends com.android.framework.protobuf.nano.MessageNano {
        private static volatile com.android.server.connectivity.metrics.nano.IpConnectivityLogClass.NetworkEvent[] _emptyArray;
        public com.android.server.connectivity.metrics.nano.IpConnectivityLogClass.NetworkId networkId;
        public int eventType;
        public int latencyMs;
        public static com.android.server.connectivity.metrics.nano.IpConnectivityLogClass.NetworkEvent[] emptyArray() { return null; }
        public NetworkEvent() { super(); }
        public com.android.server.connectivity.metrics.nano.IpConnectivityLogClass.NetworkEvent clear() { return null; }
        public void writeTo(com.android.framework.protobuf.nano.CodedOutputByteBufferNano p0) throws java.io.IOException {}
        protected int computeSerializedSize() { return 0; }
        public com.android.server.connectivity.metrics.nano.IpConnectivityLogClass.NetworkEvent mergeFrom(com.android.framework.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
        public static com.android.server.connectivity.metrics.nano.IpConnectivityLogClass.NetworkEvent parseFrom(byte[] p0) throws com.android.framework.protobuf.nano.InvalidProtocolBufferNanoException { return null; }
        public static com.android.server.connectivity.metrics.nano.IpConnectivityLogClass.NetworkEvent parseFrom(com.android.framework.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
    }

    public static final class NetworkId extends com.android.framework.protobuf.nano.MessageNano {
        private static volatile com.android.server.connectivity.metrics.nano.IpConnectivityLogClass.NetworkId[] _emptyArray;
        public int networkId;
        public static com.android.server.connectivity.metrics.nano.IpConnectivityLogClass.NetworkId[] emptyArray() { return null; }
        public NetworkId() { super(); }
        public com.android.server.connectivity.metrics.nano.IpConnectivityLogClass.NetworkId clear() { return null; }
        public void writeTo(com.android.framework.protobuf.nano.CodedOutputByteBufferNano p0) throws java.io.IOException {}
        protected int computeSerializedSize() { return 0; }
        public com.android.server.connectivity.metrics.nano.IpConnectivityLogClass.NetworkId mergeFrom(com.android.framework.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
        public static com.android.server.connectivity.metrics.nano.IpConnectivityLogClass.NetworkId parseFrom(byte[] p0) throws com.android.framework.protobuf.nano.InvalidProtocolBufferNanoException { return null; }
        public static com.android.server.connectivity.metrics.nano.IpConnectivityLogClass.NetworkId parseFrom(com.android.framework.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
    }

    public static final class NetworkStats extends com.android.framework.protobuf.nano.MessageNano {
        private static volatile com.android.server.connectivity.metrics.nano.IpConnectivityLogClass.NetworkStats[] _emptyArray;
        public long durationMs;
        public int ipSupport;
        public boolean everValidated;
        public boolean portalFound;
        public int noConnectivityReports;
        public int validationAttempts;
        public com.android.server.connectivity.metrics.nano.IpConnectivityLogClass.Pair[] validationEvents;
        public com.android.server.connectivity.metrics.nano.IpConnectivityLogClass.Pair[] validationStates;
        public static com.android.server.connectivity.metrics.nano.IpConnectivityLogClass.NetworkStats[] emptyArray() { return null; }
        public NetworkStats() { super(); }
        public com.android.server.connectivity.metrics.nano.IpConnectivityLogClass.NetworkStats clear() { return null; }
        public void writeTo(com.android.framework.protobuf.nano.CodedOutputByteBufferNano p0) throws java.io.IOException {}
        protected int computeSerializedSize() { return 0; }
        public com.android.server.connectivity.metrics.nano.IpConnectivityLogClass.NetworkStats mergeFrom(com.android.framework.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
        public static com.android.server.connectivity.metrics.nano.IpConnectivityLogClass.NetworkStats parseFrom(byte[] p0) throws com.android.framework.protobuf.nano.InvalidProtocolBufferNanoException { return null; }
        public static com.android.server.connectivity.metrics.nano.IpConnectivityLogClass.NetworkStats parseFrom(com.android.framework.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
    }

    public static final class Pair extends com.android.framework.protobuf.nano.MessageNano {
        private static volatile com.android.server.connectivity.metrics.nano.IpConnectivityLogClass.Pair[] _emptyArray;
        public int key;
        public int value;
        public static com.android.server.connectivity.metrics.nano.IpConnectivityLogClass.Pair[] emptyArray() { return null; }
        public Pair() { super(); }
        public com.android.server.connectivity.metrics.nano.IpConnectivityLogClass.Pair clear() { return null; }
        public void writeTo(com.android.framework.protobuf.nano.CodedOutputByteBufferNano p0) throws java.io.IOException {}
        protected int computeSerializedSize() { return 0; }
        public com.android.server.connectivity.metrics.nano.IpConnectivityLogClass.Pair mergeFrom(com.android.framework.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
        public static com.android.server.connectivity.metrics.nano.IpConnectivityLogClass.Pair parseFrom(byte[] p0) throws com.android.framework.protobuf.nano.InvalidProtocolBufferNanoException { return null; }
        public static com.android.server.connectivity.metrics.nano.IpConnectivityLogClass.Pair parseFrom(com.android.framework.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
    }

    public static final class RaEvent extends com.android.framework.protobuf.nano.MessageNano {
        private static volatile com.android.server.connectivity.metrics.nano.IpConnectivityLogClass.RaEvent[] _emptyArray;
        public long routerLifetime;
        public long prefixValidLifetime;
        public long prefixPreferredLifetime;
        public long routeInfoLifetime;
        public long rdnssLifetime;
        public long dnsslLifetime;
        public static com.android.server.connectivity.metrics.nano.IpConnectivityLogClass.RaEvent[] emptyArray() { return null; }
        public RaEvent() { super(); }
        public com.android.server.connectivity.metrics.nano.IpConnectivityLogClass.RaEvent clear() { return null; }
        public void writeTo(com.android.framework.protobuf.nano.CodedOutputByteBufferNano p0) throws java.io.IOException {}
        protected int computeSerializedSize() { return 0; }
        public com.android.server.connectivity.metrics.nano.IpConnectivityLogClass.RaEvent mergeFrom(com.android.framework.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
        public static com.android.server.connectivity.metrics.nano.IpConnectivityLogClass.RaEvent parseFrom(byte[] p0) throws com.android.framework.protobuf.nano.InvalidProtocolBufferNanoException { return null; }
        public static com.android.server.connectivity.metrics.nano.IpConnectivityLogClass.RaEvent parseFrom(com.android.framework.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
    }

    public static final class ValidationProbeEvent extends com.android.framework.protobuf.nano.MessageNano {
        private static volatile com.android.server.connectivity.metrics.nano.IpConnectivityLogClass.ValidationProbeEvent[] _emptyArray;
        public com.android.server.connectivity.metrics.nano.IpConnectivityLogClass.NetworkId networkId;
        public int latencyMs;
        public int probeType;
        public int probeResult;
        public static com.android.server.connectivity.metrics.nano.IpConnectivityLogClass.ValidationProbeEvent[] emptyArray() { return null; }
        public ValidationProbeEvent() { super(); }
        public com.android.server.connectivity.metrics.nano.IpConnectivityLogClass.ValidationProbeEvent clear() { return null; }
        public void writeTo(com.android.framework.protobuf.nano.CodedOutputByteBufferNano p0) throws java.io.IOException {}
        protected int computeSerializedSize() { return 0; }
        public com.android.server.connectivity.metrics.nano.IpConnectivityLogClass.ValidationProbeEvent mergeFrom(com.android.framework.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
        public static com.android.server.connectivity.metrics.nano.IpConnectivityLogClass.ValidationProbeEvent parseFrom(byte[] p0) throws com.android.framework.protobuf.nano.InvalidProtocolBufferNanoException { return null; }
        public static com.android.server.connectivity.metrics.nano.IpConnectivityLogClass.ValidationProbeEvent parseFrom(com.android.framework.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
    }

    public static final class WakeupStats extends com.android.framework.protobuf.nano.MessageNano {
        private static volatile com.android.server.connectivity.metrics.nano.IpConnectivityLogClass.WakeupStats[] _emptyArray;
        public long durationSec;
        public long totalWakeups;
        public long rootWakeups;
        public long systemWakeups;
        public long applicationWakeups;
        public long nonApplicationWakeups;
        public long noUidWakeups;
        public com.android.server.connectivity.metrics.nano.IpConnectivityLogClass.Pair[] ethertypeCounts;
        public com.android.server.connectivity.metrics.nano.IpConnectivityLogClass.Pair[] ipNextHeaderCounts;
        public long l2UnicastCount;
        public long l2MulticastCount;
        public long l2BroadcastCount;
        public static com.android.server.connectivity.metrics.nano.IpConnectivityLogClass.WakeupStats[] emptyArray() { return null; }
        public WakeupStats() { super(); }
        public com.android.server.connectivity.metrics.nano.IpConnectivityLogClass.WakeupStats clear() { return null; }
        public void writeTo(com.android.framework.protobuf.nano.CodedOutputByteBufferNano p0) throws java.io.IOException {}
        protected int computeSerializedSize() { return 0; }
        public com.android.server.connectivity.metrics.nano.IpConnectivityLogClass.WakeupStats mergeFrom(com.android.framework.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
        public static com.android.server.connectivity.metrics.nano.IpConnectivityLogClass.WakeupStats parseFrom(byte[] p0) throws com.android.framework.protobuf.nano.InvalidProtocolBufferNanoException { return null; }
        public static com.android.server.connectivity.metrics.nano.IpConnectivityLogClass.WakeupStats parseFrom(com.android.framework.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
    }
}
