package android.webkit;

@android.annotation.SystemApi
public final class WebViewFactory {
    private static final java.lang.String CHROMIUM_WEBVIEW_FACTORY = "com.android.webview.chromium.WebViewChromiumFactoryProviderForQ";
    private static final java.lang.String CHROMIUM_WEBVIEW_FACTORY_METHOD = "create";
    private static final java.lang.String LOGTAG = "WebViewFactory";
    private static final boolean DEBUG = false;
    @android.annotation.UnsupportedAppUsage
    private static android.webkit.WebViewFactoryProvider sProviderInstance;
    private static final java.lang.Object sProviderLock = null;
    @android.annotation.UnsupportedAppUsage
    private static android.content.pm.PackageInfo sPackageInfo;
    private static java.lang.Boolean sWebViewSupported;
    private static boolean sWebViewDisabled;
    private static java.lang.String sDataDirectorySuffix;
    public static final int LIBLOAD_SUCCESS = 0;
    public static final int LIBLOAD_WRONG_PACKAGE_NAME = 1;
    public static final int LIBLOAD_ADDRESS_SPACE_NOT_RESERVED = 2;
    public static final int LIBLOAD_FAILED_WAITING_FOR_RELRO = 3;
    public static final int LIBLOAD_FAILED_LISTING_WEBVIEW_PACKAGES = 4;
    public static final int LIBLOAD_FAILED_TO_OPEN_RELRO_FILE = 5;
    public static final int LIBLOAD_FAILED_TO_LOAD_LIBRARY = 6;
    public static final int LIBLOAD_FAILED_JNI_CALL = 7;
    public static final int LIBLOAD_FAILED_WAITING_FOR_WEBVIEW_REASON_UNKNOWN = 8;
    public static final int LIBLOAD_FAILED_TO_FIND_NAMESPACE = 10;
    private static java.lang.String WEBVIEW_UPDATE_SERVICE_NAME;
    public WebViewFactory() {}
    private static java.lang.String getWebViewPreparationErrorReason(int p0) { return null; }
    private static boolean isWebViewSupported() { return false; }
    static void disableWebView() {}
    static void setDataDirectorySuffix(java.lang.String p0) {}
    static java.lang.String getDataDirectorySuffix() { return null; }
    public static java.lang.String getWebViewLibrary(android.content.pm.ApplicationInfo p0) { return null; }
    public static android.content.pm.PackageInfo getLoadedPackageInfo() { return null; }
    public static java.lang.Class<android.webkit.WebViewFactoryProvider> getWebViewProviderClass(java.lang.ClassLoader p0) throws java.lang.ClassNotFoundException { return null; }
    public static int loadWebViewNativeLibraryFromPackage(java.lang.String p0, java.lang.ClassLoader p1) { return 0; }
    @android.annotation.UnsupportedAppUsage
    static android.webkit.WebViewFactoryProvider getProvider() { return null; }
    private static boolean signaturesEquals(android.content.pm.Signature[] p0, android.content.pm.Signature[] p1) { return false; }
    private static void verifyPackageInfo(android.content.pm.PackageInfo p0, android.content.pm.PackageInfo p1) throws android.webkit.WebViewFactory.MissingWebViewPackageException {}
    @android.annotation.UnsupportedAppUsage
    private static android.content.Context getWebViewContextAndSetProvider() throws android.webkit.WebViewFactory.MissingWebViewPackageException { return null; }
    @android.annotation.UnsupportedAppUsage
    private static java.lang.Class<android.webkit.WebViewFactoryProvider> getProviderClass() { return null; }
    public static void prepareWebViewInZygote() {}
    public static int onWebViewProviderChanged(android.content.pm.PackageInfo p0) { return 0; }
    @android.annotation.UnsupportedAppUsage
    public static android.webkit.IWebViewUpdateService getUpdateService() { return null; }
    static android.webkit.IWebViewUpdateService getUpdateServiceUnchecked() { return null; }

    static class MissingWebViewPackageException extends java.lang.Exception {
        public MissingWebViewPackageException(java.lang.String p0) { super(); }
        public MissingWebViewPackageException(java.lang.Exception p0) { super(); }
    }
}
