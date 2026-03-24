package android.telephony;

@android.annotation.SystemApi
public final class CallAttributes implements android.os.Parcelable {
    private android.telephony.PreciseCallState mPreciseCallState;
    private int mNetworkType;
    private android.telephony.CallQuality mCallQuality;
    public static final android.os.Parcelable.Creator<android.telephony.CallAttributes> CREATOR = null;
    public CallAttributes(android.telephony.PreciseCallState p0, int p1, android.telephony.CallQuality p2) {}
    public java.lang.String toString() { return null; }
    private CallAttributes(android.os.Parcel p0) {}
    public android.telephony.PreciseCallState getPreciseCallState() { return null; }
    public int getNetworkType() { return 0; }
    public android.telephony.CallQuality getCallQuality() { return null; }
    public int hashCode() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
