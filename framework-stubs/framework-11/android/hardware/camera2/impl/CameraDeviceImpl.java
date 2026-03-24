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
    private android.util.SparseArray<android.hardware.camera2.impl.CaptureCallbackHolder> mCaptureCallbackMap;
    private int mRepeatingRequestId;
    private int[] mRepeatingRequestTypes;
    private java.util.AbstractMap.SimpleEntry<java.lang.Integer, android.hardware.camera2.params.InputConfiguration> mConfiguredInput;
    private final android.util.SparseArray<android.hardware.camera2.params.OutputConfiguration> mConfiguredOutputs = null;
    private final java.util.HashSet<java.lang.Integer> mOfflineSupport = null;
    private final java.lang.String mCameraId = null;
    private final android.hardware.camera2.CameraCharacteristics mCharacteristics = null;
    private final int mTotalPartialCount = 0;
    private static final long NANO_PER_SECOND = 1000000000L;
    private final java.util.List<android.hardware.camera2.impl.RequestLastFrameNumbersHolder> mRequestLastFrameNumbersList = null;
    private android.hardware.camera2.impl.FrameNumberTracker mFrameNumberTracker;
    private android.hardware.camera2.impl.CameraCaptureSessionCore mCurrentSession;
    private int mNextSessionId;
    private final int mAppTargetSdkVersion = 0;
    private boolean mIsPrivilegedApp;
    private java.util.concurrent.ExecutorService mOfflineSwitchService;
    private android.hardware.camera2.impl.CameraOfflineSessionImpl mOfflineSessionImpl;
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
    public android.hardware.camera2.CameraOfflineSession switchToOffline(java.util.Collection<android.view.Surface> p0, java.util.concurrent.Executor p1, android.hardware.camera2.CameraOfflineSession.CameraOfflineSessionCallback p2) throws android.hardware.camera2.CameraAccessException { return null; }
    public boolean supportsOfflineProcessing(android.view.Surface p0) { return false; }
    public void tearDown(android.view.Surface p0) throws android.hardware.camera2.CameraAccessException {}
    public void finalizeOutputConfigs(java.util.List<android.hardware.camera2.params.OutputConfiguration> p0) throws android.hardware.camera2.CameraAccessException {}
    public int capture(android.hardware.camera2.CaptureRequest p0, android.hardware.camera2.impl.CaptureCallback p1, java.util.concurrent.Executor p2) throws android.hardware.camera2.CameraAccessException { return 0; }
    public int captureBurst(java.util.List<android.hardware.camera2.CaptureRequest> p0, android.hardware.camera2.impl.CaptureCallback p1, java.util.concurrent.Executor p2) throws android.hardware.camera2.CameraAccessException { return 0; }
    private void checkEarlyTriggerSequenceCompleteLocked(int p0, long p1, int[] p2) {}
    private int[] getRequestTypes(android.hardware.camera2.CaptureRequest[] p0) { return null; }
    private int submitCaptureRequest(java.util.List<android.hardware.camera2.CaptureRequest> p0, android.hardware.camera2.impl.CaptureCallback p1, java.util.concurrent.Executor p2, boolean p3) throws android.hardware.camera2.CameraAccessException { return 0; }
    public int setRepeatingRequest(android.hardware.camera2.CaptureRequest p0, android.hardware.camera2.impl.CaptureCallback p1, java.util.concurrent.Executor p2) throws android.hardware.camera2.CameraAccessException { return 0; }
    public int setRepeatingBurst(java.util.List<android.hardware.camera2.CaptureRequest> p0, android.hardware.camera2.impl.CaptureCallback p1, java.util.concurrent.Executor p2) throws android.hardware.camera2.CameraAccessException { return 0; }
    public void stopRepeating() throws android.hardware.camera2.CameraAccessException {}
    private void waitUntilIdle() throws android.hardware.camera2.CameraAccessException {}
    public void flush() throws android.hardware.camera2.CameraAccessException {}
    public void close() {}
    protected void finalize() throws java.lang.Throwable {}
    private boolean checkPrivilegedAppList() { return false; }
    public boolean isPrivilegedApp() { return false; }
    private void checkInputConfiguration(android.hardware.camera2.params.InputConfiguration p0) {}
    private void checkAndFireSequenceComplete() {}
    private void removeCompletedCallbackHolderLocked(long p0, long p1, long p2) {}
    public void onDeviceError(int p0, android.hardware.camera2.impl.CaptureResultExtras p1) {}
    private void scheduleNotifyError(int p0) {}
    private void notifyError(int p0) {}
    private void onCaptureErrorLocked(int p0, android.hardware.camera2.impl.CaptureResultExtras p1) {}
    public void onDeviceIdle() {}
    static java.util.concurrent.Executor checkExecutor(java.util.concurrent.Executor p0) { return null; }
    public static <T extends java.lang.Object> java.util.concurrent.Executor checkExecutor(java.util.concurrent.Executor p0, T p1) { return null; }
    public static java.util.concurrent.Executor checkAndWrapHandler(android.os.Handler p0) { return null; }
    static android.os.Handler checkHandler(android.os.Handler p0) { return null; }
    static <T extends java.lang.Object> android.os.Handler checkHandler(android.os.Handler p0, T p1) { return null; }
    private void checkIfCameraClosedOrInError() throws android.hardware.camera2.CameraAccessException {}
    private boolean isClosed() { return false; }
    private android.hardware.camera2.CameraCharacteristics getCharacteristics() { return null; }
    public void binderDied() {}
    public void setCameraAudioRestriction(int p0) throws android.hardware.camera2.CameraAccessException {}
    public int getCameraAudioRestriction() throws android.hardware.camera2.CameraAccessException { return 0; }

    public class CameraDeviceCallbacks extends android.hardware.camera2.ICameraDeviceCallbacks.Stub {
        public CameraDeviceCallbacks(android.hardware.camera2.impl.CameraDeviceImpl p0) { super(); }
        public android.os.IBinder asBinder() { return null; }
        public void onDeviceError(int p0, android.hardware.camera2.impl.CaptureResultExtras p1) {}
        public void onRepeatingRequestError(long p0, int p1) {}
        public void onDeviceIdle() {}
        public void onCaptureStarted(android.hardware.camera2.impl.CaptureResultExtras p0, long p1) {}
        public void onResultReceived(android.hardware.camera2.impl.CameraMetadataNative p0, android.hardware.camera2.impl.CaptureResultExtras p1, android.hardware.camera2.impl.PhysicalCaptureResultInfo[] p2) throws android.os.RemoteException {}
        public void onPrepared(int p0) {}
        public void onRequestQueueEmpty() {}
    }

    private static class CameraHandlerExecutor implements java.util.concurrent.Executor {
        private final android.os.Handler mHandler = null;
        public CameraHandlerExecutor(android.os.Handler p0) {}
        public void execute(java.lang.Runnable p0) {}
    }

    public static abstract class StateCallbackKK extends android.hardware.camera2.CameraDevice.StateCallback {
        public StateCallbackKK() { super(); }
        public void onUnconfigured(android.hardware.camera2.CameraDevice p0) {}
        public void onActive(android.hardware.camera2.CameraDevice p0) {}
        public void onBusy(android.hardware.camera2.CameraDevice p0) {}
        public void onIdle(android.hardware.camera2.CameraDevice p0) {}
        public void onRequestQueueEmpty() {}
        public void onSurfacePrepared(android.view.Surface p0) {}
    }
}
