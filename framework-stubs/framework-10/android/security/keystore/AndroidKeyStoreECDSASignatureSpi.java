package android.security.keystore;

abstract class AndroidKeyStoreECDSASignatureSpi extends android.security.keystore.AndroidKeyStoreSignatureSpiBase {
    private final int mKeymasterDigest = 0;
    private int mGroupSizeBits;
    AndroidKeyStoreECDSASignatureSpi(int p0) { super(); }
    protected final void initKey(android.security.keystore.AndroidKeyStoreKey p0) throws java.security.InvalidKeyException {}
    protected final void resetAll() {}
    protected final void resetWhilePreservingInitState() {}
    protected final void addAlgorithmSpecificParametersToBegin(android.security.keymaster.KeymasterArguments p0) {}
    protected final int getAdditionalEntropyAmountForSign() { return 0; }
    protected final int getGroupSizeBits() { return 0; }

    public static final class SHA512 extends android.security.keystore.AndroidKeyStoreECDSASignatureSpi {
        public SHA512() { super(0); }
    }

    public static final class SHA384 extends android.security.keystore.AndroidKeyStoreECDSASignatureSpi {
        public SHA384() { super(0); }
    }

    public static final class SHA256 extends android.security.keystore.AndroidKeyStoreECDSASignatureSpi {
        public SHA256() { super(0); }
    }

    public static final class SHA224 extends android.security.keystore.AndroidKeyStoreECDSASignatureSpi {
        public SHA224() { super(0); }
    }

    public static final class SHA1 extends android.security.keystore.AndroidKeyStoreECDSASignatureSpi {
        public SHA1() { super(0); }
    }

    public static final class NONE extends android.security.keystore.AndroidKeyStoreECDSASignatureSpi {
        public NONE() { super(0); }
        protected android.security.keystore.KeyStoreCryptoOperationStreamer createMainDataStreamer(android.security.KeyStore p0, android.os.IBinder p1) { return null; }

        private static class TruncateToFieldSizeMessageStreamer implements android.security.keystore.KeyStoreCryptoOperationStreamer {
            private final android.security.keystore.KeyStoreCryptoOperationStreamer mDelegate = null;
            private final int mGroupSizeBits = 0;
            private final java.io.ByteArrayOutputStream mInputBuffer = null;
            private long mConsumedInputSizeBytes;
            private TruncateToFieldSizeMessageStreamer(android.security.keystore.KeyStoreCryptoOperationStreamer p0, int p1) {}
            public byte[] update(byte[] p0, int p1, int p2) throws android.security.KeyStoreException { return null; }
            public byte[] doFinal(byte[] p0, int p1, int p2, byte[] p3, byte[] p4) throws android.security.KeyStoreException { return null; }
            public long getConsumedInputSizeBytes() { return 0L; }
            public long getProducedOutputSizeBytes() { return 0L; }
        }
    }
}
