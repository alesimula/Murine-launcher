package android.telephony;

@android.annotation.SystemApi
@java.lang.Deprecated
public final class CallAttributes implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.telephony.CallAttributes> CREATOR = null;
    public CallAttributes(android.telephony.PreciseCallState p0, int p1, android.telephony.CallQuality p2) {}
    @android.annotation.NonNull
    public java.lang.String toString() { return null; }
    @android.annotation.NonNull
    public android.telephony.PreciseCallState getPreciseCallState() { return null; }
    public int getNetworkType() { return 0; }
    @android.annotation.NonNull
    public android.telephony.CallQuality getCallQuality() { return null; }
    public int hashCode() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
