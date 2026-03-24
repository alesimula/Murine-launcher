package android.widget;

@java.lang.Deprecated
public class ZoomButton extends android.widget.ImageButton implements android.view.View.OnLongClickListener {
    private final java.lang.Runnable mRunnable = null;
    private long mZoomSpeed;
    private boolean mIsInLongpress;
    public ZoomButton(android.content.Context p0) { super((android.content.Context)null); }
    public ZoomButton(android.content.Context p0, android.util.AttributeSet p1) { super((android.content.Context)null); }
    public ZoomButton(android.content.Context p0, android.util.AttributeSet p1, int p2) { super((android.content.Context)null); }
    public ZoomButton(android.content.Context p0, android.util.AttributeSet p1, int p2, int p3) { super((android.content.Context)null); }
    public boolean onTouchEvent(android.view.MotionEvent p0) { return false; }
    public void setZoomSpeed(long p0) {}
    public boolean onLongClick(android.view.View p0) { return false; }
    public boolean onKeyUp(int p0, android.view.KeyEvent p1) { return false; }
    public void setEnabled(boolean p0) {}
    public boolean dispatchUnhandledMove(android.view.View p0, int p1) { return false; }
    public java.lang.CharSequence getAccessibilityClassName() { return null; }
}
