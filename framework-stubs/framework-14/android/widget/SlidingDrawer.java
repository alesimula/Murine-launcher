package android.widget;

@java.lang.Deprecated
public class SlidingDrawer extends android.view.ViewGroup {
    public static final int ORIENTATION_HORIZONTAL = 0;
    public static final int ORIENTATION_VERTICAL = 1;
    public SlidingDrawer(android.content.Context p0, android.util.AttributeSet p1) { super((android.content.Context)null); }
    public SlidingDrawer(android.content.Context p0, android.util.AttributeSet p1, int p2) { super((android.content.Context)null); }
    public SlidingDrawer(android.content.Context p0, android.util.AttributeSet p1, int p2, int p3) { super((android.content.Context)null); }
    protected void onFinishInflate() {}
    protected void onMeasure(int p0, int p1) {}
    protected void dispatchDraw(android.graphics.Canvas p0) {}
    protected void onLayout(boolean p0, int p1, int p2, int p3, int p4) {}
    public boolean onInterceptTouchEvent(android.view.MotionEvent p0) { return false; }
    public boolean onTouchEvent(android.view.MotionEvent p0) { return false; }
    public void toggle() {}
    public void animateToggle() {}
    public void open() {}
    public void close() {}
    public void animateClose() {}
    public void animateOpen() {}
    public java.lang.CharSequence getAccessibilityClassName() { return null; }
    public void setOnDrawerOpenListener(android.widget.SlidingDrawer.OnDrawerOpenListener p0) {}
    public void setOnDrawerCloseListener(android.widget.SlidingDrawer.OnDrawerCloseListener p0) {}
    public void setOnDrawerScrollListener(android.widget.SlidingDrawer.OnDrawerScrollListener p0) {}
    public android.view.View getHandle() { return null; }
    public android.view.View getContent() { return null; }
    public void unlock() {}
    public void lock() {}
    public boolean isOpened() { return false; }
    public boolean isMoving() { return false; }

    public static interface OnDrawerOpenListener {
        public void onDrawerOpened();
    }

    public static interface OnDrawerCloseListener {
        public void onDrawerClosed();
    }

    public static interface OnDrawerScrollListener {
        public void onScrollStarted();
        public void onScrollEnded();
    }

    private class DrawerToggler implements android.view.View.OnClickListener {
        public void onClick(android.view.View p0) {}
    }
}
