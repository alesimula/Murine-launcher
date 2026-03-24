package android.hardware.tv.tuner;

public class DemuxFilterTsRecordEvent implements android.os.Parcelable {
    public android.hardware.tv.tuner.DemuxPid pid;
    public int tsIndexMask;
    public android.hardware.tv.tuner.DemuxFilterScIndexMask scIndexMask;
    public long byteNumber;
    public long pts;
    public int firstMbInSlice;
    public static final android.os.Parcelable.Creator<android.hardware.tv.tuner.DemuxFilterTsRecordEvent> CREATOR = null;
    public DemuxFilterTsRecordEvent() {}
    public final int getStability() { return 0; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public final void readFromParcel(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
}
