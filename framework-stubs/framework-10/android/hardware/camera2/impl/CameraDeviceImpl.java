package android.hardware.camera2.impl;

public class CameraDeviceImpl extends android.hardware.camera2.CameraDevice implements android.os.IBinder.DeathRecipient {
    private final java.lang.String TAG = null;
    private final boolean DEBUG = false;
    private static final int REQUEST_ID_NONE = -1;
    private android.hardware.camera2.impl.ICameraDeviceUserWrapper mRemoteDevice;
    final java.lang.Object mInterfaceLock = null;
    private final android.hardware.camera2.impl.CameraDeviceImpl.CameraDeviceCallbacks mCallbacks = null;
    private final android.hardware.camera2.CameraDevice.StateCallback mDeviceCallback = null;
    private volatile android.hardware.camera2.impl.CameraDeviceImpl.StateCallbackKK mSessionStateCallback;
    private final java.util.concurrent.Executor mDeviceExecutor = null;
    private final java.util.concurrent.atomic.AtomicBoolean mClosing = null;
    private boolean mInError;
    private boolean mIdle;
    private final android.util.SparseArray<android.hardware.camera2.impl.CameraDeviceImpl.CaptureCallbackHolder> mCaptureCallbackMap = null;
    private int mRepeatingRequestId;
    private int[] mRepeatingRequestTypes;
    private java.util.AbstractMap.SimpleEntry<java.lang.Integer, android.hardware.camera2.params.InputConfiguration> mConfiguredInput;
    private final android.util.SparseArray<android.hardware.camera2.params.OutputConfiguration> mConfiguredOutputs = null;
    private final java.lang.String mCameraId = null;
    private final android.hardware.camera2.CameraCharacteristics mCharacteristics = null;
    private final int mTotalPartialCount = 0;
    private static final long NANO_PER_SECOND = 1000000000L;
    private final java.util.List<android.hardware.camera2.impl.CameraDeviceImpl.RequestLastFrameNumbersHolder> mRequestLastFrameNumbersList = null;
    private final android.hardware.camera2.impl.CameraDeviceImpl.FrameNumberTracker mFrameNumberTracker = null;
    private android.hardware.camera2.impl.CameraCaptureSessionCore mCurrentSession;
    private int mNextSessionId;
    private final int mAppTargetSdkVersion = 0;
    private final java.lang.Runnable mCallOnOpened = null;
    private final java.lang.Runnable mCallOnUnconfigured = null;
    private final java.lang.Runnable mCallOnActive = null;
    private final java.lang.Runnable mCallOnBusy = null;
    private final java.lang.Runnable mCallOnClosed = null;
    private final java.lang.Runnable mCallOnIdle = null;
    private final java.lang.Runnable mCallOnDisconnected = null;
    public CameraDeviceImpl(java.lang.String p0, android.hardware.camera2.CameraDevice.StateCallback p1, java.util.concurrent.Executor p2, android.hardware.camera2.CameraCharacteristics p3, int p4) { super(); }
    public android.hardware.camera2.impl.CameraDeviceImpl.CameraDeviceCallbacks getCallbacks() { return null; }
    public void setRemoteDevice(android.hardware.camera2.ICameraDeviceUser p0) throws android.hardware.camera2.CameraAccessException {}
    public void setRemoteFailure(android.os.ServiceSpecificException p0) {}
    public java.lang.String getId() { return null; }
    public void configureOutputs(java.util.List<android.view.Surface> p0) throws android.hardware.camera2.CameraAccessException {}
    public boolean configureStreamsChecked(android.hardware.camera2.params.InputConfiguration p0, java.util.List<android.hardware.camera2.params.OutputConfiguration> p1, int p2, android.hardware.camera2.CaptureRequest p3) throws android.hardware.camera2.CameraAccessException { return false; }
    public void createCaptureSession(java.util.List<android.view.Surface> p0, android.hardware.camera2.CameraCaptureSession.StateCallback p1, android.os.Handler p2) throws android.hardware.camera2.CameraAccessException {}
    public void createCaptureSessionByOutputConfigurations(java.util.List<android.hardware.camera2.params.OutputConfiguration> p0, android.hardware.camera2.CameraCaptureSession.StateCallback p1, android.os.Handler p2) throws android.hardware.camera2.CameraAccessException {}
    public void createReprocessableCaptureSession(android.hardware.camera2.params.InputConfiguration p0, java.util.List<android.view.Surface> p1, android.hardware.camera2.CameraCaptureSession.StateCallback p2, android.os.Handler p3) throws android.hardware.camera2.CameraAccessException {}
    public void createReprocessableCaptureSessionByConfigurations(android.hardware.camera2.params.InputConfiguration p0, java.util.List<android.hardware.camera2.params.OutputConfiguration> p1, android.hardware.camera2.CameraCaptureSession.StateCallback p2, android.os.Handler p3) throws android.hardware.camera2.CameraAccessException {}
    public void createConstrainedHighSpeedCaptureSession(java.util.List<android.view.Surface> p0, android.hardware.camera2.CameraCaptureSession.StateCallback p1, android.os.Handler p2) throws android.hardware.camera2.CameraAccessException {}
    public void createCustomCaptureSession(android.hardware.camera2.params.InputConfiguration p0, java.util.List<android.hardware.camera2.params.OutputConfiguration> p1, int p2, android.hardware.camera2.CameraCaptureSession.StateCallback p3, android.os.Handler p4) throws android.hardware.camera2.CameraAccessException {}
    public void createCaptureSession(android.hardware.camera2.params.SessionConfiguration p0) throws android.hardware.camera2.CameraAccessException {}
    private void createCaptureSessionInternal(android.hardware.camera2.params.InputConfiguration p0, java.util.List<android.hardware.camera2.params.OutputConfiguration> p1, android.hardware.camera2.CameraCaptureSession.StateCallback p2, java.util.concurrent.Executor p3, int p4, android.hardware.camera2.CaptureRequest p5) throws android.hardware.camera2.CameraAccessException {}
    public boolean isSessionConfigurationSupported(android.hardware.camera2.params.SessionConfiguration p0) throws android.hardware.camera2.CameraAccessException, java.lang.UnsupportedOperationException, java.lang.IllegalArgumentException { return false; }
    public void setSessionListener(android.hardware.camera2.impl.CameraDeviceImpl.StateCallbackKK p0) {}
    private void overrideEnableZsl(android.hardware.camera2.impl.CameraMetadataNative p0, boolean p1) {}
    public android.hardware.camera2.CaptureRequest.Builder createCaptureRequest(int p0, java.util.Set<java.lang.String> p1) throws android.hardware.camera2.CameraAccessException { return null; }
    public android.hardware.camera2.CaptureRequest.Builder createCaptureRequest(int p0) throws android.hardware.camera2.CameraAccessException { return null; }
    public android.hardware.camera2.CaptureRequest.Builder createReprocessCaptureRequest(android.hardware.camera2.TotalCaptureResult p0) throws android.hardware.camera2.CameraAccessException { return null; }
    public void prepare(android.view.Surface p0) throws android.hardware.camera2.CameraAccessException {}
    public void prepare(int p0, android.view.Surface p1) throws android.hardware.camera2.CameraAccessException {}
    public void updateOutputConfiguration(android.hardware.camera2.params.OutputConfiguration p0) throws android.hardware.camera2.CameraAccessException {}
    public void tearDown(android.view.Surface p0) throws android.hardware.camera2.CameraAccessException {}
    public void finalizeOutputConfigs(java.util.List<android.hardware.camera2.params.OutputConfiguration> p0) throws android.hardware.camera2.CameraAccessException {}
    public int capture(android.hardware.camera2.CaptureRequest p0, android.hardware.camera2.impl.CameraDeviceImpl.CaptureCallback p1, java.util.concurrent.Executor p2) throws android.hardware.camera2.CameraAccessException { return 0; }
    public int captureBurst(java.util.List<android.hardware.camera2.CaptureRequest> p0, android.hardware.camera2.impl.CameraDeviceImpl.CaptureCallback p1, java.util.concurrent.Executor p2) throws android.hardware.camera2.CameraAccessException { return 0; }
    private void checkEarlyTriggerSequenceComplete(int p0, long p1, int[] p2) {}
    private int[] getRequestTypes(android.hardware.camera2.CaptureRequest[] p0) { return null; }
    private int submitCaptureRequest(java.util.List<android.hardware.camera2.CaptureRequest> p0, android.hardware.camera2.impl.CameraDeviceImpl.CaptureCallback p1, java.util.concurrent.Executor p2, boolean p3) throws android.hardware.camera2.CameraAccessException { return 0; }
    public int setRepeatingRequest(android.hardware.camera2.CaptureRequest p0, android.hardware.camera2.impl.CameraDeviceImpl.CaptureCallback p1, java.util.concurrent.Executor p2) throws android.hardware.camera2.CameraAccessException { return 0; }
    public int setRepeatingBurst(java.util.List<android.hardware.camera2.CaptureRequest> p0, android.hardware.camera2.impl.CameraDeviceImpl.CaptureCallback p1, java.util.concurrent.Executor p2) throws android.hardware.camera2.CameraAccessException { return 0; }
    public void stopRepeating() throws android.hardware.camera2.CameraAccessException {}
    private void waitUntilIdle() throws android.hardware.camera2.CameraAccessException {}
    public void flush() throws android.hardware.camera2.CameraAccessException {}
    public void close() {}
    protected void finalize() throws java.lang.Throwable {}
    private void checkInputConfiguration(android.hardware.camera2.params.InputConfiguration p0) {}
    private void checkAndFireSequenceComplete() {}
    static java.util.concurrent.Executor checkExecutor(java.util.concurrent.Executor p0) { return null; }
    public static <T extends java.lang.Object> java.util.concurrent.Executor checkExecutor(java.util.concurrent.Executor p0, T p1) { return null; }
    public static java.util.concurrent.Executor checkAndWrapHandler(android.os.Handler p0) { return null; }
    static android.os.Handler checkHandler(android.os.Handler p0) { return null; }
    static <T extends java.lang.Object> android.os.Handler checkHandler(android.os.Handler p0, T p1) { return null; }
    private void checkIfCameraClosedOrInError() throws android.hardware.camera2.CameraAccessException {}
    private boolean isClosed() { return false; }
    private android.hardware.camera2.CameraCharacteristics getCharacteristics() { return null; }
    public void binderDied() {}

