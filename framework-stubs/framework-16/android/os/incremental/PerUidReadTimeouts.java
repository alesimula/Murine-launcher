package android.os.incremental;

public class PerUidReadTimeouts implements android.os.Parcelable {
    public int uid;
    public long minTimeUs;
    public long minPendingTimeUs;
    public long maxPendingTimeUs;
    public static final android.os.Parcelable.Creator<android.os.incremental.PerUidReadTimeouts> CREATOR = null;
    public PerUidReadTimeouts() {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public final void readFromParcel(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
}
