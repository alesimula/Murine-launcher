package android.hardware.camera2.utils;

public class CameraIdAndSessionConfiguration implements android.os.Parcelable {
    private java.lang.String mCameraId;
    private android.hardware.camera2.params.SessionConfiguration mSessionConfiguration;
    public static final android.os.Parcelable.Creator<android.hardware.camera2.utils.CameraIdAndSessionConfiguration> CREATOR = null;
    public CameraIdAndSessionConfiguration(java.lang.String p0, android.hardware.camera2.params.SessionConfiguration p1) {}
    private CameraIdAndSessionConfiguration(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public void readFromParcel(android.os.Parcel p0) {}
    public java.lang.String getCameraId() { return null; }
    public android.hardware.camera2.params.SessionConfiguration getSessionConfiguration() { return null; }
}
