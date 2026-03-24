package android.security;

public class KeyStoreException extends java.lang.Exception {
    public static final int ERROR_OTHER = 1;
    public static final int ERROR_USER_AUTHENTICATION_REQUIRED = 2;
    public static final int ERROR_KEYSTORE_UNINITIALIZED = 3;
    public static final int ERROR_INTERNAL_SYSTEM_ERROR = 4;
    public static final int ERROR_PERMISSION_DENIED = 5;
    public static final int ERROR_KEY_DOES_NOT_EXIST = 6;
    public static final int ERROR_KEY_CORRUPTED = 7;
    public static final int ERROR_ID_ATTESTATION_FAILURE = 8;
    public static final int ERROR_ATTESTATION_CHALLENGE_TOO_LARGE = 9;
    public static final int ERROR_KEYMINT_FAILURE = 10;
    public static final int ERROR_KEYSTORE_FAILURE = 11;
    public static final int ERROR_UNIMPLEMENTED = 12;
    public static final int ERROR_INCORRECT_USAGE = 13;
    public static final int ERROR_KEY_NOT_TEMPORALLY_VALID = 14;
    public static final int ERROR_KEY_OPERATION_EXPIRED = 15;
    public static final int ERROR_ATTESTATION_KEYS_UNAVAILABLE = 16;
    public static final int ERROR_DEVICE_REQUIRES_UPGRADE_FOR_ATTESTATION = 17;
    public static final int RETRY_NEVER = 1;
    public static final int RETRY_WITH_EXPONENTIAL_BACKOFF = 2;
    public static final int RETRY_WHEN_CONNECTIVITY_AVAILABLE = 3;
    public static final int RETRY_AFTER_NEXT_REBOOT = 4;
    public static final int RKP_SUCCESS = 0;
    public static final int RKP_TEMPORARILY_UNAVAILABLE = 1;
    public static final int RKP_SERVER_REFUSED_ISSUANCE = 2;
    public static final int RKP_FETCHING_PENDING_CONNECTIVITY = 3;
    public static final int RKP_FETCHING_PENDING_SOFTWARE_REBOOT = 4;
    public KeyStoreException(int p0, java.lang.String p1) { super(); }
    public KeyStoreException(int p0, java.lang.String p1, java.lang.String p2) { super(); }
    public KeyStoreException(int p0, java.lang.String p1, int p2) { super(); }
    public int getErrorCode() { return 0; }
    public int getNumericErrorCode() { return 0; }
    public boolean isTransientFailure() { return false; }
    public boolean requiresUserAuthentication() { return false; }
    public boolean isSystemError() { return false; }
    public int getRetryPolicy() { return 0; }
    public java.lang.String toString() { return null; }
    public static boolean hasFailureInfoForError(int p0) { return false; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface PublicErrorCode {
    }

    private static final class PublicErrorInformation {
        public final int indicators = 0;
        public final int errorCode = 0;
        PublicErrorInformation(int p0, int p1) {}
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface RetryPolicy {
    }
}
