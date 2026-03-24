package android.content.pm.verify.domain;

public interface DomainVerificationState {
    public static final int STATE_NO_RESPONSE = 0;
    public static final int STATE_SUCCESS = 1;
    public static final int STATE_APPROVED = 2;
    public static final int STATE_DENIED = 3;
    public static final int STATE_MIGRATED = 4;
    public static final int STATE_RESTORED = 5;
    public static final int STATE_LEGACY_FAILURE = 6;
    public static final int STATE_SYS_CONFIG = 7;
    public static final int STATE_PRE_VERIFIED = 8;
    public static final int STATE_FIRST_VERIFIER_DEFINED = 1024;
    @android.annotation.NonNull
    public static java.lang.String stateToDebugString(int p0) { return null; }
    public static boolean isDefault(int p0) { return false; }
    public static boolean isVerified(int p0) { return false; }
    public static boolean isModifiable(int p0) { return false; }
    public static boolean shouldMigrate(int p0) { return false; }
    public static int convertToInfoState(int p0) { return 0; }

    public static @interface State {
    }
}
