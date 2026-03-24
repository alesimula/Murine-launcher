package android.os.incremental;

public class IncrementalNewFileParams implements android.os.Parcelable {
    public long size;
    public byte[] fileId;
    public byte[] metadata;
    public byte[] signature;
    public static final android.os.Parcelable.Creator<android.os.incremental.IncrementalNewFileParams> CREATOR = null;
    public IncrementalNewFileParams() {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public final void readFromParcel(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
}
