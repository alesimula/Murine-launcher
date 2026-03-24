package android.hardware.tv.tuner;

public class DemuxFilterDownloadEvent implements android.os.Parcelable {
    public int itemId;
    public int downloadId;
    public int mpuSequenceNumber;
    public int itemFragmentIndex;
    public int lastItemFragmentIndex;
    public int dataLength;
    public static final android.os.Parcelable.Creator<android.hardware.tv.tuner.DemuxFilterDownloadEvent> CREATOR = null;
    public DemuxFilterDownloadEvent() {}
    public final int getStability() { return 0; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public final void readFromParcel(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
}
