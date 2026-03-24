package android.telephony;

public final class PreciseDataConnectionState implements android.os.Parcelable {
    private final int mTransportType = 0;
    private final int mId = 0;
    private final int mState = 0;
    private final int mNetworkType = 0;
    private final int mFailCause = 0;
    private final android.net.LinkProperties mLinkProperties = null;
    private final android.telephony.data.ApnSetting mApnSetting = null;
    private static final long GET_DATA_CONNECTION_STATE_R_VERSION = 148535736L;
    public static final android.os.Parcelable.Creator<android.telephony.PreciseDataConnectionState> CREATOR = null;
    @java.lang.Deprecated
    public PreciseDataConnectionState(int p0, int p1, int p2, java.lang.String p3, android.net.LinkProperties p4, int p5) {}
    private PreciseDataConnectionState(int p0, int p1, int p2, int p3, android.net.LinkProperties p4, int p5, android.telephony.data.ApnSetting p6) {}
    private PreciseDataConnectionState(android.os.Parcel p0) {}
    @java.lang.Deprecated
    @android.annotation.SystemApi
    public int getDataConnectionState() { return 0; }
    public int getTransportType() { return 0; }
    public int getId() { return 0; }
    public int getState() { return 0; }
    public int getNetworkType() { return 0; }
    @java.lang.Deprecated
    @android.annotation.SystemApi
    public int getDataConnectionApnTypeBitMask() { return 0; }
    @android.annotation.SystemApi
    @java.lang.Deprecated
    public java.lang.String getDataConnectionApn() { return null; }
    public android.net.LinkProperties getLinkProperties() { return null; }
    @java.lang.Deprecated
    @android.annotation.SystemApi
    public int getDataConnectionFailCause() { return 0; }
    public int getLastCauseCode() { return 0; }
    public android.telephony.data.ApnSetting getApnSetting() { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int hashCode() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public java.lang.String toString() { return null; }

    public static final class Builder {
        private int mTransportType;
        private int mId;
        private int mState;
        private int mNetworkType;
        private android.net.LinkProperties mLinkProperties;
        private int mFailCause;
        private android.telephony.data.ApnSetting mApnSetting;
        public Builder() {}
        public android.telephony.PreciseDataConnectionState.Builder setTransportType(int p0) { return null; }
        public android.telephony.PreciseDataConnectionState.Builder setId(int p0) { return null; }
        public android.telephony.PreciseDataConnectionState.Builder setState(int p0) { return null; }
        public android.telephony.PreciseDataConnectionState.Builder setNetworkType(int p0) { return null; }
        public android.telephony.PreciseDataConnectionState.Builder setLinkProperties(android.net.LinkProperties p0) { return null; }
        public android.telephony.PreciseDataConnectionState.Builder setFailCause(int p0) { return null; }
        public android.telephony.PreciseDataConnectionState.Builder setApnSetting(android.telephony.data.ApnSetting p0) { return null; }
        public android.telephony.PreciseDataConnectionState build() { return null; }
    }
}
