package android.security.net.config;

public class ManifestConfigSource implements android.security.net.config.ConfigSource {
    private static final boolean DBG = true;
    private static final java.lang.String LOG_TAG = "NetworkSecurityConfig";
    private final java.lang.Object mLock = null;
    private final android.content.Context mContext = null;
    private final android.content.pm.ApplicationInfo mApplicationInfo = null;
    private android.security.net.config.ConfigSource mConfigSource;
    public ManifestConfigSource(android.content.Context p0) {}
    public java.util.Set<android.util.Pair<android.security.net.config.Domain, android.security.net.config.NetworkSecurityConfig>> getPerDomainConfigs() { return null; }
    public android.security.net.config.NetworkSecurityConfig getDefaultConfig() { return null; }
    private android.security.net.config.ConfigSource getConfigSource() { return null; }

    private static final class DefaultConfigSource implements android.security.net.config.ConfigSource {
        private final android.security.net.config.NetworkSecurityConfig mDefaultConfig = null;
        DefaultConfigSource(boolean p0, android.content.pm.ApplicationInfo p1) {}
        public android.security.net.config.NetworkSecurityConfig getDefaultConfig() { return null; }
        public java.util.Set<android.util.Pair<android.security.net.config.Domain, android.security.net.config.NetworkSecurityConfig>> getPerDomainConfigs() { return null; }
    }
}
