package com.android.internal.org.bouncycastle.jcajce.provider.asymmetric.ec;

public abstract class GMKeyPairGeneratorSpi extends java.security.KeyPairGenerator {
    public GMKeyPairGeneratorSpi(java.lang.String p0) { super((java.lang.String)null); }

    public static class BaseSM2 extends com.android.internal.org.bouncycastle.jcajce.provider.asymmetric.ec.GMKeyPairGeneratorSpi {
        com.android.internal.org.bouncycastle.crypto.params.ECKeyGenerationParameters param;
        com.android.internal.org.bouncycastle.crypto.generators.ECKeyPairGenerator engine;
        java.lang.Object ecParams;
        int strength;
        java.security.SecureRandom random;
        boolean initialised;
        java.lang.String algorithm;
        com.android.internal.org.bouncycastle.jcajce.provider.config.ProviderConfiguration configuration;
        public BaseSM2() { super(null); }
        public BaseSM2(java.lang.String p0, com.android.internal.org.bouncycastle.jcajce.provider.config.ProviderConfiguration p1) { super(null); }
        public void initialize(int p0, java.security.SecureRandom p1) {}
        public void initialize(java.security.spec.AlgorithmParameterSpec p0, java.security.SecureRandom p1) throws java.security.InvalidAlgorithmParameterException {}
        public java.security.KeyPair generateKeyPair() { return null; }
        protected com.android.internal.org.bouncycastle.crypto.params.ECKeyGenerationParameters createKeyGenParamsBC(com.android.internal.org.bouncycastle.jce.spec.ECParameterSpec p0, java.security.SecureRandom p1) { return null; }
        protected com.android.internal.org.bouncycastle.crypto.params.ECKeyGenerationParameters createKeyGenParamsJCE(java.security.spec.ECParameterSpec p0, java.security.SecureRandom p1) { return null; }
        protected com.android.internal.org.bouncycastle.crypto.params.ECKeyGenerationParameters createKeyGenParamsJCE(com.android.internal.org.bouncycastle.asn1.x9.X9ECParameters p0, java.security.SecureRandom p1) { return null; }
        protected void initializeNamedCurve(java.lang.String p0, java.security.SecureRandom p1) throws java.security.InvalidAlgorithmParameterException {}
    }

    public static class SM2 extends com.android.internal.org.bouncycastle.jcajce.provider.asymmetric.ec.GMKeyPairGeneratorSpi.BaseSM2 {
        public SM2() { super(); }
    }
}
