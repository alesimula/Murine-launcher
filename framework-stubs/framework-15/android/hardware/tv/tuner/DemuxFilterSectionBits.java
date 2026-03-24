package android.hardware.tv.tuner;

public class DemuxFilterSectionBits implements android.os.Parcelable {
    public byte[] filter;
    public byte[] mask;
    public byte[] mode;
    public static final android.os.Parcelable.Creator<android.hardware.tv.tuner.DemuxFilterSectionBits> CREATOR = null;
    public DemuxFilterSectionBits() {}
    public final int getStability() { return 0; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public final void readFromParcel(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
}
