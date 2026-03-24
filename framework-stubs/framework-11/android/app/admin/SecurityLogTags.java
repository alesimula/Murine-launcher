package android.app.admin;

public class SecurityLogTags {
    public static final int SECURITY_ADB_SHELL_INTERACTIVE = 210001;
    public static final int SECURITY_ADB_SHELL_COMMAND = 210002;
    public static final int SECURITY_ADB_SYNC_RECV = 210003;
    public static final int SECURITY_ADB_SYNC_SEND = 210004;
    public static final int SECURITY_APP_PROCESS_START = 210005;
    public static final int SECURITY_KEYGUARD_DISMISSED = 210006;
    public static final int SECURITY_KEYGUARD_DISMISS_AUTH_ATTEMPT = 210007;
    public static final int SECURITY_KEYGUARD_SECURED = 210008;
    public static final int SECURITY_OS_STARTUP = 210009;
    public static final int SECURITY_OS_SHUTDOWN = 210010;
    public static final int SECURITY_LOGGING_STARTED = 210011;
    public static final int SECURITY_LOGGING_STOPPED = 210012;
    public static final int SECURITY_MEDIA_MOUNTED = 210013;
    public static final int SECURITY_MEDIA_UNMOUNTED = 210014;
    public static final int SECURITY_LOG_BUFFER_SIZE_CRITICAL = 210015;
    public static final int SECURITY_PASSWORD_EXPIRATION_SET = 210016;
    public static final int SECURITY_PASSWORD_COMPLEXITY_SET = 210017;
    public static final int SECURITY_PASSWORD_HISTORY_LENGTH_SET = 210018;
    public static final int SECURITY_MAX_SCREEN_LOCK_TIMEOUT_SET = 210019;
    public static final int SECURITY_MAX_PASSWORD_ATTEMPTS_SET = 210020;
    public static final int SECURITY_KEYGUARD_DISABLED_FEATURES_SET = 210021;
    public static final int SECURITY_REMOTE_LOCK = 210022;
    public static final int SECURITY_WIPE_FAILED = 210023;
    public static final int SECURITY_KEY_GENERATED = 210024;
    public static final int SECURITY_KEY_IMPORTED = 210025;
    public static final int SECURITY_KEY_DESTROYED = 210026;
    public static final int SECURITY_USER_RESTRICTION_ADDED = 210027;
    public static final int SECURITY_USER_RESTRICTION_REMOVED = 210028;
    public static final int SECURITY_CERT_AUTHORITY_INSTALLED = 210029;
    public static final int SECURITY_CERT_AUTHORITY_REMOVED = 210030;
    public static final int SECURITY_CRYPTO_SELF_TEST_COMPLETED = 210031;
    public static final int SECURITY_KEY_INTEGRITY_VIOLATION = 210032;
    public static final int SECURITY_CERT_VALIDATION_FAILURE = 210033;
    public static final int SECURITY_CAMERA_POLICY_SET = 210034;
    private SecurityLogTags() {}
    public static void writeSecurityAdbShellInteractive() {}
    public static void writeSecurityAdbShellCommand(java.lang.String p0) {}
    public static void writeSecurityAdbSyncRecv(java.lang.String p0) {}
    public static void writeSecurityAdbSyncSend(java.lang.String p0) {}
    public static void writeSecurityAppProcessStart(java.lang.String p0, long p1, int p2, int p3, java.lang.String p4, java.lang.String p5) {}
    public static void writeSecurityKeyguardDismissed() {}
    public static void writeSecurityKeyguardDismissAuthAttempt(int p0, int p1) {}
    public static void writeSecurityKeyguardSecured() {}
    public static void writeSecurityOsStartup(java.lang.String p0, java.lang.String p1) {}
    public static void writeSecurityOsShutdown() {}
    public static void writeSecurityLoggingStarted() {}
    public static void writeSecurityLoggingStopped() {}
    public static void writeSecurityMediaMounted(java.lang.String p0, java.lang.String p1) {}
    public static void writeSecurityMediaUnmounted(java.lang.String p0, java.lang.String p1) {}
    public static void writeSecurityLogBufferSizeCritical() {}
    public static void writeSecurityPasswordExpirationSet(java.lang.String p0, int p1, int p2, long p3) {}
    public static void writeSecurityPasswordComplexitySet(java.lang.String p0, int p1, int p2, int p3, int p4, int p5, int p6, int p7, int p8, int p9, int p10) {}
    public static void writeSecurityPasswordHistoryLengthSet(java.lang.String p0, int p1, int p2, int p3) {}
    public static void writeSecurityMaxScreenLockTimeoutSet(java.lang.String p0, int p1, int p2, long p3) {}
    public static void writeSecurityMaxPasswordAttemptsSet(java.lang.String p0, int p1, int p2, int p3) {}
    public static void writeSecurityKeyguardDisabledFeaturesSet(java.lang.String p0, int p1, int p2, int p3) {}
    public static void writeSecurityRemoteLock(java.lang.String p0, int p1, int p2) {}
    public static void writeSecurityWipeFailed(java.lang.String p0, int p1) {}
    public static void writeSecurityKeyGenerated(int p0, java.lang.String p1, int p2) {}
    public static void writeSecurityKeyImported(int p0, java.lang.String p1, int p2) {}
    public static void writeSecurityKeyDestroyed(int p0, java.lang.String p1, int p2) {}
    public static void writeSecurityUserRestrictionAdded(java.lang.String p0, int p1, java.lang.String p2) {}
    public static void writeSecurityUserRestrictionRemoved(java.lang.String p0, int p1, java.lang.String p2) {}
    public static void writeSecurityCertAuthorityInstalled(int p0, java.lang.String p1, int p2) {}
    public static void writeSecurityCertAuthorityRemoved(int p0, java.lang.String p1, int p2) {}
    public static void writeSecurityCryptoSelfTestCompleted(int p0) {}
    public static void writeSecurityKeyIntegrityViolation(java.lang.String p0, int p1) {}
    public static void writeSecurityCertValidationFailure(java.lang.String p0) {}
    public static void writeSecurityCameraPolicySet(java.lang.String p0, int p1, int p2, int p3) {}
}
