package com.android.internal.org.bouncycastle.jcajce.provider.symmetric;

public class PBES2AlgorithmParameters {

    private static abstract class BasePBEWithHmacAlgorithmParameters extends com.android.internal.org.bouncycastle.jcajce.provider.symmetric.util.BaseAlgorithmParameters {
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

    public static class PBEWithHmacSHA1AES128AlgorithmParameters extends com.android.internal.org.bouncycastle.jcajce.provider.symmetric.PBES2AlgorithmParameters.BasePBEWithHmacAlgorithmParameters {
        public PBEWithHmacSHA1AES128AlgorithmParameters() { super(); }
    }

    public static class PBEWithHmacSHA1AES256AlgorithmParameters extends com.android.internal.org.bouncycastle.jcajce.provider.symmetric.PBES2AlgorithmParameters.BasePBEWithHmacAlgorithmParameters {
        public PBEWithHmacSHA1AES256AlgorithmParameters() { super(); }
    }

    public static class PBEWithHmacSHA224AES128AlgorithmParameters extends com.android.internal.org.bouncycastle.jcajce.provider.symmetric.PBES2AlgorithmParameters.BasePBEWithHmacAlgorithmParameters {
        public PBEWithHmacSHA224AES128AlgorithmParameters() { super(); }
    }

    public static class PBEWithHmacSHA224AES256AlgorithmParameters extends com.android.internal.org.bouncycastle.jcajce.provider.symmetric.PBES2AlgorithmParameters.BasePBEWithHmacAlgorithmParameters {
        public PBEWithHmacSHA224AES256AlgorithmParameters() { super(); }
    }

    public static class PBEWithHmacSHA256AES128AlgorithmParameters extends com.android.internal.org.bouncycastle.jcajce.provider.symmetric.PBES2AlgorithmParameters.BasePBEWithHmacAlgorithmParameters {
        public PBEWithHmacSHA256AES128AlgorithmParameters() { super(); }
    }

    public static class PBEWithHmacSHA256AES256AlgorithmParameters extends com.android.internal.org.bouncycastle.jcajce.provider.symmetric.PBES2AlgorithmParameters.BasePBEWithHmacAlgorithmParameters {
        public PBEWithHmacSHA256AES256AlgorithmParameters() { super(); }
    }

    public static class PBEWithHmacSHA384AES128AlgorithmParameters extends com.android.internal.org.bouncycastle.jcajce.provider.symmetric.PBES2AlgorithmParameters.BasePBEWithHmacAlgorithmParameters {
        public PBEWithHmacSHA384AES128AlgorithmParameters() { super(); }
    }

    public static class PBEWithHmacSHA384AES256AlgorithmParameters extends com.android.internal.org.bouncycastle.jcajce.provider.symmetric.PBES2AlgorithmParameters.BasePBEWithHmacAlgorithmParameters {
        public PBEWithHmacSHA384AES256AlgorithmParameters() { super(); }
    }

    public static class PBEWithHmacSHA512AES128AlgorithmParameters extends com.android.internal.org.bouncycastle.jcajce.provider.symmetric.PBES2AlgorithmParameters.BasePBEWithHmacAlgorithmParameters {
        public PBEWithHmacSHA512AES128AlgorithmParameters() { super(); }
    }

    public static class PBEWithHmacSHA512AES256AlgorithmParameters extends com.android.internal.org.bouncycastle.jcajce.provider.symmetric.PBES2AlgorithmParameters.BasePBEWithHmacAlgorithmParameters {
        public PBEWithHmacSHA512AES256AlgorithmParameters() { super(); }
    }
}
