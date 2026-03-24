package android.net;

public final class Proxy {
    public static final java.lang.String PROXY_CHANGE_ACTION = "android.intent.action.PROXY_CHANGE";
    @java.lang.Deprecated
    public static final java.lang.String EXTRA_PROXY_INFO = "android.intent.extra.PROXY_INFO";
    public Proxy() {}
    public static final java.net.Proxy getProxy(android.content.Context p0, java.lang.String p1) { return null; }
    @java.lang.Deprecated
    public static final java.lang.String getHost(android.content.Context p0) { return null; }
    @java.lang.Deprecated
    public static final int getPort(android.content.Context p0) { return 0; }
    @java.lang.Deprecated
    public static final java.lang.String getDefaultHost() { return null; }
    @java.lang.Deprecated
    public static final int getDefaultPort() { return 0; }
    @java.lang.Deprecated
    public static void setHttpProxySystemProperty(android.net.ProxyInfo p0) {}
    @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.MODULE_LIBRARIES)
    public static void setHttpProxyConfiguration(android.net.ProxyInfo p0) {}
    public static void setHttpProxyConfiguration(java.lang.String p0, java.lang.String p1, java.lang.String p2, android.net.Uri p3) {}
}
