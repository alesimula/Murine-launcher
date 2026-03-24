package com.android.org.conscrypt;

public class TrustedCertificateStore implements com.android.org.conscrypt.ConscryptCertStore {
    public static final boolean isSystem(java.lang.String p0) { return false; }
    public static final boolean isUser(java.lang.String p0) { return false; }
    public static void setDefaultUserDirectory(java.io.File p0) {}
    public TrustedCertificateStore() {}
    public TrustedCertificateStore(java.io.File p0) {}
    public TrustedCertificateStore(java.io.File p0, java.io.File p1, java.io.File p2) {}
    public java.security.cert.Certificate getCertificate(java.lang.String p0) { return null; }
    public java.security.cert.Certificate getCertificate(java.lang.String p0, boolean p1) { return null; }
    public java.util.Date getCreationDate(java.lang.String p0) { return null; }
    public java.util.Set<java.lang.String> aliases() { return null; }
    public java.util.Set<java.lang.String> userAliases() { return null; }
    public java.util.Set<java.lang.String> allSystemAliases() { return null; }
    public boolean containsAlias(java.lang.String p0) { return false; }
    public java.lang.String getCertificateAlias(java.security.cert.Certificate p0) { return null; }
    public java.lang.String getCertificateAlias(java.security.cert.Certificate p0, boolean p1) { return null; }
    public boolean isUserAddedCertificate(java.security.cert.X509Certificate p0) { return false; }
    public java.io.File getCertificateFile(java.io.File p0, java.security.cert.X509Certificate p1) { return null; }
    public java.security.cert.X509Certificate getTrustAnchor(java.security.cert.X509Certificate p0) { return null; }
    public java.security.cert.X509Certificate findIssuer(java.security.cert.X509Certificate p0) { return null; }
    public java.util.Set<java.security.cert.X509Certificate> findAllIssuers(java.security.cert.X509Certificate p0) { return null; }
    public java.util.List<java.security.cert.X509Certificate> getCertificateChain(java.security.cert.X509Certificate p0) throws java.security.cert.CertificateException { return null; }
    public void installCertificate(java.security.cert.X509Certificate p0) throws java.io.IOException, java.security.cert.CertificateException {}
    public void deleteCertificateEntry(java.lang.String p0) throws java.io.IOException, java.security.cert.CertificateException {}

    private static interface CertSelector {
        public boolean match(java.security.cert.X509Certificate p0);
    }

    private static class PreloadHolder {
    }
}
