package android.health.connect;

public class HealthConnectException extends java.lang.RuntimeException {
    public static final int ERROR_DATA_SYNC_IN_PROGRESS = 8;
    public static final int ERROR_INTERNAL = 2;
    public static final int ERROR_INVALID_ARGUMENT = 3;
    public static final int ERROR_IO = 4;
    public static final int ERROR_RATE_LIMIT_EXCEEDED = 7;
    public static final int ERROR_REMOTE = 6;
    public static final int ERROR_SECURITY = 5;
    public static final int ERROR_UNKNOWN = 1;
    public static final int ERROR_UNSUPPORTED_OPERATION = 9;
    HealthConnectException() { super(); }
    public int getErrorCode() { return 0; }
}
