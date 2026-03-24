package android.hardware.camera2;

public final class CameraManager {
    public static final long OVERRIDE_CAMERA_LANDSCAPE_TO_PORTRAIT = 250678880L;
    public static final java.lang.String LANDSCAPE_TO_PORTRAIT_PROP = "camera.enable_landscape_to_portrait";
    public CameraManager(android.content.Context p0) {}
    public void registerDeviceStateListener(android.hardware.camera2.CameraCharacteristics p0) {}
    public java.lang.String[] getCameraIdList() throws android.hardware.camera2.CameraAccessException { return null; }
    public java.lang.String[] getCameraIdListNoLazy() throws android.hardware.camera2.CameraAccessException { return null; }
    public java.util.Set<java.util.Set<java.lang.String>> getConcurrentCameraIds() throws android.hardware.camera2.CameraAccessException { return null; }
    @android.annotation.RequiresPermission("android.permission.CAMERA")
    public boolean isConcurrentSessionConfigurationSupported(java.util.Map<java.lang.String, android.hardware.camera2.params.SessionConfiguration> p0) throws android.hardware.camera2.CameraAccessException { return false; }
    public void registerAvailabilityCallback(android.hardware.camera2.CameraManager.AvailabilityCallback p0, android.os.Handler p1) {}
    public void registerAvailabilityCallback(java.util.concurrent.Executor p0, android.hardware.camera2.CameraManager.AvailabilityCallback p1) {}
    public void unregisterAvailabilityCallback(android.hardware.camera2.CameraManager.AvailabilityCallback p0) {}
    public void registerTorchCallback(android.hardware.camera2.CameraManager.TorchCallback p0, android.os.Handler p1) {}
    public void registerTorchCallback(java.util.concurrent.Executor p0, android.hardware.camera2.CameraManager.TorchCallback p1) {}
    public void unregisterTorchCallback(android.hardware.camera2.CameraManager.TorchCallback p0) {}
    public android.hardware.camera2.CameraCharacteristics getCameraCharacteristics(java.lang.String p0) throws android.hardware.camera2.CameraAccessException { return null; }
    public android.hardware.camera2.CameraCharacteristics getCameraCharacteristics(java.lang.String p0, boolean p1) throws android.hardware.camera2.CameraAccessException { return null; }
    public android.hardware.camera2.CameraExtensionCharacteristics getCameraExtensionCharacteristics(java.lang.String p0) throws android.hardware.camera2.CameraAccessException { return null; }
    @android.annotation.RequiresPermission("android.permission.CAMERA")
    public void openCamera(java.lang.String p0, android.hardware.camera2.CameraDevice.StateCallback p1, android.os.Handler p2) throws android.hardware.camera2.CameraAccessException {}
    @android.annotation.RequiresPermission("android.permission.CAMERA")
    public void openCamera(java.lang.String p0, boolean p1, android.os.Handler p2, android.hardware.camera2.CameraDevice.StateCallback p3) throws android.hardware.camera2.CameraAccessException {}
    @android.annotation.RequiresPermission("android.permission.CAMERA")
    public void openCamera(java.lang.String p0, java.util.concurrent.Executor p1, android.hardware.camera2.CameraDevice.StateCallback p2) throws android.hardware.camera2.CameraAccessException {}
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission(allOf={"android.permission.SYSTEM_CAMERA", "android.permission.CAMERA"})
    public void openCamera(java.lang.String p0, int p1, java.util.concurrent.Executor p2, android.hardware.camera2.CameraDevice.StateCallback p3) throws android.hardware.camera2.CameraAccessException {}
    public void openCameraForUid(java.lang.String p0, android.hardware.camera2.CameraDevice.StateCallback p1, java.util.concurrent.Executor p2, int p3, int p4, boolean p5) throws android.hardware.camera2.CameraAccessException {}
    public void openCameraForUid(java.lang.String p0, android.hardware.camera2.CameraDevice.StateCallback p1, java.util.concurrent.Executor p2, int p3) throws android.hardware.camera2.CameraAccessException {}
    public void setTorchMode(java.lang.String p0, boolean p1) throws android.hardware.camera2.CameraAccessException {}
    public void turnOnTorchWithStrengthLevel(java.lang.String p0, int p1) throws android.hardware.camera2.CameraAccessException {}
    public int getTorchStrengthLevel(java.lang.String p0) throws android.hardware.camera2.CameraAccessException { return 0; }
    public static boolean shouldOverrideToPortrait(android.content.Context p0) { return false; }
    public static boolean shouldOverrideToPortrait(android.content.pm.PackageManager p0, java.lang.String p1) { return false; }
    public static boolean physicalCallbacksAreEnabledForUnavailableCamera() { return false; }
    public static void throwAsPublicException(java.lang.Throwable p0) throws android.hardware.camera2.CameraAccessException {}
    public static boolean isHiddenPhysicalCamera(java.lang.String p0) { return false; }
    @android.annotation.RequiresPermission("android.permission.CAMERA_INJECT_EXTERNAL_CAMERA")
    public void injectCamera(java.lang.String p0, java.lang.String p1, java.lang.String p2, java.util.concurrent.Executor p3, android.hardware.camera2.CameraInjectionSession.InjectionStatusCallback p4) throws android.hardware.camera2.CameraAccessException, java.lang.SecurityException, java.lang.IllegalArgumentException {}
    public static java.lang.String reportExtensionSessionStats(android.hardware.CameraExtensionSessionStats p0) { return null; }

