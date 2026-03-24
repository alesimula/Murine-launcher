package android.webkit;

public class WebViewClient {
    public static final int ERROR_UNKNOWN = -1;
    public static final int ERROR_HOST_LOOKUP = -2;
    public static final int ERROR_UNSUPPORTED_AUTH_SCHEME = -3;
    public static final int ERROR_AUTHENTICATION = -4;
    public static final int ERROR_PROXY_AUTHENTICATION = -5;
    public static final int ERROR_CONNECT = -6;
    public static final int ERROR_IO = -7;
    public static final int ERROR_TIMEOUT = -8;
    public static final int ERROR_REDIRECT_LOOP = -9;
    public static final int ERROR_UNSUPPORTED_SCHEME = -10;
    public static final int ERROR_FAILED_SSL_HANDSHAKE = -11;
    public static final int ERROR_BAD_URL = -12;
    public static final int ERROR_FILE = -13;
    public static final int ERROR_FILE_NOT_FOUND = -14;
    public static final int ERROR_TOO_MANY_REQUESTS = -15;
    public static final int ERROR_UNSAFE_RESOURCE = -16;
    public static final int SAFE_BROWSING_THREAT_UNKNOWN = 0;
    public static final int SAFE_BROWSING_THREAT_MALWARE = 1;
    public static final int SAFE_BROWSING_THREAT_PHISHING = 2;
    public static final int SAFE_BROWSING_THREAT_UNWANTED_SOFTWARE = 3;
    public static final int SAFE_BROWSING_THREAT_BILLING = 4;
    public WebViewClient() {}
    @java.lang.Deprecated
    public boolean shouldOverrideUrlLoading(android.webkit.WebView p0, java.lang.String p1) { return false; }
    public boolean shouldOverrideUrlLoading(android.webkit.WebView p0, android.webkit.WebResourceRequest p1) { return false; }
    public void onPageStarted(android.webkit.WebView p0, java.lang.String p1, android.graphics.Bitmap p2) {}
    public void onPageFinished(android.webkit.WebView p0, java.lang.String p1) {}
    public void onLoadResource(android.webkit.WebView p0, java.lang.String p1) {}
    public void onPageCommitVisible(android.webkit.WebView p0, java.lang.String p1) {}
    @java.lang.Deprecated
    public android.webkit.WebResourceResponse shouldInterceptRequest(android.webkit.WebView p0, java.lang.String p1) { return null; }
    public android.webkit.WebResourceResponse shouldInterceptRequest(android.webkit.WebView p0, android.webkit.WebResourceRequest p1) { return null; }
    @java.lang.Deprecated
    public void onTooManyRedirects(android.webkit.WebView p0, android.os.Message p1, android.os.Message p2) {}
    @java.lang.Deprecated
    public void onReceivedError(android.webkit.WebView p0, int p1, java.lang.String p2, java.lang.String p3) {}
    public void onReceivedError(android.webkit.WebView p0, android.webkit.WebResourceRequest p1, android.webkit.WebResourceError p2) {}
    public void onReceivedHttpError(android.webkit.WebView p0, android.webkit.WebResourceRequest p1, android.webkit.WebResourceResponse p2) {}
    public void onFormResubmission(android.webkit.WebView p0, android.os.Message p1, android.os.Message p2) {}
    public void doUpdateVisitedHistory(android.webkit.WebView p0, java.lang.String p1, boolean p2) {}
    public void onReceivedSslError(android.webkit.WebView p0, android.webkit.SslErrorHandler p1, android.net.http.SslError p2) {}
    public void onReceivedClientCertRequest(android.webkit.WebView p0, android.webkit.ClientCertRequest p1) {}
    public void onReceivedHttpAuthRequest(android.webkit.WebView p0, android.webkit.HttpAuthHandler p1, java.lang.String p2, java.lang.String p3) {}
    public boolean shouldOverrideKeyEvent(android.webkit.WebView p0, android.view.KeyEvent p1) { return false; }
    public void onUnhandledKeyEvent(android.webkit.WebView p0, android.view.KeyEvent p1) {}
    public void onUnhandledInputEvent(android.webkit.WebView p0, android.view.InputEvent p1) {}
    public void onScaleChanged(android.webkit.WebView p0, float p1, float p2) {}
    public void onReceivedLoginRequest(android.webkit.WebView p0, java.lang.String p1, java.lang.String p2, java.lang.String p3) {}
    public boolean onRenderProcessGone(android.webkit.WebView p0, android.webkit.RenderProcessGoneDetail p1) { return false; }
    public void onSafeBrowsingHit(android.webkit.WebView p0, android.webkit.WebResourceRequest p1, int p2, android.webkit.SafeBrowsingResponse p3) {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface SafeBrowsingThreat {
    }
}
