package android.hardware.tv.tuner;

public class DemuxFilterRecordSettings implements android.os.Parcelable {
    public int tsIndexMask;
    public int scIndexType;
    public android.hardware.tv.tuner.DemuxFilterScIndexMask scIndexMask;
    public static final android.os.Parcelable.Creator<android.hardware.tv.tuner.DemuxFilterRecordSettings> CREATOR = null;
    public DemuxFilterRecordSettings() {}
    public final int getStability() { return 0; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public final void readFromParcel(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
}
