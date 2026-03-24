package com.android.internal.org.bouncycastle.jcajce.provider.symmetric.util;

public abstract class BaseAlgorithmParameterGenerator extends java.security.AlgorithmParameterGeneratorSpi {
    protected java.security.SecureRandom random;
    protected int strength;
    public BaseAlgorithmParameterGenerator() { super(); }
    protected final java.security.AlgorithmParameters createParametersInstance(java.lang.String p0) throws java.security.NoSuchAlgorithmException, java.security.NoSuchProviderException { return null; }
    protected void engineInit(int p0, java.security.SecureRandom p1) {}
}
