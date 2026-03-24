package android.hardware.camera2.extension;

public class ParcelImage implements android.os.Parcelable {
    public int format;
    public int width;
    public int height;
    public int transform;
    public int scalingMode;
    public long timestamp;
    public int planeCount;
    public android.graphics.Rect crop;
    public android.hardware.HardwareBuffer buffer;
    public android.os.ParcelFileDescriptor fence;
    public static final android.os.Parcelable.Creator<android.hardware.camera2.extension.ParcelImage> CREATOR = null;
    public ParcelImage() {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public final void readFromParcel(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
}
