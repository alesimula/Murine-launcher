package android.hardware.camera2;

public final class CameraManager {
    private static final java.lang.String TAG = "CameraManager";
    private final boolean DEBUG = false;
    private static final int USE_CALLING_UID = -1;
    private static final int API_VERSION_1 = 1;
    private static final int API_VERSION_2 = 2;
    private static final int CAMERA_TYPE_BACKWARD_COMPATIBLE = 0;
    private static final int CAMERA_TYPE_ALL = 1;
    private java.util.ArrayList<java.lang.String> mDeviceIdList;
    private final android.content.Context mContext = null;
    private final java.lang.Object mLock = null;
    public CameraManager(android.content.Context p0) {}
    public java.lang.String[] getCameraIdList() throws android.hardware.camera2.CameraAccessException { return null; }
    public java.lang.String[] getCameraIdListNoLazy() throws android.hardware.camera2.CameraAccessException { return null; }
    public java.util.Set<java.util.Set<java.lang.String>> getConcurrentCameraIds() throws android.hardware.camera2.CameraAccessException { return null; }
    public boolean isConcurrentSessionConfigurationSupported(java.util.Map<java.lang.String, android.hardware.camera2.params.SessionConfiguration> p0) throws android.hardware.camera2.CameraAccessException { return false; }
    public void registerAvailabilityCallback(android.hardware.camera2.CameraManager.AvailabilityCallback p0, android.os.Handler p1) {}
    public void registerAvailabilityCallback(java.util.concurrent.Executor p0, android.hardware.camera2.CameraManager.AvailabilityCallback p1) {}
    public void unregisterAvailabilityCallback(android.hardware.camera2.CameraManager.AvailabilityCallback p0) {}
    public void registerTorchCallback(android.hardware.camera2.CameraManager.TorchCallback p0, android.os.Handler p1) {}
    public void registerTorchCallback(java.util.concurrent.Executor p0, android.hardware.camera2.CameraManager.TorchCallback p1) {}
    public void unregisterTorchCallback(android.hardware.camera2.CameraManager.TorchCallback p0) {}
    private android.util.Size getDisplaySize() { return null; }
    public android.hardware.camera2.CameraCharacteristics getCameraCharacteristics(java.lang.String p0) throws android.hardware.camera2.CameraAccessException { return null; }
    private android.hardware.camera2.CameraDevice openCameraDeviceUserAsync(java.lang.String p0, android.hardware.camera2.CameraDevice.StateCallback p1, java.util.concurrent.Executor p2, int p3) throws android.hardware.camera2.CameraAccessException { return null; }
    public void openCamera(java.lang.String p0, android.hardware.camera2.CameraDevice.StateCallback p1, android.os.Handler p2) throws android.hardware.camera2.CameraAccessException {}
    public void openCamera(java.lang.String p0, java.util.concurrent.Executor p1, android.hardware.camera2.CameraDevice.StateCallback p2) throws android.hardware.camera2.CameraAccessException {}
    public void openCameraForUid(java.lang.String p0, android.hardware.camera2.CameraDevice.StateCallback p1, java.util.concurrent.Executor p2, int p3) throws android.hardware.camera2.CameraAccessException {}
    public void setTorchMode(java.lang.String p0, boolean p1) throws android.hardware.camera2.CameraAccessException {}
    public static void throwAsPublicException(java.lang.Throwable p0) throws android.hardware.camera2.CameraAccessException {}
    private boolean supportsCamera2ApiLocked(java.lang.String p0) { return false; }
    private boolean supportsCameraApiLocked(java.lang.String p0, int p1) { return false; }
    public static boolean isHiddenPhysicalCamera(java.lang.String p0) { return false; }

    public static abstract class AvailabilityCallback {
        public AvailabilityCallback() {}
        public void onCameraAvailable(java.lang.String p0) {}
        public void onCameraUnavailable(java.lang.String p0) {}
        public void onCameraAccessPrioritiesChanged() {}
        public void onPhysicalCameraAvailable(java.lang.String p0, java.lang.String p1) {}
        public void onPhysicalCameraUnavailable(java.lang.String p0, java.lang.String p1) {}
        public void onCameraOpened(java.lang.String p0, java.lang.String p1) {}
        public void onCameraClosed(java.lang.String p0) {}
    }

