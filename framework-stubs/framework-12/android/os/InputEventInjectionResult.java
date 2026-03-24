package android.os;

public @interface InputEventInjectionResult {
    public static final int PENDING = -1;
    public static final int SUCCEEDED = 0;
    public static final int PERMISSION_DENIED = 1;
    public static final int FAILED = 2;
    public static final int TIMED_OUT = 3;
}
