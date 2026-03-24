package android.content.pm;

public class FileSystemControlParcel implements android.os.Parcelable {
    public android.os.incremental.IncrementalFileSystemControlParcel incremental;
    public android.os.incremental.IIncrementalServiceConnector service;
    public android.content.pm.IPackageInstallerSessionFileSystemConnector callback;
    public static final android.os.Parcelable.Creator<android.content.pm.FileSystemControlParcel> CREATOR = null;
    public FileSystemControlParcel() {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public final void readFromParcel(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
    private int describeContents(java.lang.Object p0) { return 0; }
}
