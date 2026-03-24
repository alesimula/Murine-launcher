package android.hardware.camera2.impl;

public class CameraDeviceImpl extends android.hardware.camera2.CameraDevice implements android.os.IBinder.DeathRecipient {
    final java.lang.Object mInterfaceLock = null;
    public CameraDeviceImpl(java.lang.String p0, android.hardware.camera2.CameraDevice.StateCallback p1, java.util.concurrent.Executor p2, android.hardware.camera2.CameraCharacteristics p3, java.util.Map<java.lang.String, android.hardware.camera2.CameraCharacteristics> p4, int p5, android.content.Context p6) { super(); }
    public android.hardware.camera2.impl.CameraDeviceImpl.CameraDeviceCallbacks getCallbacks() { return null; }
    public void setRemoteDevice(android.hardware.camera2.ICameraDeviceUser p0) throws android.hardware.camera2.CameraAccessException {}
    public void setRemoteFailure(android.os.ServiceSpecificException p0) {}
    public java.lang.String getId() { return null; }
    public void configureOutputs(java.util.List<android.view.Surface> p0) throws android.hardware.camera2.CameraAccessException {}
    public boolean configureStreamsChecked(android.hardware.camera2.params.InputConfiguration p0, java.util.List<android.hardware.camera2.params.OutputConfiguration> p1, int p2, android.hardware.camera2.CaptureRequest p3, long p4) throws android.hardware.camera2.CameraAccessException { return false; }
    public void createCaptureSession(java.util.List<android.view.Surface> p0, android.hardware.camera2.CameraCaptureSession.StateCallback p1, android.os.Handler p2) throws android.hardware.camera2.CameraAccessException {}
    public void createCaptureSessionByOutputConfigurations(java.util.List<android.hardware.camera2.params.OutputConfiguration> p0, android.hardware.camera2.CameraCaptureSession.StateCallback p1, android.os.Handler p2) throws android.hardware.camera2.CameraAccessException {}
    public void createReprocessableCaptureSession(android.hardware.camera2.params.InputConfiguration p0, java.util.List<android.view.Surface> p1, android.hardware.camera2.CameraCaptureSession.StateCallback p2, android.os.Handler p3) throws android.hardware.camera2.CameraAccessException {}
    public void createReprocessableCaptureSessionByConfigurations(android.hardware.camera2.params.InputConfiguration p0, java.util.List<android.hardware.camera2.params.OutputConfiguration> p1, android.hardware.camera2.CameraCaptureSession.StateCallback p2, android.os.Handler p3) throws android.hardware.camera2.CameraAccessException {}
    public void createConstrainedHighSpeedCaptureSession(java.util.List<android.view.Surface> p0, android.hardware.camera2.CameraCaptureSession.StateCallback p1, android.os.Handler p2) throws android.hardware.camera2.CameraAccessException {}
    public void createCustomCaptureSession(android.hardware.camera2.params.InputConfiguration p0, java.util.List<android.hardware.camera2.params.OutputConfiguration> p1, int p2, android.hardware.camera2.CameraCaptureSession.StateCallback p3, android.os.Handler p4) throws android.hardware.camera2.CameraAccessException {}
    public void createCaptureSession(android.hardware.camera2.params.SessionConfiguration p0) throws android.hardware.camera2.CameraAccessException {}
    public boolean isSessionConfigurationSupported(android.hardware.camera2.params.SessionConfiguration p0) throws android.hardware.camera2.CameraAccessException, java.lang.UnsupportedOperationException, java.lang.IllegalArgumentException { return false; }
    public void setSessionListener(android.hardware.camera2.impl.CameraDeviceImpl.StateCallbackKK p0) {}
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
    public int setRepeatingRequest(android.hardware.camera2.CaptureRequest p0, android.hardware.camera2.impl.CaptureCallback p1, java.util.concurrent.Executor p2) throws android.hardware.camera2.CameraAccessException { return 0; }
    public int setRepeatingBurst(java.util.List<android.hardware.camera2.CaptureRequest> p0, android.hardware.camera2.impl.CaptureCallback p1, java.util.concurrent.Executor p2) throws android.hardware.camera2.CameraAccessException { return 0; }
    public void stopRepeating() throws android.hardware.camera2.CameraAccessException {}
    public void flush() throws android.hardware.camera2.CameraAccessException {}
    public void close() {}
    protected void finalize() throws java.lang.Throwable {}
    public boolean isPrivilegedApp() { return false; }
    public void onDeviceError(int p0, android.hardware.camera2.impl.CaptureResultExtras p1) {}
    public void onDeviceIdle() {}
    static java.util.concurrent.Executor checkExecutor(java.util.concurrent.Executor p0) { return null; }
    public static <T extends java.lang.Object> java.util.concurrent.Executor checkExecutor(java.util.concurrent.Executor p0, T p1) { return null; }
    public static java.util.concurrent.Executor checkAndWrapHandler(android.os.Handler p0) { return null; }
    static android.os.Handler checkHandler(android.os.Handler p0) { return null; }
    static <T extends java.lang.Object> android.os.Handler checkHandler(android.os.Handler p0, T p1) { return null; }
    public void binderDied() {}
    public void setCameraAudioRestriction(int p0) throws android.hardware.camera2.CameraAccessException {}
    public int getCameraAudioRestriction() throws android.hardware.camera2.CameraAccessException { return 0; }
    public void createExtensionSession(android.hardware.camera2.params.ExtensionSessionConfiguration p0) throws android.hardware.camera2.CameraAccessException {}

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
