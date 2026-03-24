package android.view;

public class WindowCallbackWrapper implements android.view.Window.Callback {
    public WindowCallbackWrapper(android.view.Window.Callback p0) {}
    public boolean dispatchKeyEvent(android.view.KeyEvent p0) { return false; }
    public boolean dispatchKeyShortcutEvent(android.view.KeyEvent p0) { return false; }
    public boolean dispatchTouchEvent(android.view.MotionEvent p0) { return false; }
    public boolean dispatchTrackballEvent(android.view.MotionEvent p0) { return false; }
    public boolean dispatchGenericMotionEvent(android.view.MotionEvent p0) { return false; }
    public boolean dispatchPopulateAccessibilityEvent(android.view.accessibility.AccessibilityEvent p0) { return false; }
    public android.view.View onCreatePanelView(int p0) { return null; }
    public boolean onCreatePanelMenu(int p0, android.view.Menu p1) { return false; }
    public boolean onPreparePanel(int p0, android.view.View p1, android.view.Menu p2) { return false; }
    public boolean onMenuOpened(int p0, android.view.Menu p1) { return false; }
    public boolean onMenuItemSelected(int p0, android.view.MenuItem p1) { return false; }
    public void onWindowAttributesChanged(android.view.WindowManager.LayoutParams p0) {}
    public void onContentChanged() {}
    public void onWindowFocusChanged(boolean p0) {}
    public void onAttachedToWindow() {}
    public void onDetachedFromWindow() {}
    public void onPanelClosed(int p0, android.view.Menu p1) {}
    public boolean onSearchRequested(android.view.SearchEvent p0) { return false; }
    public boolean onSearchRequested() { return false; }
    public android.view.ActionMode onWindowStartingActionMode(android.view.ActionMode.Callback p0) { return null; }
    public android.view.ActionMode onWindowStartingActionMode(android.view.ActionMode.Callback p0, int p1) { return null; }
    public void onActionModeStarted(android.view.ActionMode p0) {}
    public void onActionModeFinished(android.view.ActionMode p0) {}
    public void onProvideKeyboardShortcuts(java.util.List<android.view.KeyboardShortcutGroup> p0, android.view.Menu p1, int p2) {}
    public void onPointerCaptureChanged(boolean p0) {}
}
