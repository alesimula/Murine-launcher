package com.android.internal.org.bouncycastle.jcajce.provider.symmetric;

public class PBES2AlgorithmParameters {
    private PBES2AlgorithmParameters() {}
    private static javax.crypto.spec.PBEParameterSpec createPBEParameterSpec(byte[] p0, int p1, byte[] p2) { return null; }

    private static abstract class BasePBEWithHmacAlgorithmParameters extends com.android.internal.org.bouncycastle.jcajce.provider.symmetric.util.BaseAlgorithmParameters {
        private final com.android.internal.org.bouncycastle.asn1.x509.AlgorithmIdentifier kdf = null;
        private final java.lang.String kdfShortName = null;
        private final int keySize = 0;
        private final com.android.internal.org.bouncycastle.asn1.ASN1ObjectIdentifier cipherAlgorithm = null;
        private final java.lang.String cipherAlgorithmShortName = null;
        private com.android.internal.org.bouncycastle.asn1.pkcs.PBES2Parameters params;
        private BasePBEWithHmacAlgorithmParameters(com.android.internal.org.bouncycastle.asn1.ASN1ObjectIdentifier p0, java.lang.String p1, int p2, com.android.internal.org.bouncycastle.asn1.ASN1ObjectIdentifier p3, java.lang.String p4) { super(); }
        protected byte[] engineGetEncoded() { return null; }
        protected byte[] engineGetEncoded(java.lang.String p0) { return null; }
        protected java.security.spec.AlgorithmParameterSpec localEngineGetParameterSpec(java.lang.Class p0) throws java.security.spec.InvalidParameterSpecException { return null; }
        protected void engineInit(java.security.spec.AlgorithmParameterSpec p0) throws java.security.spec.InvalidParameterSpecException {}
        protected void engineInit(byte[] p0) throws java.io.IOException {}
        protected void engineInit(byte[] p0, java.lang.String p1) throws java.io.IOException {}
        protected java.lang.String engineToString() { return null; }
    }

    public static class Mappings extends com.android.internal.org.bouncycastle.jcajce.provider.util.AlgorithmProvider {
        private static final java.lang.String PREFIX = null;
        public Mappings() { super(); }
        public void configure(com.android.internal.org.bouncycastle.jcajce.provider.config.ConfigurableProvider p0) {}
    }

    public static class PBEWithHmacSHA1AES128AlgorithmParameters extends com.android.internal.org.bouncycastle.jcajce.provider.symmetric.PBES2AlgorithmParameters.BasePBEWithHmacAlgorithmParameters {
        public PBEWithHmacSHA1AES128AlgorithmParameters() { super(null, null, 0, null, null); }
    }

    public static class PBEWithHmacSHA1AES256AlgorithmParameters extends com.android.internal.org.bouncycastle.jcajce.provider.symmetric.PBES2AlgorithmParameters.BasePBEWithHmacAlgorithmParameters {
        public PBEWithHmacSHA1AES256AlgorithmParameters() { super(null, null, 0, null, null); }
    }

    public static class PBEWithHmacSHA224AES128AlgorithmParameters extends com.android.internal.org.bouncycastle.jcajce.provider.symmetric.PBES2AlgorithmParameters.BasePBEWithHmacAlgorithmParameters {
        public PBEWithHmacSHA224AES128AlgorithmParameters() { super(null, null, 0, null, null); }
    }

    public static class PBEWithHmacSHA224AES256AlgorithmParameters extends com.android.internal.org.bouncycastle.jcajce.provider.symmetric.PBES2AlgorithmParameters.BasePBEWithHmacAlgorithmParameters {
        public PBEWithHmacSHA224AES256AlgorithmParameters() { super(null, null, 0, null, null); }
    }

    public static class PBEWithHmacSHA256AES128AlgorithmParameters extends com.android.internal.org.bouncycastle.jcajce.provider.symmetric.PBES2AlgorithmParameters.BasePBEWithHmacAlgorithmParameters {
        public PBEWithHmacSHA256AES128AlgorithmParameters() { super(null, null, 0, null, null); }
    }

    public static class PBEWithHmacSHA256AES256AlgorithmParameters extends com.android.internal.org.bouncycastle.jcajce.provider.symmetric.PBES2AlgorithmParameters.BasePBEWithHmacAlgorithmParameters {
        public PBEWithHmacSHA256AES256AlgorithmParameters() { super(null, null, 0, null, null); }
    }

    public static class PBEWithHmacSHA384AES128AlgorithmParameters extends com.android.internal.org.bouncycastle.jcajce.provider.symmetric.PBES2AlgorithmParameters.BasePBEWithHmacAlgorithmParameters {
        public PBEWithHmacSHA384AES128AlgorithmParameters() { super(null, null, 0, null, null); }
    }

    public static class PBEWithHmacSHA384AES256AlgorithmParameters extends com.android.internal.org.bouncycastle.jcajce.provider.symmetric.PBES2AlgorithmParameters.BasePBEWithHmacAlgorithmParameters {
        public PBEWithHmacSHA384AES256AlgorithmParameters() { super(null, null, 0, null, null); }
    }

    public static class PBEWithHmacSHA512AES128AlgorithmParameters extends com.android.internal.org.bouncycastle.jcajce.provider.symmetric.PBES2AlgorithmParameters.BasePBEWithHmacAlgorithmParameters {
        public PBEWithHmacSHA512AES128AlgorithmParameters() { super(null, null, 0, null, null); }
    }

    public static class PBEWithHmacSHA512AES256AlgorithmParameters extends com.android.internal.org.bouncycastle.jcajce.provider.symmetric.PBES2AlgorithmParameters.BasePBEWithHmacAlgorithmParameters {
        public PBEWithHmacSHA512AES256AlgorithmParameters() { super(null, null, 0, null, null); }
    }
}
