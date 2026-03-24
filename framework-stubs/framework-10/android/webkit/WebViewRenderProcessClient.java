package android.webkit;

public abstract class WebViewRenderProcessClient {
    public WebViewRenderProcessClient() {}
    public abstract void onRenderProcessUnresponsive(android.webkit.WebView p0, android.webkit.WebViewRenderProcess p1);
    public abstract void onRenderProcessResponsive(android.webkit.WebView p0, android.webkit.WebViewRenderProcess p1);
}
