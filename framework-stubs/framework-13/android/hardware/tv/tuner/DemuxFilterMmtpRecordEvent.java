package android.hardware.tv.tuner;

public class DemuxFilterMmtpRecordEvent implements android.os.Parcelable {
    public int scHevcIndexMask;
    public long byteNumber;
    public long pts;
    public int mpuSequenceNumber;
    public int firstMbInSlice;
    public int tsIndexMask;
    public static final android.os.Parcelable.Creator<android.hardware.tv.tuner.DemuxFilterMmtpRecordEvent> CREATOR = null;
    public DemuxFilterMmtpRecordEvent() {}
    public final int getStability() { return 0; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public final void readFromParcel(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
}
