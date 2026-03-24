package android.webkit;

@android.annotation.SystemApi
public interface PacProcessor {
    public static android.webkit.PacProcessor getInstance() { return null; }
    public boolean setProxyScript(java.lang.String p0);
    public java.lang.String findProxyForUrl(java.lang.String p0);
}
