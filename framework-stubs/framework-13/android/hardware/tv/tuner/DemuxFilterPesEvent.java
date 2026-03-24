package android.hardware.tv.tuner;

public class DemuxFilterPesEvent implements android.os.Parcelable {
    public int streamId;
    public int dataLength;
    public int mpuSequenceNumber;
    public static final android.os.Parcelable.Creator<android.hardware.tv.tuner.DemuxFilterPesEvent> CREATOR = null;
    public DemuxFilterPesEvent() {}
    public final int getStability() { return 0; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public final void readFromParcel(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
}
