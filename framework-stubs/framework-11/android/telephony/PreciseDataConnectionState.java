package android.telephony;

public final class PreciseDataConnectionState implements android.os.Parcelable {
    private int mState;
    private int mNetworkType;
    private int mFailCause;
    private int mApnTypes;
    private java.lang.String mApn;
    private android.net.LinkProperties mLinkProperties;
    private android.telephony.data.ApnSetting mApnSetting;
    private static final long GET_DATA_CONNECTION_STATE_R_VERSION = 148535736L;
    public static final android.os.Parcelable.Creator<android.telephony.PreciseDataConnectionState> CREATOR = null;
    @java.lang.Deprecated
    public PreciseDataConnectionState(int p0, int p1, int p2, java.lang.String p3, android.net.LinkProperties p4, int p5) {}
    public PreciseDataConnectionState(int p0, int p1, int p2, java.lang.String p3, android.net.LinkProperties p4, int p5, android.telephony.data.ApnSetting p6) {}
    public PreciseDataConnectionState() {}
    private PreciseDataConnectionState(android.os.Parcel p0) {}
    @java.lang.Deprecated
    @android.annotation.SystemApi
    public int getDataConnectionState() { return 0; }
    public int getState() { return 0; }
    @java.lang.Deprecated
    @android.annotation.SystemApi
    public int getDataConnectionNetworkType() { return 0; }
    public int getNetworkType() { return 0; }
    @java.lang.Deprecated
    @android.annotation.SystemApi
    public int getDataConnectionApnTypeBitMask() { return 0; }
    @android.annotation.SystemApi
    @java.lang.Deprecated
    public java.lang.String getDataConnectionApn() { return null; }
    @java.lang.Deprecated
    @android.annotation.SystemApi
    public android.net.LinkProperties getDataConnectionLinkProperties() { return null; }
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
}
