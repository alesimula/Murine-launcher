package android.hardware.radio.data;

public class SlicingConfig implements android.os.Parcelable {
    public android.hardware.radio.data.UrspRule[] urspRules;
    public android.hardware.radio.data.SliceInfo[] sliceInfo;
    public static final android.os.Parcelable.Creator<android.hardware.radio.data.SlicingConfig> CREATOR = null;
    public SlicingConfig() {}
    public final int getStability() { return 0; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public final void readFromParcel(android.os.Parcel p0) {}
    public java.lang.String toString() { return null; }
    public int describeContents() { return 0; }
}
