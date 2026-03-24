package android.security.net.config;

public final class NetworkSecurityConfig {
    public static final boolean DEFAULT_CLEARTEXT_TRAFFIC_PERMITTED = true;
    public static final boolean DEFAULT_HSTS_ENFORCED = false;
    private final boolean mCleartextTrafficPermitted = false;
    private final boolean mHstsEnforced = false;
    private final android.security.net.config.PinSet mPins = null;
    private final java.util.List<android.security.net.config.CertificatesEntryRef> mCertificatesEntryRefs = null;
    private java.util.Set<android.security.net.config.TrustAnchor> mAnchors;
    private final java.lang.Object mAnchorsLock = null;
    private android.security.net.config.NetworkSecurityTrustManager mTrustManager;
    private final java.lang.Object mTrustManagerLock = null;
    private NetworkSecurityConfig(boolean p0, boolean p1, android.security.net.config.PinSet p2, java.util.List<android.security.net.config.CertificatesEntryRef> p3) {}
    public java.util.Set<android.security.net.config.TrustAnchor> getTrustAnchors() { return null; }
    public boolean isCleartextTrafficPermitted() { return false; }
    public boolean isHstsEnforced() { return false; }
    public android.security.net.config.PinSet getPins() { return null; }
    public android.security.net.config.NetworkSecurityTrustManager getTrustManager() { return null; }
    public android.security.net.config.TrustAnchor findTrustAnchorBySubjectAndPublicKey(java.security.cert.X509Certificate p0) { return null; }
    public android.security.net.config.TrustAnchor findTrustAnchorByIssuerAndSignature(java.security.cert.X509Certificate p0) { return null; }
    public java.util.Set<java.security.cert.X509Certificate> findAllCertificatesByIssuerAndSignature(java.security.cert.X509Certificate p0) { return null; }
    public void handleTrustStorageUpdate() {}
    public static android.security.net.config.NetworkSecurityConfig.Builder getDefaultBuilder(android.content.pm.ApplicationInfo p0) { return null; }

    public static final class Builder {
        private java.util.List<android.security.net.config.CertificatesEntryRef> mCertificatesEntryRefs;
        private android.security.net.config.PinSet mPinSet;
        private boolean mCleartextTrafficPermitted;
        private boolean mHstsEnforced;
        private boolean mCleartextTrafficPermittedSet;
        private boolean mHstsEnforcedSet;
        private android.security.net.config.NetworkSecurityConfig.Builder mParentBuilder;
        public Builder() {}
        public android.security.net.config.NetworkSecurityConfig.Builder setParent(android.security.net.config.NetworkSecurityConfig.Builder p0) { return null; }
        public android.security.net.config.NetworkSecurityConfig.Builder getParent() { return null; }
        public android.security.net.config.NetworkSecurityConfig.Builder setPinSet(android.security.net.config.PinSet p0) { return null; }
        private android.security.net.config.PinSet getEffectivePinSet() { return null; }
        public android.security.net.config.NetworkSecurityConfig.Builder setCleartextTrafficPermitted(boolean p0) { return null; }
        private boolean getEffectiveCleartextTrafficPermitted() { return false; }
        public android.security.net.config.NetworkSecurityConfig.Builder setHstsEnforced(boolean p0) { return null; }
        private boolean getEffectiveHstsEnforced() { return false; }
        public android.security.net.config.NetworkSecurityConfig.Builder addCertificatesEntryRef(android.security.net.config.CertificatesEntryRef p0) { return null; }
        public android.security.net.config.NetworkSecurityConfig.Builder addCertificatesEntryRefs(java.util.Collection<? extends android.security.net.config.CertificatesEntryRef> p0) { return null; }
        private java.util.List<android.security.net.config.CertificatesEntryRef> getEffectiveCertificatesEntryRefs() { return null; }
        public boolean hasCertificatesEntryRefs() { return false; }
        java.util.List<android.security.net.config.CertificatesEntryRef> getCertificatesEntryRefs() { return null; }
        public android.security.net.config.NetworkSecurityConfig build() { return null; }
    }
}
