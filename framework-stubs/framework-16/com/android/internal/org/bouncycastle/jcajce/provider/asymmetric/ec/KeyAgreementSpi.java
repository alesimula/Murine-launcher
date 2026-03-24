package com.android.internal.org.bouncycastle.jcajce.provider.asymmetric.ec;

public class KeyAgreementSpi extends com.android.internal.org.bouncycastle.jcajce.provider.asymmetric.util.BaseAgreementSpi {
    protected KeyAgreementSpi(java.lang.String p0, com.android.internal.org.bouncycastle.crypto.BasicAgreement p1, com.android.internal.org.bouncycastle.crypto.DerivationFunction p2) { super(null, null); }
    protected byte[] bigIntToBytes(java.math.BigInteger p0) { return null; }
    protected java.security.Key engineDoPhase(java.security.Key p0, boolean p1) throws java.security.InvalidKeyException, java.lang.IllegalStateException { return null; }
    protected void doInitFromKey(java.security.Key p0, java.security.spec.AlgorithmParameterSpec p1, java.security.SecureRandom p2) throws java.security.InvalidKeyException, java.security.InvalidAlgorithmParameterException {}
    protected void engineInit(java.security.Key p0, java.security.SecureRandom p1) throws java.security.InvalidKeyException {}
    protected byte[] doCalcSecret() { return null; }

    public static class DH extends com.android.internal.org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi {
        public DH() { super(null, null, null); }
    }
}
