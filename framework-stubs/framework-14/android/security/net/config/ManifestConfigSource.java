package android.security.net.config;

public class ManifestConfigSource implements android.security.net.config.ConfigSource {
    public ManifestConfigSource(android.content.Context p0) {}
    public java.util.Set<android.util.Pair<android.security.net.config.Domain, android.security.net.config.NetworkSecurityConfig>> getPerDomainConfigs() { return null; }
    public android.security.net.config.NetworkSecurityConfig getDefaultConfig() { return null; }

    private static final class DefaultConfigSource implements android.security.net.config.ConfigSource {
        DefaultConfigSource(boolean p0, android.content.pm.ApplicationInfo p1) {}
        public android.security.net.config.NetworkSecurityConfig getDefaultConfig() { return null; }
        public java.util.Set<android.util.Pair<android.security.net.config.Domain, android.security.net.config.NetworkSecurityConfig>> getPerDomainConfigs() { return null; }
    }
}