    public static abstract class StateCallbackKK extends android.hardware.camera2.CameraDevice.StateCallback {
        public StateCallbackKK() { super(); }
        public void onUnconfigured(android.hardware.camera2.CameraDevice p0) {}
        public void onActive(android.hardware.camera2.CameraDevice p0) {}
        public void onBusy(android.hardware.camera2.CameraDevice p0) {}
        public void onIdle(android.hardware.camera2.CameraDevice p0) {}
        public void onRequestQueueEmpty() {}
        public void onSurfacePrepared(android.view.Surface p0) {}
    }

    static class RequestLastFrameNumbersHolder {
        private final int mRequestId = 0;
        private final long mLastRegularFrameNumber = 0L;
        private final long mLastReprocessFrameNumber = 0L;
        private final long mLastZslStillFrameNumber = 0L;
        public RequestLastFrameNumbersHolder(java.util.List<android.hardware.camera2.CaptureRequest> p0, android.hardware.camera2.utils.SubmitInfo p1) {}
        RequestLastFrameNumbersHolder(int p0, long p1, int[] p2) {}
        public long getLastRegularFrameNumber() { return 0L; }
        public long getLastReprocessFrameNumber() { return 0L; }
        public long getLastZslStillFrameNumber() { return 0L; }
        public long getLastFrameNumber() { return 0L; }
        public int getRequestId() { return 0; }
    }

