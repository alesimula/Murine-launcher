package com.android.internal.org.bouncycastle.jcajce.provider.asymmetric.dh;

public class AlgorithmParametersSpi extends java.security.AlgorithmParametersSpi {
    javax.crypto.spec.DHParameterSpec currentSpec;
    public AlgorithmParametersSpi() { super(); }
    protected boolean isASN1FormatString(java.lang.String p0) { return false; }
    protected java.security.spec.AlgorithmParameterSpec engineGetParameterSpec(java.lang.Class p0) throws java.security.spec.InvalidParameterSpecException { return null; }
    protected byte[] engineGetEncoded() { return null; }
    protected byte[] engineGetEncoded(java.lang.String p0) { return null; }
    protected java.security.spec.AlgorithmParameterSpec localEngineGetParameterSpec(java.lang.Class p0) throws java.security.spec.InvalidParameterSpecException { return null; }
    protected void engineInit(java.security.spec.AlgorithmParameterSpec p0) throws java.security.spec.InvalidParameterSpecException {}
    protected void engineInit(byte[] p0) throws java.io.IOException {}
    protected void engineInit(byte[] p0, java.lang.String p1) throws java.io.IOException {}
    protected java.lang.String engineToString() { return null; }
}
