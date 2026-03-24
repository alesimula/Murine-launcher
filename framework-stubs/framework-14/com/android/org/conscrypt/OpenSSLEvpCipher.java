package com.android.org.conscrypt;

public abstract class OpenSSLEvpCipher extends com.android.org.conscrypt.OpenSSLCipher {
    protected OpenSSLEvpCipher(com.android.org.conscrypt.OpenSSLCipher.Mode p0, com.android.org.conscrypt.OpenSSLCipher.Padding p1) { super(); }
    void engineInitInternal(byte[] p0, java.security.spec.AlgorithmParameterSpec p1, java.security.SecureRandom p2) throws java.security.InvalidKeyException, java.security.InvalidAlgorithmParameterException {}
    int updateInternal(byte[] p0, int p1, int p2, byte[] p3, int p4, int p5) throws javax.crypto.ShortBufferException { return 0; }
    int doFinalInternal(byte[] p0, int p1, int p2) throws javax.crypto.IllegalBlockSizeException, javax.crypto.BadPaddingException, javax.crypto.ShortBufferException { return 0; }
    int getOutputSizeForFinal(int p0) { return 0; }
    int getOutputSizeForUpdate(int p0) { return 0; }
    abstract java.lang.String getCipherName(int p0, com.android.org.conscrypt.OpenSSLCipher.Mode p1);
}
