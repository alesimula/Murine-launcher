package android.hardware.camera2.extension;

@android.annotation.SystemApi
public final class CameraOutputSurface {
    CameraOutputSurface(android.hardware.camera2.extension.OutputSurface p0) {}
    public CameraOutputSurface(android.view.Surface p0, android.util.Size p1) {}
    @android.annotation.NonNull
    public android.view.Surface getSurface() { return null; }
    @android.annotation.NonNull
    public android.util.Size getSize() { return null; }
    public int getImageFormat() { return 0; }
    public long getDynamicRangeProfile() { return 0L; }
    @android.annotation.SuppressLint("MethodNameUnits")
    public int getColorSpace() { return 0; }
    public void setDynamicRangeProfile(long p0) {}
}
