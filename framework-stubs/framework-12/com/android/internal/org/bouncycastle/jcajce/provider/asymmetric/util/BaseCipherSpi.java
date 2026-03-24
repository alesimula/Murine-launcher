package com.android.internal.org.bouncycastle.jcajce.provider.asymmetric.util;

public abstract class BaseCipherSpi extends javax.crypto.CipherSpi {
    private java.lang.Class[] availableSpecs;
    private final com.android.internal.org.bouncycastle.jcajce.util.JcaJceHelper helper = null;
    protected java.security.AlgorithmParameters engineParams;
    protected com.android.internal.org.bouncycastle.crypto.Wrapper wrapEngine;
    private int ivSize;
    private byte[] iv;
    protected BaseCipherSpi() { super(); }
    protected int engineGetBlockSize() { return 0; }
    protected byte[] engineGetIV() { return null; }
    protected int engineGetKeySize(java.security.Key p0) { return 0; }
    protected int engineGetOutputSize(int p0) { return 0; }
    protected java.security.AlgorithmParameters engineGetParameters() { return null; }
    protected final java.security.AlgorithmParameters createParametersInstance(java.lang.String p0) throws java.security.NoSuchAlgorithmException, java.security.NoSuchProviderException { return null; }
    protected void engineSetMode(java.lang.String p0) throws java.security.NoSuchAlgorithmException {}
    protected void engineSetPadding(java.lang.String p0) throws javax.crypto.NoSuchPaddingException {}
    protected byte[] engineWrap(java.security.Key p0) throws javax.crypto.IllegalBlockSizeException, java.security.InvalidKeyException { return null; }
    protected java.security.Key engineUnwrap(byte[] p0, java.lang.String p1, int p2) throws java.security.InvalidKeyException { return null; }

    protected static final class ErasableOutputStream extends java.io.ByteArrayOutputStream {
        public ErasableOutputStream() { super(); }
        public byte[] getBuf() { return null; }
        public void erase() {}
    }
}
