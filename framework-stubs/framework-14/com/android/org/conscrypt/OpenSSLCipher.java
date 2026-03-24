package com.android.org.conscrypt;

public abstract class OpenSSLCipher extends javax.crypto.CipherSpi {
    com.android.org.conscrypt.OpenSSLCipher.Mode mode;
    byte[] encodedKey;
    byte[] iv;
    OpenSSLCipher() { super(); }
    OpenSSLCipher(com.android.org.conscrypt.OpenSSLCipher.Mode p0, com.android.org.conscrypt.OpenSSLCipher.Padding p1) { super(); }
    abstract void engineInitInternal(byte[] p0, java.security.spec.AlgorithmParameterSpec p1, java.security.SecureRandom p2) throws java.security.InvalidKeyException, java.security.InvalidAlgorithmParameterException;
    abstract int updateInternal(byte[] p0, int p1, int p2, byte[] p3, int p4, int p5) throws javax.crypto.ShortBufferException;
    abstract int doFinalInternal(byte[] p0, int p1, int p2) throws javax.crypto.IllegalBlockSizeException, javax.crypto.BadPaddingException, javax.crypto.ShortBufferException;
    abstract java.lang.String getBaseCipherName();
    abstract void checkSupportedKeySize(int p0) throws java.security.InvalidKeyException;
    abstract void checkSupportedMode(com.android.org.conscrypt.OpenSSLCipher.Mode p0) throws java.security.NoSuchAlgorithmException;
    abstract void checkSupportedPadding(com.android.org.conscrypt.OpenSSLCipher.Padding p0) throws javax.crypto.NoSuchPaddingException;
    abstract int getCipherBlockSize();
    boolean supportsVariableSizeKey() { return false; }
    boolean supportsVariableSizeIv() { return false; }
    protected void engineSetMode(java.lang.String p0) throws java.security.NoSuchAlgorithmException {}
    protected void engineSetPadding(java.lang.String p0) throws javax.crypto.NoSuchPaddingException {}
    com.android.org.conscrypt.OpenSSLCipher.Padding getPadding() { return null; }
    protected int engineGetBlockSize() { return 0; }
    abstract int getOutputSizeForFinal(int p0);
    abstract int getOutputSizeForUpdate(int p0);
    protected int engineGetOutputSize(int p0) { return 0; }
    protected byte[] engineGetIV() { return null; }
    protected java.security.AlgorithmParameters engineGetParameters() { return null; }
    protected java.security.spec.AlgorithmParameterSpec getParameterSpec(java.security.AlgorithmParameters p0) throws java.security.InvalidAlgorithmParameterException { return null; }
    protected void engineInit(int p0, java.security.Key p1, java.security.SecureRandom p2) throws java.security.InvalidKeyException {}
    protected void engineInit(int p0, java.security.Key p1, java.security.spec.AlgorithmParameterSpec p2, java.security.SecureRandom p3) throws java.security.InvalidKeyException, java.security.InvalidAlgorithmParameterException {}
    protected void engineInit(int p0, java.security.Key p1, java.security.AlgorithmParameters p2, java.security.SecureRandom p3) throws java.security.InvalidKeyException, java.security.InvalidAlgorithmParameterException {}
    protected byte[] engineUpdate(byte[] p0, int p1, int p2) { return null; }
    protected int engineUpdate(byte[] p0, int p1, int p2, byte[] p3, int p4) throws javax.crypto.ShortBufferException { return 0; }
    protected byte[] engineDoFinal(byte[] p0, int p1, int p2) throws javax.crypto.IllegalBlockSizeException, javax.crypto.BadPaddingException { return null; }
    protected int engineDoFinal(byte[] p0, int p1, int p2, byte[] p3, int p4) throws javax.crypto.ShortBufferException, javax.crypto.IllegalBlockSizeException, javax.crypto.BadPaddingException { return 0; }
    protected byte[] engineWrap(java.security.Key p0) throws javax.crypto.IllegalBlockSizeException, java.security.InvalidKeyException { return null; }
    protected java.security.Key engineUnwrap(byte[] p0, java.lang.String p1, int p2) throws java.security.InvalidKeyException, java.security.NoSuchAlgorithmException { return null; }
    protected int engineGetKeySize(java.security.Key p0) throws java.security.InvalidKeyException { return 0; }
    boolean isEncrypting() { return false; }

    static enum Mode {
        NONE,
        CBC,
        CTR,
        ECB,
        GCM,
        GCM_SIV,
        POLY1305;
        public static com.android.org.conscrypt.OpenSSLCipher.Mode getNormalized(java.lang.String p0) { return null; }
    }

    static enum Padding {
        NOPADDING,
        PKCS5PADDING,
        PKCS7PADDING;
        public static com.android.org.conscrypt.OpenSSLCipher.Padding getNormalized(java.lang.String p0) { return null; }
    }
}
