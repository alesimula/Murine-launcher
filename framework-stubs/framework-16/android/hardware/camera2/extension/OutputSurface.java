package android.hardware.camera2.extension;

public class OutputSurface implements android.os.Parcelable {
    public android.view.Surface surface;
    public android.hardware.camera2.extension.Size size;
    public int imageFormat;
    public long dynamicRangeProfile;
    public int colorSpace;
    public static final android.os.Parcelable.Creator<android.hardware.camera2.extension.OutputSurface> CREATOR = null;
    public OutputSurface() {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public final void readFromParcel(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
}
