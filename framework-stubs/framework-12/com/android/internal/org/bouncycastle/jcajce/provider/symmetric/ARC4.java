package com.android.internal.org.bouncycastle.jcajce.provider.symmetric;

public final class ARC4 {
    private ARC4() {}

    public static class Base extends com.android.internal.org.bouncycastle.jcajce.provider.symmetric.util.BaseStreamCipher {
        public Base() { super((com.android.internal.org.bouncycastle.crypto.StreamCipher)null, 0); }
    }

    public static class KeyGen extends com.android.internal.org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator {
        public KeyGen() { super(null, 0, null); }
    }

    public static class Mappings extends com.android.internal.org.bouncycastle.jcajce.provider.util.AlgorithmProvider {
        private static final java.lang.String PREFIX = null;
        public Mappings() { super(); }
        public void configure(com.android.internal.org.bouncycastle.jcajce.provider.config.ConfigurableProvider p0) {}
    }

    public static class PBEWithSHAAnd128Bit extends com.android.internal.org.bouncycastle.jcajce.provider.symmetric.util.BaseStreamCipher {
        public PBEWithSHAAnd128Bit() { super((com.android.internal.org.bouncycastle.crypto.StreamCipher)null, 0); }
    }

    public static class PBEWithSHAAnd128BitKeyFactory extends com.android.internal.org.bouncycastle.jcajce.provider.symmetric.util.PBESecretKeyFactory {
        public PBEWithSHAAnd128BitKeyFactory() { super(null, null, false, 0, 0, 0, 0); }
    }

    public static class PBEWithSHAAnd40Bit extends com.android.internal.org.bouncycastle.jcajce.provider.symmetric.util.BaseStreamCipher {
        public PBEWithSHAAnd40Bit() { super((com.android.internal.org.bouncycastle.crypto.StreamCipher)null, 0); }
    }

    public static class PBEWithSHAAnd40BitKeyFactory extends com.android.internal.org.bouncycastle.jcajce.provider.symmetric.util.PBESecretKeyFactory {
        public PBEWithSHAAnd40BitKeyFactory() { super(null, null, false, 0, 0, 0, 0); }
    }
}
