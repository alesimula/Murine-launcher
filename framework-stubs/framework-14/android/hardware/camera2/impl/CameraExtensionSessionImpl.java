package android.hardware.camera2.impl;

public final class CameraExtensionSessionImpl extends android.hardware.camera2.CameraExtensionSession {
    final java.lang.Object mInterfaceLock = null;
    @android.annotation.RequiresPermission("android.permission.CAMERA")
    public static android.hardware.camera2.impl.CameraExtensionSessionImpl createCameraExtensionSession(android.hardware.camera2.impl.CameraDeviceImpl p0, java.util.Map<java.lang.String, android.hardware.camera2.CameraCharacteristics> p1, android.content.Context p2, android.hardware.camera2.params.ExtensionSessionConfiguration p3, int p4) throws android.hardware.camera2.CameraAccessException, android.os.RemoteException { return null; }
    public CameraExtensionSessionImpl(android.hardware.camera2.extension.IImageCaptureExtenderImpl p0, android.hardware.camera2.extension.IPreviewExtenderImpl p1, java.util.List<android.util.Size> p2, long p3, android.hardware.camera2.impl.CameraDeviceImpl p4, android.view.Surface p5, android.view.Surface p6, android.view.Surface p7, android.hardware.camera2.CameraExtensionSession.StateCallback p8, java.util.concurrent.Executor p9, int p10, java.util.Set<android.hardware.camera2.CaptureRequest.Key> p11, java.util.Set<android.hardware.camera2.CaptureResult.Key> p12) { super(); }
    public synchronized void initialize() throws android.hardware.camera2.CameraAccessException, android.os.RemoteException {}
    public android.hardware.camera2.CameraDevice getDevice() { return null; }
    public android.hardware.camera2.CameraExtensionSession.StillCaptureLatency getRealtimeStillCaptureLatency() throws android.hardware.camera2.CameraAccessException { return null; }
    public int setRepeatingRequest(android.hardware.camera2.CaptureRequest p0, java.util.concurrent.Executor p1, android.hardware.camera2.CameraExtensionSession.ExtensionCaptureCallback p2) throws android.hardware.camera2.CameraAccessException { return 0; }
    public int capture(android.hardware.camera2.CaptureRequest p0, java.util.concurrent.Executor p1, android.hardware.camera2.CameraExtensionSession.ExtensionCaptureCallback p2) throws android.hardware.camera2.CameraAccessException { return 0; }
    public void stopRepeating() throws android.hardware.camera2.CameraAccessException {}
    public void close() throws android.hardware.camera2.CameraAccessException {}
    public void commitStats() {}
    public void release(boolean p0) {}

    private class BurstRequestHandler extends android.hardware.camera2.CameraCaptureSession.CaptureCallback {
        public BurstRequestHandler(android.hardware.camera2.CaptureRequest p0, java.util.concurrent.Executor p1, android.hardware.camera2.CameraExtensionSession.ExtensionCaptureCallback p2, java.util.HashMap<android.hardware.camera2.CaptureRequest, java.lang.Integer> p3, android.hardware.camera2.impl.CameraExtensionSessionImpl.CameraOutputImageCallback p4) { super(); }
        public void onCaptureStarted(android.hardware.camera2.CameraCaptureSession p0, android.hardware.camera2.CaptureRequest p1, long p2, long p3) {}
        public void onCaptureBufferLost(android.hardware.camera2.CameraCaptureSession p0, android.hardware.camera2.CaptureRequest p1, android.view.Surface p2, long p3) {}
        public void onCaptureFailed(android.hardware.camera2.CameraCaptureSession p0, android.hardware.camera2.CaptureRequest p1, android.hardware.camera2.CaptureFailure p2) {}
        public void onCaptureSequenceAborted(android.hardware.camera2.CameraCaptureSession p0, int p1) {}
        public void onCaptureSequenceCompleted(android.hardware.camera2.CameraCaptureSession p0, int p1, long p2) {}
        public void onCaptureCompleted(android.hardware.camera2.CameraCaptureSession p0, android.hardware.camera2.CaptureRequest p1, android.hardware.camera2.TotalCaptureResult p2) {}

        private class ImageCallback implements android.hardware.camera2.impl.CameraExtensionSessionImpl.OnImageAvailableListener {
            public void onImageDropped(long p0) {}
            public void onImageAvailable(android.media.ImageReader p0, android.media.Image p1) {}
        }
    }

    private class CameraOutputImageCallback implements android.media.ImageReader.OnImageAvailableListener, java.io.Closeable {
        CameraOutputImageCallback(android.hardware.camera2.impl.CameraExtensionSessionImpl p0, android.media.ImageReader p1) {}
        public void onImageAvailable(android.media.ImageReader p0) {}
        public void registerListener(java.lang.Long p0, android.hardware.camera2.impl.CameraExtensionSessionImpl.OnImageAvailableListener p1) {}
        public void close() {}
    }

