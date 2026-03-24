package android.os;

public final class ParcelDuration implements android.os.Parcelable {
    private final long mSeconds = 0L;
    private final int mNanos = 0;
    public static final android.os.Parcelable.Creator<android.os.ParcelDuration> CREATOR = null;
    public ParcelDuration(long p0) {}
    public ParcelDuration(java.time.Duration p0) {}
    private ParcelDuration(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public java.time.Duration getDuration() { return null; }
    public java.lang.String toString() { return null; }
}
