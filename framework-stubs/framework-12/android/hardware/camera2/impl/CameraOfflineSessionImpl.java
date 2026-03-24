package android.hardware.camera2.impl;

public class CameraOfflineSessionImpl extends android.hardware.camera2.CameraOfflineSession implements android.os.IBinder.DeathRecipient {
    private static final java.lang.String TAG = "CameraOfflineSessionImpl";
    private static final int REQUEST_ID_NONE = -1;
    private static final long NANO_PER_SECOND = 1000000000L;
    private final boolean DEBUG = false;
    private android.hardware.camera2.ICameraOfflineSession mRemoteSession;
    private final java.util.concurrent.atomic.AtomicBoolean mClosing = null;
    private java.util.AbstractMap.SimpleEntry<java.lang.Integer, android.hardware.camera2.params.InputConfiguration> mOfflineInput;
    private android.util.SparseArray<android.hardware.camera2.params.OutputConfiguration> mOfflineOutputs;
    private android.util.SparseArray<android.hardware.camera2.params.OutputConfiguration> mConfiguredOutputs;
    final java.lang.Object mInterfaceLock = null;
    private final java.lang.String mCameraId = null;
    private final android.hardware.camera2.CameraCharacteristics mCharacteristics = null;
    private final int mTotalPartialCount = 0;
    private final java.util.concurrent.Executor mOfflineExecutor = null;
    private final android.hardware.camera2.CameraOfflineSession.CameraOfflineSessionCallback mOfflineCallback = null;
    private final android.hardware.camera2.impl.CameraOfflineSessionImpl.CameraDeviceCallbacks mCallbacks = null;
    private java.util.List<android.hardware.camera2.impl.RequestLastFrameNumbersHolder> mOfflineRequestLastFrameNumbersList;
    private android.hardware.camera2.impl.FrameNumberTracker mFrameNumberTracker;
    private android.util.SparseArray<android.hardware.camera2.impl.CaptureCallbackHolder> mCaptureCallbackMap;
    public CameraOfflineSessionImpl(java.lang.String p0, android.hardware.camera2.CameraCharacteristics p1, java.util.concurrent.Executor p2, android.hardware.camera2.CameraOfflineSession.CameraOfflineSessionCallback p3, android.util.SparseArray<android.hardware.camera2.params.OutputConfiguration> p4, java.util.AbstractMap.SimpleEntry<java.lang.Integer, android.hardware.camera2.params.InputConfiguration> p5, android.util.SparseArray<android.hardware.camera2.params.OutputConfiguration> p6, android.hardware.camera2.impl.FrameNumberTracker p7, android.util.SparseArray<android.hardware.camera2.impl.CaptureCallbackHolder> p8, java.util.List<android.hardware.camera2.impl.RequestLastFrameNumbersHolder> p9) { super(); }
    public android.hardware.camera2.impl.CameraOfflineSessionImpl.CameraDeviceCallbacks getCallbacks() { return null; }
    private void checkAndFireSequenceComplete() {}
    private void removeCompletedCallbackHolderLocked(long p0, long p1, long p2) {}
    public void notifyFailedSwitch() {}
    public void setRemoteSession(android.hardware.camera2.ICameraOfflineSession p0) throws android.hardware.camera2.CameraAccessException {}
    private boolean isClosed() { return false; }
    private void disconnect() {}
    protected void finalize() throws java.lang.Throwable {}
    public void binderDied() {}
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
    public int setRepeatingBurst(java.util.List<android.hardware.camera2.CaptureRequest> p0, android.hardware.camera2.CameraCaptureSession.CaptureCallback p1, android.os.Handler p2) throws android.hardware.camera2.CameraAccessException { return 0; }
    public int setRepeatingBurstRequests(java.util.List<android.hardware.camera2.CaptureRequest> p0, java.util.concurrent.Executor p1, android.hardware.camera2.CameraCaptureSession.CaptureCallback p2) throws android.hardware.camera2.CameraAccessException { return 0; }
    public void stopRepeating() throws android.hardware.camera2.CameraAccessException {}
    public void abortCaptures() throws android.hardware.camera2.CameraAccessException {}
    public void updateOutputConfiguration(android.hardware.camera2.params.OutputConfiguration p0) throws android.hardware.camera2.CameraAccessException {}
    public boolean isReprocessable() { return false; }
    public android.view.Surface getInputSurface() { return null; }
    public android.hardware.camera2.CameraOfflineSession switchToOffline(java.util.Collection<android.view.Surface> p0, java.util.concurrent.Executor p1, android.hardware.camera2.CameraOfflineSession.CameraOfflineSessionCallback p2) throws android.hardware.camera2.CameraAccessException { return null; }
    public boolean supportsOfflineProcessing(android.view.Surface p0) { return false; }
    public void close() {}

    public class CameraDeviceCallbacks extends android.hardware.camera2.ICameraDeviceCallbacks.Stub {
        public CameraDeviceCallbacks(android.hardware.camera2.impl.CameraOfflineSessionImpl p0) { super(); }
        public android.os.IBinder asBinder() { return null; }
        public void onDeviceError(int p0, android.hardware.camera2.impl.CaptureResultExtras p1) {}
        public void onRepeatingRequestError(long p0, int p1) {}
        public void onDeviceIdle() {}
        public void onCaptureStarted(android.hardware.camera2.impl.CaptureResultExtras p0, long p1) {}
        public void onResultReceived(android.hardware.camera2.impl.CameraMetadataNative p0, android.hardware.camera2.impl.CaptureResultExtras p1, android.hardware.camera2.impl.PhysicalCaptureResultInfo[] p2) throws android.os.RemoteException {}
        public void onPrepared(int p0) {}
        public void onRequestQueueEmpty() {}
        private void onCaptureErrorLocked(int p0, android.hardware.camera2.impl.CaptureResultExtras p1) {}
    }
}
