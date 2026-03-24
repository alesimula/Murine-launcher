package android.app.backup;

@android.annotation.SystemApi
public class BackupProgress implements android.os.Parcelable {
    public final long bytesExpected = 0L;
    public final long bytesTransferred = 0L;
    public static final android.os.Parcelable.Creator<android.app.backup.BackupProgress> CREATOR = null;
    public BackupProgress(long p0, long p1) {}
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
