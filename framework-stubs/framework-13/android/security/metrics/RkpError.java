package android.security.metrics;

public @interface RkpError {
    public static final int RKP_ERROR_UNSPECIFIED = 0;
    public static final int OUT_OF_KEYS = 1;
    public static final int FALL_BACK_DURING_HYBRID = 2;
}
