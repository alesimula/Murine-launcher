package android.hardware.camera2.impl;

public final class CameraAdvancedExtensionSessionImpl extends android.hardware.camera2.CameraExtensionSession {
    final java.lang.Object mInterfaceLock = null;
    @android.annotation.RequiresPermission("android.permission.CAMERA")
    public static android.hardware.camera2.impl.CameraAdvancedExtensionSessionImpl createCameraAdvancedExtensionSession(android.hardware.camera2.impl.CameraDeviceImpl p0, java.util.Map<java.lang.String, android.hardware.camera2.CameraCharacteristics> p1, android.content.Context p2, android.hardware.camera2.params.ExtensionSessionConfiguration p3, int p4, android.os.IBinder p5) throws android.hardware.camera2.CameraAccessException, android.os.RemoteException { return null; }
    public synchronized void initialize() throws android.hardware.camera2.CameraAccessException, android.os.RemoteException {}
    @android.annotation.NonNull
    public android.hardware.camera2.CameraDevice getDevice() { return null; }
    public android.hardware.camera2.CameraExtensionSession.StillCaptureLatency getRealtimeStillCaptureLatency() throws android.hardware.camera2.CameraAccessException { return null; }
    public int setRepeatingRequest(android.hardware.camera2.CaptureRequest p0, java.util.concurrent.Executor p1, android.hardware.camera2.CameraExtensionSession.ExtensionCaptureCallback p2) throws android.hardware.camera2.CameraAccessException { return 0; }
    public int capture(android.hardware.camera2.CaptureRequest p0, java.util.concurrent.Executor p1, android.hardware.camera2.CameraExtensionSession.ExtensionCaptureCallback p2) throws android.hardware.camera2.CameraAccessException { return 0; }
    public void stopRepeating() throws android.hardware.camera2.CameraAccessException {}
    public void close() throws android.hardware.camera2.CameraAccessException {}
    public void commitStats() {}
    public void release(boolean p0) {}

    private final class CaptureCallbackHandler extends android.hardware.camera2.CameraCaptureSession.CaptureCallback {
        public CaptureCallbackHandler(android.hardware.camera2.impl.CameraAdvancedExtensionSessionImpl p0, android.hardware.camera2.extension.IRequestCallback p1) { super(); }
        public void onCaptureBufferLost(android.hardware.camera2.CameraCaptureSession p0, android.hardware.camera2.CaptureRequest p1, android.view.Surface p2, long p3) {}
        public void onCaptureCompleted(android.hardware.camera2.CameraCaptureSession p0, android.hardware.camera2.CaptureRequest p1, android.hardware.camera2.TotalCaptureResult p2) {}
        public void onCaptureFailed(android.hardware.camera2.CameraCaptureSession p0, android.hardware.camera2.CaptureRequest p1, android.hardware.camera2.CaptureFailure p2) {}
        public void onCaptureProgressed(android.hardware.camera2.CameraCaptureSession p0, android.hardware.camera2.CaptureRequest p1, android.hardware.camera2.CaptureResult p2) {}
        public void onCaptureSequenceAborted(android.hardware.camera2.CameraCaptureSession p0, int p1) {}
        public void onCaptureSequenceCompleted(android.hardware.camera2.CameraCaptureSession p0, int p1, long p2) {}
        public void onCaptureStarted(android.hardware.camera2.CameraCaptureSession p0, android.hardware.camera2.CaptureRequest p1, long p2, long p3) {}
    }

    private static final class ImageReaderHandler implements android.media.ImageReader.OnImageAvailableListener {
        public void onImageAvailable(android.media.ImageReader p0) {}
    }

    private class InitializeSessionHandler extends android.hardware.camera2.extension.IInitializeSessionCallback.Stub {
        public void onSuccess() {}
        public void onFailure() {}
    }

    private final class RequestCallbackHandler extends android.hardware.camera2.extension.ICaptureCallback.Stub {
        public void onCaptureStarted(int p0, long p1) {}
        public void onCaptureProcessStarted(int p0) {}
        public void onCaptureFailed(int p0) {}
        public void onCaptureProcessFailed(int p0, int p1) {}
        public void onCaptureSequenceCompleted(int p0) {}
        public void onCaptureSequenceAborted(int p0) {}
        public void onCaptureCompleted(long p0, int p1, android.hardware.camera2.impl.CameraMetadataNative p2) {}
        public void onCaptureProcessProgressed(int p0) {}
    }

    private final class RequestProcessor extends android.hardware.camera2.extension.IRequestProcessorImpl.Stub {
        public void setImageProcessor(android.hardware.camera2.extension.OutputConfigId p0, android.hardware.camera2.extension.IImageProcessorImpl p1) {}
        public int submit(android.hardware.camera2.extension.Request p0, android.hardware.camera2.extension.IRequestCallback p1) { return 0; }
        public int submitBurst(java.util.List<android.hardware.camera2.extension.Request> p0, android.hardware.camera2.extension.IRequestCallback p1) { return 0; }
        public int setRepeating(android.hardware.camera2.extension.Request p0, android.hardware.camera2.extension.IRequestCallback p1) { return 0; }
        public void abortCaptures() {}
        public void stopRepeating() {}
    }

    private class SessionStateHandler extends android.hardware.camera2.CameraCaptureSession.StateCallback {
        public void onClosed(android.hardware.camera2.CameraCaptureSession p0) {}
        public void onConfigureFailed(android.hardware.camera2.CameraCaptureSession p0) {}
        public void onConfigured(android.hardware.camera2.CameraCaptureSession p0) {}
    }
}
