package android.security.metrics;

public class StorageStats implements android.os.Parcelable {
    public int storage_type;
    public int size;
    public int unused_size;
    public static final android.os.Parcelable.Creator<android.security.metrics.StorageStats> CREATOR = null;
    public StorageStats() {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public final void readFromParcel(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
}
