package com.android.internal.org.bouncycastle.jcajce.provider.asymmetric.ec;

public class AlgorithmParametersSpi extends java.security.AlgorithmParametersSpi {
    public AlgorithmParametersSpi() { super(); }
    protected boolean isASN1FormatString(java.lang.String p0) { return false; }
    protected void engineInit(java.security.spec.AlgorithmParameterSpec p0) throws java.security.spec.InvalidParameterSpecException {}
    protected void engineInit(byte[] p0) throws java.io.IOException {}
    protected void engineInit(byte[] p0, java.lang.String p1) throws java.io.IOException {}
    protected <T extends java.security.spec.AlgorithmParameterSpec> T engineGetParameterSpec(java.lang.Class<T> p0) throws java.security.spec.InvalidParameterSpecException { return null; }
    protected byte[] engineGetEncoded() throws java.io.IOException { return null; }
    protected byte[] engineGetEncoded(java.lang.String p0) throws java.io.IOException { return null; }
    protected java.lang.String engineToString() { return null; }
}
