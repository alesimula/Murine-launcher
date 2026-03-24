package android.hardware.camera2.extension;

public class ParcelCaptureResult implements android.os.Parcelable {
    public java.lang.String cameraId;
    public android.hardware.camera2.impl.CameraMetadataNative results;
    public android.hardware.camera2.CaptureRequest parent;
    public int sequenceId;
    public long frameNumber;
    public static final android.os.Parcelable.Creator<android.hardware.camera2.extension.ParcelCaptureResult> CREATOR = null;
    public ParcelCaptureResult() {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public final void readFromParcel(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
    private int describeContents(java.lang.Object p0) { return 0; }
}
