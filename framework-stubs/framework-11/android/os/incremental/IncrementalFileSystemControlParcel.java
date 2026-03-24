package android.os.incremental;

public class IncrementalFileSystemControlParcel implements android.os.Parcelable {
    public android.os.ParcelFileDescriptor cmd;
    public android.os.ParcelFileDescriptor pendingReads;
    public android.os.ParcelFileDescriptor log;
    public static final android.os.Parcelable.Creator<android.os.incremental.IncrementalFileSystemControlParcel> CREATOR = null;
    public IncrementalFileSystemControlParcel() {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public final void readFromParcel(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
}
