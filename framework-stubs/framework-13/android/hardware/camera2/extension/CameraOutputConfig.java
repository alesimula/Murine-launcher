package android.hardware.camera2.extension;

public class CameraOutputConfig implements android.os.Parcelable {
    public android.hardware.camera2.extension.Size size;
    public android.view.Surface surface;
    public int imageFormat;
    public int capacity;
    public int type;
    public android.hardware.camera2.extension.OutputConfigId outputId;
    public int surfaceGroupId;
    public java.lang.String physicalCameraId;
    public java.util.List<android.hardware.camera2.extension.CameraOutputConfig> sharedSurfaceConfigs;
    public boolean isMultiResolutionOutput;
    public static final android.os.Parcelable.Creator<android.hardware.camera2.extension.CameraOutputConfig> CREATOR = null;
    public static final int TYPE_SURFACE = 0;
    public static final int TYPE_IMAGEREADER = 1;
    public static final int TYPE_MULTIRES_IMAGEREADER = 2;
    public CameraOutputConfig() {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public final void readFromParcel(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
}
