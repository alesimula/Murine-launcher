package android.security.keystore;

public abstract class AndroidKeyStoreKeyGeneratorSpi extends javax.crypto.KeyGeneratorSpi {
    private final android.security.KeyStore mKeyStore = null;
    private final int mKeymasterAlgorithm = 0;
    private final int mKeymasterDigest = 0;
    private final int mDefaultKeySizeBits = 0;
    private android.security.keystore.KeyGenParameterSpec mSpec;
    private java.security.SecureRandom mRng;
    protected int mKeySizeBits;
    private int[] mKeymasterPurposes;
    private int[] mKeymasterBlockModes;
    private int[] mKeymasterPaddings;
    private int[] mKeymasterDigests;
    protected AndroidKeyStoreKeyGeneratorSpi(int p0, int p1) { super(); }
    protected AndroidKeyStoreKeyGeneratorSpi(int p0, int p1, int p2) { super(); }
    protected void engineInit(java.security.SecureRandom p0) {}
    protected void engineInit(int p0, java.security.SecureRandom p1) {}
    protected void engineInit(java.security.spec.AlgorithmParameterSpec p0, java.security.SecureRandom p1) throws java.security.InvalidAlgorithmParameterException {}
    private void resetAll() {}
    protected javax.crypto.SecretKey engineGenerateKey() { return null; }

    public static class HmacSHA512 extends android.security.keystore.AndroidKeyStoreKeyGeneratorSpi.HmacBase {
        public HmacSHA512() { super(0); }
    }

    public static class HmacSHA384 extends android.security.keystore.AndroidKeyStoreKeyGeneratorSpi.HmacBase {
        public HmacSHA384() { super(0); }
    }

    public static class HmacSHA256 extends android.security.keystore.AndroidKeyStoreKeyGeneratorSpi.HmacBase {
        public HmacSHA256() { super(0); }
    }

    public static class HmacSHA224 extends android.security.keystore.AndroidKeyStoreKeyGeneratorSpi.HmacBase {
        public HmacSHA224() { super(0); }
    }

    public static class HmacSHA1 extends android.security.keystore.AndroidKeyStoreKeyGeneratorSpi.HmacBase {
        public HmacSHA1() { super(0); }
    }

    protected static abstract class HmacBase extends android.security.keystore.AndroidKeyStoreKeyGeneratorSpi {
        protected HmacBase(int p0) { super(0, 0); }
    }

    public static class DESede extends android.security.keystore.AndroidKeyStoreKeyGeneratorSpi {
        public DESede() { super(0, 0); }
    }

    public static class AES extends android.security.keystore.AndroidKeyStoreKeyGeneratorSpi {
        public AES() { super(0, 0); }
        protected void engineInit(java.security.spec.AlgorithmParameterSpec p0, java.security.SecureRandom p1) throws java.security.InvalidAlgorithmParameterException {}
    }
}
