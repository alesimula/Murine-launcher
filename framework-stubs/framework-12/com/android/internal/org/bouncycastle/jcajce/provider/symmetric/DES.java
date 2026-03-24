package com.android.internal.org.bouncycastle.jcajce.provider.symmetric;

public final class DES {
    private DES() {}

    public static class CBC extends com.android.internal.org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher {
        public CBC() { super((com.android.internal.org.bouncycastle.crypto.BlockCipher)null); }
    }

    public static class CBCMAC extends com.android.internal.org.bouncycastle.jcajce.provider.symmetric.util.BaseMac {
        public CBCMAC() { super((com.android.internal.org.bouncycastle.crypto.Mac)null); }
    }

    public static class DES64 extends com.android.internal.org.bouncycastle.jcajce.provider.symmetric.util.BaseMac {
        public DES64() { super((com.android.internal.org.bouncycastle.crypto.Mac)null); }
    }

    public static class DES64with7816d4 extends com.android.internal.org.bouncycastle.jcajce.provider.symmetric.util.BaseMac {
        public DES64with7816d4() { super((com.android.internal.org.bouncycastle.crypto.Mac)null); }
    }

    public static class DESPBEKeyFactory extends com.android.internal.org.bouncycastle.jcajce.provider.symmetric.util.BaseSecretKeyFactory {
        private boolean forCipher;
        private int scheme;
        private int digest;
        private int keySize;
        private int ivSize;
        public DESPBEKeyFactory(java.lang.String p0, com.android.internal.org.bouncycastle.asn1.ASN1ObjectIdentifier p1, boolean p2, int p3, int p4, int p5, int p6) { super(null, null); }
        protected javax.crypto.SecretKey engineGenerateSecret(java.security.spec.KeySpec p0) throws java.security.spec.InvalidKeySpecException { return null; }
    }

    public static class ECB extends com.android.internal.org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher {
        public ECB() { super((com.android.internal.org.bouncycastle.crypto.BlockCipher)null); }
    }

    public static class KeyFactory extends com.android.internal.org.bouncycastle.jcajce.provider.symmetric.util.BaseSecretKeyFactory {
        public KeyFactory() { super(null, null); }
        protected java.security.spec.KeySpec engineGetKeySpec(javax.crypto.SecretKey p0, java.lang.Class p1) throws java.security.spec.InvalidKeySpecException { return null; }
        protected javax.crypto.SecretKey engineGenerateSecret(java.security.spec.KeySpec p0) throws java.security.spec.InvalidKeySpecException { return null; }
    }

    public static class KeyGenerator extends com.android.internal.org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator {
        public KeyGenerator() { super(null, 0, null); }
        protected void engineInit(int p0, java.security.SecureRandom p1) {}
        protected javax.crypto.SecretKey engineGenerateKey() { return null; }
    }

    public static class Mappings extends com.android.internal.org.bouncycastle.jcajce.provider.util.AlgorithmProvider {
        private static final java.lang.String PREFIX = null;
        private static final java.lang.String PACKAGE = "com.android.internal.org.bouncycastle.jcajce.provider.symmetric";
        public Mappings() { super(); }
        public void configure(com.android.internal.org.bouncycastle.jcajce.provider.config.ConfigurableProvider p0) {}
        private void addAlias(com.android.internal.org.bouncycastle.jcajce.provider.config.ConfigurableProvider p0, com.android.internal.org.bouncycastle.asn1.ASN1ObjectIdentifier p1, java.lang.String p2) {}
    }

    public static class PBEWithMD5 extends com.android.internal.org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher {
        public PBEWithMD5() { super((com.android.internal.org.bouncycastle.crypto.BlockCipher)null); }
    }

    public static class PBEWithMD5KeyFactory extends com.android.internal.org.bouncycastle.jcajce.provider.symmetric.DES.DESPBEKeyFactory {
        public PBEWithMD5KeyFactory() { super(null, null, false, 0, 0, 0, 0); }
    }

    public static class PBEWithSHA1 extends com.android.internal.org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher {
        public PBEWithSHA1() { super((com.android.internal.org.bouncycastle.crypto.BlockCipher)null); }
    }

    public static class PBEWithSHA1KeyFactory extends com.android.internal.org.bouncycastle.jcajce.provider.symmetric.DES.DESPBEKeyFactory {
        public PBEWithSHA1KeyFactory() { super(null, null, false, 0, 0, 0, 0); }
    }
}
