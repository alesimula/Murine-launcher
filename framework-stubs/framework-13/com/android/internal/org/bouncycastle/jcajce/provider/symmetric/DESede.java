package com.android.internal.org.bouncycastle.jcajce.provider.symmetric;

public final class DESede {

    public static class CBC extends com.android.internal.org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher {
        public CBC() { super((com.android.internal.org.bouncycastle.crypto.BlockCipher)null); }
    }

    public static class CBCMAC extends com.android.internal.org.bouncycastle.jcajce.provider.symmetric.util.BaseMac {
        public CBCMAC() { super((com.android.internal.org.bouncycastle.crypto.Mac)null); }
    }

    public static class DESede64 extends com.android.internal.org.bouncycastle.jcajce.provider.symmetric.util.BaseMac {
        public DESede64() { super((com.android.internal.org.bouncycastle.crypto.Mac)null); }
    }

    public static class DESede64with7816d4 extends com.android.internal.org.bouncycastle.jcajce.provider.symmetric.util.BaseMac {
        public DESede64with7816d4() { super((com.android.internal.org.bouncycastle.crypto.Mac)null); }
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

    public static class KeyGenerator3 extends com.android.internal.org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator {
        public KeyGenerator3() { super(null, 0, null); }
    }

    public static class Mappings extends com.android.internal.org.bouncycastle.jcajce.provider.util.AlgorithmProvider {
        public Mappings() { super(); }
        public void configure(com.android.internal.org.bouncycastle.jcajce.provider.config.ConfigurableProvider p0) {}
    }

    public static class PBEWithSHAAndDES2Key extends com.android.internal.org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher {
        public PBEWithSHAAndDES2Key() { super((com.android.internal.org.bouncycastle.crypto.BlockCipher)null); }
    }

    public static class PBEWithSHAAndDES2KeyFactory extends com.android.internal.org.bouncycastle.jcajce.provider.symmetric.DES.DESPBEKeyFactory {
        public PBEWithSHAAndDES2KeyFactory() { super(null, null, false, 0, 0, 0, 0); }
    }

    public static class PBEWithSHAAndDES3Key extends com.android.internal.org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher {
        public PBEWithSHAAndDES3Key() { super((com.android.internal.org.bouncycastle.crypto.BlockCipher)null); }
    }

    public static class PBEWithSHAAndDES3KeyFactory extends com.android.internal.org.bouncycastle.jcajce.provider.symmetric.DES.DESPBEKeyFactory {
        public PBEWithSHAAndDES3KeyFactory() { super(null, null, false, 0, 0, 0, 0); }
    }

    public static class Wrap extends com.android.internal.org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher {
        public Wrap() { super(); }
    }
}
