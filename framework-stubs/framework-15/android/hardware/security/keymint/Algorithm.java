package android.hardware.security.keymint;

public @interface Algorithm {
    public static final int RSA = 1;
    public static final int EC = 3;
    public static final int AES = 32;
    public static final int TRIPLE_DES = 33;
    public static final int HMAC = 128;
}
