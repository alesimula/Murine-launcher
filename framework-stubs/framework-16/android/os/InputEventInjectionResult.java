package android.os;

public @interface InputEventInjectionResult {
    public static final int PENDING = -1;
    public static final int SUCCEEDED = 0;
    public static final int TARGET_MISMATCH = 1;
    public static final int FAILED = 2;
    public static final int TIMED_OUT = 3;
    public static final int ftl_first = -1;
    public static final int ftl_last = 3;
}
