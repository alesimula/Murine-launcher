package android.security.metrics;

public class RkpPoolStats implements android.os.Parcelable {
    public int security_level;
    public int expiring;
    public int unassigned;
    public int attested;
    public int total;
    public static final android.os.Parcelable.Creator<android.security.metrics.RkpPoolStats> CREATOR = null;
    public RkpPoolStats() {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public final void readFromParcel(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
}
