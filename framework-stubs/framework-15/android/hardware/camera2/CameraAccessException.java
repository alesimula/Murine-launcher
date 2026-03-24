package android.hardware.camera2;

public class CameraAccessException extends android.util.AndroidException {
    public static final int CAMERA_IN_USE = 4;
    public static final int MAX_CAMERAS_IN_USE = 5;
    public static final int CAMERA_DISABLED = 1;
    public static final int CAMERA_DISCONNECTED = 2;
    public static final int CAMERA_ERROR = 3;
    public static final int CAMERA_DEPRECATED_HAL = 1000;
    public final int getReason() { return 0; }
    public CameraAccessException(int p0) { super(); }
    public CameraAccessException(int p0, java.lang.String p1) { super(); }
    public CameraAccessException(int p0, java.lang.String p1, java.lang.Throwable p2) { super(); }
    public CameraAccessException(int p0, java.lang.Throwable p1) { super(); }
    public static java.lang.String getDefaultMessage(int p0) { return null; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface AccessError {
    }
}
