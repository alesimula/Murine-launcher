package android.telephony;

@android.annotation.SystemApi
@android.annotation.SuppressLint("ParcelNotFinal")
public abstract class VopsSupportInfo implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.telephony.VopsSupportInfo> CREATOR = null;
    public VopsSupportInfo() {}
    public abstract boolean isVopsSupported();
    public abstract boolean isEmergencyServiceSupported();
    public abstract boolean isEmergencyServiceFallbackSupported();
    public int describeContents() { return 0; }
    public abstract void writeToParcel(android.os.Parcel p0, int p1);
    protected void writeToParcel(android.os.Parcel p0, int p1, int p2) {}
    public abstract int hashCode();
    public abstract boolean equals(java.lang.Object p0);
}
