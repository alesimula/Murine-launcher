package com.android.internal.org.bouncycastle.jcajce.provider.symmetric.util;

public abstract class BaseAlgorithmParameters extends java.security.AlgorithmParametersSpi {
    public BaseAlgorithmParameters() { super(); }
    protected boolean isASN1FormatString(java.lang.String p0) { return false; }
    protected java.security.spec.AlgorithmParameterSpec engineGetParameterSpec(java.lang.Class p0) throws java.security.spec.InvalidParameterSpecException { return null; }
    protected abstract java.security.spec.AlgorithmParameterSpec localEngineGetParameterSpec(java.lang.Class p0) throws java.security.spec.InvalidParameterSpecException;
}
