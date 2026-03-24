package android.security.keystore2;

public class AndroidKeyStoreKeyAgreementSpi extends javax.crypto.KeyAgreementSpi implements android.security.keystore.KeyStoreCryptoOperation {
    private static final java.lang.String TAG = "AndroidKeyStoreKeyAgreementSpi";
    private final int mKeymintAlgorithm = 0;
    private android.security.keystore2.AndroidKeyStorePrivateKey mKey;
    private java.security.PublicKey mOtherPartyKey;
    private android.security.KeyStoreOperation mOperation;
    private long mOperationHandle;
    protected AndroidKeyStoreKeyAgreementSpi(int p0) { super(); }
    protected void engineInit(java.security.Key p0, java.security.SecureRandom p1) throws java.security.InvalidKeyException {}
    protected void engineInit(java.security.Key p0, java.security.spec.AlgorithmParameterSpec p1, java.security.SecureRandom p2) throws java.security.InvalidKeyException, java.security.InvalidAlgorithmParameterException {}
    protected java.security.Key engineDoPhase(java.security.Key p0, boolean p1) throws java.security.InvalidKeyException, java.lang.IllegalStateException { return null; }
    protected byte[] engineGenerateSecret() throws java.lang.IllegalStateException { return null; }
    protected javax.crypto.SecretKey engineGenerateSecret(java.lang.String p0) throws java.lang.IllegalStateException, java.security.NoSuchAlgorithmException, java.security.InvalidKeyException { return null; }
    protected int engineGenerateSecret(byte[] p0, int p1) throws java.lang.IllegalStateException, javax.crypto.ShortBufferException { return 0; }
    public long getOperationHandle() { return 0L; }
    protected void finalize() throws java.lang.Throwable {}
    private void resetWhilePreservingInitState() {}
    private void resetAll() {}
    private void ensureKeystoreOperationInitialized() throws java.security.InvalidKeyException, java.lang.IllegalStateException {}

    public static class ECDH extends android.security.keystore2.AndroidKeyStoreKeyAgreementSpi {
        public ECDH() { super(0); }
    }
}
