package android.hardware.camera2.legacy;

public class LegacyExceptionUtils {
    private static final java.lang.String TAG = "LegacyExceptionUtils";
    public static final int NO_ERROR = 0;
    public static final int PERMISSION_DENIED = Integer.valueOf(0);
    public static final int ALREADY_EXISTS = Integer.valueOf(0);
    public static final int BAD_VALUE = Integer.valueOf(0);
    public static final int DEAD_OBJECT = Integer.valueOf(0);
    public static final int INVALID_OPERATION = Integer.valueOf(0);
    public static final int TIMED_OUT = Integer.valueOf(0);
    public static int throwOnError(int p0) throws android.hardware.camera2.legacy.LegacyExceptionUtils.BufferQueueAbandonedException { return 0; }
    public static void throwOnServiceError(int p0) {}
    private LegacyExceptionUtils() {}

    public static class BufferQueueAbandonedException extends android.util.AndroidException {
        public BufferQueueAbandonedException() { super(); }
        public BufferQueueAbandonedException(java.lang.String p0) { super(); }
        public BufferQueueAbandonedException(java.lang.String p0, java.lang.Throwable p1) { super(); }
        public BufferQueueAbandonedException(java.lang.Exception p0) { super(); }
    }
}
