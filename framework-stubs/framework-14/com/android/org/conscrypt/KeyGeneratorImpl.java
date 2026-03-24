package com.android.org.conscrypt;

public abstract class KeyGeneratorImpl extends javax.crypto.KeyGeneratorSpi {
    protected java.security.SecureRandom secureRandom;
    protected void checkKeySize(int p0) {}
    protected void engineInit(java.security.SecureRandom p0) {}
    protected void engineInit(java.security.spec.AlgorithmParameterSpec p0, java.security.SecureRandom p1) throws java.security.InvalidAlgorithmParameterException {}
    protected void engineInit(int p0, java.security.SecureRandom p1) {}
    protected byte[] doKeyGeneration(int p0) { return null; }
    protected javax.crypto.SecretKey engineGenerateKey() { return null; }

    public static final class AES extends com.android.org.conscrypt.KeyGeneratorImpl {
        public AES() { super(); }
        protected void checkKeySize(int p0) {}
    }

    public static final class ARC4 extends com.android.org.conscrypt.KeyGeneratorImpl {
        public ARC4() { super(); }
        protected void checkKeySize(int p0) {}
    }

    public static final class ChaCha20 extends com.android.org.conscrypt.KeyGeneratorImpl {
        public ChaCha20() { super(); }
        protected void checkKeySize(int p0) {}
    }

    public static final class DESEDE extends com.android.org.conscrypt.KeyGeneratorImpl {
        public DESEDE() { super(); }
        protected void checkKeySize(int p0) {}
        protected byte[] doKeyGeneration(int p0) { return null; }
    }

    public static final class HmacMD5 extends com.android.org.conscrypt.KeyGeneratorImpl {
        public HmacMD5() { super(); }
    }

    public static final class HmacSHA1 extends com.android.org.conscrypt.KeyGeneratorImpl {
        public HmacSHA1() { super(); }
    }

    public static final class HmacSHA224 extends com.android.org.conscrypt.KeyGeneratorImpl {
        public HmacSHA224() { super(); }
    }

    public static final class HmacSHA256 extends com.android.org.conscrypt.KeyGeneratorImpl {
        public HmacSHA256() { super(); }
    }

    public static final class HmacSHA384 extends com.android.org.conscrypt.KeyGeneratorImpl {
        public HmacSHA384() { super(); }
    }

    public static final class HmacSHA512 extends com.android.org.conscrypt.KeyGeneratorImpl {
        public HmacSHA512() { super(); }
    }
}
