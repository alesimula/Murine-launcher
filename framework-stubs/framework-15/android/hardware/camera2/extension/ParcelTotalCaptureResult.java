package android.hardware.camera2.extension;

public class ParcelTotalCaptureResult implements android.os.Parcelable {
    public java.lang.String logicalCameraId;
    public android.hardware.camera2.impl.CameraMetadataNative results;
    public android.hardware.camera2.CaptureRequest parent;
    public int sequenceId;
    public long frameNumber;
    public java.util.List<android.hardware.camera2.extension.ParcelCaptureResult> partials;
    public int sessionId;
    public java.util.List<android.hardware.camera2.impl.PhysicalCaptureResultInfo> physicalResult;
    public static final android.os.Parcelable.Creator<android.hardware.camera2.extension.ParcelTotalCaptureResult> CREATOR = null;
    public ParcelTotalCaptureResult() {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public final void readFromParcel(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
}
