package android.security.net.config;

public final class NetworkSecurityConfig {
    public static final boolean DEFAULT_CLEARTEXT_TRAFFIC_PERMITTED = true;
    public static final boolean DEFAULT_HSTS_ENFORCED = false;
    public static final boolean DEFAULT_CERTIFICATE_TRANSPARENCY_VERIFICATION_REQUIRED = false;
    public java.util.Set<android.security.net.config.TrustAnchor> getTrustAnchors() { return null; }
    public boolean isCleartextTrafficPermitted() { return false; }
    public boolean isHstsEnforced() { return false; }
    public boolean isCertificateTransparencyVerificationRequired() { return false; }
    public android.security.net.config.PinSet getPins() { return null; }
    public android.security.net.config.NetworkSecurityTrustManager getTrustManager() { return null; }
    public android.security.net.config.TrustAnchor findTrustAnchorBySubjectAndPublicKey(java.security.cert.X509Certificate p0) { return null; }
    public android.security.net.config.TrustAnchor findTrustAnchorByIssuerAndSignature(java.security.cert.X509Certificate p0) { return null; }
    public java.util.Set<java.security.cert.X509Certificate> findAllCertificatesByIssuerAndSignature(java.security.cert.X509Certificate p0) { return null; }
    public void handleTrustStorageUpdate() {}
    public static android.security.net.config.NetworkSecurityConfig.Builder getDefaultBuilder(android.content.pm.ApplicationInfo p0) { return null; }

    public static final class Builder {
        public Builder() {}
        public android.security.net.config.NetworkSecurityConfig.Builder setParent(android.security.net.config.NetworkSecurityConfig.Builder p0) { return null; }
        public android.security.net.config.NetworkSecurityConfig.Builder getParent() { return null; }
        public android.security.net.config.NetworkSecurityConfig.Builder setPinSet(android.security.net.config.PinSet p0) { return null; }
        public android.security.net.config.NetworkSecurityConfig.Builder setCleartextTrafficPermitted(boolean p0) { return null; }
        public android.security.net.config.NetworkSecurityConfig.Builder setHstsEnforced(boolean p0) { return null; }
        public android.security.net.config.NetworkSecurityConfig.Builder addCertificatesEntryRef(android.security.net.config.CertificatesEntryRef p0) { return null; }
        public android.security.net.config.NetworkSecurityConfig.Builder addCertificatesEntryRefs(java.util.Collection<? extends android.security.net.config.CertificatesEntryRef> p0) { return null; }
        public boolean hasCertificatesEntryRefs() { return false; }
        java.util.List<android.security.net.config.CertificatesEntryRef> getCertificatesEntryRefs() { return null; }
        android.security.net.config.NetworkSecurityConfig.Builder setCertificateTransparencyVerificationRequired(boolean p0) { return null; }
        public android.security.net.config.NetworkSecurityConfig build() { return null; }
    }
}
