package com.android.internal.org.bouncycastle.jcajce.provider.symmetric;

public final class Blowfish {
    private Blowfish() {}

    public static class AlgParams extends com.android.internal.org.bouncycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters {
        public AlgParams() { super(); }
        protected java.lang.String engineToString() { return null; }
    }

    public static class CBC extends com.android.internal.org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher {
        public CBC() { super((com.android.internal.org.bouncycastle.crypto.BlockCipher)null); }
    }

    public static class ECB extends com.android.internal.org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher {
        public ECB() { super((com.android.internal.org.bouncycastle.crypto.BlockCipher)null); }
    }

    public static class KeyGen extends com.android.internal.org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator {
        public KeyGen() { super(null, 0, null); }
    }

    public static class Mappings extends com.android.internal.org.bouncycastle.jcajce.provider.util.AlgorithmProvider {
        private static final java.lang.String PREFIX = null;
        public Mappings() { super(); }
        public void configure(com.android.internal.org.bouncycastle.jcajce.provider.config.ConfigurableProvider p0) {}
    }
}
