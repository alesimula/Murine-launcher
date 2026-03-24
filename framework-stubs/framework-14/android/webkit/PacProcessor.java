package android.webkit;

@android.annotation.SystemApi
public interface PacProcessor {
    public static android.webkit.PacProcessor getInstance() { return null; }
    public static android.webkit.PacProcessor createInstance() { return null; }
    public boolean setProxyScript(java.lang.String p0);
    public java.lang.String findProxyForUrl(java.lang.String p0);
    default public void release() {}
    default public void setNetwork(android.net.Network p0) {}
    default public android.net.Network getNetwork() { return null; }
}
