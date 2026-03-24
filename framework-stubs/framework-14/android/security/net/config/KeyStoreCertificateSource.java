package android.security.net.config;

class KeyStoreCertificateSource implements android.security.net.config.CertificateSource {
    public KeyStoreCertificateSource(java.security.KeyStore p0) {}
    public java.util.Set<java.security.cert.X509Certificate> getCertificates() { return null; }
    public java.security.cert.X509Certificate findBySubjectAndPublicKey(java.security.cert.X509Certificate p0) { return null; }
    public java.security.cert.X509Certificate findByIssuerAndSignature(java.security.cert.X509Certificate p0) { return null; }
    public java.util.Set<java.security.cert.X509Certificate> findAllByIssuerAndSignature(java.security.cert.X509Certificate p0) { return null; }
    public void handleTrustStorageUpdate() {}
}
