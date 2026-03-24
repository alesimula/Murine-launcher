package android.view;

public final class ImeFocusController {
    ImeFocusController(android.view.ViewRootImpl p0) {}
    void onMovedToDisplay() {}
    void onTraversal(boolean p0, android.view.WindowManager.LayoutParams p1) {}
    void onPreWindowFocus(boolean p0, android.view.WindowManager.LayoutParams p1) {}
    boolean updateImeFocusable(android.view.WindowManager.LayoutParams p0, boolean p1) { return false; }
    void onPostWindowFocus(android.view.View p0, boolean p1, android.view.WindowManager.LayoutParams p2) {}
    public boolean checkFocus(boolean p0, boolean p1) { return false; }
    void onViewFocusChanged(android.view.View p0, boolean p1) {}
    void onViewDetachedFromWindow(android.view.View p0) {}
    void onWindowDismissed() {}
    public void onInteractiveChanged(boolean p0) {}
    int onProcessImeInputStage(java.lang.Object p0, android.view.InputEvent p1, android.view.WindowManager.LayoutParams p2, android.view.inputmethod.InputMethodManager.FinishedInputEventCallback p3) { return 0; }
    public android.view.View getServedView() { return null; }
    public android.view.View getNextServedView() { return null; }
    public void setServedView(android.view.View p0) {}
    public void setNextServedView(android.view.View p0) {}
    boolean hasImeFocus() { return false; }
    void dumpDebug(android.util.proto.ProtoOutputStream p0, long p1) {}

    public static interface InputMethodManagerDelegate {
        public boolean startInput(int p0, android.view.View p1, int p2, int p3, int p4);
        public void startInputAsyncOnWindowFocusGain(android.view.View p0, int p1, int p2, boolean p3);
        public void finishInput();
        public void finishInputAndReportToIme();
        public void closeCurrentIme();
        public void finishComposingText();
        public void setCurrentRootView(android.view.ViewRootImpl p0);
        public boolean isCurrentRootView(android.view.ViewRootImpl p0);
        public boolean isRestartOnNextWindowFocus(boolean p0);
        public boolean hasActiveConnection(android.view.View p0);
    }
}