    private static final class CameraManagerGlobal extends android.hardware.ICameraServiceListener.Stub implements android.os.IBinder.DeathRecipient {
        private static final java.lang.String TAG = "CameraManagerGlobal";
        private final boolean DEBUG = false;
        private final int CAMERA_SERVICE_RECONNECT_DELAY_MS = 0;
        private static final android.hardware.camera2.CameraManager.CameraManagerGlobal gCameraManager = null;
        private static final java.lang.String CAMERA_SERVICE_BINDER_NAME = "media.camera";
        private final java.util.concurrent.ScheduledExecutorService mScheduler = null;
        private final android.util.ArrayMap<java.lang.String, java.lang.Integer> mDeviceStatus = null;
        private final android.util.ArrayMap<java.lang.String, java.util.ArrayList<java.lang.String>> mUnavailablePhysicalDevices = null;
        private final java.util.Set<java.util.Set<java.lang.String>> mConcurrentCameraIdCombinations = null;
        private final android.util.ArrayMap<android.hardware.camera2.CameraManager.AvailabilityCallback, java.util.concurrent.Executor> mCallbackMap = null;
        private android.os.Binder mTorchClientBinder;
        private final android.util.ArrayMap<java.lang.String, java.lang.Integer> mTorchStatus = null;
        private final android.util.ArrayMap<android.hardware.camera2.CameraManager.TorchCallback, java.util.concurrent.Executor> mTorchCallbackMap = null;
        private final java.lang.Object mLock = null;
        private android.hardware.ICameraService mCameraService;
        public static final boolean sCameraServiceDisabled = Boolean.valueOf(false);
        private CameraManagerGlobal() { super(); }
        public static android.hardware.camera2.CameraManager.CameraManagerGlobal get() { return null; }
        public android.os.IBinder asBinder() { return null; }
        public android.hardware.ICameraService getCameraService() { return null; }
        private void connectCameraServiceLocked() {}
        private java.lang.String[] extractCameraIdListLocked() { return null; }
        private java.util.Set<java.util.Set<java.lang.String>> extractConcurrentCameraIdListLocked() { return null; }
        private static void sortCameraIds(java.lang.String[] p0) {}
        public static boolean cameraStatusesContains(android.hardware.CameraStatus[] p0, java.lang.String p1) { return false; }
        public java.lang.String[] getCameraIdListNoLazy() { return null; }
        public java.lang.String[] getCameraIdList() { return null; }
        public java.util.Set<java.util.Set<java.lang.String>> getConcurrentCameraIds() { return null; }
        public boolean isConcurrentSessionConfigurationSupported(java.util.Map<java.lang.String, android.hardware.camera2.params.SessionConfiguration> p0) throws android.hardware.camera2.CameraAccessException { return false; }
        public boolean cameraIdHasConcurrentStreamsLocked(java.lang.String p0) { return false; }
        public void setTorchMode(java.lang.String p0, boolean p1) throws android.hardware.camera2.CameraAccessException {}
        private void handleRecoverableSetupErrors(android.os.ServiceSpecificException p0) {}
        private boolean isAvailable(int p0) { return false; }
        private boolean validStatus(int p0) { return false; }
        private boolean validTorchStatus(int p0) { return false; }
        private void postSingleAccessPriorityChangeUpdate(android.hardware.camera2.CameraManager.AvailabilityCallback p0, java.util.concurrent.Executor p1) {}
        private void postSingleCameraOpenedUpdate(android.hardware.camera2.CameraManager.AvailabilityCallback p0, java.util.concurrent.Executor p1, java.lang.String p2, java.lang.String p3) {}
        private void postSingleCameraClosedUpdate(android.hardware.camera2.CameraManager.AvailabilityCallback p0, java.util.concurrent.Executor p1, java.lang.String p2) {}
        private void postSingleUpdate(android.hardware.camera2.CameraManager.AvailabilityCallback p0, java.util.concurrent.Executor p1, java.lang.String p2, java.lang.String p3, int p4) {}
        private void postSingleTorchUpdate(android.hardware.camera2.CameraManager.TorchCallback p0, java.util.concurrent.Executor p1, java.lang.String p2, int p3) {}
        private void updateCallbackLocked(android.hardware.camera2.CameraManager.AvailabilityCallback p0, java.util.concurrent.Executor p1) {}
        private void onStatusChangedLocked(int p0, java.lang.String p1) {}
        private void onPhysicalCameraStatusChangedLocked(int p0, java.lang.String p1, java.lang.String p2) {}
        private void updateTorchCallbackLocked(android.hardware.camera2.CameraManager.TorchCallback p0, java.util.concurrent.Executor p1) {}
        private void onTorchStatusChangedLocked(int p0, java.lang.String p1) {}
        public void registerAvailabilityCallback(android.hardware.camera2.CameraManager.AvailabilityCallback p0, java.util.concurrent.Executor p1) {}
        public void unregisterAvailabilityCallback(android.hardware.camera2.CameraManager.AvailabilityCallback p0) {}
        public void registerTorchCallback(android.hardware.camera2.CameraManager.TorchCallback p0, java.util.concurrent.Executor p1) {}
        public void unregisterTorchCallback(android.hardware.camera2.CameraManager.TorchCallback p0) {}
        public void onStatusChanged(int p0, java.lang.String p1) throws android.os.RemoteException {}
        public void onPhysicalCameraStatusChanged(int p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException {}
        public void onTorchStatusChanged(int p0, java.lang.String p1) throws android.os.RemoteException {}
        public void onCameraAccessPrioritiesChanged() {}
        public void onCameraOpened(java.lang.String p0, java.lang.String p1) {}
        public void onCameraClosed(java.lang.String p0) {}
        private void scheduleCameraServiceReconnectionLocked() {}
        public void binderDied() {}
    }

    public static abstract class TorchCallback {
        public TorchCallback() {}
        public void onTorchModeUnavailable(java.lang.String p0) {}
        public void onTorchModeChanged(java.lang.String p0, boolean p1) {}
    }
}
