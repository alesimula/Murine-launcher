package android.hardware.camera2.params;

public final class ExtensionSessionConfiguration {
    public ExtensionSessionConfiguration(int p0, java.util.List<android.hardware.camera2.params.OutputConfiguration> p1, java.util.concurrent.Executor p2, android.hardware.camera2.CameraExtensionSession.StateCallback p3) {}
    public int getExtension() { return 0; }
    public void setPostviewOutputConfiguration(android.hardware.camera2.params.OutputConfiguration p0) {}
    @android.annotation.Nullable
    public android.hardware.camera2.params.OutputConfiguration getPostviewOutputConfiguration() { return null; }
    @android.annotation.NonNull
    public java.util.List<android.hardware.camera2.params.OutputConfiguration> getOutputConfigurations() { return null; }
    @android.annotation.NonNull
    public android.hardware.camera2.CameraExtensionSession.StateCallback getStateCallback() { return null; }
    @android.annotation.NonNull
    public java.util.concurrent.Executor getExecutor() { return null; }
    @android.annotation.FlaggedApi("com.android.internal.camera.flags.extension_10_bit")
    public void setColorSpace(android.graphics.ColorSpace.Named p0) {}
    @android.annotation.FlaggedApi("com.android.internal.camera.flags.extension_10_bit")
    public void clearColorSpace() {}
    @android.annotation.FlaggedApi("com.android.internal.camera.flags.extension_10_bit")
    @android.annotation.SuppressLint("MethodNameUnits")
    @android.annotation.Nullable
    public android.graphics.ColorSpace getColorSpace() { return null; }
}
