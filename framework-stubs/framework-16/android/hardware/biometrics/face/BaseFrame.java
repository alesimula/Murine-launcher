package android.hardware.biometrics.face;

public class BaseFrame implements android.os.Parcelable {
    public byte acquiredInfo;
    public int vendorCode;
    public float pan;
    public float tilt;
    public float distance;
    public boolean isCancellable;
    public static final android.os.Parcelable.Creator<android.hardware.biometrics.face.BaseFrame> CREATOR = null;
    public BaseFrame() {}
    public final int getStability() { return 0; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public final void readFromParcel(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
}
