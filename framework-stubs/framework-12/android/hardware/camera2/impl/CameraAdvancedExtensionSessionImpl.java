package android.hardware.camera2.impl;

public final class CameraAdvancedExtensionSessionImpl extends android.hardware.camera2.CameraExtensionSession {
    private static final java.lang.String TAG = "CameraAdvancedExtensionSessionImpl";
    private final java.util.concurrent.Executor mExecutor = null;
    private final android.hardware.camera2.CameraDevice mCameraDevice = null;
    private final long mExtensionClientId = 0L;
    private final android.os.Handler mHandler = null;
    private final android.os.HandlerThread mHandlerThread = null;
    private final android.hardware.camera2.CameraExtensionSession.StateCallback mCallbacks = null;
    private final android.hardware.camera2.extension.IAdvancedExtenderImpl mAdvancedExtender = null;
    private final java.util.HashMap<android.view.Surface, android.hardware.camera2.extension.CameraOutputConfig> mCameraConfigMap = null;
    private final java.util.HashMap<java.lang.Integer, android.media.ImageReader> mReaderMap = null;
    private final android.hardware.camera2.impl.CameraAdvancedExtensionSessionImpl.RequestProcessor mRequestProcessor = null;
    private android.view.Surface mClientRepeatingRequestSurface;
    private android.view.Surface mClientCaptureSurface;
    private android.hardware.camera2.CameraCaptureSession mCaptureSession;
    private android.hardware.camera2.extension.ISessionProcessorImpl mSessionProcessor;
    private final android.hardware.camera2.impl.CameraAdvancedExtensionSessionImpl.InitializeSessionHandler mInitializeHandler = null;
    private boolean mInitialized;
    final java.lang.Object mInterfaceLock = null;
    @android.annotation.RequiresPermission("android.permission.CAMERA")
    public static android.hardware.camera2.impl.CameraAdvancedExtensionSessionImpl createCameraAdvancedExtensionSession(android.hardware.camera2.CameraDevice p0, android.content.Context p1, android.hardware.camera2.params.ExtensionSessionConfiguration p2) throws android.hardware.camera2.CameraAccessException, android.os.RemoteException { return null; }
    private CameraAdvancedExtensionSessionImpl(long p0, android.hardware.camera2.extension.IAdvancedExtenderImpl p1, android.hardware.camera2.CameraDevice p2, android.view.Surface p3, android.view.Surface p4, android.hardware.camera2.CameraExtensionSession.StateCallback p5, java.util.concurrent.Executor p6) { super(); }
    public synchronized void initialize() throws android.hardware.camera2.CameraAccessException, android.os.RemoteException {}
    private static android.hardware.camera2.extension.ParcelCaptureResult initializeParcelable(android.hardware.camera2.CaptureResult p0) { return null; }
    private static android.hardware.camera2.extension.ParcelTotalCaptureResult initializeParcelable(android.hardware.camera2.TotalCaptureResult p0) { return null; }
    private static android.hardware.camera2.extension.OutputSurface initializeParcelable(android.view.Surface p0) { return null; }
    public android.hardware.camera2.CameraDevice getDevice() { return null; }
    public int setRepeatingRequest(android.hardware.camera2.CaptureRequest p0, java.util.concurrent.Executor p1, android.hardware.camera2.CameraExtensionSession.ExtensionCaptureCallback p2) throws android.hardware.camera2.CameraAccessException { return 0; }
    public int capture(android.hardware.camera2.CaptureRequest p0, java.util.concurrent.Executor p1, android.hardware.camera2.CameraExtensionSession.ExtensionCaptureCallback p2) throws android.hardware.camera2.CameraAccessException { return 0; }
    public void stopRepeating() throws android.hardware.camera2.CameraAccessException {}
    public void close() throws android.hardware.camera2.CameraAccessException {}
    public void release(boolean p0) {}
    private void notifyConfigurationFailure() {}
    private static android.hardware.camera2.CaptureRequest initializeCaptureRequest(android.hardware.camera2.CameraDevice p0, android.hardware.camera2.extension.Request p1, java.util.HashMap<android.view.Surface, android.hardware.camera2.extension.CameraOutputConfig> p2) throws android.hardware.camera2.CameraAccessException { return null; }

    private final class CaptureCallbackHandler extends android.hardware.camera2.CameraCaptureSession.CaptureCallback {
        private final android.hardware.camera2.extension.IRequestCallback mCallback = null;
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
        private final android.hardware.camera2.extension.OutputConfigId mOutputConfigId = null;
        private final android.hardware.camera2.extension.IImageProcessorImpl mIImageProcessor = null;
        private final java.lang.String mPhysicalCameraId = null;
        private ImageReaderHandler(int p0, android.hardware.camera2.extension.IImageProcessorImpl p1, java.lang.String p2) {}
        public void onImageAvailable(android.media.ImageReader p0) {}
    }

    private class InitializeSessionHandler extends android.hardware.camera2.extension.IInitializeSessionCallback.Stub {
        private InitializeSessionHandler(android.hardware.camera2.impl.CameraAdvancedExtensionSessionImpl p0) { super(); }
        public void onSuccess() {}
        public void onFailure() {}
    }

    private final class RequestCallbackHandler extends android.hardware.camera2.extension.ICaptureCallback.Stub {
        private final android.hardware.camera2.CaptureRequest mClientRequest = null;
        private final java.util.concurrent.Executor mClientExecutor = null;
        private final android.hardware.camera2.CameraExtensionSession.ExtensionCaptureCallback mClientCallbacks = null;
        private RequestCallbackHandler(android.hardware.camera2.impl.CameraAdvancedExtensionSessionImpl p0, android.hardware.camera2.CaptureRequest p1, java.util.concurrent.Executor p2, android.hardware.camera2.CameraExtensionSession.ExtensionCaptureCallback p3) { super(); }
        public void onCaptureStarted(int p0, long p1) {}
        public void onCaptureProcessStarted(int p0) {}
        public void onCaptureFailed(int p0) {}
        public void onCaptureSequenceCompleted(int p0) {}
        public void onCaptureSequenceAborted(int p0) {}
    }

    private final class RequestProcessor extends android.hardware.camera2.extension.IRequestProcessorImpl.Stub {
        private RequestProcessor(android.hardware.camera2.impl.CameraAdvancedExtensionSessionImpl p0) { super(); }
        public void setImageProcessor(android.hardware.camera2.extension.OutputConfigId p0, android.hardware.camera2.extension.IImageProcessorImpl p1) {}
        public int submit(android.hardware.camera2.extension.Request p0, android.hardware.camera2.extension.IRequestCallback p1) { return 0; }
        public int submitBurst(java.util.List<android.hardware.camera2.extension.Request> p0, android.hardware.camera2.extension.IRequestCallback p1) { return 0; }
        public int setRepeating(android.hardware.camera2.extension.Request p0, android.hardware.camera2.extension.IRequestCallback p1) { return 0; }
        public void abortCaptures() {}
        public void stopRepeating() {}
    }

    private class SessionStateHandler extends android.hardware.camera2.CameraCaptureSession.StateCallback {
        private SessionStateHandler(android.hardware.camera2.impl.CameraAdvancedExtensionSessionImpl p0) { super(); }
        public void onClosed(android.hardware.camera2.CameraCaptureSession p0) {}
        public void onConfigureFailed(android.hardware.camera2.CameraCaptureSession p0) {}
        public void onConfigured(android.hardware.camera2.CameraCaptureSession p0) {}
    }
}
