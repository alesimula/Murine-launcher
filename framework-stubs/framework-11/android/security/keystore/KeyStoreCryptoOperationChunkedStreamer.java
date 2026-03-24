package android.security.keystore;

class KeyStoreCryptoOperationChunkedStreamer implements android.security.keystore.KeyStoreCryptoOperationStreamer {
    private static final int DEFAULT_CHUNK_SIZE_MAX = 65536;
    private static final int DEFAULT_CHUNK_SIZE_THRESHOLD = 2048;
    private final android.security.keystore.KeyStoreCryptoOperationChunkedStreamer.Stream mKeyStoreStream = null;
    private final int mChunkSizeMax = 0;
    private final int mChunkSizeThreshold = 0;
    private final byte[] mChunk = null;
    private int mChunkLength;
    private long mConsumedInputSizeBytes;
    private long mProducedOutputSizeBytes;
    KeyStoreCryptoOperationChunkedStreamer(android.security.keystore.KeyStoreCryptoOperationChunkedStreamer.Stream p0) {}
    KeyStoreCryptoOperationChunkedStreamer(android.security.keystore.KeyStoreCryptoOperationChunkedStreamer.Stream p0, int p1) {}
    KeyStoreCryptoOperationChunkedStreamer(android.security.keystore.KeyStoreCryptoOperationChunkedStreamer.Stream p0, int p1, int p2) {}
    public byte[] update(byte[] p0, int p1, int p2) throws android.security.KeyStoreException { return null; }
    public byte[] doFinal(byte[] p0, int p1, int p2, byte[] p3, byte[] p4) throws android.security.KeyStoreException { return null; }
    public long getConsumedInputSizeBytes() { return 0L; }
    public long getProducedOutputSizeBytes() { return 0L; }

    public static class MainDataStream implements android.security.keystore.KeyStoreCryptoOperationChunkedStreamer.Stream {
        private final android.security.KeyStore mKeyStore = null;
        private final android.os.IBinder mOperationToken = null;
        public MainDataStream(android.security.KeyStore p0, android.os.IBinder p1) {}
        public android.security.keymaster.OperationResult update(byte[] p0) { return null; }
        public android.security.keymaster.OperationResult finish(byte[] p0, byte[] p1, byte[] p2) { return null; }
    }

    static interface Stream {
        public android.security.keymaster.OperationResult update(byte[] p0);
        public android.security.keymaster.OperationResult finish(byte[] p0, byte[] p1, byte[] p2);
    }
}
