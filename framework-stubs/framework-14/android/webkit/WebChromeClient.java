package android.webkit;

public class WebChromeClient {
    public WebChromeClient() {}
    public void onProgressChanged(android.webkit.WebView p0, int p1) {}
    public void onReceivedTitle(android.webkit.WebView p0, java.lang.String p1) {}
    public void onReceivedIcon(android.webkit.WebView p0, android.graphics.Bitmap p1) {}
    public void onReceivedTouchIconUrl(android.webkit.WebView p0, java.lang.String p1, boolean p2) {}
    public void onShowCustomView(android.view.View p0, android.webkit.WebChromeClient.CustomViewCallback p1) {}
    @java.lang.Deprecated
    public void onShowCustomView(android.view.View p0, int p1, android.webkit.WebChromeClient.CustomViewCallback p2) {}
    public void onHideCustomView() {}
    public boolean onCreateWindow(android.webkit.WebView p0, boolean p1, boolean p2, android.os.Message p3) { return false; }
    public void onRequestFocus(android.webkit.WebView p0) {}
    public void onCloseWindow(android.webkit.WebView p0) {}
    public boolean onJsAlert(android.webkit.WebView p0, java.lang.String p1, java.lang.String p2, android.webkit.JsResult p3) { return false; }
    public boolean onJsConfirm(android.webkit.WebView p0, java.lang.String p1, java.lang.String p2, android.webkit.JsResult p3) { return false; }
    public boolean onJsPrompt(android.webkit.WebView p0, java.lang.String p1, java.lang.String p2, java.lang.String p3, android.webkit.JsPromptResult p4) { return false; }
    public boolean onJsBeforeUnload(android.webkit.WebView p0, java.lang.String p1, java.lang.String p2, android.webkit.JsResult p3) { return false; }
    @java.lang.Deprecated
    public void onExceededDatabaseQuota(java.lang.String p0, java.lang.String p1, long p2, long p3, long p4, android.webkit.WebStorage.QuotaUpdater p5) {}
    @java.lang.Deprecated
    public void onReachedMaxAppCacheSize(long p0, long p1, android.webkit.WebStorage.QuotaUpdater p2) {}
    public void onGeolocationPermissionsShowPrompt(java.lang.String p0, android.webkit.GeolocationPermissions.Callback p1) {}
    public void onGeolocationPermissionsHidePrompt() {}
    public void onPermissionRequest(android.webkit.PermissionRequest p0) {}
    public void onPermissionRequestCanceled(android.webkit.PermissionRequest p0) {}
    @java.lang.Deprecated
    public boolean onJsTimeout() { return false; }
    @java.lang.Deprecated
    public void onConsoleMessage(java.lang.String p0, int p1, java.lang.String p2) {}
    public boolean onConsoleMessage(android.webkit.ConsoleMessage p0) { return false; }
    public android.graphics.Bitmap getDefaultVideoPoster() { return null; }
    public android.view.View getVideoLoadingProgressView() { return null; }
    public void getVisitedHistory(android.webkit.ValueCallback<java.lang.String[]> p0) {}
    public boolean onShowFileChooser(android.webkit.WebView p0, android.webkit.ValueCallback<android.net.Uri[]> p1, android.webkit.WebChromeClient.FileChooserParams p2) { return false; }
    @android.annotation.SystemApi
    @java.lang.Deprecated
    public void openFileChooser(android.webkit.ValueCallback<android.net.Uri> p0, java.lang.String p1, java.lang.String p2) {}

    public static abstract class FileChooserParams {
        public static final int MODE_OPEN = 0;
        public static final int MODE_OPEN_MULTIPLE = 1;
        public static final int MODE_OPEN_FOLDER = 2;
        public static final int MODE_SAVE = 3;
        public FileChooserParams() {}
        public static android.net.Uri[] parseResult(int p0, android.content.Intent p1) { return null; }
        public abstract int getMode();
        public abstract java.lang.String[] getAcceptTypes();
        public abstract boolean isCaptureEnabled();
        public abstract java.lang.CharSequence getTitle();
        public abstract java.lang.String getFilenameHint();
        public abstract android.content.Intent createIntent();
    }

    public static interface CustomViewCallback {
        public void onCustomViewHidden();
    }
}
