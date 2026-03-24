package android.hardware.camera2.impl;

public class CameraCaptureSessionImpl extends android.hardware.camera2.CameraCaptureSession implements android.hardware.camera2.impl.CameraCaptureSessionCore {
    CameraCaptureSessionImpl(int p0, android.view.Surface p1, android.hardware.camera2.CameraCaptureSession.StateCallback p2, java.util.concurrent.Executor p3, android.hardware.camera2.impl.CameraDeviceImpl p4, java.util.concurrent.Executor p5, boolean p6) { super(); }
    public android.hardware.camera2.CameraDevice getDevice() { return null; }
    public void prepare(android.view.Surface p0) throws android.hardware.camera2.CameraAccessException {}
    public void prepare(int p0, android.view.Surface p1) throws android.hardware.camera2.CameraAccessException {}
    public void tearDown(android.view.Surface p0) throws android.hardware.camera2.CameraAccessException {}
    public void finalizeOutputConfigurations(java.util.List<android.hardware.camera2.params.OutputConfiguration> p0) throws android.hardware.camera2.CameraAccessException {}
    public int capture(android.hardware.camera2.CaptureRequest p0, android.hardware.camera2.CameraCaptureSession.CaptureCallback p1, android.os.Handler p2) throws android.hardware.camera2.CameraAccessException { return 0; }
    public int captureSingleRequest(android.hardware.camera2.CaptureRequest p0, java.util.concurrent.Executor p1, android.hardware.camera2.CameraCaptureSession.CaptureCallback p2) throws android.hardware.camera2.CameraAccessException { return 0; }
    public int captureBurst(java.util.List<android.hardware.camera2.CaptureRequest> p0, android.hardware.camera2.CameraCaptureSession.CaptureCallback p1, android.os.Handler p2) throws android.hardware.camera2.CameraAccessException { return 0; }
    public int captureBurstRequests(java.util.List<android.hardware.camera2.CaptureRequest> p0, java.util.concurrent.Executor p1, android.hardware.camera2.CameraCaptureSession.CaptureCallback p2) throws android.hardware.camera2.CameraAccessException { return 0; }
    public int setRepeatingRequest(android.hardware.camera2.CaptureRequest p0, android.hardware.camera2.CameraCaptureSession.CaptureCallback p1, android.os.Handler p2) throws android.hardware.camera2.CameraAccessException { return 0; }
    public int setSingleRepeatingRequest(android.hardware.camera2.CaptureRequest p0, java.util.concurrent.Executor p1, android.hardware.camera2.CameraCaptureSession.CaptureCallback p2) throws android.hardware.camera2.CameraAccessException { return 0; }
    public int startStreaming(java.util.List<android.view.Surface> p0, java.util.concurrent.Executor p1, android.hardware.camera2.CameraCaptureSession.CaptureCallback p2) throws android.hardware.camera2.CameraAccessException { return 0; }
    public int setRepeatingBurst(java.util.List<android.hardware.camera2.CaptureRequest> p0, android.hardware.camera2.CameraCaptureSession.CaptureCallback p1, android.os.Handler p2) throws android.hardware.camera2.CameraAccessException { return 0; }
    public int setRepeatingBurstRequests(java.util.List<android.hardware.camera2.CaptureRequest> p0, java.util.concurrent.Executor p1, android.hardware.camera2.CameraCaptureSession.CaptureCallback p2) throws android.hardware.camera2.CameraAccessException { return 0; }
    public void stopRepeating() throws android.hardware.camera2.CameraAccessException {}
    public void abortCaptures() throws android.hardware.camera2.CameraAccessException {}
    public void updateOutputConfiguration(android.hardware.camera2.params.OutputConfiguration p0) throws android.hardware.camera2.CameraAccessException {}
    public android.hardware.camera2.CameraOfflineSession switchToOffline(java.util.Collection<android.view.Surface> p0, java.util.concurrent.Executor p1, android.hardware.camera2.CameraOfflineSession.CameraOfflineSessionCallback p2) throws android.hardware.camera2.CameraAccessException { return null; }
    public boolean supportsOfflineProcessing(android.view.Surface p0) { return false; }
    public boolean isReprocessable() { return false; }
    public android.view.Surface getInputSurface() { return null; }
    public void replaceSessionClose() {}
    public void closeWithoutDraining() {}
    public void close() {}
    public boolean isAborting() { return false; }
    public android.hardware.camera2.impl.CameraDeviceImpl.StateCallbackKK getDeviceStateCallback() { return null; }
    protected void finalize() throws java.lang.Throwable {}

    private class AbortDrainListener implements android.hardware.camera2.utils.TaskDrainer.DrainListener {
        public void onDrained() {}
    }

    private class IdleDrainListener implements android.hardware.camera2.utils.TaskDrainer.DrainListener {
        public void onDrained() {}
    }

    private class SequenceDrainListener implements android.hardware.camera2.utils.TaskDrainer.DrainListener {
        public void onDrained() {}
    }
}
