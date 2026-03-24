package android.hardware.camera2;

public abstract class CameraCaptureSession implements java.lang.AutoCloseable {
    public static final int SESSION_ID_NONE = -1;
    public CameraCaptureSession() {}
    public abstract android.hardware.camera2.CameraDevice getDevice();
    public abstract void prepare(android.view.Surface p0) throws android.hardware.camera2.CameraAccessException;
    public abstract void prepare(int p0, android.view.Surface p1) throws android.hardware.camera2.CameraAccessException;
    public abstract void tearDown(android.view.Surface p0) throws android.hardware.camera2.CameraAccessException;
    public abstract void finalizeOutputConfigurations(java.util.List<android.hardware.camera2.params.OutputConfiguration> p0) throws android.hardware.camera2.CameraAccessException;
    public abstract int capture(android.hardware.camera2.CaptureRequest p0, android.hardware.camera2.CameraCaptureSession.CaptureCallback p1, android.os.Handler p2) throws android.hardware.camera2.CameraAccessException;
    public int captureSingleRequest(android.hardware.camera2.CaptureRequest p0, java.util.concurrent.Executor p1, android.hardware.camera2.CameraCaptureSession.CaptureCallback p2) throws android.hardware.camera2.CameraAccessException { return 0; }
    public abstract int captureBurst(java.util.List<android.hardware.camera2.CaptureRequest> p0, android.hardware.camera2.CameraCaptureSession.CaptureCallback p1, android.os.Handler p2) throws android.hardware.camera2.CameraAccessException;
    public int captureBurstRequests(java.util.List<android.hardware.camera2.CaptureRequest> p0, java.util.concurrent.Executor p1, android.hardware.camera2.CameraCaptureSession.CaptureCallback p2) throws android.hardware.camera2.CameraAccessException { return 0; }
    public abstract int setRepeatingRequest(android.hardware.camera2.CaptureRequest p0, android.hardware.camera2.CameraCaptureSession.CaptureCallback p1, android.os.Handler p2) throws android.hardware.camera2.CameraAccessException;
    public int setSingleRepeatingRequest(android.hardware.camera2.CaptureRequest p0, java.util.concurrent.Executor p1, android.hardware.camera2.CameraCaptureSession.CaptureCallback p2) throws android.hardware.camera2.CameraAccessException { return 0; }
    public abstract int setRepeatingBurst(java.util.List<android.hardware.camera2.CaptureRequest> p0, android.hardware.camera2.CameraCaptureSession.CaptureCallback p1, android.os.Handler p2) throws android.hardware.camera2.CameraAccessException;
    public int setRepeatingBurstRequests(java.util.List<android.hardware.camera2.CaptureRequest> p0, java.util.concurrent.Executor p1, android.hardware.camera2.CameraCaptureSession.CaptureCallback p2) throws android.hardware.camera2.CameraAccessException { return 0; }
    public abstract void stopRepeating() throws android.hardware.camera2.CameraAccessException;
    public abstract void abortCaptures() throws android.hardware.camera2.CameraAccessException;
    public abstract boolean isReprocessable();
    public abstract android.view.Surface getInputSurface();
    public void updateOutputConfiguration(android.hardware.camera2.params.OutputConfiguration p0) throws android.hardware.camera2.CameraAccessException {}
    public android.hardware.camera2.CameraOfflineSession switchToOffline(java.util.Collection<android.view.Surface> p0, java.util.concurrent.Executor p1, android.hardware.camera2.CameraOfflineSession.CameraOfflineSessionCallback p2) throws android.hardware.camera2.CameraAccessException { return null; }
    public boolean supportsOfflineProcessing(android.view.Surface p0) { return false; }
    public abstract void close();

    public static abstract class CaptureCallback {
        public static final int NO_FRAMES_CAPTURED = -1;
        public CaptureCallback() {}
        public void onCaptureStarted(android.hardware.camera2.CameraCaptureSession p0, android.hardware.camera2.CaptureRequest p1, long p2, long p3) {}
        public void onCapturePartial(android.hardware.camera2.CameraCaptureSession p0, android.hardware.camera2.CaptureRequest p1, android.hardware.camera2.CaptureResult p2) {}
        public void onCaptureProgressed(android.hardware.camera2.CameraCaptureSession p0, android.hardware.camera2.CaptureRequest p1, android.hardware.camera2.CaptureResult p2) {}
        public void onCaptureCompleted(android.hardware.camera2.CameraCaptureSession p0, android.hardware.camera2.CaptureRequest p1, android.hardware.camera2.TotalCaptureResult p2) {}
        public void onCaptureFailed(android.hardware.camera2.CameraCaptureSession p0, android.hardware.camera2.CaptureRequest p1, android.hardware.camera2.CaptureFailure p2) {}
        public void onCaptureSequenceCompleted(android.hardware.camera2.CameraCaptureSession p0, int p1, long p2) {}
        public void onCaptureSequenceAborted(android.hardware.camera2.CameraCaptureSession p0, int p1) {}
        public void onCaptureBufferLost(android.hardware.camera2.CameraCaptureSession p0, android.hardware.camera2.CaptureRequest p1, android.view.Surface p2, long p3) {}
    }

    public static abstract class StateCallback {
        public StateCallback() {}
        public abstract void onConfigured(android.hardware.camera2.CameraCaptureSession p0);
        public abstract void onConfigureFailed(android.hardware.camera2.CameraCaptureSession p0);
        public void onReady(android.hardware.camera2.CameraCaptureSession p0) {}
        public void onActive(android.hardware.camera2.CameraCaptureSession p0) {}
        public void onCaptureQueueEmpty(android.hardware.camera2.CameraCaptureSession p0) {}
        public void onClosed(android.hardware.camera2.CameraCaptureSession p0) {}
        public void onSurfacePrepared(android.hardware.camera2.CameraCaptureSession p0, android.view.Surface p1) {}
    }
}
