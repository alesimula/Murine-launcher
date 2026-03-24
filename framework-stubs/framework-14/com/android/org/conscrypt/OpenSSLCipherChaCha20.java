package com.android.org.conscrypt;

public class OpenSSLCipherChaCha20 extends com.android.org.conscrypt.OpenSSLCipher {
    public OpenSSLCipherChaCha20() { super(); }
    void engineInitInternal(byte[] p0, java.security.spec.AlgorithmParameterSpec p1, java.security.SecureRandom p2) throws java.security.InvalidAlgorithmParameterException {}
    int updateInternal(byte[] p0, int p1, int p2, byte[] p3, int p4, int p5) throws javax.crypto.ShortBufferException { return 0; }
    int doFinalInternal(byte[] p0, int p1, int p2) { return 0; }
    java.lang.String getBaseCipherName() { return null; }
    void checkSupportedKeySize(int p0) throws java.security.InvalidKeyException {}
    void checkSupportedMode(com.android.org.conscrypt.OpenSSLCipher.Mode p0) throws java.security.NoSuchAlgorithmException {}
    void checkSupportedPadding(com.android.org.conscrypt.OpenSSLCipher.Padding p0) throws javax.crypto.NoSuchPaddingException {}
    int getCipherBlockSize() { return 0; }
    int getOutputSizeForFinal(int p0) { return 0; }
    int getOutputSizeForUpdate(int p0) { return 0; }
}
