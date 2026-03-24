package android.hardware.camera2.extension;

@android.annotation.SystemApi
@android.annotation.FlaggedApi("com.android.internal.camera.flags.concert_mode")
public final class CameraOutputSurface {
    @android.annotation.FlaggedApi("com.android.internal.camera.flags.concert_mode")
    CameraOutputSurface(android.hardware.camera2.extension.OutputSurface p0) {}
    @android.annotation.FlaggedApi("com.android.internal.camera.flags.concert_mode")
    public CameraOutputSurface(android.view.Surface p0, android.util.Size p1) {}
    @android.annotation.FlaggedApi("com.android.internal.camera.flags.concert_mode")
    @android.annotation.NonNull
    public android.view.Surface getSurface() { return null; }
    @android.annotation.FlaggedApi("com.android.internal.camera.flags.concert_mode")
    @android.annotation.NonNull
    public android.util.Size getSize() { return null; }
    @android.annotation.FlaggedApi("com.android.internal.camera.flags.concert_mode")
    public int getImageFormat() { return 0; }
    @android.annotation.FlaggedApi("com.android.internal.camera.flags.extension_10_bit")
    public long getDynamicRangeProfile() { return 0L; }
    @android.annotation.SuppressLint("MethodNameUnits")
    @android.annotation.FlaggedApi("com.android.internal.camera.flags.extension_10_bit")
    public int getColorSpace() { return 0; }
    @android.annotation.FlaggedApi("com.android.internal.camera.flags.extension_10_bit")
    public void setDynamicRangeProfile(long p0) {}
}
