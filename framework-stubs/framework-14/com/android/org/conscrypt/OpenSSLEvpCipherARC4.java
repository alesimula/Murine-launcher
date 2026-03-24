package com.android.org.conscrypt;

public class OpenSSLEvpCipherARC4 extends com.android.org.conscrypt.OpenSSLEvpCipher {
    public OpenSSLEvpCipherARC4() { super(null, null); }
    java.lang.String getBaseCipherName() { return null; }
    java.lang.String getCipherName(int p0, com.android.org.conscrypt.OpenSSLCipher.Mode p1) { return null; }
    void checkSupportedKeySize(int p0) throws java.security.InvalidKeyException {}
    void checkSupportedMode(com.android.org.conscrypt.OpenSSLCipher.Mode p0) throws java.security.NoSuchAlgorithmException {}
    void checkSupportedPadding(com.android.org.conscrypt.OpenSSLCipher.Padding p0) throws javax.crypto.NoSuchPaddingException {}
    int getCipherBlockSize() { return 0; }
    boolean supportsVariableSizeKey() { return false; }
}
