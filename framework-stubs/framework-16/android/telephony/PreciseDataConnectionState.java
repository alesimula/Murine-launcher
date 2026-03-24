package android.telephony;

public final class PreciseDataConnectionState implements android.os.Parcelable {
    public static final int NETWORK_VALIDATION_UNSUPPORTED = 0;
    public static final int NETWORK_VALIDATION_NOT_REQUESTED = 1;
    public static final int NETWORK_VALIDATION_IN_PROGRESS = 2;
    public static final int NETWORK_VALIDATION_SUCCESS = 3;
    public static final int NETWORK_VALIDATION_FAILURE = 4;
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.telephony.PreciseDataConnectionState> CREATOR = null;
    @java.lang.Deprecated
    public PreciseDataConnectionState(int p0, int p1, int p2, java.lang.String p3, android.net.LinkProperties p4, int p5) {}
    @java.lang.Deprecated
    @android.annotation.SystemApi
    public int getDataConnectionState() { return 0; }
    public int getTransportType() { return 0; }
    public int getId() { return 0; }
    public int getNetId() { return 0; }
    public int getState() { return 0; }
    public int getNetworkType() { return 0; }
    @java.lang.Deprecated
    @android.annotation.SystemApi
    public int getDataConnectionApnTypeBitMask() { return 0; }
    @android.annotation.SystemApi
    @java.lang.Deprecated
    @android.annotation.NonNull
    public java.lang.String getDataConnectionApn() { return null; }
    @android.annotation.Nullable
    public android.net.LinkProperties getLinkProperties() { return null; }
    @java.lang.Deprecated
    @android.annotation.SystemApi
    public int getDataConnectionFailCause() { return 0; }
    public int getLastCauseCode() { return 0; }
    @android.annotation.Nullable
    public android.telephony.data.ApnSetting getApnSetting() { return null; }
    @android.annotation.Nullable
    public android.telephony.data.Qos getDefaultQos() { return null; }
    public int getNetworkValidationStatus() { return 0; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int hashCode() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    @android.annotation.NonNull
    public java.lang.String toString() { return null; }
    @android.annotation.NonNull
    public static java.lang.String networkValidationStatusToString(int p0) { return null; }

    public static final class Builder {
        public Builder() {}
        @android.annotation.NonNull
        public android.telephony.PreciseDataConnectionState.Builder setTransportType(int p0) { return null; }
        @android.annotation.NonNull
        public android.telephony.PreciseDataConnectionState.Builder setId(int p0) { return null; }
        @android.annotation.NonNull
        public android.telephony.PreciseDataConnectionState.Builder setNetworkAgentId(int p0) { return null; }
        @android.annotation.NonNull
        public android.telephony.PreciseDataConnectionState.Builder setState(int p0) { return null; }
        @android.annotation.NonNull
        public android.telephony.PreciseDataConnectionState.Builder setNetworkType(int p0) { return null; }
        @android.annotation.NonNull
        public android.telephony.PreciseDataConnectionState.Builder setLinkProperties(android.net.LinkProperties p0) { return null; }
        @android.annotation.NonNull
        public android.telephony.PreciseDataConnectionState.Builder setFailCause(int p0) { return null; }
        @android.annotation.NonNull
        public android.telephony.PreciseDataConnectionState.Builder setApnSetting(android.telephony.data.ApnSetting p0) { return null; }
        @android.annotation.NonNull
        public android.telephony.PreciseDataConnectionState.Builder setDefaultQos(android.telephony.data.Qos p0) { return null; }
        @android.annotation.NonNull
        public android.telephony.PreciseDataConnectionState.Builder setNetworkValidationStatus(int p0) { return null; }
        public android.telephony.PreciseDataConnectionState build() { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface NetworkValidationStatus {
    }
}
