package android.hardware.tv.tuner;

public class DemuxFilterSectionEvent implements android.os.Parcelable {
    public int tableId;
    public int version;
    public int sectionNum;
    public long dataLength;
    public static final android.os.Parcelable.Creator<android.hardware.tv.tuner.DemuxFilterSectionEvent> CREATOR = null;
    public DemuxFilterSectionEvent() {}
    public final int getStability() { return 0; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public final void readFromParcel(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
}
