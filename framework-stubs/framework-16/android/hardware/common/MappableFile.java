package android.hardware.common;

public class MappableFile implements android.os.Parcelable {
    public long length;
    public int prot;
    public android.os.ParcelFileDescriptor fd;
    public long offset;
    public static final android.os.Parcelable.Creator<android.hardware.common.MappableFile> CREATOR = null;
    public MappableFile() {}
    public final int getStability() { return 0; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public final void readFromParcel(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
}