    private class CaptureResultHandler extends android.hardware.camera2.extension.IProcessResultImpl.Stub {
        public CaptureResultHandler(android.hardware.camera2.impl.CameraExtensionSessionImpl p0, android.hardware.camera2.CaptureRequest p1, java.util.concurrent.Executor p2, android.hardware.camera2.CameraExtensionSession.ExtensionCaptureCallback p3, int p4) { super(); }
        public void onCaptureCompleted(long p0, android.hardware.camera2.impl.CameraMetadataNative p1) {}
        public void onCaptureProcessProgressed(int p0) {}
    }

    private class CloseRequestHandler extends android.hardware.camera2.CameraCaptureSession.CaptureCallback {
        public CloseRequestHandler(android.hardware.camera2.impl.CameraExtensionSessionImpl p0, android.hardware.camera2.impl.CameraExtensionSessionImpl.CameraOutputImageCallback p1) { super(); }
        public void onCaptureStarted(android.hardware.camera2.CameraCaptureSession p0, android.hardware.camera2.CaptureRequest p1, long p2, long p3) {}
    }

    private class ImageLoopbackCallback implements android.hardware.camera2.impl.CameraExtensionSessionImpl.OnImageAvailableListener {
        public void onImageDropped(long p0) {}
        public void onImageAvailable(android.media.ImageReader p0, android.media.Image p1) {}
    }

    private class InitializeSessionHandler extends android.hardware.camera2.extension.IInitializeSessionCallback.Stub {
        public void onSuccess() {}
        public void onFailure() {}
    }

    private class InitialRequestHandler extends android.hardware.camera2.CameraCaptureSession.CaptureCallback {
        public InitialRequestHandler(android.hardware.camera2.impl.CameraExtensionSessionImpl p0, android.hardware.camera2.impl.CameraExtensionSessionImpl.CameraOutputImageCallback p1) { super(); }
        public void onCaptureStarted(android.hardware.camera2.CameraCaptureSession p0, android.hardware.camera2.CaptureRequest p1, long p2, long p3) {}
        public void onCaptureSequenceAborted(android.hardware.camera2.CameraCaptureSession p0, int p1) {}
        public void onCaptureFailed(android.hardware.camera2.CameraCaptureSession p0, android.hardware.camera2.CaptureRequest p1, android.hardware.camera2.CaptureFailure p2) {}
        public void onCaptureSequenceCompleted(android.hardware.camera2.CameraCaptureSession p0, int p1, long p2) {}
    }

    private static interface OnImageAvailableListener {
        public void onImageDropped(long p0);
        public void onImageAvailable(android.media.ImageReader p0, android.media.Image p1);
    }

    private class PreviewRequestHandler extends android.hardware.camera2.CameraCaptureSession.CaptureCallback {
        public PreviewRequestHandler(android.hardware.camera2.impl.CameraExtensionSessionImpl p0, android.hardware.camera2.CaptureRequest p1, java.util.concurrent.Executor p2, android.hardware.camera2.CameraExtensionSession.ExtensionCaptureCallback p3, android.hardware.camera2.impl.CameraExtensionSessionImpl.CameraOutputImageCallback p4) { super(); }
        public PreviewRequestHandler(android.hardware.camera2.impl.CameraExtensionSessionImpl p0, android.hardware.camera2.CaptureRequest p1, java.util.concurrent.Executor p2, android.hardware.camera2.CameraExtensionSession.ExtensionCaptureCallback p3, android.hardware.camera2.impl.CameraExtensionSessionImpl.CameraOutputImageCallback p4, boolean p5) { super(); }
        public void onCaptureStarted(android.hardware.camera2.CameraCaptureSession p0, android.hardware.camera2.CaptureRequest p1, long p2, long p3) {}
        public void onCaptureSequenceAborted(android.hardware.camera2.CameraCaptureSession p0, int p1) {}
        public void onCaptureSequenceCompleted(android.hardware.camera2.CameraCaptureSession p0, int p1, long p2) {}
        public void onCaptureFailed(android.hardware.camera2.CameraCaptureSession p0, android.hardware.camera2.CaptureRequest p1, android.hardware.camera2.CaptureFailure p2) {}
        public void onCaptureCompleted(android.hardware.camera2.CameraCaptureSession p0, android.hardware.camera2.CaptureRequest p1, android.hardware.camera2.TotalCaptureResult p2) {}

        private class ImageForwardCallback implements android.hardware.camera2.impl.CameraExtensionSessionImpl.OnImageAvailableListener {
            public ImageForwardCallback(android.hardware.camera2.impl.CameraExtensionSessionImpl.PreviewRequestHandler p0, android.media.ImageWriter p1) {}
            public void onImageDropped(long p0) {}
            public void onImageAvailable(android.media.ImageReader p0, android.media.Image p1) {}
        }

        private class ImageProcessCallback implements android.hardware.camera2.impl.CameraExtensionSessionImpl.OnImageAvailableListener {
            public void onImageDropped(long p0) {}
            public void onImageAvailable(android.media.ImageReader p0, android.media.Image p1) {}
        }
    }

    private class SessionStateHandler extends android.hardware.camera2.CameraCaptureSession.StateCallback {
        public void onClosed(android.hardware.camera2.CameraCaptureSession p0) {}
        public void onConfigureFailed(android.hardware.camera2.CameraCaptureSession p0) {}
        public void onConfigured(android.hardware.camera2.CameraCaptureSession p0) {}
    }
}
