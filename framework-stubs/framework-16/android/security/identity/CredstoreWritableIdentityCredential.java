package android.security.identity;

class CredstoreWritableIdentityCredential extends android.security.identity.WritableIdentityCredential {
    CredstoreWritableIdentityCredential(android.content.Context p0, java.lang.String p1, java.lang.String p2, android.security.identity.IWritableCredential p3) { super(); }
    @android.annotation.NonNull
    public java.util.Collection<java.security.cert.X509Certificate> getCredentialKeyCertificateChain(byte[] p0) { return null; }
    @android.annotation.NonNull
    public byte[] personalize(android.security.identity.PersonalizationData p0) { return null; }
    @android.annotation.NonNull
    static byte[] personalize(android.security.identity.IWritableCredential p0, android.security.identity.PersonalizationData p1) { return null; }
}
