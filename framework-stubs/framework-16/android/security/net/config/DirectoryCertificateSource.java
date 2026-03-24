package android.security.net.config;

abstract class DirectoryCertificateSource implements android.security.net.config.CertificateSource {
    protected DirectoryCertificateSource(java.io.File p0) {}
    protected abstract boolean isCertMarkedAsRemoved(java.lang.String p0);
    public java.util.Set<java.security.cert.X509Certificate> getCertificates() { return null; }
    public java.security.cert.X509Certificate findBySubjectAndPublicKey(java.security.cert.X509Certificate p0) { return null; }
    public java.security.cert.X509Certificate findByIssuerAndSignature(java.security.cert.X509Certificate p0) { return null; }
    public java.util.Set<java.security.cert.X509Certificate> findAllByIssuerAndSignature(java.security.cert.X509Certificate p0) { return null; }
    public void handleTrustStorageUpdate() {}

    private static interface CertSelector {
        public boolean match(java.security.cert.X509Certificate p0);
    }
}
