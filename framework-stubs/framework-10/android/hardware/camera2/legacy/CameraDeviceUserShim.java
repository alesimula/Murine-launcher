package android.hardware.camera2.legacy;

public class CameraDeviceUserShim implements android.hardware.camera2.ICameraDeviceUser {
    private static final java.lang.String TAG = "CameraDeviceUserShim";
    private static final boolean DEBUG = false;
    private static final int OPEN_CAMERA_TIMEOUT_MS = 5000;
    private final android.hardware.camera2.legacy.LegacyCameraDevice mLegacyDevice = null;
    private final java.lang.Object mConfigureLock = null;
    private int mSurfaceIdCounter;
    private boolean mConfiguring;
    private final android.util.SparseArray<android.view.Surface> mSurfaces = null;
    private final android.hardware.camera2.CameraCharacteristics mCameraCharacteristics = null;
    private final android.hardware.camera2.legacy.CameraDeviceUserShim.CameraLooper mCameraInit = null;
    private final android.hardware.camera2.legacy.CameraDeviceUserShim.CameraCallbackThread mCameraCallbacks = null;
    protected CameraDeviceUserShim(int p0, android.hardware.camera2.legacy.LegacyCameraDevice p1, android.hardware.camera2.CameraCharacteristics p2, android.hardware.camera2.legacy.CameraDeviceUserShim.CameraLooper p3, android.hardware.camera2.legacy.CameraDeviceUserShim.CameraCallbackThread p4) {}
    private static int translateErrorsFromCamera1(int p0) { return 0; }
    public static android.hardware.camera2.legacy.CameraDeviceUserShim connectBinderShim(android.hardware.camera2.ICameraDeviceCallbacks p0, int p1, android.util.Size p2) { return null; }
    public void disconnect() {}
    public android.hardware.camera2.utils.SubmitInfo submitRequest(android.hardware.camera2.CaptureRequest p0, boolean p1) { return null; }
    public android.hardware.camera2.utils.SubmitInfo submitRequestList(android.hardware.camera2.CaptureRequest[] p0, boolean p1) { return null; }
    public long cancelRequest(int p0) { return 0L; }
    public boolean isSessionConfigurationSupported(android.hardware.camera2.params.SessionConfiguration p0) { return false; }
    public void beginConfigure() {}
    public void endConfigure(int p0, android.hardware.camera2.impl.CameraMetadataNative p1) {}
    public void deleteStream(int p0) {}
    public int createStream(android.hardware.camera2.params.OutputConfiguration p0) { return 0; }
    public void finalizeOutputConfigurations(int p0, android.hardware.camera2.params.OutputConfiguration p1) {}
    public int createInputStream(int p0, int p1, int p2) { return 0; }
    public android.view.Surface getInputSurface() { return null; }
    public android.hardware.camera2.impl.CameraMetadataNative createDefaultRequest(int p0) { return null; }
    public android.hardware.camera2.impl.CameraMetadataNative getCameraInfo() { return null; }
    public void updateOutputConfiguration(int p0, android.hardware.camera2.params.OutputConfiguration p1) {}
    public void waitUntilIdle() throws android.os.RemoteException {}
    public long flush() { return 0L; }
    public void prepare(int p0) {}
    public void prepare2(int p0, int p1) {}
    public void tearDown(int p0) {}
    public android.os.IBinder asBinder() { return null; }

    private static class CameraLooper implements java.lang.Runnable, java.lang.AutoCloseable {
        private final int mCameraId = 0;
        private android.os.Looper mLooper;
        private volatile int mInitErrors;
        private final android.hardware.Camera mCamera = null;
        private final android.os.ConditionVariable mStartDone = null;
        private final java.lang.Thread mThread = null;
        public CameraLooper(int p0) {}
        public android.hardware.Camera getCamera() { return null; }
        public void run() {}
        public void close() {}
        public int waitForOpen(int p0) { return 0; }
    }

    private static class CameraCallbackThread implements android.hardware.camera2.ICameraDeviceCallbacks {
        private static final int CAMERA_ERROR = 0;
        private static final int CAMERA_IDLE = 1;
        private static final int CAPTURE_STARTED = 2;
        private static final int RESULT_RECEIVED = 3;
        private static final int PREPARED = 4;
        private static final int REPEATING_REQUEST_ERROR = 5;
        private static final int REQUEST_QUEUE_EMPTY = 6;
        private final android.os.HandlerThread mHandlerThread = null;
        private android.os.Handler mHandler;
        private final android.hardware.camera2.ICameraDeviceCallbacks mCallbacks = null;
        public CameraCallbackThread(android.hardware.camera2.ICameraDeviceCallbacks p0) {}
        public void close() {}
        public void onDeviceError(int p0, android.hardware.camera2.impl.CaptureResultExtras p1) {}
        public void onDeviceIdle() {}
        public void onCaptureStarted(android.hardware.camera2.impl.CaptureResultExtras p0, long p1) {}
        public void onResultReceived(android.hardware.camera2.impl.CameraMetadataNative p0, android.hardware.camera2.impl.CaptureResultExtras p1, android.hardware.camera2.impl.PhysicalCaptureResultInfo[] p2) {}
        public void onPrepared(int p0) {}
        public void onRepeatingRequestError(long p0, int p1) {}
        public void onRequestQueueEmpty() {}
        public android.os.IBinder asBinder() { return null; }
        private android.os.Handler getHandler() { return null; }

        private class CallbackHandler extends android.os.Handler {
            public CallbackHandler(android.hardware.camera2.legacy.CameraDeviceUserShim.CameraCallbackThread p0, android.os.Looper p1) { super(); }
            public void handleMessage(android.os.Message p0) {}
        }
    }
}
