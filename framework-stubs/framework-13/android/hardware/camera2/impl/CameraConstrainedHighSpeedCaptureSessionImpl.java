package android.hardware.camera2.impl;

public class CameraConstrainedHighSpeedCaptureSessionImpl extends android.hardware.camera2.CameraConstrainedHighSpeedCaptureSession implements android.hardware.camera2.impl.CameraCaptureSessionCore {
    CameraConstrainedHighSpeedCaptureSessionImpl(int p0, android.hardware.camera2.CameraCaptureSession.StateCallback p1, java.util.concurrent.Executor p2, android.hardware.camera2.impl.CameraDeviceImpl p3, java.util.concurrent.Executor p4, boolean p5, android.hardware.camera2.CameraCharacteristics p6) { super(); }
    public java.util.List<android.hardware.camera2.CaptureRequest> createHighSpeedRequestList(android.hardware.camera2.CaptureRequest p0) throws android.hardware.camera2.CameraAccessException { return null; }
    public android.hardware.camera2.CameraDevice getDevice() { return null; }
    public void prepare(android.view.Surface p0) throws android.hardware.camera2.CameraAccessException {}
    public void prepare(int p0, android.view.Surface p1) throws android.hardware.camera2.CameraAccessException {}
    public void tearDown(android.view.Surface p0) throws android.hardware.camera2.CameraAccessException {}
    public int capture(android.hardware.camera2.CaptureRequest p0, android.hardware.camera2.CameraCaptureSession.CaptureCallback p1, android.os.Handler p2) throws android.hardware.camera2.CameraAccessException { return 0; }
    public int captureSingleRequest(android.hardware.camera2.CaptureRequest p0, java.util.concurrent.Executor p1, android.hardware.camera2.CameraCaptureSession.CaptureCallback p2) throws android.hardware.camera2.CameraAccessException { return 0; }
    public int captureBurst(java.util.List<android.hardware.camera2.CaptureRequest> p0, android.hardware.camera2.CameraCaptureSession.CaptureCallback p1, android.os.Handler p2) throws android.hardware.camera2.CameraAccessException { return 0; }
    public int captureBurstRequests(java.util.List<android.hardware.camera2.CaptureRequest> p0, java.util.concurrent.Executor p1, android.hardware.camera2.CameraCaptureSession.CaptureCallback p2) throws android.hardware.camera2.CameraAccessException { return 0; }
    public int setRepeatingRequest(android.hardware.camera2.CaptureRequest p0, android.hardware.camera2.CameraCaptureSession.CaptureCallback p1, android.os.Handler p2) throws android.hardware.camera2.CameraAccessException { return 0; }
    public int setSingleRepeatingRequest(android.hardware.camera2.CaptureRequest p0, java.util.concurrent.Executor p1, android.hardware.camera2.CameraCaptureSession.CaptureCallback p2) throws android.hardware.camera2.CameraAccessException { return 0; }
    public int setRepeatingBurst(java.util.List<android.hardware.camera2.CaptureRequest> p0, android.hardware.camera2.CameraCaptureSession.CaptureCallback p1, android.os.Handler p2) throws android.hardware.camera2.CameraAccessException { return 0; }
    public int setRepeatingBurstRequests(java.util.List<android.hardware.camera2.CaptureRequest> p0, java.util.concurrent.Executor p1, android.hardware.camera2.CameraCaptureSession.CaptureCallback p2) throws android.hardware.camera2.CameraAccessException { return 0; }
    public void stopRepeating() throws android.hardware.camera2.CameraAccessException {}
    public void abortCaptures() throws android.hardware.camera2.CameraAccessException {}
    public android.view.Surface getInputSurface() { return null; }
    public void updateOutputConfiguration(android.hardware.camera2.params.OutputConfiguration p0) throws android.hardware.camera2.CameraAccessException {}
    public android.hardware.camera2.CameraOfflineSession switchToOffline(java.util.Collection<android.view.Surface> p0, java.util.concurrent.Executor p1, android.hardware.camera2.CameraOfflineSession.CameraOfflineSessionCallback p2) throws android.hardware.camera2.CameraAccessException { return null; }
    public boolean supportsOfflineProcessing(android.view.Surface p0) { return false; }
    public void closeWithoutDraining() {}
    public void close() {}
    public boolean isReprocessable() { return false; }
    public void replaceSessionClose() {}
    public android.hardware.camera2.impl.CameraDeviceImpl.StateCallbackKK getDeviceStateCallback() { return null; }
    public boolean isAborting() { return false; }
    public void finalizeOutputConfigurations(java.util.List<android.hardware.camera2.params.OutputConfiguration> p0) throws android.hardware.camera2.CameraAccessException {}

    private class WrapperCallback extends android.hardware.camera2.CameraCaptureSession.StateCallback {
        public WrapperCallback(android.hardware.camera2.impl.CameraConstrainedHighSpeedCaptureSessionImpl p0, android.hardware.camera2.CameraCaptureSession.StateCallback p1) { super(); }
        public void onConfigured(android.hardware.camera2.CameraCaptureSession p0) {}
        public void onConfigureFailed(android.hardware.camera2.CameraCaptureSession p0) {}
        public void onReady(android.hardware.camera2.CameraCaptureSession p0) {}
        public void onActive(android.hardware.camera2.CameraCaptureSession p0) {}
        public void onCaptureQueueEmpty(android.hardware.camera2.CameraCaptureSession p0) {}
        public void onClosed(android.hardware.camera2.CameraCaptureSession p0) {}
        public void onSurfacePrepared(android.hardware.camera2.CameraCaptureSession p0, android.view.Surface p1) {}
    }
}
