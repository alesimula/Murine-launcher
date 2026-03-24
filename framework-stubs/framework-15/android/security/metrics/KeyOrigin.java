package android.security.metrics;

public @interface KeyOrigin {
    public static final int ORIGIN_UNSPECIFIED = 0;
    public static final int GENERATED = 1;
    public static final int DERIVED = 2;
    public static final int IMPORTED = 3;
    public static final int RESERVED = 4;
    public static final int SECURELY_IMPORTED = 5;
}
