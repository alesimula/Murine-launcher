package android.hardware.camera2.params;

public final class ExtensionSessionConfiguration {
    private static final java.lang.String TAG = "ExtensionSessionConfiguration";
    private int mExtensionType;
    private java.util.List<android.hardware.camera2.params.OutputConfiguration> mOutputs;
    private java.util.concurrent.Executor mExecutor;
    private android.hardware.camera2.CameraExtensionSession.StateCallback mCallback;
    public ExtensionSessionConfiguration(int p0, java.util.List<android.hardware.camera2.params.OutputConfiguration> p1, java.util.concurrent.Executor p2, android.hardware.camera2.CameraExtensionSession.StateCallback p3) {}
    public int getExtension() { return 0; }
    public java.util.List<android.hardware.camera2.params.OutputConfiguration> getOutputConfigurations() { return null; }
    public android.hardware.camera2.CameraExtensionSession.StateCallback getStateCallback() { return null; }
    public java.util.concurrent.Executor getExecutor() { return null; }
}
