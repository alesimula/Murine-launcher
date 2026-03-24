package android.webkit;

@android.annotation.SystemApi
public interface WebViewFactoryProvider {
    public android.webkit.WebViewFactoryProvider.Statics getStatics();
    public android.webkit.WebViewProvider createWebView(android.webkit.WebView p0, android.webkit.WebView.PrivateAccess p1);
    public android.webkit.GeolocationPermissions getGeolocationPermissions();
    public android.webkit.CookieManager getCookieManager();
    public android.webkit.TokenBindingService getTokenBindingService();
    public android.webkit.TracingController getTracingController();
    public android.webkit.ServiceWorkerController getServiceWorkerController();
    public android.webkit.WebIconDatabase getWebIconDatabase();
    public android.webkit.WebStorage getWebStorage();
    public android.webkit.WebViewDatabase getWebViewDatabase(android.content.Context p0);
    public java.lang.ClassLoader getWebViewClassLoader();

    public static interface Statics {
        public java.lang.String findAddress(java.lang.String p0);
        public java.lang.String getDefaultUserAgent(android.content.Context p0);
        public void freeMemoryForTests();
        public void setWebContentsDebuggingEnabled(boolean p0);
        public void clearClientCertPreferences(java.lang.Runnable p0);
        public void enableSlowWholeDocumentDraw();
        public android.net.Uri[] parseFileChooserResult(int p0, android.content.Intent p1);
        public void initSafeBrowsing(android.content.Context p0, android.webkit.ValueCallback<java.lang.Boolean> p1);
        public void setSafeBrowsingWhitelist(java.util.List<java.lang.String> p0, android.webkit.ValueCallback<java.lang.Boolean> p1);
        public android.net.Uri getSafeBrowsingPrivacyPolicyUrl();
    }
}
