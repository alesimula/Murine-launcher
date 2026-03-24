package android.webkit;

public interface WebResourceRequest {
    public android.net.Uri getUrl();
    public boolean isForMainFrame();
    public boolean isRedirect();
    public boolean hasGesture();
    public java.lang.String getMethod();
    public java.util.Map<java.lang.String, java.lang.String> getRequestHeaders();
}
