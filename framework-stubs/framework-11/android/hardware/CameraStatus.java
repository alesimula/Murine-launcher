package android.hardware;

public class CameraStatus implements android.os.Parcelable {
    public java.lang.String cameraId;
    public int status;
    public java.lang.String[] unavailablePhysicalCameras;
    public static final android.os.Parcelable.Creator<android.hardware.CameraStatus> CREATOR = null;
    public CameraStatus() {}
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public void readFromParcel(android.os.Parcel p0) {}
}
