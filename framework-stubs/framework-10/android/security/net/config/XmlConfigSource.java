package android.security.net.config;

public class XmlConfigSource implements android.security.net.config.ConfigSource {
    private static final int CONFIG_BASE = 0;
    private static final int CONFIG_DOMAIN = 1;
    private static final int CONFIG_DEBUG = 2;
    private final java.lang.Object mLock = null;
    private final int mResourceId = 0;
    private final boolean mDebugBuild = false;
    private final android.content.pm.ApplicationInfo mApplicationInfo = null;
    private boolean mInitialized;
    private android.security.net.config.NetworkSecurityConfig mDefaultConfig;
    private java.util.Set<android.util.Pair<android.security.net.config.Domain, android.security.net.config.NetworkSecurityConfig>> mDomainMap;
    private android.content.Context mContext;
    public XmlConfigSource(android.content.Context p0, int p1, android.content.pm.ApplicationInfo p2) {}
    public java.util.Set<android.util.Pair<android.security.net.config.Domain, android.security.net.config.NetworkSecurityConfig>> getPerDomainConfigs() { return null; }
    public android.security.net.config.NetworkSecurityConfig getDefaultConfig() { return null; }
    private static final java.lang.String getConfigString(int p0) { return null; }
    private void ensureInitialized() {}
    private android.security.net.config.Pin parsePin(android.content.res.XmlResourceParser p0) throws java.io.IOException, org.xmlpull.v1.XmlPullParserException, android.security.net.config.XmlConfigSource.ParserException { return null; }
    private android.security.net.config.PinSet parsePinSet(android.content.res.XmlResourceParser p0) throws java.io.IOException, org.xmlpull.v1.XmlPullParserException, android.security.net.config.XmlConfigSource.ParserException { return null; }
    private android.security.net.config.Domain parseDomain(android.content.res.XmlResourceParser p0, java.util.Set<java.lang.String> p1) throws java.io.IOException, org.xmlpull.v1.XmlPullParserException, android.security.net.config.XmlConfigSource.ParserException { return null; }
    private android.security.net.config.CertificatesEntryRef parseCertificatesEntry(android.content.res.XmlResourceParser p0, boolean p1) throws java.io.IOException, org.xmlpull.v1.XmlPullParserException, android.security.net.config.XmlConfigSource.ParserException { return null; }
    private java.util.Collection<android.security.net.config.CertificatesEntryRef> parseTrustAnchors(android.content.res.XmlResourceParser p0, boolean p1) throws java.io.IOException, org.xmlpull.v1.XmlPullParserException, android.security.net.config.XmlConfigSource.ParserException { return null; }
    private java.util.List<android.util.Pair<android.security.net.config.NetworkSecurityConfig.Builder, java.util.Set<android.security.net.config.Domain>>> parseConfigEntry(android.content.res.XmlResourceParser p0, java.util.Set<java.lang.String> p1, android.security.net.config.NetworkSecurityConfig.Builder p2, int p3) throws java.io.IOException, org.xmlpull.v1.XmlPullParserException, android.security.net.config.XmlConfigSource.ParserException { return null; }
    private void addDebugAnchorsIfNeeded(android.security.net.config.NetworkSecurityConfig.Builder p0, android.security.net.config.NetworkSecurityConfig.Builder p1) {}
    private void parseNetworkSecurityConfig(android.content.res.XmlResourceParser p0) throws java.io.IOException, org.xmlpull.v1.XmlPullParserException, android.security.net.config.XmlConfigSource.ParserException {}
    private android.security.net.config.NetworkSecurityConfig.Builder parseDebugOverridesResource() throws java.io.IOException, org.xmlpull.v1.XmlPullParserException, android.security.net.config.XmlConfigSource.ParserException { return null; }

    public static class ParserException extends java.lang.Exception {
        public ParserException(org.xmlpull.v1.XmlPullParser p0, java.lang.String p1, java.lang.Throwable p2) { super(); }
        public ParserException(org.xmlpull.v1.XmlPullParser p0, java.lang.String p1) { super(); }
    }
}
