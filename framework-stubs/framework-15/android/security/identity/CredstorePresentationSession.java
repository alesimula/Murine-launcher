package android.security.identity;

class CredstorePresentationSession extends android.security.identity.PresentationSession {
    CredstorePresentationSession(android.content.Context p0, int p1, android.security.identity.CredstoreIdentityCredentialStore p2, android.security.identity.ISession p3, int p4) { super(); }
    @android.annotation.NonNull
    public java.security.KeyPair getEphemeralKeyPair() { return null; }
    public void setReaderEphemeralPublicKey(java.security.PublicKey p0) throws java.security.InvalidKeyException {}
    public void setSessionTranscript(byte[] p0) {}
    @android.annotation.Nullable
    public android.security.identity.CredentialDataResult getCredentialData(java.lang.String p0, android.security.identity.CredentialDataRequest p1) throws android.security.identity.NoAuthenticationKeyAvailableException, android.security.identity.InvalidReaderSignatureException, android.security.identity.InvalidRequestMessageException, android.security.identity.EphemeralPublicKeyNotFoundException { return null; }
    public long getCredstoreOperationHandle() { return 0L; }
}
