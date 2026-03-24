package android.view;

public final class ImeFocusController {
    ImeFocusController(android.view.ViewRootImpl p0) {}
    void onMovedToDisplay() {}
    void onTraversal(boolean p0, android.view.WindowManager.LayoutParams p1) {}
    void onPreWindowFocus(boolean p0, android.view.WindowManager.LayoutParams p1) {}
    void onPostWindowFocus(android.view.View p0, boolean p1, android.view.WindowManager.LayoutParams p2) {}
    void onScheduledCheckFocus() {}
    void onViewFocusChanged(android.view.View p0, boolean p1) {}
    void onViewDetachedFromWindow(android.view.View p0) {}
    void onWindowDismissed() {}
    int onProcessImeInputStage(java.lang.Object p0, android.view.InputEvent p1, android.view.WindowManager.LayoutParams p2, android.view.inputmethod.InputMethodManager.FinishedInputEventCallback p3) { return 0; }
    boolean hasImeFocus() { return false; }
    void dumpDebug(android.util.proto.ProtoOutputStream p0, long p1) {}

    public static interface InputMethodManagerDelegate {
        public void onPreWindowGainedFocus(android.view.ViewRootImpl p0);
        public void onPostWindowGainedFocus(android.view.View p0, android.view.WindowManager.LayoutParams p1);
        public void onWindowLostFocus(android.view.ViewRootImpl p0);
        public void onViewFocusChanged(android.view.View p0, boolean p1);
        public void onScheduledCheckFocus(android.view.ViewRootImpl p0);
        public void onViewDetachedFromWindow(android.view.View p0, android.view.ViewRootImpl p1);
        public void onWindowDismissed(android.view.ViewRootImpl p0);
    }
}
