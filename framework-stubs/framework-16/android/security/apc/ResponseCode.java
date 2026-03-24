package android.security.apc;

public @interface ResponseCode {
    public static final int OK = 0;
    public static final int CANCELLED = 1;
    public static final int ABORTED = 2;
    public static final int OPERATION_PENDING = 3;
    public static final int IGNORED = 4;
    public static final int SYSTEM_ERROR = 5;
    public static final int UNIMPLEMENTED = 6;
    public static final int PERMISSION_DENIED = 30;
}
