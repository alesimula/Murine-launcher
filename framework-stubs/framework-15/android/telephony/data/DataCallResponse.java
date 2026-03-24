package android.telephony.data;

@android.annotation.SystemApi
public final class DataCallResponse implements android.os.Parcelable {
    public static final int LINK_STATUS_UNKNOWN = -1;
    public static final int LINK_STATUS_INACTIVE = 0;
    public static final int LINK_STATUS_DORMANT = 1;
    public static final int LINK_STATUS_ACTIVE = 2;
    public static final int HANDOVER_FAILURE_MODE_UNKNOWN = -1;
    public static final int HANDOVER_FAILURE_MODE_LEGACY = 0;
    public static final int HANDOVER_FAILURE_MODE_DO_FALLBACK = 1;
    public static final int HANDOVER_FAILURE_MODE_NO_FALLBACK_RETRY_HANDOVER = 2;
    public static final int HANDOVER_FAILURE_MODE_NO_FALLBACK_RETRY_SETUP_NORMAL = 3;
    public static final int RETRY_DURATION_UNDEFINED = -1;
    public static final int PDU_SESSION_ID_NOT_SET = 0;
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.telephony.data.DataCallResponse> CREATOR = null;
    public DataCallResponse(int p0, int p1, int p2, int p3, int p4, java.lang.String p5, java.util.List<android.net.LinkAddress> p6, java.util.List<java.net.InetAddress> p7, java.util.List<java.net.InetAddress> p8, java.util.List<java.net.InetAddress> p9, int p10) {}
    public DataCallResponse(android.os.Parcel p0) {}
    public int getCause() { return 0; }
    @java.lang.Deprecated
    public int getSuggestedRetryTime() { return 0; }
    public long getRetryDurationMillis() { return 0L; }
    public int getId() { return 0; }
    public int getLinkStatus() { return 0; }
    public int getProtocolType() { return 0; }
    @android.annotation.NonNull
    public java.lang.String getInterfaceName() { return null; }
    @android.annotation.NonNull
    public java.util.List<android.net.LinkAddress> getAddresses() { return null; }
    @android.annotation.NonNull
    public java.util.List<java.net.InetAddress> getDnsAddresses() { return null; }
    @android.annotation.NonNull
    public java.util.List<java.net.InetAddress> getGatewayAddresses() { return null; }
    @android.annotation.NonNull
    public java.util.List<java.net.InetAddress> getPcscfAddresses() { return null; }
    @java.lang.Deprecated
    public int getMtu() { return 0; }
    public int getMtuV4() { return 0; }
    public int getMtuV6() { return 0; }
    public int getHandoverFailureMode() { return 0; }
    public int getPduSessionId() { return 0; }
    @android.annotation.Nullable
    public android.telephony.data.Qos getDefaultQos() { return null; }
    @android.annotation.NonNull
    public java.util.List<android.telephony.data.QosBearerSession> getQosBearerSessions() { return null; }
    @android.annotation.Nullable
    public android.telephony.data.NetworkSliceInfo getSliceInfo() { return null; }
    @android.annotation.NonNull
    public java.util.List<android.telephony.data.TrafficDescriptor> getTrafficDescriptors() { return null; }
    @android.annotation.FlaggedApi("com.android.internal.telephony.flags.network_validation")
    public int getNetworkValidationStatus() { return 0; }
    @android.annotation.NonNull
    public java.lang.String toString() { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public static java.lang.String failureModeToString(int p0) { return null; }

    public static final class Builder {
        public Builder() {}
        @android.annotation.NonNull
        public android.telephony.data.DataCallResponse.Builder setCause(int p0) { return null; }
        @java.lang.Deprecated
        @android.annotation.NonNull
        public android.telephony.data.DataCallResponse.Builder setSuggestedRetryTime(int p0) { return null; }
        @android.annotation.NonNull
        public android.telephony.data.DataCallResponse.Builder setRetryDurationMillis(long p0) { return null; }
        @android.annotation.NonNull
        public android.telephony.data.DataCallResponse.Builder setId(int p0) { return null; }
        @android.annotation.NonNull
        public android.telephony.data.DataCallResponse.Builder setLinkStatus(int p0) { return null; }
        @android.annotation.NonNull
        public android.telephony.data.DataCallResponse.Builder setProtocolType(int p0) { return null; }
        @android.annotation.NonNull
        public android.telephony.data.DataCallResponse.Builder setInterfaceName(java.lang.String p0) { return null; }
        @android.annotation.NonNull
        public android.telephony.data.DataCallResponse.Builder setAddresses(java.util.List<android.net.LinkAddress> p0) { return null; }
        @android.annotation.NonNull
        public android.telephony.data.DataCallResponse.Builder setDnsAddresses(java.util.List<java.net.InetAddress> p0) { return null; }
        @android.annotation.NonNull
        public android.telephony.data.DataCallResponse.Builder setGatewayAddresses(java.util.List<java.net.InetAddress> p0) { return null; }
        @android.annotation.NonNull
        public android.telephony.data.DataCallResponse.Builder setPcscfAddresses(java.util.List<java.net.InetAddress> p0) { return null; }
        @android.annotation.NonNull
        public android.telephony.data.DataCallResponse.Builder setMtu(int p0) { return null; }
        @android.annotation.NonNull
        public android.telephony.data.DataCallResponse.Builder setMtuV4(int p0) { return null; }
        @android.annotation.NonNull
        public android.telephony.data.DataCallResponse.Builder setMtuV6(int p0) { return null; }
        @android.annotation.NonNull
        public android.telephony.data.DataCallResponse.Builder setHandoverFailureMode(int p0) { return null; }
        @android.annotation.NonNull
        public android.telephony.data.DataCallResponse.Builder setPduSessionId(int p0) { return null; }
        @android.annotation.NonNull
        public android.telephony.data.DataCallResponse.Builder setDefaultQos(android.telephony.data.Qos p0) { return null; }
        @android.annotation.NonNull
        public android.telephony.data.DataCallResponse.Builder setQosBearerSessions(java.util.List<android.telephony.data.QosBearerSession> p0) { return null; }
        @android.annotation.NonNull
        public android.telephony.data.DataCallResponse.Builder setSliceInfo(android.telephony.data.NetworkSliceInfo p0) { return null; }
        @android.annotation.NonNull
        public android.telephony.data.DataCallResponse.Builder setTrafficDescriptors(java.util.List<android.telephony.data.TrafficDescriptor> p0) { return null; }
        @android.annotation.FlaggedApi("com.android.internal.telephony.flags.network_validation")
        @android.annotation.NonNull
        public android.telephony.data.DataCallResponse.Builder setNetworkValidationStatus(int p0) { return null; }
        @android.annotation.NonNull
        public android.telephony.data.DataCallResponse build() { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface HandoverFailureMode {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface LinkStatus {
    }
}
