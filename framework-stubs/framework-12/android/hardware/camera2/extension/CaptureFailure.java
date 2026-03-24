package android.hardware.camera2.extension;

public class CaptureFailure implements android.os.Parcelable {
    public android.hardware.camera2.CaptureRequest request;
    public int reason;
    public boolean dropped;
    public int sequenceId;
    public long frameNumber;
    public java.lang.String errorPhysicalCameraId;
    public static final android.os.Parcelable.Creator<android.hardware.camera2.extension.CaptureFailure> CREATOR = null;
    public CaptureFailure() {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public final void readFromParcel(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
    private int describeContents(java.lang.Object p0) { return 0; }
}
