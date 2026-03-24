package android.security.keystore2;

abstract class AndroidKeyStoreAuthenticatedAESCipherSpi extends android.security.keystore2.AndroidKeyStoreCipherSpiBase {
    AndroidKeyStoreAuthenticatedAESCipherSpi(int p0, int p1) { super(); }
    protected void resetAll() {}
    protected final void initKey(int p0, java.security.Key p1) throws java.security.InvalidKeyException {}
    protected void addAlgorithmSpecificParametersToBegin(java.util.List<android.hardware.security.keymint.KeyParameter> p0) {}
    protected final void loadAlgorithmSpecificParametersFromBeginResult(android.hardware.security.keymint.KeyParameter[] p0) {}
    protected final int engineGetBlockSize() { return 0; }
    protected final byte[] engineGetIV() { return null; }
    protected void setIv(byte[] p0) {}
    protected byte[] getIv() { return null; }

    private static class AdditionalAuthenticationDataStream implements android.security.keystore2.KeyStoreCryptoOperationChunkedStreamer.Stream {
        public byte[] update(byte[] p0) throws android.security.KeyStoreException { return null; }
        public byte[] finish(byte[] p0, byte[] p1) { return null; }
    }

    private static class BufferAllOutputUntilDoFinalStreamer implements android.security.keystore2.KeyStoreCryptoOperationStreamer {
        public byte[] update(byte[] p0, int p1, int p2) throws android.security.KeyStoreException { return null; }
        public byte[] doFinal(byte[] p0, int p1, int p2, byte[] p3) throws android.security.KeyStoreException { return null; }
        public long getConsumedInputSizeBytes() { return 0L; }
        public long getProducedOutputSizeBytes() { return 0L; }
    }

    static abstract class GCM extends android.security.keystore2.AndroidKeyStoreAuthenticatedAESCipherSpi {
        static final int MIN_SUPPORTED_TAG_LENGTH_BITS = 96;
        GCM(int p0) { super(0, 0); }
        protected final java.lang.String getTransform() { return null; }
        protected final void resetAll() {}
        protected final void resetWhilePreservingInitState() {}
        protected final void initAlgorithmSpecificParameters() throws java.security.InvalidKeyException {}
        protected final void initAlgorithmSpecificParameters(java.security.spec.AlgorithmParameterSpec p0) throws java.security.InvalidAlgorithmParameterException {}
        protected final void initAlgorithmSpecificParameters(java.security.AlgorithmParameters p0) throws java.security.InvalidAlgorithmParameterException {}
        protected final java.security.AlgorithmParameters engineGetParameters() { return null; }
        protected android.security.keystore2.KeyStoreCryptoOperationStreamer createMainDataStreamer(android.security.KeyStoreOperation p0) { return null; }
        protected final android.security.keystore2.KeyStoreCryptoOperationStreamer createAdditionalAuthenticationDataStreamer(android.security.KeyStoreOperation p0) { return null; }
        protected final int getAdditionalEntropyAmountForBegin() { return 0; }
        protected final int getAdditionalEntropyAmountForFinish() { return 0; }
        protected final void addAlgorithmSpecificParametersToBegin(java.util.List<android.hardware.security.keymint.KeyParameter> p0) {}
        protected final int getTagLengthBits() { return 0; }

        public static final class NoPadding extends android.security.keystore2.AndroidKeyStoreAuthenticatedAESCipherSpi.GCM {
            public NoPadding() { super(0); }
            protected final int engineGetOutputSize(int p0) { return 0; }
        }
    }
}
