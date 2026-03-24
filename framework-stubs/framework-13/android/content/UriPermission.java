package android.content;

public final class UriPermission implements android.os.Parcelable {
    public static final long INVALID_TIME = -9223372036854775808L;
    public static final android.os.Parcelable.Creator<android.content.UriPermission> CREATOR = null;
    public UriPermission(android.net.Uri p0, int p1, long p2) {}
    public UriPermission(android.os.Parcel p0) {}
    public android.net.Uri getUri() { return null; }
    public boolean isReadPermission() { return false; }
    public boolean isWritePermission() { return false; }
    public long getPersistedTime() { return 0L; }
    public java.lang.String toString() { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
