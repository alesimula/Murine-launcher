package android.window;

public abstract class WindowBase extends android.view.Window {
    public WindowBase(android.content.Context p0) { super(null); }
    public void takeSurface(android.view.SurfaceHolder.Callback2 p0) {}
    public void takeInputQueue(android.view.InputQueue.Callback p0) {}
    public boolean isFloating() { return false; }
    public void alwaysReadCloseOnTouchAttr() {}
    public void setContentView(int p0) {}
    public void setContentView(android.view.View p0) {}
    public void setContentView(android.view.View p0, android.view.ViewGroup.LayoutParams p1) {}
    public void addContentView(android.view.View p0, android.view.ViewGroup.LayoutParams p1) {}
    public void clearContentView() {}
    public android.view.View getCurrentFocus() { return null; }
    public void setTitle(java.lang.CharSequence p0) {}
    public void setTitleColor(int p0) {}
    public void openPanel(int p0, android.view.KeyEvent p1) {}
    public void closePanel(int p0) {}
    public void togglePanel(int p0, android.view.KeyEvent p1) {}
    public void invalidatePanelMenu(int p0) {}
    public boolean performPanelShortcut(int p0, int p1, android.view.KeyEvent p2, int p3) { return false; }
    public boolean performPanelIdentifierAction(int p0, int p1, int p2) { return false; }
    public void closeAllPanels() {}
    public boolean performContextMenuIdentifierAction(int p0, int p1) { return false; }
    public void onConfigurationChanged(android.content.res.Configuration p0) {}
    public void setBackgroundDrawable(android.graphics.drawable.Drawable p0) {}
    public void setFeatureDrawableResource(int p0, int p1) {}
    public void setFeatureDrawableUri(int p0, android.net.Uri p1) {}
    public void setFeatureDrawable(int p0, android.graphics.drawable.Drawable p1) {}
    public void setFeatureDrawableAlpha(int p0, int p1) {}
    public void setFeatureInt(int p0, int p1) {}
    public void takeKeyEvents(boolean p0) {}
    public boolean superDispatchKeyEvent(android.view.KeyEvent p0) { return false; }
    public boolean superDispatchKeyShortcutEvent(android.view.KeyEvent p0) { return false; }
    public boolean superDispatchTouchEvent(android.view.MotionEvent p0) { return false; }
    public boolean superDispatchTrackballEvent(android.view.MotionEvent p0) { return false; }
    public boolean superDispatchGenericMotionEvent(android.view.MotionEvent p0) { return false; }
    public android.view.View peekDecorView() { return null; }
    public android.os.Bundle saveHierarchyState() { return null; }
    public void restoreHierarchyState(android.os.Bundle p0) {}
    protected void onActive() {}
    public void setChildDrawable(int p0, android.graphics.drawable.Drawable p1) {}
    public void setChildInt(int p0, int p1) {}
    public boolean isShortcutKey(int p0, android.view.KeyEvent p1) { return false; }
    public void setVolumeControlStream(int p0) {}
    public int getVolumeControlStream() { return 0; }
    public int getStatusBarColor() { return 0; }
    public void setStatusBarColor(int p0) {}
    public int getNavigationBarColor() { return 0; }
    public void setNavigationBarColor(int p0) {}
    public void setDecorCaptionShade(int p0) {}
    public void setResizingCaptionDrawable(android.graphics.drawable.Drawable p0) {}
    public void onMultiWindowModeChanged() {}
    public void onPictureInPictureModeChanged(boolean p0) {}
}
