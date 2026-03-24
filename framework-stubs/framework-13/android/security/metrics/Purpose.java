package android.security.metrics;

public @interface Purpose {
    public static final int KEY_PURPOSE_UNSPECIFIED = 0;
    public static final int ENCRYPT = 1;
    public static final int DECRYPT = 2;
    public static final int SIGN = 3;
    public static final int VERIFY = 4;
    public static final int WRAP_KEY = 6;
    public static final int AGREE_KEY = 7;
    public static final int ATTEST_KEY = 8;
}
