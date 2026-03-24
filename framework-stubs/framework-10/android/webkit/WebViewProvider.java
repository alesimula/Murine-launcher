package android.webkit;

@android.annotation.SystemApi
public interface WebViewProvider {
    public void init(java.util.Map<java.lang.String, java.lang.Object> p0, boolean p1);
    public void setHorizontalScrollbarOverlay(boolean p0);
    public void setVerticalScrollbarOverlay(boolean p0);
    public boolean overlayHorizontalScrollbar();
    public boolean overlayVerticalScrollbar();
    public int getVisibleTitleHeight();
    public android.net.http.SslCertificate getCertificate();
    public void setCertificate(android.net.http.SslCertificate p0);
    public void savePassword(java.lang.String p0, java.lang.String p1, java.lang.String p2);
    public void setHttpAuthUsernamePassword(java.lang.String p0, java.lang.String p1, java.lang.String p2, java.lang.String p3);
    public java.lang.String[] getHttpAuthUsernamePassword(java.lang.String p0, java.lang.String p1);
    public void destroy();
    public void setNetworkAvailable(boolean p0);
    public android.webkit.WebBackForwardList saveState(android.os.Bundle p0);
    public boolean savePicture(android.os.Bundle p0, java.io.File p1);
    public boolean restorePicture(android.os.Bundle p0, java.io.File p1);
    public android.webkit.WebBackForwardList restoreState(android.os.Bundle p0);
    public void loadUrl(java.lang.String p0, java.util.Map<java.lang.String, java.lang.String> p1);
    public void loadUrl(java.lang.String p0);
    public void postUrl(java.lang.String p0, byte[] p1);
    public void loadData(java.lang.String p0, java.lang.String p1, java.lang.String p2);
    public void loadDataWithBaseURL(java.lang.String p0, java.lang.String p1, java.lang.String p2, java.lang.String p3, java.lang.String p4);
    public void evaluateJavaScript(java.lang.String p0, android.webkit.ValueCallback<java.lang.String> p1);
    public void saveWebArchive(java.lang.String p0);
    public void saveWebArchive(java.lang.String p0, boolean p1, android.webkit.ValueCallback<java.lang.String> p2);
    public void stopLoading();
    public void reload();
    public boolean canGoBack();
    public void goBack();
    public boolean canGoForward();
    public void goForward();
    public boolean canGoBackOrForward(int p0);
    public void goBackOrForward(int p0);
    public boolean isPrivateBrowsingEnabled();
    public boolean pageUp(boolean p0);
    public boolean pageDown(boolean p0);
    public void insertVisualStateCallback(long p0, android.webkit.WebView.VisualStateCallback p1);
    public void clearView();
    public android.graphics.Picture capturePicture();
    public android.print.PrintDocumentAdapter createPrintDocumentAdapter(java.lang.String p0);
    public float getScale();
    public void setInitialScale(int p0);
    public void invokeZoomPicker();
    public android.webkit.WebView.HitTestResult getHitTestResult();
    public void requestFocusNodeHref(android.os.Message p0);
    public void requestImageRef(android.os.Message p0);
    public java.lang.String getUrl();
    public java.lang.String getOriginalUrl();
    public java.lang.String getTitle();
    public android.graphics.Bitmap getFavicon();
    public java.lang.String getTouchIconUrl();
    public int getProgress();
    public int getContentHeight();
    public int getContentWidth();
    public void pauseTimers();
    public void resumeTimers();
    public void onPause();
    public void onResume();
    public boolean isPaused();
    public void freeMemory();
    public void clearCache(boolean p0);
    public void clearFormData();
    public void clearHistory();
    public void clearSslPreferences();
    public android.webkit.WebBackForwardList copyBackForwardList();
    public void setFindListener(android.webkit.WebView.FindListener p0);
    public void findNext(boolean p0);
    public int findAll(java.lang.String p0);
    public void findAllAsync(java.lang.String p0);
    public boolean showFindDialog(java.lang.String p0, boolean p1);
    public void clearMatches();
    public void documentHasImages(android.os.Message p0);
    public void setWebViewClient(android.webkit.WebViewClient p0);
    public android.webkit.WebViewClient getWebViewClient();
    public android.webkit.WebViewRenderProcess getWebViewRenderProcess();
    public void setWebViewRenderProcessClient(java.util.concurrent.Executor p0, android.webkit.WebViewRenderProcessClient p1);
    public android.webkit.WebViewRenderProcessClient getWebViewRenderProcessClient();
    public void setDownloadListener(android.webkit.DownloadListener p0);
    public void setWebChromeClient(android.webkit.WebChromeClient p0);
    public android.webkit.WebChromeClient getWebChromeClient();
    public void setPictureListener(android.webkit.WebView.PictureListener p0);
    public void addJavascriptInterface(java.lang.Object p0, java.lang.String p1);
    public void removeJavascriptInterface(java.lang.String p0);
    public android.webkit.WebMessagePort[] createWebMessageChannel();
    public void postMessageToMainFrame(android.webkit.WebMessage p0, android.net.Uri p1);
    public android.webkit.WebSettings getSettings();
    public void setMapTrackballToArrowKeys(boolean p0);
    public void flingScroll(int p0, int p1);
    public android.view.View getZoomControls();
    public boolean canZoomIn();
    public boolean canZoomOut();
    public boolean zoomBy(float p0);
    public boolean zoomIn();
    public boolean zoomOut();
    public void dumpViewHierarchyWithProperties(java.io.BufferedWriter p0, int p1);
    public android.view.View findHierarchyView(java.lang.String p0, int p1);
    public void setRendererPriorityPolicy(int p0, boolean p1);
    public int getRendererRequestedPriority();
    public boolean getRendererPriorityWaivedWhenNotVisible();
    default public void setTextClassifier(android.view.textclassifier.TextClassifier p0) {}
    default public android.view.textclassifier.TextClassifier getTextClassifier() { return null; }
    public android.webkit.WebViewProvider.ViewDelegate getViewDelegate();
    public android.webkit.WebViewProvider.ScrollDelegate getScrollDelegate();
    public void notifyFindDialogDismissed();

