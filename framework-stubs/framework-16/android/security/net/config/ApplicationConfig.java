package android.security.net.config;

public final class ApplicationConfig {
    public ApplicationConfig(android.security.net.config.ConfigSource p0) {}
    public boolean hasPerDomainConfigs() { return false; }
    public android.security.net.config.NetworkSecurityConfig getConfigForHostname(java.lang.String p0) { return null; }
    public javax.net.ssl.X509TrustManager getTrustManager() { return null; }
    public boolean isCleartextTrafficPermitted() { return false; }
    public boolean isCleartextTrafficPermitted(java.lang.String p0) { return false; }
    public boolean isCertificateTransparencyVerificationRequired(java.lang.String p0) { return false; }
    public void handleTrustStorageUpdate() {}
    public static void setDefaultInstance(android.security.net.config.ApplicationConfig p0) {}
    public static android.security.net.config.ApplicationConfig getDefaultInstance() { return null; }
}
