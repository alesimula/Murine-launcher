package android.security.net.config;

public class TrustedCertificateStoreAdapter {
    public TrustedCertificateStoreAdapter(android.security.net.config.NetworkSecurityConfig p0) {}
    public java.security.cert.X509Certificate findIssuer(java.security.cert.X509Certificate p0) { return null; }
    public java.util.Set<java.security.cert.X509Certificate> findAllIssuers(java.security.cert.X509Certificate p0) { return null; }
    public java.security.cert.X509Certificate getTrustAnchor(java.security.cert.X509Certificate p0) { return null; }
    public boolean isUserAddedCertificate(java.security.cert.X509Certificate p0) { return false; }
    public java.io.File getCertificateFile(java.io.File p0, java.security.cert.X509Certificate p1) { return null; }
    public java.security.cert.Certificate getCertificate(java.lang.String p0) { return null; }
    public java.security.cert.Certificate getCertificate(java.lang.String p0, boolean p1) { return null; }
    public java.util.Date getCreationDate(java.lang.String p0) { return null; }
    public java.util.Set<java.lang.String> aliases() { return null; }
    public java.util.Set<java.lang.String> userAliases() { return null; }
    public java.util.Set<java.lang.String> allSystemAliases() { return null; }
    public boolean containsAlias(java.lang.String p0) { return false; }
    public java.lang.String getCertificateAlias(java.security.cert.Certificate p0) { return null; }
    public java.lang.String getCertificateAlias(java.security.cert.Certificate p0, boolean p1) { return null; }
}
