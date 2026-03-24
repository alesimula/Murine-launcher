package com.android.internal.org.bouncycastle.jcajce.provider.asymmetric.dsa;

public class KeyPairGeneratorSpi extends java.security.KeyPairGenerator {
    com.android.internal.org.bouncycastle.crypto.params.DSAKeyGenerationParameters param;
    com.android.internal.org.bouncycastle.crypto.generators.DSAKeyPairGenerator engine;
    int strength;
    java.security.SecureRandom random;
    boolean initialised;
    public KeyPairGeneratorSpi() { super((java.lang.String)null); }
    public void initialize(int p0, java.security.SecureRandom p1) {}
    public void initialize(java.security.spec.AlgorithmParameterSpec p0, java.security.SecureRandom p1) throws java.security.InvalidAlgorithmParameterException {}
    public java.security.KeyPair generateKeyPair() { return null; }
}
