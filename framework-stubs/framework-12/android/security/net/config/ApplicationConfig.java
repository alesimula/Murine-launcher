package android.security.net.config;

public final class ApplicationConfig {
    private static android.security.net.config.ApplicationConfig sInstance;
    private static java.lang.Object sLock;
    private java.util.Set<android.util.Pair<android.security.net.config.Domain, android.security.net.config.NetworkSecurityConfig>> mConfigs;
    private android.security.net.config.NetworkSecurityConfig mDefaultConfig;
    private javax.net.ssl.X509TrustManager mTrustManager;
    private android.security.net.config.ConfigSource mConfigSource;
    private boolean mInitialized;
    private final java.lang.Object mLock = null;
    public ApplicationConfig(android.security.net.config.ConfigSource p0) {}
    public boolean hasPerDomainConfigs() { return false; }
    public android.security.net.config.NetworkSecurityConfig getConfigForHostname(java.lang.String p0) { return null; }
    public javax.net.ssl.X509TrustManager getTrustManager() { return null; }
    public boolean isCleartextTrafficPermitted() { return false; }
    public boolean isCleartextTrafficPermitted(java.lang.String p0) { return false; }
    public void handleTrustStorageUpdate() {}
    private void ensureInitialized() {}
    public static void setDefaultInstance(android.security.net.config.ApplicationConfig p0) {}
    public static android.security.net.config.ApplicationConfig getDefaultInstance() { return null; }
}
