package android.security.keystore;

interface KeyStoreCryptoOperationStreamer {
    public byte[] update(byte[] p0, int p1, int p2) throws android.security.KeyStoreException;
    public byte[] doFinal(byte[] p0, int p1, int p2, byte[] p3, byte[] p4) throws android.security.KeyStoreException;
    public long getConsumedInputSizeBytes();
    public long getProducedOutputSizeBytes();
}
