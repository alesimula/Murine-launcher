package android.telephony.data;

public final class NetworkSlicingConfig implements android.os.Parcelable {
    private final java.util.List<android.telephony.data.UrspRule> mUrspRules = null;
    private final java.util.List<android.telephony.data.NetworkSliceInfo> mSliceInfo = null;
    public static final android.os.Parcelable.Creator<android.telephony.data.NetworkSlicingConfig> CREATOR = null;
    public NetworkSlicingConfig() {}
    public NetworkSlicingConfig(android.hardware.radio.V1_6.SlicingConfig p0) {}
    public NetworkSlicingConfig(java.util.List<android.hardware.radio.V1_6.UrspRule> p0, java.util.List<android.hardware.radio.V1_6.SliceInfo> p1) {}
    private android.telephony.data.NetworkSliceInfo sliceInfoBuilder(android.hardware.radio.V1_6.SliceInfo p0) { return null; }
    public NetworkSlicingConfig(android.os.Parcel p0) {}
    public java.util.List<android.telephony.data.UrspRule> getUrspRules() { return null; }
    public java.util.List<android.telephony.data.NetworkSliceInfo> getSliceInfo() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }
}
