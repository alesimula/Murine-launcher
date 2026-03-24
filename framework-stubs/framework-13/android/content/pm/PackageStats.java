package android.content.pm;

@java.lang.Deprecated
public class PackageStats implements android.os.Parcelable {
    public java.lang.String packageName;
    public int userHandle;
    public long codeSize;
    public long dataSize;
    public long cacheSize;
    public long externalCodeSize;
    public long externalDataSize;
    public long externalCacheSize;
    public long externalMediaSize;
    public long externalObbSize;
    public static final android.os.Parcelable.Creator<android.content.pm.PackageStats> CREATOR = null;
    public java.lang.String toString() { return null; }
    public PackageStats(java.lang.String p0) {}
    public PackageStats(java.lang.String p0, int p1) {}
    public PackageStats(android.os.Parcel p0) {}
    public PackageStats(android.content.pm.PackageStats p0) {}
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
}
