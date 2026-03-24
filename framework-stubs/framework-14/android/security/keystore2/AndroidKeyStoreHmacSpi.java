package android.security.keystore2;

public abstract class AndroidKeyStoreHmacSpi extends javax.crypto.MacSpi implements android.security.keystore.KeyStoreCryptoOperation {
    protected AndroidKeyStoreHmacSpi(int p0) { super(); }
    protected int engineGetMacLength() { return 0; }
    protected void engineInit(java.security.Key p0, java.security.spec.AlgorithmParameterSpec p1) throws java.security.InvalidKeyException, java.security.InvalidAlgorithmParameterException {}
    protected void engineReset() {}
    protected void engineUpdate(byte p0) {}
    protected void engineUpdate(byte[] p0, int p1, int p2) {}
    protected byte[] engineDoFinal() { return null; }
    public void finalize() throws java.lang.Throwable {}
    public long getOperationHandle() { return 0L; }

    public static class HmacSHA1 extends android.security.keystore2.AndroidKeyStoreHmacSpi {
        public HmacSHA1() { super(0); }
    }

    public static class HmacSHA224 extends android.security.keystore2.AndroidKeyStoreHmacSpi {
        public HmacSHA224() { super(0); }
    }

    public static class HmacSHA256 extends android.security.keystore2.AndroidKeyStoreHmacSpi {
        public HmacSHA256() { super(0); }
    }

    public static class HmacSHA384 extends android.security.keystore2.AndroidKeyStoreHmacSpi {
        public HmacSHA384() { super(0); }
    }

    public static class HmacSHA512 extends android.security.keystore2.AndroidKeyStoreHmacSpi {
        public HmacSHA512() { super(0); }
    }
}
