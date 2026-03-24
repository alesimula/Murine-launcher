package android.hardware.camera2;

public abstract class CameraOfflineSession extends android.hardware.camera2.CameraCaptureSession {
    public CameraOfflineSession() { super(); }
    public abstract void close();

    public static abstract class CameraOfflineSessionCallback {
        public static final int STATUS_INTERNAL_ERROR = 0;
        public CameraOfflineSessionCallback() {}
        public abstract void onReady(android.hardware.camera2.CameraOfflineSession p0);
        public abstract void onSwitchFailed(android.hardware.camera2.CameraOfflineSession p0);
        public abstract void onIdle(android.hardware.camera2.CameraOfflineSession p0);
        public abstract void onError(android.hardware.camera2.CameraOfflineSession p0, int p1);
        public abstract void onClosed(android.hardware.camera2.CameraOfflineSession p0);

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public static @interface StatusCode {
        }
    }
}
