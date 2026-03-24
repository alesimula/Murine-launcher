package android.security.keystore2;

abstract class AndroidKeyStoreSignatureSpiBase extends java.security.SignatureSpi implements android.security.keystore.KeyStoreCryptoOperation {
    AndroidKeyStoreSignatureSpiBase() { super(); }
    protected final void engineInitSign(java.security.PrivateKey p0) throws java.security.InvalidKeyException {}
    protected final void engineInitSign(java.security.PrivateKey p0, java.security.SecureRandom p1) throws java.security.InvalidKeyException {}
    protected final void engineInitVerify(java.security.PublicKey p0) throws java.security.InvalidKeyException {}
    protected void initKey(android.security.keystore2.AndroidKeyStoreKey p0) throws java.security.InvalidKeyException {}
    protected void resetAll() {}
    protected void resetWhilePreservingInitState() {}
    protected android.security.keystore2.KeyStoreCryptoOperationStreamer createMainDataStreamer(android.security.KeyStoreOperation p0) { return null; }
    public final long getOperationHandle() { return 0L; }
    protected final void engineUpdate(byte[] p0, int p1, int p2) throws java.security.SignatureException {}
    protected final void engineUpdate(byte p0) throws java.security.SignatureException {}
    protected final void engineUpdate(java.nio.ByteBuffer p0) {}
    protected final int engineSign(byte[] p0, int p1, int p2) throws java.security.SignatureException { return 0; }
    protected final byte[] engineSign() throws java.security.SignatureException { return null; }
    protected final boolean engineVerify(byte[] p0) throws java.security.SignatureException { return false; }
    protected final boolean engineVerify(byte[] p0, int p1, int p2) throws java.security.SignatureException { return false; }
    @java.lang.Deprecated
    protected final java.lang.Object engineGetParameter(java.lang.String p0) throws java.security.InvalidParameterException { return null; }
    @java.lang.Deprecated
    protected final void engineSetParameter(java.lang.String p0, java.lang.Object p1) throws java.security.InvalidParameterException {}
    protected abstract java.lang.String getAlgorithm();
    protected final boolean isSigning() { return false; }
    protected abstract int getAdditionalEntropyAmountForSign();
    protected abstract void addAlgorithmSpecificParametersToBegin(java.util.List<android.hardware.security.keymint.KeyParameter> p0);
}
