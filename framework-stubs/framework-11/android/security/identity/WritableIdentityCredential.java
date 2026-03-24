package android.security.identity;

public abstract class WritableIdentityCredential {
    protected WritableIdentityCredential() {}
    public abstract java.util.Collection<java.security.cert.X509Certificate> getCredentialKeyCertificateChain(byte[] p0);
    public abstract byte[] personalize(android.security.identity.PersonalizationData p0);
}
