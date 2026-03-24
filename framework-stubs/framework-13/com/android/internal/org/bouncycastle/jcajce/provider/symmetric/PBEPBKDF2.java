package com.android.internal.org.bouncycastle.jcajce.provider.symmetric;

public class PBEPBKDF2 {

    public static class BasePBKDF2 extends com.android.internal.org.bouncycastle.jcajce.provider.symmetric.util.BaseSecretKeyFactory {
        public BasePBKDF2(java.lang.String p0, int p1) { super(null, null); }
        protected javax.crypto.SecretKey engineGenerateSecret(java.security.spec.KeySpec p0) throws java.security.spec.InvalidKeySpecException { return null; }
    }

    public static class BasePBKDF2WithHmacSHA1 extends com.android.internal.org.bouncycastle.jcajce.provider.symmetric.PBEPBKDF2.BasePBKDF2 {
        public BasePBKDF2WithHmacSHA1(java.lang.String p0, int p1) { super(null, 0); }
    }

    public static class BasePBKDF2WithHmacSHA224 extends com.android.internal.org.bouncycastle.jcajce.provider.symmetric.PBEPBKDF2.BasePBKDF2 {
        public BasePBKDF2WithHmacSHA224(java.lang.String p0, int p1) { super(null, 0); }
    }

    public static class BasePBKDF2WithHmacSHA256 extends com.android.internal.org.bouncycastle.jcajce.provider.symmetric.PBEPBKDF2.BasePBKDF2 {
        public BasePBKDF2WithHmacSHA256(java.lang.String p0, int p1) { super(null, 0); }
    }

    public static class BasePBKDF2WithHmacSHA384 extends com.android.internal.org.bouncycastle.jcajce.provider.symmetric.PBEPBKDF2.BasePBKDF2 {
        public BasePBKDF2WithHmacSHA384(java.lang.String p0, int p1) { super(null, 0); }
    }

    public static class BasePBKDF2WithHmacSHA512 extends com.android.internal.org.bouncycastle.jcajce.provider.symmetric.PBEPBKDF2.BasePBKDF2 {
        public BasePBKDF2WithHmacSHA512(java.lang.String p0, int p1) { super(null, 0); }
    }

    public static class Mappings extends com.android.internal.org.bouncycastle.jcajce.provider.util.AlgorithmProvider {
        public Mappings() { super(); }
        public void configure(com.android.internal.org.bouncycastle.jcajce.provider.config.ConfigurableProvider p0) {}
    }

    public static class PBEWithHmacSHA1AndAES_128 extends com.android.internal.org.bouncycastle.jcajce.provider.symmetric.PBEPBKDF2.BasePBKDF2 {
        public PBEWithHmacSHA1AndAES_128() { super(null, 0); }
    }

    public static class PBEWithHmacSHA1AndAES_256 extends com.android.internal.org.bouncycastle.jcajce.provider.symmetric.PBEPBKDF2.BasePBKDF2 {
        public PBEWithHmacSHA1AndAES_256() { super(null, 0); }
    }

    public static class PBEWithHmacSHA224AndAES_128 extends com.android.internal.org.bouncycastle.jcajce.provider.symmetric.PBEPBKDF2.BasePBKDF2 {
        public PBEWithHmacSHA224AndAES_128() { super(null, 0); }
    }

    public static class PBEWithHmacSHA224AndAES_256 extends com.android.internal.org.bouncycastle.jcajce.provider.symmetric.PBEPBKDF2.BasePBKDF2 {
        public PBEWithHmacSHA224AndAES_256() { super(null, 0); }
    }

    public static class PBEWithHmacSHA256AndAES_128 extends com.android.internal.org.bouncycastle.jcajce.provider.symmetric.PBEPBKDF2.BasePBKDF2 {
        public PBEWithHmacSHA256AndAES_128() { super(null, 0); }
    }

    public static class PBEWithHmacSHA256AndAES_256 extends com.android.internal.org.bouncycastle.jcajce.provider.symmetric.PBEPBKDF2.BasePBKDF2 {
        public PBEWithHmacSHA256AndAES_256() { super(null, 0); }
    }

    public static class PBEWithHmacSHA384AndAES_128 extends com.android.internal.org.bouncycastle.jcajce.provider.symmetric.PBEPBKDF2.BasePBKDF2 {
        public PBEWithHmacSHA384AndAES_128() { super(null, 0); }
    }

    public static class PBEWithHmacSHA384AndAES_256 extends com.android.internal.org.bouncycastle.jcajce.provider.symmetric.PBEPBKDF2.BasePBKDF2 {
        public PBEWithHmacSHA384AndAES_256() { super(null, 0); }
    }

    public static class PBEWithHmacSHA512AndAES_128 extends com.android.internal.org.bouncycastle.jcajce.provider.symmetric.PBEPBKDF2.BasePBKDF2 {
        public PBEWithHmacSHA512AndAES_128() { super(null, 0); }
    }

    public static class PBEWithHmacSHA512AndAES_256 extends com.android.internal.org.bouncycastle.jcajce.provider.symmetric.PBEPBKDF2.BasePBKDF2 {
        public PBEWithHmacSHA512AndAES_256() { super(null, 0); }
    }

    public static class PBKDF2WithHmacSHA18BIT extends com.android.internal.org.bouncycastle.jcajce.provider.symmetric.PBEPBKDF2.BasePBKDF2WithHmacSHA1 {
        public PBKDF2WithHmacSHA18BIT() { super(null, 0); }
    }

    public static class PBKDF2WithHmacSHA1UTF8 extends com.android.internal.org.bouncycastle.jcajce.provider.symmetric.PBEPBKDF2.BasePBKDF2WithHmacSHA1 {
        public PBKDF2WithHmacSHA1UTF8() { super(null, 0); }
    }

    public static class PBKDF2WithHmacSHA224UTF8 extends com.android.internal.org.bouncycastle.jcajce.provider.symmetric.PBEPBKDF2.BasePBKDF2WithHmacSHA224 {
        public PBKDF2WithHmacSHA224UTF8() { super(null, 0); }
    }

    public static class PBKDF2WithHmacSHA256UTF8 extends com.android.internal.org.bouncycastle.jcajce.provider.symmetric.PBEPBKDF2.BasePBKDF2WithHmacSHA256 {
        public PBKDF2WithHmacSHA256UTF8() { super(null, 0); }
    }

    public static class PBKDF2WithHmacSHA384UTF8 extends com.android.internal.org.bouncycastle.jcajce.provider.symmetric.PBEPBKDF2.BasePBKDF2WithHmacSHA384 {
        public PBKDF2WithHmacSHA384UTF8() { super(null, 0); }
    }

    public static class PBKDF2WithHmacSHA512UTF8 extends com.android.internal.org.bouncycastle.jcajce.provider.symmetric.PBEPBKDF2.BasePBKDF2WithHmacSHA512 {
        public PBKDF2WithHmacSHA512UTF8() { super(null, 0); }
    }
}
