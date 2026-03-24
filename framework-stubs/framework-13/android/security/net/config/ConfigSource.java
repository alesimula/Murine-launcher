package android.security.net.config;

public interface ConfigSource {
    public java.util.Set<android.util.Pair<android.security.net.config.Domain, android.security.net.config.NetworkSecurityConfig>> getPerDomainConfigs();
    public android.security.net.config.NetworkSecurityConfig getDefaultConfig();
}
