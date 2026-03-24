package android.hardware.tv.tuner;

public class DemuxFilterType implements android.os.Parcelable {
    public int mainType;
    public android.hardware.tv.tuner.DemuxFilterSubType subType;
    public static final android.os.Parcelable.Creator<android.hardware.tv.tuner.DemuxFilterType> CREATOR = null;
    public DemuxFilterType() {}
    public final int getStability() { return 0; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public final void readFromParcel(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
}
