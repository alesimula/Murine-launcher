package android.security.keystore;

class KeyStoreCryptoOperationChunkedStreamer implements android.security.keystore.KeyStoreCryptoOperationStreamer {
    private static final int DEFAULT_MAX_CHUNK_SIZE = 65536;
    private final android.security.keystore.KeyStoreCryptoOperationChunkedStreamer.Stream mKeyStoreStream = null;
    private final int mMaxChunkSize = 0;
    private byte[] mBuffered;
    private int mBufferedOffset;
    private int mBufferedLength;
    private long mConsumedInputSizeBytes;
    private long mProducedOutputSizeBytes;
    public KeyStoreCryptoOperationChunkedStreamer(android.security.keystore.KeyStoreCryptoOperationChunkedStreamer.Stream p0) {}
    public KeyStoreCryptoOperationChunkedStreamer(android.security.keystore.KeyStoreCryptoOperationChunkedStreamer.Stream p0, int p1) {}
    public byte[] update(byte[] p0, int p1, int p2) throws android.security.KeyStoreException { return null; }
    public byte[] doFinal(byte[] p0, int p1, int p2, byte[] p3, byte[] p4) throws android.security.KeyStoreException { return null; }
    public byte[] flush() throws android.security.KeyStoreException { return null; }
    public long getConsumedInputSizeBytes() { return 0L; }
    public long getProducedOutputSizeBytes() { return 0L; }

    static interface Stream {
        public android.security.keymaster.OperationResult update(byte[] p0);
        public android.security.keymaster.OperationResult finish(byte[] p0, byte[] p1);
    }

    public static class MainDataStream implements android.security.keystore.KeyStoreCryptoOperationChunkedStreamer.Stream {
        private final android.security.KeyStore mKeyStore = null;
        private final android.os.IBinder mOperationToken = null;
        public MainDataStream(android.security.KeyStore p0, android.os.IBinder p1) {}
        public android.security.keymaster.OperationResult update(byte[] p0) { return null; }
        public android.security.keymaster.OperationResult finish(byte[] p0, byte[] p1) { return null; }
    }
}
