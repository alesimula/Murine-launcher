package android.net;

public final class Proxy {
    private static final java.lang.String TAG = "Proxy";
    private static final java.net.ProxySelector sDefaultProxySelector = null;
    public static final java.lang.String PROXY_CHANGE_ACTION = "android.intent.action.PROXY_CHANGE";
    @java.lang.Deprecated
    public static final java.lang.String EXTRA_PROXY_INFO = "android.intent.extra.PROXY_INFO";
    public static final int PROXY_VALID = 0;
    public static final int PROXY_HOSTNAME_EMPTY = 1;
    public static final int PROXY_HOSTNAME_INVALID = 2;
    public static final int PROXY_PORT_EMPTY = 3;
    public static final int PROXY_PORT_INVALID = 4;
    public static final int PROXY_EXCLLIST_INVALID = 5;
    private static android.net.ConnectivityManager sConnectivityManager;
    private static final java.lang.String NAME_IP_REGEX = "[a-zA-Z0-9]+(\\-[a-zA-Z0-9]+)*(\\.[a-zA-Z0-9]+(\\-[a-zA-Z0-9]+)*)*";
    private static final java.lang.String HOSTNAME_REGEXP = "^$|^[a-zA-Z0-9]+(\\-[a-zA-Z0-9]+)*(\\.[a-zA-Z0-9]+(\\-[a-zA-Z0-9]+)*)*$";
    private static final java.util.regex.Pattern HOSTNAME_PATTERN = null;
    private static final java.lang.String EXCL_REGEX = "[a-zA-Z0-9*]+(\\-[a-zA-Z0-9*]+)*(\\.[a-zA-Z0-9*]+(\\-[a-zA-Z0-9*]+)*)*";
    private static final java.lang.String EXCLLIST_REGEXP = "^$|^[a-zA-Z0-9*]+(\\-[a-zA-Z0-9*]+)*(\\.[a-zA-Z0-9*]+(\\-[a-zA-Z0-9*]+)*)*(,[a-zA-Z0-9*]+(\\-[a-zA-Z0-9*]+)*(\\.[a-zA-Z0-9*]+(\\-[a-zA-Z0-9*]+)*)*)*$";
    private static final java.util.regex.Pattern EXCLLIST_PATTERN = null;
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
    private static final boolean isLocalHost(java.lang.String p0) { return false; }
    public static int validate(java.lang.String p0, java.lang.String p1, java.lang.String p2) { return 0; }
    public static final void setHttpProxySystemProperty(android.net.ProxyInfo p0) {}
    public static final void setHttpProxySystemProperty(java.lang.String p0, java.lang.String p1, java.lang.String p2, android.net.Uri p3) {}
}
