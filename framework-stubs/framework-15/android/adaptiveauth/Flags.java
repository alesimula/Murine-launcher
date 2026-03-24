package android.adaptiveauth;

public final class Flags {
    public static final java.lang.String FLAG_ENABLE_ADAPTIVE_AUTH = "android.adaptiveauth.enable_adaptive_auth";
    public static final java.lang.String FLAG_REPORT_BIOMETRIC_AUTH_ATTEMPTS = "android.adaptiveauth.report_biometric_auth_attempts";
    public Flags() {}
    public static boolean enableAdaptiveAuth() { return false; }
    public static boolean reportBiometricAuthAttempts() { return false; }
}
