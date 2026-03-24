package com.android.internal.org.bouncycastle.jcajce.provider.digest;

public class SHA256 {
    private SHA256() {}

    public static class Digest extends com.android.internal.org.bouncycastle.jcajce.provider.digest.BCMessageDigest implements java.lang.Cloneable {
        public Digest() { super(null); }
        public java.lang.Object clone() throws java.lang.CloneNotSupportedException { return null; }
    }

    public static class HashMac extends com.android.internal.org.bouncycastle.jcajce.provider.symmetric.util.BaseMac {
        public HashMac() { super((com.android.internal.org.bouncycastle.crypto.Mac)null); }
    }

    public static class KeyGenerator extends com.android.internal.org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator {
        public KeyGenerator() { super(null, 0, null); }
    }

    public static class Mappings extends com.android.internal.org.bouncycastle.jcajce.provider.digest.DigestAlgorithmProvider {
        private static final java.lang.String PREFIX = null;
        public Mappings() { super(); }
        public void configure(com.android.internal.org.bouncycastle.jcajce.provider.config.ConfigurableProvider p0) {}
    }
}
