package android.security.keystore2;

abstract class AndroidKeyStoreCipherSpiBase extends javax.crypto.CipherSpi implements android.security.keystore.KeyStoreCryptoOperation {
    public static final java.lang.String DEFAULT_MGF1_DIGEST = "SHA-1";
    AndroidKeyStoreCipherSpiBase() { super(); }
    protected final void engineInit(int p0, java.security.Key p1, java.security.SecureRandom p2) throws java.security.InvalidKeyException {}
    protected final void engineInit(int p0, java.security.Key p1, java.security.AlgorithmParameters p2, java.security.SecureRandom p3) throws java.security.InvalidKeyException, java.security.InvalidAlgorithmParameterException {}
    protected final void engineInit(int p0, java.security.Key p1, java.security.spec.AlgorithmParameterSpec p2, java.security.SecureRandom p3) throws java.security.InvalidKeyException, java.security.InvalidAlgorithmParameterException {}
    protected void resetAll() {}
    protected void resetWhilePreservingInitState() {}
    @android.annotation.NonNull
    protected android.security.keystore2.KeyStoreCryptoOperationStreamer createMainDataStreamer(android.security.KeyStoreOperation p0) { return null; }
    @android.annotation.Nullable
    protected android.security.keystore2.KeyStoreCryptoOperationStreamer createAdditionalAuthenticationDataStreamer(android.security.KeyStoreOperation p0) { return null; }
    protected final byte[] engineUpdate(byte[] p0, int p1, int p2) { return null; }
    protected final int engineUpdate(byte[] p0, int p1, int p2, byte[] p3, int p4) throws javax.crypto.ShortBufferException { return 0; }
    protected final int engineUpdate(java.nio.ByteBuffer p0, java.nio.ByteBuffer p1) throws javax.crypto.ShortBufferException { return 0; }
    protected final void engineUpdateAAD(byte[] p0, int p1, int p2) {}
    protected final void engineUpdateAAD(java.nio.ByteBuffer p0) {}
    protected final byte[] engineDoFinal(byte[] p0, int p1, int p2) throws javax.crypto.IllegalBlockSizeException, javax.crypto.BadPaddingException { return null; }
    protected final int engineDoFinal(byte[] p0, int p1, int p2, byte[] p3, int p4) throws javax.crypto.ShortBufferException, javax.crypto.IllegalBlockSizeException, javax.crypto.BadPaddingException { return 0; }
    protected final int engineDoFinal(java.nio.ByteBuffer p0, java.nio.ByteBuffer p1) throws javax.crypto.ShortBufferException, javax.crypto.IllegalBlockSizeException, javax.crypto.BadPaddingException { return 0; }
    protected final byte[] engineWrap(java.security.Key p0) throws javax.crypto.IllegalBlockSizeException, java.security.InvalidKeyException { return null; }
    protected final java.security.Key engineUnwrap(byte[] p0, java.lang.String p1, int p2) throws java.security.InvalidKeyException, java.security.NoSuchAlgorithmException { return null; }
    protected final void engineSetMode(java.lang.String p0) throws java.security.NoSuchAlgorithmException {}
    protected final void engineSetPadding(java.lang.String p0) throws javax.crypto.NoSuchPaddingException {}
    protected final int engineGetKeySize(java.security.Key p0) throws java.security.InvalidKeyException { return 0; }
    public void finalize() throws java.lang.Throwable {}
    public final long getOperationHandle() { return 0L; }
    protected final void setKey(android.security.keystore2.AndroidKeyStoreKey p0) {}
    protected final void setKeymasterPurposeOverride(int p0) {}
    protected final int getKeymasterPurposeOverride() { return 0; }
    protected final boolean isEncrypting() { return false; }
    protected final long getConsumedInputSizeBytes() { return 0L; }
    protected final long getProducedOutputSizeBytes() { return 0L; }
    static java.lang.String opmodeToString(int p0) { return null; }
    protected abstract void initKey(int p0, java.security.Key p1) throws java.security.InvalidKeyException;
    @android.annotation.Nullable
    protected abstract java.security.AlgorithmParameters engineGetParameters();
    protected abstract void initAlgorithmSpecificParameters() throws java.security.InvalidKeyException;
    protected abstract void initAlgorithmSpecificParameters(java.security.spec.AlgorithmParameterSpec p0) throws java.security.InvalidAlgorithmParameterException;
    protected abstract void initAlgorithmSpecificParameters(java.security.AlgorithmParameters p0) throws java.security.InvalidAlgorithmParameterException;
    protected abstract int getAdditionalEntropyAmountForBegin();
    protected abstract int getAdditionalEntropyAmountForFinish();
    protected abstract void addAlgorithmSpecificParametersToBegin(java.util.List<android.hardware.security.keymint.KeyParameter> p0);
    protected void addAlgorithmSpecificParametersToBegin(java.util.List<android.hardware.security.keymint.KeyParameter> p0, android.system.keystore2.Authorization[] p1) {}
    protected abstract void loadAlgorithmSpecificParametersFromBeginResult(android.hardware.security.keymint.KeyParameter[] p0);
    protected abstract java.lang.String getTransform();
}
