package com.android.internal.org.bouncycastle.jcajce.provider.symmetric;

public final class Twofish {
    private Twofish() {}

    public static class Mappings extends com.android.internal.org.bouncycastle.jcajce.provider.symmetric.SymmetricAlgorithmProvider {
        private static final java.lang.String PREFIX = null;
        public Mappings() { super(); }
        public void configure(com.android.internal.org.bouncycastle.jcajce.provider.config.ConfigurableProvider p0) {}
    }

    public static class PBEWithSHA extends com.android.internal.org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher {
        public PBEWithSHA() { super((com.android.internal.org.bouncycastle.crypto.BlockCipher)null); }
    }

    public static class PBEWithSHAKeyFactory extends com.android.internal.org.bouncycastle.jcajce.provider.symmetric.util.PBESecretKeyFactory {
        public PBEWithSHAKeyFactory() { super(null, null, false, 0, 0, 0, 0); }
    }
}
