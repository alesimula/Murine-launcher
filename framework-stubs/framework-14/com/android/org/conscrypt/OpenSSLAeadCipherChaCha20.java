package com.android.org.conscrypt;

public class OpenSSLAeadCipherChaCha20 extends com.android.org.conscrypt.OpenSSLAeadCipher {
    public OpenSSLAeadCipherChaCha20() { super(null); }
    void checkSupportedKeySize(int p0) throws java.security.InvalidKeyException {}
    java.lang.String getBaseCipherName() { return null; }
    int getCipherBlockSize() { return 0; }
    void checkSupportedMode(com.android.org.conscrypt.OpenSSLCipher.Mode p0) throws java.security.NoSuchAlgorithmException {}
    long getEVP_AEAD(int p0) throws java.security.InvalidKeyException { return 0L; }
    int getOutputSizeForFinal(int p0) { return 0; }
}
