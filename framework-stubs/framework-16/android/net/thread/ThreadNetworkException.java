package android.net.thread;

@android.annotation.FlaggedApi("com.android.net.thread.flags.thread_enabled")
public class ThreadNetworkException extends java.lang.Exception {
    public static final int ERROR_ABORTED = 2;
    public static final int ERROR_BUSY = 5;
    public static final int ERROR_FAILED_PRECONDITION = 6;
    public static final int ERROR_INTERNAL_ERROR = 1;
    public static final int ERROR_REJECTED_BY_PEER = 8;
    public static final int ERROR_RESOURCE_EXHAUSTED = 10;
    public static final int ERROR_RESPONSE_BAD_FORMAT = 9;
    public static final int ERROR_THREAD_DISABLED = 12;
    public static final int ERROR_TIMEOUT = 3;
    public static final int ERROR_UNAVAILABLE = 4;
    public static final int ERROR_UNKNOWN = 11;
    public static final int ERROR_UNSUPPORTED_CHANNEL = 7;
    public static final int ERROR_UNSUPPORTED_FEATURE = 13;
    public ThreadNetworkException(int p0, java.lang.String p1) { super(); }
    public int getErrorCode() { return 0; }
}
