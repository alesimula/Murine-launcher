package android.security.net.config;

public class ResourceCertificateSource implements android.security.net.config.CertificateSource {
    private final java.lang.Object mLock = null;
    private final int mResourceId = 0;
    private java.util.Set<java.security.cert.X509Certificate> mCertificates;
    private android.content.Context mContext;
    public ResourceCertificateSource(int p0, android.content.Context p1) {}
    private void ensureInitialized() {}
    public java.util.Set<java.security.cert.X509Certificate> getCertificates() { return null; }
    public java.security.cert.X509Certificate findBySubjectAndPublicKey(java.security.cert.X509Certificate p0) { return null; }
    public java.security.cert.X509Certificate findByIssuerAndSignature(java.security.cert.X509Certificate p0) { return null; }
    public java.util.Set<java.security.cert.X509Certificate> findAllByIssuerAndSignature(java.security.cert.X509Certificate p0) { return null; }
    public void handleTrustStorageUpdate() {}
}
