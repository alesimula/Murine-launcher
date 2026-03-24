package android.net;

public class PacProxySelector extends java.net.ProxySelector {
    private static final java.lang.String TAG = "PacProxySelector";
    public static final java.lang.String PROXY_SERVICE = "com.android.net.IProxyService";
    private static final java.lang.String SOCKS = "SOCKS ";
    private static final java.lang.String PROXY = "PROXY ";
    private com.android.net.IProxyService mProxyService;
    private final java.util.List<java.net.Proxy> mDefaultList = null;
    public PacProxySelector() { super(); }
    public java.util.List<java.net.Proxy> select(java.net.URI p0) { return null; }
    private static java.util.List<java.net.Proxy> parseResponse(java.lang.String p0) { return null; }
    private static java.net.Proxy proxyFromHostPort(java.net.Proxy.Type p0, java.lang.String p1) { return null; }
    public void connectFailed(java.net.URI p0, java.net.SocketAddress p1, java.io.IOException p2) {}
}
