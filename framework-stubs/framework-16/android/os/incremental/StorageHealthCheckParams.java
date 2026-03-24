package android.os.incremental;

public class StorageHealthCheckParams implements android.os.Parcelable {
    public int blockedTimeoutMs;
    public int unhealthyTimeoutMs;
    public int unhealthyMonitoringMs;
    public static final android.os.Parcelable.Creator<android.os.incremental.StorageHealthCheckParams> CREATOR = null;
    public StorageHealthCheckParams() {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public final void readFromParcel(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
}
