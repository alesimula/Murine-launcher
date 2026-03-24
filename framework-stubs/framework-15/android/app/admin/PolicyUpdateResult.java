package android.app.admin;

public final class PolicyUpdateResult {
    public static final int RESULT_FAILURE_UNKNOWN = -1;
    public static final int RESULT_POLICY_SET = 0;
    public static final int RESULT_FAILURE_CONFLICTING_ADMIN_POLICY = 1;
    public static final int RESULT_POLICY_CLEARED = 2;
    public static final int RESULT_FAILURE_STORAGE_LIMIT_REACHED = 3;
    public static final int RESULT_FAILURE_HARDWARE_LIMITATION = 4;
    public PolicyUpdateResult(int p0) {}
    public int getResultCode() { return 0; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ResultCode {
    }
}
