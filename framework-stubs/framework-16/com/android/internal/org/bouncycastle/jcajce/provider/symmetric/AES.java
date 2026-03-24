package com.android.internal.org.bouncycastle.jcajce.provider.symmetric;

public final class AES {

    public static class AlgParams extends com.android.internal.org.bouncycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters {
        public AlgParams() { super(); }
        protected java.lang.String engineToString() { return null; }
    }

    public static class AlgParamsGCM extends com.android.internal.org.bouncycastle.jcajce.provider.symmetric.util.BaseAlgorithmParameters {
        public AlgParamsGCM() { super(); }
        protected void engineInit(java.security.spec.AlgorithmParameterSpec p0) throws java.security.spec.InvalidParameterSpecException {}
        protected void engineInit(byte[] p0) throws java.io.IOException {}
        protected void engineInit(byte[] p0, java.lang.String p1) throws java.io.IOException {}
        protected byte[] engineGetEncoded() throws java.io.IOException { return null; }
        protected byte[] engineGetEncoded(java.lang.String p0) throws java.io.IOException { return null; }
        protected java.lang.String engineToString() { return null; }
        protected java.security.spec.AlgorithmParameterSpec localEngineGetParameterSpec(java.lang.Class p0) throws java.security.spec.InvalidParameterSpecException { return null; }
    }

    public static class CBC extends com.android.internal.org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher {
        public CBC() { super((com.android.internal.org.bouncycastle.crypto.BlockCipher)null); }
    }

    public static class CFB extends com.android.internal.org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher {
        public CFB() { super((com.android.internal.org.bouncycastle.crypto.BlockCipher)null); }
    }

    public static class ECB extends com.android.internal.org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher {
        public ECB() { super((com.android.internal.org.bouncycastle.crypto.BlockCipher)null); }
    }

    public static class GCM extends com.android.internal.org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher {
        public GCM() { super((com.android.internal.org.bouncycastle.crypto.BlockCipher)null); }
    }

    public static class KeyGen extends com.android.internal.org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator {
        public KeyGen() { super(null, 0, null); }
        public KeyGen(int p0) { super(null, 0, null); }
    }

    public static class Mappings extends com.android.internal.org.bouncycastle.jcajce.provider.symmetric.SymmetricAlgorithmProvider {
        public Mappings() { super(); }
        public void configure(com.android.internal.org.bouncycastle.jcajce.provider.config.ConfigurableProvider p0) {}
    }

    public static class OFB extends com.android.internal.org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher {
        public OFB() { super((com.android.internal.org.bouncycastle.crypto.BlockCipher)null); }
    }

    public static class PBEWithAESCBC extends com.android.internal.org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher {
        public PBEWithAESCBC() { super((com.android.internal.org.bouncycastle.crypto.BlockCipher)null); }
    }

    public static class PBEWithMD5And128BitAESCBCOpenSSL extends com.android.internal.org.bouncycastle.jcajce.provider.symmetric.util.PBESecretKeyFactory {
        public PBEWithMD5And128BitAESCBCOpenSSL() { super(null, null, false, 0, 0, 0, 0); }
    }

    public static class PBEWithMD5And192BitAESCBCOpenSSL extends com.android.internal.org.bouncycastle.jcajce.provider.symmetric.util.PBESecretKeyFactory {
        public PBEWithMD5And192BitAESCBCOpenSSL() { super(null, null, false, 0, 0, 0, 0); }
    }

    public static class PBEWithMD5And256BitAESCBCOpenSSL extends com.android.internal.org.bouncycastle.jcajce.provider.symmetric.util.PBESecretKeyFactory {
        public PBEWithMD5And256BitAESCBCOpenSSL() { super(null, null, false, 0, 0, 0, 0); }
    }

    public static class PBEWithSHA1AESCBC128 extends com.android.internal.org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher {
        public PBEWithSHA1AESCBC128() { super((com.android.internal.org.bouncycastle.crypto.BlockCipher)null); }
    }

    public static class PBEWithSHA1AESCBC192 extends com.android.internal.org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher {
        public PBEWithSHA1AESCBC192() { super((com.android.internal.org.bouncycastle.crypto.BlockCipher)null); }
    }

    public static class PBEWithSHA1AESCBC256 extends com.android.internal.org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher {
        public PBEWithSHA1AESCBC256() { super((com.android.internal.org.bouncycastle.crypto.BlockCipher)null); }
    }

    public static class PBEWithSHA256AESCBC128 extends com.android.internal.org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher {
        public PBEWithSHA256AESCBC128() { super((com.android.internal.org.bouncycastle.crypto.BlockCipher)null); }
    }

    public static class PBEWithSHA256AESCBC192 extends com.android.internal.org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher {
        public PBEWithSHA256AESCBC192() { super((com.android.internal.org.bouncycastle.crypto.BlockCipher)null); }
    }

    public static class PBEWithSHA256AESCBC256 extends com.android.internal.org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher {
        public PBEWithSHA256AESCBC256() { super((com.android.internal.org.bouncycastle.crypto.BlockCipher)null); }
    }

    public static class PBEWithSHA256And128BitAESBC extends com.android.internal.org.bouncycastle.jcajce.provider.symmetric.util.PBESecretKeyFactory {
        public PBEWithSHA256And128BitAESBC() { super(null, null, false, 0, 0, 0, 0); }
    }

    public static class PBEWithSHA256And192BitAESBC extends com.android.internal.org.bouncycastle.jcajce.provider.symmetric.util.PBESecretKeyFactory {
        public PBEWithSHA256And192BitAESBC() { super(null, null, false, 0, 0, 0, 0); }
    }

    public static class PBEWithSHA256And256BitAESBC extends com.android.internal.org.bouncycastle.jcajce.provider.symmetric.util.PBESecretKeyFactory {
        public PBEWithSHA256And256BitAESBC() { super(null, null, false, 0, 0, 0, 0); }
    }

    public static class PBEWithSHAAnd128BitAESBC extends com.android.internal.org.bouncycastle.jcajce.provider.symmetric.util.PBESecretKeyFactory {
        public PBEWithSHAAnd128BitAESBC() { super(null, null, false, 0, 0, 0, 0); }
    }

    public static class PBEWithSHAAnd192BitAESBC extends com.android.internal.org.bouncycastle.jcajce.provider.symmetric.util.PBESecretKeyFactory {
        public PBEWithSHAAnd192BitAESBC() { super(null, null, false, 0, 0, 0, 0); }
    }

    public static class PBEWithSHAAnd256BitAESBC extends com.android.internal.org.bouncycastle.jcajce.provider.symmetric.util.PBESecretKeyFactory {
        public PBEWithSHAAnd256BitAESBC() { super(null, null, false, 0, 0, 0, 0); }
    }

    public static class Wrap extends com.android.internal.org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher {
        public Wrap() { super(); }
    }
}
