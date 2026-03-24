package com.android.internal.org.bouncycastle.jcajce.provider.asymmetric.dh;

public class KeyAgreementSpi extends com.android.internal.org.bouncycastle.jcajce.provider.asymmetric.util.BaseAgreementSpi {
    public KeyAgreementSpi() { super(null, null); }
    public KeyAgreementSpi(java.lang.String p0, com.android.internal.org.bouncycastle.crypto.DerivationFunction p1) { super(null, null); }
    public KeyAgreementSpi(java.lang.String p0, com.android.internal.org.bouncycastle.crypto.BasicAgreement p1, com.android.internal.org.bouncycastle.crypto.DerivationFunction p2) { super(null, null); }
    protected byte[] bigIntToBytes(java.math.BigInteger p0) { return null; }
    protected java.security.Key engineDoPhase(java.security.Key p0, boolean p1) throws java.security.InvalidKeyException, java.lang.IllegalStateException { return null; }
    protected byte[] engineGenerateSecret() throws java.lang.IllegalStateException { return null; }
    protected int engineGenerateSecret(byte[] p0, int p1) throws java.lang.IllegalStateException, javax.crypto.ShortBufferException { return 0; }
    protected javax.crypto.SecretKey engineGenerateSecret(java.lang.String p0) throws java.security.NoSuchAlgorithmException { return null; }
    protected void engineInit(java.security.Key p0, java.security.spec.AlgorithmParameterSpec p1, java.security.SecureRandom p2) throws java.security.InvalidKeyException, java.security.InvalidAlgorithmParameterException {}
    protected void engineInit(java.security.Key p0, java.security.SecureRandom p1) throws java.security.InvalidKeyException {}
    protected byte[] calcSecret() { return null; }
}
