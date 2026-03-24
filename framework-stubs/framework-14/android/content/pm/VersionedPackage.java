package android.content.pm;

public final class VersionedPackage implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.content.pm.VersionedPackage> CREATOR = null;
    public VersionedPackage(java.lang.String p0, int p1) {}
    public VersionedPackage(java.lang.String p0, long p1) {}
    public java.lang.String getPackageName() { return null; }
    @java.lang.Deprecated
    public int getVersionCode() { return 0; }
    public long getLongVersionCode() { return 0L; }
    public java.lang.String toString() { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface VersionCode {
    }
}
