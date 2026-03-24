package android.hardware.tv.tuner;

public class DemuxFilterTemiEvent implements android.os.Parcelable {
    public long pts;
    public byte descrTag;
    public byte[] descrData;
    public static final android.os.Parcelable.Creator<android.hardware.tv.tuner.DemuxFilterTemiEvent> CREATOR = null;
    public DemuxFilterTemiEvent() {}
    public final int getStability() { return 0; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public final void readFromParcel(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
}
