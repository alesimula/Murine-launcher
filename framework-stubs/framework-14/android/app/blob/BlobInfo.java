package android.app.blob;

public final class BlobInfo implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.app.blob.BlobInfo> CREATOR = null;
    public BlobInfo(long p0, long p1, java.lang.CharSequence p2, long p3, java.util.List<android.app.blob.LeaseInfo> p4) {}
    public long getId() { return 0L; }
    public long getExpiryTimeMs() { return 0L; }
    public java.lang.CharSequence getLabel() { return null; }
    public long getSizeBytes() { return 0L; }
    public java.util.List<android.app.blob.LeaseInfo> getLeases() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public java.lang.String toString() { return null; }
    public int describeContents() { return 0; }
}
