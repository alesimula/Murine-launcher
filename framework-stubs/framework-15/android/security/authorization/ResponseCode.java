package android.security.authorization;

public @interface ResponseCode {
    public static final int NO_AUTH_TOKEN_FOUND = 1;
    public static final int AUTH_TOKEN_EXPIRED = 2;
    public static final int SYSTEM_ERROR = 4;
    public static final int PERMISSION_DENIED = 6;
    public static final int KEY_NOT_FOUND = 7;
    public static final int VALUE_CORRUPTED = 8;
    public static final int INVALID_ARGUMENT = 20;
}
