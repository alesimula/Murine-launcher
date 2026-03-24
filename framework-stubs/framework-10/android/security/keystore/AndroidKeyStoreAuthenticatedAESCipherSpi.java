package android.security.keystore;

abstract class AndroidKeyStoreAuthenticatedAESCipherSpi extends android.security.keystore.AndroidKeyStoreCipherSpiBase {
    private static final int BLOCK_SIZE_BYTES = 16;
    private final int mKeymasterBlockMode = 0;
    private final int mKeymasterPadding = 0;
    private byte[] mIv;
    private boolean mIvHasBeenUsed;
    AndroidKeyStoreAuthenticatedAESCipherSpi(int p0, int p1) { super(); }
    protected void resetAll() {}
    protected final void initKey(int p0, java.security.Key p1) throws java.security.InvalidKeyException {}
    protected void addAlgorithmSpecificParametersToBegin(android.security.keymaster.KeymasterArguments p0) {}
    protected final void loadAlgorithmSpecificParametersFromBeginResult(android.security.keymaster.KeymasterArguments p0) {}
    protected final int engineGetBlockSize() { return 0; }
    protected final byte[] engineGetIV() { return null; }
    protected void setIv(byte[] p0) {}
    protected byte[] getIv() { return null; }

    static abstract class GCM extends android.security.keystore.AndroidKeyStoreAuthenticatedAESCipherSpi {
        static final int MIN_SUPPORTED_TAG_LENGTH_BITS = 96;
        private static final int MAX_SUPPORTED_TAG_LENGTH_BITS = 128;
        private static final int DEFAULT_TAG_LENGTH_BITS = 128;
        private static final int IV_LENGTH_BYTES = 12;
        private int mTagLengthBits;
        GCM(int p0) { super(0, 0); }
        protected final void resetAll() {}
        protected final void resetWhilePreservingInitState() {}
        protected final void initAlgorithmSpecificParameters() throws java.security.InvalidKeyException {}
        protected final void initAlgorithmSpecificParameters(java.security.spec.AlgorithmParameterSpec p0) throws java.security.InvalidAlgorithmParameterException {}
        protected final void initAlgorithmSpecificParameters(java.security.AlgorithmParameters p0) throws java.security.InvalidAlgorithmParameterException {}
        protected final java.security.AlgorithmParameters engineGetParameters() { return null; }
        protected android.security.keystore.KeyStoreCryptoOperationStreamer createMainDataStreamer(android.security.KeyStore p0, android.os.IBinder p1) { return null; }
        protected final android.security.keystore.KeyStoreCryptoOperationStreamer createAdditionalAuthenticationDataStreamer(android.security.KeyStore p0, android.os.IBinder p1) { return null; }
        protected final int getAdditionalEntropyAmountForBegin() { return 0; }
        protected final int getAdditionalEntropyAmountForFinish() { return 0; }
        protected final void addAlgorithmSpecificParametersToBegin(android.security.keymaster.KeymasterArguments p0) {}
        protected final int getTagLengthBits() { return 0; }

        public static final class NoPadding extends android.security.keystore.AndroidKeyStoreAuthenticatedAESCipherSpi.GCM {
            public NoPadding() { super(0); }
            protected final int engineGetOutputSize(int p0) { return 0; }
        }
    }

    private static class BufferAllOutputUntilDoFinalStreamer implements android.security.keystore.KeyStoreCryptoOperationStreamer {
        private final android.security.keystore.KeyStoreCryptoOperationStreamer mDelegate = null;
        private java.io.ByteArrayOutputStream mBufferedOutput;
        private long mProducedOutputSizeBytes;
        private BufferAllOutputUntilDoFinalStreamer(android.security.keystore.KeyStoreCryptoOperationStreamer p0) {}
        public byte[] update(byte[] p0, int p1, int p2) throws android.security.KeyStoreException { return null; }
        public byte[] doFinal(byte[] p0, int p1, int p2, byte[] p3, byte[] p4) throws android.security.KeyStoreException { return null; }
        public long getConsumedInputSizeBytes() { return 0L; }
        public long getProducedOutputSizeBytes() { return 0L; }
    }

    private static class AdditionalAuthenticationDataStream implements android.security.keystore.KeyStoreCryptoOperationChunkedStreamer.Stream {
        private final android.security.KeyStore mKeyStore = null;
        private final android.os.IBinder mOperationToken = null;
        private AdditionalAuthenticationDataStream(android.security.KeyStore p0, android.os.IBinder p1) {}
        public android.security.keymaster.OperationResult update(byte[] p0) { return null; }
        public android.security.keymaster.OperationResult finish(byte[] p0, byte[] p1) { return null; }
    }
}
