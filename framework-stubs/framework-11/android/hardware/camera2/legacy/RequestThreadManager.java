package android.hardware.camera2.legacy;

public class RequestThreadManager {
    private final java.lang.String TAG = null;
    private final int mCameraId = 0;
    private final android.hardware.camera2.legacy.RequestHandlerThread mRequestThread = null;
    private static final boolean DEBUG = false;
    private static final boolean VERBOSE = false;
    private android.hardware.Camera mCamera;
    private final android.hardware.camera2.CameraCharacteristics mCharacteristics = null;
    private final android.hardware.camera2.legacy.CameraDeviceState mDeviceState = null;
    private final android.hardware.camera2.legacy.CaptureCollector mCaptureCollector = null;
    private final android.hardware.camera2.legacy.LegacyFocusStateMapper mFocusStateMapper = null;
    private final android.hardware.camera2.legacy.LegacyFaceDetectMapper mFaceDetectMapper = null;
    private static final int MSG_CONFIGURE_OUTPUTS = 1;
    private static final int MSG_SUBMIT_CAPTURE_REQUEST = 2;
    private static final int MSG_CLEANUP = 3;
    private static final int MAX_IN_FLIGHT_REQUESTS = 2;
    private static final int PREVIEW_FRAME_TIMEOUT = 1000;
    private static final int JPEG_FRAME_TIMEOUT = 4000;
    private static final int REQUEST_COMPLETE_TIMEOUT = 4000;
    private static final float ASPECT_RATIO_TOLERANCE = 0.009999999776482582f;
    private boolean mPreviewRunning;
    private final java.util.List<android.view.Surface> mPreviewOutputs = null;
    private final java.util.List<android.view.Surface> mCallbackOutputs = null;
    private android.hardware.camera2.legacy.GLThreadManager mGLThreadManager;
    private android.graphics.SurfaceTexture mPreviewTexture;
    private android.hardware.Camera.Parameters mParams;
    private final java.util.List<java.lang.Long> mJpegSurfaceIds = null;
    private android.util.Size mIntermediateBufferSize;
    private final android.hardware.camera2.legacy.RequestQueue mRequestQueue = null;
    private android.hardware.camera2.legacy.LegacyRequest mLastRequest;
    private android.graphics.SurfaceTexture mDummyTexture;
    private android.view.Surface mDummySurface;
    private final java.lang.Object mIdleLock = null;
    private final android.hardware.camera2.legacy.RequestThreadManager.FpsCounter mPrevCounter = null;
    private final android.hardware.camera2.legacy.RequestThreadManager.FpsCounter mRequestCounter = null;
    private final java.util.concurrent.atomic.AtomicBoolean mQuit = null;
    private static final boolean USE_BLOB_FORMAT_OVERRIDE = true;
    private final android.hardware.Camera.ErrorCallback mErrorCallback = null;
    private final android.os.ConditionVariable mReceivedJpeg = null;
    private final android.hardware.Camera.PictureCallback mJpegCallback = null;
    private final android.hardware.Camera.ShutterCallback mJpegShutterCallback = null;
    private final android.graphics.SurfaceTexture.OnFrameAvailableListener mPreviewCallback = null;
    private final android.os.Handler.Callback mRequestHandlerCb = null;
    private void createDummySurface() {}
    private void stopPreview() {}
    private void startPreview() {}
    private void doJpegCapturePrepare(android.hardware.camera2.legacy.RequestHolder p0) throws java.io.IOException {}
    private void doJpegCapture(android.hardware.camera2.legacy.RequestHolder p0) {}
    private void doPreviewCapture(android.hardware.camera2.legacy.RequestHolder p0) throws java.io.IOException {}
    private void disconnectCallbackSurfaces() {}
    private void configureOutputs(java.util.Collection<android.util.Pair<android.view.Surface, android.util.Size>> p0) {}
    private void resetJpegSurfaceFormats(java.util.Collection<android.view.Surface> p0) {}
    private android.util.Size calculatePictureSize(java.util.List<android.view.Surface> p0, java.util.List<android.util.Size> p1, android.hardware.Camera.Parameters p2) { return null; }
    private static boolean checkAspectRatiosMatch(android.util.Size p0, android.util.Size p1) { return false; }
    private int[] getPhotoPreviewFpsRange(java.util.List<int[]> p0) { return null; }
    public RequestThreadManager(int p0, android.hardware.Camera p1, android.hardware.camera2.CameraCharacteristics p2, android.hardware.camera2.legacy.CameraDeviceState p3) {}
    public void start() {}
    public long flush() { return 0L; }
    public void quit() {}
    public android.hardware.camera2.utils.SubmitInfo submitCaptureRequests(android.hardware.camera2.CaptureRequest[] p0, boolean p1) { return null; }
    public long cancelRepeating(int p0) { return 0L; }
    public void configure(java.util.Collection<android.util.Pair<android.view.Surface, android.util.Size>> p0) {}
    public void setAudioRestriction(int p0) {}
    public int getAudioRestriction() { return 0; }

    private static class ConfigureHolder {
        public final android.os.ConditionVariable condition = null;
        public final java.util.Collection<android.util.Pair<android.view.Surface, android.util.Size>> surfaces = null;
        public ConfigureHolder(android.os.ConditionVariable p0, java.util.Collection<android.util.Pair<android.view.Surface, android.util.Size>> p1) {}
    }

    public static class FpsCounter {
        private static final java.lang.String TAG = "FpsCounter";
        private int mFrameCount;
        private long mLastTime;
        private long mLastPrintTime;
        private double mLastFps;
        private final java.lang.String mStreamType = null;
        private static final long NANO_PER_SECOND = 1000000000L;
        public FpsCounter(java.lang.String p0) {}
        public synchronized void countFrame() {}
        public synchronized double checkFps() { return 0.0; }
        public synchronized void staggeredLog() {}
        public synchronized void countAndLog() {}
    }
}
