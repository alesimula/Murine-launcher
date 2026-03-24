package com.android.internal.org.bouncycastle.jcajce.provider.symmetric;

public class PBEPKCS12 {

    public static class AlgParams extends com.android.internal.org.bouncycastle.jcajce.provider.symmetric.util.BaseAlgorithmParameters {
        com.android.internal.org.bouncycastle.asn1.pkcs.PKCS12PBEParams params;
        public AlgParams() { super(); }
        protected byte[] engineGetEncoded() { return null; }
        protected byte[] engineGetEncoded(java.lang.String p0) { return null; }
        protected java.security.spec.AlgorithmParameterSpec localEngineGetParameterSpec(java.lang.Class p0) throws java.security.spec.InvalidParameterSpecException { return null; }
        protected void engineInit(java.security.spec.AlgorithmParameterSpec p0) throws java.security.spec.InvalidParameterSpecException {}
        protected void engineInit(byte[] p0) throws java.io.IOException {}
        protected void engineInit(byte[] p0, java.lang.String p1) throws java.io.IOException {}
        protected java.lang.String engineToString() { return null; }
    }

    public static class Mappings extends com.android.internal.org.bouncycastle.jcajce.provider.util.AlgorithmProvider {
        public Mappings() { super(); }
        public void configure(com.android.internal.org.bouncycastle.jcajce.provider.config.ConfigurableProvider p0) {}
    }
}
