package android.widget;

@java.lang.Deprecated
public class ZoomButtonsController implements android.view.View.OnTouchListener {
    public ZoomButtonsController(android.view.View p0) {}
    public void setZoomInEnabled(boolean p0) {}
    public void setZoomOutEnabled(boolean p0) {}
    public void setZoomSpeed(long p0) {}
    public void setOnZoomListener(android.widget.ZoomButtonsController.OnZoomListener p0) {}
    public void setFocusable(boolean p0) {}
    public boolean isAutoDismissed() { return false; }
    public void setAutoDismissed(boolean p0) {}
    public boolean isVisible() { return false; }
    public void setVisible(boolean p0) {}
    public android.view.ViewGroup getContainer() { return null; }
    public android.view.View getZoomControls() { return null; }
    public boolean onTouch(android.view.View p0, android.view.MotionEvent p1) { return false; }

    public static interface OnZoomListener {
        public void onVisibilityChanged(boolean p0);
        public void onZoom(boolean p0);
    }

    private class Container extends android.widget.FrameLayout {
        public Container(android.widget.ZoomButtonsController p0, android.content.Context p1) { super((android.content.Context)null); }
        public boolean dispatchKeyEvent(android.view.KeyEvent p0) { return false; }
    }
}
