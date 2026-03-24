package android.security.metrics;

public @interface SecurityLevel {
    public static final int SECURITY_LEVEL_UNSPECIFIED = 0;
    public static final int SECURITY_LEVEL_SOFTWARE = 1;
    public static final int SECURITY_LEVEL_TRUSTED_ENVIRONMENT = 2;
    public static final int SECURITY_LEVEL_STRONGBOX = 3;
    public static final int SECURITY_LEVEL_KEYSTORE = 4;
}
