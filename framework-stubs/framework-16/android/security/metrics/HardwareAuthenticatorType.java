package android.security.metrics;

public @interface HardwareAuthenticatorType {
    public static final int AUTH_TYPE_UNSPECIFIED = 0;
    public static final int NONE = 1;
    public static final int PASSWORD = 2;
    public static final int FINGERPRINT = 3;
    public static final int PASSWORD_OR_FINGERPRINT = 4;
    public static final int ANY = 5;
    public static final int NO_AUTH_TYPE = 6;
}
