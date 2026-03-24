package android.app.usage;

public final class StorageStats implements android.os.Parcelable {
    public long codeBytes;
    public long dataBytes;
    public long cacheBytes;
    public long externalCacheBytes;
    public static final android.os.Parcelable.Creator<android.app.usage.StorageStats> CREATOR = null;
    public long getAppBytes() { return 0L; }
    public long getDataBytes() { return 0L; }
    public long getCacheBytes() { return 0L; }
    public long getExternalCacheBytes() { return 0L; }
    public StorageStats() {}
    public StorageStats(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
