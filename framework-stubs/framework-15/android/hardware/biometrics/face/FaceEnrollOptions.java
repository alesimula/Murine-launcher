package android.hardware.biometrics.face;

public class FaceEnrollOptions implements android.os.Parcelable {
    public android.hardware.keymaster.HardwareAuthToken hardwareAuthToken;
    public byte enrollmentType;
    public byte[] features;
    @java.lang.Deprecated
    public android.hardware.common.NativeHandle nativeHandlePreview;
    public android.view.Surface surfacePreview;
    public android.hardware.biometrics.common.OperationContext context;
    public static final android.os.Parcelable.Creator<android.hardware.biometrics.face.FaceEnrollOptions> CREATOR = null;
    public FaceEnrollOptions() {}
    public final int getStability() { return 0; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public final void readFromParcel(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
}
