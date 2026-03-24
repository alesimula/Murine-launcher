package android.net;

public class PacProxySelector extends java.net.ProxySelector {
    public static final java.lang.String PROXY_SERVICE = "com.android.net.IProxyService";
    public PacProxySelector() { super(); }
    public java.util.List<java.net.Proxy> select(java.net.URI p0) { return null; }
    public void connectFailed(java.net.URI p0, java.net.SocketAddress p1, java.io.IOException p2) {}
}
