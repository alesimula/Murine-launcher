package android.security.identity;

class CredstoreIdentityCredential extends android.security.identity.IdentityCredential {
    private static final java.lang.String TAG = "CredstoreIdentityCredential";
    private java.lang.String mCredentialName;
    private int mCipherSuite;
    private android.content.Context mContext;
    private android.security.identity.ICredential mBinder;
    private java.security.KeyPair mEphemeralKeyPair;
    private javax.crypto.SecretKey mSecretKey;
    private javax.crypto.SecretKey mReaderSecretKey;
    private int mEphemeralCounter;
    private int mReadersExpectedEphemeralCounter;
    private boolean mAllowUsingExhaustedKeys;
    private boolean mOperationHandleSet;
    private long mOperationHandle;
    CredstoreIdentityCredential(android.content.Context p0, java.lang.String p1, int p2, android.security.identity.ICredential p3) { super(); }
    private void ensureEphemeralKeyPair() {}
    public java.security.KeyPair createEphemeralKeyPair() { return null; }
    public void setReaderEphemeralPublicKey(java.security.PublicKey p0) throws java.security.InvalidKeyException {}
    public byte[] encryptMessageToReader(byte[] p0) { return null; }
    public byte[] decryptMessageFromReader(byte[] p0) throws android.security.identity.MessageDecryptionException { return null; }
    public java.util.Collection<java.security.cert.X509Certificate> getCredentialKeyCertificateChain() { return null; }
    public void setAllowUsingExhaustedKeys(boolean p0) {}
    public long getCredstoreOperationHandle() { return 0L; }
    public android.security.identity.ResultData getEntries(byte[] p0, java.util.Map<java.lang.String, java.util.Collection<java.lang.String>> p1, byte[] p2, byte[] p3) throws android.security.identity.SessionTranscriptMismatchException, android.security.identity.NoAuthenticationKeyAvailableException, android.security.identity.InvalidReaderSignatureException, android.security.identity.EphemeralPublicKeyNotFoundException, android.security.identity.InvalidRequestMessageException { return null; }
    public void setAvailableAuthenticationKeys(int p0, int p1) {}
    public java.util.Collection<java.security.cert.X509Certificate> getAuthKeysNeedingCertification() { return null; }
    public void storeStaticAuthenticationData(java.security.cert.X509Certificate p0, byte[] p1) throws android.security.identity.UnknownAuthenticationKeyException {}
    public int[] getAuthenticationDataUsageCount() { return null; }
}
