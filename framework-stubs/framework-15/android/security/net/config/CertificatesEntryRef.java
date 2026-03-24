package android.security.net.config;

public final class CertificatesEntryRef {
    public CertificatesEntryRef(android.security.net.config.CertificateSource p0, boolean p1) {}
    boolean overridesPins() { return false; }
    public java.util.Set<android.security.net.config.TrustAnchor> getTrustAnchors() { return null; }
    public android.security.net.config.TrustAnchor findBySubjectAndPublicKey(java.security.cert.X509Certificate p0) { return null; }
    public android.security.net.config.TrustAnchor findByIssuerAndSignature(java.security.cert.X509Certificate p0) { return null; }
    public java.util.Set<java.security.cert.X509Certificate> findAllCertificatesByIssuerAndSignature(java.security.cert.X509Certificate p0) { return null; }
    public void handleTrustStorageUpdate() {}
}
