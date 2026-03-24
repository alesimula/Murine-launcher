package android.security.net.config;

abstract class DirectoryCertificateSource implements android.security.net.config.CertificateSource {
    private static final java.lang.String LOG_TAG = "DirectoryCertificateSrc";
    private final java.io.File mDir = null;
    private final java.lang.Object mLock = null;
    private final java.security.cert.CertificateFactory mCertFactory = null;
    private java.util.Set<java.security.cert.X509Certificate> mCertificates;
    private static final char[] DIGITS = null;
    protected DirectoryCertificateSource(java.io.File p0) {}
    protected abstract boolean isCertMarkedAsRemoved(java.lang.String p0);
    public java.util.Set<java.security.cert.X509Certificate> getCertificates() { return null; }
    public java.security.cert.X509Certificate findBySubjectAndPublicKey(java.security.cert.X509Certificate p0) { return null; }
    public java.security.cert.X509Certificate findByIssuerAndSignature(java.security.cert.X509Certificate p0) { return null; }
    public java.util.Set<java.security.cert.X509Certificate> findAllByIssuerAndSignature(java.security.cert.X509Certificate p0) { return null; }
    public void handleTrustStorageUpdate() {}
    private java.util.Set<java.security.cert.X509Certificate> findCerts(javax.security.auth.x500.X500Principal p0, android.security.net.config.DirectoryCertificateSource.CertSelector p1) { return null; }
    private java.security.cert.X509Certificate findCert(javax.security.auth.x500.X500Principal p0, android.security.net.config.DirectoryCertificateSource.CertSelector p1) { return null; }
    private java.lang.String getHash(javax.security.auth.x500.X500Principal p0) { return null; }
    private static java.lang.String intToHexString(int p0, int p1) { return null; }
    private static int hashName(javax.security.auth.x500.X500Principal p0) { return 0; }
    private java.security.cert.X509Certificate readCertificate(java.lang.String p0) { return null; }

    private static interface CertSelector {
        public boolean match(java.security.cert.X509Certificate p0);
    }
}