    public static abstract class TorchCallback {
        public TorchCallback() {}
        public void onTorchModeUnavailable(java.lang.String p0) {}
        public void onTorchModeChanged(java.lang.String p0, boolean p1) {}
        public void onTorchStrengthLevelChanged(java.lang.String p0, int p1) {}
    }

    public static abstract class AvailabilityCallback {
        public AvailabilityCallback() {}
        public void onCameraAvailable(java.lang.String p0) {}
        public void onCameraUnavailable(java.lang.String p0) {}
        public void onCameraAccessPrioritiesChanged() {}
        public void onPhysicalCameraAvailable(java.lang.String p0, java.lang.String p1) {}
        public void onPhysicalCameraUnavailable(java.lang.String p0, java.lang.String p1) {}
        @android.annotation.SystemApi
        @android.annotation.RequiresPermission("android.permission.CAMERA_OPEN_CLOSE_LISTENER")
        public void onCameraOpened(java.lang.String p0, java.lang.String p1) {}
        @android.annotation.SystemApi
        @android.annotation.RequiresPermission("android.permission.CAMERA_OPEN_CLOSE_LISTENER")
        public void onCameraClosed(java.lang.String p0) {}
    }

    private static final class CameraManagerGlobal extends android.hardware.ICameraServiceListener.Stub implements android.os.IBinder.DeathRecipient {
        public static final boolean sCameraServiceDisabled = Boolean.valueOf(false);
        public static final boolean sLandscapeToPortrait = Boolean.valueOf(false);
        public static android.hardware.camera2.CameraManager.CameraManagerGlobal get() { return null; }
        public void registerDeviceStateListener(android.hardware.camera2.CameraCharacteristics p0, android.content.Context p1) {}
        public android.os.IBinder asBinder() { return null; }
        public android.hardware.ICameraService getCameraService() { return null; }
        public static boolean cameraStatusesContains(android.hardware.CameraStatus[] p0, java.lang.String p1) { return false; }
        public java.lang.String[] getCameraIdListNoLazy() { return null; }
        public java.lang.String[] getCameraIdList() { return null; }
        public java.util.Set<java.util.Set<java.lang.String>> getConcurrentCameraIds() { return null; }
        public boolean isConcurrentSessionConfigurationSupported(java.util.Map<java.lang.String, android.hardware.camera2.params.SessionConfiguration> p0, int p1) throws android.hardware.camera2.CameraAccessException { return false; }
        public boolean cameraIdHasConcurrentStreamsLocked(java.lang.String p0) { return false; }
        public void setTorchMode(java.lang.String p0, boolean p1) throws android.hardware.camera2.CameraAccessException {}
        public void turnOnTorchWithStrengthLevel(java.lang.String p0, int p1) throws android.hardware.camera2.CameraAccessException {}
        public int getTorchStrengthLevel(java.lang.String p0) throws android.hardware.camera2.CameraAccessException { return 0; }
        public void registerAvailabilityCallback(android.hardware.camera2.CameraManager.AvailabilityCallback p0, java.util.concurrent.Executor p1, boolean p2) {}
        public void unregisterAvailabilityCallback(android.hardware.camera2.CameraManager.AvailabilityCallback p0) {}
        public void registerTorchCallback(android.hardware.camera2.CameraManager.TorchCallback p0, java.util.concurrent.Executor p1) {}
        public void unregisterTorchCallback(android.hardware.camera2.CameraManager.TorchCallback p0) {}
        public void onStatusChanged(int p0, java.lang.String p1) throws android.os.RemoteException {}
        public void onPhysicalCameraStatusChanged(int p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException {}
        public void onTorchStatusChanged(int p0, java.lang.String p1) throws android.os.RemoteException {}
        public void onTorchStrengthLevelChanged(java.lang.String p0, int p1) throws android.os.RemoteException {}
        public void onCameraAccessPrioritiesChanged() {}
        public void onCameraOpened(java.lang.String p0, java.lang.String p1) {}
        public void onCameraClosed(java.lang.String p0) {}
        public void binderDied() {}
    }

    public static interface DeviceStateListener {
        public void onDeviceStateChanged(boolean p0);
    }

    private static final class FoldStateListener implements android.hardware.devicestate.DeviceStateManager.DeviceStateCallback {
        public FoldStateListener(android.content.Context p0) {}
        public synchronized void addDeviceStateListener(android.hardware.camera2.CameraManager.DeviceStateListener p0) {}
        public final void onBaseStateChanged(int p0) {}
        public final void onStateChanged(int p0) {}
    }
}
