package com.android.org.conscrypt;

public final class GCMParameters extends java.security.AlgorithmParametersSpi {
    public GCMParameters() { super(); }
    GCMParameters(int p0, byte[] p1) { super(); }
    int getTLen() { return 0; }
    byte[] getIV() { return null; }
    protected void engineInit(java.security.spec.AlgorithmParameterSpec p0) throws java.security.spec.InvalidParameterSpecException {}
    protected void engineInit(byte[] p0) throws java.io.IOException {}
    protected void engineInit(byte[] p0, java.lang.String p1) throws java.io.IOException {}
    protected <T extends java.security.spec.AlgorithmParameterSpec> T engineGetParameterSpec(java.lang.Class<T> p0) throws java.security.spec.InvalidParameterSpecException { return null; }
    protected byte[] engineGetEncoded() throws java.io.IOException { return null; }
    protected byte[] engineGetEncoded(java.lang.String p0) throws java.io.IOException { return null; }
    protected java.lang.String engineToString() { return null; }
}
