package android.view;

public final class ImeFocusController {
    private static final boolean DEBUG = false;
    private static final java.lang.String TAG = "ImeFocusController";
    private final android.view.ViewRootImpl mViewRootImpl = null;
    private boolean mHasImeFocus;
    private android.view.View mServedView;
    private android.view.View mNextServedView;
    private android.view.ImeFocusController.InputMethodManagerDelegate mDelegate;
    ImeFocusController(android.view.ViewRootImpl p0) {}
    private android.view.ImeFocusController.InputMethodManagerDelegate getImmDelegate() { return null; }
    void onMovedToDisplay() {}
    void onTraversal(boolean p0, android.view.WindowManager.LayoutParams p1) {}
    void onPreWindowFocus(boolean p0, android.view.WindowManager.LayoutParams p1) {}
    boolean updateImeFocusable(android.view.WindowManager.LayoutParams p0, boolean p1) { return false; }
    void onPostWindowFocus(android.view.View p0, boolean p1, android.view.WindowManager.LayoutParams p2) {}
    public boolean checkFocus(boolean p0, boolean p1) { return false; }
    void onViewFocusChanged(android.view.View p0, boolean p1) {}
    void onViewDetachedFromWindow(android.view.View p0) {}
    void onWindowDismissed() {}
    private static boolean isInLocalFocusMode(android.view.WindowManager.LayoutParams p0) { return false; }
    int onProcessImeInputStage(java.lang.Object p0, android.view.InputEvent p1, android.view.WindowManager.LayoutParams p2, android.view.inputmethod.InputMethodManager.FinishedInputEventCallback p3) { return 0; }
    public android.view.View getServedView() { return null; }
    public android.view.View getNextServedView() { return null; }
    public void setServedView(android.view.View p0) {}
    public void setNextServedView(android.view.View p0) {}
    boolean hasImeFocus() { return false; }

    public static interface InputMethodManagerDelegate {
        public boolean startInput(int p0, android.view.View p1, int p2, int p3, int p4);
        public void startInputAsyncOnWindowFocusGain(android.view.View p0, int p1, int p2, boolean p3);
        public void finishInput();
        public void closeCurrentIme();
        public void finishComposingText();
        public void setCurrentRootView(android.view.ViewRootImpl p0);
        public boolean isCurrentRootView(android.view.ViewRootImpl p0);
        public boolean isRestartOnNextWindowFocus(boolean p0);
        public boolean hasActiveConnection(android.view.View p0);
    }
}
