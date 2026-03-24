package android.hardware.camera2.impl;

public class CameraDeviceSetupImpl extends android.hardware.camera2.CameraDevice.CameraDeviceSetup {
    public CameraDeviceSetupImpl(java.lang.String p0, android.hardware.camera2.CameraManager p1, android.content.Context p2) { super(); }
    public android.hardware.camera2.CaptureRequest.Builder createCaptureRequest(int p0) throws android.hardware.camera2.CameraAccessException { return null; }
    public boolean isSessionConfigurationSupported(android.hardware.camera2.params.SessionConfiguration p0) throws android.hardware.camera2.CameraAccessException { return false; }
    public android.hardware.camera2.CameraCharacteristics getSessionCharacteristics(android.hardware.camera2.params.SessionConfiguration p0) throws android.hardware.camera2.CameraAccessException { return null; }
    public void openCamera(java.util.concurrent.Executor p0, android.hardware.camera2.CameraDevice.StateCallback p1) throws android.hardware.camera2.CameraAccessException {}
    public java.lang.String getId() { return null; }
    public int hashCode() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public java.lang.String toString() { return null; }
    public static boolean isCameraDeviceSetupSupported(android.hardware.camera2.CameraCharacteristics p0) { return false; }
}