    public class FrameNumberTracker {
        private long[] mCompletedFrameNumber;
        private final java.util.LinkedList<java.lang.Long>[] mSkippedOtherFrameNumbers = null;
        private final java.util.LinkedList<java.lang.Long>[] mSkippedFrameNumbers = null;
        private final java.util.TreeMap<java.lang.Long, java.lang.Integer> mFutureErrorMap = null;
        private final java.util.HashMap<java.lang.Long, java.util.List<android.hardware.camera2.CaptureResult>> mPartialResults = null;
        public FrameNumberTracker(android.hardware.camera2.impl.CameraDeviceImpl p0) {}
        private void update() {}
        public void updateTracker(long p0, boolean p1, int p2) {}
        public void updateTracker(long p0, android.hardware.camera2.CaptureResult p1, boolean p2, int p3) {}
        public java.util.List<android.hardware.camera2.CaptureResult> popPartialResults(long p0) { return null; }
        public long getCompletedFrameNumber() { return 0L; }
        public long getCompletedReprocessFrameNumber() { return 0L; }
        public long getCompletedZslStillFrameNumber() { return 0L; }
        private void updateCompletedFrameNumber(long p0, int p1) throws java.lang.IllegalArgumentException {}
    }

    static class CaptureCallbackHolder {
        private final boolean mRepeating = false;
        private final android.hardware.camera2.impl.CameraDeviceImpl.CaptureCallback mCallback = null;
        private final java.util.List<android.hardware.camera2.CaptureRequest> mRequestList = null;
        private final java.util.concurrent.Executor mExecutor = null;
        private final int mSessionId = 0;
        private final boolean mHasBatchedOutputs = false;
        CaptureCallbackHolder(android.hardware.camera2.impl.CameraDeviceImpl.CaptureCallback p0, java.util.List<android.hardware.camera2.CaptureRequest> p1, java.util.concurrent.Executor p2, boolean p3, int p4) {}
        public boolean isRepeating() { return false; }
        public android.hardware.camera2.impl.CameraDeviceImpl.CaptureCallback getCallback() { return null; }
        public android.hardware.camera2.CaptureRequest getRequest(int p0) { return null; }
        public android.hardware.camera2.CaptureRequest getRequest() { return null; }
        public java.util.concurrent.Executor getExecutor() { return null; }
        public int getSessionId() { return 0; }
        public int getRequestCount() { return 0; }
        public boolean hasBatchedOutputs() { return false; }
    }

