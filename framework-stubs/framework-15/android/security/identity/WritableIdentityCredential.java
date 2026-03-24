package android.security.identity;

public abstract class WritableIdentityCredential {
    protected WritableIdentityCredential() {}
    @android.annotation.NonNull
    public abstract java.util.Collection<java.security.cert.X509Certificate> getCredentialKeyCertificateChain(byte[] p0);
    @android.annotation.NonNull
    public abstract byte[] personalize(android.security.identity.PersonalizationData p0);
}
