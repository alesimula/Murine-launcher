package android.security.net.config;

public class XmlConfigSource implements android.security.net.config.ConfigSource {
    public XmlConfigSource(android.content.Context p0, int p1, android.content.pm.ApplicationInfo p2) {}
    public java.util.Set<android.util.Pair<android.security.net.config.Domain, android.security.net.config.NetworkSecurityConfig>> getPerDomainConfigs() { return null; }
    public android.security.net.config.NetworkSecurityConfig getDefaultConfig() { return null; }

    public static class ParserException extends java.lang.Exception {
        public ParserException(org.xmlpull.v1.XmlPullParser p0, java.lang.String p1, java.lang.Throwable p2) { super(); }
        public ParserException(org.xmlpull.v1.XmlPullParser p0, java.lang.String p1) { super(); }
    }
}
