package com.android.internal.org.bouncycastle.jcajce.provider.asymmetric.ec;

public abstract class KeyPairGeneratorSpi extends java.security.KeyPairGenerator {
    public KeyPairGeneratorSpi(java.lang.String p0) { super((java.lang.String)null); }

    public static class EC extends com.android.internal.org.bouncycastle.jcajce.provider.asymmetric.ec.KeyPairGeneratorSpi {
        com.android.internal.org.bouncycastle.crypto.params.ECKeyGenerationParameters param;
        com.android.internal.org.bouncycastle.crypto.generators.ECKeyPairGenerator engine;
        java.lang.Object ecParams;
        int strength;
        java.security.SecureRandom random;
        boolean initialised;
        java.lang.String algorithm;
        com.android.internal.org.bouncycastle.jcajce.provider.config.ProviderConfiguration configuration;
        public EC() { super(null); }
        public EC(java.lang.String p0, com.android.internal.org.bouncycastle.jcajce.provider.config.ProviderConfiguration p1) { super(null); }
        public void initialize(int p0, java.security.SecureRandom p1) {}
        public void initialize(java.security.spec.AlgorithmParameterSpec p0, java.security.SecureRandom p1) throws java.security.InvalidAlgorithmParameterException {}
        public java.security.KeyPair generateKeyPair() { return null; }
        protected com.android.internal.org.bouncycastle.crypto.params.ECKeyGenerationParameters createKeyGenParamsBC(com.android.internal.org.bouncycastle.jce.spec.ECParameterSpec p0, java.security.SecureRandom p1) { return null; }
        protected com.android.internal.org.bouncycastle.crypto.params.ECKeyGenerationParameters createKeyGenParamsJCE(java.security.spec.ECParameterSpec p0, java.security.SecureRandom p1) { return null; }
        protected com.android.internal.org.bouncycastle.jce.spec.ECNamedCurveSpec createNamedCurveSpec(java.lang.String p0) throws java.security.InvalidAlgorithmParameterException { return null; }
        protected void initializeNamedCurve(java.lang.String p0, java.security.SecureRandom p1) throws java.security.InvalidAlgorithmParameterException {}
    }

    public static class ECDH extends com.android.internal.org.bouncycastle.jcajce.provider.asymmetric.ec.KeyPairGeneratorSpi.EC {
        public ECDH() { super(); }
    }

    public static class ECDHC extends com.android.internal.org.bouncycastle.jcajce.provider.asymmetric.ec.KeyPairGeneratorSpi.EC {
        public ECDHC() { super(); }
    }

    public static class ECDSA extends com.android.internal.org.bouncycastle.jcajce.provider.asymmetric.ec.KeyPairGeneratorSpi.EC {
        public ECDSA() { super(); }
    }

    public static class ECMQV extends com.android.internal.org.bouncycastle.jcajce.provider.asymmetric.ec.KeyPairGeneratorSpi.EC {
        public ECMQV() { super(); }
    }
}
