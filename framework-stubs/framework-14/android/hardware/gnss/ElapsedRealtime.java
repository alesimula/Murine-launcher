package android.hardware.gnss;

public class ElapsedRealtime implements android.os.Parcelable {
    public int flags;
    public long timestampNs;
    public double timeUncertaintyNs;
    public static final android.os.Parcelable.Creator<android.hardware.gnss.ElapsedRealtime> CREATOR = null;
    public static final int HAS_TIMESTAMP_NS = 1;
    public static final int HAS_TIME_UNCERTAINTY_NS = 2;
    public ElapsedRealtime() {}
    public final int getStability() { return 0; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public final void readFromParcel(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
}
