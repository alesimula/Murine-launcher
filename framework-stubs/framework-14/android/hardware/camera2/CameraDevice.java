package android.hardware.camera2;

public abstract class CameraDevice implements java.lang.AutoCloseable {
    public static final int TEMPLATE_PREVIEW = 1;
    public static final int TEMPLATE_STILL_CAPTURE = 2;
    public static final int TEMPLATE_RECORD = 3;
    public static final int TEMPLATE_VIDEO_SNAPSHOT = 4;
    public static final int TEMPLATE_ZERO_SHUTTER_LAG = 5;
    public static final int TEMPLATE_MANUAL = 6;
    public static final int AUDIO_RESTRICTION_NONE = 0;
    public static final int AUDIO_RESTRICTION_VIBRATION = 1;
    public static final int AUDIO_RESTRICTION_VIBRATION_SOUND = 3;
    @android.annotation.SystemApi
    public static final int SESSION_OPERATION_MODE_NORMAL = 0;
    @android.annotation.SystemApi
    public static final int SESSION_OPERATION_MODE_CONSTRAINED_HIGH_SPEED = 1;
    @android.annotation.SystemApi
    public static final int SESSION_OPERATION_MODE_VENDOR_START = 32768;
    public abstract java.lang.String getId();
    @java.lang.Deprecated
    public abstract void createCaptureSession(java.util.List<android.view.Surface> p0, android.hardware.camera2.CameraCaptureSession.StateCallback p1, android.os.Handler p2) throws android.hardware.camera2.CameraAccessException;
    @java.lang.Deprecated
    public abstract void createCaptureSessionByOutputConfigurations(java.util.List<android.hardware.camera2.params.OutputConfiguration> p0, android.hardware.camera2.CameraCaptureSession.StateCallback p1, android.os.Handler p2) throws android.hardware.camera2.CameraAccessException;
    @java.lang.Deprecated
    public abstract void createReprocessableCaptureSession(android.hardware.camera2.params.InputConfiguration p0, java.util.List<android.view.Surface> p1, android.hardware.camera2.CameraCaptureSession.StateCallback p2, android.os.Handler p3) throws android.hardware.camera2.CameraAccessException;
    @java.lang.Deprecated
    public abstract void createReprocessableCaptureSessionByConfigurations(android.hardware.camera2.params.InputConfiguration p0, java.util.List<android.hardware.camera2.params.OutputConfiguration> p1, android.hardware.camera2.CameraCaptureSession.StateCallback p2, android.os.Handler p3) throws android.hardware.camera2.CameraAccessException;
    @java.lang.Deprecated
    public abstract void createConstrainedHighSpeedCaptureSession(java.util.List<android.view.Surface> p0, android.hardware.camera2.CameraCaptureSession.StateCallback p1, android.os.Handler p2) throws android.hardware.camera2.CameraAccessException;
    public void createExtensionSession(android.hardware.camera2.params.ExtensionSessionConfiguration p0) throws android.hardware.camera2.CameraAccessException {}
    @android.annotation.SystemApi
    @java.lang.Deprecated
    public abstract void createCustomCaptureSession(android.hardware.camera2.params.InputConfiguration p0, java.util.List<android.hardware.camera2.params.OutputConfiguration> p1, int p2, android.hardware.camera2.CameraCaptureSession.StateCallback p3, android.os.Handler p4) throws android.hardware.camera2.CameraAccessException;
    public void createCaptureSession(android.hardware.camera2.params.SessionConfiguration p0) throws android.hardware.camera2.CameraAccessException {}
    public abstract android.hardware.camera2.CaptureRequest.Builder createCaptureRequest(int p0) throws android.hardware.camera2.CameraAccessException;
    public android.hardware.camera2.CaptureRequest.Builder createCaptureRequest(int p0, java.util.Set<java.lang.String> p1) throws android.hardware.camera2.CameraAccessException { return null; }
    public abstract android.hardware.camera2.CaptureRequest.Builder createReprocessCaptureRequest(android.hardware.camera2.TotalCaptureResult p0) throws android.hardware.camera2.CameraAccessException;
    public abstract void close();
    public boolean isSessionConfigurationSupported(android.hardware.camera2.params.SessionConfiguration p0) throws android.hardware.camera2.CameraAccessException { return false; }
    public void setCameraAudioRestriction(int p0) throws android.hardware.camera2.CameraAccessException {}
    public int getCameraAudioRestriction() throws android.hardware.camera2.CameraAccessException { return 0; }
    public CameraDevice() {}

    public static abstract class StateCallback {
        public static final int ERROR_CAMERA_IN_USE = 1;
        public static final int ERROR_MAX_CAMERAS_IN_USE = 2;
        public static final int ERROR_CAMERA_DISABLED = 3;
        public static final int ERROR_CAMERA_DEVICE = 4;
        public static final int ERROR_CAMERA_SERVICE = 5;
        public StateCallback() {}
        public abstract void onOpened(android.hardware.camera2.CameraDevice p0);
        public void onClosed(android.hardware.camera2.CameraDevice p0) {}
        public abstract void onDisconnected(android.hardware.camera2.CameraDevice p0);
        public abstract void onError(android.hardware.camera2.CameraDevice p0, int p1);

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public static @interface ErrorCode {
        }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface CAMERA_AUDIO_RESTRICTION {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface RequestTemplate {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface SessionOperatingMode {
    }
}
