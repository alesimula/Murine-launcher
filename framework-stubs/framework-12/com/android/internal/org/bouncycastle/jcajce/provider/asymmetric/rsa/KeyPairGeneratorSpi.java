package com.android.internal.org.bouncycastle.jcajce.provider.asymmetric.rsa;

public class KeyPairGeneratorSpi extends java.security.KeyPairGenerator {
    private static final com.android.internal.org.bouncycastle.asn1.x509.AlgorithmIdentifier PKCS_ALGID = null;
    private static final com.android.internal.org.bouncycastle.asn1.x509.AlgorithmIdentifier PSS_ALGID = null;
    static final java.math.BigInteger defaultPublicExponent = null;
    com.android.internal.org.bouncycastle.crypto.params.RSAKeyGenerationParameters param;
    com.android.internal.org.bouncycastle.crypto.generators.RSAKeyPairGenerator engine;
    com.android.internal.org.bouncycastle.asn1.x509.AlgorithmIdentifier algId;
    public KeyPairGeneratorSpi(java.lang.String p0, com.android.internal.org.bouncycastle.asn1.x509.AlgorithmIdentifier p1) { super((java.lang.String)null); }
    public KeyPairGeneratorSpi() { super((java.lang.String)null); }
    public void initialize(int p0, java.security.SecureRandom p1) {}
    public void initialize(java.security.spec.AlgorithmParameterSpec p0, java.security.SecureRandom p1) throws java.security.InvalidAlgorithmParameterException {}
    public java.security.KeyPair generateKeyPair() { return null; }

    public static class PSS extends com.android.internal.org.bouncycastle.jcajce.provider.asymmetric.rsa.KeyPairGeneratorSpi {
        public PSS() { super(); }
    }
}
