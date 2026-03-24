package android.hardware.camera2.impl;

public final class CameraExtensionSessionImpl extends android.hardware.camera2.CameraExtensionSession {
    private static final int PREVIEW_QUEUE_SIZE = 3;
    private static final java.lang.String TAG = "CameraExtensionSessionImpl";
    private final java.util.concurrent.Executor mExecutor = null;
    private final android.hardware.camera2.CameraDevice mCameraDevice = null;
    private final long mExtensionClientId = 0L;
    private final android.hardware.camera2.extension.IImageCaptureExtenderImpl mImageExtender = null;
    private final android.hardware.camera2.extension.IPreviewExtenderImpl mPreviewExtender = null;
    private final android.os.Handler mHandler = null;
    private final android.os.HandlerThread mHandlerThread = null;
    private final android.hardware.camera2.CameraExtensionSession.StateCallback mCallbacks = null;
    private final java.util.List<android.util.Size> mSupportedPreviewSizes = null;
    private final android.hardware.camera2.impl.CameraExtensionSessionImpl.InitializeSessionHandler mInitializeHandler = null;
    private android.hardware.camera2.CameraCaptureSession mCaptureSession;
    private android.view.Surface mCameraRepeatingSurface;
    private android.view.Surface mClientRepeatingRequestSurface;
    private android.view.Surface mCameraBurstSurface;
    private android.view.Surface mClientCaptureSurface;
    private android.media.ImageReader mRepeatingRequestImageReader;
    private android.media.ImageReader mBurstCaptureImageReader;
    private android.media.ImageReader mStubCaptureImageReader;
    private android.media.ImageWriter mRepeatingRequestImageWriter;
    private android.hardware.camera2.impl.CameraExtensionSessionImpl.CameraOutputImageCallback mRepeatingRequestImageCallback;
    private android.hardware.camera2.impl.CameraExtensionSessionImpl.CameraOutputImageCallback mBurstCaptureImageCallback;
    private android.hardware.camera2.impl.CameraExtensionJpegProcessor mImageJpegProcessor;
    private android.hardware.camera2.extension.ICaptureProcessorImpl mImageProcessor;
    private android.hardware.camera2.impl.CameraExtensionForwardProcessor mPreviewImageProcessor;
    private android.hardware.camera2.extension.IRequestUpdateProcessorImpl mPreviewRequestUpdateProcessor;
    private int mPreviewProcessorType;
    private boolean mInitialized;
    private boolean mInternalRepeatingRequestEnabled;
    final java.lang.Object mInterfaceLock = null;
    private static int nativeGetSurfaceFormat(android.view.Surface p0) { return 0; }
    @android.annotation.RequiresPermission("android.permission.CAMERA")
    public static android.hardware.camera2.impl.CameraExtensionSessionImpl createCameraExtensionSession(android.hardware.camera2.CameraDevice p0, android.content.Context p1, android.hardware.camera2.params.ExtensionSessionConfiguration p2) throws android.hardware.camera2.CameraAccessException, android.os.RemoteException { return null; }
    public CameraExtensionSessionImpl(android.hardware.camera2.extension.IImageCaptureExtenderImpl p0, android.hardware.camera2.extension.IPreviewExtenderImpl p1, java.util.List<android.util.Size> p2, long p3, android.hardware.camera2.CameraDevice p4, android.view.Surface p5, android.view.Surface p6, android.hardware.camera2.CameraExtensionSession.StateCallback p7, java.util.concurrent.Executor p8) { super(); }
    private void initializeRepeatingRequestPipeline() throws android.os.RemoteException {}
    private void initializeBurstCapturePipeline() throws android.os.RemoteException {}
    private void finishPipelineInitialization() throws android.os.RemoteException {}
    public synchronized void initialize() throws android.hardware.camera2.CameraAccessException, android.os.RemoteException {}
    public android.hardware.camera2.CameraDevice getDevice() { return null; }
    public int setRepeatingRequest(android.hardware.camera2.CaptureRequest p0, java.util.concurrent.Executor p1, android.hardware.camera2.CameraExtensionSession.ExtensionCaptureCallback p2) throws android.hardware.camera2.CameraAccessException { return 0; }
    private java.util.ArrayList<android.hardware.camera2.extension.CaptureStageImpl> compileInitialRequestList() { return null; }
    private static java.util.List<android.hardware.camera2.CaptureRequest> createBurstRequest(android.hardware.camera2.CameraDevice p0, java.util.List<android.hardware.camera2.extension.CaptureStageImpl> p1, android.hardware.camera2.CaptureRequest p2, android.view.Surface p3, int p4, java.util.Map<android.hardware.camera2.CaptureRequest, java.lang.Integer> p5) { return null; }
    private static android.hardware.camera2.CaptureRequest createRequest(android.hardware.camera2.CameraDevice p0, java.util.List<android.hardware.camera2.extension.CaptureStageImpl> p1, android.view.Surface p2, int p3) throws android.hardware.camera2.CameraAccessException { return null; }
    public int capture(android.hardware.camera2.CaptureRequest p0, java.util.concurrent.Executor p1, android.hardware.camera2.CameraExtensionSession.ExtensionCaptureCallback p2) throws android.hardware.camera2.CameraAccessException { return 0; }
    public void stopRepeating() throws android.hardware.camera2.CameraAccessException {}
    public void close() throws android.hardware.camera2.CameraAccessException {}
    private void setInitialCaptureRequest(java.util.List<android.hardware.camera2.extension.CaptureStageImpl> p0, android.hardware.camera2.impl.CameraExtensionSessionImpl.InitialRequestHandler p1) throws android.hardware.camera2.CameraAccessException {}
    private int setRepeatingRequest(android.hardware.camera2.extension.CaptureStageImpl p0, android.hardware.camera2.CameraCaptureSession.CaptureCallback p1) throws android.hardware.camera2.CameraAccessException { return 0; }
    public void release(boolean p0) {}
    private void notifyConfigurationFailure() {}
    private void notifyConfigurationSuccess() {}
    private static android.util.Size findSmallestAspectMatchedSize(java.util.List<android.util.Size> p0, android.util.Size p1) { return null; }
    private static android.hardware.camera2.extension.ParcelImage initializeParcelImage(android.media.Image p0) { return null; }
    private static java.util.List<android.hardware.camera2.extension.CaptureBundle> initializeParcelable(java.util.HashMap<java.lang.Integer, android.util.Pair<android.media.Image, android.hardware.camera2.TotalCaptureResult>> p0, java.lang.Integer p1, java.lang.Byte p2) { return null; }

