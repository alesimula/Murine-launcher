package android.hardware.camera2.extension;

@android.annotation.SystemApi
@android.annotation.FlaggedApi("com.android.internal.camera.flags.concert_mode")
public class ExtensionConfiguration {
    @android.annotation.FlaggedApi("com.android.internal.camera.flags.concert_mode")
    public ExtensionConfiguration(int p0, int p1, java.util.List<android.hardware.camera2.extension.ExtensionOutputConfiguration> p2, android.hardware.camera2.CaptureRequest p3) {}
    @android.annotation.FlaggedApi("com.android.internal.camera.flags.extension_10_bit")
    public void setColorSpace(int p0) {}
    @android.annotation.FlaggedApi("com.android.internal.camera.flags.concert_mode")
    android.hardware.camera2.extension.CameraSessionConfig getCameraSessionConfig() { return null; }
}
