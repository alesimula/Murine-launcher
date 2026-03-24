package com.android.org.conscrypt;

public class OAEPParameters extends java.security.AlgorithmParametersSpi {
    public OAEPParameters() { super(); }
    protected void engineInit(java.security.spec.AlgorithmParameterSpec p0) throws java.security.spec.InvalidParameterSpecException {}
    protected void engineInit(byte[] p0) throws java.io.IOException {}
    protected void engineInit(byte[] p0, java.lang.String p1) throws java.io.IOException {}
    static java.lang.String readHash(long p0) throws java.io.IOException { return null; }
    static java.lang.String readMgfHash(long p0) throws java.io.IOException { return null; }
    protected <T extends java.security.spec.AlgorithmParameterSpec> T engineGetParameterSpec(java.lang.Class<T> p0) throws java.security.spec.InvalidParameterSpecException { return null; }
    protected byte[] engineGetEncoded() throws java.io.IOException { return null; }
    protected byte[] engineGetEncoded(java.lang.String p0) throws java.io.IOException { return null; }
    static void writeHashAndMgfHash(long p0, java.lang.String p1, java.security.spec.MGF1ParameterSpec p2) throws java.io.IOException {}
    protected java.lang.String engineToString() { return null; }
}
