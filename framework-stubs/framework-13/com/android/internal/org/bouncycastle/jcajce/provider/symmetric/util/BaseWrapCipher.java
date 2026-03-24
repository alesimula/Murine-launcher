package com.android.internal.org.bouncycastle.jcajce.provider.symmetric.util;

public abstract class BaseWrapCipher extends javax.crypto.CipherSpi implements com.android.internal.org.bouncycastle.jcajce.provider.symmetric.util.PBE {
    protected int pbeType;
    protected int pbeHash;
    protected int pbeKeySize;
    protected int pbeIvSize;
    protected java.security.AlgorithmParameters engineParams;
    protected com.android.internal.org.bouncycastle.crypto.Wrapper wrapEngine;
    protected BaseWrapCipher() { super(); }
    protected BaseWrapCipher(com.android.internal.org.bouncycastle.crypto.Wrapper p0) { super(); }
    protected BaseWrapCipher(com.android.internal.org.bouncycastle.crypto.Wrapper p0, int p1) { super(); }
    protected int engineGetBlockSize() { return 0; }
    protected byte[] engineGetIV() { return null; }
    protected int engineGetKeySize(java.security.Key p0) { return 0; }
    protected int engineGetOutputSize(int p0) { return 0; }
    protected java.security.AlgorithmParameters engineGetParameters() { return null; }
    protected final java.security.AlgorithmParameters createParametersInstance(java.lang.String p0) throws java.security.NoSuchAlgorithmException, java.security.NoSuchProviderException { return null; }
    protected void engineSetMode(java.lang.String p0) throws java.security.NoSuchAlgorithmException {}
    protected void engineSetPadding(java.lang.String p0) throws javax.crypto.NoSuchPaddingException {}
    protected void engineInit(int p0, java.security.Key p1, java.security.spec.AlgorithmParameterSpec p2, java.security.SecureRandom p3) throws java.security.InvalidKeyException, java.security.InvalidAlgorithmParameterException {}
    protected void engineInit(int p0, java.security.Key p1, java.security.AlgorithmParameters p2, java.security.SecureRandom p3) throws java.security.InvalidKeyException, java.security.InvalidAlgorithmParameterException {}
    protected void engineInit(int p0, java.security.Key p1, java.security.SecureRandom p2) throws java.security.InvalidKeyException {}
    protected byte[] engineUpdate(byte[] p0, int p1, int p2) { return null; }
    protected int engineUpdate(byte[] p0, int p1, int p2, byte[] p3, int p4) throws javax.crypto.ShortBufferException { return 0; }
    protected byte[] engineDoFinal(byte[] p0, int p1, int p2) throws javax.crypto.IllegalBlockSizeException, javax.crypto.BadPaddingException { return null; }
    protected int engineDoFinal(byte[] p0, int p1, int p2, byte[] p3, int p4) throws javax.crypto.IllegalBlockSizeException, javax.crypto.BadPaddingException, javax.crypto.ShortBufferException { return 0; }
    protected byte[] engineWrap(java.security.Key p0) throws javax.crypto.IllegalBlockSizeException, java.security.InvalidKeyException { return null; }
    protected java.security.Key engineUnwrap(byte[] p0, java.lang.String p1, int p2) throws java.security.InvalidKeyException, java.security.NoSuchAlgorithmException { return null; }

    protected static final class ErasableOutputStream extends java.io.ByteArrayOutputStream {
        public ErasableOutputStream() { super(); }
        public byte[] getBuf() { return null; }
        public void erase() {}
    }

    protected static class InvalidKeyOrParametersException extends java.security.InvalidKeyException {
        InvalidKeyOrParametersException(java.lang.String p0, java.lang.Throwable p1) { super(); }
        public java.lang.Throwable getCause() { return null; }
    }
}
