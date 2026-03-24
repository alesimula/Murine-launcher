package android.security.identity;

public abstract class IdentityCredential {
    protected IdentityCredential() {}
    @java.lang.Deprecated
    public abstract java.security.KeyPair createEphemeralKeyPair();
    @java.lang.Deprecated
    public abstract void setReaderEphemeralPublicKey(java.security.PublicKey p0) throws java.security.InvalidKeyException;
    @java.lang.Deprecated
    public abstract byte[] encryptMessageToReader(byte[] p0);
    @java.lang.Deprecated
    public abstract byte[] decryptMessageFromReader(byte[] p0) throws android.security.identity.MessageDecryptionException;
    public abstract java.util.Collection<java.security.cert.X509Certificate> getCredentialKeyCertificateChain();
    @java.lang.Deprecated
    public abstract void setAllowUsingExhaustedKeys(boolean p0);
    @java.lang.Deprecated
    public void setAllowUsingExpiredKeys(boolean p0) {}
    public void setIncrementKeyUsageCount(boolean p0) {}
    public abstract long getCredstoreOperationHandle();
    @java.lang.Deprecated
    public abstract android.security.identity.ResultData getEntries(byte[] p0, java.util.Map<java.lang.String, java.util.Collection<java.lang.String>> p1, byte[] p2, byte[] p3) throws android.security.identity.SessionTranscriptMismatchException, android.security.identity.NoAuthenticationKeyAvailableException, android.security.identity.InvalidReaderSignatureException, android.security.identity.EphemeralPublicKeyNotFoundException, android.security.identity.InvalidRequestMessageException;
    public abstract void setAvailableAuthenticationKeys(int p0, int p1);
    public abstract java.util.Collection<java.security.cert.X509Certificate> getAuthKeysNeedingCertification();
    @java.lang.Deprecated
    public abstract void storeStaticAuthenticationData(java.security.cert.X509Certificate p0, byte[] p1) throws android.security.identity.UnknownAuthenticationKeyException;
    public void storeStaticAuthenticationData(java.security.cert.X509Certificate p0, java.time.Instant p1, byte[] p2) throws android.security.identity.UnknownAuthenticationKeyException {}
    public abstract int[] getAuthenticationDataUsageCount();
    public byte[] proveOwnership(byte[] p0) { return null; }
    public byte[] delete(byte[] p0) { return null; }
    public byte[] update(android.security.identity.PersonalizationData p0) { return null; }
}