    private class BurstRequestHandler extends android.hardware.camera2.CameraCaptureSession.CaptureCallback {
        private final java.util.concurrent.Executor mExecutor = null;
        private final android.hardware.camera2.CameraExtensionSession.ExtensionCaptureCallback mCallbacks = null;
        private final android.hardware.camera2.CaptureRequest mClientRequest = null;
        private final java.util.HashMap<android.hardware.camera2.CaptureRequest, java.lang.Integer> mCaptureRequestMap = null;
        private final android.hardware.camera2.impl.CameraExtensionSessionImpl.CameraOutputImageCallback mBurstImageCallback = null;
        private java.util.HashMap<java.lang.Integer, android.util.Pair<android.media.Image, android.hardware.camera2.TotalCaptureResult>> mCaptureStageMap;
        private android.util.LongSparseArray<android.util.Pair<android.media.Image, java.lang.Integer>> mCapturePendingMap;
        private android.hardware.camera2.impl.CameraExtensionSessionImpl.BurstRequestHandler.ImageCallback mImageCallback;
        private boolean mCaptureFailed;
        public BurstRequestHandler(android.hardware.camera2.CaptureRequest p0, java.util.concurrent.Executor p1, android.hardware.camera2.CameraExtensionSession.ExtensionCaptureCallback p2, java.util.HashMap<android.hardware.camera2.CaptureRequest, java.lang.Integer> p3, android.hardware.camera2.impl.CameraExtensionSessionImpl.CameraOutputImageCallback p4) { super(); }
        private void notifyCaptureFailed() {}
        public void onCaptureStarted(android.hardware.camera2.CameraCaptureSession p0, android.hardware.camera2.CaptureRequest p1, long p2, long p3) {}
        public void onCaptureBufferLost(android.hardware.camera2.CameraCaptureSession p0, android.hardware.camera2.CaptureRequest p1, android.view.Surface p2, long p3) {}
        public void onCaptureFailed(android.hardware.camera2.CameraCaptureSession p0, android.hardware.camera2.CaptureRequest p1, android.hardware.camera2.CaptureFailure p2) {}
        public void onCaptureSequenceAborted(android.hardware.camera2.CameraCaptureSession p0, int p1) {}
        public void onCaptureSequenceCompleted(android.hardware.camera2.CameraCaptureSession p0, int p1, long p2) {}
        public void onCaptureCompleted(android.hardware.camera2.CameraCaptureSession p0, android.hardware.camera2.CaptureRequest p1, android.hardware.camera2.TotalCaptureResult p2) {}
        private void checkAndFireBurstProcessing() {}