    public static interface ViewDelegate {
        public boolean shouldDelayChildPressedState();
        public void onProvideVirtualStructure(android.view.ViewStructure p0);
        default public void onProvideAutofillVirtualStructure(android.view.ViewStructure p0, int p1) {}
        default public void autofill(android.util.SparseArray<android.view.autofill.AutofillValue> p0) {}
        default public boolean isVisibleToUserForAutofill(int p0) { return false; }
        default public void onProvideContentCaptureStructure(android.view.ViewStructure p0, int p1) {}
        public android.view.accessibility.AccessibilityNodeProvider getAccessibilityNodeProvider();
        public void onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo p0);
        public void onInitializeAccessibilityEvent(android.view.accessibility.AccessibilityEvent p0);
        public boolean performAccessibilityAction(int p0, android.os.Bundle p1);
        public void setOverScrollMode(int p0);
        public void setScrollBarStyle(int p0);
        public void onDrawVerticalScrollBar(android.graphics.Canvas p0, android.graphics.drawable.Drawable p1, int p2, int p3, int p4, int p5);
        public void onOverScrolled(int p0, int p1, boolean p2, boolean p3);
        public void onWindowVisibilityChanged(int p0);
        public void onDraw(android.graphics.Canvas p0);
        public void setLayoutParams(android.view.ViewGroup.LayoutParams p0);
        public boolean performLongClick();
        public void onConfigurationChanged(android.content.res.Configuration p0);
        public android.view.inputmethod.InputConnection onCreateInputConnection(android.view.inputmethod.EditorInfo p0);
        public boolean onDragEvent(android.view.DragEvent p0);
        public boolean onKeyMultiple(int p0, int p1, android.view.KeyEvent p2);
        public boolean onKeyDown(int p0, android.view.KeyEvent p1);
        public boolean onKeyUp(int p0, android.view.KeyEvent p1);
        public void onAttachedToWindow();
        public void onDetachedFromWindow();
        default public void onMovedToDisplay(int p0, android.content.res.Configuration p1) {}
        public void onVisibilityChanged(android.view.View p0, int p1);
        public void onWindowFocusChanged(boolean p0);
        public void onFocusChanged(boolean p0, int p1, android.graphics.Rect p2);
        public boolean setFrame(int p0, int p1, int p2, int p3);
        public void onSizeChanged(int p0, int p1, int p2, int p3);
        public void onScrollChanged(int p0, int p1, int p2, int p3);
        public boolean dispatchKeyEvent(android.view.KeyEvent p0);
        public boolean onTouchEvent(android.view.MotionEvent p0);
        public boolean onHoverEvent(android.view.MotionEvent p0);
        public boolean onGenericMotionEvent(android.view.MotionEvent p0);
        public boolean onTrackballEvent(android.view.MotionEvent p0);
        public boolean requestFocus(int p0, android.graphics.Rect p1);
        public void onMeasure(int p0, int p1);
        public boolean requestChildRectangleOnScreen(android.view.View p0, android.graphics.Rect p1, boolean p2);
        public void setBackgroundColor(int p0);
        public void setLayerType(int p0, android.graphics.Paint p1);
        public void preDispatchDraw(android.graphics.Canvas p0);
        public void onStartTemporaryDetach();
        public void onFinishTemporaryDetach();
        public void onActivityResult(int p0, int p1, android.content.Intent p2);
        public android.os.Handler getHandler(android.os.Handler p0);
        public android.view.View findFocus(android.view.View p0);
        default public boolean onCheckIsTextEditor() { return false; }
    }

    public static interface ScrollDelegate {
        public int computeHorizontalScrollRange();
        public int computeHorizontalScrollOffset();
        public int computeVerticalScrollRange();
        public int computeVerticalScrollOffset();
        public int computeVerticalScrollExtent();
        public void computeScroll();
    }
}
