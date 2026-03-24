package com.android.org.conscrypt;

public abstract class OpenSSLAeadCipher extends com.android.org.conscrypt.OpenSSLCipher {
    static final int DEFAULT_TAG_SIZE_BITS = 128;
    byte[] buf;
    int bufCount;
    long evpAead;
    int tagLengthInBytes;
    protected OpenSSLAeadCipher(com.android.org.conscrypt.OpenSSLCipher.Mode p0) { super(); }
    void engineInitInternal(byte[] p0, java.security.spec.AlgorithmParameterSpec p1, java.security.SecureRandom p2) throws java.security.InvalidKeyException, java.security.InvalidAlgorithmParameterException {}
    void checkSupportedTagLength(int p0) throws java.security.InvalidAlgorithmParameterException {}
    boolean allowsNonceReuse() { return false; }
    protected int engineDoFinal(java.nio.ByteBuffer p0, java.nio.ByteBuffer p1) throws javax.crypto.ShortBufferException, javax.crypto.IllegalBlockSizeException, javax.crypto.BadPaddingException { return 0; }
    protected int engineDoFinal(byte[] p0, int p1, int p2, byte[] p3, int p4) throws javax.crypto.ShortBufferException, javax.crypto.IllegalBlockSizeException, javax.crypto.BadPaddingException { return 0; }
    int updateInternal(byte[] p0, int p1, int p2, byte[] p3, int p4, int p5) throws javax.crypto.ShortBufferException { return 0; }
    int doFinalInternal(java.nio.ByteBuffer p0, java.nio.ByteBuffer p1) throws javax.crypto.ShortBufferException, javax.crypto.IllegalBlockSizeException, javax.crypto.BadPaddingException { return 0; }
    int doFinalInternal(byte[] p0, int p1, int p2) throws javax.crypto.ShortBufferException, javax.crypto.IllegalBlockSizeException, javax.crypto.BadPaddingException { return 0; }
    void checkSupportedPadding(com.android.org.conscrypt.OpenSSLCipher.Padding p0) throws javax.crypto.NoSuchPaddingException {}
    int getOutputSizeForUpdate(int p0) { return 0; }
    int getOutputSizeForFinal(int p0) { return 0; }
    protected void engineUpdateAAD(byte[] p0, int p1, int p2) {}
    protected void engineUpdateAAD(java.nio.ByteBuffer p0) {}
    abstract long getEVP_AEAD(int p0) throws java.security.InvalidKeyException;
}
