package android.security.keystore2;

class KeyStoreCryptoOperationChunkedStreamer implements android.security.keystore2.KeyStoreCryptoOperationStreamer {
    KeyStoreCryptoOperationChunkedStreamer(android.security.keystore2.KeyStoreCryptoOperationChunkedStreamer.Stream p0) {}
    KeyStoreCryptoOperationChunkedStreamer(android.security.keystore2.KeyStoreCryptoOperationChunkedStreamer.Stream p0, int p1) {}
    KeyStoreCryptoOperationChunkedStreamer(android.security.keystore2.KeyStoreCryptoOperationChunkedStreamer.Stream p0, int p1, int p2) {}
    public byte[] update(byte[] p0, int p1, int p2) throws android.security.KeyStoreException { return null; }
    public byte[] doFinal(byte[] p0, int p1, int p2, byte[] p3) throws android.security.KeyStoreException { return null; }
    public long getConsumedInputSizeBytes() { return 0L; }
    public long getProducedOutputSizeBytes() { return 0L; }

    public static class MainDataStream implements android.security.keystore2.KeyStoreCryptoOperationChunkedStreamer.Stream {
        MainDataStream(android.security.KeyStoreOperation p0) {}
        public byte[] update(byte[] p0) throws android.security.KeyStoreException { return null; }
        public byte[] finish(byte[] p0, byte[] p1) throws android.security.KeyStoreException { return null; }
    }

    static interface Stream {
        public byte[] update(byte[] p0) throws android.security.KeyStoreException;
        public byte[] finish(byte[] p0, byte[] p1) throws android.security.KeyStoreException;
    }
}
