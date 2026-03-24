package android.telephony.data;

public final class NetworkSlicingConfig implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.telephony.data.NetworkSlicingConfig> CREATOR = null;
    public NetworkSlicingConfig() {}
    public NetworkSlicingConfig(java.util.List<android.telephony.data.UrspRule> p0, java.util.List<android.telephony.data.NetworkSliceInfo> p1) {}
    public NetworkSlicingConfig(android.os.Parcel p0) {}
    @android.annotation.NonNull
    public java.util.List<android.telephony.data.UrspRule> getUrspRules() { return null; }
    @android.annotation.NonNull
    public java.util.List<android.telephony.data.NetworkSliceInfo> getSliceInfo() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }
}
