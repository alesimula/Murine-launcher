package com.android.internal.org.bouncycastle.jcajce.provider.symmetric;

public final class RC2 {

    public static class Mappings extends com.android.internal.org.bouncycastle.jcajce.provider.util.AlgorithmProvider {
        public Mappings() { super(); }
        public void configure(com.android.internal.org.bouncycastle.jcajce.provider.config.ConfigurableProvider p0) {}
    }

    public static class PBEWithMD5AndRC2 extends com.android.internal.org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher {
        public PBEWithMD5AndRC2() { super((com.android.internal.org.bouncycastle.crypto.BlockCipher)null); }
    }

    public static class PBEWithMD5KeyFactory extends com.android.internal.org.bouncycastle.jcajce.provider.symmetric.util.PBESecretKeyFactory {
        public PBEWithMD5KeyFactory() { super(null, null, false, 0, 0, 0, 0); }
    }

    public static class PBEWithSHA1AndRC2 extends com.android.internal.org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher {
        public PBEWithSHA1AndRC2() { super((com.android.internal.org.bouncycastle.crypto.BlockCipher)null); }
    }

    public static class PBEWithSHA1KeyFactory extends com.android.internal.org.bouncycastle.jcajce.provider.symmetric.util.PBESecretKeyFactory {
        public PBEWithSHA1KeyFactory() { super(null, null, false, 0, 0, 0, 0); }
    }

    public static class PBEWithSHAAnd128BitKeyFactory extends com.android.internal.org.bouncycastle.jcajce.provider.symmetric.util.PBESecretKeyFactory {
        public PBEWithSHAAnd128BitKeyFactory() { super(null, null, false, 0, 0, 0, 0); }
    }

    public static class PBEWithSHAAnd128BitRC2 extends com.android.internal.org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher {
        public PBEWithSHAAnd128BitRC2() { super((com.android.internal.org.bouncycastle.crypto.BlockCipher)null); }
    }

    public static class PBEWithSHAAnd40BitKeyFactory extends com.android.internal.org.bouncycastle.jcajce.provider.symmetric.util.PBESecretKeyFactory {
        public PBEWithSHAAnd40BitKeyFactory() { super(null, null, false, 0, 0, 0, 0); }
    }

    public static class PBEWithSHAAnd40BitRC2 extends com.android.internal.org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher {
        public PBEWithSHAAnd40BitRC2() { super((com.android.internal.org.bouncycastle.crypto.BlockCipher)null); }
    }
}
