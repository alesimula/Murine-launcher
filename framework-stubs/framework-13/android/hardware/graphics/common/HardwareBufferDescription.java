package android.hardware.graphics.common;

public class HardwareBufferDescription implements android.os.Parcelable {
    public int width;
    public int height;
    public int layers;
    public int format;
    public long usage;
    public int stride;
    public static final android.os.Parcelable.Creator<android.hardware.graphics.common.HardwareBufferDescription> CREATOR = null;
    public HardwareBufferDescription() {}
    public final int getStability() { return 0; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public final void readFromParcel(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
}