        private class ImageCallback implements android.hardware.camera2.impl.CameraExtensionSessionImpl.OnImageAvailableListener {
            private ImageCallback(android.hardware.camera2.impl.CameraExtensionSessionImpl.BurstRequestHandler p0) {}
            public void onImageAvailable(android.media.ImageReader p0, android.media.Image p1) {}
        }
    }

    private class CameraOutputImageCallback implements android.media.ImageReader.OnImageAvailableListener, java.io.Closeable {
        private final android.media.ImageReader mImageReader = null;
        private java.util.HashMap<java.lang.Long, android.util.Pair<android.media.Image, android.hardware.camera2.impl.CameraExtensionSessionImpl.OnImageAvailableListener>> mImageListenerMap;
        private boolean mOutOfBuffers;
        CameraOutputImageCallback(android.hardware.camera2.impl.CameraExtensionSessionImpl p0, android.media.ImageReader p1) {}
        public void onImageAvailable(android.media.ImageReader p0) {}
        public void registerListener(java.lang.Long p0, android.hardware.camera2.impl.CameraExtensionSessionImpl.OnImageAvailableListener p1) {}
        public void close() {}
    }

    private class CloseRequestHandler extends android.hardware.camera2.CameraCaptureSession.CaptureCallback {
        private final android.hardware.camera2.impl.CameraExtensionSessionImpl.CameraOutputImageCallback mImageCallback = null;
        public CloseRequestHandler(android.hardware.camera2.impl.CameraExtensionSessionImpl p0, android.hardware.camera2.impl.CameraExtensionSessionImpl.CameraOutputImageCallback p1) { super(); }
        public void onCaptureStarted(android.hardware.camera2.CameraCaptureSession p0, android.hardware.camera2.CaptureRequest p1, long p2, long p3) {}
    }

    private class ImageLoopbackCallback implements android.hardware.camera2.impl.CameraExtensionSessionImpl.OnImageAvailableListener {
        private ImageLoopbackCallback(android.hardware.camera2.impl.CameraExtensionSessionImpl p0) {}
        public void onImageAvailable(android.media.ImageReader p0, android.media.Image p1) {}
    }

    private class InitialRequestHandler extends android.hardware.camera2.CameraCaptureSession.CaptureCallback {
        private final android.hardware.camera2.impl.CameraExtensionSessionImpl.CameraOutputImageCallback mImageCallback = null;
        public InitialRequestHandler(android.hardware.camera2.impl.CameraExtensionSessionImpl p0, android.hardware.camera2.impl.CameraExtensionSessionImpl.CameraOutputImageCallback p1) { super(); }
        public void onCaptureStarted(android.hardware.camera2.CameraCaptureSession p0, android.hardware.camera2.CaptureRequest p1, long p2, long p3) {}
        public void onCaptureSequenceAborted(android.hardware.camera2.CameraCaptureSession p0, int p1) {}
        public void onCaptureFailed(android.hardware.camera2.CameraCaptureSession p0, android.hardware.camera2.CaptureRequest p1, android.hardware.camera2.CaptureFailure p2) {}
        public void onCaptureSequenceCompleted(android.hardware.camera2.CameraCaptureSession p0, int p1, long p2) {}
    }

