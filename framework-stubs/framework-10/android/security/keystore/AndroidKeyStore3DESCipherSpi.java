package android.security.keystore;

public class AndroidKeyStore3DESCipherSpi extends android.security.keystore.AndroidKeyStoreCipherSpiBase {
    private static final int BLOCK_SIZE_BYTES = 8;
    private final int mKeymasterBlockMode = 0;
    private final int mKeymasterPadding = 0;
    private final boolean mIvRequired = false;
    private byte[] mIv;
    private boolean mIvHasBeenUsed;
    AndroidKeyStore3DESCipherSpi(int p0, int p1, boolean p2) { super(); }
    protected void initKey(int p0, java.security.Key p1) throws java.security.InvalidKeyException {}
    protected int engineGetBlockSize() { return 0; }
    protected int engineGetOutputSize(int p0) { return 0; }
    protected final byte[] engineGetIV() { return null; }
    protected java.security.AlgorithmParameters engineGetParameters() { return null; }
    protected void initAlgorithmSpecificParameters() throws java.security.InvalidKeyException {}
    protected void initAlgorithmSpecificParameters(java.security.spec.AlgorithmParameterSpec p0) throws java.security.InvalidAlgorithmParameterException {}
    protected void initAlgorithmSpecificParameters(java.security.AlgorithmParameters p0) throws java.security.InvalidAlgorithmParameterException {}
    protected final int getAdditionalEntropyAmountForBegin() { return 0; }
    protected int getAdditionalEntropyAmountForFinish() { return 0; }
    protected void addAlgorithmSpecificParametersToBegin(android.security.keymaster.KeymasterArguments p0) {}
    protected void loadAlgorithmSpecificParametersFromBeginResult(android.security.keymaster.KeymasterArguments p0) {}
    protected final void resetAll() {}

    static abstract class ECB extends android.security.keystore.AndroidKeyStore3DESCipherSpi {
        protected ECB(int p0) { super(0, 0, false); }

        public static class PKCS7Padding extends android.security.keystore.AndroidKeyStore3DESCipherSpi.ECB {
            public PKCS7Padding() { super(0); }
        }

        public static class NoPadding extends android.security.keystore.AndroidKeyStore3DESCipherSpi.ECB {
            public NoPadding() { super(0); }
        }
    }

    static abstract class CBC extends android.security.keystore.AndroidKeyStore3DESCipherSpi {
        protected CBC(int p0) { super(0, 0, false); }

        public static class PKCS7Padding extends android.security.keystore.AndroidKeyStore3DESCipherSpi.CBC {
            public PKCS7Padding() { super(0); }
        }

        public static class NoPadding extends android.security.keystore.AndroidKeyStore3DESCipherSpi.CBC {
            public NoPadding() { super(0); }
        }
    }
}
