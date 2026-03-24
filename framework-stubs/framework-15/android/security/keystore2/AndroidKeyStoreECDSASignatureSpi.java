package android.security.keystore2;

abstract class AndroidKeyStoreECDSASignatureSpi extends android.security.keystore2.AndroidKeyStoreSignatureSpiBase {
    AndroidKeyStoreECDSASignatureSpi(int p0) { super(); }
    protected final void initKey(android.security.keystore2.AndroidKeyStoreKey p0) throws java.security.InvalidKeyException {}
    protected final void resetAll() {}
    protected final void resetWhilePreservingInitState() {}
    protected final void addAlgorithmSpecificParametersToBegin(java.util.List<android.hardware.security.keymint.KeyParameter> p0) {}
    protected final int getAdditionalEntropyAmountForSign() { return 0; }
    protected final int getGroupSizeBits() { return 0; }

    public static final class Ed25519 extends android.security.keystore2.AndroidKeyStoreECDSASignatureSpi {
        public Ed25519() { super(0); }
        protected java.lang.String getAlgorithm() { return null; }
    }

    public static final class NONE extends android.security.keystore2.AndroidKeyStoreECDSASignatureSpi {
        public NONE() { super(0); }
        protected java.lang.String getAlgorithm() { return null; }
        protected android.security.keystore2.KeyStoreCryptoOperationStreamer createMainDataStreamer(android.security.KeyStoreOperation p0) { return null; }

        private static class TruncateToFieldSizeMessageStreamer implements android.security.keystore2.KeyStoreCryptoOperationStreamer {
            public byte[] update(byte[] p0, int p1, int p2) throws android.security.KeyStoreException { return null; }
            public byte[] doFinal(byte[] p0, int p1, int p2, byte[] p3) throws android.security.KeyStoreException { return null; }
            public long getConsumedInputSizeBytes() { return 0L; }
            public long getProducedOutputSizeBytes() { return 0L; }
        }
    }

    public static final class SHA1 extends android.security.keystore2.AndroidKeyStoreECDSASignatureSpi {
        public SHA1() { super(0); }
        protected java.lang.String getAlgorithm() { return null; }
    }

    public static final class SHA224 extends android.security.keystore2.AndroidKeyStoreECDSASignatureSpi {
        public SHA224() { super(0); }
        protected java.lang.String getAlgorithm() { return null; }
    }

    public static final class SHA256 extends android.security.keystore2.AndroidKeyStoreECDSASignatureSpi {
        public SHA256() { super(0); }
        protected java.lang.String getAlgorithm() { return null; }
    }

    public static final class SHA384 extends android.security.keystore2.AndroidKeyStoreECDSASignatureSpi {
        public SHA384() { super(0); }
        protected java.lang.String getAlgorithm() { return null; }
    }

    public static final class SHA512 extends android.security.keystore2.AndroidKeyStoreECDSASignatureSpi {
        public SHA512() { super(0); }
        protected java.lang.String getAlgorithm() { return null; }
    }
}