    private class InitializeSessionHandler extends android.hardware.camera2.extension.IInitializeSessionCallback.Stub {
        private InitializeSessionHandler(android.hardware.camera2.impl.CameraExtensionSessionImpl p0) { super(); }
        public void onSuccess() {}
        public void onFailure() {}
    }

    private static interface OnImageAvailableListener {
        public void onImageAvailable(android.media.ImageReader p0, android.media.Image p1);
    }

    private class RepeatingRequestHandler extends android.hardware.camera2.CameraCaptureSession.CaptureCallback {
        private final java.util.concurrent.Executor mExecutor = null;
        private final android.hardware.camera2.CameraExtensionSession.ExtensionCaptureCallback mCallbacks = null;
        private final android.hardware.camera2.CaptureRequest mClientRequest = null;
        private final boolean mClientNotificationsEnabled = false;
        private final android.hardware.camera2.impl.CameraExtensionSessionImpl.CameraOutputImageCallback mRepeatingImageCallback = null;
        private android.hardware.camera2.impl.CameraExtensionSessionImpl.OnImageAvailableListener mImageCallback;
        private android.util.LongSparseArray<android.util.Pair<android.media.Image, android.hardware.camera2.TotalCaptureResult>> mPendingResultMap;
        private boolean mRequestUpdatedNeeded;
        public RepeatingRequestHandler(android.hardware.camera2.impl.CameraExtensionSessionImpl p0, android.hardware.camera2.CaptureRequest p1, java.util.concurrent.Executor p2, android.hardware.camera2.CameraExtensionSession.ExtensionCaptureCallback p3, android.hardware.camera2.impl.CameraExtensionSessionImpl.CameraOutputImageCallback p4) { super(); }
        public void onCaptureStarted(android.hardware.camera2.CameraCaptureSession p0, android.hardware.camera2.CaptureRequest p1, long p2, long p3) {}
        public void onCaptureSequenceAborted(android.hardware.camera2.CameraCaptureSession p0, int p1) {}
        public void onCaptureSequenceCompleted(android.hardware.camera2.CameraCaptureSession p0, int p1, long p2) {}
        public void onCaptureFailed(android.hardware.camera2.CameraCaptureSession p0, android.hardware.camera2.CaptureRequest p1, android.hardware.camera2.CaptureFailure p2) {}
        public void onCaptureCompleted(android.hardware.camera2.CameraCaptureSession p0, android.hardware.camera2.CaptureRequest p1, android.hardware.camera2.TotalCaptureResult p2) {}
        private void resumeInternalRepeatingRequest(boolean p0) {}
        private java.lang.Long calculatePruneThreshold(android.util.LongSparseArray<android.util.Pair<android.media.Image, android.hardware.camera2.TotalCaptureResult>> p0) { return null; }
        private void discardPendingRepeatingResults(int p0, android.util.LongSparseArray<android.util.Pair<android.media.Image, android.hardware.camera2.TotalCaptureResult>> p1, boolean p2) {}

        private class ImageForwardCallback implements android.hardware.camera2.impl.CameraExtensionSessionImpl.OnImageAvailableListener {
            private final android.media.ImageWriter mOutputWriter = null;
            public ImageForwardCallback(android.hardware.camera2.impl.CameraExtensionSessionImpl.RepeatingRequestHandler p0, android.media.ImageWriter p1) {}
            public void onImageAvailable(android.media.ImageReader p0, android.media.Image p1) {}
        }

        private class ImageProcessCallback implements android.hardware.camera2.impl.CameraExtensionSessionImpl.OnImageAvailableListener {
            private ImageProcessCallback(android.hardware.camera2.impl.CameraExtensionSessionImpl.RepeatingRequestHandler p0) {}
            public void onImageAvailable(android.media.ImageReader p0, android.media.Image p1) {}
        }
    }

    private class SessionStateHandler extends android.hardware.camera2.CameraCaptureSession.StateCallback {
        private SessionStateHandler(android.hardware.camera2.impl.CameraExtensionSessionImpl p0) { super(); }
        public void onClosed(android.hardware.camera2.CameraCaptureSession p0) {}
        public void onConfigureFailed(android.hardware.camera2.CameraCaptureSession p0) {}
        public void onConfigured(android.hardware.camera2.CameraCaptureSession p0) {}
    }
}
