package android.webkit;

@android.annotation.SystemApi
public final class WebViewDelegate {
    WebViewDelegate() {}
    public void setOnTraceEnabledChangeListener(android.webkit.WebViewDelegate.OnTraceEnabledChangeListener p0) {}
    public boolean isTraceTagEnabled() { return false; }
    @java.lang.Deprecated
    public boolean canInvokeDrawGlFunctor(android.view.View p0) { return false; }
    @java.lang.Deprecated
    public void invokeDrawGlFunctor(android.view.View p0, long p1, boolean p2) {}
    @java.lang.Deprecated
    public void callDrawGlFunction(android.graphics.Canvas p0, long p1) {}
    @java.lang.Deprecated
    public void callDrawGlFunction(android.graphics.Canvas p0, long p1, java.lang.Runnable p2) {}
    public void drawWebViewFunctor(android.graphics.Canvas p0, int p1) {}
    @java.lang.Deprecated
    public void detachDrawGlFunctor(android.view.View p0, long p1) {}
    public int getPackageId(android.content.res.Resources p0, java.lang.String p1) { return 0; }
    public android.app.Application getApplication() { return null; }
    public java.lang.String getErrorString(android.content.Context p0, int p1) { return null; }
    public void addWebViewAssetPath(android.content.Context p0) {}
    public boolean isMultiProcessEnabled() { return false; }
    public java.lang.String getDataDirectorySuffix() { return null; }
    public android.webkit.WebViewFactory.StartupTimestamps getStartupTimestamps() { return null; }

    public static interface OnTraceEnabledChangeListener {
        public void onTraceEnabledChange(boolean p0);
    }
}
