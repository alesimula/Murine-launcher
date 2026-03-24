package android.hardware.camera2.extension;

public class CameraSessionConfig implements android.os.Parcelable {
    public java.util.List<android.hardware.camera2.extension.CameraOutputConfig> outputConfigs;
    public android.hardware.camera2.impl.CameraMetadataNative sessionParameter;
    public int sessionTemplateId;
    public static final android.os.Parcelable.Creator<android.hardware.camera2.extension.CameraSessionConfig> CREATOR = null;
    public CameraSessionConfig() {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public final void readFromParcel(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
    private int describeContents(java.lang.Object p0) { return 0; }
}
