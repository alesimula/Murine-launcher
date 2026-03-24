package android.app.backup;

@android.annotation.SystemApi
public class RestoreSet implements android.os.Parcelable {
    public java.lang.String name;
    public java.lang.String device;
    public long token;
    public final int backupTransportFlags = 0;
    public static final android.os.Parcelable.Creator<android.app.backup.RestoreSet> CREATOR = null;
    public RestoreSet() {}
    public RestoreSet(java.lang.String p0, java.lang.String p1, long p2) {}
    public RestoreSet(java.lang.String p0, java.lang.String p1, long p2, int p3) {}
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    private RestoreSet(android.os.Parcel p0) {}
}