    public static interface CaptureCallback {
        public static final int NO_FRAMES_CAPTURED = -1;
        public void onCaptureStarted(android.hardware.camera2.CameraDevice p0, android.hardware.camera2.CaptureRequest p1, long p2, long p3);
        public void onCapturePartial(android.hardware.camera2.CameraDevice p0, android.hardware.camera2.CaptureRequest p1, android.hardware.camera2.CaptureResult p2);
        public void onCaptureProgressed(android.hardware.camera2.CameraDevice p0, android.hardware.camera2.CaptureRequest p1, android.hardware.camera2.CaptureResult p2);
        public void onCaptureCompleted(android.hardware.camera2.CameraDevice p0, android.hardware.camera2.CaptureRequest p1, android.hardware.camera2.TotalCaptureResult p2);
        public void onCaptureFailed(android.hardware.camera2.CameraDevice p0, android.hardware.camera2.CaptureRequest p1, android.hardware.camera2.CaptureFailure p2);
        public void onCaptureSequenceCompleted(android.hardware.camera2.CameraDevice p0, int p1, long p2);
        public void onCaptureSequenceAborted(android.hardware.camera2.CameraDevice p0, int p1);
        public void onCaptureBufferLost(android.hardware.camera2.CameraDevice p0, android.hardware.camera2.CaptureRequest p1, android.view.Surface p2, long p3);
    }

    private static class CameraHandlerExecutor implements java.util.concurrent.Executor {
        private final android.os.Handler mHandler = null;
        public CameraHandlerExecutor(android.os.Handler p0) {}
        public void execute(java.lang.Runnable p0) {}
    }

    public class CameraDeviceCallbacks extends android.hardware.camera2.ICameraDeviceCallbacks.Stub {
        public CameraDeviceCallbacks(android.hardware.camera2.impl.CameraDeviceImpl p0) { super(); }
        public android.os.IBinder asBinder() { return null; }
        public void onDeviceError(int p0, android.hardware.camera2.impl.CaptureResultExtras p1) {}
        private void scheduleNotifyError(int p0) {}
        private void notifyError(int p0) {}
        public void onRepeatingRequestError(long p0, int p1) {}
        public void onDeviceIdle() {}
        public void onCaptureStarted(android.hardware.camera2.impl.CaptureResultExtras p0, long p1) {}
        public void onResultReceived(android.hardware.camera2.impl.CameraMetadataNative p0, android.hardware.camera2.impl.CaptureResultExtras p1, android.hardware.camera2.impl.PhysicalCaptureResultInfo[] p2) throws android.os.RemoteException {}
        public void onPrepared(int p0) {}
        public void onRequestQueueEmpty() {}
        private void onCaptureErrorLocked(int p0, android.hardware.camera2.impl.CaptureResultExtras p1) {}
    }
}
