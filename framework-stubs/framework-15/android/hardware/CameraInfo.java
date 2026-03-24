package android.hardware;

public class CameraInfo implements android.os.Parcelable {
    public android.hardware.Camera.CameraInfo info;
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.hardware.CameraInfo> CREATOR = null;
    public CameraInfo() {}
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public void readFromParcel(android.os.Parcel p0) {}
}
