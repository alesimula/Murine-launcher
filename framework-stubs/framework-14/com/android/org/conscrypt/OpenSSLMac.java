package com.android.org.conscrypt;

public abstract class OpenSSLMac extends javax.crypto.MacSpi {
    protected byte[] keyBytes;
    protected abstract void resetContext();
    protected abstract void updateDirect(long p0, int p1);
    protected int engineGetMacLength() { return 0; }
    protected void engineInit(java.security.Key p0, java.security.spec.AlgorithmParameterSpec p1) throws java.security.InvalidKeyException, java.security.InvalidAlgorithmParameterException {}
    protected void engineUpdate(byte p0) {}
    protected void engineUpdate(java.nio.ByteBuffer p0) {}
    protected byte[] engineDoFinal() { return null; }
    protected abstract byte[] doFinal();
    protected void engineReset() {}

    public static final class AesCmac extends com.android.org.conscrypt.OpenSSLMac {
        public AesCmac() { super(); }
        protected void resetContext() {}
        protected void updateDirect(long p0, int p1) {}
        protected byte[] doFinal() { return null; }
        protected void engineUpdate(byte[] p0, int p1, int p2) {}
    }

    public static class Hmac extends com.android.org.conscrypt.OpenSSLMac {
        public Hmac(long p0, int p1) { super(); }
        protected void resetContext() {}
        protected void engineUpdate(byte[] p0, int p1, int p2) {}
        protected void updateDirect(long p0, int p1) {}
        protected byte[] doFinal() { return null; }
    }

    public static final class HmacMD5 extends com.android.org.conscrypt.OpenSSLMac.Hmac {
        public HmacMD5() { super(0L, 0); }
    }

    public static final class HmacSHA1 extends com.android.org.conscrypt.OpenSSLMac.Hmac {
        public HmacSHA1() { super(0L, 0); }
    }

    public static final class HmacSHA224 extends com.android.org.conscrypt.OpenSSLMac.Hmac {
        public HmacSHA224() { super(0L, 0); }
    }

    public static final class HmacSHA256 extends com.android.org.conscrypt.OpenSSLMac.Hmac {
        public HmacSHA256() { super(0L, 0); }
    }

    public static final class HmacSHA384 extends com.android.org.conscrypt.OpenSSLMac.Hmac {
        public HmacSHA384() { super(0L, 0); }
    }

    public static final class HmacSHA512 extends com.android.org.conscrypt.OpenSSLMac.Hmac {
        public HmacSHA512() { super(0L, 0); }
    }
}
