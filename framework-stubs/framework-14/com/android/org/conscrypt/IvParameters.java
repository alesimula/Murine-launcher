package com.android.org.conscrypt;

public class IvParameters extends java.security.AlgorithmParametersSpi {
    public IvParameters() { super(); }
    protected void engineInit(java.security.spec.AlgorithmParameterSpec p0) throws java.security.spec.InvalidParameterSpecException {}
    protected void engineInit(byte[] p0) throws java.io.IOException {}
    protected void engineInit(byte[] p0, java.lang.String p1) throws java.io.IOException {}
    protected <T extends java.security.spec.AlgorithmParameterSpec> T engineGetParameterSpec(java.lang.Class<T> p0) throws java.security.spec.InvalidParameterSpecException { return null; }
    protected byte[] engineGetEncoded() throws java.io.IOException { return null; }
    protected byte[] engineGetEncoded(java.lang.String p0) throws java.io.IOException { return null; }
    protected java.lang.String engineToString() { return null; }

    public static class AES extends com.android.org.conscrypt.IvParameters {
        public AES() { super(); }
    }

    public static class ChaCha20 extends com.android.org.conscrypt.IvParameters {
        public ChaCha20() { super(); }
    }

    public static class DESEDE extends com.android.org.conscrypt.IvParameters {
        public DESEDE() { super(); }
    }
}
