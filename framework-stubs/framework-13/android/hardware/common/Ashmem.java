package android.hardware.common;

public class Ashmem implements android.os.Parcelable {
    public android.os.ParcelFileDescriptor fd;
    public long size;
    public static final android.os.Parcelable.Creator<android.hardware.common.Ashmem> CREATOR = null;
    public Ashmem() {}
    public final int getStability() { return 0; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public final void readFromParcel(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
}
