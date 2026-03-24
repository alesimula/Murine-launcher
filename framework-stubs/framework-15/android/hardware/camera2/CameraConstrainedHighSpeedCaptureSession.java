package android.hardware.camera2;

public abstract class CameraConstrainedHighSpeedCaptureSession extends android.hardware.camera2.CameraCaptureSession {
    public CameraConstrainedHighSpeedCaptureSession() { super(); }
    @android.annotation.NonNull
    public abstract java.util.List<android.hardware.camera2.CaptureRequest> createHighSpeedRequestList(android.hardware.camera2.CaptureRequest p0) throws android.hardware.camera2.CameraAccessException;
}
