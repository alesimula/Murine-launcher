package android.service.contentcapture;

public final class FlushMetrics implements android.os.Parcelable {
    public int viewAppearedCount;
    public int viewDisappearedCount;
    public int viewTextChangedCount;
    public int sessionStarted;
    public int sessionFinished;
    public static final android.os.Parcelable.Creator<android.service.contentcapture.FlushMetrics> CREATOR = null;
    public FlushMetrics() {}
    public void reset() {}
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
