package android.app.ondeviceintelligence;

@android.annotation.SystemApi
@android.annotation.FlaggedApi("android.app.ondeviceintelligence.flags.enable_on_device_intelligence")
public class OnDeviceIntelligenceException extends java.lang.Exception {
    public static final int PROCESSING_ERROR_UNKNOWN = 1;
    public static final int PROCESSING_ERROR_BAD_DATA = 2;
    public static final int PROCESSING_ERROR_BAD_REQUEST = 3;
    public static final int PROCESSING_ERROR_REQUEST_NOT_SAFE = 4;
    public static final int PROCESSING_ERROR_COMPUTE_ERROR = 5;
    public static final int PROCESSING_ERROR_IPC_ERROR = 6;
    public static final int PROCESSING_ERROR_CANCELLED = 7;
    public static final int PROCESSING_ERROR_NOT_AVAILABLE = 8;
    public static final int PROCESSING_ERROR_BUSY = 9;
    public static final int PROCESSING_ERROR_SAFETY_ERROR = 10;
    public static final int PROCESSING_ERROR_RESPONSE_NOT_SAFE = 11;
    public static final int PROCESSING_ERROR_REQUEST_TOO_LARGE = 12;
    public static final int PROCESSING_ERROR_SUSPENDED = 13;
    public static final int PROCESSING_ERROR_INTERNAL = 14;
    public static final int PROCESSING_ERROR_SERVICE_UNAVAILABLE = 15;
    public static final int ON_DEVICE_INTELLIGENCE_SERVICE_UNAVAILABLE = 100;
    public static final int PROCESSING_UPDATE_STATUS_CONNECTION_FAILED = 200;
    public int getErrorCode() { return 0; }
    @android.annotation.NonNull
    public android.os.PersistableBundle getErrorParams() { return null; }
    public OnDeviceIntelligenceException(int p0, java.lang.String p1, android.os.PersistableBundle p2) { super(); }
    public OnDeviceIntelligenceException(int p0, android.os.PersistableBundle p1) { super(); }
    public OnDeviceIntelligenceException(int p0, java.lang.String p1) { super(); }
    public OnDeviceIntelligenceException(int p0) { super(); }

    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_PARAMETER, java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    static @interface OnDeviceIntelligenceError {
    }
}
