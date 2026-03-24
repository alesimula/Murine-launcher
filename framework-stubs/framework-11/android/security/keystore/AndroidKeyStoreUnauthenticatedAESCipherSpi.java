package android.security.keystore;

class AndroidKeyStoreUnauthenticatedAESCipherSpi extends android.security.keystore.AndroidKeyStoreCipherSpiBase {
    private static final int BLOCK_SIZE_BYTES = 16;
    private final int mKeymasterBlockMode = 0;
    private final int mKeymasterPadding = 0;
    private final boolean mIvRequired = false;
    private byte[] mIv;
    private boolean mIvHasBeenUsed;
    AndroidKeyStoreUnauthenticatedAESCipherSpi(int p0, int p1, boolean p2) { super(); }
    protected final void resetAll() {}
    protected final void resetWhilePreservingInitState() {}
    protected final void initKey(int p0, java.security.Key p1) throws java.security.InvalidKeyException {}
    protected final void initAlgorithmSpecificParameters() throws java.security.InvalidKeyException {}
    protected final void initAlgorithmSpecificParameters(java.security.spec.AlgorithmParameterSpec p0) throws java.security.InvalidAlgorithmParameterException {}
    protected final void initAlgorithmSpecificParameters(java.security.AlgorithmParameters p0) throws java.security.InvalidAlgorithmParameterException {}
    protected final int getAdditionalEntropyAmountForBegin() { return 0; }
    protected final int getAdditionalEntropyAmountForFinish() { return 0; }
    protected final void addAlgorithmSpecificParametersToBegin(android.security.keymaster.KeymasterArguments p0) {}
    protected final void loadAlgorithmSpecificParametersFromBeginResult(android.security.keymaster.KeymasterArguments p0) {}
    protected final int engineGetBlockSize() { return 0; }
    protected final int engineGetOutputSize(int p0) { return 0; }
    protected final byte[] engineGetIV() { return null; }
    protected final java.security.AlgorithmParameters engineGetParameters() { return null; }

    static abstract class CBC extends android.security.keystore.AndroidKeyStoreUnauthenticatedAESCipherSpi {
        protected CBC(int p0) { super(0, 0, false); }

        public static class NoPadding extends android.security.keystore.AndroidKeyStoreUnauthenticatedAESCipherSpi.CBC {
            public NoPadding() { super(0); }
        }

        public static class PKCS7Padding extends android.security.keystore.AndroidKeyStoreUnauthenticatedAESCipherSpi.CBC {
            public PKCS7Padding() { super(0); }
        }
    }

    static abstract class CTR extends android.security.keystore.AndroidKeyStoreUnauthenticatedAESCipherSpi {
        protected CTR(int p0) { super(0, 0, false); }

        public static class NoPadding extends android.security.keystore.AndroidKeyStoreUnauthenticatedAESCipherSpi.CTR {
            public NoPadding() { super(0); }
        }
    }

    static abstract class ECB extends android.security.keystore.AndroidKeyStoreUnauthenticatedAESCipherSpi {
        protected ECB(int p0) { super(0, 0, false); }

        public static class NoPadding extends android.security.keystore.AndroidKeyStoreUnauthenticatedAESCipherSpi.ECB {
            public NoPadding() { super(0); }
        }

        public static class PKCS7Padding extends android.security.keystore.AndroidKeyStoreUnauthenticatedAESCipherSpi.ECB {
            public PKCS7Padding() { super(0); }
        }
    }
}
