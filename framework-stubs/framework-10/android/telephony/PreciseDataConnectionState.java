package android.telephony;

@android.annotation.SystemApi
public final class PreciseDataConnectionState implements android.os.Parcelable {
    private int mState;
    private int mNetworkType;
    private int mFailCause;
    private int mAPNTypes;
    private java.lang.String mAPN;
    private android.net.LinkProperties mLinkProperties;
    public static final android.os.Parcelable.Creator<android.telephony.PreciseDataConnectionState> CREATOR = null;
    @android.annotation.UnsupportedAppUsage
    public PreciseDataConnectionState(int p0, int p1, int p2, java.lang.String p3, android.net.LinkProperties p4, int p5) {}
    public PreciseDataConnectionState() {}
    private PreciseDataConnectionState(android.os.Parcel p0) {}
    public int getDataConnectionState() { return 0; }
    public int getDataConnectionNetworkType() { return 0; }
    public int getDataConnectionApnTypeBitMask() { return 0; }
    public java.lang.String getDataConnectionApn() { return null; }
    @android.annotation.UnsupportedAppUsage
    public android.net.LinkProperties getDataConnectionLinkProperties() { return null; }
    public int getDataConnectionFailCause() { return 0; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int hashCode() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public java.lang.String toString() { return null; }
}
