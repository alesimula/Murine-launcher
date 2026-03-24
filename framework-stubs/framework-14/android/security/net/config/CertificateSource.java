package android.security.net.config;

public interface CertificateSource {
    public java.util.Set<java.security.cert.X509Certificate> getCertificates();
    public java.security.cert.X509Certificate findBySubjectAndPublicKey(java.security.cert.X509Certificate p0);
    public java.security.cert.X509Certificate findByIssuerAndSignature(java.security.cert.X509Certificate p0);
    public java.util.Set<java.security.cert.X509Certificate> findAllByIssuerAndSignature(java.security.cert.X509Certificate p0);
    public void handleTrustStorageUpdate();
}
