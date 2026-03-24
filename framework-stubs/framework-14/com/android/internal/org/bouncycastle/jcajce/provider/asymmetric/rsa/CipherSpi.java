package com.android.internal.org.bouncycastle.jcajce.provider.asymmetric.rsa;

public class CipherSpi extends com.android.internal.org.bouncycastle.jcajce.provider.asymmetric.util.BaseCipherSpi {
    public CipherSpi(com.android.internal.org.bouncycastle.crypto.AsymmetricBlockCipher p0) { super(); }
    public CipherSpi(javax.crypto.spec.OAEPParameterSpec p0) { super(); }
    public CipherSpi(boolean p0, boolean p1, com.android.internal.org.bouncycastle.crypto.AsymmetricBlockCipher p2) { super(); }
    protected int engineGetBlockSize() { return 0; }
    protected int engineGetKeySize(java.security.Key p0) { return 0; }
    protected int engineGetOutputSize(int p0) { return 0; }
    protected java.security.AlgorithmParameters engineGetParameters() { return null; }
    protected void engineSetMode(java.lang.String p0) throws java.security.NoSuchAlgorithmException {}
    protected void engineSetPadding(java.lang.String p0) throws javax.crypto.NoSuchPaddingException {}
    protected void engineInit(int p0, java.security.Key p1, java.security.spec.AlgorithmParameterSpec p2, java.security.SecureRandom p3) throws java.security.InvalidKeyException, java.security.InvalidAlgorithmParameterException {}
    protected void engineInit(int p0, java.security.Key p1, java.security.AlgorithmParameters p2, java.security.SecureRandom p3) throws java.security.InvalidKeyException, java.security.InvalidAlgorithmParameterException {}
    protected void engineInit(int p0, java.security.Key p1, java.security.SecureRandom p2) throws java.security.InvalidKeyException {}
    protected byte[] engineUpdate(byte[] p0, int p1, int p2) { return null; }
    protected int engineUpdate(byte[] p0, int p1, int p2, byte[] p3, int p4) { return 0; }
    protected byte[] engineDoFinal(byte[] p0, int p1, int p2) throws javax.crypto.IllegalBlockSizeException, javax.crypto.BadPaddingException { return null; }
    protected int engineDoFinal(byte[] p0, int p1, int p2, byte[] p3, int p4) throws javax.crypto.IllegalBlockSizeException, javax.crypto.BadPaddingException, javax.crypto.ShortBufferException { return 0; }

    public static class NoPadding extends com.android.internal.org.bouncycastle.jcajce.provider.asymmetric.rsa.CipherSpi {
        public NoPadding() { super((com.android.internal.org.bouncycastle.crypto.AsymmetricBlockCipher)null); }
    }
}
