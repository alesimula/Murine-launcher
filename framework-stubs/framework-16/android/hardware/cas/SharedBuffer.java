package android.hardware.cas;

public class SharedBuffer implements android.os.Parcelable {
    public android.hardware.common.Ashmem heapBase;
    public long offset;
    public long size;
    public static final android.os.Parcelable.Creator<android.hardware.cas.SharedBuffer> CREATOR = null;
    public SharedBuffer() {}
    public final int getStability() { return 0; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public final void readFromParcel(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
}
