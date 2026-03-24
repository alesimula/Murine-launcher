package android.hardware.security.keymint;

public @interface KeyPurpose {
    public static final int ENCRYPT = 0;
    public static final int DECRYPT = 1;
    public static final int SIGN = 2;
    public static final int VERIFY = 3;
    public static final int WRAP_KEY = 5;
    public static final int AGREE_KEY = 6;
    public static final int ATTEST_KEY = 7;
}
