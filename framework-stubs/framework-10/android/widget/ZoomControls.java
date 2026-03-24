package android.widget;

@java.lang.Deprecated
public class ZoomControls extends android.widget.LinearLayout {
    @android.annotation.UnsupportedAppUsage
    private final android.widget.ZoomButton mZoomIn = null;
    @android.annotation.UnsupportedAppUsage
    private final android.widget.ZoomButton mZoomOut = null;
    public ZoomControls(android.content.Context p0) { super((android.content.Context)null); }
    public ZoomControls(android.content.Context p0, android.util.AttributeSet p1) { super((android.content.Context)null); }
    public void setOnZoomInClickListener(android.view.View.OnClickListener p0) {}
    public void setOnZoomOutClickListener(android.view.View.OnClickListener p0) {}
    public void setZoomSpeed(long p0) {}
    public boolean onTouchEvent(android.view.MotionEvent p0) { return false; }
    public void show() {}
    public void hide() {}
    private void fade(int p0, float p1, float p2) {}
    public void setIsZoomInEnabled(boolean p0) {}
    public void setIsZoomOutEnabled(boolean p0) {}
    public boolean hasFocus() { return false; }
    public java.lang.CharSequence getAccessibilityClassName() { return null; }
}
