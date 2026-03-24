package android.webkit;

@android.annotation.SystemApi
public interface WebViewFactoryProvider {
    public static final int MINIMUM_SUPPORTED_TARGET_SDK = 33;
    public static final long MINIMUM_SUPPORTED_VERSION_CODE = 661308800L;
    public static boolean isCompatibleImplementationPackage(android.content.pm.PackageInfo p0) { return false; }
    @android.annotation.NonNull
    public static java.lang.String describeCompatibleImplementationPackage() { return null; }
    @android.annotation.NonNull
    public static java.lang.String getWebViewFactoryClassName() { return null; }
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
    @android.annotation.NonNull
    default public android.webkit.PacProcessor getPacProcessor() { return null; }
    @android.annotation.NonNull
    default public android.webkit.PacProcessor createPacProcessor() { return null; }
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
        @android.annotation.NonNull
        public android.net.Uri getSafeBrowsingPrivacyPolicyUrl();
    }
}
